package defpackage;

import com.google.common.base.Optional;

/* renamed from: ifn */
public final class ifn<T> implements ajfb<iff<T>> {
    private final ajfb<iff<T>> a;
    private final Optional<ifk> b;
    private final ajwy<abnm> c;

    public ifn(ajfb<iff<T>> ajfb, Optional<ifk> optional, ajwy<abnm> ajwy) {
        akcr.b(ajfb, "delegate");
        akcr.b(optional, "exceptionTracker");
        akcr.b(ajwy, "crasher");
        this.a = ajfb;
        this.b = optional;
        this.c = ajwy;
    }

    public final /* synthetic */ void accept(Object obj) {
        try {
            this.a.accept((iff) obj);
        } catch (Throwable th) {
            ifd.a(th, this.b);
            this.c.get();
            abnm.a("Error happens in the NetEventBus: ".concat(String.valueOf(th)));
        }
    }
}
