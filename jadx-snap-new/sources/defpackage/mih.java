package defpackage;

/* renamed from: mih */
public final class mih {
    public static final mih e = new mih();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    private final int f;
    private final int g;

    /* renamed from: mih$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    private /* synthetic */ mih() {
        this(0, 0, 0, 0);
    }

    public mih(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.f = this.c - this.a;
        this.g = this.d - this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mih) {
                mih mih = (mih) obj;
                if ((this.a == mih.a ? 1 : null) != null) {
                    if ((this.b == mih.b ? 1 : null) != null) {
                        if ((this.c == mih.c ? 1 : null) != null) {
                            if ((this.d == mih.d ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Rectangle(left=");
        stringBuilder.append(this.a);
        stringBuilder.append(", top=");
        stringBuilder.append(this.b);
        stringBuilder.append(", right=");
        stringBuilder.append(this.c);
        stringBuilder.append(", bottom=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
