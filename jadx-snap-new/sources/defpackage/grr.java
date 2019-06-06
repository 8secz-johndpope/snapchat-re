package defpackage;

import android.content.Context;
import com.snapchat.breakpad.SCBreakpadWrapper;
import defpackage.gss.g;
import defpackage.gss.h;
import defpackage.gsy.e;
import defpackage.gsy.f;
import java.io.File;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: grr */
public final class grr implements gqa {
    final zfw a = zgb.a(gqe.a, "CrashManagerImpl");
    final List<gqx> b;
    final List<gqx> c;
    final ajxe d;
    final ajei e;
    final Context f;
    final ajwy<gss> g;
    final ajwy<gsy> h;
    private final ajxe i;
    private final Set<gpy> j;
    private final zgb k;

    /* renamed from: grr$b */
    static final class b implements ajdb {
        private /* synthetic */ grr a;

        b(grr grr) {
            this.a = grr;
        }

        public final void a(ajcz ajcz) {
            akcr.b(ajcz, "it");
            gss gss = (gss) this.a.g.get();
            Object f = ((grq) gss.a.b()).a().f(defpackage.gss.b.a);
            akcr.a(f, "crashLogFileManager.getJ…      }\n                }");
            Object a = f.e((ajfc) new g(gss)).a((ajfl) new h(gss));
            akcr.a(a, "listPreviousCrashFiles()…rashPrepareError(error) }");
            ajej e = a.b((ajdw) this.a.a.j()).e();
            akcr.a((Object) e, "javaCrashWorker.get().re…             .subscribe()");
            ajvv.a(e, this.a.e);
            gsy gsy = (gsy) this.a.h.get();
            f = ((grq) gsy.a.b()).b().f(defpackage.gsy.b.a);
            akcr.a(f, "crashLogFileManager.getN…      }\n                }");
            a = f.e((ajfc) new e(gsy)).a((ajfl) new f(gsy));
            akcr.a(a, "listPreviousNativeCrashe…(error)\n                }");
            e = a.b((ajdw) this.a.a.j()).e();
            akcr.a((Object) e, "nativeCrashReporter.get(…             .subscribe()");
            ajvv.a(e, this.a.e);
            ajcz.a();
        }
    }

    /* renamed from: grr$c */
    static final class c implements ajdb {
        private /* synthetic */ grr a;

        c(grr grr) {
            this.a = grr;
        }

        public final void a(ajcz ajcz) {
            akcr.b(ajcz, "it");
            grr grr = this.a;
            Object obj = (File) grr.d().b().b();
            if (!obj.exists()) {
                obj.mkdirs();
            }
            akcr.a(obj, "nativeCrashFolder");
            SCBreakpadWrapper.setUpUnhandledExceptionHandler(grr.f, obj.getPath(), ".secondary");
            ajcz.a();
        }
    }

    /* renamed from: grr$d */
    static final class d implements ajdb {
        final /* synthetic */ grr a;

        /* renamed from: grr$d$a */
        static final class a implements UncaughtExceptionHandler {
            final /* synthetic */ UncaughtExceptionHandler a;
            private /* synthetic */ d b;
            private /* synthetic */ AtomicBoolean c;

            a(d dVar, AtomicBoolean atomicBoolean, UncaughtExceptionHandler uncaughtExceptionHandler) {
                this.b = dVar;
                this.c = atomicBoolean;
                this.a = uncaughtExceptionHandler;
            }

            public final void uncaughtException(final Thread thread, final Throwable th) {
                String str = "thread";
                akcr.b(thread, str);
                String str2 = "throwable";
                akcr.b(th, str2);
                if (this.c.compareAndSet(false, true)) {
                    grr grr = this.b.a;
                    akcr.b(thread, str);
                    akcr.b(th, str2);
                    Iterable<gqx> iterable = grr.b;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (gqx a : iterable) {
                        arrayList.add(a.a(thread, th));
                    }
                    ajcx b = ajcx.b((Iterable) (List) arrayList);
                    Iterable<gqx> iterable2 = grr.c;
                    Collection arrayList2 = new ArrayList(ajyn.a((Iterable) iterable2, 10));
                    for (gqx a2 : iterable2) {
                        arrayList2.add(a2.a(thread, th));
                    }
                    Object b2 = b.b((ajdb) ajcx.b((Iterable) (List) arrayList2)).b((ajdw) grr.a.b());
                    akcr.a(b2, "Completable.merge(highPr…schedulers.computation())");
                    ajej g = b2.g(new ajev(this) {
                        private /* synthetic */ a a;

                        public final void run() {
                            this.a.a.uncaughtException(thread, th);
                        }
                    });
                    akcr.a((Object) g, "reportCrash(thread, thro…                        }");
                    ajvv.a(g, this.b.a.e);
                }
            }
        }

        d(grr grr) {
            this.a = grr;
        }

        public final void a(ajcz ajcz) {
            akcr.b(ajcz, "it");
            Thread.setDefaultUncaughtExceptionHandler(new a(this, new AtomicBoolean(false), Thread.getDefaultUncaughtExceptionHandler()));
            ajcz.a();
        }
    }

    /* renamed from: grr$e */
    static final class e implements ajdb {
        private /* synthetic */ grr a;

        e(grr grr) {
            this.a = grr;
        }

        public final void a(ajcz ajcz) {
            akcr.b(ajcz, "it");
            Object defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            for (gqg gqg : (List) this.a.d.b()) {
                akcr.a(defaultUncaughtExceptionHandler, "lastExceptionHandler");
                defaultUncaughtExceptionHandler = gqg.a(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            ajcz.a();
        }
    }

    /* renamed from: grr$a */
    static final class a extends akcs implements akbk<grq> {
        private /* synthetic */ igc a;

        a(igc igc) {
            this.a = igc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new grq(this.a);
        }
    }

    /* renamed from: grr$f */
    static final class f extends akcs implements akbk<List<gqg>> {
        private /* synthetic */ Set a;

        /* renamed from: grr$f$a */
        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ajzy.a(Boolean.valueOf(((gqg) t2).a()), Boolean.valueOf(((gqg) t).a()));
            }
        }

        f(Set set) {
            this.a = set;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajyu.a((Iterable) this.a, (Comparator) new a());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(grr.class), "crashLogFileManager", "getCrashLogFileManager()Lcom/snap/crash/impl/CrashLogFileManager;"), new akdc(akde.a(grr.class), "sortedExceptionHandlerFactories", "getSortedExceptionHandlerFactories()Ljava/util/List;")};
    }

    public grr(Context context, Set<gqx> set, Set<gqg> set2, Set<gpy> set3, zgb zgb, ajwy<gss> ajwy, ajwy<gsy> ajwy2, igc igc) {
        akcr.b(context, "context");
        akcr.b(set, "realtimeJavaCrashProcessors");
        akcr.b(set2, "exceptionHandlerFactories");
        akcr.b(set3, "autoCrashProcessors");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "javaCrashWorker");
        akcr.b(ajwy2, "nativeCrashReporter");
        akcr.b(igc, "storage");
        this.f = context;
        this.j = set3;
        this.k = zgb;
        this.g = ajwy;
        this.h = ajwy2;
        this.i = ajxh.a(new a(igc));
        Iterable iterable = set;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((gqx) next).a() == 1) {
                obj = 1;
            }
            if (obj != null) {
                arrayList.add(next);
            }
        }
        this.b = (List) arrayList;
        arrayList = new ArrayList();
        for (Object next2 : iterable) {
            if ((((gqx) next2).a() == 2 ? 1 : null) != null) {
                arrayList.add(next2);
            }
        }
        this.c = (List) arrayList;
        this.d = ajxh.a(new f(set2));
        this.e = new ajei();
    }

    public final void a() {
        akcr.a(abtb.a(), "TestStatus.getInstance()");
        Iterable<gpy> iterable = this.j;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (gpy a : iterable) {
            arrayList.add(a.a());
        }
        ajej e = ajcx.b((Iterable) (List) arrayList).b((ajdb) new b(this)).b((ajdb) new c(this)).b((ajdb) new d(this)).b((ajdb) new e(this)).b((ajdw) this.a.b()).e();
        akcr.a((Object) e, "Completable.merge(autoCr…             .subscribe()");
        ajvv.a(e, this.e);
    }

    public final void b() {
        this.e.dispose();
    }

    public final File c() {
        Object b = d().a.b().f(grq.e.a).b();
        akcr.a(b, "storage.internalFilesDir…           .blockingGet()");
        return (File) b;
    }

    /* Access modifiers changed, original: final */
    public final grq d() {
        return (grq) this.i.b();
    }
}
