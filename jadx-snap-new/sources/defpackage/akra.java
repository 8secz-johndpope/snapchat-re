package defpackage;

import java.io.Serializable;

/* renamed from: akra */
public abstract class akra implements Serializable {
    public static final akra a = new a("era", (byte) 1, akrg.a, null);
    public static final akra b = new a("yearOfEra", (byte) 2, akrg.d, akrg.a);
    public static final akra c = new a("centuryOfEra", (byte) 3, akrg.b, akrg.a);
    public static final akra d = new a("yearOfCentury", (byte) 4, akrg.d, akrg.b);
    public static final akra e = new a("year", (byte) 5, akrg.d, null);
    public static final akra f = new a("dayOfYear", (byte) 6, akrg.g, akrg.d);
    public static final akra g = new a("monthOfYear", (byte) 7, akrg.e, akrg.d);
    public static final akra h = new a("dayOfMonth", (byte) 8, akrg.g, akrg.e);
    public static final akra i = new a("weekyearOfCentury", (byte) 9, akrg.c, akrg.b);
    public static final akra j = new a("weekyear", (byte) 10, akrg.c, null);
    public static final akra k = new a("weekOfWeekyear", (byte) 11, akrg.f, akrg.c);
    public static final akra l = new a("dayOfWeek", (byte) 12, akrg.g, akrg.f);
    public static final akra m = new a("halfdayOfDay", (byte) 13, akrg.h, akrg.g);
    public static final akra n = new a("hourOfHalfday", (byte) 14, akrg.i, akrg.h);
    public static final akra o = new a("clockhourOfHalfday", (byte) 15, akrg.i, akrg.h);
    public static final akra p = new a("clockhourOfDay", (byte) 16, akrg.i, akrg.g);
    public static final akra q = new a("hourOfDay", (byte) 17, akrg.i, akrg.g);
    public static final akra r = new a("minuteOfDay", (byte) 18, akrg.j, akrg.g);
    public static final akra s = new a("minuteOfHour", (byte) 19, akrg.j, akrg.i);
    public static final akra t = new a("secondOfDay", (byte) 20, akrg.k, akrg.g);
    public static final akra u = new a("secondOfMinute", (byte) 21, akrg.k, akrg.j);
    public static final akra v = new a("millisOfDay", (byte) 22, akrg.l, akrg.g);
    public static final akra w = new a("millisOfSecond", (byte) 23, akrg.l, akrg.k);
    public final String x;

    /* renamed from: akra$a */
    static class a extends akra {
        private final transient akrg A;
        private final byte y;
        private final transient akrg z;

        a(String str, byte b, akrg akrg, akrg akrg2) {
            super(str);
            this.y = b;
            this.z = akrg;
            this.A = akrg2;
        }

        public final akqz a(akqx akqx) {
            akqx = akrb.a(akqx);
            switch (this.y) {
                case (byte) 1:
                    return akqx.K();
                case (byte) 2:
                    return akqx.F();
                case (byte) 3:
                    return akqx.I();
                case (byte) 4:
                    return akqx.G();
                case (byte) 5:
                    return akqx.E();
                case (byte) 6:
                    return akqx.v();
                case (byte) 7:
                    return akqx.C();
                case (byte) 8:
                    return akqx.u();
                case (byte) 9:
                    return akqx.A();
                case (byte) 10:
                    return akqx.z();
                case (byte) 11:
                    return akqx.x();
                case (byte) 12:
                    return akqx.t();
                case (byte) 13:
                    return akqx.r();
                case (byte) 14:
                    return akqx.p();
                case (byte) 15:
                    return akqx.q();
                case (byte) 16:
                    return akqx.n();
                case (byte) 17:
                    return akqx.m();
                case (byte) 18:
                    return akqx.k();
                case (byte) 19:
                    return akqx.j();
                case (byte) 20:
                    return akqx.h();
                case (byte) 21:
                    return akqx.g();
                case (byte) 22:
                    return akqx.e();
                case (byte) 23:
                    return akqx.d();
                default:
                    throw new InternalError();
            }
        }

        public final akrg a() {
            return this.z;
        }

        public final boolean equals(Object obj) {
            return this == obj ? true : (obj instanceof a) && this.y == ((a) obj).y;
        }

        public final int hashCode() {
            return 1 << this.y;
        }
    }

    protected akra(String str) {
        this.x = str;
    }

    public abstract akqz a(akqx akqx);

    public abstract akrg a();

    public String toString() {
        return this.x;
    }
}
