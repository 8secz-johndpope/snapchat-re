package defpackage;

import defpackage.lzy.a;
import defpackage.lzy.c;

/* renamed from: lzr */
public final class lzr extends a {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private ajdp<maf> e;
    private c f;

    /* renamed from: lzr$a */
    static final class a implements defpackage.lzy.a.a {
        c a;
        ajdp<maf> b;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final defpackage.lzy.a a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b != null) {
                return new lzr(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lzr(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.b;
        this.f = aVar.a;
    }

    /* synthetic */ lzr(a aVar, byte b) {
        this(aVar);
    }

    private zfw d() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    aiqf.a(this.f.s(), "Cannot return null from a non-@Nullable component method");
                    obj2 = mac.a((ide) aiqf.a(this.f.r(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private mae e() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mab.a((ajdp) aiqf.a(this.f.u(), "Cannot return null from a non-@Nullable component method"), (mwe) aiqf.a(this.f.v(), "Cannot return null from a non-@Nullable component method"), d());
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mae) obj;
    }

    private ajdu<maf.a, maf.a> f() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lzz.a((ajdp) aiqf.a(this.f.w(), "Cannot return null from a non-@Nullable component method"));
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    /* Access modifiers changed, original: final */
    public final mad c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = maa.a(this.e, e(), d(), f());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mad) obj;
    }
}
