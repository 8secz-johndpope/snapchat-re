package defpackage;

import com.google.common.base.Optional;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: gss */
public final class gss {
    public final ajxe a;
    final ajdx<iha> b;
    final Set<gqw> c;
    final ajwy<grt> d;

    /* renamed from: gss$a */
    static final class a extends akcs implements akbk<grq> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "storage.get()");
            return new grq((igc) obj);
        }
    }

    /* renamed from: gss$b */
    public static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "it");
            return (file.exists() && file.isDirectory()) ? file.listFiles() : new File[0];
        }
    }

    /* renamed from: gss$g */
    public static final class g<T, R> implements ajfc<File[], ajdb> {
        private /* synthetic */ gss a;

        public g(gss gss) {
            this.a = gss;
        }

        public final /* synthetic */ Object apply(Object obj) {
            File[] fileArr = (File[]) obj;
            akcr.b(fileArr, "files");
            Collection arrayList = new ArrayList(fileArr.length);
            for (File file : fileArr) {
                gss gss = this.a;
                Object f = gss.b.f(new c(file));
                akcr.a(f, "serializationHelperSingl…      }\n                }");
                Object f2 = f.e((ajfc) new d(gss)).a((ajfl) new e(gss)).f(new f(gss, file));
                akcr.a(f2, "parseJavaCrashFile(crash…shFile)\n                }");
                arrayList.add(f2);
            }
            return ajcx.b((Iterable) (List) arrayList);
        }
    }

    /* renamed from: gss$h */
    public static final class h<T> implements ajfl<Throwable> {
        private /* synthetic */ gss a;

        public h(gss gss) {
            this.a = gss;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            grt grt = (grt) this.a.d.get();
            ailp ailp = ailp.JAVA;
            obj = th.getLocalizedMessage();
            akcr.a(obj, "throwable.localizedMessage");
            grt.b(null, ailp, obj);
            return true;
        }
    }

    /* renamed from: gss$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ File a;

        c(File file) {
            this.a = file;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iha iha = (iha) obj;
            akcr.b(iha, "it");
            String a = akkz.a(this.a, Charset.defaultCharset());
            CharSequence charSequence = a;
            Object obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
            if (obj2 != null) {
                return Optional.absent();
            }
            gqv gqv = (gqv) iha.a(a, gqv.class);
            return gqv == null ? Optional.absent() : Optional.of(gqv);
        }
    }

    /* renamed from: gss$d */
    static final class d<T, R> implements ajfc<Optional<gqv>, ajdb> {
        private /* synthetic */ gss a;

        d(gss gss) {
            this.a = gss;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            gss gss = this.a;
            if (optional.isPresent()) {
                Iterable<gqw> iterable = gss.c;
                Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                for (gqw gqw : iterable) {
                    Object obj2 = optional.get();
                    akcr.a(obj2, "annotatedJavaCrashOptional.get()");
                    arrayList.add(gqw.a((gqv) obj2));
                }
                obj = ajcx.b((Iterable) (List) arrayList);
                str = "Completable.merge(crashR…vaCrashOptional.get()) })";
            } else {
                obj = ajvo.a(ajhn.a);
                str = "Completable.complete()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: gss$e */
    static final class e<T> implements ajfl<Throwable> {
        private /* synthetic */ gss a;

        e(gss gss) {
            this.a = gss;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            grt grt = (grt) this.a.d.get();
            ailp ailp = ailp.JAVA;
            obj = th.getLocalizedMessage();
            akcr.a(obj, "throwable.localizedMessage");
            grt.a("", ailp, obj);
            return true;
        }
    }

    /* renamed from: gss$f */
    static final class f implements ajev {
        private /* synthetic */ gss a;
        private /* synthetic */ File b;

        f(gss gss, File file) {
            this.a = gss;
            this.b = file;
        }

        public final void run() {
            ygr.b(this.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gss.class), "crashLogFileManager", "getCrashLogFileManager()Lcom/snap/crash/impl/CrashLogFileManager;");
    }

    public gss(ajwy<igc> ajwy, ajdx<iha> ajdx, Set<gqw> set, ajwy<grt> ajwy2) {
        akcr.b(ajwy, "storage");
        akcr.b(ajdx, "serializationHelperSingle");
        akcr.b(set, "crashReporters");
        akcr.b(ajwy2, "crashAnalyticsHelper");
        this.b = ajdx;
        this.c = set;
        this.d = ajwy2;
        this.a = ajxh.a(new a(ajwy));
    }
}
