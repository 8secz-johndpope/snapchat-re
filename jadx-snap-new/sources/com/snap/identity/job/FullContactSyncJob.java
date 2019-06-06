package com.snap.identity.job;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;

@hwk(a = "IdentityFullContactSyncJob", b = String.class)
public final class FullContactSyncJob extends hwg<String> {

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

    public FullContactSyncJob(hwh hwh, String str) {
        akcr.b(hwh, "jobConfig");
        akcr.b(str, StorySyncStateModel.METADATA);
        super(hwh, "NOT_USE_META");
    }
}
