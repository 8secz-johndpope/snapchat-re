package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.kpm.a;
import defpackage.kvl.c;

/* renamed from: kvk */
public final class kvk extends kvl {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile ajwy<a> d;
    private volatile Object e;
    private volatile Object f;
    private dpr g;
    private c h;
    private ide i;
    private mzn j;
    private a k;
    private lbp.a l;

    /* renamed from: kvk$a */
    static final class a implements defpackage.kvl.a {
        c a;
        ide b;
        defpackage.lbp.a c;
        dpr d;
        mzn e;
        defpackage.kpm.a f;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final kvl a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b != null) {
                return new kvk(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: kvk$b */
    final class b<T> implements ajwy<T> {
        private final int a = 0;

        b() {
        }

        public final T get() {
            return kvk.this.e();
        }
    }

    private kvk(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.e = new aiqe();
        this.f = new aiqe();
        this.g = aVar.d;
        this.h = aVar.a;
        this.i = aVar.b;
        this.j = aVar.e;
        this.k = aVar.f;
        this.l = aVar.c;
    }

    /* synthetic */ kvk(a aVar, byte b) {
        this(aVar);
    }

    public static kvl.a a() {
        return new a();
    }

    private miw i() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = kvp.a(this.l, this.i);
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (miw) obj;
    }

    public final kqf b() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = kvo.a(e(), this.g);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (kqf) obj;
    }

    public final mng c() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = kvr.a((Context) aiqf.a(this.h.a(), "Cannot return null from a non-@Nullable component method"), (abss) aiqf.a(this.h.c(), "Cannot return null from a non-@Nullable component method"), b(), (gqr) aiqf.a(this.h.d(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.h.e(), "Cannot return null from a non-@Nullable component method"), this.i, this.j);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mng) obj;
    }

    public final ajdp<kqr> d() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    ajwy ajwy = this.d;
                    if (ajwy == null) {
                        ajwy = new b();
                        this.d = ajwy;
                    }
                    obj2 = kvq.a(ajwy, (zgb) aiqf.a(this.h.e(), "Cannot return null from a non-@Nullable component method"), this.i);
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    public final a e() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = kvn.a(this.k, (Supplier) aiqf.a(this.h.f(), "Cannot return null from a non-@Nullable component method"), (Supplier) aiqf.a(this.h.b(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.h.e(), "Cannot return null from a non-@Nullable component method"), this.i, (ilv) aiqf.a(this.h.g(), "Cannot return null from a non-@Nullable component method"), i(), (Supplier) aiqf.a(this.h.h(), "Cannot return null from a non-@Nullable component method"), (abss) aiqf.a(this.h.c(), "Cannot return null from a non-@Nullable component method"), (cko) aiqf.a(this.h.i(), "Cannot return null from a non-@Nullable component method"), (Supplier) aiqf.a(this.h.j(), "Cannot return null from a non-@Nullable component method"), (ajei) aiqf.a(this.h.k(), "Cannot return null from a non-@Nullable component method"));
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (a) obj;
    }

    public final c f() {
        return this.h;
    }

    public final a g() {
        return e();
    }
}
