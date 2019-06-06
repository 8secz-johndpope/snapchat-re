package defpackage;

import defpackage.eih.e;
import defpackage.emy.b;

/* renamed from: enm */
public final class enm implements aiqc<dno> {
    private final ajwy<dpt> a;
    private final ajwy<ajwl<e>> b;
    private final ajwy<zgb> c;
    private final ajwy<ajdv<Boolean>> d;
    private final ajwy<ajdp<?>> e;

    public static dno a(ajwy<dpt> ajwy, ajwl<e> ajwl, ajdv<Boolean> ajdv, ajdp<?> ajdp) {
        return (dno) aiqf.a(b.a((ajwy) ajwy, (ajwl) ajwl, (ajdv) ajdv, (ajdp) ajdp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajwl ajwl = (ajwl) ajwy2.get();
        ajwy3.get();
        return enm.a(ajwy, ajwl, (ajdv) ajwy4.get(), (ajdp) ajwy5.get());
    }
}
