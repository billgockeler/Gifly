package com.gifly.view;


import android.app.Dialog;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.gifly.network.GiphyService;
import com.gifly.R;
import com.gifly.model.ImageSet;
import com.gifly.model.Images;
import com.gifly.model.Trending;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class TrendingFragment extends Fragment implements TrendingView {

    private static final String IMAGE_ARRAY = "image_array";
    private static final String OFFSET = "offset";
    private static final int LOAD_THRESHOLD = 5;
    private static final int LIMIT = 50;

    @InjectView(R.id.listview)
    ListView listView;

    @InjectView(R.id.connection_text)
    TextView mConnectionText;

    private RefreshActionView mRefreshActionView;
    private ArrayList<ImageSet> mImageArray;
    private PhotoListAdapter mPhotoListAdapter;
    private TrendingPresenter mPresenter;

    private long mOffset;
    private boolean mLoading;


    public TrendingFragment() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        setHasOptionsMenu(true);

        if(savedInstanceState == null) {
            mImageArray = new ArrayList<ImageSet>();
            mPhotoListAdapter = new PhotoListAdapter(getActivity(), mImageArray);
        }
        else {
            mImageArray = savedInstanceState.getParcelableArrayList(IMAGE_ARRAY);
            mPhotoListAdapter = new PhotoListAdapter(getActivity(), mImageArray);
            mOffset = savedInstanceState.getLong(OFFSET);
        }

        GiphyService giphyService = GiphyService.RETROFIT.create(GiphyService.class);
        mPresenter = new TrendingPresenter(giphyService, this);
        mPresenter.getTrending(LIMIT, mOffset);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.inject(this, rootView);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView.setAdapter(mPhotoListAdapter);
        listView.setOnScrollListener(new AbsListView.OnScrollListener(){
            public void onScroll(AbsListView view, int first_visible_item, int visible_item_count, int total_item_count) {
                int last_visible_item = first_visible_item + visible_item_count + LOAD_THRESHOLD;

                if((last_visible_item  == total_item_count && !(mLoading))){
                    mPresenter.getTrending(LIMIT, mOffset);
                }
            }

            public void onScrollStateChanged(AbsListView view, int scrollState) {}
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(IMAGE_ARRAY, mImageArray);
        outState.putLong(OFFSET, mOffset);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main, menu);
        mRefreshActionView = (RefreshActionView)menu.findItem(R.id.action_refresh).getActionView();
        mRefreshActionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refresh();
            }
        });
    }

    @Override
    public void showLoading(){
        mLoading = true;
        if(mRefreshActionView != null)
            mRefreshActionView.start();
    }

    @Override
    public void hideLoading(){
        mLoading = false;
        if(mRefreshActionView != null)
            mRefreshActionView.stop();
    }

    @Override
    public void showError() {
        if(mConnectionText != null)
            mConnectionText.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideError() {
        if(mConnectionText != null)
            mConnectionText.setVisibility(View.INVISIBLE);
    }

    @Override
    public void trendingSuccess(Trending trending){
        mOffset = (long)(trending.getPagination().getOffset() + trending.getPagination().getCount());

        if(trending.getData() != null && trending.getData().size() > 0) {

            Images images = null;
            ImageSet imageSet = null;

            for(int i = 0; i < trending.getData().size(); i++) {
                images = trending.getData().get(i).getImages();

                int remainder = i % 3;

                switch(remainder) {
                    case 0:
                        imageSet = new ImageSet();
                        imageSet.largeImageUrl = images.getFixedWidth().getUrl();
                        break;
                    case 1:
                        imageSet.smallImageUrlOne = images.getFixedWidthSmallStill().getUrl();
                        break;
                    case 2:
                        imageSet.smallImageUrlTwo = images.getFixedWidthSmallStill().getUrl();
                        mImageArray.add(imageSet);
                        break;
                }
            }
            mPhotoListAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void trendingFailure(String message) {}


    private void refresh() {
        mPhotoListAdapter.clear();
        mOffset = 0;
        mPresenter.getTrending(LIMIT, mOffset);
    }

    private void showImage(String imageUrl) {
        final Dialog dialog = new Dialog(getActivity(), R.style.BorderlessDialog);
        dialog.setContentView(R.layout.dialog_image);
        dialog.show();

        ImageView imageView = (ImageView) dialog.findViewById(R.id.image_view);
        Picasso.with(getActivity()).load(imageUrl).into(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    class PhotoListAdapter extends ArrayAdapter {

        LayoutInflater inflater;

        class ViewHolder {
            @InjectView(R.id.large_image)
            ImageView large_image;

            @InjectView(R.id.small_one_image)
            ImageView small_one_image;

            @InjectView(R.id.small_two_image)
            ImageView small_two_image;

            public ViewHolder(View view) {
                ButterKnife.inject(this, view);
            }
        }


        public PhotoListAdapter(Context context, ArrayList<ImageSet> images) {
            super(context, R.layout.listrow, images);
            inflater = LayoutInflater.from(context);
        }

        @Override
        public View getView(final int position, View view, ViewGroup parent) {
            ViewHolder holder;

            final ImageSet imageSet = (ImageSet)getItem(position);

            if(view != null) {
                holder = (ViewHolder)view.getTag();
            }
            else {
                view = this.inflater.inflate(R.layout.listrow, null);
                holder = new ViewHolder(view);
                view.setTag(holder);
            }

            if(!TextUtils.isEmpty(imageSet.largeImageUrl)){
                Picasso.with(getContext()).load(imageSet.largeImageUrl).into(holder.large_image);
                holder.large_image.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        showImage(imageSet.largeImageUrl);
                    }
                });
            }
            if(!TextUtils.isEmpty(imageSet.smallImageUrlOne)){
                Picasso.with(getContext()).load(imageSet.smallImageUrlOne).into(holder.small_one_image);
                holder.small_one_image.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        showImage(imageSet.smallImageUrlOne);
                    }
                });

            }
            if(!TextUtils.isEmpty(imageSet.smallImageUrlTwo)){
                Picasso.with(getContext()).load(imageSet.smallImageUrlTwo).into(holder.small_two_image);
                holder.small_two_image.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        showImage(imageSet.smallImageUrlTwo);
                    }
                });
            }


            return view;
        }
    }
}
