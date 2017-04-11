
package com.gifly.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images implements Parcelable {

    @SerializedName("fixed_height")
    @Expose
    private FixedHeight fixedHeight;
    @SerializedName("fixed_height_still")
    @Expose
    private FixedHeightStill fixedHeightStill;
    @SerializedName("fixed_height_downsampled")
    @Expose
    private FixedHeightDownsampled fixedHeightDownsampled;
    @SerializedName("fixed_width")
    @Expose
    private FixedWidth fixedWidth;
    @SerializedName("fixed_width_still")
    @Expose
    private FixedWidthStill fixedWidthStill;
    @SerializedName("fixed_width_downsampled")
    @Expose
    private FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("fixed_height_small")
    @Expose
    private FixedHeightSmall fixedHeightSmall;
    @SerializedName("fixed_height_small_still")
    @Expose
    private FixedHeightSmallStill fixedHeightSmallStill;
    @SerializedName("fixed_width_small")
    @Expose
    private FixedWidthSmall fixedWidthSmall;
    @SerializedName("fixed_width_small_still")
    @Expose
    private FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("downsized")
    @Expose
    private Downsized downsized;
    @SerializedName("downsized_still")
    @Expose
    private DownsizedStill downsizedStill;
    @SerializedName("downsized_large")
    @Expose
    private DownsizedLarge downsizedLarge;
    @SerializedName("downsized_medium")
    @Expose
    private DownsizedMedium downsizedMedium;
    @SerializedName("original")
    @Expose
    private Original original;
    @SerializedName("original_still")
    @Expose
    private OriginalStill originalStill;
    @SerializedName("looping")
    @Expose
    private Looping looping;
    @SerializedName("original_mp4")
    @Expose
    private OriginalMp4 originalMp4;
    @SerializedName("preview")
    @Expose
    private Preview preview;
    @SerializedName("downsized_small")
    @Expose
    private DownsizedSmall downsizedSmall;
    @SerializedName("preview_gif")
    @Expose
    private PreviewGif previewGif;
    @SerializedName("preview_webp")
    @Expose
    private PreviewWebp previewWebp;

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public Looping getLooping() {
        return looping;
    }

    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    public OriginalMp4 getOriginalMp4() {
        return originalMp4;
    }

    public void setOriginalMp4(OriginalMp4 originalMp4) {
        this.originalMp4 = originalMp4;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public PreviewGif getPreviewGif() {
        return previewGif;
    }

    public void setPreviewGif(PreviewGif previewGif) {
        this.previewGif = previewGif;
    }

    public PreviewWebp getPreviewWebp() {
        return previewWebp;
    }

    public void setPreviewWebp(PreviewWebp previewWebp) {
        this.previewWebp = previewWebp;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.fixedHeight, flags);
        dest.writeParcelable(this.fixedHeightStill, flags);
        dest.writeParcelable(this.fixedHeightDownsampled, flags);
        dest.writeParcelable(this.fixedWidth, flags);
        dest.writeParcelable(this.fixedWidthStill, flags);
        dest.writeParcelable(this.fixedWidthDownsampled, flags);
        dest.writeParcelable(this.fixedHeightSmall, flags);
        dest.writeParcelable(this.fixedHeightSmallStill, flags);
        dest.writeParcelable(this.fixedWidthSmall, flags);
        dest.writeParcelable(this.fixedWidthSmallStill, flags);
        dest.writeParcelable(this.downsized, flags);
        dest.writeParcelable(this.downsizedStill, flags);
        dest.writeParcelable(this.downsizedLarge, flags);
        dest.writeParcelable(this.downsizedMedium, flags);
        dest.writeParcelable(this.original, flags);
        dest.writeParcelable(this.originalStill, flags);
        dest.writeParcelable(this.looping, flags);
        dest.writeParcelable(this.originalMp4, flags);
        dest.writeParcelable(this.preview, flags);
        dest.writeParcelable(this.downsizedSmall, flags);
        dest.writeParcelable(this.previewGif, flags);
        dest.writeParcelable(this.previewWebp, flags);
    }

    public Images() {
    }

    protected Images(Parcel in) {
        this.fixedHeight = in.readParcelable(FixedHeight.class.getClassLoader());
        this.fixedHeightStill = in.readParcelable(FixedHeightStill.class.getClassLoader());
        this.fixedHeightDownsampled = in.readParcelable(FixedHeightDownsampled.class.getClassLoader());
        this.fixedWidth = in.readParcelable(FixedWidth.class.getClassLoader());
        this.fixedWidthStill = in.readParcelable(FixedWidthStill.class.getClassLoader());
        this.fixedWidthDownsampled = in.readParcelable(FixedWidthDownsampled.class.getClassLoader());
        this.fixedHeightSmall = in.readParcelable(FixedHeightSmall.class.getClassLoader());
        this.fixedHeightSmallStill = in.readParcelable(FixedHeightSmallStill.class.getClassLoader());
        this.fixedWidthSmall = in.readParcelable(FixedWidthSmall.class.getClassLoader());
        this.fixedWidthSmallStill = in.readParcelable(FixedWidthSmallStill.class.getClassLoader());
        this.downsized = in.readParcelable(Downsized.class.getClassLoader());
        this.downsizedStill = in.readParcelable(DownsizedStill.class.getClassLoader());
        this.downsizedLarge = in.readParcelable(DownsizedLarge.class.getClassLoader());
        this.downsizedMedium = in.readParcelable(DownsizedMedium.class.getClassLoader());
        this.original = in.readParcelable(Original.class.getClassLoader());
        this.originalStill = in.readParcelable(OriginalStill.class.getClassLoader());
        this.looping = in.readParcelable(Looping.class.getClassLoader());
        this.originalMp4 = in.readParcelable(OriginalMp4.class.getClassLoader());
        this.preview = in.readParcelable(Preview.class.getClassLoader());
        this.downsizedSmall = in.readParcelable(DownsizedSmall.class.getClassLoader());
        this.previewGif = in.readParcelable(PreviewGif.class.getClassLoader());
        this.previewWebp = in.readParcelable(PreviewWebp.class.getClassLoader());
    }

    public static final Creator<Images> CREATOR = new Creator<Images>() {
        @Override
        public Images createFromParcel(Parcel source) {
            return new Images(source);
        }

        @Override
        public Images[] newArray(int size) {
            return new Images[size];
        }
    };
}
