package defpackage;

import org.json.JSONObject;

/* renamed from: aitq */
final class aitq extends aiqx implements aiub {
    public aitq(aiqo aiqo, String str, String str2, aisx aisx) {
        this(aiqo, str, str2, aisx, 1);
    }

    private aitq(aiqo aiqo, String str, String str2, aisx aisx, int i) {
        super(aiqo, str, str2, aisx, 1);
    }

    private JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            aiqr a = aiqj.a();
            StringBuilder stringBuilder = new StringBuilder("Failed to parse settings JSON from ");
            stringBuilder.append(this.a);
            String str2 = "Fabric";
            a.a(str2, stringBuilder.toString(), e);
            aiqj.a().a(str2, "Settings response ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static void a(aisw aisw, String str, String str2) {
        if (str2 != null) {
            aisw.a(str, str2);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x0143 in {4, 7, 18, 19, 20, 22, 23, 25, 26, 28, 30, 32, 36, 37, 38, 40, 41} preds:[]
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
    public final org.json.JSONObject a(defpackage.aiua r9) {
        /*
        r8 = this;
        r0 = "X-REQUEST-ID";
        r1 = "Settings request ID: ";
        r2 = "Fabric";
        r3 = 0;
        r4 = new java.util.HashMap;	 Catch:{ c -> 0x0110, all -> 0x010d }
        r4.<init>();	 Catch:{ c -> 0x0110, all -> 0x010d }
        r5 = "build_version";	 Catch:{ c -> 0x0110, all -> 0x010d }
        r6 = r9.h;	 Catch:{ c -> 0x0110, all -> 0x010d }
        r4.put(r5, r6);	 Catch:{ c -> 0x0110, all -> 0x010d }
        r5 = "display_version";	 Catch:{ c -> 0x0110, all -> 0x010d }
        r6 = r9.g;	 Catch:{ c -> 0x0110, all -> 0x010d }
        r4.put(r5, r6);	 Catch:{ c -> 0x0110, all -> 0x010d }
        r5 = "source";	 Catch:{ c -> 0x0110, all -> 0x010d }
        r6 = r9.i;	 Catch:{ c -> 0x0110, all -> 0x010d }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ c -> 0x0110, all -> 0x010d }
        r4.put(r5, r6);	 Catch:{ c -> 0x0110, all -> 0x010d }
        r5 = r9.j;	 Catch:{ c -> 0x0110, all -> 0x010d }
        if (r5 == 0) goto L_0x0030;	 Catch:{ c -> 0x0110, all -> 0x010d }
        r5 = "icon_hash";	 Catch:{ c -> 0x0110, all -> 0x010d }
        r6 = r9.j;	 Catch:{ c -> 0x0110, all -> 0x010d }
        r4.put(r5, r6);	 Catch:{ c -> 0x0110, all -> 0x010d }
        r5 = r9.f;	 Catch:{ c -> 0x0110, all -> 0x010d }
        r6 = defpackage.airf.a(r5);	 Catch:{ c -> 0x0110, all -> 0x010d }
        if (r6 != 0) goto L_0x003d;	 Catch:{ c -> 0x0110, all -> 0x010d }
        r6 = "instance";	 Catch:{ c -> 0x0110, all -> 0x010d }
        r4.put(r6, r5);	 Catch:{ c -> 0x0110, all -> 0x010d }
        r5 = r8.a(r4);	 Catch:{ c -> 0x0110, all -> 0x010d }
        r6 = "X-CRASHLYTICS-API-KEY";	 Catch:{ c -> 0x010b }
        r7 = r9.a;	 Catch:{ c -> 0x010b }
        defpackage.aitq.a(r5, r6, r7);	 Catch:{ c -> 0x010b }
        r6 = "X-CRASHLYTICS-API-CLIENT-TYPE";	 Catch:{ c -> 0x010b }
        r7 = "android";	 Catch:{ c -> 0x010b }
        defpackage.aitq.a(r5, r6, r7);	 Catch:{ c -> 0x010b }
        r6 = "X-CRASHLYTICS-API-CLIENT-VERSION";	 Catch:{ c -> 0x010b }
        r7 = r8.b;	 Catch:{ c -> 0x010b }
        r7 = r7.a();	 Catch:{ c -> 0x010b }
        defpackage.aitq.a(r5, r6, r7);	 Catch:{ c -> 0x010b }
        r6 = "Accept";	 Catch:{ c -> 0x010b }
        r7 = "application/json";	 Catch:{ c -> 0x010b }
        defpackage.aitq.a(r5, r6, r7);	 Catch:{ c -> 0x010b }
        r6 = "X-CRASHLYTICS-DEVICE-MODEL";	 Catch:{ c -> 0x010b }
        r7 = r9.b;	 Catch:{ c -> 0x010b }
        defpackage.aitq.a(r5, r6, r7);	 Catch:{ c -> 0x010b }
        r6 = "X-CRASHLYTICS-OS-BUILD-VERSION";	 Catch:{ c -> 0x010b }
        r7 = r9.c;	 Catch:{ c -> 0x010b }
        defpackage.aitq.a(r5, r6, r7);	 Catch:{ c -> 0x010b }
        r6 = "X-CRASHLYTICS-OS-DISPLAY-VERSION";	 Catch:{ c -> 0x010b }
        r7 = r9.d;	 Catch:{ c -> 0x010b }
        defpackage.aitq.a(r5, r6, r7);	 Catch:{ c -> 0x010b }
        r6 = "X-CRASHLYTICS-INSTALLATION-ID";	 Catch:{ c -> 0x010b }
        r9 = r9.e;	 Catch:{ c -> 0x010b }
        defpackage.aitq.a(r5, r6, r9);	 Catch:{ c -> 0x010b }
        r9 = defpackage.aiqj.a();	 Catch:{ c -> 0x010b }
        r6 = new java.lang.StringBuilder;	 Catch:{ c -> 0x010b }
        r7 = "Requesting settings from ";	 Catch:{ c -> 0x010b }
        r6.<init>(r7);	 Catch:{ c -> 0x010b }
        r7 = r8.a;	 Catch:{ c -> 0x010b }
        r6.append(r7);	 Catch:{ c -> 0x010b }
        r6 = r6.toString();	 Catch:{ c -> 0x010b }
        r9.a(r2, r6);	 Catch:{ c -> 0x010b }
        r9 = defpackage.aiqj.a();	 Catch:{ c -> 0x010b }
        r6 = "Settings query params were: ";	 Catch:{ c -> 0x010b }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ c -> 0x010b }
        r4 = r6.concat(r4);	 Catch:{ c -> 0x010b }
        r9.a(r2, r4);	 Catch:{ c -> 0x010b }
        r9 = r5.b();	 Catch:{ c -> 0x010b }
        r4 = defpackage.aiqj.a();	 Catch:{ c -> 0x010b }
        r6 = "Settings result was: ";	 Catch:{ c -> 0x010b }
        r7 = java.lang.String.valueOf(r9);	 Catch:{ c -> 0x010b }
        r6 = r6.concat(r7);	 Catch:{ c -> 0x010b }
        r4.a(r2, r6);	 Catch:{ c -> 0x010b }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ c -> 0x010b }
        if (r9 == r4) goto L_0x00cd;	 Catch:{ c -> 0x010b }
        r4 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;	 Catch:{ c -> 0x010b }
        if (r9 == r4) goto L_0x00cd;	 Catch:{ c -> 0x010b }
        r4 = 202; // 0xca float:2.83E-43 double:1.0E-321;	 Catch:{ c -> 0x010b }
        if (r9 == r4) goto L_0x00cd;	 Catch:{ c -> 0x010b }
        r4 = 203; // 0xcb float:2.84E-43 double:1.003E-321;	 Catch:{ c -> 0x010b }
        if (r9 != r4) goto L_0x00cb;	 Catch:{ c -> 0x010b }
        goto L_0x00cd;	 Catch:{ c -> 0x010b }
        r9 = 0;	 Catch:{ c -> 0x010b }
        goto L_0x00ce;	 Catch:{ c -> 0x010b }
        r9 = 1;	 Catch:{ c -> 0x010b }
        if (r9 == 0) goto L_0x00da;	 Catch:{ c -> 0x010b }
        r9 = r5.c();	 Catch:{ c -> 0x010b }
        r9 = r8.a(r9);	 Catch:{ c -> 0x010b }
        r3 = r9;	 Catch:{ c -> 0x010b }
        goto L_0x00f1;	 Catch:{ c -> 0x010b }
        r9 = defpackage.aiqj.a();	 Catch:{ c -> 0x010b }
        r4 = new java.lang.StringBuilder;	 Catch:{ c -> 0x010b }
        r6 = "Failed to retrieve settings from ";	 Catch:{ c -> 0x010b }
        r4.<init>(r6);	 Catch:{ c -> 0x010b }
        r6 = r8.a;	 Catch:{ c -> 0x010b }
        r4.append(r6);	 Catch:{ c -> 0x010b }
        r4 = r4.toString();	 Catch:{ c -> 0x010b }
        r9.e(r2, r4);	 Catch:{ c -> 0x010b }
        if (r5 == 0) goto L_0x0127;
        r9 = defpackage.aiqj.a();
        r4 = new java.lang.StringBuilder;
        r4.<init>(r1);
        r0 = r5.b(r0);
        r4.append(r0);
        r0 = r4.toString();
        r9.a(r2, r0);
        goto L_0x0127;
        r9 = move-exception;
        goto L_0x0112;
        r9 = move-exception;
        r5 = r3;
        goto L_0x0129;
        r9 = move-exception;
        r5 = r3;
        r4 = defpackage.aiqj.a();	 Catch:{ all -> 0x0128 }
        r6 = "Settings request failed.";	 Catch:{ all -> 0x0128 }
        r4.c(r2, r6, r9);	 Catch:{ all -> 0x0128 }
        if (r5 == 0) goto L_0x0127;
        r9 = defpackage.aiqj.a();
        r4 = new java.lang.StringBuilder;
        r4.<init>(r1);
        goto L_0x00fc;
        return r3;
        r9 = move-exception;
        if (r5 == 0) goto L_0x0142;
        r3 = defpackage.aiqj.a();
        r4 = new java.lang.StringBuilder;
        r4.<init>(r1);
        r0 = r5.b(r0);
        r4.append(r0);
        r0 = r4.toString();
        r3.a(r2, r0);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aitq.a(aiua):org.json.JSONObject");
    }
}
