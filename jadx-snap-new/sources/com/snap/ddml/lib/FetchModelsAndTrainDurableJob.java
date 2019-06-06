package com.snap.ddml.lib;

import com.snap.core.db.record.StorySyncStateModel;
import defpackage.akcr;
import defpackage.guw;
import defpackage.gux;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwk;

@hwk(a = "DDML_FETCH_TRAIN", b = gux.class)
public final class FetchModelsAndTrainDurableJob extends hwg<gux> {

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

    public FetchModelsAndTrainDurableJob(gux gux) {
        akcr.b(gux, StorySyncStateModel.METADATA);
        this(guw.a, gux);
    }

    public FetchModelsAndTrainDurableJob(hwh hwh, gux gux) {
        akcr.b(hwh, "jobConfig");
        akcr.b(gux, StorySyncStateModel.METADATA);
        super(hwh, gux);
    }
}
