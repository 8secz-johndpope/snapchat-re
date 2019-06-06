package com.snap.opera.view.media;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.CountDownTimer;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import com.snapchat.android.R;
import defpackage.tbv;
import defpackage.tda;
import java.util.concurrent.TimeUnit;

public class VideoProgressBarViewV2 extends tbv {
    public final int a;
    public ProgressBar b;
    public ProgressBar c;
    VideoProgressBarTextView d;
    public CountDownTimer e;
    private final int f;
    private String g;
    private long h;

    public VideoProgressBarViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private VideoProgressBarViewV2(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.f = (int) getResources().getDimension(R.dimen.video_progress_bar_v2_min_height);
        this.a = (int) getResources().getDimension(R.dimen.video_progress_bar_v2_max_height);
    }

    private static ClipDrawable a(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(i);
        ClipDrawable clipDrawable = new ClipDrawable(shapeDrawable, 8388611, 1);
        clipDrawable.setAlpha(i2);
        return clipDrawable;
    }

    public static void a(ProgressBar progressBar, int i, int i2) {
        progressBar.setProgressDrawable(a(i, i2));
    }

    public final void a() {
        c();
    }

    public final void a(int i) {
        this.b.setProgress(i);
        this.c.setProgress(1000 - i);
        VideoProgressBarTextView videoProgressBarTextView = this.d;
        double d = (double) i;
        Double.isNaN(d);
        videoProgressBarTextView.a = d / 1000.0d;
    }

    public final void a(String str) {
        this.g = str;
    }

    public final int b() {
        return this.b.getProgress();
    }

    public final void b(int i) {
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(((long) i) + 500);
        if (this.h != toSeconds) {
            this.h = toSeconds;
            this.d.setText(String.format(this.g, new Object[]{Long.valueOf(toSeconds)}));
        }
    }

    public final boolean c() {
        boolean z = this.b.getHeight() != this.f;
        tda.a(this.b, this.f, 300, null);
        tda.a(this.c, this.f, 300, null);
        this.d.setVisibility(4);
        return z;
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = (ProgressBar) findViewById(R.id.video_progress_bar_completed);
        this.b.setMax(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
        this.c = (ProgressBar) findViewById(R.id.video_progress_bar_remaining);
        this.c.setMax(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
        this.d = (VideoProgressBarTextView) findViewById(R.id.video_progress_bar_label);
        a(this.b, ContextCompat.getColor(getContext(), R.color.black), 127);
        a(this.c, ContextCompat.getColor(getContext(), R.color.white), 255);
    }
}
