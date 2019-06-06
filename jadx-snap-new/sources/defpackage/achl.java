package defpackage;

/* renamed from: achl */
final class achl extends achz {
    private final achr a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    /* renamed from: achl$a */
    public static final class a extends defpackage.achz.a {
        private achr a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        public final defpackage.achz.a a(achr achr) {
            if (achr != null) {
                this.a = achr;
                return this;
            }
            throw new NullPointerException("Null inputGesture");
        }

        public final defpackage.achz.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final achz a() {
            StringBuilder stringBuilder;
            String str = "";
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" inputGesture");
                str = stringBuilder.toString();
            }
            if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" shouldAnimate");
                str = stringBuilder.toString();
            }
            if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" firstInputGesture");
                str = stringBuilder.toString();
            }
            if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" lastInputGesture");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new achl(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        public final defpackage.achz.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.achz.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    private achl(achr achr, boolean z, boolean z2, boolean z3) {
        this.a = achr;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    /* synthetic */ achl(achr achr, boolean z, boolean z2, boolean z3, byte b) {
        this(achr, z, z2, z3);
    }

    public final achr a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof achz) {
            achz achz = (achz) obj;
            return this.a.equals(achz.a()) && this.b == achz.b() && this.c == achz.c() && this.d == achz.d();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProgrammaticInputGesture{inputGesture=");
        stringBuilder.append(this.a);
        stringBuilder.append(", shouldAnimate=");
        stringBuilder.append(this.b);
        stringBuilder.append(", firstInputGesture=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lastInputGesture=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
