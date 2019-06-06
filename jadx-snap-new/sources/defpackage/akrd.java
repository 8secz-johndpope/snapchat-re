package defpackage;

import org.joda.convert.ToString;

/* renamed from: akrd */
public final class akrd extends aksl {
    public static final akrd a = new akrd(0);
    public static final akrd b = new akrd(1);
    public static final akrd c = new akrd(2);
    public static final akrd d = new akrd(7);
    private static akrd e = new akrd(3);
    private static akrd f = new akrd(4);
    private static akrd g = new akrd(5);
    private static akrd h = new akrd(6);
    private static akrd i = new akrd(Integer.MAX_VALUE);
    private static akrd j = new akrd(Integer.MIN_VALUE);

    static {
        akuf.a().a(akrr.c());
    }

    private akrd(int i) {
        super(i);
    }

    public static akrd a(int i) {
        if (i == Integer.MIN_VALUE) {
            return j;
        }
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        switch (i) {
            case 0:
                return a;
            case 1:
                return b;
            case 2:
                return c;
            case 3:
                return e;
            case 4:
                return f;
            case 5:
                return g;
            case 6:
                return h;
            case 7:
                return d;
            default:
                return new akrd(i);
        }
    }

    public static akrd a(akrw akrw, akrw akrw2) {
        return akrd.a(aksl.a(akrw, akrw2, akrg.g));
    }

    public final akrd a(akrd akrd) {
        if (akrd == null) {
            return this;
        }
        int i = akrd.p;
        if (i != Integer.MIN_VALUE) {
            i = -i;
            return i == 0 ? this : akrd.a(aktl.a(this.p, i));
        } else {
            throw new ArithmeticException("Integer.MIN_VALUE cannot be negated");
        }
    }

    public final akrg a() {
        return akrg.g;
    }

    public final akrr b() {
        return akrr.c();
    }

    public final boolean b(akrd akrd) {
        return akrd == null ? this.p < 0 : this.p < akrd.p;
    }

    public final int c() {
        return this.p;
    }

    @ToString
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("P");
        stringBuilder.append(String.valueOf(this.p));
        stringBuilder.append("D");
        return stringBuilder.toString();
    }
}
