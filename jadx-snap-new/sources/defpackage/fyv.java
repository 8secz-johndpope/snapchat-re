package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.SqlDelightDbManager;

/* renamed from: fyv */
public final class fyv implements aiqc<SqlDelightDbManager> {
    private final ajwy<Context> a;
    private final ajwy<gqr> b;
    private final ajwy<zgb> c;
    private final ajwy<hws> d;
    private final ajwy<ihh> e;
    private final ajwy<DbLogger> f;
    private final ajwy<igb> g;

    public static SqlDelightDbManager a(Context context, gqr gqr, zgb zgb, hws hws, ihh ihh, DbLogger dbLogger, igb igb) {
        zfw a = zgb.a(hwj.a.callsite("DurableJob"));
        return (SqlDelightDbManager) aiqf.a(new gbh(context, gqr, zgb, a.p(), a.i(), hws, a.p().a(), ihh, dbLogger, igb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fyv.a((Context) this.a.get(), (gqr) this.b.get(), (zgb) this.c.get(), (hws) this.d.get(), (ihh) this.e.get(), (DbLogger) this.f.get(), (igb) this.g.get());
    }
}
