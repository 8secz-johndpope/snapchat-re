package defpackage;

import defpackage.gds.b;
import defpackage.gds.c;
import defpackage.geg.a;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: ghk */
public final class ghk implements gfb {
    final ajxe a = ajxh.a(new e(this));
    final ajwy<igc> b;
    final ajwy<gee> c;
    final ajwy<Set<gfn>> d;
    private final ajwy<gds> e;

    /* renamed from: ghk$e */
    static final class e extends akcs implements akbk<Map<gfp, ? extends gfn>> {
        private /* synthetic */ ghk a;

        e(ghk ghk) {
            this.a = ghk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.d.get();
            akcr.a(obj, "postProcessors.get()");
            Iterable<gfn> iterable = (Iterable) obj;
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
            for (gfn gfn : iterable) {
                ajxm a = ajxs.a(gfn.a(), gfn);
                linkedHashMap.put(a.a, a.b);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: ghk$a */
    static final class a<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ ghk a;

        a(ghk ghk) {
            this.a = ghk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Boolean) obj, "it");
            obj = this.a.b.get();
            akcr.a(obj, "storage.get()");
            obj = ((igc) obj).b().f(c.a).a((ajfl) d.a);
            akcr.a(obj, "storage.get().internalFi… it.isDirectory\n        }");
            return obj;
        }
    }

    /* renamed from: ghk$b */
    static final class b<T, R> implements ajfc<T, ajdn<? extends R>> {
        private /* synthetic */ ghk a;
        private /* synthetic */ geg b;

        b(ghk ghk, geg geg) {
            this.a = ghk;
            this.b = geg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "migrationDir");
            gfn gfn = (gfn) ((Map) this.a.a.b()).get(this.b.f());
            if (gfn != null) {
                ajdj a = gfn.a(this.b.a(), file);
                if (a != null) {
                    return a;
                }
            }
            obj = ajvo.a(ajlu.a);
            akcr.a(obj, "Maybe.empty()");
            return obj;
        }
    }

    /* renamed from: ghk$h */
    static final class h<V> implements Callable<ajeb<? extends T>> {
        private /* synthetic */ ghk a;
        private /* synthetic */ geg b;
        private /* synthetic */ a c;

        h(ghk ghk, geg geg, a aVar) {
            this.a = ghk;
            this.b = geg;
            this.c = aVar;
        }

        public final /* synthetic */ Object call() {
            gee gee = (gee) this.a.c.get();
            String a = this.b.a();
            a aVar = this.c;
            geo f = this.b.f();
            return gee.a(new gew(a, this.b.b(), aVar, this.b.e(), f, this.b.g(), this.b.h(), 260)).a(false);
        }
    }

    /* renamed from: ghk$i */
    static final class i<T, R> implements ajfc<Throwable, gej> {
        public static final i a = new i();

        i() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return ghx.a.a(th, null);
        }
    }

    /* renamed from: ghk$g */
    static final class g<V> implements Callable<ajeb<? extends T>> {
        private /* synthetic */ ghk a;
        private /* synthetic */ geg b;

        g(ghk ghk, geg geg) {
            this.a = ghk;
            this.b = geg;
        }

        public final /* synthetic */ Object call() {
            return ((gee) this.a.c.get()).a(this.b).a(false);
        }
    }

    /* renamed from: ghk$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ajdx a;

        f(ajdx ajdx) {
            this.a = ajdx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (gej) obj;
            akcr.b(obj, "it");
            return obj.a() ? ajdx.b(obj) : this.a;
        }
    }

    /* renamed from: ghk$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            return new File(file, "MushroomMigration");
        }
    }

    /* renamed from: ghk$d */
    static final class d<T> implements ajfl<File> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            return file.exists() && file.isDirectory();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ghk.class), "postProcessorMap", "getPostProcessorMap()Ljava/util/Map;");
    }

    public ghk(ajwy<igc> ajwy, ajwy<gee> ajwy2, ajwy<Set<gfn>> ajwy3, ajwy<gds> ajwy4) {
        akcr.b(ajwy, "storage");
        akcr.b(ajwy2, "delegate");
        akcr.b(ajwy3, "postProcessors");
        akcr.b(ajwy4, "migrationController");
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
        this.e = ajwy4;
    }

    public final geh a(geg geg) {
        String str = "request";
        akcr.b(geg, str);
        akcr.b(geg, str);
        Object a = ((gds) this.e.get()).b().f(b.a).a((ajfl) c.a);
        akcr.a(a, "millisUntilExpiration()\n…           .filter { it }");
        a = a.a((ajfc) new a(this)).a((ajfc) new b(this, geg));
        akcr.a(a, "migrationController.get(…: Maybe.empty()\n        }");
        a = a.a((ajeb) ajdx.b(ghx.a.a((Throwable) new IllegalArgumentException("Failed to find valid migration files, this may be expected if we did not migration files from OG"), null)));
        akcr.a(a, "maybeContentResultToImpo…ration files from OG\"))))");
        a = ajdx.a((Callable) new h(this, geg, gem.c(a))).g(i.a);
        akcr.a(a, "Single.defer {\n         …ult.fromClientError(it) }");
        Object a2 = ajdx.a((Callable) new g(this, geg));
        akcr.a(a2, "Single.defer {\n         …etResult(false)\n        }");
        a2 = a.a((ajfc) new f(a2));
        akcr.a(a2, "maybeImportSuccessOrInCa…t\n            }\n        }");
        return new giq(a2, ajvo.a(ajot.a));
    }
}
