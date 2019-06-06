package defpackage;

import defpackage.ajce.b;

/* renamed from: ajbz */
final class ajbz extends ajce {
    private final b a;
    private final long b;
    private final long c;
    private final long d;

    /* renamed from: ajbz$a */
    static final class a extends defpackage.ajce.a {
        private b a;
        private Long b;
        private Long c;
        private Long d;

        a() {
        }

        /* Access modifiers changed, original: final */
        public final defpackage.ajce.a a(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        /* Access modifiers changed, original: final */
        public final defpackage.ajce.a a(b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final ajce a() {
            StringBuilder stringBuilder;
            String str = "";
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" type");
                str = stringBuilder.toString();
            }
            if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" messageId");
                str = stringBuilder.toString();
            }
            if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" uncompressedMessageSize");
                str = stringBuilder.toString();
            }
            if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" compressedMessageSize");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new ajbz(this.a, this.b.longValue(), this.c.longValue(), this.d.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        public final defpackage.ajce.a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        public final defpackage.ajce.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }
    }

    private ajbz(b bVar, long j, long j2, long j3) {
        this.a = bVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    /* synthetic */ ajbz(b bVar, long j, long j2, long j3, byte b) {
        this(bVar, j, j2, j3);
    }

    public final b a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajce) {
            ajce ajce = (ajce) obj;
            return this.a.equals(ajce.a()) && this.b == ajce.b() && this.c == ajce.c() && this.d == ajce.d();
        }
    }

    public final int hashCode() {
        long hashCode = (long) ((this.a.hashCode() ^ 1000003) * 1000003);
        long j = this.b;
        hashCode = (long) (((int) (hashCode ^ (j ^ (j >>> 32)))) * 1000003);
        j = this.c;
        long j2 = (long) (((int) (hashCode ^ (j ^ (j >>> 32)))) * 1000003);
        long j3 = this.d;
        return (int) (j2 ^ (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MessageEvent{type=");
        stringBuilder.append(this.a);
        stringBuilder.append(", messageId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", uncompressedMessageSize=");
        stringBuilder.append(this.c);
        stringBuilder.append(", compressedMessageSize=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
