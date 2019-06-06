package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: grh */
public final class grh implements aiqc<AtomicLong> {
    static {
        grh grh = new grh();
    }

    public static AtomicLong a() {
        return (AtomicLong) aiqf.a(new AtomicLong(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return grh.a();
    }
}
