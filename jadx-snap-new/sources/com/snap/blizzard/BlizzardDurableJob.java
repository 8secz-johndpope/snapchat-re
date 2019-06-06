package com.snap.blizzard;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.ajyl;
import defpackage.akcr;
import defpackage.dhy;
import defpackage.dia;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwi;
import defpackage.hwk;
import defpackage.hwq;
import java.util.concurrent.TimeUnit;

@hwk(a = "BlizzardUpload", b = dhy.class)
public final class BlizzardDurableJob extends hwg<dhy> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static BlizzardDurableJob a(dia dia, String str, long j, TimeUnit timeUnit) {
            dia dia2 = dia;
            TimeUnit timeUnit2 = timeUnit;
            akcr.b(dia2, "type");
            akcr.b(timeUnit2, "unit");
            dhy dhy = new dhy(dia2.forceUpload, str);
            return new BlizzardDurableJob(new hwh(0, ajyl.a(Integer.valueOf(1)), hwi.REPLACE, dhy.a(dia2), new hwq(j, timeUnit2), false, false, dia2.recurring, null, null, 865), dhy);
        }
    }

    static {
        a aVar = new a();
    }

    public BlizzardDurableJob(hwh hwh, dhy dhy) {
        akcr.b(hwh, "jobConfig");
        akcr.b(dhy, StorySyncStateModel.METADATA);
        super(hwh, dhy);
    }

    public static final BlizzardDurableJob a(dia dia, long j, TimeUnit timeUnit) {
        akcr.b(dia, "type");
        akcr.b(timeUnit, "unit");
        return a.a(dia, null, j, timeUnit);
    }

    public static final BlizzardDurableJob a(dia dia, String str, long j, TimeUnit timeUnit) {
        return a.a(dia, str, j, timeUnit);
    }
}
