package com.snap.cognac.internal.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.snapchat.android.R;

public class CognacWaveformView extends View {
    private final Paint a;
    private ValueAnimator b;
    private ValueAnimator c;
    private int d;
    private int e;
    private final int f;
    private final int g;
    private final float[] h;
    private final Path[] i;

    public CognacWaveformView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CognacWaveformView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.a = new Paint(1);
        this.a.setColor(resources.getColor(R.color.waveform_local_color));
        this.a.setStyle(Style.STROKE);
        this.a.setStrokeCap(Cap.ROUND);
        this.f = resources.getDimensionPixelOffset(R.dimen.waveform_width);
        this.g = resources.getDimensionPixelOffset(R.dimen.waveform_spacing);
        this.i = new Path[3];
        this.h = new float[3];
        setWillNotDraw(false);
    }

    private /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.h[1] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private /* synthetic */ void b(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.h;
        fArr[0] = floatValue;
        fArr[2] = floatValue;
    }

    public final void a() {
        this.b = ValueAnimator.ofFloat(new float[]{0.2f, 0.8f});
        this.b.setDuration(500);
        this.b.setRepeatMode(2);
        this.b.setRepeatCount(-1);
        this.b.addUpdateListener(new -$$Lambda$CognacWaveformView$0oPWvjslxBMqyO2npcP23k-IZT4(this));
        this.b.start();
        this.c = ValueAnimator.ofFloat(new float[]{0.8f, 0.2f});
        this.c.setDuration(500);
        this.c.setRepeatMode(2);
        this.c.setRepeatCount(-1);
        this.c.addUpdateListener(new -$$Lambda$CognacWaveformView$dw1ubiSpwTwZDlUu5UXEO7vhmX8(this));
        this.c.start();
    }

    public final void b() {
        this.b.cancel();
        this.c.cancel();
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.d = measuredWidth / 2;
        this.e = measuredHeight / 2;
        this.a.setStrokeWidth((float) this.f);
        measuredWidth = this.f;
        measuredHeight = this.g;
        float f = (float) (measuredWidth + measuredHeight);
        float f2 = (f * 2.0f) + ((float) measuredWidth);
        float f3 = (((float) (measuredHeight * 2)) + f2) / 2.0f;
        float f4 = (((float) measuredWidth) - f2) / 2.0f;
        for (int i = 0; i < 3; i++) {
            f2 = Math.max(this.h[i] * (((float) Math.sqrt(1.0d - Math.pow((double) (f4 / f3), 2.0d))) * f3), 1.0f);
            Path path = this.i[i];
            if (path == null) {
                path = new Path();
                this.i[i] = path;
            } else {
                path.reset();
            }
            float f5 = ((float) this.d) + f4;
            path.moveTo(f5, ((float) this.e) - f2);
            path.lineTo(f5, ((float) this.e) + f2);
            canvas.drawPath(path, this.a);
            f4 += f;
        }
    }
}
