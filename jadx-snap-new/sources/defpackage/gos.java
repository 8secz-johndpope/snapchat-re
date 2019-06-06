package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gos */
public final class gos {
    final zfw a = zgb.a(gnq.a.callsite("UnifiedPrefetcher"));
    final ConcurrentHashMap<ide, goq> b = new ConcurrentHashMap();
    final Map<Class<? extends ide>, gnp> c;
    final ifa d;
    final ryg e;
    final gfu f;
    private final zgb g;

    /* renamed from: gos$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ gos a;

        c(gos gos) {
            this.a = gos;
        }

        public final /* synthetic */ Object call() {
            gos gos = this.a;
            boolean z = (gos.d.k() && gos.d.m()) || !gos.e.c();
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: gos$d */
    static final class d<T> implements ajfl<Boolean> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: gos$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ gos a;
        private /* synthetic */ ajei b;

        e(gos gos, ajei ajei) {
            this.a = gos;
            this.b = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            gos gos = this.a;
            ajei ajei = this.b;
            for (gnp gnp : gos.c.values()) {
                goq goq = new goq(gnp.a());
                gos.b.put(gnp.a(), goq);
                ajej l = gnp.b().k((ajfc) new f(goq, gos, ajei)).l();
                akcr.a((Object) l, "provider.mediaToPrefetch…             .subscribe()");
                ajvv.a(l, ajei);
                ajej f = gnp.c().f((ajfb) new g(goq));
                akcr.a((Object) f, "provider.cancellations\n …er.cancelAllDownloads() }");
                ajvv.a(f, ajei);
            }
            return ajxw.a;
        }
    }

    /* renamed from: gos$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ goq a;
        private /* synthetic */ gos b;
        private /* synthetic */ ajei c;

        f(goq goq, gos gos, ajei ajei) {
            this.a = goq;
            this.b = gos;
            this.c = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final gnt gnt = (gnt) obj;
            akcr.b(gnt, "prefetchRequest");
            gos gos = this.b;
            Uri uri = gnt.b;
            idl idl = gnt.c;
            Object j = ajdx.a((ajeb) gos.f.a(uri, idl, true, gdy.READ_CACHE_ONLY).f(a.a), (ajeb) gos.f.a(uri, idl, true, new gdy[0]).f(b.a)).j();
            akcr.a(j, "Single.concat(readCache(…        }).toObservable()");
            return j.f(new gng(gnv.FAIL)).d((ajfb) new ajfb<gng>() {
                public final /* synthetic */ void accept(Object obj) {
                    gng gng = (gng) obj;
                    ajfb ajfb = gnt.d;
                    if (ajfb != null) {
                        ajfb.accept(new gnu(gnt.a, gng.a));
                    }
                }
            }).e((ajfb) new ajfb<ajej>(this) {
                private /* synthetic */ f a;

                public final /* synthetic */ void accept(Object obj) {
                    obj = (ajej) obj;
                    goq goq = this.a.a;
                    String str = gnt.a;
                    akcr.a(obj, "it");
                    akcr.b(str, "mediaId");
                    akcr.b(obj, "disposable");
                    goq.a.put(str, obj);
                }
            }).a((ajev) new ajev(this) {
                private /* synthetic */ f a;

                public final void run() {
                    goq goq = this.a.a;
                    String str = gnt.a;
                    akcr.b(str, "mediaId");
                    Object obj = (ajej) goq.a.remove(str);
                    if (obj != null) {
                        akcr.a(obj, "it");
                        if (!obj.isDisposed()) {
                            obj.dispose();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: gos$g */
    static final class g<T> implements ajfb<Boolean> {
        private /* synthetic */ goq a;

        g(goq goq) {
            this.a = goq;
        }

        public final /* synthetic */ void accept(Object obj) {
            goq goq = this.a;
            for (Entry entry : goq.a.entrySet()) {
                if (!((ajej) entry.getValue()).isDisposed()) {
                    ((ajej) entry.getValue()).dispose();
                }
            }
            goq.a.clear();
        }
    }

    /* renamed from: gos$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            return gej.a() ? new gng(gnv.SUCCESS, gej) : new gng(gnv.DOWNLOADING, gej);
        }
    }

    /* renamed from: gos$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            return gej.a() ? new gng(gnv.SUCCESS, gej) : new gng(gnv.FAIL, gej);
        }
    }

    public gos(Map<Class<? extends ide>, gnp> map, zgb zgb, ifa ifa, ryg ryg, gfu gfu) {
        akcr.b(map, "prefetchDataProviders");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ifa, "networkStatusManager");
        akcr.b(ryg, "dataSaverPreferenceWrapper");
        akcr.b(gfu, "contentResolver");
        this.c = map;
        this.g = zgb;
        this.d = ifa;
        this.e = ryg;
        this.f = gfu;
    }
}
