package defpackage;

/* renamed from: bn */
public final class bn {
    public bu a = new bu(this);
    final bo b;
    final a c;
    public bn d;
    public int e = 0;
    int f = 1;
    int g = 0;
    public bk h;
    private int i = -1;
    private int j = 1;

    /* renamed from: bn$a */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public bn(bo boVar, a aVar) {
        this.b = boVar;
        this.c = aVar;
    }

    private boolean a(bn bnVar) {
        if (bnVar == null) {
            return false;
        }
        a aVar = bnVar.c;
        a aVar2 = this.c;
        if (aVar == aVar2) {
            return aVar2 != a.BASELINE || (bnVar.b.t() && this.b.t());
        } else {
            boolean z;
            switch (this.c) {
                case CENTER:
                    return (aVar == a.BASELINE || aVar == a.CENTER_X || aVar == a.CENTER_Y) ? false : true;
                case LEFT:
                case RIGHT:
                    z = aVar == a.LEFT || aVar == a.RIGHT;
                    if (bnVar.b instanceof bq) {
                        z = z || aVar == a.CENTER_X;
                    }
                    return z;
                case TOP:
                case BOTTOM:
                    z = aVar == a.TOP || aVar == a.BOTTOM;
                    if (bnVar.b instanceof bq) {
                        z = z || aVar == a.CENTER_Y;
                    }
                    return z;
                case BASELINE:
                case CENTER_X:
                case CENTER_Y:
                case NONE:
                    return false;
                default:
                    throw new AssertionError(this.c.name());
            }
        }
    }

    public final void a() {
        bk bkVar = this.h;
        if (bkVar == null) {
            this.h = new bk(1);
        } else {
            bkVar.a();
        }
    }

    public final boolean a(bn bnVar, int i, int i2, int i3, int i4, boolean z) {
        if (bnVar == null) {
            this.d = null;
            this.e = 0;
            this.i = -1;
            this.f = 1;
            this.g = 2;
            return true;
        } else if (!z && !a(bnVar)) {
            return false;
        } else {
            this.d = bnVar;
            if (i > 0) {
                this.e = i;
            } else {
                this.e = 0;
            }
            this.i = i2;
            this.f = i3;
            this.g = i4;
            return true;
        }
    }

    public final int b() {
        if (this.b.O == 8) {
            return 0;
        }
        if (this.i >= 0) {
            bn bnVar = this.d;
            if (bnVar != null && bnVar.b.O == 8) {
                return this.i;
            }
        }
        return this.e;
    }

    public final void c() {
        this.d = null;
        this.e = 0;
        this.i = -1;
        this.f = 2;
        this.g = 0;
        this.j = 1;
        this.a.b();
    }

    public final boolean d() {
        return this.d != null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.P);
        stringBuilder.append(":");
        stringBuilder.append(this.c.toString());
        return stringBuilder.toString();
    }
}
