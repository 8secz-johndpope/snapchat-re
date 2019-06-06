package com.snap.composer.views;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.snap.composer.views.touches.TouchDispatcher;
import defpackage.akbl;
import defpackage.akcr;

public final class ComposerScrollUtil {
    private final int[] a = new int[2];
    private final Rect b = new Rect();

    public final boolean canViewScroll(View view, MotionEvent motionEvent, akbl<? super View, Boolean> akbl) {
        akcr.b(view, "view");
        akcr.b(motionEvent, "event");
        akcr.b(akbl, "check");
        if (!TouchDispatcher.Companion.hitTest(view, motionEvent, this.a, this.b)) {
            return false;
        }
        if (((Boolean) akbl.invoke(view)).booleanValue()) {
            return true;
        }
        if ((view instanceof ComposerView) && ((ComposerView) view).hasDragGestureRecognizer()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childAt = viewGroup.getChildAt(i);
            akcr.a(childAt, "view.getChildAt(i)");
            if (canViewScroll(childAt, motionEvent, akbl)) {
                return true;
            }
        }
        return false;
    }
}
