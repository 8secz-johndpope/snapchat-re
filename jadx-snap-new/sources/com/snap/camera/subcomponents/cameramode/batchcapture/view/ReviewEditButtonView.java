package com.snap.camera.subcomponents.cameramode.batchcapture.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.hs;
import defpackage.hu;

public class ReviewEditButtonView extends ConstraintLayout {
    private TextView d;
    private View e;
    private Supplier<Rect> f;

    public ReviewEditButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private Rect h() {
        int[] iArr = new int[2];
        this.e.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], (int) (((float) iArr[0]) + (((float) this.e.getWidth()) * this.e.getScaleX())), (int) (((float) iArr[1]) + (((float) this.e.getHeight()) * this.e.getScaleY())));
    }

    public final void a(int i) {
        this.d.setText(String.valueOf(i));
    }

    public final void a(Bitmap bitmap) {
        hs a = hu.a(getResources(), bitmap);
        a.a(this.e.getResources().getDimension(R.dimen.camera_mode_batch_capture_review_edit_thumbnail_corner_radius));
        this.e.setBackground(a);
    }

    public final void b() {
        setVisibility(0);
        setAlpha(MapboxConstants.MINIMUM_ZOOM);
    }

    public final void c() {
        setVisibility(8);
    }

    public final void d() {
        setScaleX(0.5f);
        setScaleY(0.5f);
        setAlpha(MapboxConstants.MINIMUM_ZOOM);
    }

    public final void e() {
        if (getVisibility() == 0) {
            animate().scaleX(0.8f).scaleY(0.8f).alpha(0.5f).setDuration(150).start();
        }
    }

    public final void f() {
        animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setStartDelay(100).setDuration(100).start();
    }

    public final Rect g() {
        return (Rect) this.f.get();
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = (TextView) findViewById(R.id.batch_capture_review_edit_button_count);
        this.e = findViewById(R.id.batch_capture_review_edit_button_thumbnail);
        this.f = Suppliers.memoize(new -$$Lambda$ReviewEditButtonView$avSITT4ODPmA_jeyOzkS7vd_1q4(this));
    }
}
