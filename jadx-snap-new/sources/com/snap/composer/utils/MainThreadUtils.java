package com.snap.composer.utils;

import android.os.Looper;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.fte;

public final class MainThreadUtils {
    private static final MainThreadUtils$handler$1 a = new MainThreadUtils$handler$1(Looper.getMainLooper());

    public static final void dispatchOnMainThread(akbk<ajxw> akbk) {
        akcr.b(akbk, "task");
        a.post(new fte(akbk));
    }

    public static final void runOnMainThreadDelayed(long j, akbk<ajxw> akbk) {
        akcr.b(akbk, "task");
        a.postDelayed(new fte(akbk), j);
    }

    public static final void runOnMainThreadIfNeeded(akbk<ajxw> akbk) {
        akcr.b(akbk, "task");
        Object currentThread = Thread.currentThread();
        Object mainLooper = Looper.getMainLooper();
        akcr.a(mainLooper, "Looper.getMainLooper()");
        if (akcr.a(currentThread, mainLooper.getThread())) {
            akbk.invoke();
        } else {
            dispatchOnMainThread(akbk);
        }
    }
}
