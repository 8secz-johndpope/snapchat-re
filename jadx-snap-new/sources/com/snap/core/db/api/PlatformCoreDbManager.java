package com.snap.core.db.api;

import android.content.Context;
import android.os.Looper;
import com.snap.core.db.CoreDbSchema;
import com.snap.core.db.SnapSqlDelightDbManager;
import com.snap.core.db.column.SqlDelightDataConsumptionBlobAdapter;
import com.snap.core.db.record.DataConsumption.Adapter;
import defpackage.ainf;
import defpackage.aino;
import defpackage.ajdw;
import defpackage.akcr;
import defpackage.akde;
import defpackage.fwr;
import defpackage.fxx;
import defpackage.gqr;
import defpackage.igb;
import defpackage.ihh;
import defpackage.zgb;
import org.opencv.imgproc.Imgproc;

public final class PlatformCoreDbManager extends SnapSqlDelightDbManager {
    public PlatformCoreDbManager(Context context, gqr gqr, zgb zgb, ajdw ajdw, ajdw ajdw2, Looper looper, ihh ihh, DbLogger dbLogger, igb igb) {
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
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger2, "dbLogger");
        igb igb2 = igb;
        akcr.b(igb2, "noDiskExceptionDetector");
        super(context2, gqr2, (DbSchema) new CoreDbSchema(), zgb2, ajdw3, ajdw4, looper, ihh2, dbLogger2, igb2, false, (int) Imgproc.INTER_TAB_SIZE2, null);
    }

    public final ainf initSqldelight(aino aino) {
        String str = "driver";
        akcr.b(aino, str);
        Adapter adapter = new Adapter(new SqlDelightDataConsumptionBlobAdapter());
        akcr.b(aino, str);
        String str2 = "DataConsumptionAdapter";
        akcr.b(adapter, str2);
        akcr.b(akde.a(fwr.class), "receiver$0");
        akcr.b(aino, str);
        akcr.b(adapter, str2);
        return new fxx(aino, adapter);
    }
}
