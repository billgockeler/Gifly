
package com.gifly.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Looping  implements Parcelable {

    @SerializedName("mp4")
    @Expose
    private String mp4;
    @SerializedName("mp4_size")
    @Expose
    private String mp4Size;

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mp4);
        dest.writeString(this.mp4Size);
    }

    public Looping() {
    }

    protected Looping(Parcel in) {
        this.mp4 = in.readString();
        this.mp4Size = in.readString();
    }

    public static final Creator<Looping> CREATOR = new Creator<Looping>() {
        @Override
        public Looping createFromParcel(Parcel source) {
            return new Looping(source);
        }

        @Override
        public Looping[] newArray(int size) {
            return new Looping[size];
        }
    };
}
