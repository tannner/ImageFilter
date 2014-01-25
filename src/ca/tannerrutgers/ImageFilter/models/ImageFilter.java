package ca.tannerrutgers.ImageFilter.models;

import android.graphics.Bitmap;

/**
 * Created by Tanner on 1/18/14.
 */
public abstract class ImageFilter {

    public static final int SIZE_MIN = 3;
    public static final int SIZE_MAX = 999;
    public static final int SIZE_DEFAULT = 3;

    protected Bitmap bitmap;
    protected int filterSize;

    public boolean cancelFiltering;

    public ImageFilter(Bitmap bitmap) {
        this(bitmap, SIZE_DEFAULT);
    }

    public ImageFilter(Bitmap bitmap, int filterSize) {
        this.bitmap = bitmap;
        this.filterSize = filterSize;
        this.cancelFiltering = false;
    }

    public abstract Bitmap applyFilter();
}
