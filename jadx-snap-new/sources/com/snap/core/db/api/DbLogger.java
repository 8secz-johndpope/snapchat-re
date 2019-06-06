package com.snap.core.db.api;

import defpackage.abss;
import defpackage.ainy;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajei;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.akge;
import defpackage.ilv;
import defpackage.ilz;
import defpackage.ipb;
import defpackage.zfw;
import defpackage.zgb;
import java.util.concurrent.Callable;

public final class DbLogger {
    private final ajei compositeDisposable = new ajei();
    private final ilv graphene;
    private final ajwy<abss> releaseManager;
    private final zfw scheduler = zgb.a(SnapDbCoreFeature.INSTANCE, "DbLogger");

    public DbLogger(ilv ilv, ajwy<abss> ajwy, zgb zgb) {
        akcr.b(ilv, "graphene");
        akcr.b(ajwy, "releaseManager");
        akcr.b(zgb, "schedulersProvider");
        this.graphene = ilv;
        this.releaseManager = ajwy;
    }

    private final void doLogging(String str, String str2, long j) {
        this.compositeDisposable.a(ajdx.c((Callable) new DbLogger$doLogging$1(this, str, str2, j)).b((ajdw) this.scheduler.b()).c());
    }

    private final void reportToGraphene(long j, String str) {
        ilz a = ipb.DB_THREAD_RUNNING_METRICS.a("db_query_tag", akge.b(str, 63));
        this.graphene.a(a, j);
        this.graphene.c(a, 1);
    }

    public final void dispose() {
        this.compositeDisposable.dispose();
    }

    public final void logLongRunningDbExecutionIfNeeded(String str, long j) {
        akcr.b(str, "transactionTag");
        if (((abss) this.releaseManager.get()).d() && j > 1000) {
            doLogging(str, null, j);
        }
    }

    public final void logLongRunningDbExecutionIfNeededWithStatement(ainy ainy, long j) {
        akcr.b(ainy, "statement");
    }
}
