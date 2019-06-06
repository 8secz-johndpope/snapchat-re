package defpackage;

import defpackage.mfj.c;
import defpackage.mfu.b;

/* renamed from: mfo */
public final class mfo implements aiqc<ajdu<b, b>> {
    private final ajwy<Boolean> a;
    private final ajwy<ajdp<Boolean>> b;

    public static ajdu<b, b> a(boolean z, ajdp<Boolean> ajdp) {
        return (ajdu) aiqf.a(c.a(z, (ajdp) ajdp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mfo.a(((Boolean) this.a.get()).booleanValue(), (ajdp) this.b.get());
    }
}
