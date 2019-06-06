package com.snap.memories.lib.sync.upload.transcoding;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.ajyl;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwi;
import defpackage.hwk;
import defpackage.pmq;

@hwk(a = "TRANSCODING_JOB", b = pmq.class)
public final class TranscodingJob extends hwg<pmq> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static TranscodingJob a(String str, long j) {
            akcr.b(str, "entryId");
            return new TranscodingJob(new hwh(5, ajyl.a(Integer.valueOf(32)), hwi.KEEP, str, null, false, false, false, null, null, 1008), new pmq(str, j));
        }
    }

    static {
        a aVar = new a();
    }

    public TranscodingJob(hwh hwh, pmq pmq) {
        akcr.b(hwh, "jobConfig");
        akcr.b(pmq, StorySyncStateModel.METADATA);
        super(hwh, pmq);
    }
}
