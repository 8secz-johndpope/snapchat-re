package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;

/* renamed from: kcm */
public final class kcm implements AllUpdatesProcessor {
    private final ajxe a;

    /* renamed from: kcm$a */
    static final class a extends akcq implements akbk<tnj> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (tnj) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(kcm.class), "prefs", "getPrefs()Lcom/snap/prefs/Preferences;");
    }

    public kcm(ajwy<tnj> ajwy) {
        akcr.b(ajwy, "prefsProvider");
        this.a = ajxh.a(new a(ajwy));
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        if (aecy.c != null) {
            ((tnj) this.a.b()).b().a((fth) kcj.IS_POPULAR_USER, aecy.c.cj).a((fth) kcj.IS_OFFICIAL_USER, aecy.c.v).a((fth) kcj.IS_OFFICIAL_COLLABORATOR, Boolean.valueOf(aecy.c.bn.isEmpty() ^ 1)).b();
        }
    }
}
