package defpackage;

import android.content.Context;
import defpackage.ljj.a;
import defpackage.ljj.d;

/* renamed from: ljb */
public final class ljb extends ljj {
    d a;
    private volatile Object b;
    private volatile Object c;
    private volatile ajwy<mti> d;
    private volatile Object e;
    private volatile ajwy<ljg> f;
    private volatile Object g;
    private volatile ajwy<eqm<eps>> h;
    private volatile ajwy<ljh> i;
    private volatile Object j;
    private volatile Object k;
    private volatile ajwy<zfw> l;
    private ide m;
    private mzn n;
    private miw o;
    private ajwy<mhg> p;

    /* renamed from: ljb$a */
    static final class a extends defpackage.ljj.a {
        d a;
        ide b;
        mhg c;
        miw d;
        mzn e;

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
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mhg.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d != null) {
                return new ljb(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(miw.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: ljb$b */
    final class b<T> implements ajwy<T> {
        private final int a;

        b(int i) {
            this.a = i;
        }

        public final T get() {
            int i = this.a;
            if (i == 0) {
                return ljb.this.b();
            }
            if (i == 1) {
                return ljb.this.c();
            }
            if (i == 2) {
                return aiqf.a(ljb.this.a.b(), "Cannot return null from a non-@Nullable component method");
            }
            if (i == 3) {
                return ljb.this.d();
            }
            if (i == 4) {
                return ljb.this.e();
            }
            throw new AssertionError(i);
        }
    }

    private ljb(a aVar) {
        this.b = new aiqe();
        this.c = new aiqe();
        this.e = new aiqe();
        this.g = new aiqe();
        this.j = new aiqe();
        this.k = new aiqe();
        this.a = aVar.a;
        this.m = aVar.b;
        this.n = aVar.e;
        this.o = aVar.d;
        this.p = aiqd.a(aVar.c);
    }

    /* synthetic */ ljb(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private ljh g() {
        Object obj = this.k;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.k;
                if (obj2 instanceof aiqe) {
                    obj2 = ljp.a();
                    this.k = aiqb.a(this.k, obj2);
                }
            }
            obj = obj2;
        }
        return (ljh) obj;
    }

    /* Access modifiers changed, original: final */
    public final mti b() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = ljk.a(this.n);
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (mti) obj;
    }

    /* Access modifiers changed, original: final */
    public final ljg c() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = ljm.a((Context) aiqf.a(this.a.a(), "Cannot return null from a non-@Nullable component method"));
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (ljg) obj;
    }

    /* Access modifiers changed, original: final */
    public final ljh d() {
        Object obj = this.j;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.j;
                if (obj2 instanceof aiqe) {
                    obj2 = ljn.a(g());
                    this.j = aiqb.a(this.j, obj2);
                }
            }
            obj = obj2;
        }
        return (ljh) obj;
    }

    public final zfw e() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = ljo.a((zgb) aiqf.a(this.a.c(), "Cannot return null from a non-@Nullable component method"), this.m);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final mtj f() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    ajwy ajwy = this.d;
                    if (ajwy == null) {
                        ajwy = new b(0);
                        this.d = ajwy;
                    }
                    ajwy ajwy2 = ajwy;
                    miw miw = this.o;
                    ajwy ajwy3 = this.p;
                    ajwy = this.f;
                    if (ajwy == null) {
                        ajwy = new b(1);
                        this.f = ajwy;
                    }
                    ajwy ajwy4 = ajwy;
                    ajwy = this.h;
                    if (ajwy == null) {
                        ajwy = new b(2);
                        this.h = ajwy;
                    }
                    ajwy ajwy5 = ajwy;
                    ajwy = this.i;
                    if (ajwy == null) {
                        ajwy = new b(3);
                        this.i = ajwy;
                    }
                    ajwy ajwy6 = ajwy;
                    ajwy = this.l;
                    if (ajwy == null) {
                        ajwy = new b(4);
                        this.l = ajwy;
                    }
                    obj2 = ljl.a(ajwy2, miw, ajwy3, ajwy4, ajwy5, ajwy6, ajwy);
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (mtj) obj;
    }
}
