package defpackage;

import android.content.Context;
import android.os.Debug;
import com.looksery.sdk.diagnostics.VmDumper;
import com.snap.crash.impl.anr.durableJob.AnrDetectionDurableJob;
import defpackage.gqi.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: gsb */
public final class gsb {
    final AtomicLong a = new AtomicLong();
    public volatile boolean b = true;
    volatile long c;
    volatile gqi d;
    final Runnable e = new b(this);
    final a f;
    final zfr g;
    final ajdw h;
    final Set<gqj> i;
    final hwl j;
    final ajei k;
    private final boolean l = true;
    private final zfw m = zgb.a(gqe.a, "AnrWatchDog");
    private final Runnable n = new a(this);
    private final ajwy<gsi> o;
    private final ajwy<gpz> p;
    private final Context q;
    private final AtomicLong r;
    private final Map<a, gqh> s;

    /* renamed from: gsb$a */
    static final class a implements Runnable {
        private /* synthetic */ gsb a;

        a(gsb gsb) {
            this.a = gsb;
        }

        public final void run() {
            if (!(Debug.isDebuggerConnected() || this.a.b)) {
                gsb gsb = this.a;
                gsb.c = gsb.a(gsb);
                gsb = this.a;
                int i = gsc.a[gsb.f.ordinal()];
                if (i == 1 || i == 2) {
                    gsb.g.a((Runnable) new g(gsb));
                } else if (i == 3) {
                    ajej e = gsb.j.a((hwg) new AnrDetectionDurableJob(new gry())).b((ajdw) gsb.g).e();
                    akcr.a((Object) e, "durableJobManager.submit…             .subscribe()");
                    ajvv.a(e, gsb.k);
                }
                gsb = this.a;
                i = gsc.b[gsb.f.ordinal()];
                if (i == 1 || i == 2) {
                    gsb.h.a(gsb.e, 5000, TimeUnit.MILLISECONDS);
                } else if (i == 3) {
                    gsb.h.a(gsb.e, 30000, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* renamed from: gsb$b */
    static final class b implements Runnable {
        private /* synthetic */ gsb a;

        b(gsb gsb) {
            this.a = gsb;
        }

        public final void run() {
            gqi gqi = this.a.d;
            if (gsb.a(this.a) != this.a.c || Debug.isDebuggerConnected()) {
                this.a.a();
            } else if (gqi == null) {
                gsb gsb = this.a;
                gsb.d = gsb.a(null, "");
                this.a.b();
            } else {
                gsb gsb2 = this.a;
                gsb2.d = null;
                gqi a = gsb2.a((Throwable) gqi, gsb2.c());
                if (a != null) {
                    gqi = a;
                }
                for (gqj a2 : gsb2.i) {
                    a2.a(gqi);
                }
                this.a.b = true;
            }
        }
    }

    /* renamed from: gsb$h */
    public static final class h implements Runnable {
        private /* synthetic */ gsb a;

        public h(gsb gsb) {
            this.a = gsb;
        }

        public final void run() {
            this.a.b = true;
        }
    }

    /* renamed from: gsb$g */
    static final class g implements Runnable {
        private /* synthetic */ gsb a;

        g(gsb gsb) {
            this.a = gsb;
        }

        public final void run() {
            this.a.a.incrementAndGet();
        }
    }

    /* renamed from: gsb$c */
    static final class c extends akcs implements akbl<String, ajxw> {
        private /* synthetic */ StringBuilder a;

        c(StringBuilder stringBuilder) {
            this.a = stringBuilder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, "line");
            StringBuilder stringBuilder = this.a;
            stringBuilder.append(str);
            stringBuilder.append(10);
            return ajxw.a;
        }
    }

    /* renamed from: gsb$d */
    static final class d extends akcq implements akcf<String, idd, Throwable, StackTraceElement[], String, Map<String, ? extends String>, List<? extends ailj>, Boolean, gqm> {
        public static final d a = new d();

        d() {
            super(8);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(gqm.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Lcom/snap/framework/attribution/AttributedCallsite;Ljava/lang/Throwable;[Ljava/lang/StackTraceElement;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            String str = (String) obj;
            idd idd = (idd) obj2;
            Throwable th = (Throwable) obj3;
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj4;
            String str2 = (String) obj5;
            Map map = (Map) obj6;
            List list = (List) obj7;
            boolean booleanValue = ((Boolean) obj8).booleanValue();
            akcr.b(str, "p1");
            akcr.b(stackTraceElementArr, "p4");
            akcr.b(str2, "p5");
            akcr.b(map, "p6");
            akcr.b(list, "p7");
            return new gqm(str, idd, th, stackTraceElementArr, str2, map, list, booleanValue);
        }
    }

    /* renamed from: gsb$e */
    static final class e extends akcq implements akcf<String, idd, Throwable, StackTraceElement[], String, Map<String, ? extends String>, List<? extends ailj>, Boolean, gqk> {
        public static final e a = new e();

        e() {
            super(8);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(gqk.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Lcom/snap/framework/attribution/AttributedCallsite;Ljava/lang/Throwable;[Ljava/lang/StackTraceElement;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            String str = (String) obj;
            idd idd = (idd) obj2;
            Throwable th = (Throwable) obj3;
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj4;
            String str2 = (String) obj5;
            Map map = (Map) obj6;
            List list = (List) obj7;
            boolean booleanValue = ((Boolean) obj8).booleanValue();
            akcr.b(str, "p1");
            akcr.b(stackTraceElementArr, "p4");
            akcr.b(str2, "p5");
            akcr.b(map, "p6");
            akcr.b(list, "p7");
            return new gqk(str, idd, th, stackTraceElementArr, str2, map, list, booleanValue);
        }
    }

    /* renamed from: gsb$f */
    static final class f extends akcq implements akcf<String, idd, Throwable, StackTraceElement[], String, Map<String, ? extends String>, List<? extends ailj>, Boolean, gql> {
        public static final f a = new f();

        f() {
            super(8);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(gql.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/String;Lcom/snap/framework/attribution/AttributedCallsite;Ljava/lang/Throwable;[Ljava/lang/StackTraceElement;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            String str = (String) obj;
            idd idd = (idd) obj2;
            Throwable th = (Throwable) obj3;
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) obj4;
            String str2 = (String) obj5;
            Map map = (Map) obj6;
            List list = (List) obj7;
            boolean booleanValue = ((Boolean) obj8).booleanValue();
            akcr.b(str, "p1");
            akcr.b(stackTraceElementArr, "p4");
            akcr.b(str2, "p5");
            akcr.b(map, "p6");
            akcr.b(list, "p7");
            return new gql(str, idd, th, stackTraceElementArr, str2, map, list, booleanValue);
        }
    }

    public gsb(a aVar, zfr zfr, ajdw ajdw, Set<? extends gqj> set, ajwy<gsi> ajwy, ajwy<gpz> ajwy2, Context context, zgb zgb, hwl hwl, ajei ajei, AtomicLong atomicLong, Map<a, ? extends gqh> map) {
        akcr.b(aVar, "anrType");
        akcr.b(zfr, "targetThread");
        akcr.b(ajdw, "monitorThread");
        akcr.b(set, "anrListeners");
        akcr.b(ajwy, "crashMetadataProvidersFactory");
        akcr.b(ajwy2, "crashBreadcrumbProvidersFactory");
        akcr.b(context, "appContext");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(hwl, "durableJobManager");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(atomicLong, "durableJobmanagerTicker");
        akcr.b(map, "decorators");
        this.f = aVar;
        this.g = zfr;
        this.h = ajdw;
        this.i = set;
        this.o = ajwy;
        this.p = ajwy2;
        this.q = context;
        this.j = hwl;
        this.k = ajei;
        this.r = atomicLong;
        this.s = map;
    }

    public static final /* synthetic */ long a(gsb gsb) {
        AtomicLong atomicLong;
        int i = gsc.c[gsb.f.ordinal()];
        if (i == 1 || i == 2) {
            atomicLong = gsb.a;
        } else if (i == 3) {
            atomicLong = gsb.r;
        } else {
            throw new ajxk();
        }
        return atomicLong.get();
    }

    private static String a(Thread thread, StackTraceElement... stackTraceElementArr) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(thread.getName());
        stringBuilder2.append(" (state = ");
        stringBuilder2.append(thread.getState());
        stringBuilder2.append(10);
        stringBuilder.append(stringBuilder2.toString());
        for (Object obj : stackTraceElementArr) {
            StringBuilder stringBuilder3 = new StringBuilder("\tat ");
            stringBuilder3.append(obj);
            stringBuilder3.append(10);
            stringBuilder.append(stringBuilder3.toString());
        }
        Object stringBuilder4 = stringBuilder.toString();
        akcr.a(stringBuilder4, "StringBuilder().apply {\n…\") }\n        }.toString()");
        return stringBuilder4;
    }

    private static boolean a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        if (th == null) {
            return false;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTraceElementArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            int i3 = i2 + 1;
            if (stackTrace[i2] == null || !stackTraceElement.equals(stackTrace[i2])) {
                return false;
            }
            i++;
            i2 = i3;
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:86:0x01fd in {4, 6, 7, 8, 11, 16, 18, 23, 28, 29, 30, 33, 36, 40, 43, 44, 48, 52, 55, 56, 62, 64, 65, 66, 72, 74, 75, 76, 79, 81, 83, 85} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.gqi a(java.lang.Throwable r19, java.lang.String r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = "runtimeDump";
        r7 = r20;
        defpackage.akcr.b(r7, r1);
        r1 = r0.f;
        r2 = defpackage.gsc.d;
        r1 = r1.ordinal();
        r1 = r2[r1];
        r2 = 3;
        r3 = 2;
        r4 = 1;
        if (r1 == r4) goto L_0x0030;
        if (r1 == r3) goto L_0x0023;
        if (r1 != r2) goto L_0x001d;
        goto L_0x0023;
        r1 = new ajxk;
        r1.<init>();
        throw r1;
        r1 = r0.m;
        r1 = r1.m();
        r1 = (defpackage.zfr) r1;
        r1 = r1.a();
        goto L_0x0034;
        r1 = android.os.Looper.getMainLooper();
        r5 = 0;
        if (r1 != 0) goto L_0x0038;
        return r5;
        r1 = r1.getThread();
        r6 = "thread";
        defpackage.akcr.a(r1, r6);
        r6 = r1.getStackTrace();
        r8 = "thread.stackTrace";
        defpackage.akcr.a(r6, r8);
        r9 = r0.f;
        r10 = "threadStack";
        defpackage.akcr.b(r6, r10);
        r10 = "anrType";
        defpackage.akcr.b(r9, r10);
        r10 = defpackage.gsc.h;
        r9 = r9.ordinal();
        r9 = r10[r9];
        r10 = 0;
        if (r9 == r4) goto L_0x006c;
        if (r9 == r3) goto L_0x00c6;
        if (r9 != r2) goto L_0x0066;
        goto L_0x00c6;
        r1 = new ajxk;
        r1.<init>();
        throw r1;
        r9 = new java.util.ArrayList;
        r9.<init>();
        r11 = r6.length;
        r12 = 0;
        r13 = 0;
        if (r12 >= r11) goto L_0x00b2;
        r14 = r6[r12];
        if (r13 == 0) goto L_0x007e;
        r9.add(r14);
        goto L_0x00ad;
        r15 = r14.toString();
        r5 = "element.toString()";
        defpackage.akcr.a(r15, r5);
        r15 = (java.lang.CharSequence) r15;
        r17 = "com.snap";
        r2 = r17;
        r2 = (java.lang.CharSequence) r2;
        r2 = defpackage.akgc.a(r15, r2, false);
        if (r2 == 0) goto L_0x00ad;
        r2 = r14.toString();
        defpackage.akcr.a(r2, r5);
        r2 = (java.lang.CharSequence) r2;
        r5 = "com.snap.core.db";
        r5 = (java.lang.CharSequence) r5;
        r2 = defpackage.akgc.a(r2, r5, false);
        if (r2 == 0) goto L_0x00a9;
        goto L_0x00ad;
        r9.add(r14);
        r13 = 1;
        r12 = r12 + 1;
        r2 = 3;
        r5 = 0;
        goto L_0x0074;
        r2 = r9.isEmpty();
        if (r2 == 0) goto L_0x00b9;
        goto L_0x00c6;
        r9 = (java.util.Collection) r9;
        r2 = new java.lang.StackTraceElement[r10];
        r2 = r9.toArray(r2);
        if (r2 == 0) goto L_0x01f5;
        r6 = r2;
        r6 = (java.lang.StackTraceElement[]) r6;
        r2 = r0.f;
        r5 = defpackage.gsc.e;
        r2 = r2.ordinal();
        r2 = r5[r2];
        if (r2 == r4) goto L_0x00d5;
        if (r2 == r3) goto L_0x00d5;
        goto L_0x00f6;
        r2 = r6.length;
        if (r2 != 0) goto L_0x00da;
        r2 = 1;
        goto L_0x00db;
        r2 = 0;
        if (r2 != 0) goto L_0x01f3;
        r2 = r6[r10];
        r2 = r2.getMethodName();
        r5 = "threadStack[0].methodName";
        defpackage.akcr.a(r2, r5);
        r2 = (java.lang.CharSequence) r2;
        r5 = "nativePollOnce";
        r5 = (java.lang.CharSequence) r5;
        r2 = defpackage.akgc.a(r2, r5, false);
        if (r2 == 0) goto L_0x00f6;
        goto L_0x01f3;
        r2 = r0.o;
        r2 = r2.get();
        r2 = (defpackage.gsi) r2;
        r5 = defpackage.gqf.ANR;
        r2 = r2.a(r5);
        r2 = (java.lang.Iterable) r2;
        r5 = 10;
        r5 = defpackage.ajyn.a(r2, r5);
        r5 = defpackage.ajzm.a(r5);
        r9 = 16;
        r5 = defpackage.akef.b(r5, r9);
        r9 = new java.util.LinkedHashMap;
        r9.<init>(r5);
        r9 = (java.util.Map) r9;
        r2 = r2.iterator();
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x0135;
        r5 = r2.next();
        r5 = (defpackage.gqb) r5;
        r10 = r5.a;
        r5 = r5.b;
        r9.put(r10, r5);
        goto L_0x0121;
        r2 = r0.p;
        r2 = r2.get();
        r2 = (defpackage.gpz) r2;
        r10 = r2.a();
        r2 = r0.g;
        r2 = r2.a();
        r2 = r2.getThread();
        r5 = "targetThread.looper.thread";
        defpackage.akcr.a(r2, r5);
        r5 = "t";
        defpackage.akcr.b(r2, r5);
        r11 = defpackage.zgf.a;
        defpackage.akcr.b(r2, r5);
        r5 = r11.a;
        r11 = r2.getId();
        r2 = java.lang.Long.valueOf(r11);
        r2 = r5.get(r2);
        r2 = (java.util.LinkedList) r2;
        if (r2 == 0) goto L_0x0177;
        r2 = r2.getLast();
        r2 = (defpackage.idd) r2;
        r5 = r19;
        r16 = r2;
        goto L_0x017b;
        r5 = r19;
        r16 = 0;
        r2 = defpackage.gsb.a(r6, r5);
        r6 = r0.f;
        r11 = defpackage.gsc.f;
        r6 = r6.ordinal();
        r6 = r11[r6];
        if (r6 == r4) goto L_0x019c;
        if (r6 == r3) goto L_0x0199;
        r11 = 3;
        if (r6 != r11) goto L_0x0193;
        r6 = defpackage.gsb.f.a;
        goto L_0x019e;
        r1 = new ajxk;
        r1.<init>();
        throw r1;
        r6 = defpackage.gsb.e.a;
        goto L_0x019e;
        r6 = defpackage.gsb.d.a;
        r11 = r0.f;
        r12 = defpackage.gsc.g;
        r11 = r11.ordinal();
        r11 = r12[r11];
        if (r11 == r4) goto L_0x01bb;
        if (r11 == r3) goto L_0x01b8;
        r3 = 3;
        if (r11 != r3) goto L_0x01b2;
        r3 = "Durable job manager ANR detected.";
        goto L_0x01bd;
        r1 = new ajxk;
        r1.<init>();
        throw r1;
        r3 = "Database write thread ANR detected.";
        goto L_0x01bd;
        r3 = "Main thread ANR detected.";
        r4 = r0.s;
        r11 = r0.f;
        r4 = r4.get(r11);
        r4 = (defpackage.gqh) r4;
        if (r4 != 0) goto L_0x01d0;
        r4 = new gqn;
        r4.<init>();
        r4 = (defpackage.gqh) r4;
        r6 = (defpackage.akcf) r6;
        r3 = r4.a(r3);
        r1 = r1.getStackTrace();
        defpackage.akcr.a(r1, r8);
        r11 = java.lang.Boolean.valueOf(r2);
        r2 = r6;
        r4 = r16;
        r5 = r19;
        r6 = r1;
        r7 = r20;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r1 = r2.invoke(r3, r4, r5, r6, r7, r8, r9, r10);
        r1 = (defpackage.gqi) r1;
        return r1;
        r1 = 0;
        return r1;
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type kotlin.Array<T>";
        r1.<init>(r2);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsb.a(java.lang.Throwable, java.lang.String):gqi");
    }

    public final void a() {
        this.d = null;
        b();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        this.m.b().a(this.n, this.f == a.DURABLE_JOB ? 30000 : 0, TimeUnit.MILLISECONDS);
    }

    /* Access modifiers changed, original: final */
    public final String c() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.f.name());
        stringBuilder2.append("_anr_watchdog_internal_traces.txt");
        File file = new File(this.q.getCacheDir(), stringBuilder2.toString());
        if (file.exists()) {
            file.delete();
        }
        Object obj = null;
        try {
            VmDumper.captureStateToFile(file.getAbsolutePath());
            if (file.length() > 0) {
                obj = 1;
            }
        } catch (Exception unused) {
        }
        if (obj != null) {
            akbl cVar = new c(stringBuilder);
            Charset charset = akfp.a;
            akcr.b(file, "receiver$0");
            akcr.b(charset, "charset");
            akcr.b(cVar, "action");
            akbh.a((Reader) new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), cVar);
            file.delete();
        } else {
            obj = Thread.getAllStackTraces();
            akcr.a(obj, "Thread.getAllStackTraces()");
            for (Entry entry : obj.entrySet()) {
                Thread thread = (Thread) entry.getKey();
                Object obj2 = (StackTraceElement[]) entry.getValue();
                akcr.a((Object) thread, "key");
                akcr.a(obj2, "value");
                stringBuilder.append(gsb.a(thread, (StackTraceElement[]) Arrays.copyOf(obj2, obj2.length)));
                stringBuilder.append(10);
            }
        }
        Object stringBuilder3 = stringBuilder.toString();
        akcr.a(stringBuilder3, "dumpBuilder.toString()");
        return stringBuilder3;
    }
}
