package defpackage;

import defpackage.ltk.a;
import defpackage.ltk.c;
import defpackage.ltr.b;

/* renamed from: lts */
public final class lts extends ltk {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private c e;
    private ajdp<ltr> f;
    private ajdp<mih> g;
    private ajdp<Boolean> h;

    /* renamed from: lts$a */
    static final class a extends defpackage.ltk.a {
        c b;
        ajdp<ltr> c;
        ajdp<mih> d;
        ajdp<Boolean> e;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e != null) {
                return new lts(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.ltk.a b(ajdp ajdp) {
            this.d = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.ltk.a c(ajdp ajdp) {
            this.e = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lts(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.b;
        this.f = aVar.c;
        this.g = aVar.d;
        this.h = aVar.e;
    }

    /* synthetic */ lts(a aVar, byte b) {
        this(aVar);
    }

    public static a e() {
        return new a();
    }

    private ltq f() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = ltn.a((miw) aiqf.a(this.e.m(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.e.l(), "Cannot return null from a non-@Nullable component method"), (lth) aiqf.a(this.e.q(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (ltq) obj;
    }

    private zfw g() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = ltm.a((zgb) aiqf.a(this.e.i(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.e.h(), "Cannot return null from a non-@Nullable component method"));
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private ajdu<b, b> h() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lto.a(this.g, this.h, (ajdp) aiqf.a(this.e.j(), "Cannot return null from a non-@Nullable component method"), g());
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    public final miw c() {
        return (miw) aiqf.a(this.e.m(), "Cannot return null from a non-@Nullable component method");
    }

    public final ltp d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = ltl.a(this.f, f(), h(), g());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (ltp) obj;
    }
}
