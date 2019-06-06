package defpackage;

import defpackage.mbz.a;
import defpackage.mbz.b;

/* renamed from: mcj */
public final class mcj extends a {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private b f;
    private ajdp<mci> g;
    private ajdp<mih> h;
    private ajdp<Boolean> i;

    /* renamed from: mcj$a */
    static final class a implements defpackage.mbz.a.a {
        b a;
        ajdp<mci> b;
        ajdp<mih> c;
        ajdp<Boolean> d;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final defpackage.mbz.a a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(b.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d != null) {
                return new mcj(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.mbz.a.a b(ajdp ajdp) {
            this.c = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.mbz.a.a c(ajdp ajdp) {
            this.d = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private mcj(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = aVar.a;
        this.g = aVar.b;
        this.h = aVar.c;
        this.i = aVar.d;
    }

    /* synthetic */ mcj(a aVar, byte b) {
        this(aVar);
    }

    private mcg f() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mcb.a((miw) aiqf.a(this.f.x(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mcg) obj;
    }

    private ajdu<mci.a, mci.a> g() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = mce.a(this.h, this.i);
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private mch h() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mcc.a(f(), (ajdp) aiqf.a(this.f.u(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.f.w(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mch) obj;
    }

    /* Access modifiers changed, original: final */
    public final zfw c() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    aiqf.a(this.f.s(), "Cannot return null from a non-@Nullable component method");
                    obj2 = mcd.a((ide) aiqf.a(this.f.r(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    /* Access modifiers changed, original: final */
    public final mcf d() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = mca.a(this.g, h(), g(), c());
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (mcf) obj;
    }

    /* Access modifiers changed, original: final */
    public final ajdp<lqf> e() {
        return (ajdp) aiqf.a(this.f.w(), "Cannot return null from a non-@Nullable component method");
    }
}
