package defpackage;

import android.content.Context;
import com.snap.core.db.SnapSqlDelightDbManager;
import com.snap.core.db.api.DbLogger;
import com.snap.core.db.api.DbSchema;
import defpackage.wsv.a;
import org.opencv.imgproc.Imgproc;

/* renamed from: wsn */
public final class wsn extends SnapSqlDelightDbManager {
    public wsn(Context context, gqr gqr, zgb zgb, zfw zfw, ihh ihh, DbLogger dbLogger, igb igb) {
        Context context2 = context;
        akcr.b(context2, "context");
        gqr gqr2 = gqr;
        akcr.b(gqr2, "exceptionTracker");
        zgb zgb2 = zgb;
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(zfw, "qualifiedSchedulers");
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger2, "dbLogger");
        igb igb2 = igb;
        akcr.b(igb2, "noDiskExceptionDetector");
        super(context2, gqr2, (DbSchema) new wso(), zgb2, (ajdw) zfw.p(), (ajdw) zfw.i(), zfw.p().a(), ihh2, dbLogger2, igb2, false, (int) Imgproc.INTER_TAB_SIZE2, null);
    }

    public final ainf initSqldelight(aino aino) {
        String str = "driver";
        akcr.b(aino, str);
        a aVar = new a(new wst());
        akcr.b(aino, str);
        String str2 = "ShakeTicketAdapter";
        akcr.b(aVar, str2);
        akcr.b(akde.a(wqo.class), "receiver$0");
        akcr.b(aino, str);
        akcr.b(aVar, str2);
        return new wva(aino, aVar);
    }
}
