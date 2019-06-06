package defpackage;

import defpackage.luf.a;
import defpackage.luf.d;
import defpackage.lum.b;

/* renamed from: lty */
public final class lty extends luf {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private d e;
    private ajdp<lum> f;
    private myv g;
    private ajdp<Boolean> h;

    /* renamed from: lty$a */
    static final class a extends defpackage.luf.a {
        d a;
        ajdp<lum> b;
        myv c;
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
                stringBuilder.append(myv.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d != null) {
                return new lty(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.luf.a b(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lty(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.a;
        this.f = aVar.b;
        this.g = aVar.c;
        this.h = aVar.d;
    }

    /* synthetic */ lty(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private lul e() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = luh.a((ajdp) aiqf.a(this.e.l(), "Cannot return null from a non-@Nullable component method"), (mwe) aiqf.a(this.e.o(), "Cannot return null from a non-@Nullable component method"), this.g, (miw) aiqf.a(this.e.m(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (lul) obj;
    }

    private ajdu<b, b> f() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = luj.a(this.h, (ajdp) aiqf.a(this.e.j(), "Cannot return null from a non-@Nullable component method"), g());
                    this.d = aiqb.a(this.d, obj2);
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
                    obj2 = lui.a((zgb) aiqf.a(this.e.i(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.e.h(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final luk d() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lug.a(this.f, e(), f(), g());
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (luk) obj;
    }
}
