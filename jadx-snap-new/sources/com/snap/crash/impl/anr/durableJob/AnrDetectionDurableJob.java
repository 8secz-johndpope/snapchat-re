package com.snap.crash.impl.anr.durableJob;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.gry;
import defpackage.gsa;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;

@hwk(a = "DURABLE_JOB_MANAGER_ANR_DETECTION", b = gry.class)
public final class AnrDetectionDurableJob extends hwg<gry> {

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

    public AnrDetectionDurableJob(gry gry) {
        akcr.b(gry, StorySyncStateModel.METADATA);
        this(gsa.a, gry);
    }

    public AnrDetectionDurableJob(hwh hwh, gry gry) {
        akcr.b(hwh, "jobConfig");
        akcr.b(gry, StorySyncStateModel.METADATA);
        super(gsa.a, gry);
    }
}
