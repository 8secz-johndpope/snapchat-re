package com.snap.cognac.internal.view.dock;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ChatDockBitmojiLayout extends FrameLayout {
    private final Path a = new Path();

    public ChatDockBitmojiLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f = ((float) i) / 2.0f;
        float f2 = ((float) i2) / 2.0f;
        this.a.reset();
        this.a.addCircle(f, f2, Math.min(f, f2), Direction.CW);
        this.a.close();
    }
}
