package defpackage;

import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import defpackage.tnj.a;

/* renamed from: zrg */
public final class zrg implements cin {
    private final ajxe a;

    /* renamed from: zrg$a */
    static final class a extends akcs implements akbk<zre> {
        private /* synthetic */ aipn a;

        a(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zre) this.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zrg.class), "unlockablesConfigUpdater", "getUnlockablesConfigUpdater()Lcom/snap/unlockables/lib/config/UnlockablesConfigUpdater;");
    }

    public zrg(aipn<zre> aipn) {
        akcr.b(aipn, "unlockablesConfigUpdaterLazy");
        this.a = ajxh.a(new a(aipn));
    }

    public final void a(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        afeq afeq = aecy.c;
        if (afeq != null && afeq != null) {
            zre zre = (zre) this.a.b();
            akcr.b(afeq, "updatesResponse");
            a b = zre.a().b();
            String str = afeq.cg;
            if (str != null) {
                b.a((fth) zpt.LAST_KNOWN_COUNTRY_CODE, str);
            }
            Integer num = afeq.S;
            if (num != null) {
                b.a((fth) zpt.SNAP_SCORE, Integer.valueOf(num.intValue()));
            }
            b.b();
        }
    }
}
