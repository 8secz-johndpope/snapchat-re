package com.snap.opera.view.media;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.common.base.Strings;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import com.snapchat.android.R;
import defpackage.tbv;
import defpackage.tda;

public class VideoProgressBarViewV1 extends tbv {
    public final int a;
    public final int b;
    public final int c;
    public ProgressBar d;
    public Boolean e;
    private TextView f;
    private String g;
    private int h;

    public VideoProgressBarViewV1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private VideoProgressBarViewV1(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.a = (int) getResources().getDimension(R.dimen.video_progress_bar_min_height);
        this.b = (int) getResources().getDimension(R.dimen.video_progress_bar_max_height);
        this.c = (int) getResources().getDimension(R.dimen.video_progress_bar_with_label_max_height);
    }

    public final void a() {
        c(this.a);
    }

    public final void a(int i) {
        this.d.setProgress(i);
    }

    public final void a(String str) {
        this.e = Boolean.valueOf(Strings.isNullOrEmpty(str) ^ 1);
        if (this.e.booleanValue()) {
            this.g = str;
        }
    }

    public final int b() {
        return this.d.getProgress();
    }

    public final void b(int i) {
        if (this.e.booleanValue()) {
            double d = (double) i;
            Double.isNaN(d);
            i = (int) ((d / 1000.0d) + 0.5d);
            if (this.h != i) {
                this.h = i;
                this.f.setText(String.format(this.g, new Object[]{Integer.valueOf(i)}));
            }
        }
    }

    public final void c(int i) {
        tda.a(this.d, i, 50, null);
        if ((i != this.a ? 1 : null) == null || !this.e.booleanValue()) {
            this.d.setBackgroundColor(0);
            this.f.setVisibility(4);
            return;
        }
        this.d.setBackgroundColor(getResources().getColor(R.color.video_progress_bar_background_color));
        this.f.setVisibility(0);
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ProgressBar) findViewById(R.id.video_progress_bar);
        this.d.setMax(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
        this.f = (TextView) findViewById(R.id.video_progress_bar_label);
        ClipDrawable clipDrawable = new ClipDrawable(new GradientDrawable(Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(getContext(), R.color.white), ContextCompat.getColor(getContext(), R.color.white_seventy_opacity), ContextCompat.getColor(getContext(), R.color.white_fifty_opacity)}), 3, 1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(ContextCompat.getColor(getContext(), R.color.transparent)), clipDrawable, clipDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.d.setProgressDrawable(layerDrawable);
    }
}
