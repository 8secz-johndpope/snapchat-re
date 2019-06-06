package com.snap.core.persistence;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.gmr;
import defpackage.gmu;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;

@hwk(a = "DISK_USAGE_REPORT", b = gmu.class)
public final class DiskUsageReportDurableJob extends hwg<gmu> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public DiskUsageReportDurableJob(gmu gmu) {
        akcr.b(gmu, StorySyncStateModel.METADATA);
        this(gmr.a, gmu);
    }

    public DiskUsageReportDurableJob(hwh hwh, gmu gmu) {
        akcr.b(hwh, "jobConfig");
        akcr.b(gmu, StorySyncStateModel.METADATA);
        super(hwh, gmu);
    }
}
