package com.snap.camera.subcomponents.capture.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.azs;
import defpackage.azt;
import defpackage.azx;
import defpackage.zpi;

public class HandsFreeRecordingLockView extends FrameLayout {
    public View a;
    public View b;
    public ValueAnimator c;
    public ValueAnimator d;
    public ValueAnimator e;
    public azt f;
    int g;
    private int h;

    public HandsFreeRecordingLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a() {
        this.e = zpi.a(this.e, ValueAnimator.ofFloat(new float[]{this.b.getAlpha(), MapboxConstants.MINIMUM_ZOOM}), zpi.a(this.b));
    }

    public final void a(int i, int i2) {
        float dimension = getContext().getResources().getDimension(R.dimen.camera_hands_free_recording_lock_translation);
        setX((((float) i) - dimension) - (((float) getWidth()) / 2.0f));
        setY(((float) i2) - (((float) getHeight()) / 2.0f));
        this.g = (int) dimension;
        this.h = 0;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = azx.b().a();
        this.f.a(new azs() {
            public final void onSpringUpdate(azt azt) {
                HandsFreeRecordingLockView.this.b.setTranslationX(((float) HandsFreeRecordingLockView.this.g) - (((float) HandsFreeRecordingLockView.this.g) * ((float) azt.d.a)));
                HandsFreeRecordingLockView.this.b.setTranslationY(MapboxConstants.MINIMUM_ZOOM - (((float) azt.d.a) * MapboxConstants.MINIMUM_ZOOM));
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        azt azt = this.f;
        if (azt != null) {
            azt.a();
            this.f = null;
        }
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.c.removeAllUpdateListeners();
            this.c = null;
        }
        valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d.removeAllUpdateListeners();
            this.d = null;
        }
        valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.e.removeAllUpdateListeners();
            this.e = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.camera_hands_free_recording_lock_icon);
        this.b = findViewById(R.id.camera_hands_free_recording_lock_highlight);
    }
}
