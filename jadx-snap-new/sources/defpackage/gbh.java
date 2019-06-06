package defpackage;

import android.content.Context;
import android.os.Looper;
import com.snap.core.db.SnapSqlDelightDbManager;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.column.SqlDelightIntegerEnumColumnAdapter;
import defpackage.gbm.a;
import org.opencv.imgproc.Imgproc;

/* renamed from: gbh */
public final class gbh extends SnapSqlDelightDbManager {
    public gbh(Context context, gqr gqr, zgb zgb, ajdw ajdw, ajdw ajdw2, hws hws, Looper looper, ihh ihh, DbLogger dbLogger, igb igb) {
        hws hws2 = hws;
        Context context2 = context;
        akcr.b(context2, "context");
        gqr gqr2 = gqr;
        akcr.b(gqr2, "exceptionTracker");
        zgb zgb2 = zgb;
        akcr.b(zgb2, "schedulersProvider");
        ajdw ajdw3 = ajdw;
        akcr.b(ajdw3, "writeScheduler");
        ajdw ajdw4 = ajdw2;
        akcr.b(ajdw4, "defaultQueryScheduler");
        akcr.b(hws2, "durableJobScheduler");
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger2, "dbLogger");
        igb igb2 = igb;
        akcr.b(igb2, "noDiskExceptionDetector");
        super(context2, gqr2, (DbSchema) new gbi(hws2), zgb2, ajdw3, ajdw4, looper, ihh2, dbLogger2, igb2, false, (int) Imgproc.INTER_TAB_SIZE2, null);
    }

    public final ainf initSqldelight(aino aino) {
        String str = "driver";
        akcr.b(aino, str);
        a aVar = new a(new SqlDelightIntegerEnumColumnAdapter(hwt.class), new SqlDelightIntegerEnumColumnAdapter(hwp.class));
        akcr.b(aino, str);
        String str2 = "DurableJobAdapter";
        akcr.b(aVar, str2);
        akcr.b(akde.a(gaz.class), "receiver$0");
        akcr.b(aino, str);
        akcr.b(aVar, str2);
        return new gbo(aino, aVar);
    }
}
