package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import defpackage.akco;
import defpackage.akcr;
import defpackage.zhg.a;

public final class SnapStrokeFontTextView extends SnapFontTextView {
    public static final Companion Companion = new Companion();
    private static final int DEFAULT_STROKE_COLOR = 0;
    private static final int DEFAULT_STROKE_MITER = 10;
    private static final int DEFAULT_STROKE_WIDTH = 1;
    private int strokeColor;
    private Join strokeJoin;
    private float strokeMiter;
    private float strokeWidth;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public SnapStrokeFontTextView(Context context) {
        akcr.b(context, "context");
        super(context);
    }

    public SnapStrokeFontTextView(Context context, int i) {
        akcr.b(context, "context");
        super(context, i);
    }

    public SnapStrokeFontTextView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
        init(attributeSet);
    }

    public SnapStrokeFontTextView(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, i);
        init(attributeSet);
    }

    private final void init(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.o);
        if (obtainStyledAttributes.hasValue(1)) {
            this.strokeWidth = (float) obtainStyledAttributes.getDimensionPixelSize(4, 1);
            this.strokeColor = obtainStyledAttributes.getColor(1, 0);
            this.strokeMiter = (float) obtainStyledAttributes.getDimensionPixelSize(3, 10);
            int i = obtainStyledAttributes.getInt(2, 0);
            Join join = i != 0 ? i != 1 ? i != 2 ? null : Join.ROUND : Join.BEVEL : Join.MITER;
            this.strokeJoin = join;
        }
        obtainStyledAttributes.recycle();
    }

    public final void onDraw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.strokeJoin != null) {
            int currentTextColor = getCurrentTextColor();
            Object paint = getPaint();
            akcr.a(paint, "paint");
            paint.setStyle(Style.STROKE);
            paint.setStrokeJoin(this.strokeJoin);
            paint.setStrokeMiter(this.strokeMiter);
            setTextColor(this.strokeColor);
            paint.setStrokeWidth(this.strokeWidth);
            super.onDraw(canvas);
            paint.setStyle(Style.FILL);
            setTextColor(currentTextColor);
        }
    }
}
