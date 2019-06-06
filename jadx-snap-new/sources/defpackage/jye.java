package defpackage;

/* renamed from: jye */
public final class jye implements jyo {
    private final ajwy<jwo> a;
    private final ajwy<jzd> b;
    private final ajwy<kac> c;

    public jye(ajwy<jwo> ajwy, ajwy<jzd> ajwy2, ajwy<kac> ajwy3) {
        akcr.b(ajwy, "config");
        akcr.b(ajwy2, "glide3BitmapPoolFactory");
        akcr.b(ajwy3, "glide4BitmapPoolFactory");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
    }

    public final jyn a(int i) {
        this.a.get();
        return ((jzd) this.b.get()).a(i);
    }
}
