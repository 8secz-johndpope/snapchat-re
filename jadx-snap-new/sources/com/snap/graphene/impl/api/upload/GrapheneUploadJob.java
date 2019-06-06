package com.snap.graphene.impl.api.upload;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;

@hwk(a = "GrapheneUploadJob", b = String.class)
public final class GrapheneUploadJob extends hwg<String> {
    public final String a;

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

    public GrapheneUploadJob(hwh hwh, String str) {
        akcr.b(hwh, "jobConfig");
        akcr.b(str, StorySyncStateModel.METADATA);
        super(hwh, str);
        this.a = str;
    }
}
