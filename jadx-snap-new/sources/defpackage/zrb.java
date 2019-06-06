package defpackage;

import com.snap.core.db.column.PersistableUnlockableType;
import defpackage.zpq.a;
import defpackage.zsk.b;
import java.util.List;

/* renamed from: zrb */
public final class zrb implements zpp {
    private final a a;

    public zrb(a aVar) {
        akcr.b(aVar, "core");
        this.a = aVar;
    }

    public final ajcx a(PersistableUnlockableType persistableUnlockableType, idd idd) {
        akcr.b(persistableUnlockableType, "type");
        akcr.b(idd, "callsite");
        return this.a.a(persistableUnlockableType, idd);
    }

    public final ajcx a(zsv.a aVar) {
        akcr.b(aVar, "query");
        return this.a.a(aVar);
    }

    public final ajdj<b> a(zst.b bVar, idd idd) {
        akcr.b(bVar, "request");
        akcr.b(idd, "callsite");
        return this.a.a(bVar, idd);
    }

    public final ajdp<List<zsm>> a(zss zss, idd idd) {
        akcr.b(zss, "query");
        akcr.b(idd, "callsite");
        return this.a.a(zss, idd);
    }
}
