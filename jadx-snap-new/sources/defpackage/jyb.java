package defpackage;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.util.DisplayMetrics;
import defpackage.jyv.a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: jyb */
public final class jyb implements jwb {
    final ConcurrentHashMap<ide, jyv> a = new ConcurrentHashMap();
    private final ajxe b;
    private final zfw c = zgb.a(jwp.a.callsite("DefaultBitmapFactoryProvider"));
    private final ajwy<jwk> d;
    private final ajwy<jyw> e;
    private final ajwy<jyo> f;
    private final ppn g;

    /* renamed from: jyb$c */
    static final class c extends akcq implements akbl<Integer, ajxw> {
        c(jyb jyb) {
            super(1, jyb);
        }

        public final String getName() {
            return "onLowMemory";
        }

        public final akej getOwner() {
            return akde.a(jyb.class);
        }

        public final String getSignature() {
            return "onLowMemory(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            Object values = ((jyb) this.receiver).a.values();
            akcr.a(values, "lruCache.values");
            for (jyv jyv : (Iterable) values) {
                jyv.a.a(intValue);
            }
            return ajxw.a;
        }
    }

    /* renamed from: jyb$a */
    static final class a extends akcs implements akbk<Integer> {
        private /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object resources = this.a.getResources();
            akcr.a(resources, "context.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return Integer.valueOf(((displayMetrics.heightPixels * displayMetrics.widthPixels) * jxl.a(Config.ARGB_8888)) << 1);
        }
    }

    /* renamed from: jyb$b */
    static final class b<T> implements ajfb<a> {
        private /* synthetic */ jyb a;
        private /* synthetic */ ide b;

        b(jyb jyb, ide ide) {
            this.a = jyb;
            this.b = ide;
        }

        public final /* synthetic */ void accept(Object obj) {
            a aVar = (a) obj;
            if (aVar == null || jyc.a[aVar.ordinal()] != 1) {
                throw new IllegalArgumentException("Unknown ".concat(String.valueOf(aVar)));
            }
            synchronized (this.a.a) {
                this.a.a.remove(this.b);
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(jyb.class), "defaultPoolSize", "getDefaultPoolSize()I");
    }

    public jyb(ajwy<jwk> ajwy, ajwy<jyw> ajwy2, ajwy<jyo> ajwy3, ppn ppn, zgb zgb, Context context) {
        akcr.b(ajwy, "disposableBitmapTracker");
        akcr.b(ajwy2, "snapBitmapFactoryProvider");
        akcr.b(ajwy3, "bitmapPoolFactory");
        akcr.b(ppn, "memoryMonitor");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(context, "context");
        this.d = ajwy;
        this.e = ajwy2;
        this.f = ajwy3;
        this.g = ppn;
        this.b = ajxh.a(new a(context));
        this.g.a().a((ajdw) this.c.b()).f((ajfb) new jyd(new c(this)));
    }

    public final jwa a(ide ide) {
        akcr.b(ide, "feature");
        synchronized (this.a) {
            jyv jyv = (jyv) this.a.get(ide);
            if (jyv != null) {
                jwa jwa = jyv;
                return jwa;
            }
            this.e.get();
            jyn a = ((jyo) this.f.get()).a(((Number) this.b.b()).intValue());
            ajwy ajwy = this.d;
            ajfb bVar = new b(this, ide);
            akcr.b(ide, "feature");
            akcr.b(a, "bitmapPool");
            akcr.b(ajwy, "disposableBitmapTracker");
            akcr.b(bVar, "consumer");
            jyv jyv2 = new jyv(ide, a, ajwy, bVar);
            this.a.put(ide, jyv2);
            jwa jwa2 = jyv2;
            return jwa2;
        }
    }
}
