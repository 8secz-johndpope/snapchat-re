package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.nio.ByteBuffer;

public class Icon {
    private Bitmap mBitmap;
    private String mId;

    Icon(String str, Bitmap bitmap) {
        this.mId = str;
        this.mBitmap = bitmap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Icon icon = (Icon) obj;
            return this.mBitmap.equals(icon.mBitmap) && this.mId.equals(icon.mId);
        }
    }

    public Bitmap getBitmap() {
        if (this.mBitmap.getConfig() != Config.ARGB_8888) {
            this.mBitmap = this.mBitmap.copy(Config.ARGB_8888, false);
        }
        return this.mBitmap;
    }

    public String getId() {
        return this.mId;
    }

    public float getScale() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            float density = (float) bitmap.getDensity();
            if (density == MapboxConstants.MINIMUM_ZOOM) {
                density = 160.0f;
            }
            return density / 160.0f;
        }
        throw new IllegalStateException("Required to set a Icon before calling getScale");
    }

    public int hashCode() {
        Bitmap bitmap = this.mBitmap;
        int hashCode = bitmap != null ? bitmap.hashCode() : 0;
        String str = this.mId;
        return str != null ? (hashCode * 31) + str.hashCode() : hashCode;
    }

    public byte[] toBytes() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * this.mBitmap.getHeight());
            this.mBitmap.copyPixelsToBuffer(allocate);
            return allocate.array();
        }
        throw new IllegalStateException("Required to set a Icon before calling toBytes");
    }
}
