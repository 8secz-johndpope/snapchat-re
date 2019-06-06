package defpackage;

import defpackage.lva.a;
import defpackage.lva.d;
import defpackage.lvi.b;

/* renamed from: lup */
public final class lup extends lva {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private d e;
    private ajdp<lvi> f;
    private ajdp<mih> g;
    private mtj h;

    /* renamed from: lup$a */
    static final class a extends defpackage.lva.a {
        d a;
        ajdp<lvi> b;
        ajdp<mih> c;
        mtj d;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(d.class.getCanonicalName());
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
                return new lup(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mtj.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lva.a b(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lup(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.a;
        this.f = aVar.b;
        this.g = aVar.c;
        this.h = aVar.d;
    }

    /* synthetic */ lup(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private ajdu<b, b> f() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lvc.a((kqf) aiqf.a(this.e.n(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.e.j(), "Cannot return null from a non-@Nullable component method"), this.g, g());
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private zfw g() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lve.a((zgb) aiqf.a(this.e.i(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.e.h(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private lvh h() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lvb.a((ajdp) aiqf.a(this.e.l(), "Cannot return null from a non-@Nullable component method"), this.h, g());
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (lvh) obj;
    }

    public final lvg d() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lvd.a(g(), this.f, h(), f());
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (lvg) obj;
    }

    public final miw e() {
        return (miw) aiqf.a(this.e.m(), "Cannot return null from a non-@Nullable component method");
    }
}
