package com.snap.fidelius.impl;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;
import defpackage.iat;
import defpackage.iau;

@hwk(a = "FIDELIUS_FETCH_UPDATES", b = iau.class)
public final class FetchFideliusUpdatesDurableJob extends hwg<iau> {

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

    public FetchFideliusUpdatesDurableJob(hwh hwh, iau iau) {
        akcr.b(hwh, "jobConfig");
        akcr.b(iau, StorySyncStateModel.METADATA);
        super(hwh, iau);
    }

    public FetchFideliusUpdatesDurableJob(iau iau) {
        akcr.b(iau, StorySyncStateModel.METADATA);
        this(iat.a, iau);
    }
}
