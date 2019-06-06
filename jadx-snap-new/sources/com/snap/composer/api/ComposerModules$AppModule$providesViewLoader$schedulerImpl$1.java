package com.snap.composer.api;

import com.snap.composer.utils.IScheduler;
import defpackage.ajdw;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.ftc;

public final class ComposerModules$AppModule$providesViewLoader$schedulerImpl$1 implements IScheduler {
    private /* synthetic */ ajdw a;

    ComposerModules$AppModule$providesViewLoader$schedulerImpl$1(ajdw ajdw) {
        this.a = ajdw;
    }

    public final void schedule(akbk<ajxw> akbk) {
        akcr.b(akbk, "work");
        this.a.a((Runnable) new ftc(akbk));
    }
}
