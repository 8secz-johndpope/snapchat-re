package com.snap.composer.api;

import com.snap.composer.utils.IScheduler;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.ftd;
import defpackage.zfw;

public final class SnapComposerViewLoaderManagerFactory$create$manager$1 implements IScheduler {
    private /* synthetic */ zfw a;

    SnapComposerViewLoaderManagerFactory$create$manager$1(zfw zfw) {
        this.a = zfw;
    }

    public final void schedule(akbk<ajxw> akbk) {
        akcr.b(akbk, "work");
        zfw zfw = this.a;
        if (zfw != null) {
            akcr.a(zfw.h().a((Runnable) new ftd(akbk)), "schedulers.userInteractive().scheduleDirect(work)");
        } else {
            akbk.invoke();
        }
    }
}
