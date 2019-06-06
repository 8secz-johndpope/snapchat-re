package com.snap.mushroom.base;

import android.content.Intent;
import defpackage.aajt;
import defpackage.aash;
import defpackage.aasi;
import defpackage.ajcx;
import defpackage.ajdb;
import defpackage.ajdw;
import defpackage.ajev;
import defpackage.ajhn;
import defpackage.ajvo;
import defpackage.ajwy;
import defpackage.akco;
import defpackage.akcr;
import defpackage.dib;
import defpackage.ilv;
import defpackage.ilw;
import defpackage.ily;
import defpackage.iot;
import defpackage.iry;
import defpackage.zfw;
import java.util.concurrent.TimeUnit;

public final class UserDataMushroomToggleProcessor {
    public static final Companion Companion = new Companion();
    private static final long METRIC_FLUSH_DELAY_SECONDS = 3;
    private final dib blizzardEventLogger;
    private final ilv graphene;
    private final ajwy<ilw> grapheneFlusher;
    private final ajwy<iry> userDataManager;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    public UserDataMushroomToggleProcessor(ajwy<iry> ajwy, ilv ilv, dib dib, ajwy<ilw> ajwy2) {
        akcr.b(ajwy, "userDataManager");
        akcr.b(ilv, "graphene");
        akcr.b(dib, "blizzardEventLogger");
        akcr.b(ajwy2, "grapheneFlusher");
        this.userDataManager = ajwy;
        this.graphene = ilv;
        this.blizzardEventLogger = dib;
        this.grapheneFlusher = ajwy2;
    }

    private final void logOptOutMetrics(aasi aasi) {
        this.graphene.c((ily) iot.MUSHROOM_OPT_OUT, 1);
        this.graphene.c((ily) iot.MUSHROOM_EXIT, 1);
        ((ilw) this.grapheneFlusher.get()).a();
        aash aash = new aash();
        aash.a(Boolean.FALSE);
        aash.a(aasi);
        this.blizzardEventLogger.a((aajt) aash);
        this.blizzardEventLogger.a();
    }

    public final ajcx onEnterApp(Intent intent) {
        akcr.b(intent, "launchIntent");
        Object a = ajvo.a(ajhn.a);
        akcr.a(a, "Completable.complete()");
        return a;
    }

    public final ajcx onExitApp(aasi aasi, zfw zfw) {
        akcr.b(aasi, "toggleSource");
        akcr.b(zfw, "shedulers");
        Object b = ajcx.a((ajev) new UserDataMushroomToggleProcessor$onExitApp$1(this, aasi)).b(METRIC_FLUSH_DELAY_SECONDS, TimeUnit.SECONDS).b((ajdb) ((iry) this.userDataManager.get()).b().b((ajdw) zfw.f()));
        akcr.a(b, "Completable\n            …scribeOn(shedulers.io()))");
        return b;
    }
}
