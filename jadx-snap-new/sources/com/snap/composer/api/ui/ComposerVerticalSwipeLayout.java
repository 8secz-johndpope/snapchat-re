package com.snap.composer.api.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.snap.composer.views.ComposerView;
import com.snap.composer.views.touches.TouchDispatcher;
import defpackage.abto;

public final class ComposerVerticalSwipeLayout extends abto {
    private final Rect a = new Rect();
    private final int[] b;
    private MotionEvent c;

    public ComposerVerticalSwipeLayout(Context context) {
        super(context, null);
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = 0;
        }
        this.b = iArr;
    }

    public final boolean canChildScroll(View view, Rect rect, MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2;
        if (motionEvent == null) {
            try {
                return super.canChildScroll(view, rect, motionEvent, i);
            } catch (Throwable th) {
                if ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3)) {
                    motionEvent2 = this.c;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.c = null;
                }
            }
        } else {
            MotionEvent motionEvent3;
            if (motionEvent.getAction() == 0) {
                motionEvent3 = this.c;
                if (motionEvent3 != null) {
                    motionEvent3.recycle();
                }
                this.c = MotionEvent.obtain(motionEvent);
            }
            motionEvent3 = this.c;
            if (motionEvent3 == null) {
                motionEvent3 = motionEvent;
            }
            if ((view instanceof ComposerView) && TouchDispatcher.Companion.hitTest(view, r3, this.b, this.a) && ((ComposerView) view).hasDragGestureRecognizer()) {
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    MotionEvent motionEvent4 = this.c;
                    if (motionEvent4 != null) {
                        motionEvent4.recycle();
                    }
                    this.c = null;
                }
                return true;
            }
            boolean canChildScroll = super.canChildScroll(view, rect, motionEvent, i);
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                motionEvent2 = this.c;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.c = null;
            }
            return canChildScroll;
        }
    }
}
