package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.SqlDelightDbManager;

/* renamed from: hzi */
public final class hzi implements aiqc<SqlDelightDbManager> {
    private final ajwy<Context> a;
    private final ajwy<zgb> b;
    private final ajwy<gqr> c;
    private final ajwy<hyk> d;
    private final ajwy<hyo> e;
    private final ajwy<ihh> f;
    private final ajwy<DbLogger> g;
    private final ajwy<igb> h;

    public static SqlDelightDbManager a(Context context, zgb zgb, gqr gqr, hyk hyk, hyo hyo, ihh ihh, DbLogger dbLogger, igb igb) {
        hyk hyk2 = hyk;
        return (SqlDelightDbManager) aiqf.a(new hzr(context, gqr, zgb, zgb.a(hyn.a.callsite("FideliusDefaultDb")).p(), zgb.a(hyn.a.callsite("queries")).i(), new hzs(hyk, hyo), ihh, dbLogger, igb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hzi.a((Context) this.a.get(), (zgb) this.b.get(), (gqr) this.c.get(), (hyk) this.d.get(), (hyo) this.e.get(), (ihh) this.f.get(), (DbLogger) this.g.get(), (igb) this.h.get());
    }
}
