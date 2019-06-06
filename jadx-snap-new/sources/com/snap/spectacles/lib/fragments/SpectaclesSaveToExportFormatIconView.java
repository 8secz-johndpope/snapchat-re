package com.snap.spectacles.lib.fragments;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.akcr;
import defpackage.vjm;
import defpackage.xlj;

public final class SpectaclesSaveToExportFormatIconView extends ConstraintLayout {
    vjm d = vjm.SPECTACLES_CIRCLE_WHITE;
    private final Paint e = new Paint(1);
    private float f;
    private float g;
    private int h = -16777216;
    private int i = -16777216;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public SpectaclesSaveToExportFormatIconView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        setWillNotDraw(false);
        this.e.setStrokeWidth(abtp.a(1.0f, context));
        this.f = abtp.a(2.5f, context);
        this.g = this.e.getStrokeWidth();
        this.h = ContextCompat.getColor(context, R.color.export_format_border);
        this.i = ContextCompat.getColor(context, R.color.export_format_fill);
    }

    private final void a(Canvas canvas) {
        float f = this.g;
        RectF rectF = new RectF(f, f, ((float) getMeasuredWidth()) - this.g, ((float) getMeasuredHeight()) - this.g);
        f = this.f;
        canvas.drawRoundRect(rectF, f, f, this.e);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        super.onDraw(canvas);
        this.e.setColor(this.i);
        this.e.setStyle(Style.FILL);
        if (this.d == vjm.SPECTACLES_CIRCLE_BLACK) {
            a(canvas);
        }
        this.e.setColor(this.h);
        this.e.setStyle(Style.STROKE);
        a(canvas);
        if (this.d == vjm.SPECTACLES_CIRCLE_WHITE || this.d == vjm.SPECTACLES_CIRCLE_BLACK) {
            float measuredWidth = ((float) (getMeasuredWidth() >> 1)) * 0.6666667f;
            float measuredWidth2 = (float) (getMeasuredWidth() >> 1);
            this.e.setColor(-1);
            this.e.setStyle(Style.FILL);
            canvas.drawCircle(measuredWidth2, measuredWidth2, measuredWidth, this.e);
            this.e.setColor(this.h);
            this.e.setStyle(Style.STROKE);
            canvas.drawCircle(measuredWidth2, measuredWidth2, measuredWidth, this.e);
        }
    }

    public final void onMeasure(int i, int i2) {
        float measuredWidth;
        float f;
        super.onMeasure(i, i2);
        i = (int) this.e.getStrokeWidth();
        i2 = xlj.a[this.d.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                measuredWidth = (float) getMeasuredWidth();
                f = 0.5625f;
            } else if (i2 != 3) {
                measuredWidth = (float) getMeasuredHeight();
                f = ((float) i) * 2.0f;
            } else {
                measuredWidth = (float) getMeasuredWidth();
                f = 1.7777778f;
            }
            measuredWidth *= f;
            f = (float) (i << 1);
        } else {
            measuredWidth = (float) getMeasuredWidth();
            f = 0.75f;
            measuredWidth *= f;
            f = (float) (i << 1);
        }
        setMeasuredDimension(getMeasuredWidth() + (i << 1), (int) (measuredWidth + f));
    }
}
