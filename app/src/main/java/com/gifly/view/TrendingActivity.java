package com.gifly.view;

import android.app.Activity;
import android.os.Bundle;

import com.gifly.R;


public class TrendingActivity extends Activity {

    private static final String TRENDING_TAG = "trending_tag";
    private TrendingFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFragment = (TrendingFragment)getFragmentManager().findFragmentByTag(TRENDING_TAG);

        if (mFragment == null) {
            mFragment = new TrendingFragment();
            getFragmentManager().beginTransaction()
                    .add(R.id.container, mFragment, TRENDING_TAG)
                    .commit();
        }
    }
}
