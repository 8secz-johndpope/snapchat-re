package com.snap.opera.view.media;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class VideoProgressBarTextView extends TextView {
    double a;

    public VideoProgressBarTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private VideoProgressBarTextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.a = 0.0d;
    }

    public void draw(Canvas canvas) {
        canvas.save();
        setTextColor(-1);
        double width = (double) getWidth();
        double d = this.a;
        Double.isNaN(width);
        canvas.clipRect(new Rect(0, 0, (int) (width * d), getHeight()));
        super.draw(canvas);
        canvas.restore();
        canvas.save();
        setTextColor(-16777216);
        width = (double) getWidth();
        double d2 = this.a;
        Double.isNaN(width);
        canvas.clipRect(new Rect((int) (width * d2), 0, getWidth(), getHeight()));
        super.draw(canvas);
        canvas.restore();
    }
}
