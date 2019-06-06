package org.chromium.base;

import android.os.Build;
import android.os.Build.VERSION;
import com.samsung.android.sdk.camera.SCamera;
import defpackage.akom;
import defpackage.akon;
import org.chromium.base.annotations.CalledByNative;

public class BuildInfo {
    private String a;
    private int b;
    private String c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;

    static class a {
        static BuildInfo a = new BuildInfo();
    }

    static {
        BuildInfo.class.desiredAssertionStatus();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x00bc in {5, 7, 9, 10, 14, 16, 19, 21, 24, 25, 27, 30} preds:[]
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
    private BuildInfo() {
        /*
        r6 = this;
        r6.<init>();
        r0 = defpackage.akon.a;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = r0.getPackageName();	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00b5 }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r3 = r0.getPackageInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r4 = r3.versionCode;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.b = r4;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.c = r1;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = r6.b;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.d = r1;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = r3.versionName;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = a(r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.e = r1;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = r3.applicationInfo;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = r0.getApplicationLabel(r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = a(r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.a = r1;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = r6.c;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = r0.getInstallerPackageName(r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = a(r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.f = r1;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = 0;
        r4 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0043 }
        r1 = r0.getPackageInfo(r4, r2);	 Catch:{ NameNotFoundException -> 0x0043 }
        if (r1 == 0) goto L_0x004c;
        r1 = r1.versionCode;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        goto L_0x004e;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = "gms versionCode not available.";	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.g = r1;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = "true";	 Catch:{ NameNotFoundException -> 0x00b5 }
        r4 = "projekt.substratum";	 Catch:{ NameNotFoundException -> 0x0058 }
        r0.getPackageInfo(r4, r2);	 Catch:{ NameNotFoundException -> 0x0058 }
        goto L_0x005a;
    L_0x0058:
        r1 = "false";	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.k = r1;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = "Not Enabled";	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.l = r0;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = 21;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r4 = 1;	 Catch:{ NameNotFoundException -> 0x00b5 }
        if (r0 < r1) goto L_0x0072;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = ", ";	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = android.os.Build.SUPPORTED_ABIS;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = android.text.TextUtils.join(r0, r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.h = r0;	 Catch:{ NameNotFoundException -> 0x00b5 }
        goto L_0x0084;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = "ABI1: %s, ABI2: %s";	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = 2;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = new java.lang.Object[r1];	 Catch:{ NameNotFoundException -> 0x00b5 }
        r5 = android.os.Build.CPU_ABI;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1[r2] = r5;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r5 = android.os.Build.CPU_ABI2;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1[r4] = r5;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = java.lang.String.format(r0, r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        goto L_0x006f;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = r6.d;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = 10;	 Catch:{ NameNotFoundException -> 0x00b5 }
        if (r0 <= r1) goto L_0x008e;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = r6.d;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = (long) r0;	 Catch:{ NameNotFoundException -> 0x00b5 }
        goto L_0x0090;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = r3.lastUpdateTime;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r3 = "@%x";	 Catch:{ NameNotFoundException -> 0x00b5 }
        r4 = new java.lang.Object[r4];	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = java.lang.Long.valueOf(r0);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r4[r2] = r0;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = java.lang.String.format(r3, r4);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.j = r0;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = android.os.Build.FINGERPRINT;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = android.os.Build.FINGERPRINT;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = r1.length();	 Catch:{ NameNotFoundException -> 0x00b5 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x00b5 }
        r1 = java.lang.Math.min(r1, r3);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r0 = r0.substring(r2, r1);	 Catch:{ NameNotFoundException -> 0x00b5 }
        r6.i = r0;	 Catch:{ NameNotFoundException -> 0x00b5 }
        return;
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.BuildInfo.<init>():void");
    }

    /* synthetic */ BuildInfo(byte b) {
        this();
    }

    private static String a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    public static boolean a() {
        return VERSION.SDK_INT >= 28;
    }

    @CalledByNative
    private static String[] getAll() {
        BuildInfo buildInfo = a.a;
        String packageName = akon.a.getPackageName();
        String[] strArr = new String[23];
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName;
        strArr[9] = String.valueOf(buildInfo.b);
        strArr[10] = buildInfo.a;
        strArr[11] = buildInfo.c;
        strArr[12] = String.valueOf(buildInfo.d);
        strArr[13] = buildInfo.e;
        strArr[14] = buildInfo.i;
        strArr[15] = buildInfo.g;
        strArr[16] = buildInfo.f;
        strArr[17] = buildInfo.h;
        strArr[18] = akom.a;
        strArr[19] = buildInfo.k;
        strArr[20] = buildInfo.l;
        strArr[21] = buildInfo.j;
        strArr[22] = a() ? SCamera.CAMERA_ID_FRONT : "0";
        return strArr;
    }
}
