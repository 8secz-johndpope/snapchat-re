package defpackage;

import android.content.Context;
import com.snap.core.db.SnapSqlDelightDbManager;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.column.SqlDelightIntegerEnumColumnAdapter;
import defpackage.yfq.a;

/* renamed from: yfc */
public final class yfc extends SnapSqlDelightDbManager {
    public yfc(Context context, gqr gqr, zgb zgb, ihh ihh, DbLogger dbLogger, igb igb) {
        Context context2 = context;
        akcr.b(context, "context");
        gqr gqr2 = gqr;
        akcr.b(gqr, "exceptionTracker");
        zgb zgb2 = zgb;
        akcr.b(zgb2, "schedulersProvider");
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger2, "dbLogger");
        igb igb2 = igb;
        akcr.b(igb2, "noDiskExceptionDetector");
        super(context2, gqr2, (DbSchema) new yfi(), zgb2, (ajdw) yfd.a.p(), (ajdw) yfd.a.i(), yfd.a.p().a(), ihh2, dbLogger2, igb2, false);
    }

    public final ainf initSqldelight(aino aino) {
        String str = "driver";
        akcr.b(aino, str);
        a aVar = new a(new SqlDelightIntegerEnumColumnAdapter(yfk.class), new yfm());
        akcr.b(aino, str);
        String str2 = "journal_entryAdapter";
        akcr.b(aVar, str2);
        akcr.b(akde.a(yfa.class), "receiver$0");
        akcr.b(aino, str);
        akcr.b(aVar, str2);
        return new yfv(aino, aVar);
    }
}
