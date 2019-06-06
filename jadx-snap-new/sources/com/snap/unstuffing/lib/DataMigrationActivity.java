package com.snap.unstuffing.lib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.jakewharton.processphoenix.ProcessPhoenix;
import com.snapchat.android.R;
import defpackage.aipp;
import defpackage.ajdw;
import defpackage.ajev;
import defpackage.ajfb;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.gqr;
import defpackage.gqt;
import defpackage.idd;
import defpackage.ilv;
import defpackage.ilz;
import defpackage.iot;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zta;
import defpackage.ztb;
import defpackage.zte;
import defpackage.ztf;
import defpackage.ztg;

public final class DataMigrationActivity extends FragmentActivity {
    final idd i = ztg.a.callsite("DataMigrationActivity");
    public zta j;
    public zgb k;
    public gqr l;
    public ilv m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b extends akcq implements akbk<ajxw> {
        b(DataMigrationActivity dataMigrationActivity) {
            super(0, dataMigrationActivity);
        }

        public final String getName() {
            return "onMigrationComplete";
        }

        public final akej getOwner() {
            return akde.a(DataMigrationActivity.class);
        }

        public final String getSignature() {
            return "onMigrationComplete()V";
        }

        public final /* synthetic */ Object invoke() {
            ((DataMigrationActivity) this.receiver).c();
            return ajxw.a;
        }
    }

    static final class c extends akcq implements akbl<Throwable, ajxw> {
        c(DataMigrationActivity dataMigrationActivity) {
            super(1, dataMigrationActivity);
        }

        public final String getName() {
            return "onMigrationError";
        }

        public final akej getOwner() {
            return akde.a(DataMigrationActivity.class);
        }

        public final String getSignature() {
            return "onMigrationError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            DataMigrationActivity dataMigrationActivity = (DataMigrationActivity) this.receiver;
            ilv ilv = dataMigrationActivity.m;
            if (ilv == null) {
                akcr.a("graphene");
            }
            iot iot = iot.PURE_MROOM_DATA_MIGR_FAILED;
            zta zta = dataMigrationActivity.j;
            String str = "migrationController";
            if (zta == null) {
                akcr.a(str);
            }
            ilz a = iot.a("reason", zta.a());
            zta = dataMigrationActivity.j;
            if (zta == null) {
                akcr.a(str);
            }
            ilv.c(a.a("data_trigger", zta.b()).a("entry_point", "main_activity"), 1);
            gqr gqr = dataMigrationActivity.l;
            if (gqr == null) {
                akcr.a("exceptionTracker");
            }
            gqr.a(gqt.HIGH, th, dataMigrationActivity.i);
            dataMigrationActivity.c();
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        akcr.a(getIntent().getParcelableExtra(ztb.a), "intent.getParcelableExtr…EFERRED_INTENT_EXTRA_KEY)");
        ProcessPhoenix.a(this, (Intent) r0);
    }

    public final void onCreate(Bundle bundle) {
        aipp.a((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.data_migration_activity);
        if (this.k == null) {
            akcr.a("schedulersProvider");
        }
        zfw a = zgb.a(this.i);
        ilv ilv = this.m;
        if (ilv == null) {
            akcr.a("graphene");
        }
        iot iot = iot.PURE_MROOM_DATA_MIGR_STARTED;
        zta zta = this.j;
        String str = "migrationController";
        if (zta == null) {
            akcr.a(str);
        }
        ilz a2 = iot.a("reason", zta.a());
        zta = this.j;
        if (zta == null) {
            akcr.a(str);
        }
        ilv.c(a2.a("data_trigger", zta.b()).a("entry_point", "main_activity"), 1);
        zta zta2 = this.j;
        if (zta2 == null) {
            akcr.a(str);
        }
        DataMigrationActivity dataMigrationActivity = this;
        akcr.a(zta2.a(this, true).b((ajdw) a.f()).a((ajdw) a.l()).a((ajev) new zte(new b(dataMigrationActivity)), (ajfb) new ztf(new c(dataMigrationActivity))), "startMigration()\n       …, this::onMigrationError)");
    }
}
