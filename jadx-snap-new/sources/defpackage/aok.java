package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import defpackage.aje.c;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.Future;

/* renamed from: aok */
public final class aok<A, T, Z, R> implements aol, aoo, apg {
    private static final Queue<aok<?, ?, ?, ?>> a = aps.a(0);
    private boolean A;
    private ajn<?> B;
    private c C;
    private long D;
    private int E;
    private final String b = String.valueOf(hashCode());
    private aio c;
    private Drawable d;
    private int e;
    private int f;
    private int g;
    private Context h;
    private ais<Z> i;
    private aoj<A, T, Z, R> j;
    private aom k;
    private A l;
    private Class<R> m;
    private boolean n;
    private aia o;
    private api<R> p;
    private aon<? super A, R> q;
    private float r;
    private aje s;
    private aov<R> t;
    private int u;
    private int v;
    private ajd w;
    private aol x;
    private Drawable y;
    private Drawable z;

    private aok() {
    }

    public static <A, T, Z, R> aok<A, T, Z, R> a(aoj<A, T, Z, R> aoj, A a, aio aio, Context context, aia aia, api<R> api, float f, Drawable drawable, int i, Drawable drawable2, int i2, aon<? super A, R> aon, aom aom, aje aje, ais<Z> ais, Class<R> cls, boolean z, aov<R> aov, int i3, int i4, ajd ajd, aol aol) {
        aok<A, T, Z, R> aok = (aok) a.poll();
        if (aok == null) {
            aok = new aok();
        }
        aok.a(aoj, a, aio, context, aia, api, f, drawable, i, drawable2, i2, null, 0, aon, aom, aje, ais, cls, z, aov, i3, i4, ajd, null);
        return aok;
    }

    private void a(aoj<A, T, Z, R> aoj, A a, aio aio, Context context, aia aia, api<R> api, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, aon<? super A, R> aon, aom aom, aje aje, ais<Z> ais, Class<R> cls, boolean z, aov<R> aov, int i4, int i5, ajd ajd, aol aol) {
        A a2 = a;
        ais<Z> ais2 = ais;
        ajd ajd2 = ajd;
        this.j = aoj;
        this.l = a2;
        this.c = aio;
        this.d = null;
        this.e = 0;
        this.h = context.getApplicationContext();
        this.o = aia;
        this.p = api;
        this.r = f;
        this.y = drawable;
        this.f = i;
        this.z = drawable2;
        this.g = i2;
        this.q = aon;
        this.k = aom;
        this.s = aje;
        this.i = ais2;
        this.m = cls;
        this.n = z;
        this.t = aov;
        this.u = i4;
        this.v = i5;
        this.w = ajd2;
        this.x = aol;
        this.E = 1;
        if (a2 != null) {
            Object c;
            String str;
            String str2;
            aok.a("ModelLoader", aoj.e(), "try .using(ModelLoader)");
            aok.a("Transcoder", aoj.f(), "try .as*(Class).transcode(ResourceTranscoder)");
            aok.a("Transformation", ais2, "try .transform(UnitTransformation.get())");
            if (ajd2.cacheSource) {
                c = aoj.c();
                str = "SourceEncoder";
                str2 = "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)";
            } else {
                c = aoj.b();
                str = "SourceDecoder";
                str2 = "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)";
            }
            aok.a(str, c, str2);
            if (ajd2.cacheSource || ajd2.cacheResult) {
                aok.a("CacheDecoder", aoj.a(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (ajd2.cacheResult) {
                aok.a("Encoder", aoj.d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    private void a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" this: ");
        stringBuilder.append(this.b);
        Log.v("GenericRequest", stringBuilder.toString());
    }

    private static void a(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append(" must not be null");
            stringBuilder.append(ppy.d);
            stringBuilder.append(str2);
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    private void b(ajn ajn) {
        aje.a(ajn);
        this.B = null;
    }

    private void b(Exception exception) {
        if (l()) {
            Drawable drawable;
            if (this.l == null) {
                if (this.d == null && this.e > 0) {
                    this.d = this.h.getResources().getDrawable(this.e);
                }
                drawable = this.d;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                if (this.z == null && this.g > 0) {
                    this.z = this.h.getResources().getDrawable(this.g);
                }
                drawable = this.z;
            }
            if (drawable == null) {
                drawable = k();
            }
            this.p.a(exception, drawable);
        }
    }

    private void j() {
        if (this.x != null) {
            if (Log.isLoggable("GenericRequest", 2)) {
                a("Deferred resource cleared");
            }
            this.x.d();
            this.x.a();
            this.x = null;
        }
    }

    private Drawable k() {
        if (this.y == null && this.f > 0) {
            this.y = this.h.getResources().getDrawable(this.f);
        }
        return this.y;
    }

    private boolean l() {
        aom aom = this.k;
        return aom == null || aom.b(this);
    }

    public final void a() {
        this.j = null;
        this.l = null;
        this.h = null;
        this.p = null;
        this.y = null;
        this.z = null;
        this.d = null;
        this.q = null;
        this.k = null;
        this.i = null;
        this.t = null;
        this.A = false;
        this.C = null;
        a.offer(this);
    }

    public final void a(int i, int i2) {
        StringBuilder stringBuilder;
        String str = "GenericRequest";
        if (Log.isLoggable(str, 2)) {
            stringBuilder = new StringBuilder("Got onSizeReady in ");
            stringBuilder.append(apo.a(this.D));
            a(stringBuilder.toString());
        }
        if (this.E == 3) {
            this.E = 2;
            int round = Math.round(this.r * ((float) i));
            int round2 = Math.round(this.r * ((float) i2));
            aiv a = this.j.e().a(this.l, round, round2);
            if (a == null) {
                StringBuilder stringBuilder2 = new StringBuilder("Failed to load model: '");
                stringBuilder2.append(this.l);
                stringBuilder2.append("'");
                a(new Exception(stringBuilder2.toString()));
                return;
            }
            anm f = this.j.f();
            if (Log.isLoggable(str, 2)) {
                stringBuilder = new StringBuilder("finished setup for calling load in ");
                stringBuilder.append(apo.a(this.D));
                a(stringBuilder.toString());
            }
            boolean z = true;
            this.A = true;
            this.C = this.s.a(this.c, round, round2, a, this.j, this.i, f, this.o, this.n, this.w, this);
            if (this.B == null) {
                z = false;
            }
            this.A = z;
            if (Log.isLoggable(str, 2)) {
                stringBuilder = new StringBuilder("finished onSizeReady in ");
                stringBuilder.append(apo.a(this.D));
                a(stringBuilder.toString());
            }
        }
    }

    public final void a(ajn<?> ajn) {
        StringBuilder stringBuilder;
        if (ajn == null) {
            stringBuilder = new StringBuilder("Expected to receive a Resource<R> with an object of ");
            stringBuilder.append(this.m);
            stringBuilder.append(" inside, but instead got null.");
            a(new Exception(stringBuilder.toString()));
            return;
        }
        Object a = ajn.a();
        if (a == null || !this.m.isAssignableFrom(a.getClass())) {
            b((ajn) ajn);
            StringBuilder stringBuilder2 = new StringBuilder("Expected to receive an object of ");
            stringBuilder2.append(this.m);
            stringBuilder2.append(" but instead got ");
            String str = "";
            stringBuilder2.append(a != null ? a.getClass() : str);
            stringBuilder2.append("{");
            stringBuilder2.append(a);
            stringBuilder2.append("} inside Resource{");
            stringBuilder2.append(ajn);
            stringBuilder2.append("}.");
            if (a == null) {
                str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            }
            stringBuilder2.append(str);
            a(new Exception(stringBuilder2.toString()));
            return;
        }
        aom aom = this.k;
        boolean z = false;
        Object obj = (aom == null || aom.a(this)) ? 1 : null;
        if (obj == null) {
            b((ajn) ajn);
            this.E = 4;
            return;
        }
        aom = this.k;
        if (aom == null || !aom.j()) {
            z = true;
        }
        this.E = 4;
        this.B = ajn;
        aon aon = this.q;
        if (aon != null) {
            aon.a(a, this.A);
        }
        this.p.a(a, this.t.a(this.A, z));
        aom aom2 = this.k;
        if (aom2 != null) {
            aom2.c(this);
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            stringBuilder = new StringBuilder("Resource ready in ");
            stringBuilder.append(apo.a(this.D));
            stringBuilder.append(" size: ");
            double b = (double) ajn.b();
            Double.isNaN(b);
            stringBuilder.append(b * 9.5367431640625E-7d);
            stringBuilder.append(" fromCache: ");
            stringBuilder.append(this.A);
            a(stringBuilder.toString());
        }
        j();
    }

    public final void a(Exception exception) {
        String str = "GenericRequest";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "load failed", exception);
        }
        this.E = 5;
        aon aon = this.q;
        if (aon != null) {
            aon.a(exception, this.l);
        }
        b(exception);
    }

    public final void b() {
        this.D = apo.a();
        if (this.l == null) {
            a(null);
            return;
        }
        this.E = 3;
        if (aps.a(this.u, this.v)) {
            a(this.u, this.v);
        } else {
            this.p.a((apg) this);
        }
        if (!g()) {
            if ((this.E == 5 ? 1 : null) == null && l() && this.x == null) {
                this.p.a(k());
            }
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder stringBuilder = new StringBuilder("finished run method in ");
            stringBuilder.append(apo.a(this.D));
            a(stringBuilder.toString());
        }
    }

    public final void c() {
        aps.a();
        if (this.E != 7) {
            this.E = 6;
            c cVar = this.C;
            if (cVar != null) {
                ajf ajf = cVar.a;
                aoo aoo = cVar.b;
                aps.a();
                if (ajf.h || ajf.i) {
                    if (ajf.j == null) {
                        ajf.j = new HashSet();
                    }
                    ajf.j.add(aoo);
                } else {
                    ajf.a.remove(aoo);
                    if (!(!ajf.a.isEmpty() || ajf.i || ajf.h || ajf.f)) {
                        ajk ajk = ajf.k;
                        ajk.b = true;
                        ajc ajc = ajk.a;
                        ajc.d = true;
                        ajc.b.c();
                        Future future = ajf.m;
                        if (future != null) {
                            future.cancel(true);
                        }
                        ajf.f = true;
                        ajf.b.a(ajf, ajf.c);
                    }
                }
                this.C = null;
            }
            j();
            ajn ajn = this.B;
            if (ajn != null) {
                b(ajn);
            }
            if (l()) {
                this.p.b(k());
            }
            this.E = 7;
        }
    }

    public final void d() {
        aps.a();
        if (this.E != 7) {
            ajn ajn = this.B;
            if (ajn != null) {
                b(ajn);
            }
            this.E = 7;
        }
    }

    public final void e() {
        c();
        this.E = 8;
    }

    public final boolean f() {
        int i = this.E;
        return i == 2 || i == 3;
    }

    public final boolean g() {
        return this.E == 4;
    }

    public final boolean h() {
        return g();
    }

    public final boolean i() {
        int i = this.E;
        return i == 6 || i == 7;
    }
}
