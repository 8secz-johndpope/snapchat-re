package com.snap.subscription.api;

import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.yuu;

@hwk(a = "SUBSCRIPTIONS_CLEANUP_JOB", b = yuu.class)
public final class SubscriptionCleanupJob extends hwg<yuu> {

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

    public SubscriptionCleanupJob(hwh hwh, yuu yuu) {
        akcr.b(hwh, "jobConfig");
        akcr.b(yuu, "subscriptionJobConfig");
        super(hwh, yuu);
    }
}
