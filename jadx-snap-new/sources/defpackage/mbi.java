package defpackage;

import defpackage.mbn.a;
import defpackage.mbn.d;

/* renamed from: mbi */
public final class mbi extends mbn {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private d f;
    private ajdp<mbw> g;
    private ajdp<mih> h;

    /* renamed from: mbi$a */
    static final class a extends defpackage.mbn.a {
        d a;
        ajdp<mbw> b;
        ajdp<mih> c;

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
            } else if (this.c != null) {
                return new mbi(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.mbn.a b(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private mbi(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = aVar.a;
        this.g = aVar.b;
        this.h = aVar.c;
    }

    /* synthetic */ mbi(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private mbu f() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mbp.a((miw) aiqf.a(this.f.g(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mbu) obj;
    }

    private ajdu<mbw.a, mbw.a> g() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = mbs.a((ajdp) aiqf.a(this.f.h(), "Cannot return null from a non-@Nullable component method"), this.h);
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private zfw h() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = mbr.a((zgb) aiqf.a(this.f.e(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.f.d(), "Cannot return null from a non-@Nullable component method"));
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final mbv d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mbq.a(f());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mbv) obj;
    }

    public final mbt e() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = mbo.a(this.g, d(), g(), h());
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (mbt) obj;
    }
}
