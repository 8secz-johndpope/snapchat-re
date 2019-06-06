package com.snap.core.db;

import defpackage.aiqc;

public final class UpdateProcessorInterceptor_Factory implements aiqc<UpdateProcessorInterceptor> {
    private static final UpdateProcessorInterceptor_Factory INSTANCE = new UpdateProcessorInterceptor_Factory();

    public static UpdateProcessorInterceptor_Factory create() {
        return INSTANCE;
    }

    public static UpdateProcessorInterceptor newUpdateProcessorInterceptor() {
        return new UpdateProcessorInterceptor();
    }

    public static UpdateProcessorInterceptor provideInstance() {
        return new UpdateProcessorInterceptor();
    }

    public final UpdateProcessorInterceptor get() {
        return provideInstance();
    }
}
