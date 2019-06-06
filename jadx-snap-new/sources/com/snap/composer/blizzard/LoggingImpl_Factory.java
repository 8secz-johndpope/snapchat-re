package com.snap.composer.blizzard;

import defpackage.aiqc;
import defpackage.ajwy;
import defpackage.dis;

public final class LoggingImpl_Factory implements aiqc<LoggingImpl> {
    private final ajwy<dis> a;

    public LoggingImpl_Factory(ajwy<dis> ajwy) {
        this.a = ajwy;
    }

    public static LoggingImpl_Factory create(ajwy<dis> ajwy) {
        return new LoggingImpl_Factory(ajwy);
    }

    public static LoggingImpl newLoggingImpl(dis dis) {
        return new LoggingImpl(dis);
    }

    public static LoggingImpl provideInstance(ajwy<dis> ajwy) {
        return new LoggingImpl((dis) ajwy.get());
    }

    public final LoggingImpl get() {
        return provideInstance(this.a);
    }
}
