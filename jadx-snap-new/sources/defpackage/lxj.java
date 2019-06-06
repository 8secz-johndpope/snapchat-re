package defpackage;

import defpackage.lxk.a;
import defpackage.lxk.c;

/* renamed from: lxj */
public final class lxj extends a {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private ajdp<lxs> e;
    private c f;
    private ajdp<Double> g;
    private mwe h;
    private ajdp<miz> i;
    private mvu j;

    /* renamed from: lxj$a */
    static final class a implements defpackage.lxk.a.a {
        c a;
        ajdp<lxs> b;
        ajdp<Double> c;
        mwe d;
        mvu e;
        ajdp<miz> f;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final defpackage.lxk.a a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
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
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mwe.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mvu.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f != null) {
                return new lxj(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lxk.a.a b(ajdp ajdp) {
            this.c = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lxk.a.a c(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lxj(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.b;
        this.f = aVar.a;
        this.g = aVar.c;
        this.h = aVar.d;
        this.i = aVar.f;
        this.j = aVar.e;
    }

    /* synthetic */ lxj(a aVar, byte b) {
        this(aVar);
    }

    public static a.a c() {
        return new a();
    }

    private zfw e() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lxo.a((zgb) aiqf.a(this.f.h(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.f.g(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private mwe f() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lxl.a(this.h, this.i);
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (mwe) obj;
    }

    private lxr g() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lxn.a((ajdp) aiqf.a(this.f.j(), "Cannot return null from a non-@Nullable component method"), this.g, e(), f(), this.j);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (lxr) obj;
    }

    public final lxq d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lxm.a(this.e, g(), e());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lxq) obj;
    }
}
