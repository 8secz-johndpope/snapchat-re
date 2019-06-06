package defpackage;

import defpackage.lwv.a;
import defpackage.lwv.b;

/* renamed from: lxd */
public final class lxd extends a {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private b e;
    private ajdp<lxc> f;
    private ajdp<Boolean> g;

    /* renamed from: lxd$a */
    static final class a implements defpackage.lwv.a.a {
        b a;
        ajdp<lxc> b;
        ajdp<Boolean> c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final defpackage.lwv.a a() {
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
            } else if (this.c != null) {
                return new lxd(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lwv.a.a b(ajdp ajdp) {
            this.c = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lxd(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.a;
        this.f = aVar.b;
        this.g = aVar.c;
    }

    /* synthetic */ lxd(a aVar, byte b) {
        this(aVar);
    }

    public static a.a d() {
        return new a();
    }

    private ajdu<lxc.b, lxc.b> e() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lwz.a(this.g, (ajdp) aiqf.a(this.e.j(), "Cannot return null from a non-@Nullable component method"), g());
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private lxb f() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lwx.a((ajdp) aiqf.a(this.e.l(), "Cannot return null from a non-@Nullable component method"), (mwe) aiqf.a(this.e.o(), "Cannot return null from a non-@Nullable component method"), (lxh) aiqf.a(this.e.p(), "Cannot return null from a non-@Nullable component method"), g(), (kqf) aiqf.a(this.e.n(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lxb) obj;
    }

    private zfw g() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lwy.a((zgb) aiqf.a(this.e.i(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.e.h(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final lxa c() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lww.a(this.f, f(), e(), g());
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (lxa) obj;
    }
}
