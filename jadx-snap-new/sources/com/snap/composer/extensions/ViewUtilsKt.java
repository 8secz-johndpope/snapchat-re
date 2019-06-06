package com.snap.composer.extensions;

import android.view.View;
import android.view.ViewManager;
import android.view.ViewParent;
import defpackage.akcr;

public final class ViewUtilsKt {
    public static final void removeFromParentView(View view) {
        akcr.b(view, "receiver$0");
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewManager)) {
            parent = null;
        }
        ViewManager viewManager = (ViewManager) parent;
        if (viewManager != null) {
            viewManager.removeView(view);
        }
    }
}
