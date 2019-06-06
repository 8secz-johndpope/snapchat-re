package com.snap.map.screen.main;

import defpackage.aajv;
import defpackage.akcr;
import defpackage.j.a;
import defpackage.k;
import defpackage.nme;
import defpackage.s;

public final class MapLifecycleObserver implements k {
    private final nme a;

    public MapLifecycleObserver(nme nme) {
        akcr.b(nme, "mapScreen");
        this.a = nme;
    }

    @s(a = a.ON_PAUSE)
    public final void onActivityPaused() {
        Object j = this.a.j();
        akcr.a(j, "mapScreen.controller");
        j.b(aajv.ENTER_BACKGROUND);
    }
}
