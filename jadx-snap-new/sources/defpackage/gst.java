package defpackage;

import android.content.Context;
import android.util.Log;
import defpackage.grq.c;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: gst */
public final class gst implements gqx {
    final ajxe a;
    final ajxe b = ajxh.a(new b(this));
    final Context c;
    final ajdx<iha> d;
    final aipn<gsi> e;
    final aipn<gpz> f;
    final ajwy<abkm> g;
    final ajwy<gsj> h;
    final ajwy<grt> i;
    final ajwy<ifb> j;

    /* renamed from: gst$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: gst$c */
    static final class c extends akcs implements akbk<grq> {
        private /* synthetic */ igc a;

        c(igc igc) {
            this.a = igc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new grq(this.a);
        }
    }

    /* renamed from: gst$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ gst a;

        b(gst gst) {
            this.a = gst;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return absh.a(this.a.c);
        }
    }

    /* renamed from: gst$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ gst a;
        private /* synthetic */ Throwable b;

        d(gst gst, Throwable th) {
            this.a = gst;
            this.b = th;
        }

        public final /* synthetic */ Object call() {
            Map linkedHashMap = new LinkedHashMap();
            for (gqb gqb : ((gsi) this.a.e.get()).a(gqf.JAVA)) {
                linkedHashMap.put(gqb.a, gqb.b);
            }
            Throwable th = this.b;
            if (th instanceof zfd) {
                linkedHashMap.put("CALLSITE", ((zfd) th).a.toString());
                linkedHashMap.put("JIRA_PROJECT", ((zfd) this.b).a.a.getProject().projectName);
            }
            List a = ((gpz) this.a.f.get()).a();
            Object uuid = iig.a().toString();
            akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
            String message = this.b.getMessage();
            if (message == null) {
                message = "";
            }
            String str = message;
            Object name = this.b.getClass().getName();
            akcr.a(name, "throwable.javaClass.name");
            Object obj = (String) this.a.b.b();
            akcr.a(obj, "appVersion");
            String a2 = gst.a(this.b);
            Object obj2 = this.a.g.get();
            akcr.a(obj2, "crashUserDataProvider.get()");
            return new gqv(uuid, str, name, obj, a2, linkedHashMap, a, ((abkm) obj2).c(), ((gsj) this.a.h.get()).a(), ((ifb) this.a.j.get()).h(), ((ifb) this.a.j.get()).k());
        }
    }

    /* renamed from: gst$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ gst a;

        e(gst gst) {
            this.a = gst;
        }

        public final /* synthetic */ Object apply(Object obj) {
            gqv gqv = (gqv) obj;
            akcr.b(gqv, "annotatedJavaCrash");
            obj = this.a.d.f(new h(gqv));
            akcr.a(obj, "serializationHelper.map …tatedJavaCrash)\n        }");
            return obj;
        }
    }

    /* renamed from: gst$f */
    static final class f<T, R> implements ajfc<String, ajdb> {
        private /* synthetic */ gst a;

        f(gst gst) {
            this.a = gst;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "serializedString");
            Object f = ((grq) this.a.a.b()).a().f(c.a);
            akcr.a(f, "getJavaCrashFolder()\n   …@map it\n                }");
            obj = f.e((ajfc) new i(str));
            akcr.a(obj, "crashLogFileManager.getJ…      }\n                }");
            return obj;
        }
    }

    /* renamed from: gst$g */
    static final class g<T> implements ajfl<Throwable> {
        private /* synthetic */ gst a;

        g(gst gst) {
            this.a = gst;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            ((grt) this.a.i.get()).b(null, ailp.JAVA, gst.a(th));
            return true;
        }
    }

    /* renamed from: gst$h */
    static final class h<T, R> implements ajfc<T, R> {
        private /* synthetic */ gqv a;

        h(gqv gqv) {
            this.a = gqv;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iha iha = (iha) obj;
            akcr.b(iha, "it");
            return iha.b(this.a);
        }
    }

    /* renamed from: gst$i */
    static final class i<T, R> implements ajfc<File, ajdb> {
        final /* synthetic */ String a;

        i(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final File file = (File) obj;
            akcr.b(file, "it");
            return ajcx.a((ajev) new ajev(this) {
                private /* synthetic */ i a;

                /* JADX WARNING: Missing block: B:13:0x0047, code skipped:
            defpackage.akax.a(r1, r0);
     */
                public final void run() {
                    /*
                    r4 = this;
                    r0 = new java.io.File;
                    r1 = r2;
                    r2 = defpackage.iig.a();
                    r2 = r2.toString();
                    r0.<init>(r1, r2);
                    r1 = r0.exists();
                    if (r1 != 0) goto L_0x004b;
                L_0x0015:
                    r1 = r0.createNewFile();
                    if (r1 == 0) goto L_0x004b;
                L_0x001b:
                    r1 = defpackage.akfp.a;
                    r2 = new java.io.FileOutputStream;
                    r2.<init>(r0);
                    r2 = (java.io.OutputStream) r2;
                    r0 = new java.io.OutputStreamWriter;
                    r0.<init>(r2, r1);
                    r0 = (java.io.Writer) r0;
                    r1 = new java.io.BufferedWriter;
                    r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
                    r1.<init>(r0, r2);
                    r1 = (java.io.Closeable) r1;
                    r0 = 0;
                    r2 = r1;
                    r2 = (java.io.BufferedWriter) r2;	 Catch:{ Throwable -> 0x0045 }
                    r3 = r4.a;	 Catch:{ Throwable -> 0x0045 }
                    r3 = r3.a;	 Catch:{ Throwable -> 0x0045 }
                    r2.write(r3);	 Catch:{ Throwable -> 0x0045 }
                    defpackage.akax.a(r1, r0);
                    return;
                L_0x0043:
                    r2 = move-exception;
                    goto L_0x0047;
                L_0x0045:
                    r0 = move-exception;
                    throw r0;	 Catch:{ all -> 0x0043 }
                L_0x0047:
                    defpackage.akax.a(r1, r0);
                    throw r2;
                L_0x004b:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.gst$i$1.run():void");
                }
            });
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(gst.class), "crashLogFileManager", "getCrashLogFileManager()Lcom/snap/crash/impl/CrashLogFileManager;"), new akdc(akde.a(gst.class), "appVersion", "getAppVersion()Ljava/lang/String;")};
        a aVar = new a();
    }

    public gst(igc igc, Context context, ajdx<iha> ajdx, aipn<gsi> aipn, aipn<gpz> aipn2, ajwy<abkm> ajwy, ajwy<gsj> ajwy2, ajwy<grt> ajwy3, ajwy<ifb> ajwy4) {
        akcr.b(igc, "storage");
        akcr.b(context, "context");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(aipn, "crashMetadataProvidersFactory");
        akcr.b(aipn2, "navigationBreadcrumbProvidersFactory");
        akcr.b(ajwy, "crashUserDataProvider");
        akcr.b(ajwy2, "crashPreferencesDataProvider");
        akcr.b(ajwy3, "crashAnalyticsHelper");
        akcr.b(ajwy4, "userAgent");
        this.c = context;
        this.d = ajdx;
        this.e = aipn;
        this.f = aipn2;
        this.g = ajwy;
        this.h = ajwy2;
        this.i = ajwy3;
        this.j = ajwy4;
        this.a = ajxh.a(new c(igc));
    }

    static String a(Throwable th) {
        try {
            Object stackTraceString = Log.getStackTraceString(th);
            akcr.a(stackTraceString, "Log.getStackTraceString(throwable)");
            return stackTraceString;
        } catch (Throwable unused) {
            Object localizedMessage = th.getLocalizedMessage();
            akcr.a(localizedMessage, "throwable.localizedMessage");
            return localizedMessage;
        }
    }

    public final int a() {
        return 1;
    }

    public final ajcx a(Thread thread, Throwable th) {
        akcr.b(thread, "thread");
        akcr.b(th, "throwable");
        Object c = ajdx.c((Callable) new d(this, th));
        akcr.a(c, "Single.fromCallable {\n  …ersionSuffix())\n        }");
        c = c.a((ajfc) new e(this)).e((ajfc) new f(this)).a((ajfl) new g(this));
        akcr.a(c, "prepareAnnotatedJavaCras… logErrorMessage(error) }");
        return c;
    }
}
