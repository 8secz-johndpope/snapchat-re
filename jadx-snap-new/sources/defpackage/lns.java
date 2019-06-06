package defpackage;

import defpackage.lnz.a;
import defpackage.lnz.c;
import defpackage.mhs.b;
import java.util.Set;

/* renamed from: lns */
public final class lns extends lnz {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private c e;
    private mok<? super moc> f;
    private nay g;
    private ajdp<Set<b>> h;
    private lop i;

    /* renamed from: lns$a */
    static final class a implements defpackage.lnz.a {
        c a;
        mok<? super moc> b;
        nay c;
        ajdp<Set<b>> d;
        lop e;

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
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mok.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(nay.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e != null) {
                return new lns(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lop.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lns(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.a;
        this.f = aVar.b;
        this.g = aVar.c;
        this.h = aVar.d;
        this.i = aVar.e;
    }

    /* synthetic */ lns(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private lnx e() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lob.a((mwe) aiqf.a(this.e.J(), "Cannot return null from a non-@Nullable component method"));
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (lnx) obj;
    }

    private loi f() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lod.a(this.f, e());
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (loi) obj;
    }

    private loj g() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = loe.a(f(), this.g, (mwe) aiqf.a(this.e.J(), "Cannot return null from a non-@Nullable component method"), this.h, this.i);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (loj) obj;
    }

    public final lof d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = loc.a((ajdp) aiqf.a(this.e.y(), "Cannot return null from a non-@Nullable component method"), g());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lof) obj;
    }
}
