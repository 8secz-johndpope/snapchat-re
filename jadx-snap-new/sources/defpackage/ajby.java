package defpackage;

/* renamed from: ajby */
final class ajby extends ajcd {
    private final boolean a;
    private final ajck b;

    /* renamed from: ajby$a */
    static final class a extends defpackage.ajcd.a {
        private Boolean a;
        private ajck b;

        a() {
        }

        public final defpackage.ajcd.a a(ajck ajck) {
            this.b = ajck;
            return this;
        }

        public final defpackage.ajcd.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final ajcd a() {
            String str = "";
            if (this.a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" sampleToLocalSpanStore");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new ajby(this.a.booleanValue(), this.b, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }

    private ajby(boolean z, ajck ajck) {
        this.a = z;
        this.b = ajck;
    }

    /* synthetic */ ajby(boolean z, ajck ajck, byte b) {
        this(z, ajck);
    }

    public final boolean a() {
        return this.a;
    }

    public final ajck b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajcd) {
            ajcd ajcd = (ajcd) obj;
            if (this.a == ajcd.a()) {
                ajck ajck = this.b;
                return ajck != null ? !ajck.equals(ajcd.b()) : ajcd.b() != null;
            }
        }
    }

    public final int hashCode() {
        int i = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        ajck ajck = this.b;
        return i ^ (ajck == null ? 0 : ajck.hashCode());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EndSpanOptions{sampleToLocalSpanStore=");
        stringBuilder.append(this.a);
        stringBuilder.append(", status=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
