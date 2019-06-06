package defpackage;

import defpackage.lzh.a;
import defpackage.lzh.d;
import defpackage.lzq.b;

/* renamed from: lyy */
public final class lyy extends lzh {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private ajdp<lzq> f;
    private ajdp<mih> g;
    private d h;
    private ajdp<Boolean> i;

    /* renamed from: lyy$a */
    static final class a extends defpackage.lzh.a {
        d a;
        ajdp<lzq> b;
        ajdp<mih> c;
        ajdp<Boolean> d;

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
                return new lyy(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lzh.a b(ajdp ajdp) {
            this.c = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lzh.a c(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lyy(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = aVar.b;
        this.g = aVar.c;
        this.h = aVar.a;
        this.i = aVar.d;
    }

    /* synthetic */ lyy(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private zfw f() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lzj.a((zgb) aiqf.a(this.h.e(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.h.d(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private ajdu<b, b> g() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lzm.a(this.g, (ajdp) aiqf.a(this.h.h(), "Cannot return null from a non-@Nullable component method"), this.i, f());
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private lzo h() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = lzk.a((miw) aiqf.a(this.h.g(), "Cannot return null from a non-@Nullable component method"));
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (lzo) obj;
    }

    public final lzn d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lzi.a(this.f, g(), e(), f());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lzn) obj;
    }

    public final lzp e() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lzl.a(h(), f());
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (lzp) obj;
    }
}
