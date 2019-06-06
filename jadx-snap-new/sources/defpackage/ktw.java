package defpackage;

import defpackage.ksw.af;
import defpackage.ksw.ag;

/* renamed from: ktw */
public final class ktw implements aiqc<mio> {
    private final ajwy<absi> a;
    private final ajwy<iib> b;
    private final ajwy<zgb> c;

    public static mio a(ajwy<absi> ajwy, ajwy<iib> ajwy2, zgb zgb) {
        akcr.b(ajwy, "softNavBarDetector");
        akcr.b(ajwy2, "screenParameterProvider");
        akcr.b(zgb, "schedulersProvider");
        return (mio) aiqf.a(new kxo(new af(ajwy), new ag(ajwy2), zgb.a(kus.b, "DefaultSystemUiElementsPositionProvider")), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ktw.a(this.a, this.b, (zgb) this.c.get());
    }
}
