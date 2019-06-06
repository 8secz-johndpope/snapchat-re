package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.exceptions.TooManyIconsException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class IconFactory {
    private static final String ICON_ID_PREFIX = "com.mapbox.icons.icon_";
    public static final Bitmap ICON_MARKERVIEW_BITMAP = Bitmap.createBitmap(1, 1, Config.ALPHA_8);
    public static final String ICON_MARKERVIEW_ID = "com.mapbox.icons.icon_marker_view";
    private static IconFactory instance;
    private Context context;
    private Icon defaultMarker;
    private Icon defaultMarkerView;
    private int nextId = 0;
    private Options options;

    private IconFactory(Context context) {
        DisplayMetrics displayMetrics;
        this.context = context;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (VERSION.SDK_INT >= 17) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            displayMetrics = null;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics2);
        this.options = new Options();
        Options options = this.options;
        options.inScaled = true;
        options.inDensity = 160;
        options.inTargetDensity = displayMetrics2.densityDpi;
        if (displayMetrics != null) {
            this.options.inScreenDensity = displayMetrics.densityDpi;
        }
    }

    private Icon fromInputStream(InputStream inputStream) {
        return fromBitmap(BitmapFactory.decodeStream(inputStream, null, this.options));
    }

    public static synchronized IconFactory getInstance(Context context) {
        IconFactory iconFactory;
        synchronized (IconFactory.class) {
            if (instance == null) {
                instance = new IconFactory(context.getApplicationContext());
            }
            iconFactory = instance;
        }
        return iconFactory;
    }

    public static Icon recreate(String str, Bitmap bitmap) {
        return new Icon(str, bitmap);
    }

    public final Icon defaultMarker() {
        if (this.defaultMarker == null) {
            this.defaultMarker = fromResource(R.drawable.mapbox_marker_icon_default);
        }
        return this.defaultMarker;
    }

    public final Icon defaultMarkerView() {
        if (this.defaultMarkerView == null) {
            this.defaultMarkerView = fromResource(R.drawable.mapbox_markerview_icon_default);
        }
        return this.defaultMarkerView;
    }

    public final Icon fromAsset(String str) {
        try {
            return fromInputStream(this.context.getAssets().open(str));
        } catch (IOException unused) {
            return null;
        }
    }

    public final Icon fromBitmap(Bitmap bitmap) {
        if (this.nextId >= 0) {
            StringBuilder stringBuilder = new StringBuilder(ICON_ID_PREFIX);
            int i = this.nextId + 1;
            this.nextId = i;
            stringBuilder.append(i);
            return new Icon(stringBuilder.toString(), bitmap);
        }
        throw new TooManyIconsException();
    }

    public final Icon fromFile(String str) {
        try {
            return fromInputStream(this.context.openFileInput(str));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final Icon fromPath(String str) {
        return fromBitmap(BitmapFactory.decodeFile(str, this.options));
    }

    public final Icon fromResource(int i) {
        Drawable drawable = ContextCompat.getDrawable(this.context, i);
        if (drawable instanceof BitmapDrawable) {
            return fromBitmap(((BitmapDrawable) drawable).getBitmap());
        }
        throw new IllegalArgumentException("Failed to decode image. The resource provided must be a Bitmap.");
    }
}
