package defpackage;

import org.joda.convert.ToString;

/* renamed from: aksb */
public final class aksb extends aksl {
    public static aksb a = new aksb(0);
    private static aksb b = new aksb(1);
    private static aksb c = new aksb(2);
    private static aksb d = new aksb(3);
    private static aksb e = new aksb(Integer.MAX_VALUE);
    private static aksb f = new aksb(Integer.MIN_VALUE);

    static {
        akuf.a().a(akrr.a());
    }

    private aksb(int i) {
        super(i);
    }

    public static aksb a(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new aksb(i) : d : c : b : a : e : f;
    }

    public final akrg a() {
        return akrg.d;
    }

    public final akrr b() {
        return akrr.a();
    }

    public final int c() {
        return this.p;
    }

    @ToString
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("P");
        stringBuilder.append(String.valueOf(this.p));
        stringBuilder.append("Y");
        return stringBuilder.toString();
    }
}
