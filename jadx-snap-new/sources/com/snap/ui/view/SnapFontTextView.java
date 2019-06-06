package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Looper;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.idd;
import defpackage.in;
import defpackage.le;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zgu;
import defpackage.zgw;
import defpackage.zhg.a;
import defpackage.zki;
import defpackage.znp;

public class SnapFontTextView extends AppCompatTextView {
    private static final int MIN_FONT_SIZE_SP = 10;
    private static final String TAG = "SnapFontTextView";
    private static final Factory passThroughSpannablefactory = new Factory() {
        public final Spannable newSpannable(CharSequence charSequence) {
            return charSequence instanceof Spannable ? (Spannable) charSequence : super.newSpannable(charSequence);
        }
    };
    private boolean kerningEnabled;
    znp[] mAttachedSpans;
    private int mMinTextSize = 10;
    private boolean mShouldAutofit = false;
    private boolean readyToDraw = true;
    private int requestedStyle;
    private ajej typefaceLoadRequest;

    public SnapFontTextView(Context context) {
        super(context);
        applyStyle(0, MapboxConstants.MINIMUM_ZOOM);
    }

    public SnapFontTextView(Context context, int i) {
        super(context);
        applyStyle(i, MapboxConstants.MINIMUM_ZOOM);
    }

    public SnapFontTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public SnapFontTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void applyStyle(int i, float f) {
        setSpannableFactory(passThroughSpannablefactory);
        setPaintFlags(getPaintFlags() | 128);
        if (!isInEditMode()) {
            setTypefaceStyle(i);
            this.kerningEnabled = f > MapboxConstants.MINIMUM_ZOOM;
            if (this.kerningEnabled) {
                zki.a((TextView) this, f);
            }
        }
    }

    protected static zfw getTypefaceSchedulers() {
        idd callsite = zgu.a.callsite("typeface");
        zgw.a();
        return zgb.a(callsite);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.m);
        boolean z = false;
        if (obtainStyledAttributes == null) {
            applyStyle(0, MapboxConstants.MINIMUM_ZOOM);
            return;
        }
        try {
            boolean z2 = obtainStyledAttributes.getBoolean(0, false);
            boolean z3 = obtainStyledAttributes.getBoolean(2, false);
            this.mMinTextSize = (int) obtainStyledAttributes.getDimension(1, 10.0f);
            applyStyle(obtainStyledAttributes.getInt(4, 0), obtainStyledAttributes.getFloat(3, MapboxConstants.MINIMUM_ZOOM));
            if (z2 || z3) {
                z = true;
            }
            setAutoFit(z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    static /* synthetic */ void lambda$setTypefaceStyle$1(Throwable th) {
    }

    public boolean isSuggestionsEnabled() {
        return false;
    }

    public /* synthetic */ void lambda$setTypefaceStyle$0$SnapFontTextView(int i, Typeface typeface) {
        if (this.requestedStyle == i) {
            setTypeface(typeface);
            this.readyToDraw = true;
            invalidate();
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        if (this.readyToDraw) {
            try {
                super.onDraw(canvas);
            } catch (IndexOutOfBoundsException e) {
                onOnDrawIndexOutOfBounds(e);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        in.a("SnapTextView OnLayout");
        super.onLayout(z, i, i2, i3, i4);
        in.a();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        in.a("SnapTextView OnMeasure");
        super.onMeasure(i, i2);
        in.a();
    }

    /* Access modifiers changed, original: protected */
    public void onOnDrawIndexOutOfBounds(IndexOutOfBoundsException indexOutOfBoundsException) {
        String valueOf = String.valueOf(getText());
        int length = valueOf.length();
        valueOf = valueOf.substring(0, Math.min(length, 50)).replace(9, '_');
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(valueOf);
        stringBuilder.append(' ');
        stringBuilder.append(length);
        throw new RuntimeException(stringBuilder.toString(), indexOutOfBoundsException);
    }

    public void setAutoFit(boolean z) {
        if (this.mShouldAutofit != z) {
            this.mShouldAutofit = z;
            le.a.a((TextView) this, this.mShouldAutofit);
        }
    }

    public void setMaxTextSize(int i) {
        setTextSize(2, (float) i);
        le.a(this, this.mMinTextSize, i);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.kerningEnabled) {
            bufferType = zki.a(bufferType);
        }
        super.setText(charSequence, bufferType);
        if (charSequence != getText()) {
            znp[] znpArr = this.mAttachedSpans;
            int i = 0;
            if (znpArr != null) {
                for (znp detach : znpArr) {
                    detach.detach();
                }
                this.mAttachedSpans = null;
            }
            if (charSequence instanceof Spanned) {
                this.mAttachedSpans = (znp[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), znp.class);
                znp[] znpArr2 = this.mAttachedSpans;
                int length = znpArr2.length;
                while (i < length) {
                    znpArr2[i].attach(this);
                    i++;
                }
            }
        }
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
        zfw typefaceSchedulers = getTypefaceSchedulers();
        this.typefaceLoadRequest = zki.a(getContext(), i, (ajdw) typefaceSchedulers.f()).a((ajdw) typefaceSchedulers.l()).a(new -$$Lambda$SnapFontTextView$I628L_wwV-ya-vKd3Z-03WiqFAc(this, i), -$$Lambda$SnapFontTextView$YyknsvCmM2omiHCpZpuGY_Kt_wc.INSTANCE);
    }

    public boolean shouldAutoFit() {
        return this.mShouldAutofit;
    }
}
