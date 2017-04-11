
package com.gifly.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Original implements Parcelable {

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
    @SerializedName("frames")
    @Expose
    private String frames;
    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;
    @SerializedName("webp")
    @Expose
    private String webp;
    @SerializedName("webp_size")
    @Expose
    private String webpSize;
    @SerializedName("hash")
    @Expose
    private String hash;

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

    public String getFrames() {
        return frames;
    }

    public void setFrames(String frames) {
        this.frames = frames;
    }

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

    public String getWebp() {
        return webp;
    }

    public void setWebp(String webp) {
        this.webp = webp;
    }

    public String getWebpSize() {
        return webpSize;
    }

    public void setWebpSize(String webpSize) {
        this.webpSize = webpSize;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
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
        dest.writeString(this.frames);
        dest.writeString(this.mp4);
        dest.writeString(this.mp4Size);
        dest.writeString(this.webp);
        dest.writeString(this.webpSize);
        dest.writeString(this.hash);
    }

    public Original() {
    }

    protected Original(Parcel in) {
        this.url = in.readString();
        this.width = in.readString();
        this.height = in.readString();
        this.size = in.readString();
        this.frames = in.readString();
        this.mp4 = in.readString();
        this.mp4Size = in.readString();
        this.webp = in.readString();
        this.webpSize = in.readString();
        this.hash = in.readString();
    }

    public static final Creator<Original> CREATOR = new Creator<Original>() {
        @Override
        public Original createFromParcel(Parcel source) {
            return new Original(source);
        }

        @Override
        public Original[] newArray(int size) {
            return new Original[size];
        }
    };
}
