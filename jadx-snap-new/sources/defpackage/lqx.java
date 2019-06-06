package defpackage;

import defpackage.lqr.a;
import defpackage.lqr.b;

/* renamed from: lqx */
public final class lqx extends a {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private Boolean d;
    private b e;
    private akbl<mji, ajcx> f;

    /* renamed from: lqx$a */
    static final class a implements defpackage.lqr.a.a {
        b a;
        Boolean b;
        akbl<mji, ajcx> c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final defpackage.lqr.a a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(b.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c != null) {
                return new lqx(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(akbl.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lqx(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = aVar.b;
        this.e = aVar.a;
        this.f = aVar.c;
    }

    /* synthetic */ lqx(a aVar, byte b) {
        this(aVar);
    }

    private zfw e() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    aiqf.a(this.e.s(), "Cannot return null from a non-@Nullable component method");
                    obj2 = lqu.a((ide) aiqf.a(this.e.r(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    /* Access modifiers changed, original: final */
    public final lqv c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lqt.a(this.d.booleanValue(), (ajdp) aiqf.a(this.e.u(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.e.w(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lqv) obj;
    }

    /* Access modifiers changed, original: final */
    public final lqw d() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lqs.a((ajdp) aiqf.a(this.e.u(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.e.w(), "Cannot return null from a non-@Nullable component method"), e(), this.f);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (lqw) obj;
    }
}
