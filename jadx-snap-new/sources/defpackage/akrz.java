package defpackage;

import org.joda.convert.ToString;

/* renamed from: akrz */
public final class akrz extends aksl {
    public static final akrz a = new akrz(0);
    private static akrz b = new akrz(1);
    private static akrz c = new akrz(2);
    private static akrz d = new akrz(3);
    private static akrz e = new akrz(Integer.MAX_VALUE);
    private static akrz f = new akrz(Integer.MIN_VALUE);

    static {
        akuf.a().a(akrr.f());
    }

    private akrz(int i) {
        super(i);
    }

    public static akrz a(akrw akrw, akrw akrw2) {
        int a = aksl.a(akrw, akrw2, akrg.k);
        return a != Integer.MIN_VALUE ? a != Integer.MAX_VALUE ? a != 0 ? a != 1 ? a != 2 ? a != 3 ? new akrz(a) : d : c : b : a : e : f;
    }

    public final akrg a() {
        return akrg.k;
    }

    public final boolean a(akrz akrz) {
        return akrz == null ? this.p < 0 : this.p < akrz.p;
    }

    public final akrr b() {
        return akrr.f();
    }

    public final int c() {
        return this.p;
    }

    @ToString
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PT");
        stringBuilder.append(String.valueOf(this.p));
        stringBuilder.append("S");
        return stringBuilder.toString();
    }
}
