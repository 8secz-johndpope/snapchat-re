package defpackage;

import defpackage.acgu.a;

/* renamed from: acgt */
final class acgt<T extends achg> extends acgu<T> {
    private final achr a;
    private final acis b;
    private final acgw c;
    private final T d;
    private final T e;
    private final boolean f;

    /* renamed from: acgt$a */
    static final class a<T extends achg> extends defpackage.acgu.a<T> {
        private achr a;
        private acis b;
        private acgw c;
        private T d;
        private T e;
        private Boolean f;

        a() {
        }

        private a(acgu<T> acgu) {
            this.a = acgu.a();
            this.b = acgu.b();
            this.c = acgu.c();
            this.d = acgu.d();
            this.e = acgu.e();
            this.f = Boolean.valueOf(acgu.f());
        }

        /* synthetic */ a(acgu acgu, byte b) {
            this(acgu);
        }

        public final defpackage.acgu.a<T> a(acgw acgw) {
            if (acgw != null) {
                this.c = acgw;
                return this;
            }
            throw new NullPointerException("Null navigationType");
        }

        public final defpackage.acgu.a<T> a(T t) {
            this.d = t;
            return this;
        }

        public final defpackage.acgu.a<T> a(achr achr) {
            this.a = achr;
            return this;
        }

        public final defpackage.acgu.a<T> a(acis acis) {
            if (acis != null) {
                this.b = acis;
                return this;
            }
            throw new NullPointerException("Null outputTransition");
        }

        public final defpackage.acgu.a<T> a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        /* Access modifiers changed, original: final */
        public final achr a() {
            return this.a;
        }

        public final defpackage.acgu.a<T> b(T t) {
            this.e = t;
            return this;
        }

        /* Access modifiers changed, original: final */
        public final acis b() {
            acis acis = this.b;
            if (acis != null) {
                return acis;
            }
            throw new IllegalStateException("Property \"outputTransition\" has not been set");
        }

        /* Access modifiers changed, original: final */
        public final acgu<T> c() {
            StringBuilder stringBuilder;
            String str = "";
            if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" outputTransition");
                str = stringBuilder.toString();
            }
            if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" navigationType");
                str = stringBuilder.toString();
            }
            if (this.f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" shouldAnimate");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new acgt(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }

    private acgt(achr achr, acis acis, acgw acgw, T t, T t2, boolean z) {
        this.a = achr;
        this.b = acis;
        this.c = acgw;
        this.d = t;
        this.e = t2;
        this.f = z;
    }

    /* synthetic */ acgt(achr achr, acis acis, acgw acgw, achg achg, achg achg2, boolean z, byte b) {
        this(achr, acis, acgw, achg, achg2, z);
    }

    public final achr a() {
        return this.a;
    }

    public final acis b() {
        return this.b;
    }

    public final acgw c() {
        return this.c;
    }

    public final T d() {
        return this.d;
    }

    public final T e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acgu) {
            acgu acgu = (acgu) obj;
            achr achr = this.a;
            if (achr != null ? !achr.equals(acgu.a()) : acgu.a() != null) {
                if (this.b.equals(acgu.b()) && this.c.equals(acgu.c())) {
                    achg achg = this.d;
                    if (achg != null ? !achg.equals(acgu.d()) : acgu.d() != null) {
                        achg = this.e;
                        if (achg != null ? !achg.equals(acgu.e()) : acgu.e() != null) {
                            if (this.f == acgu.f()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public final a<T> g() {
        return new a(this, (byte) 0);
    }

    public final int hashCode() {
        achr achr = this.a;
        int i = 0;
        int hashCode = ((((((achr == null ? 0 : achr.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        achg achg = this.d;
        hashCode = (hashCode ^ (achg == null ? 0 : achg.hashCode())) * 1000003;
        achg = this.e;
        if (achg != null) {
            i = achg.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (this.f ? 1231 : 1237);
    }
}
