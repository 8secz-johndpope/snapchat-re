package defpackage;

import defpackage.mfj.a;
import defpackage.mfj.d;
import defpackage.mfu.b;

/* renamed from: mfc */
public final class mfc extends mfj {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private ajdp<mfu> f;
    private Boolean g;
    private ajdp<Boolean> h;
    private d i;

    /* renamed from: mfc$a */
    static final class a extends defpackage.mfj.a {
        d a;
        ajdp<mfu> b;
        ajdp<Boolean> c;
        Boolean d;

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
                return new mfc(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.mfj.a b(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private mfc(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = aVar.b;
        this.g = aVar.d;
        this.h = aVar.c;
        this.i = aVar.a;
    }

    /* synthetic */ mfc(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private ajdu<b, b> f() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mfo.a(this.g.booleanValue(), this.h);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private ajdu<mft.b, mft.b> g() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = mfm.a(this.g.booleanValue());
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
                    obj2 = mfl.a((zgb) aiqf.a(this.i.f(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.i.e(), "Cannot return null from a non-@Nullable component method"));
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final mfq d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mfk.a(this.f, f(), e(), h());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mfq) obj;
    }

    public final mft e() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = mfn.a((ajdp) aiqf.a(this.i.d(), "Cannot return null from a non-@Nullable component method"), g(), (kqf) aiqf.a(this.i.h(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (mft) obj;
    }
}
