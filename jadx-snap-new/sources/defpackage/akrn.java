package defpackage;

import org.joda.convert.ToString;

/* renamed from: akrn */
public final class akrn extends aksl {
    public static akrn a = new akrn(0);
    public static akrn b = new akrn(1);
    public static akrn c = new akrn(2);
    public static akrn d = new akrn(3);
    public static akrn e = new akrn(Integer.MAX_VALUE);
    public static akrn f = new akrn(Integer.MIN_VALUE);

    static {
        akuf.a().a(akrr.e());
    }

    public akrn(int i) {
        super(i);
    }

    public final akrg a() {
        return akrg.j;
    }

    public final akrr b() {
        return akrr.e();
    }

    public final int c() {
        return this.p;
    }

    @ToString
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PT");
        stringBuilder.append(String.valueOf(this.p));
        stringBuilder.append("M");
        return stringBuilder.toString();
    }
}
