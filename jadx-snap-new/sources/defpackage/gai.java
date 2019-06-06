package defpackage;

import defpackage.akgx.a;

/* renamed from: gai */
public final class gai implements aiqc<gde> {
    private final ajwy<gcw> a;
    private final ajwy<a> b;
    private final ajwy<iha> c;
    private final ajwy<gdd> d;
    private final ajwy<gjw> e;

    public static gde a(ajwy<gcw> ajwy, a aVar, ajwy<iha> ajwy2, gdd gdd, gjw gjw) {
        return (gde) aiqf.a(new gde(ajwy, aVar, ajwy2, gdd, gjw), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return gai.a(ajwy, (a) ajwy2.get(), this.c, (gdd) this.d.get(), (gjw) this.e.get());
    }
}
