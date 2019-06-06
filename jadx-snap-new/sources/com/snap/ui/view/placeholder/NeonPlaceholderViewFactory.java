package com.snap.ui.view.placeholder;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.brightcove.player.event.Event;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.zkr;

public final class NeonPlaceholderViewFactory {
    private final Activity activity;
    private final zkr windowRectObserver;

    public NeonPlaceholderViewFactory(Activity activity, zkr zkr) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(zkr, "windowRectObserver");
        this.activity = activity;
        this.windowRectObserver = zkr;
    }

    public final View createPlaceholderView() {
        View view = new View(this.activity);
        view.setLayoutParams(new LayoutParams(-1, -1));
        view.setOnTouchListener(new NeonPlaceholderViewFactory$createPlaceholderView$1$1());
        view.addOnAttachStateChangeListener(new NeonPlaceholderViewFactory$createPlaceholderView$1$2(this.windowRectObserver.a().c(1).f((ajfb) new NeonPlaceholderViewFactory$createPlaceholderView$1$disposable$1(view))));
        return view;
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final zkr getWindowRectObserver() {
        return this.windowRectObserver;
    }
}
