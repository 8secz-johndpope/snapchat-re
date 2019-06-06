package com.snap.identity.job;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.ixz;
import defpackage.iya;

@hwk(a = "PERMISSION_SETTINGS_REPORT_DURABLE_JOB", b = iya.class)
public final class PermissionSettingsReporterDurableJob extends hwg<iya> {

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

    public PermissionSettingsReporterDurableJob(hwh hwh, iya iya) {
        akcr.b(hwh, "jobConfig");
        akcr.b(iya, StorySyncStateModel.METADATA);
        super(hwh, iya);
    }

    public PermissionSettingsReporterDurableJob(iya iya) {
        akcr.b(iya, StorySyncStateModel.METADATA);
        this(ixz.a, iya);
    }
}
