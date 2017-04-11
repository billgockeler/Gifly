
package com.gifly.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedHeightStill implements Parcelable {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("size")
    @Expose
    private String size;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.url);
        dest.writeString(this.width);
        dest.writeString(this.height);
        dest.writeString(this.size);
    }

    public FixedHeightStill() {
    }

    protected FixedHeightStill(Parcel in) {
        this.url = in.readString();
        this.width = in.readString();
        this.height = in.readString();
        this.size = in.readString();
    }

    public static final Creator<FixedHeightStill> CREATOR = new Creator<FixedHeightStill>() {
        @Override
        public FixedHeightStill createFromParcel(Parcel source) {
            return new FixedHeightStill(source);
        }

        @Override
        public FixedHeightStill[] newArray(int size) {
            return new FixedHeightStill[size];
        }
    };
}
