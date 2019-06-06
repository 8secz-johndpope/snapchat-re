package com.snap.opera.view.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;

public class VideoSeekBarView extends View {
    public a a;
    private float b;
    private final RectF c;
    private final RectF d;
    private final Paint e;
    private final Paint f;
    private final Paint g;
    private boolean h;
    private boolean i;
    private final float j;
    private final float k;
    private final float l;
    private final float m;

    public interface a {
        void a();

        void a(float f, boolean z);

        void b();
    }

    public VideoSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private VideoSeekBarView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.b = MapboxConstants.MINIMUM_ZOOM;
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint();
        this.f = new Paint();
        this.g = new Paint();
        this.h = true;
        this.i = false;
        this.j = getResources().getDimension(R.dimen.video_player_seek_bar_rect_height);
        this.l = getResources().getDimension(R.dimen.video_player_seek_bar_position_indicator_radius_small);
        this.m = getResources().getDimension(R.dimen.video_player_seek_bar_position_indicator_radius_large);
        this.k = getResources().getDimension(R.dimen.video_player_seek_bar_rect_corner_radius);
        this.f.setColor(ContextCompat.getColor(getContext(), R.color.white_fifty_opacity));
        this.g.setColor(ContextCompat.getColor(getContext(), R.color.white));
    }

    private void a(int i, float f) {
        if (this.a != null) {
            f /= (float) getWidth();
            boolean z = true;
            if (1 != i) {
                z = false;
            }
            this.a.a(f, z);
        }
    }

    public final void a(float f) {
        if (f >= MapboxConstants.MINIMUM_ZOOM && f <= 1000.0f) {
            this.b = f;
            requestLayout();
            invalidate();
        }
    }

    public final void a(Paint paint) {
        this.e.set(paint);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        int measuredWidth = (int) (this.b * ((float) getMeasuredWidth()));
        float measuredHeight = (float) getMeasuredHeight();
        float f = this.j;
        measuredHeight = (measuredHeight - f) / 2.0f;
        f += measuredHeight;
        this.c.set(MapboxConstants.MINIMUM_ZOOM, measuredHeight, (float) getMeasuredWidth(), f);
        float f2 = (float) measuredWidth;
        this.d.set(MapboxConstants.MINIMUM_ZOOM, measuredHeight, f2, f);
        RectF rectF = this.c;
        f = this.k;
        canvas.drawRoundRect(rectF, f, f, this.f);
        rectF = this.d;
        f = this.k;
        canvas.drawRoundRect(rectF, f, f, this.e);
        canvas.drawCircle(f2, (float) (getMeasuredHeight() / 2), this.i ? this.m : this.l, this.e);
    }

    /* JADX WARNING: Missing block: B:9:0x0017, code skipped:
            if (r0 != 3) goto L_0x0041;
     */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
        r4 = this;
        r0 = r5.getAction();
        r5 = r5.getX();
        r1 = r4.h;
        r2 = 0;
        if (r1 != 0) goto L_0x000e;
    L_0x000d:
        return r2;
    L_0x000e:
        r1 = 1;
        if (r0 == 0) goto L_0x002b;
    L_0x0011:
        if (r0 == r1) goto L_0x001e;
    L_0x0013:
        r3 = 2;
        if (r0 == r3) goto L_0x001a;
    L_0x0016:
        r5 = 3;
        if (r0 == r5) goto L_0x0021;
    L_0x0019:
        goto L_0x0041;
    L_0x001a:
        r4.a(r0, r5);
        goto L_0x0041;
    L_0x001e:
        r4.a(r0, r5);
    L_0x0021:
        r4.i = r2;
        r5 = r4.a;
        if (r5 == 0) goto L_0x0041;
    L_0x0027:
        r5.b();
        goto L_0x0041;
    L_0x002b:
        r5 = r4.a;
        if (r5 == 0) goto L_0x0032;
    L_0x002f:
        r5.a();
    L_0x0032:
        r5 = r4.getParent();
        if (r5 == 0) goto L_0x003f;
    L_0x0038:
        r5 = r4.getParent();
        r5.requestDisallowInterceptTouchEvent(r1);
    L_0x003f:
        r4.i = r1;
    L_0x0041:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.opera.view.media.VideoSeekBarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setClickable(boolean z) {
        this.h = z;
    }
}
