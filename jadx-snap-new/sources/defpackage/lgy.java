package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.base.Supplier;
import defpackage.lhb.a;
import defpackage.mip.j;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lgy */
public final class lgy implements ajdi<aeqv, aeqv> {
    boolean a;
    final AtomicReference<lhb> b;
    final mhk c;
    final Supplier<File> d;
    final a e;
    final zfw f;
    final long g;
    private final ajxe h;

    /* renamed from: lgy$f */
    static final class f extends akcs implements akbk<File> {
        private /* synthetic */ lgy a;

        f(lgy lgy) {
            this.a = lgy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (File) this.a.d.get();
        }
    }

    /* renamed from: lgy$e */
    static final class e<V> implements Callable<T> {
        private /* synthetic */ lgy a;

        e(lgy lgy) {
            this.a = lgy;
        }

        /* JADX WARNING: Missing block: B:9:0x0035, code skipped:
            defpackage.lgy.a(r6.a).delete();
     */
        private defpackage.lhb a() {
            /*
            r6 = this;
            r0 = r6.a;
            r0 = r0.b;
            r0 = r0.get();
            r0 = (defpackage.lhb) r0;
            r1 = r0.a;
            r3 = 0;
            r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
            if (r5 >= 0) goto L_0x0056;
        L_0x0012:
            r1 = 0;
            r2 = r6.a;
            r2 = ((java.io.File) r2.h.b());
            r2 = r2.exists();
            if (r2 == 0) goto L_0x003e;
        L_0x001f:
            r2 = r6.a;	 Catch:{ all -> 0x0033 }
            r2 = r2.e;	 Catch:{ all -> 0x0033 }
            r3 = r6.a;	 Catch:{ all -> 0x0033 }
            r3 = ((java.io.File) r3.h.b());	 Catch:{ all -> 0x0033 }
            r4 = "cacheFile";
            defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0033 }
            r1 = r2.a(r3);	 Catch:{ all -> 0x0033 }
            goto L_0x003e;
        L_0x0033:
            r2 = move-exception;
            throw r2;	 Catch:{ Exception -> 0x0035 }
        L_0x0035:
            r2 = r6.a;
            r2 = ((java.io.File) r2.h.b());
            r2.delete();
        L_0x003e:
            if (r1 != 0) goto L_0x0041;
        L_0x0040:
            r1 = r0;
        L_0x0041:
            r2 = r6.a;
            r2 = r2.b;
            r0 = r2.compareAndSet(r0, r1);
            if (r0 == 0) goto L_0x004c;
        L_0x004b:
            return r1;
        L_0x004c:
            r0 = r6.a;
            r0 = r0.b;
            r0 = r0.get();
            r0 = (defpackage.lhb) r0;
        L_0x0056:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lgy$e.a():lhb");
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: lgy$a */
    static final class a<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ lgy a;
        private /* synthetic */ ajde b;

        /* renamed from: lgy$a$a */
        static final class a<T> implements ajfl<aeqv> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                aeqv aeqv = (aeqv) obj;
                akcr.b(aeqv, "it");
                return !lgz.a(aeqv);
            }
        }

        a(lgy lgy, ajde ajde) {
            this.a = lgy;
            this.b = ajde;
        }

        public final /* synthetic */ Object apply(Object obj) {
            lhb lhb = (lhb) obj;
            akcr.b(lhb, "cache");
            if (lhb.b == null) {
                return this.b;
            }
            Object obj2;
            String str;
            lgy lgy = this.a;
            long j = lhb.a;
            aeqv aeqv = lhb.b;
            Object obj3 = 1;
            if (lgy.a) {
                lgy.a = false;
            } else {
                long a = lgy.c.a(TimeUnit.MILLISECONDS);
                if (a <= 43200000 + j) {
                    obj2 = aeqv.c;
                    akcr.a(obj2, "response.cacheTtlMillis");
                    if (a <= j + obj2.longValue()) {
                        obj3 = null;
                    }
                }
            }
            if (obj3 != null) {
                obj2 = this.b.b((ajfl) a.a);
                akcr.a(obj2, "upstream.filter { !it.isEmpty() }");
                obj = obj2.c(lhb.b);
                str = "if (cacheDelayMillis > 0…                        }";
            } else {
                obj = ajde.b(lhb.b);
                str = "Flowable.just(cache.response)";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: lgy$b */
    static final class b<T> implements ajfl<aeqv> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            aeqv aeqv = (aeqv) obj;
            akcr.b(aeqv, "it");
            return !lgz.a(aeqv);
        }
    }

    /* renamed from: lgy$c */
    static final class c<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ lgy a;

        c(lgy lgy) {
            this.a = lgy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            obj = (aeqv) obj;
            akcr.b(obj, EventType.RESPONSE);
            lgy lgy = this.a;
            lhb lhb = (lhb) lgy.b.get();
            if (akcr.a(lhb.b, obj)) {
                obj = ajde.b(obj);
                str = "Flowable.just(response)";
            } else {
                Object a = ajcx.a((ajev) new h(lgy, obj, lhb));
                akcr.a(a, "Completable\n            …  }\n                    }");
                String str2 = "ScheduledLensRepositoryCache:cacheUpdate";
                akcr.b(a, "receiver$0");
                akcr.b(str2, "sectionName");
                a = a.a((ajdc) new j(mip.a(str2)));
                akcr.a(a, "this.compose { upstream …_TRACE) }\n        }\n    }");
                Object b = a.b((ajdw) lgy.f.f());
                akcr.a(b, "Completable\n            …qualifiedSchedulers.io())");
                obj = b.f().c(obj).d((ajfb) g.a);
                str = "cacheUpdate.toFlowable<R…e\")\n                    }";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: lgy$d */
    static final class d<T, R> implements ajfc<Throwable, akuw<? extends aeqv>> {
        private /* synthetic */ lgy a;

        d(lgy lgy) {
            this.a = lgy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "t");
            obj = ((lhb) this.a.b.get()).b;
            return obj != null ? ajde.b(obj) : ajvo.a(ajjl.b);
        }
    }

    /* renamed from: lgy$h */
    static final class h implements ajev {
        private /* synthetic */ lgy a;
        private /* synthetic */ aeqv b;
        private /* synthetic */ lhb c;

        h(lgy lgy, aeqv aeqv, lhb lhb) {
            this.a = lgy;
            this.b = aeqv;
            this.c = lhb;
        }

        public final void run() {
            lhb lhb = new lhb(this.a.c.a(TimeUnit.MILLISECONDS), this.b);
            if (this.a.b.compareAndSet(this.c, lhb)) {
                try {
                    a aVar = this.a.e;
                    Object a = ((File) this.a.h.b());
                    akcr.a(a, "cacheFile");
                    aVar.a(lhb, a);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: lgy$g */
    static final class g<T> implements ajfb<aeqv> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(lgy.class), "cacheFile", "getCacheFile()Ljava/io/File;");
    }

    private lgy(mhk mhk, Supplier<File> supplier, a aVar, zfw zfw) {
        akcr.b(mhk, "clock");
        akcr.b(supplier, "cacheFileSupplier");
        akcr.b(aVar, "serializer");
        akcr.b(zfw, "qualifiedSchedulers");
        this.c = mhk;
        this.d = supplier;
        this.e = aVar;
        this.f = zfw;
        this.g = 0;
        this.h = ajxh.a(new f(this));
        this.a = true;
        this.b = new AtomicReference(new lhb());
    }

    public /* synthetic */ lgy(mhk mhk, Supplier supplier, a aVar, zfw zfw, byte b) {
        this(mhk, supplier, aVar, zfw);
    }
}
