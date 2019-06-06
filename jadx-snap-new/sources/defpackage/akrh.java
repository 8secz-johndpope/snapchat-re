package defpackage;

import org.joda.convert.ToString;

/* renamed from: akrh */
public final class akrh extends aksl {
    public static akrh a = new akrh(0);
    public static akrh b = new akrh(1);
    public static akrh c = new akrh(2);
    public static akrh d = new akrh(3);
    public static akrh e = new akrh(4);
    public static akrh f = new akrh(5);
    public static akrh g = new akrh(6);
    public static akrh h = new akrh(7);
    public static akrh i = new akrh(8);
    public static akrh j = new akrh(Integer.MAX_VALUE);
    public static akrh k = new akrh(Integer.MIN_VALUE);

    static {
        akuf.a().a(akrr.d());
    }

    public akrh(int i) {
        super(i);
    }

    public final akrg a() {
        return akrg.i;
    }

    public final akrr b() {
        return akrr.d();
    }

    public final int c() {
        return this.p;
    }

    @ToString
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PT");
        stringBuilder.append(String.valueOf(this.p));
        stringBuilder.append("H");
        return stringBuilder.toString();
    }
}
