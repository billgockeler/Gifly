
package com.gifly.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OriginalMp4 implements Parcelable {

    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;

    public String getMp4() {
        return mp4;
    }

    public void setMp4(String mp4) {
        this.mp4 = mp4;
    }

    public String getMp4Size() {
        return mp4Size;
    }

    public void setMp4Size(String mp4Size) {
        this.mp4Size = mp4Size;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mp4);
        dest.writeString(this.mp4Size);
        dest.writeString(this.width);
        dest.writeString(this.height);
    }

    public OriginalMp4() {
    }

    protected OriginalMp4(Parcel in) {
        this.mp4 = in.readString();
        this.mp4Size = in.readString();
        this.width = in.readString();
        this.height = in.readString();
    }

    public static final Creator<OriginalMp4> CREATOR = new Creator<OriginalMp4>() {
        @Override
        public OriginalMp4 createFromParcel(Parcel source) {
            return new OriginalMp4(source);
        }

        @Override
        public OriginalMp4[] newArray(int size) {
            return new OriginalMp4[size];
        }
    };
}
