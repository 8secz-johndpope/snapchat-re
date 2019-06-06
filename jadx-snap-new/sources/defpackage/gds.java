package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: gds */
public final class gds {
    final Set<gfo> a;
    public final ajwy<igc> b;
    final ihh c;
    private final ajxe d;

    /* renamed from: gds$f */
    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        f(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(gef.a.callsite("migration"));
        }
    }

    /* renamed from: gds$e */
    static final class e<T, R> implements ajfc<T, R> {
        private /* synthetic */ gds a;

        e(gds gds) {
            this.a = gds;
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "filesDir");
            File file2 = new File(file, "MushroomMigration");
            long j = 0;
            if (file2.exists() && file2.isDirectory()) {
                file = new File(file2, "CREATED_AT");
                if (file.exists()) {
                    long lastModified = file.lastModified();
                    long a = this.a.c.a();
                    if (lastModified > 0 && a >= lastModified) {
                        j = Math.max(gfi.a - (a - lastModified), 0);
                    }
                }
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: gds$b */
    public static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "it");
            return Boolean.valueOf(l.longValue() > gfi.b);
        }
    }

    /* renamed from: gds$c */
    public static final class c<T> implements ajfl<Boolean> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: gds$a */
    public static final class a<T, R> implements ajfc<Long, ajdb> {
        private /* synthetic */ gds a;

        /* renamed from: gds$a$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                File file = (File) obj;
                akcr.b(file, "filesDir");
                File file2 = new File(file, "MushroomMigration");
                if (file2.exists()) {
                    ygr.b(file2);
                }
                return ajxw.a;
            }
        }

        public a(gds gds) {
            this.a = gds;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            Long l = (Long) obj;
            akcr.b(l, "millisUntilExpiration");
            if (l.longValue() <= 0) {
                obj = this.a.b.get();
                akcr.a(obj, "storage.get()");
                a = ((igc) obj).b().f(1.a).b((ajdw) this.a.a().f()).e().a(ajfu.g);
            } else {
                a = ajvo.a(ajhn.a);
            }
            return a;
        }
    }

    /* renamed from: gds$d */
    public static final class d<T, R> implements ajfc<File, ajdb> {
        private /* synthetic */ gds a;
        private /* synthetic */ boolean b = false;

        public d(gds gds) {
            this.a = gds;
        }

        public final /* synthetic */ Object apply(Object obj) {
            File file = (File) obj;
            akcr.b(file, "internalFilesDir");
            File file2 = new File(file, "MushroomMigration");
            ygr.a(file2);
            File file3 = new File(file2, "CREATED_AT");
            if (file3.createNewFile()) {
                file3.setLastModified(this.a.c.a());
            }
            Iterable<gfo> iterable = this.a.a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (gfo a : iterable) {
                arrayList.add(a.a(file, file2, false));
            }
            return ajcx.c((Iterable) (List) arrayList).a(ajfu.g).b((ajdw) this.a.a().f());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gds.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public gds(Set<gfo> set, ajwy<igc> ajwy, ihh ihh, zgb zgb) {
        akcr.b(set, "preProcessors");
        akcr.b(ajwy, "storage");
        akcr.b(ihh, "clock");
        akcr.b(zgb, "schedulersProvider");
        this.a = set;
        this.b = ajwy;
        this.c = ihh;
        this.d = ajxh.a(new f(zgb));
    }

    public final zfw a() {
        return (zfw) this.d.b();
    }

    public final ajdx<Long> b() {
        Object obj = this.b.get();
        akcr.a(obj, "storage.get()");
        obj = ((igc) obj).b().f(new e(this)).c(Long.valueOf(0)).b((ajdw) a().f());
        akcr.a(obj, "storage.get().internalFi…scribeOn(schedulers.io())");
        return obj;
    }
}
