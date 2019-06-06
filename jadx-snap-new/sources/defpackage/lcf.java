package defpackage;

import android.net.Uri;
import com.brightcove.player.event.Event;
import com.google.common.base.Supplier;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.mhs.b;
import defpackage.miq.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lcf */
public final class lcf implements mok<moc> {
    final ConcurrentHashMap<mhs, leo> a;
    private final leq b;
    private final lci c;
    private final Supplier<gfu> d;
    private final akbl<moc, ajdw> e;
    private final sah f;
    private final zfw g;
    private final ide h;
    private final long i;
    private final TimeUnit j;

    /* renamed from: lcf$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gff gff = (gff) obj;
            akcr.b(gff, "it");
            akcr.b(gff, "metrics");
            return new gfh(gff);
        }
    }

    /* renamed from: lcf$c */
    static final class c<T> implements ajfb<gej> {
        private /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: lcf$d */
    static final class d<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ Uri a;
        final /* synthetic */ AtomicReference b;
        private /* synthetic */ int c;

        /* renamed from: lcf$d$1 */
        static final class 1<V> implements Callable<T> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object call() {
                miq b = a.b(this.a.a.toString());
                this.a.b.set(b);
                return b;
            }
        }

        d(Uri uri, AtomicReference atomicReference, int i) {
            this.a = uri;
            this.b = atomicReference;
            this.c = i;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "it");
            return gej.a() ? ajdp.b((Callable) new 1(this)) : ajvo.a(ajot.a);
        }
    }

    /* renamed from: lcf$a */
    static final class a<T> implements ajdm<T> {
        private /* synthetic */ AtomicReference a;
        private /* synthetic */ ajdp b;
        private /* synthetic */ lcf c;
        private /* synthetic */ moc d;

        a(AtomicReference atomicReference, ajdp ajdp, lcf lcf, moc moc) {
            this.a = atomicReference;
            this.b = ajdp;
            this.c = lcf;
            this.d = moc;
        }

        public final void a(final ajdk<miq> ajdk) {
            akcr.b(ajdk, Event.EMITTER);
            if (!ajdk.isDisposed()) {
                Object obj = (miq) this.a.get();
                if (obj != null) {
                    ajdk.a(obj);
                } else {
                    ajdk.a(this.b.a((ajfb) new ajfb<miq>(this) {
                        private /* synthetic */ a a;

                        public final /* synthetic */ void accept(Object obj) {
                            obj = (miq) obj;
                            akcr.b(obj, MessageMediaRefModel.URI);
                            ajdk.a(obj);
                        }
                    }, (ajfb) new ajfb<Throwable>(this) {
                        private /* synthetic */ a a;

                        public final /* synthetic */ void accept(Object obj) {
                            ajdk.a((Throwable) obj);
                        }
                    }, (ajev) new ajev(this) {
                        private /* synthetic */ a a;

                        public final void run() {
                            ajdk.a();
                        }
                    }));
                }
            }
        }
    }

    /* renamed from: lcf$b */
    static final class b implements ajev {
        private /* synthetic */ ajwo a;

        b(ajwo ajwo) {
            this.a = ajwo;
        }

        public final void run() {
            this.a.a(ajxw.a);
        }
    }

    /* renamed from: lcf$e */
    static final class e implements Runnable {
        private /* synthetic */ lcf a;
        private /* synthetic */ moc b;

        e(lcf lcf, moc moc) {
            this.a = lcf;
            this.b = moc;
        }

        public final void run() {
            this.a.a.remove(lcg.a(this.b));
        }
    }

    public /* synthetic */ lcf(lci lci, Supplier supplier, akbl akbl, sah sah, zfw zfw, ide ide, akbw akbw) {
        this(lci, supplier, akbl, sah, zfw, ide, akbw, TimeUnit.SECONDS);
    }

    private lcf(lci lci, Supplier<gfu> supplier, akbl<moc, ajdw> akbl, sah sah, zfw zfw, ide ide, akbw<gfu, ide, leq> akbw, TimeUnit timeUnit) {
        akcr.b(lci, "contentUriBuilder");
        akcr.b(supplier, "snapContentResolver");
        akcr.b(akbl, "resourceSchedulerResolver");
        akcr.b(sah, "noNetworkExponentialBackOffController");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ide, "attributedFeature");
        akcr.b(akbw, "resourceDownloadAnalyticsReporterFactory");
        akcr.b(timeUnit, "keepAliveTimeUnit");
        this.c = lci;
        this.d = supplier;
        this.e = akbl;
        this.f = sah;
        this.g = zfw;
        this.h = ide;
        this.i = 3600;
        this.j = timeUnit;
        this.a = new ConcurrentHashMap();
        Object obj = this.d.get();
        akcr.a(obj, "snapContentResolver.get()");
        this.b = (leq) akbw.invoke(obj, this.h);
    }

    private final Uri e(moc moc) {
        Uri uri = (Uri) this.c.invoke(moc);
        if (uri != null) {
            return uri;
        }
        StringBuilder stringBuilder = new StringBuilder("Uri builder for ");
        stringBuilder.append(moc);
        stringBuilder.append(" is not registered");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final ajdj<miq> a(moc moc) {
        Object obj = moc;
        while (true) {
            Object a;
            int i;
            akcr.b(obj, "request");
            ConcurrentMap concurrentMap = this.a;
            b a2 = lcg.a(moc);
            Object obj2 = concurrentMap.get(a2);
            int i2 = 0;
            if (obj2 == null) {
                ajdx a3;
                obj2 = new ajwo();
                akcr.a(obj2, "PublishSubject.create<Unit>()");
                Uri e = e(moc);
                AtomicReference atomicReference = new AtomicReference();
                int hashCode = moc.hashCode();
                Object obj3 = this.d.get();
                akcr.a(obj3, "snapContentResolver.get()");
                gfu gfu = (gfu) obj3;
                String str = "ContentManagerResourceUriResolver";
                if (moc.c().a() == mod.b.a.a()) {
                    a3 = gek.a(gfu.a(e, (idl) this.h.getPage(), true, new gdy[0]), sah.a.a(this.f, this.h.callsite(str), 0, 0, 6));
                } else {
                    idl page = this.h.getPage();
                    float a4 = moc.c().a();
                    akcr.b(gfu, "receiver$0");
                    akcr.b(e, MessageMediaRefModel.URI);
                    akcr.b(page, "page");
                    a = gfu.a(e, page, true, gdy.CHECK_CACHE_ONLY).a((ajfc) new gfv.a(gfu, e, page, a4));
                    akcr.a(a, "resolve(uri, page, true,….firstOrError()\n        }");
                    a = a.f(f.a);
                    akcr.a(a, "associateAndWaitForConte…ntResultFromMetrics(it) }");
                    a3 = gek.a(a, sah.a.a(this.f, this.h.callsite(str), 0, 0, 6));
                }
                a = a3.h();
                akcr.a(a, "if (request.priority.imp…               .toMaybe()");
                StringBuilder stringBuilder = new StringBuilder("uncaught error while resolving request[");
                stringBuilder.append(moc.hashCode());
                stringBuilder.append(']');
                a = a.a((ajdn) ajvo.a(ajlu.a));
                akcr.a(a, "if (request.priority.imp…ResumeNext(Maybe.empty())");
                a = a.b((ajdw) this.e.invoke(obj)).g().a((ajdb) this.b.invoke(obj));
                akcr.a(a, "snapContentResolver.get(…alyticsReporter(request))");
                String str2 = "resolve[";
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(hashCode);
                stringBuilder.append(":{priority=");
                stringBuilder.append(moc.c());
                stringBuilder.append(ppy.d);
                stringBuilder.append(obj);
                stringBuilder.append("}]");
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(hashCode);
                stringBuilder.append(")]");
                a = ajdj.a((ajdm) new a(atomicReference, a.d((ajfb) new c(hashCode)).u(new d(e, atomicReference, hashCode)).j((ajdt) obj2).i().g(3600, this.j, this.g.b()), this, obj));
                akcr.a(a, "Maybe\n                  …  }\n                    }");
                StringBuilder stringBuilder2 = new StringBuilder("request[");
                stringBuilder2.append(hashCode);
                stringBuilder2.append(']');
                obj2 = ajek.a((ajev) new b(obj2));
                akcr.a(obj2, "Disposables.fromAction { signal.onNext(Unit) }");
                leo leo = new leo(a, obj2, obj, atomicReference);
                obj2 = concurrentMap.putIfAbsent(a2, leo);
                if (obj2 == null) {
                    obj2 = leo;
                }
            }
            leo leo2 = (leo) obj2;
            ajdj ajdj = leo2.a;
            ajej ajej = leo2.b;
            a = leo2.c;
            if (leo2.d.get() == null) {
                i = 1;
                if ((akcr.a(moc.c(), a.c()) ^ 1) != 0) {
                    i2 = 1;
                }
            } else {
                i = 1;
            }
            if ((akcr.a(obj, a) ^ i) == 0 && i2 == 0) {
                obj = ajdj.b((ajdn) ajcx.a((Runnable) new e(this, obj)).a((ajdn) ajvo.a(ajlu.a)));
                akcr.a(obj, "maybe.switchIfEmpty(Comp…Then(Maybe.empty<Uri>()))");
                return obj;
            }
            this.a.remove(lcg.a(moc));
            ajej.dispose();
        }
    }

    public final miq b(moc moc) {
        akcr.b(moc, "request");
        return a.b(e(moc).toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    public final boolean c(defpackage.moc r2) {
        /*
        r1 = this;
        r0 = "request";
        defpackage.akcr.b(r2, r0);
        r0 = r1.a;
        r2 = defpackage.lcg.a(r2);
        r2 = r0.get(r2);
        r2 = (defpackage.leo) r2;
        if (r2 == 0) goto L_0x001e;
    L_0x0013:
        r2 = r2.d;
        if (r2 == 0) goto L_0x001e;
    L_0x0017:
        r2 = r2.get();
        r2 = (defpackage.miq) r2;
        goto L_0x001f;
    L_0x001e:
        r2 = 0;
    L_0x001f:
        if (r2 == 0) goto L_0x0023;
    L_0x0021:
        r2 = 1;
        return r2;
    L_0x0023:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcf.c(moc):boolean");
    }

    public final ajdp<moh> d(moc moc) {
        akcr.b(moc, "request");
        ajdp b = ((gfu) this.d.get()).b(e(moc), this.h.getPage());
        akbl akbl = lcg.a;
        if (akbl != null) {
            akbl = new lch(akbl);
        }
        Object j = b.p((ajfc) akbl).j(ajfu.a);
        akcr.a(j, "request.uri\n            …  .distinctUntilChanged()");
        return j;
    }
}
