package com.snap.core.db.api;

import defpackage.abss;
import defpackage.aiqc;
import defpackage.ajwy;
import defpackage.ilv;
import defpackage.zgb;

public final class DbLogger_Factory implements aiqc<DbLogger> {
    private final ajwy<ilv> grapheneProvider;
    private final ajwy<abss> releaseManagerProvider;
    private final ajwy<zgb> schedulersProvider;

    public DbLogger_Factory(ajwy<ilv> ajwy, ajwy<abss> ajwy2, ajwy<zgb> ajwy3) {
        this.grapheneProvider = ajwy;
        this.releaseManagerProvider = ajwy2;
        this.schedulersProvider = ajwy3;
    }

    public static DbLogger_Factory create(ajwy<ilv> ajwy, ajwy<abss> ajwy2, ajwy<zgb> ajwy3) {
        return new DbLogger_Factory(ajwy, ajwy2, ajwy3);
    }

    public static DbLogger newDbLogger(ilv ilv, ajwy<abss> ajwy, zgb zgb) {
        return new DbLogger(ilv, ajwy, zgb);
    }

    public static DbLogger provideInstance(ajwy<ilv> ajwy, ajwy<abss> ajwy2, ajwy<zgb> ajwy3) {
        return new DbLogger((ilv) ajwy.get(), ajwy2, (zgb) ajwy3.get());
    }

    public final DbLogger get() {
        return provideInstance(this.grapheneProvider, this.releaseManagerProvider, this.schedulersProvider);
    }
}
