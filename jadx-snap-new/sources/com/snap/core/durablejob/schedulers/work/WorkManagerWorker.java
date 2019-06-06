package com.snap.core.durablejob.schedulers.work;

import android.content.Context;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import defpackage.abmr;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajfu;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.did;
import defpackage.ftl;
import defpackage.gbc;
import defpackage.gcc;
import defpackage.hwj;
import defpackage.ihh;
import defpackage.ilv;
import defpackage.ilw;
import defpackage.ilx;
import defpackage.zgb;
import java.util.concurrent.Callable;

public final class WorkManagerWorker extends RxWorker {
    public zgb e;
    public ajwy<ilv> f;
    public ajwy<ilw> g;
    public ajwy<gbc> h;
    public ihh i;
    public ajwy<ilx> j;
    public ajwy<did> k;
    public ajwy<ftl> l;
    long m;
    private final gcc n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class d<V> implements Callable<androidx.work.ListenableWorker.a> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object call() {
            return androidx.work.ListenableWorker.a.a();
        }
    }

    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ WorkManagerWorker a;

        b(WorkManagerWorker workManagerWorker) {
            this.a = workManagerWorker;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ajwy f = this.a.f();
            ihh g = this.a.g();
            long j = this.a.m;
            akcr.a((Object) th, "it");
            defpackage.gbz.a.a(f, g, j, "WORK_MANAGER", th);
        }
    }

    static final class c implements ajev {
        private /* synthetic */ WorkManagerWorker a;

        c(WorkManagerWorker workManagerWorker) {
            this.a = workManagerWorker;
        }

        public final void run() {
            defpackage.gbz.a.a(this.a.f(), this.a.g(), this.a.m, "WORK_MANAGER");
        }
    }

    static {
        a aVar = new a();
    }

    public WorkManagerWorker(Context context, WorkerParameters workerParameters, gcc gcc) {
        akcr.b(context, "context");
        akcr.b(workerParameters, "workerParams");
        akcr.b(gcc, "injector");
        super(context, workerParameters);
        this.n = gcc;
        this.n.inject(this);
        abmr.a("init should be called on bg thread.");
        ajwy ajwy = this.j;
        if (ajwy == null) {
            akcr.a("grapheneInitListener");
        }
        ajwy ajwy2 = this.k;
        if (ajwy2 == null) {
            akcr.a("blizzardInitializer");
        }
        ajwy ajwy3 = this.l;
        if (ajwy3 == null) {
            akcr.a("compositeConfigurationProvider");
        }
        defpackage.gbz.a.a(ajwy, ajwy2, ajwy3);
    }

    public final void c() {
        ajwy ajwy = this.f;
        if (ajwy == null) {
            akcr.a("graphene");
        }
        ajwy ajwy2 = this.g;
        if (ajwy2 == null) {
            akcr.a("grapheneFlusher");
        }
        ihh ihh = this.i;
        if (ihh == null) {
            akcr.a("clock");
        }
        long j = this.m;
        ajwy ajwy3 = this.l;
        if (ajwy3 == null) {
            akcr.a("compositeConfigurationProvider");
        }
        defpackage.gbz.a.a(ajwy, ajwy2, ihh, j, "WORK_MANAGER", ajwy3);
        super.c();
    }

    public final ajdw d() {
        if (this.e == null) {
            akcr.a("schedulersProvider");
        }
        return zgb.a(hwj.a, "WorkManagerWorker").b();
    }

    public final ajdx<androidx.work.ListenableWorker.a> e() {
        ihh ihh = this.i;
        if (ihh == null) {
            akcr.a("clock");
        }
        this.m = ihh.c();
        ajwy ajwy = this.f;
        if (ajwy == null) {
            akcr.a("graphene");
        }
        ajwy ajwy2 = this.h;
        if (ajwy2 == null) {
            akcr.a("durableJobManager");
        }
        Object c = defpackage.gbz.a.a(ajwy, ajwy2, "WORK_MANAGER").a((ajfb) new b(this)).b((ajev) new c(this)).a(ajfu.g).c((Callable) d.a);
        akcr.a(c, "WakeUpSchedulerHelper.st…Worker.Result.success() }");
        return c;
    }

    public final ajwy<ilv> f() {
        ajwy ajwy = this.f;
        if (ajwy == null) {
            akcr.a("graphene");
        }
        return ajwy;
    }

    public final ihh g() {
        ihh ihh = this.i;
        if (ihh == null) {
            akcr.a("clock");
        }
        return ihh;
    }
}
