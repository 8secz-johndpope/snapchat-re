package com.snap.core.db.api;

import android.content.Context;
import android.os.Looper;
import com.snap.core.db.SnapDbSchema;
import com.snap.core.db.SqliteDbManager;
import defpackage.ajdw;
import defpackage.akcr;
import defpackage.gqr;
import defpackage.igb;
import defpackage.ihh;
import defpackage.zgb;

public class SnapDb extends SqliteDbManager {
    public SnapDb(Context context, gqr gqr, zgb zgb, ajdw ajdw, ajdw ajdw2, Looper looper, ihh ihh, DbLogger dbLogger, igb igb) {
        Context context2 = context;
        akcr.b(context, "context");
        gqr gqr2 = gqr;
        akcr.b(gqr, "exceptionTracker");
        zgb zgb2 = zgb;
        akcr.b(zgb, "schedulersProvider");
        ajdw ajdw3 = ajdw;
        akcr.b(ajdw3, "writeScheduler");
        ajdw ajdw4 = ajdw2;
        akcr.b(ajdw4, "queryScheduler");
        ihh ihh2 = ihh;
        akcr.b(ihh2, "clock");
        DbLogger dbLogger2 = dbLogger;
        akcr.b(dbLogger2, "dbLogger");
        igb igb2 = igb;
        akcr.b(igb2, "noDiskExceptionDetector");
        super(context2, gqr2, (DbSchema) new SnapDbSchema(), zgb2, ajdw3, ajdw4, looper, ihh2, dbLogger2, igb2);
    }
}
