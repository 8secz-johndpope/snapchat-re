package defpackage;

import java.io.Serializable;

/* renamed from: akrg */
public abstract class akrg implements Serializable {
    public static final akrg a = new a("eras", (byte) 1);
    public static final akrg b = new a("centuries", (byte) 2);
    public static final akrg c = new a("weekyears", (byte) 3);
    public static final akrg d = new a("years", (byte) 4);
    public static final akrg e = new a("months", (byte) 5);
    public static final akrg f = new a("weeks", (byte) 6);
    public static final akrg g = new a("days", (byte) 7);
    public static final akrg h = new a("halfdays", (byte) 8);
    public static final akrg i = new a("hours", (byte) 9);
    public static final akrg j = new a("minutes", (byte) 10);
    public static final akrg k = new a("seconds", (byte) 11);
    public static final akrg l = new a("millis", (byte) 12);
    public final String m;

    /* renamed from: akrg$a */
    static class a extends akrg {
        private final byte n;

        a(String str, byte b) {
            super(str);
            this.n = b;
        }

        public final akrf a(akqx akqx) {
            akqx = akrb.a(akqx);
            switch (this.n) {
                case (byte) 1:
                    return akqx.J();
                case (byte) 2:
                    return akqx.H();
                case (byte) 3:
                    return akqx.y();
                case (byte) 4:
                    return akqx.D();
                case (byte) 5:
                    return akqx.B();
                case (byte) 6:
                    return akqx.w();
                case (byte) 7:
                    return akqx.s();
                case (byte) 8:
                    return akqx.o();
                case (byte) 9:
                    return akqx.l();
                case (byte) 10:
                    return akqx.i();
                case (byte) 11:
                    return akqx.f();
                case (byte) 12:
                    return akqx.c();
                default:
                    throw new InternalError();
            }
        }

        public final boolean equals(Object obj) {
            return this == obj ? true : (obj instanceof a) && this.n == ((a) obj).n;
        }

        public final int hashCode() {
            return 1 << this.n;
        }
    }

    protected akrg(String str) {
        this.m = str;
    }

    public abstract akrf a(akqx akqx);

    public String toString() {
        return this.m;
    }
}
