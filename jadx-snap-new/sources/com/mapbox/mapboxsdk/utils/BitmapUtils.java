package com.mapbox.mapboxsdk.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class BitmapUtils {
    public static Bitmap createBitmapFromView(View view) {
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(524288);
        view.buildDrawingCache();
        if (view.getDrawingCache() == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        view.destroyDrawingCache();
        return createBitmap;
    }

    public static Bitmap mergeBitmap(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, null);
        canvas.drawBitmap(bitmap2, 10.0f, 10.0f, null);
        return createBitmap;
    }
}
