package defpackage;

import com.samsung.android.sdk.camera.SCamera;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* renamed from: atj */
final class atj {
    static final Map<String, String> a = Collections.singletonMap("X-CRASHLYTICS-INVALID-SESSION", SCamera.CAMERA_ID_FRONT);
    static final short[] b = new short[]{(short) 10, (short) 20, (short) 30, (short) 60, (short) 120, (short) 300};
    final b c;
    Thread d;
    private final Object e = new Object();
    private final asq f;
    private final String g;
    private final c h;

    /* renamed from: atj$c */
    interface c {
        File[] a();

        File[] b();

        File[] c();
    }

    /* renamed from: atj$b */
    interface b {
        boolean a();
    }

    /* renamed from: atj$a */
    static final class a implements d {
        a() {
        }

        public final boolean a() {
            return true;
        }
    }

    /* renamed from: atj$e */
    class e extends aire {
        private final float a;
        private final d b;

        e(float f, d dVar) {
            this.a = f;
            this.b = dVar;
        }

        /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x0107=Splitter:B:36:0x0107, B:7:0x002f=Splitter:B:7:0x002f} */
        /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002f */
        /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|7|8|9|40|41) */
        /* JADX WARNING: Can't wrap try/catch for region: R(2:36|37) */
        /* JADX WARNING: Missing block: B:37:?, code skipped:
            r1 = java.lang.Thread.currentThread();
     */
        public final void a() {
            /*
            r8 = this;
            r0 = "CrashlyticsCore";
            r1 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x010d }
            r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x010d }
            r3 = "Starting report processing in ";
            r2.<init>(r3);	 Catch:{ Exception -> 0x010d }
            r3 = r8.a;	 Catch:{ Exception -> 0x010d }
            r2.append(r3);	 Catch:{ Exception -> 0x010d }
            r3 = " second(s)...";
            r2.append(r3);	 Catch:{ Exception -> 0x010d }
            r2 = r2.toString();	 Catch:{ Exception -> 0x010d }
            r1.a(r0, r2);	 Catch:{ Exception -> 0x010d }
            r1 = r8.a;	 Catch:{ Exception -> 0x010d }
            r2 = 0;
            r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
            if (r1 <= 0) goto L_0x0038;
        L_0x0025:
            r1 = r8.a;	 Catch:{ InterruptedException -> 0x002f }
            r2 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
            r1 = r1 * r2;
            r1 = (long) r1;	 Catch:{ InterruptedException -> 0x002f }
            java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x002f }
            goto L_0x0038;
        L_0x002f:
            r1 = java.lang.Thread.currentThread();	 Catch:{ Exception -> 0x010d }
        L_0x0033:
            r1.interrupt();	 Catch:{ Exception -> 0x010d }
            goto L_0x0117;
        L_0x0038:
            r1 = defpackage.atj.this;	 Catch:{ Exception -> 0x010d }
            r1 = r1.a();	 Catch:{ Exception -> 0x010d }
            r2 = defpackage.atj.this;	 Catch:{ Exception -> 0x010d }
            r2 = r2.c;	 Catch:{ Exception -> 0x010d }
            r2 = r2.a();	 Catch:{ Exception -> 0x010d }
            if (r2 != 0) goto L_0x0117;
        L_0x0048:
            r2 = r1.isEmpty();	 Catch:{ Exception -> 0x010d }
            if (r2 != 0) goto L_0x0088;
        L_0x004e:
            r2 = r8.b;	 Catch:{ Exception -> 0x010d }
            r2 = r2.a();	 Catch:{ Exception -> 0x010d }
            if (r2 != 0) goto L_0x0088;
        L_0x0056:
            r2 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x010d }
            r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x010d }
            r4 = "User declined to send. Removing ";
            r3.<init>(r4);	 Catch:{ Exception -> 0x010d }
            r4 = r1.size();	 Catch:{ Exception -> 0x010d }
            r3.append(r4);	 Catch:{ Exception -> 0x010d }
            r4 = " Report(s).";
            r3.append(r4);	 Catch:{ Exception -> 0x010d }
            r3 = r3.toString();	 Catch:{ Exception -> 0x010d }
            r2.a(r0, r3);	 Catch:{ Exception -> 0x010d }
            r1 = r1.iterator();	 Catch:{ Exception -> 0x010d }
        L_0x0078:
            r2 = r1.hasNext();	 Catch:{ Exception -> 0x010d }
            if (r2 == 0) goto L_0x0117;
        L_0x007e:
            r2 = r1.next();	 Catch:{ Exception -> 0x010d }
            r2 = (defpackage.ati) r2;	 Catch:{ Exception -> 0x010d }
            r2.f();	 Catch:{ Exception -> 0x010d }
            goto L_0x0078;
        L_0x0088:
            r2 = 0;
        L_0x0089:
            r3 = r1.isEmpty();	 Catch:{ Exception -> 0x010d }
            if (r3 != 0) goto L_0x0117;
        L_0x008f:
            r3 = defpackage.atj.this;	 Catch:{ Exception -> 0x010d }
            r3 = r3.c;	 Catch:{ Exception -> 0x010d }
            r3 = r3.a();	 Catch:{ Exception -> 0x010d }
            if (r3 != 0) goto L_0x0117;
        L_0x0099:
            r3 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x010d }
            r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x010d }
            r5 = "Attempting to send ";
            r4.<init>(r5);	 Catch:{ Exception -> 0x010d }
            r5 = r1.size();	 Catch:{ Exception -> 0x010d }
            r4.append(r5);	 Catch:{ Exception -> 0x010d }
            r5 = " report(s)";
            r4.append(r5);	 Catch:{ Exception -> 0x010d }
            r4 = r4.toString();	 Catch:{ Exception -> 0x010d }
            r3.a(r0, r4);	 Catch:{ Exception -> 0x010d }
            r1 = r1.iterator();	 Catch:{ Exception -> 0x010d }
        L_0x00bb:
            r3 = r1.hasNext();	 Catch:{ Exception -> 0x010d }
            if (r3 == 0) goto L_0x00cd;
        L_0x00c1:
            r3 = r1.next();	 Catch:{ Exception -> 0x010d }
            r3 = (defpackage.ati) r3;	 Catch:{ Exception -> 0x010d }
            r4 = defpackage.atj.this;	 Catch:{ Exception -> 0x010d }
            r4.a(r3);	 Catch:{ Exception -> 0x010d }
            goto L_0x00bb;
        L_0x00cd:
            r1 = defpackage.atj.this;	 Catch:{ Exception -> 0x010d }
            r1 = r1.a();	 Catch:{ Exception -> 0x010d }
            r3 = r1.isEmpty();	 Catch:{ Exception -> 0x010d }
            if (r3 != 0) goto L_0x0089;
        L_0x00d9:
            r3 = defpackage.atj.b;	 Catch:{ Exception -> 0x010d }
            r4 = r2 + 1;
            r5 = 5;
            r2 = java.lang.Math.min(r2, r5);	 Catch:{ Exception -> 0x010d }
            r2 = r3[r2];	 Catch:{ Exception -> 0x010d }
            r2 = (long) r2;	 Catch:{ Exception -> 0x010d }
            r5 = defpackage.aiqj.a();	 Catch:{ Exception -> 0x010d }
            r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x010d }
            r7 = "Report submisson: scheduling delayed retry in ";
            r6.<init>(r7);	 Catch:{ Exception -> 0x010d }
            r6.append(r2);	 Catch:{ Exception -> 0x010d }
            r7 = " seconds";
            r6.append(r7);	 Catch:{ Exception -> 0x010d }
            r6 = r6.toString();	 Catch:{ Exception -> 0x010d }
            r5.a(r0, r6);	 Catch:{ Exception -> 0x010d }
            r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r2 = r2 * r5;
            java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x0107 }
            r2 = r4;
            goto L_0x0089;
        L_0x0107:
            r1 = java.lang.Thread.currentThread();	 Catch:{ Exception -> 0x010d }
            goto L_0x0033;
        L_0x010d:
            r1 = move-exception;
            r2 = defpackage.aiqj.a();
            r3 = "An unexpected error occurred while attempting to upload crash reports.";
            r2.c(r0, r3, r1);
        L_0x0117:
            r0 = defpackage.atj.this;
            r1 = 0;
            r0.d = r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.atj$e.a():void");
        }
    }

    /* renamed from: atj$d */
    interface d {
        boolean a();
    }

    public atj(String str, asq asq, c cVar, b bVar) {
        if (asq != null) {
            this.f = asq;
            this.g = str;
            this.h = cVar;
            this.c = bVar;
            return;
        }
        throw new IllegalArgumentException("createReportCall must not be null.");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:34:0x00e9 in {9, 16, 17, 21, 25, 28, 29, 33} preds:[]
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
    final java.util.List<defpackage.ati> a() {
        /*
        r11 = this;
        r0 = defpackage.aiqj.a();
        r1 = "CrashlyticsCore";
        r2 = "Checking for crash reports...";
        r0.a(r1, r2);
        r0 = r11.e;
        monitor-enter(r0);
        r1 = r11.h;	 Catch:{ all -> 0x00e6 }
        r1 = r1.a();	 Catch:{ all -> 0x00e6 }
        r2 = r11.h;	 Catch:{ all -> 0x00e6 }
        r2 = r2.b();	 Catch:{ all -> 0x00e6 }
        r3 = r11.h;	 Catch:{ all -> 0x00e6 }
        r3 = r3.c();	 Catch:{ all -> 0x00e6 }
        monitor-exit(r0);	 Catch:{ all -> 0x00e6 }
        r0 = new java.util.LinkedList;
        r0.<init>();
        r4 = 0;
        if (r1 == 0) goto L_0x0055;
        r5 = r1.length;
        r6 = 0;
        if (r6 >= r5) goto L_0x0055;
        r7 = r1[r6];
        r8 = defpackage.aiqj.a();
        r9 = new java.lang.StringBuilder;
        r10 = "Found crash report ";
        r9.<init>(r10);
        r10 = r7.getPath();
        r9.append(r10);
        r9 = r9.toString();
        r10 = "CrashlyticsCore";
        r8.a(r10, r9);
        r8 = new atl;
        r8.<init>(r7);
        r0.add(r8);
        r6 = r6 + 1;
        goto L_0x002b;
        r1 = new java.util.HashMap;
        r1.<init>();
        if (r2 == 0) goto L_0x0080;
        r5 = r2.length;
        r6 = 0;
        if (r6 >= r5) goto L_0x0080;
        r7 = r2[r6];
        r8 = defpackage.asi.a(r7);
        r9 = r1.containsKey(r8);
        if (r9 != 0) goto L_0x0074;
        r9 = new java.util.LinkedList;
        r9.<init>();
        r1.put(r8, r9);
        r8 = r1.get(r8);
        r8 = (java.util.List) r8;
        r8.add(r7);
        r6 = r6 + 1;
        goto L_0x005e;
        r2 = r1.keySet();
        r2 = r2.iterator();
        r5 = r2.hasNext();
        if (r5 == 0) goto L_0x00c2;
        r5 = r2.next();
        r5 = (java.lang.String) r5;
        r6 = defpackage.aiqj.a();
        r7 = java.lang.String.valueOf(r5);
        r8 = "Found invalid session: ";
        r7 = r8.concat(r7);
        r8 = "CrashlyticsCore";
        r6.a(r8, r7);
        r6 = r1.get(r5);
        r6 = (java.util.List) r6;
        r7 = new asw;
        r8 = r6.size();
        r8 = new java.io.File[r8];
        r6 = r6.toArray(r8);
        r6 = (java.io.File[]) r6;
        r7.<init>(r5, r6);
        r0.add(r7);
        goto L_0x0088;
        if (r3 == 0) goto L_0x00d4;
        r1 = r3.length;
        if (r4 >= r1) goto L_0x00d4;
        r2 = r3[r4];
        r5 = new atd;
        r5.<init>(r2);
        r0.add(r5);
        r4 = r4 + 1;
        goto L_0x00c5;
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x00e5;
        r1 = defpackage.aiqj.a();
        r2 = "CrashlyticsCore";
        r3 = "No reports found.";
        r1.a(r2, r3);
        return r0;
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00e6 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atj.a():java.util.List");
    }

    public final synchronized void a(float f, d dVar) {
        if (this.d != null) {
            aiqj.a().a("CrashlyticsCore", "Report upload has already been started.");
            return;
        }
        this.d = new Thread(new e(f, dVar), "Crashlytics Report Uploader");
        this.d.start();
    }

    /* Access modifiers changed, original: final */
    public final boolean a(ati ati) {
        boolean z;
        synchronized (this.e) {
            z = false;
            try {
                boolean a = this.f.a(new asp(this.g, ati));
                aiqr a2 = aiqj.a();
                String str = "CrashlyticsCore";
                StringBuilder stringBuilder = new StringBuilder("Crashlytics report upload ");
                stringBuilder.append(a ? "complete: " : "FAILED: ");
                stringBuilder.append(ati.b());
                a2.c(str, stringBuilder.toString());
                if (a) {
                    ati.f();
                    z = true;
                }
            } catch (Exception e) {
                aiqj.a().c("CrashlyticsCore", "Error occurred sending report ".concat(String.valueOf(ati)), e);
            }
        }
        return z;
    }
}
