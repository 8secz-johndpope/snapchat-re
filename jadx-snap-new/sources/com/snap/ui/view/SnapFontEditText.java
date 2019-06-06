package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.zfw;
import defpackage.zhg.a;
import defpackage.zki;

public class SnapFontEditText extends EditText {
    private static final int[] STYLE = a.m;
    private static final String TAG = "SnapFontEditText";
    private boolean readyToDraw = true;
    private int requestedStyle;
    private ajej typefaceLoadRequest;

    public SnapFontEditText(Context context) {
        super(context);
        applyStyle(0, MapboxConstants.MINIMUM_ZOOM);
    }

    public SnapFontEditText(Context context, int i) {
        super(context);
        applyStyle(i, MapboxConstants.MINIMUM_ZOOM);
    }

    public SnapFontEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public SnapFontEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void applyStyle(int i, float f) {
        setPaintFlags(getPaintFlags() | 128);
        if (!isInEditMode()) {
            setTypefaceStyle(i);
            zki.a((TextView) this, f);
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, STYLE);
        if (obtainStyledAttributes == null) {
            applyStyle(0, MapboxConstants.MINIMUM_ZOOM);
            return;
        }
        try {
            applyStyle(obtainStyledAttributes.getInt(4, 0), obtainStyledAttributes.getFloat(3, MapboxConstants.MINIMUM_ZOOM));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    static /* synthetic */ void lambda$setTypefaceStyle$1(Throwable th) {
    }

    public /* synthetic */ void lambda$setTypefaceStyle$0$SnapFontEditText(int i, Typeface typeface) {
        if (this.requestedStyle == i) {
            setTypeface(typeface);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        if (this.readyToDraw) {
            super.onDraw(canvas);
        }
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, zki.a(bufferType));
    }

    public void setTypeface(Typeface typeface) {
        this.readyToDraw = true;
        super.setTypeface(typeface);
    }

    public void setTypeface(Typeface typeface, int i) {
        setTypefaceStyle(i);
    }

    public void setTypefaceStyle(int i) {
        ajej ajej = this.typefaceLoadRequest;
        if (ajej != null) {
            ajej.dispose();
        }
        if (zki.a(i) || !isMainThread()) {
            super.setTypeface(zki.a(getContext(), i));
            return;
        }
        this.requestedStyle = i;
        this.readyToDraw = false;
        invalidate();
        zfw typefaceSchedulers = SnapFontTextView.getTypefaceSchedulers();
        this.typefaceLoadRequest = zki.a(getContext(), i, (ajdw) typefaceSchedulers.f()).a((ajdw) typefaceSchedulers.l()).a(new -$$Lambda$SnapFontEditText$N4kJ1fMMesHMvRxXW-f55gvJAYY(this, i), -$$Lambda$SnapFontEditText$V6EfsfI297d4e77llGBd4fTVXq8.INSTANCE);
    }
}
