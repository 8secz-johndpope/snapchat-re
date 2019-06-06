package com.snap.circumstanceengine.lib;

import defpackage.akcr;
import defpackage.ewv;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;

@hwk(a = "CircumstanceEngineSyncJob", b = boolean.class)
public final class ConfigSyncJob extends hwg<Boolean> {
    private final boolean a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static ConfigSyncJob a(boolean z) {
            return new ConfigSyncJob(ewv.a, z);
        }
    }

    static {
        a aVar = new a();
    }

    public ConfigSyncJob(hwh hwh, boolean z) {
        akcr.b(hwh, "jobConfig");
        super(hwh, Boolean.valueOf(z));
        this.a = z;
    }
}
