package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.SqlDelightDbManager;

/* renamed from: vkn */
public final class vkn implements aiqc<SqlDelightDbManager> {
    private final ajwy<Context> a;
    private final ajwy<gqr> b;
    private final ajwy<odl> c;
    private final ajwy<zgb> d;
    private final ajwy<ihh> e;
    private final ajwy<DbLogger> f;
    private final ajwy<igb> g;

    public static SqlDelightDbManager a(Context context, gqr gqr, odl odl, zgb zgb, ihh ihh, DbLogger dbLogger, igb igb) {
        return (SqlDelightDbManager) aiqf.a(vkl.a(context, gqr, odl, zgb, ihh, dbLogger, igb), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vkn.a((Context) this.a.get(), (gqr) this.b.get(), (odl) this.c.get(), (zgb) this.d.get(), (ihh) this.e.get(), (DbLogger) this.f.get(), (igb) this.g.get());
    }
}
