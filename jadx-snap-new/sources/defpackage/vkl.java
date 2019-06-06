package defpackage;

import android.content.Context;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.SqlDelightDbManager;

/* renamed from: vkl */
public abstract class vkl {
    static SqlDelightDbManager a(Context context, gqr gqr, odl odl, zgb zgb, ihh ihh, DbLogger dbLogger, igb igb) {
        odl odl2 = odl;
        zfw a = zgb.a(odl.callsite("MediaPackageDb"));
        return new ohe(context, gqr, zgb, a.p(), zgb.a(odl.callsite("query")).i(), a.p().a(), ihh, dbLogger, igb);
    }

    static odu a(Context context, ygi ygi, ohr ohr, aipn<iha> aipn, aipn<oec> aipn2, aipn<ohj> aipn3, odl odl) {
        zfy zfy = new zfy("media");
        return new ogw(context, ygi, ohr, aipn, aipn2, zfy.a(odl.callsite("MediaPackageManager")).f(), aipn3);
    }
}
