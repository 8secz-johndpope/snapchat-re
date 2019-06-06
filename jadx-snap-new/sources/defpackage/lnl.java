package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.lno.a;
import defpackage.lno.d;

/* renamed from: lnl */
public final class lnl extends lno {
    private volatile Object a;
    private volatile Object b;
    private d c;
    private Supplier<sso> d;
    private ide e;
    private Supplier<sjm> f;

    /* renamed from: lnl$a */
    static final class a implements defpackage.lno.a {
        d a;
        ide b;
        Supplier<sso> c;
        Supplier<sjm> d;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final lno a() {
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
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d != null) {
                return new lnl(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lno.a b(Supplier supplier) {
            this.c = (Supplier) aiqf.a(supplier);
            return this;
        }
    }

    private lnl(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = aVar.a;
        this.d = aVar.c;
        this.e = aVar.b;
        this.f = aVar.d;
    }

    /* synthetic */ lnl(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private zfw c() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lnp.a((zgb) aiqf.a(this.c.b(), "Cannot return null from a non-@Nullable component method"), this.e);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final nbh b() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lnq.a((Context) aiqf.a(this.c.a(), "Cannot return null from a non-@Nullable component method"), this.d, (jwa) aiqf.a(this.c.c(), "Cannot return null from a non-@Nullable component method"), (jwe) aiqf.a(this.c.d(), "Cannot return null from a non-@Nullable component method"), c(), this.e, this.f);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (nbh) obj;
    }
}
