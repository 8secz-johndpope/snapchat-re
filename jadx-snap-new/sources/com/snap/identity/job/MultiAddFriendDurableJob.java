package com.snap.identity.job;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.ixw;
import defpackage.ixx;

@hwk(a = "MULTI_ADD_FRIEND_JOB", b = ixw.class)
public final class MultiAddFriendDurableJob extends hwg<ixw> {

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

    public MultiAddFriendDurableJob(hwh hwh, ixw ixw) {
        akcr.b(hwh, "jobConfig");
        akcr.b(ixw, StorySyncStateModel.METADATA);
        super(hwh, ixw);
    }

    public MultiAddFriendDurableJob(ixw ixw) {
        akcr.b(ixw, StorySyncStateModel.METADATA);
        this(ixx.a, ixw);
    }
}
