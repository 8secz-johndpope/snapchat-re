package com.snap.messaging.job;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.rep;
import defpackage.req;

@hwk(a = "UPDATE_SNAP_VIEWED", b = req.class)
public final class UpdateSnapDurableJob extends hwg<req> {
    public UpdateSnapDurableJob(hwh hwh, req req) {
        akcr.b(hwh, "jobConfig");
        akcr.b(req, StorySyncStateModel.METADATA);
        super(hwh, req);
    }

    public UpdateSnapDurableJob(req req) {
        akcr.b(req, StorySyncStateModel.METADATA);
        this(rep.a, req);
    }
}
