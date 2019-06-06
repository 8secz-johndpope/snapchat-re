package defpackage;

import android.content.Context;
import com.snap.core.db.SnapSqlDelightDbManager;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.DbSchema;
import org.opencv.imgproc.Imgproc;

/* renamed from: hzr */
public final class hzr extends SnapSqlDelightDbManager {
    public hzr(Context context, gqr gqr, zgb zgb, ajdw ajdw, ajdw ajdw2, DbSchema dbSchema, ihh ihh, DbLogger dbLogger, igb igb) {
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
        DbSchema dbSchema2 = dbSchema;
        akcr.b(dbSchema2, "schema");
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger2, "dbLogger");
        igb igb2 = igb;
        akcr.b(igb2, "noDiskExceptionDetector");
        super(context2, gqr2, dbSchema2, zgb2, ajdw3, ajdw4, null, ihh2, dbLogger2, igb2, false, (int) Imgproc.INTER_TAB_SIZE2, null);
    }

    public final ainf initSqldelight(aino aino) {
        String str = "driver";
        akcr.b(aino, str);
        akcr.b(aino, str);
        akcr.b(akde.a(hyg.class), "receiver$0");
        akcr.b(aino, str);
        return new iao(aino);
    }
}
