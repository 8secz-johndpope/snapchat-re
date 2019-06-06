package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.snap.lenses.app.geo.GeoDataHttpInterface;
import defpackage.ljx.a;
import defpackage.ljx.d;
import java.util.TimeZone;

/* renamed from: ljs */
public final class ljs extends ljx {
    private volatile Object a;
    private volatile Object b;
    private volatile ajwy<GeoDataHttpInterface> c;
    private volatile Object d;
    private volatile Object e;
    private volatile Object f;
    private volatile Object g;
    private volatile Object h;
    private d i;
    private ide j;

    /* renamed from: ljs$a */
    static final class a implements defpackage.ljx.a {
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
                return new ljs(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: ljs$b */
    final class b<T> implements ajwy<T> {
        private final int a = 0;

        b() {
        }

        public final T get() {
            return ljs.this.b();
        }
    }

    private ljs(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = new aiqe();
        this.g = new aiqe();
        this.h = new aiqe();
        this.i = aVar.a;
        this.j = aVar.b;
    }

    /* synthetic */ ljs(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private ajdp<Boolean> e() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = lkd.a((miw) aiqf.a(this.i.e(), "Cannot return null from a non-@Nullable component method"));
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private ajdp<String> f() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = lkc.a((miw) aiqf.a(this.i.e(), "Cannot return null from a non-@Nullable component method"));
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private TimeZone g() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = lkb.a();
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (TimeZone) obj;
    }

    private mhk h() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = ljy.a();
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (mhk) obj;
    }

    /* Access modifiers changed, original: final */
    public final GeoDataHttpInterface b() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = ljz.a((mxa) aiqf.a(this.i.d(), "Cannot return null from a non-@Nullable component method"));
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (GeoDataHttpInterface) obj;
    }

    public final mtr c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lka.a((Supplier) aiqf.a(this.i.b(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mtr) obj;
    }

    public final mtv d() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    Context context = (Context) aiqf.a(this.i.a(), "Cannot return null from a non-@Nullable component method");
                    zgb zgb = (zgb) aiqf.a(this.i.c(), "Cannot return null from a non-@Nullable component method");
                    ide ide = this.j;
                    ajwy ajwy = this.c;
                    if (ajwy == null) {
                        ajwy = new b();
                        this.c = ajwy;
                    }
                    obj2 = lke.a(context, zgb, ide, aiqb.b(ajwy), (Supplier) aiqf.a(this.i.b(), "Cannot return null from a non-@Nullable component method"), e(), f(), g(), h());
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mtv) obj;
    }
}
