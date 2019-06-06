package defpackage;

import com.snap.core.db.api.SnapDb;
import defpackage.lna.a;
import defpackage.lna.d;

/* renamed from: lmz */
public final class lmz extends lna {
    private volatile Object a;
    private volatile ajwy<mzk> b;
    private volatile Object c;
    private volatile Object d;
    private d e;
    private ide f;

    /* renamed from: lmz$a */
    static final class a extends defpackage.lna.a {
        d a;
        ide b;

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
            } else if (this.b != null) {
                return new lmz(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: lmz$b */
    final class b<T> implements ajwy<T> {
        private final int a = 0;

        b() {
        }

        public final T get() {
            return lmz.this.b();
        }
    }

    private lmz(a aVar) {
        this.a = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.a;
        this.f = aVar.b;
    }

    /* synthetic */ lmz(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private zfw d() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lnb.a((zgb) aiqf.a(this.e.b(), "Cannot return null from a non-@Nullable component method"), this.f);
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    /* Access modifiers changed, original: final */
    public final mzk b() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lnd.a((SnapDb) aiqf.a(this.e.a(), "Cannot return null from a non-@Nullable component method"), d(), this.f);
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (mzk) obj;
    }

    public final mzk c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    ajwy ajwy = this.b;
                    if (ajwy == null) {
                        ajwy = new b();
                        this.b = ajwy;
                    }
                    obj2 = lnc.a(ajwy);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mzk) obj;
    }
}
