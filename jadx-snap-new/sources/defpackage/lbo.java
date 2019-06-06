package defpackage;

import com.google.common.base.Supplier;
import com.snap.framework.developer.BuildConfigInfo;
import defpackage.lbp.a;
import defpackage.lbp.c;

/* renamed from: lbo */
public final class lbo extends lbp {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private volatile Object f;
    private c g;
    private ide h;

    /* renamed from: lbo$a */
    static final class a implements defpackage.lbp.a {
        c a;
        ide b;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final lbp a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b != null) {
                return new lbo(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lbo(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = new aiqe();
        this.g = aVar.a;
        this.h = aVar.b;
    }

    /* synthetic */ lbo(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private miu.a f() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lbr.a((ftl) aiqf.a(this.g.b(), "Cannot return null from a non-@Nullable component method"), (tnj) aiqf.a(this.g.c(), "Cannot return null from a non-@Nullable component method"), (Supplier) aiqf.a(this.g.e(), "Cannot return null from a non-@Nullable component method"), (Supplier) aiqf.a(this.g.f(), "Cannot return null from a non-@Nullable component method"), (BuildConfigInfo) aiqf.a(this.g.d(), "Cannot return null from a non-@Nullable component method"), this.h, (zgb) aiqf.a(this.g.a(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (miu.a) obj;
    }

    public final hww b() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lbt.a(f());
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (hww) obj;
    }

    public final wnh c() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lbv.a(f());
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (wnh) obj;
    }

    public final hxn d() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = lbu.a(f());
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (hxn) obj;
    }

    public final miw e() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = lbs.a(f());
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (miw) obj;
    }
}
