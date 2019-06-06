package defpackage;

/* renamed from: apw */
public final class apw {
    public static final apw c = new apw(a.None, 0);
    public static final apw d = new apw(a.XMidYMid, 1);
    a a;
    int b;

    /* renamed from: apw$a */
    public enum a {
        None,
        XMinYMin,
        XMidYMin,
        XMaxYMin,
        XMinYMid,
        XMidYMid,
        XMaxYMid,
        XMinYMax,
        XMidYMax,
        XMaxYMax
    }

    static {
        apw apw = new apw(null, 0);
        apw = new apw(a.XMinYMin, 1);
        apw = new apw(a.XMaxYMax, 1);
        apw = new apw(a.XMidYMin, 1);
        apw = new apw(a.XMidYMax, 1);
        apw = new apw(a.XMidYMid, 2);
        apw = new apw(a.XMinYMin, 2);
    }

    public apw(a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        apw apw = (apw) obj;
        return this.a == apw.a && this.b == apw.b;
    }
}
