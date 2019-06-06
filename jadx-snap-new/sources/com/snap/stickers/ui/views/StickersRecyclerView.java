package com.snap.stickers.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import java.lang.ref.WeakReference;

public final class StickersRecyclerView extends RecyclerView {
    public WeakReference<View> a;

    public static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ StickersRecyclerView a;

        public a(StickersRecyclerView stickersRecyclerView) {
            this.a = stickersRecyclerView;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            this.a.a = null;
            return ajxw.a;
        }
    }

    public StickersRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private StickersRecyclerView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            canvas.clipRect(new Rect(0, 0, getWidth(), getHeight()));
        }
        super.dispatchDraw(canvas);
        if (canvas != null) {
            canvas.restore();
        }
        WeakReference weakReference = this.a;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                drawChild(canvas, view, getDrawingTime());
            }
        }
    }
}
