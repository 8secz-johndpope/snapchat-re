package defpackage;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/* renamed from: gpl */
public final class gpl<T> {
    final Cache<String, ajwr<T>> a;
    final Object b;
    final String c;
    final akca<String, String, Object[], ajxw> d;
    private final boolean e = false;
    private final String f;

    /* renamed from: gpl$a */
    static final class a implements ajev {
        private /* synthetic */ ajwr a;
        private /* synthetic */ gpl b;
        private /* synthetic */ String c;
        private /* synthetic */ ajdx d;

        a(ajwr ajwr, gpl gpl, String str, ajdx ajdx) {
            this.a = ajwr;
            this.b = gpl;
            this.c = str;
            this.d = ajdx;
        }

        public final void run() {
            synchronized (this.b.b) {
                if (!this.a.j()) {
                    this.b.a.invalidate(this.c);
                    akca akca = this.b.d;
                    String str = this.b.c;
                    StringBuilder stringBuilder = new StringBuilder("Invalidated cache because of disposal for ");
                    stringBuilder.append(this.c);
                    stringBuilder.append(" and no single value. Cache size ");
                    stringBuilder.append(this.b.a.size());
                    int i = 0;
                    akca.invoke(str, stringBuilder.toString(), new Object[0]);
                    if (((defpackage.ajwr.a[]) this.a.a.get()).length != 0) {
                        i = 1;
                    }
                    if (!(i == 0 || this.a.k())) {
                        this.a.a((Throwable) new RuntimeException("Original single disposed!"));
                    }
                }
            }
        }
    }

    /* renamed from: gpl$b */
    static final class b<T, R> implements ajfc<Throwable, ajeb<? extends T>> {
        private /* synthetic */ ajwr a;
        private /* synthetic */ gpl b;
        private /* synthetic */ String c;
        private /* synthetic */ ajdx d;

        b(ajwr ajwr, gpl gpl, String str, ajdx ajdx) {
            this.a = ajwr;
            this.b = gpl;
            this.c = str;
            this.d = ajdx;
        }

        private ajdx<T> a(Throwable th) {
            akcr.b(th, "it");
            synchronized (this.b.b) {
                this.a.a(th);
                this.b.a.invalidate(this.c);
            }
            akca akca = this.b.d;
            String str = this.b.c;
            StringBuilder stringBuilder = new StringBuilder("Invalidated cache because of error for key ");
            stringBuilder.append(this.c);
            stringBuilder.append(". Cache size ");
            stringBuilder.append(this.b.a.size());
            akca.invoke(str, stringBuilder.toString(), new Object[0]);
            return ajdx.b(th);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((Throwable) obj);
        }
    }

    /* renamed from: gpl$c */
    static final class c<T> implements ajfb<T> {
        private /* synthetic */ ajwr a;

        c(ajwr ajwr) {
            this.a = ajwr;
        }

        public final void accept(T t) {
            this.a.b_(t);
        }
    }

    public gpl(akca<? super String, ? super String, ? super Object[], ajxw> akca, String str) {
        String str2;
        akcr.b(akca, "logger");
        akcr.b(str, "cacheLogName");
        boolean z = false;
        this.d = akca;
        this.f = str;
        Object build = CacheBuilder.newBuilder().maximumSize(25).build();
        akcr.a(build, "CacheBuilder.newBuilder(…ize)\n            .build()");
        this.a = build;
        this.b = new Object();
        if (this.f.length() == 0) {
            z = true;
        }
        if (z) {
            str2 = "SingleCache";
        } else {
            StringBuilder stringBuilder = new StringBuilder("SingleCache:");
            stringBuilder.append(this.f);
            str2 = stringBuilder.toString();
        }
        this.c = str2;
    }

    public final gpm<T> a(String str, ajdx<T> ajdx) {
        akcr.b(str, "key");
        akcr.b(ajdx, "single");
        synchronized (this.b) {
            Object obj = (ajwr) this.a.getIfPresent(str);
            if (obj != null) {
                akca akca = this.d;
                String str2 = this.c;
                StringBuilder stringBuilder = new StringBuilder("Cache hit for key ");
                stringBuilder.append(str);
                stringBuilder.append(". Cache size ");
                stringBuilder.append(this.a.size());
                akca.invoke(str2, stringBuilder.toString(), new Object[0]);
                akcr.a(obj, "it");
                gpm gpm = new gpm((ajdx) obj, true);
                return gpm;
            }
            obj = new ajwr();
            akcr.a(obj, "SingleSubject.create<T>()");
            this.a.put(str, obj);
            akca akca2 = this.d;
            String str3 = this.c;
            StringBuilder stringBuilder2 = new StringBuilder("Put into cache for key ");
            stringBuilder2.append(str);
            stringBuilder2.append(". Cache size ");
            stringBuilder2.append(this.a.size());
            akca2.invoke(str3, stringBuilder2.toString(), new Object[0]);
            Object h = ajdx.c((ajfb) new c(obj)).c((ajev) new a(obj, this, str, ajdx)).h(new b(obj, this, str, ajdx));
            akcr.a(h, "single\n                 …it)\n                    }");
            gpm gpm2 = new gpm(h, false);
            return gpm2;
        }
    }

    public final void a(String str) {
        akcr.b(str, "key");
        synchronized (this.b) {
            this.a.invalidate(str);
            akca akca = this.d;
            String str2 = this.c;
            StringBuilder stringBuilder = new StringBuilder("Invalidated cache for key ");
            stringBuilder.append(str);
            stringBuilder.append(" on call to invalidate. Cache size ");
            stringBuilder.append(this.a.size());
            akca.invoke(str2, stringBuilder.toString(), new Object[0]);
        }
    }
}
