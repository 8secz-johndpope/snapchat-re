package com.snap.ads.core.lib.adtrack.retro;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.cok;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;

@hwk(a = "RetroRetryJob", b = cok.class)
public final class RetroRetryJob extends hwg<cok> {

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

    public RetroRetryJob(hwh hwh, cok cok) {
        akcr.b(hwh, "jobConfig");
        akcr.b(cok, StorySyncStateModel.METADATA);
        super(hwh, cok);
    }
}
