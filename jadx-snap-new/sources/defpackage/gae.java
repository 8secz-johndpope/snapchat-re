package defpackage;

import java.util.Comparator;

/* renamed from: gae */
public final class gae implements aiqc<ryo> {
    private final ajwy<Comparator<rzf<ryz>>> a;

    public static ryo a(Comparator<rzf<ryz>> comparator) {
        return (ryo) aiqf.a(new ryp(comparator), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return gae.a((Comparator) this.a.get());
    }
}
