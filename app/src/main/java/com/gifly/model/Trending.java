
package com.gifly.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Trending implements Parcelable {

    @SerializedName("data")
    @Expose
    private List<Data> data = null;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("meta")
    @Expose
    private Meta meta;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.data);
        dest.writeParcelable(this.pagination, flags);
        dest.writeParcelable(this.meta, flags);
    }

    public Trending() {
    }

    protected Trending(Parcel in) {
        this.data = new ArrayList<Data>();
        in.readList(this.data, Data.class.getClassLoader());
        this.pagination = in.readParcelable(Pagination.class.getClassLoader());
        this.meta = in.readParcelable(Meta.class.getClassLoader());
    }

    public static final Creator<Trending> CREATOR = new Creator<Trending>() {
        @Override
        public Trending createFromParcel(Parcel source) {
            return new Trending(source);
        }

        @Override
        public Trending[] newArray(int size) {
            return new Trending[size];
        }
    };
}
