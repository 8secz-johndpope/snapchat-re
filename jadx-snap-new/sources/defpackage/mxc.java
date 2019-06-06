package defpackage;

import defpackage.mxg.a;
import defpackage.mxg.d;

/* renamed from: mxc */
public final class mxc extends mxg {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private d d;

    /* renamed from: mxc$a */
    static final class a implements defpackage.mxg.a {
        d a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object a() {
            if (this.a != null) {
                return new mxc(this, (byte) 0);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        public final /* bridge */ /* synthetic */ defpackage.mxg.a a(d dVar) {
            this.a = (d) aiqf.a(dVar);
            return this;
        }
    }

    private mxc(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = aVar.a;
    }

    /* synthetic */ mxc(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private mxl e() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mxi.a((mnr) aiqf.a(this.d.F(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mxl) obj;
    }

    private zfw f() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = mxj.a((zgb) aiqf.a(this.d.u(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.d.I(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final mxk d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mxh.a(e(), (ajdp) aiqf.a(this.d.y(), "Cannot return null from a non-@Nullable component method"), f());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mxk) obj;
    }
}
