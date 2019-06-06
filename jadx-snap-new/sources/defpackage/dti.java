package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dti */
public final class dti implements aiqc<AtomicBoolean> {
    public static AtomicBoolean a() {
        return (AtomicBoolean) aiqf.a(new AtomicBoolean(true), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dti.a();
    }
}
