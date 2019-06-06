package com.snap.spectacles.lib.main.durablejob;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.ajym;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwi;
import defpackage.hwk;
import defpackage.hwq;
import defpackage.xow;
import java.util.concurrent.TimeUnit;

@hwk(a = "spectacles-ota-job", b = xow.class)
public final class SpectaclesPassiveFirmwareUpdateDurableJob extends hwg<xow> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static SpectaclesPassiveFirmwareUpdateDurableJob a(long j) {
            return new SpectaclesPassiveFirmwareUpdateDurableJob(new hwh(0, ajym.b((Object[]) new Integer[]{Integer.valueOf(2), Integer.valueOf(8), Integer.valueOf(16), Integer.valueOf(32)}), hwi.REPLACE, null, new hwq(TimeUnit.HOURS.toSeconds(j), TimeUnit.SECONDS), false, false, true, null, null, 873), new xow());
        }
    }

    static {
        a aVar = new a();
    }

    public SpectaclesPassiveFirmwareUpdateDurableJob(hwh hwh, xow xow) {
        akcr.b(hwh, "jobConfig");
        akcr.b(xow, StorySyncStateModel.METADATA);
        super(hwh, xow);
    }
}
