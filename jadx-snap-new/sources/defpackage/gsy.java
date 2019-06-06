package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: gsy */
public final class gsy {
    public final ajxe a;
    final ajwy<grt> b;
    private final Set<gqy> c;

    /* renamed from: gsy$a */
    static final class a extends akcs implements akbk<grq> {
        private /* synthetic */ aipn a;

        a(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj = this.a.get();
            akcr.a(obj, "storage.get()");
            return new grq((igc) obj);
        }
    }

    /* renamed from: gsy$b */
    public static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A:{SYNTHETIC} */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (java.io.File) r8;
            r0 = "it";
            defpackage.akcr.b(r8, r0);
            r0 = r8.exists();
            if (r0 == 0) goto L_0x0055;
        L_0x000d:
            r0 = r8.isDirectory();
            if (r0 != 0) goto L_0x0014;
        L_0x0013:
            goto L_0x0055;
        L_0x0014:
            r8 = r8.listFiles();
            r0 = "it.listFiles()";
            defpackage.akcr.a(r8, r0);
            r0 = new java.util.ArrayList;
            r0.<init>();
            r0 = (java.util.Collection) r0;
            r1 = r8.length;
            r2 = 0;
            r3 = 0;
        L_0x0027:
            if (r3 >= r1) goto L_0x0052;
        L_0x0029:
            r4 = r8[r3];
            r5 = r4.exists();
            if (r5 == 0) goto L_0x0049;
        L_0x0031:
            r5 = "file";
            defpackage.akcr.a(r4, r5);
            r5 = r4.getPath();
            r6 = "file.path";
            defpackage.akcr.a(r5, r6);
            r6 = ".secondary";
            r5 = defpackage.akgb.c(r5, r6);
            if (r5 != 0) goto L_0x0049;
        L_0x0047:
            r5 = 1;
            goto L_0x004a;
        L_0x0049:
            r5 = 0;
        L_0x004a:
            if (r5 == 0) goto L_0x004f;
        L_0x004c:
            r0.add(r4);
        L_0x004f:
            r3 = r3 + 1;
            goto L_0x0027;
        L_0x0052:
            r0 = (java.util.List) r0;
            return r0;
        L_0x0055:
            r8 = defpackage.ajyw.a;
            r8 = (java.util.List) r8;
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gsy$b.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: gsy$e */
    public static final class e<T, R> implements ajfc<List<? extends File>, ajdb> {
        private /* synthetic */ gsy a;

        public e(gsy gsy) {
            this.a = gsy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "files");
            Iterable<File> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (File a : iterable) {
                arrayList.add(gsy.a(this.a, a));
            }
            return ajcx.b((Iterable) (List) arrayList);
        }
    }

    /* renamed from: gsy$f */
    public static final class f<T> implements ajfl<Throwable> {
        private /* synthetic */ gsy a;

        public f(gsy gsy) {
            this.a = gsy;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            grt grt = (grt) this.a.b.get();
            ailp ailp = ailp.NATIVE;
            obj = th.getLocalizedMessage();
            akcr.a(obj, "throwable.localizedMessage");
            grt.b("", ailp, obj);
            return true;
        }
    }

    /* renamed from: gsy$c */
    static final class c<T> implements ajfl<Throwable> {
        private /* synthetic */ gsy a;

        c(gsy gsy) {
            this.a = gsy;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            grt grt = (grt) this.a.b.get();
            ailp ailp = ailp.NATIVE;
            obj = th.getLocalizedMessage();
            akcr.a(obj, "throwable.localizedMessage");
            grt.a("", ailp, obj);
            return true;
        }
    }

    /* renamed from: gsy$d */
    static final class d implements ajev {
        private /* synthetic */ gsy a;
        private /* synthetic */ File b;

        d(gsy gsy, File file) {
            this.a = gsy;
            this.b = file;
        }

        public final void run() {
            File file = this.b;
            ygr.b(file);
            ygr.b(gsy.a(file));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gsy.class), "crashLogFileManager", "getCrashLogFileManager()Lcom/snap/crash/impl/CrashLogFileManager;");
    }

    public gsy(aipn<igc> aipn, Set<gqy> set, ajwy<grt> ajwy) {
        akcr.b(aipn, "storage");
        akcr.b(set, "nativeCrashProcessors");
        akcr.b(ajwy, "crashAnalyticsHelper");
        this.c = set;
        this.b = ajwy;
        this.a = ajxh.a(new a(aipn));
    }

    public static final /* synthetic */ ajcx a(gsy gsy, File file) {
        Object uuid = iig.a().toString();
        akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
        Iterable<gqy> iterable = gsy.c;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (gqy a : iterable) {
            arrayList.add(a.a(uuid, file, gsy.a(file)));
        }
        Object f = ajcx.b((Iterable) (List) arrayList).a((ajfl) new c(gsy)).f(new d(gsy, file));
        akcr.a(f, "Completable.merge(native…eport(primaryCrashFile) }");
        return f;
    }

    static File a(File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(file.getPath());
        stringBuilder.append(".secondary");
        return new File(stringBuilder.toString());
    }
}
