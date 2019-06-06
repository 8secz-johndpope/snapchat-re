package com.snap.identity.job;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.iyc;
import defpackage.iyd;

@hwk(a = "UPDATE_SEEN_ADDED_ME_DURABLE_JOB", b = iyc.class)
public final class UpdateSeenAddedMeDurableJob extends hwg<iyc> {

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

    public UpdateSeenAddedMeDurableJob(hwh hwh, iyc iyc) {
        akcr.b(hwh, "jobConfig");
        akcr.b(iyc, StorySyncStateModel.METADATA);
        super(hwh, iyc);
    }

    public UpdateSeenAddedMeDurableJob(iyc iyc) {
        akcr.b(iyc, StorySyncStateModel.METADATA);
        this(iyd.a, iyc);
    }
}
