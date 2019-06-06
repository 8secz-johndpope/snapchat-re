package com.snap.memories.lib.saving;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.pjg;
import defpackage.pjr;

@hwk(a = "MEMORIES_SAVE_JOB", b = pjr.class)
public final class SaveJob extends hwg<pjr> {

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

    public SaveJob(hwh hwh, pjr pjr) {
        akcr.b(hwh, "jobConfig");
        akcr.b(pjr, StorySyncStateModel.METADATA);
        super(hwh, pjr);
    }

    public SaveJob(pjr pjr) {
        akcr.b(pjr, StorySyncStateModel.METADATA);
        this(pjg.a, pjr);
    }
}
