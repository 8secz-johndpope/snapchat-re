package defpackage;

import com.snap.core.db.api.SqlDelightDbManager;
import java.io.File;

/* renamed from: yen */
public final class yen implements yex {
    private final ajxe a = ajxh.a(a.a);
    private final SqlDelightDbManager b;
    private final zgb c;

    /* renamed from: yen$a */
    static final class a extends akcs implements akbk<yem> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new yem();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(yen.class), "context", "getContext()Lcom/snap/storage/cache/DbJournalContext;");
    }

    public yen(SqlDelightDbManager sqlDelightDbManager, zgb zgb) {
        akcr.b(sqlDelightDbManager, "dbManager");
        akcr.b(zgb, "schedulersProvider");
        this.b = sqlDelightDbManager;
        this.c = zgb;
    }

    public final yew a(File file, int i, ihh ihh) {
        akcr.b(file, "directory");
        akcr.b(ihh, "clock");
        return new yek(file, (yem) this.a.b(), this.c, this.b, ihh, (byte) 0);
    }
}
