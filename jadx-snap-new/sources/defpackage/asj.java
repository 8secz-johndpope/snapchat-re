package defpackage;

import android.content.Context;
import android.content.Intent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.aitv.a;
import defpackage.asi.23;
import defpackage.asi.24;
import defpackage.asi.3;
import defpackage.asi.5;
import defpackage.asi.6;
import defpackage.asi.h;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.opencv.imgproc.Imgproc;

@airv(a = {asm.class})
/* renamed from: asj */
public class asj extends aiqo<Void> {
    final ConcurrentHashMap<String, String> a;
    ask b;
    ask c;
    private final long j;
    private asl k;
    private asi l;
    private String m;
    private String n;
    private String o;
    private float p;
    private boolean q;
    private final ate r;
    private aisx s;
    private ash t;

    /* renamed from: asj$a */
    public static class a {
        private float a = -1.0f;
        private boolean b = false;

        public final asj a() {
            if (this.a < MapboxConstants.MINIMUM_ZOOM) {
                this.a = 1.0f;
            }
            return new asj(this.a);
        }
    }

    /* renamed from: asj$c */
    static final class c implements asl {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }
    }

    /* renamed from: asj$b */
    static final class b implements Callable<Boolean> {
        private final ask a;

        public b(ask ask) {
            this.a = ask;
        }

        public final /* synthetic */ Object call() {
            if (!this.a.b().exists()) {
                return Boolean.FALSE;
            }
            aiqj.a().a("CrashlyticsCore", "Found previous crash marker.");
            this.a.b().delete();
            return Boolean.TRUE;
        }
    }

    /* renamed from: asj$2 */
    class 2 implements Callable<Void> {
        2() {
        }

        public final /* synthetic */ Object call() {
            asj.this.b.a();
            aiqj.a().a("CrashlyticsCore", "Initialization marker file created.");
            return null;
        }
    }

    /* renamed from: asj$3 */
    class 3 implements Callable<Boolean> {
        3() {
        }

        private Boolean a() {
            String str = "CrashlyticsCore";
            try {
                boolean delete = asj.this.b.b().delete();
                aiqj.a().a(str, "Initialization marker file removed: ".concat(String.valueOf(delete)));
                str = Boolean.valueOf(delete);
                return str;
            } catch (Exception e) {
                aiqj.a().c(str, "Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: asj$1 */
    class 1 extends airy<Void> {
        1() {
        }

        public final int a() {
            return 4;
        }

        public final /* synthetic */ Object call() {
            return asj.this.d();
        }
    }

    public asj() {
        this(1.0f);
    }

    asj(float f) {
        String str = "Crashlytics Exception Handler";
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(airk.a(str));
        airk.a(str, newSingleThreadExecutor);
        this(f, null, null, false, newSingleThreadExecutor);
    }

    private asj(float f, asl asl, ate ate, boolean z, ExecutorService executorService) {
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = f;
        this.k = new c();
        this.r = null;
        this.q = false;
        this.t = new ash(executorService);
        this.a = new ConcurrentHashMap();
        this.j = System.currentTimeMillis();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:38:0x01ca in {2, 5, 8, 9, 12, 13, 19, 20, 23, 24, 30, 32, 35, 37} preds:[]
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
    private boolean a(android.content.Context r19) {
        /*
        r18 = this;
        r12 = r18;
        r0 = r19;
        r1 = r12.q;
        r13 = 0;
        if (r1 == 0) goto L_0x000a;
        return r13;
        r1 = new aird;
        r1.<init>();
        r3 = defpackage.aird.a(r19);
        if (r3 != 0) goto L_0x0016;
        return r13;
        r4 = defpackage.airf.g(r19);
        r14 = 1;
        r1 = "com.crashlytics.RequireBuildId";
        r1 = defpackage.airf.a(r0, r1, r14);
        r2 = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
        r15 = "CrashlyticsCore";
        if (r1 != 0) goto L_0x0032;
        r1 = defpackage.aiqj.a();
        r5 = "Configured not to require a build ID.";
        r1.a(r15, r5);
        r1 = 1;
        goto L_0x0089;
        r1 = defpackage.airf.a(r4);
        if (r1 != 0) goto L_0x0039;
        goto L_0x0030;
        r1 = ".";
        android.util.Log.e(r15, r1);
        r5 = ".     |  | ";
        android.util.Log.e(r15, r5);
        r5 = ".     |  |";
        android.util.Log.e(r15, r5);
        android.util.Log.e(r15, r5);
        r6 = ".   \\ |  | /";
        android.util.Log.e(r15, r6);
        r6 = ".    \\    /";
        android.util.Log.e(r15, r6);
        r6 = ".     \\  /";
        android.util.Log.e(r15, r6);
        r6 = ".      \\/";
        android.util.Log.e(r15, r6);
        android.util.Log.e(r15, r1);
        android.util.Log.e(r15, r2);
        android.util.Log.e(r15, r1);
        r6 = ".      /\\";
        android.util.Log.e(r15, r6);
        r6 = ".     /  \\";
        android.util.Log.e(r15, r6);
        r6 = ".    /    \\";
        android.util.Log.e(r15, r6);
        r6 = ".   / |  | \\";
        android.util.Log.e(r15, r6);
        android.util.Log.e(r15, r5);
        android.util.Log.e(r15, r5);
        android.util.Log.e(r15, r5);
        android.util.Log.e(r15, r1);
        r1 = 0;
        if (r1 == 0) goto L_0x01c4;
        r11 = 0;
        r1 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x01b6 }
        r2 = "Initializing Crashlytics 2.6.3.25";	 Catch:{ Exception -> 0x01b6 }
        r1.c(r15, r2);	 Catch:{ Exception -> 0x01b6 }
        r9 = new aitc;	 Catch:{ Exception -> 0x01b6 }
        r9.<init>(r12);	 Catch:{ Exception -> 0x01b6 }
        r1 = new ask;	 Catch:{ Exception -> 0x01b6 }
        r2 = "crash_marker";	 Catch:{ Exception -> 0x01b6 }
        r1.<init>(r2, r9);	 Catch:{ Exception -> 0x01b6 }
        r12.c = r1;	 Catch:{ Exception -> 0x01b6 }
        r1 = new ask;	 Catch:{ Exception -> 0x01b6 }
        r2 = "initialization_marker";	 Catch:{ Exception -> 0x01b6 }
        r1.<init>(r2, r9);	 Catch:{ Exception -> 0x01b6 }
        r12.b = r1;	 Catch:{ Exception -> 0x01b6 }
        r1 = new aite;	 Catch:{ Exception -> 0x01b6 }
        r2 = r12.f;	 Catch:{ Exception -> 0x01b6 }
        r5 = "com.crashlytics.android.core.CrashlyticsCore";	 Catch:{ Exception -> 0x01b6 }
        r1.<init>(r2, r5);	 Catch:{ Exception -> 0x01b6 }
        r10 = new atf;	 Catch:{ Exception -> 0x01b6 }
        r10.<init>(r1, r12);	 Catch:{ Exception -> 0x01b6 }
        r1 = r12.r;	 Catch:{ Exception -> 0x01b6 }
        if (r1 == 0) goto L_0x00c6;	 Catch:{ Exception -> 0x01b6 }
        r1 = new asn;	 Catch:{ Exception -> 0x01b6 }
        r2 = r12.r;	 Catch:{ Exception -> 0x01b6 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x01b6 }
        goto L_0x00c7;	 Catch:{ Exception -> 0x01b6 }
        r1 = r11;	 Catch:{ Exception -> 0x01b6 }
        r2 = new aisu;	 Catch:{ Exception -> 0x01b6 }
        r5 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x01b6 }
        r2.<init>(r5);	 Catch:{ Exception -> 0x01b6 }
        r12.s = r2;	 Catch:{ Exception -> 0x01b6 }
        r2 = r12.s;	 Catch:{ Exception -> 0x01b6 }
        r2.a(r1);	 Catch:{ Exception -> 0x01b6 }
        r1 = r12.h;	 Catch:{ Exception -> 0x01b6 }
        r6 = r19.getPackageName();	 Catch:{ Exception -> 0x01b6 }
        r5 = r1.d();	 Catch:{ Exception -> 0x01b6 }
        r2 = r19.getPackageManager();	 Catch:{ Exception -> 0x01b6 }
        r2 = r2.getPackageInfo(r6, r13);	 Catch:{ Exception -> 0x01b6 }
        r7 = r2.versionCode;	 Catch:{ Exception -> 0x01b6 }
        r7 = java.lang.Integer.toString(r7);	 Catch:{ Exception -> 0x01b6 }
        r8 = r2.versionName;	 Catch:{ Exception -> 0x01b6 }
        if (r8 != 0) goto L_0x00f6;	 Catch:{ Exception -> 0x01b6 }
        r2 = "0.0";	 Catch:{ Exception -> 0x01b6 }
        goto L_0x00f8;	 Catch:{ Exception -> 0x01b6 }
        r2 = r2.versionName;	 Catch:{ Exception -> 0x01b6 }
        r8 = r2;	 Catch:{ Exception -> 0x01b6 }
        r2 = new arz;	 Catch:{ Exception -> 0x01b6 }
        r16 = r2;	 Catch:{ Exception -> 0x01b6 }
        r2 = r16;	 Catch:{ Exception -> 0x01b6 }
        r2.<init>(r3, r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x01b6 }
        r8 = new asy;	 Catch:{ Exception -> 0x01b6 }
        r7 = r16;	 Catch:{ Exception -> 0x01b6 }
        r2 = r7.d;	 Catch:{ Exception -> 0x01b6 }
        r8.<init>(r0, r2);	 Catch:{ Exception -> 0x01b6 }
        r6 = new asr;	 Catch:{ Exception -> 0x01b6 }
        r6.<init>(r12);	 Catch:{ Exception -> 0x01b6 }
        r16 = defpackage.arc.a(r19);	 Catch:{ Exception -> 0x01b6 }
        r2 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x01b6 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01b6 }
        r4 = "Installer package name is: ";	 Catch:{ Exception -> 0x01b6 }
        r3.<init>(r4);	 Catch:{ Exception -> 0x01b6 }
        r4 = r7.c;	 Catch:{ Exception -> 0x01b6 }
        r3.append(r4);	 Catch:{ Exception -> 0x01b6 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x01b6 }
        r2.a(r15, r3);	 Catch:{ Exception -> 0x01b6 }
        r5 = new asi;	 Catch:{ Exception -> 0x01b6 }
        r3 = r12.t;	 Catch:{ Exception -> 0x01b6 }
        r4 = r12.s;	 Catch:{ Exception -> 0x01b6 }
        r17 = r1;	 Catch:{ Exception -> 0x01b6 }
        r1 = r5;	 Catch:{ Exception -> 0x01b6 }
        r2 = r18;	 Catch:{ Exception -> 0x01b6 }
        r14 = r5;	 Catch:{ Exception -> 0x01b6 }
        r5 = r17;	 Catch:{ Exception -> 0x01b6 }
        r17 = r6;	 Catch:{ Exception -> 0x01b6 }
        r6 = r10;	 Catch:{ Exception -> 0x01b6 }
        r10 = r7;	 Catch:{ Exception -> 0x01b6 }
        r7 = r9;	 Catch:{ Exception -> 0x01b6 }
        r9 = r8;	 Catch:{ Exception -> 0x01b6 }
        r8 = r10;	 Catch:{ Exception -> 0x01b6 }
        r10 = r17;	 Catch:{ Exception -> 0x01b6 }
        r11 = r16;	 Catch:{ Exception -> 0x01b6 }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ Exception -> 0x01b6 }
        r12.l = r14;	 Catch:{ Exception -> 0x01b6 }
        r1 = r12.b;	 Catch:{ Exception -> 0x01b6 }
        r1 = r1.b();	 Catch:{ Exception -> 0x01b6 }
        r1 = r1.exists();	 Catch:{ Exception -> 0x01b6 }
        r2 = r12.t;	 Catch:{ Exception -> 0x01b6 }
        r3 = new asj$b;	 Catch:{ Exception -> 0x01b6 }
        r4 = r12.c;	 Catch:{ Exception -> 0x01b6 }
        r3.<init>(r4);	 Catch:{ Exception -> 0x01b6 }
        r2 = r2.a(r3);	 Catch:{ Exception -> 0x01b6 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ Exception -> 0x01b6 }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ Exception -> 0x01b6 }
        r3.equals(r2);	 Catch:{ Exception -> 0x01b6 }
        r2 = new airl;	 Catch:{ Exception -> 0x01b6 }
        r2.<init>();	 Catch:{ Exception -> 0x01b6 }
        r2 = defpackage.airl.a(r19);	 Catch:{ Exception -> 0x01b6 }
        r3 = r12.l;	 Catch:{ Exception -> 0x01b6 }
        r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler();	 Catch:{ Exception -> 0x01b6 }
        r5 = r3.f;	 Catch:{ Exception -> 0x01b6 }
        r6 = new asi$4;	 Catch:{ Exception -> 0x01b6 }
        r6.<init>();	 Catch:{ Exception -> 0x01b6 }
        r5.b(r6);	 Catch:{ Exception -> 0x01b6 }
        r5 = new asi$21;	 Catch:{ Exception -> 0x01b6 }
        r5.<init>();	 Catch:{ Exception -> 0x01b6 }
        r6 = new aso;	 Catch:{ Exception -> 0x01b6 }
        r7 = new asi$c;	 Catch:{ Exception -> 0x01b6 }
        r7.<init>(r13);	 Catch:{ Exception -> 0x01b6 }
        r6.<init>(r5, r7, r2, r4);	 Catch:{ Exception -> 0x01b6 }
        r3.p = r6;	 Catch:{ Exception -> 0x01b6 }
        r2 = r3.p;	 Catch:{ Exception -> 0x01b6 }
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r2);	 Catch:{ Exception -> 0x01b6 }
        if (r1 == 0) goto L_0x01ab;	 Catch:{ Exception -> 0x01b6 }
        r0 = defpackage.airf.h(r19);	 Catch:{ Exception -> 0x01b6 }
        if (r0 == 0) goto L_0x01ab;	 Catch:{ Exception -> 0x01b6 }
        r0 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x01b6 }
        r1 = "Crashlytics did not finish previous background initialization. Initializing synchronously.";	 Catch:{ Exception -> 0x01b6 }
        r0.a(r15, r1);	 Catch:{ Exception -> 0x01b6 }
        r18.k();	 Catch:{ Exception -> 0x01b6 }
        return r13;
        r0 = defpackage.aiqj.a();
        r1 = "Exception handling initialization successful";
        r0.a(r15, r1);
        r0 = 1;
        return r0;
        r0 = move-exception;
        r1 = defpackage.aiqj.a();
        r2 = "Crashlytics was not started due to an exception during initialization";
        r1.c(r15, r2, r0);
        r1 = 0;
        r12.l = r1;
        return r13;
        r0 = new aise;
        r0.<init>(r2);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asj.a(android.content.Context):boolean");
    }

    private static boolean d(String str) {
        asj f = asj.f();
        if (f != null && f.l != null) {
            return true;
        }
        String str2 = "CrashlyticsCore";
        aiqj.a().c(str2, "Crashlytics must be initialized by calling Fabric.with(Context) ".concat(String.valueOf(str)), null);
        return false;
    }

    private static String e(String str) {
        if (str == null) {
            return str;
        }
        str = str.trim();
        return str.length() > Imgproc.INTER_TAB_SIZE2 ? str.substring(0, Imgproc.INTER_TAB_SIZE2) : str;
    }

    public static asj f() {
        return (asj) aiqj.a(asj.class);
    }

    private void k() {
        Throwable e;
        aiqr a;
        String str;
        1 1 = new 1();
        for (aisd a2 : this.e.am_()) {
            1.a(a2);
        }
        Future submit = this.d.a.submit(1);
        String str2 = "CrashlyticsCore";
        aiqj.a().a(str2, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            a = aiqj.a();
            str = "Crashlytics was interrupted during initialization.";
            a.c(str2, str, e);
        } catch (ExecutionException e3) {
            e = e3;
            a = aiqj.a();
            str = "Problem encountered during Crashlytics initialization.";
            a.c(str2, str, e);
        } catch (TimeoutException e4) {
            e = e4;
            a = aiqj.a();
            str = "Crashlytics timed out during initialization.";
            a.c(str2, str, e);
        }
    }

    private void l() {
        this.t.b(new 3());
    }

    public final String a() {
        return "2.6.3.25";
    }

    public final void a(String str) {
        if (!this.q && asj.d("prior to logging messages.")) {
            long currentTimeMillis = System.currentTimeMillis() - this.j;
            asi asi = this.l;
            StringBuilder stringBuilder = new StringBuilder("D/");
            stringBuilder.append("CrashlyticsCore");
            stringBuilder.append(" ");
            stringBuilder.append(str);
            asi.f.b(new 23(currentTimeMillis, stringBuilder.toString()));
        }
    }

    public final void a(String str, String str2) {
        if (!this.q && asj.d("prior to setting keys.")) {
            String str3 = "CrashlyticsCore";
            if (str == null) {
                Context context = this.f;
                if (context == null || !airf.d(context)) {
                    aiqj.a().c(str3, "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            str = asj.e(str);
            if (this.a.size() < 64 || this.a.containsKey(str)) {
                this.a.put(str, str2 == null ? "" : asj.e(str2));
                asi asi = this.l;
                asi.f.b(new 3(this.a));
                return;
            }
            aiqj.a().a(str3, "Exceeded maximum number of custom attributes (64)");
        }
    }

    public final void a(Throwable th) {
        if (this.q || !asj.d("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            aiqj.a().a(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
            return;
        }
        asi asi = this.l;
        Thread currentThread = Thread.currentThread();
        asi.f.a(new 24(new Date(), currentThread, th));
    }

    public final String b() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public final void b(String str) {
        if (!this.q && asj.d("prior to setting user data.")) {
            this.o = asj.e(str);
            this.l.a(this.o, this.n);
        }
    }

    public final void c(String str) {
        if (!this.q && asj.d("prior to setting user data.")) {
            this.n = asj.e(str);
            this.l.a(this.o, this.n);
        }
    }

    public final boolean d_() {
        return a(this.f);
    }

    /* Access modifiers changed, original: protected|final */
    /* renamed from: e */
    public final Void d() {
        String str = "CrashlyticsCore";
        this.t.a(new 2());
        asi asi = this.l;
        asi.f.a(new 6());
        try {
            ast ast = this.l.l;
            boolean z = true;
            if (!ast.d.getAndSet(true)) {
                Intent registerReceiver = ast.e.registerReceiver(null, ast.a);
                int i = -1;
                if (registerReceiver != null) {
                    i = registerReceiver.getIntExtra("status", -1);
                }
                if (i != 2) {
                    if (i != 5) {
                        z = false;
                    }
                }
                ast.h = z;
                ast.e.registerReceiver(ast.g, ast.b);
                ast.e.registerReceiver(ast.f, ast.c);
            }
            aity a = a.a.a();
            if (a == null) {
                aiqj.a().d(str, "Received null settings, skipping report submission!");
                l();
                return null;
            }
            asi asi2 = this.l;
            if (a.d.d && asi2.n.a()) {
                aiqj.a().a(str, "Registered Firebase Analytics event listener");
            }
            if (a.d.b) {
                asi2 = this.l;
                if (!((Boolean) asi2.f.a(new 5(a.b))).booleanValue()) {
                    aiqj.a().a(str, "Could not finalize previous sessions.");
                }
                asi2 = this.l;
                float f = this.p;
                if (a == null) {
                    aiqj.a().d(str, "Could not send reports. Settings are not available.");
                } else {
                    new atj(asi2.h.a, asi2.b(a.a.c, a.a.d), asi2.j, asi2.k).a(f, asi2.a(a) ? new h(asi2.e, asi2.g, a.c) : new atj.a());
                }
                l();
                return null;
            }
            aiqj.a().a(str, "Collection of crash reports disabled in Crashlytics settings.");
            l();
            return null;
        } catch (Exception e) {
            aiqj.a().c(str, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            l();
        }
    }

    /* Access modifiers changed, original: final */
    public final String g() {
        return this.h.b ? this.n : null;
    }

    /* Access modifiers changed, original: final */
    public final String h() {
        return this.h.b ? this.o : null;
    }
}
