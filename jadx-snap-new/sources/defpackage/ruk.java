package defpackage;

/* renamed from: ruk */
public final class ruk implements aiqc<zkn> {
    private final ajwy<ajei> a;
    private final ajwy<zgb> b;
    private final ajwy<ftl> c;
    private final ajwy<iii> d;
    private final ajwy<absj> e;

    public static zkn a(ajei ajei, ajwy<ftl> ajwy, iii iii, absj absj) {
        return (zkn) aiqf.a(rtw.a(ajei, ajwy, iii, absj), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        ajei ajei = (ajei) ajwy.get();
        ajwy2.get();
        return ruk.a(ajei, ajwy3, (iii) ajwy4.get(), (absj) ajwy5.get());
    }
}
