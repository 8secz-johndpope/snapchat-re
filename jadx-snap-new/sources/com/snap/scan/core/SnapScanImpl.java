package com.snap.scan.core;

import com.google.common.primitives.Ints;
import com.snap.scan.core.SnapScanResult.CodeType;
import defpackage.abmr;
import defpackage.jwa;
import defpackage.jwb;
import defpackage.vpg;
import defpackage.vsm;
import defpackage.vsn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SnapScanImpl implements vsm {
    private static final boolean a = vsn.a();
    private static final Set<CodeType> b = new HashSet();
    private final jwa c;

    public SnapScanImpl(jwb jwb) {
        this.c = jwb.a(vpg.e);
    }

    private static synchronized Set<CodeType> a() {
        Set set;
        synchronized (SnapScanImpl.class) {
            if (b.isEmpty()) {
                b.add(CodeType.SNAPCODE_18x18);
                b.add(CodeType.SNAPCODE_BITMOJI);
                b.add(CodeType.QR_CODE);
            }
            set = b;
        }
        return set;
    }

    private static int[] a(Set<CodeType> set) {
        if (set == null) {
            Set set2 = new HashSet();
            set2.add(CodeType.SNAPCODE_18x18);
            set2.add(CodeType.SNAPCODE_BITMOJI);
        }
        ArrayList arrayList = new ArrayList();
        for (CodeType codeType : set2) {
            if (codeType != CodeType.BARCODE) {
                arrayList.add(Integer.valueOf(codeType.ordinal()));
            }
        }
        return Ints.toArray(arrayList);
    }

    private static native SnapScanResult nativeProcessFrameWithFalseAlarmCheck(int i, int i2, int i3, byte[] bArr, int i4, int[] iArr, boolean z, boolean z2);

    public final SnapScanResult a(int i, int i2, int i3, byte[] bArr, Set<CodeType> set) {
        abmr.a("This method must not be called from the Main Thread.");
        if (bArr == null) {
            return new SnapScanResult(null, null);
        }
        if (!a) {
            return new SnapScanResult(null, null);
        }
        return nativeProcessFrameWithFalseAlarmCheck(1, i2, i3, bArr, -1, a((Set) set), true, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x00da in {2, 5, 8, 11, 14, 15, 18, 19, 23, 26} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final com.snap.scan.core.SnapScanResult a(android.graphics.Bitmap r11) {
        /*
        r10 = this;
        r0 = "This method must not be called from the Main Thread.";
        defpackage.abmr.a(r0);
        r0 = 0;
        if (r11 != 0) goto L_0x0009;
        return r0;
        r1 = r11.isRecycled();
        if (r1 == 0) goto L_0x0010;
        return r0;
        r1 = a;
        if (r1 != 0) goto L_0x0015;
        return r0;
        r1 = 1;
        r11.setHasAlpha(r1);
        r1 = r11.getConfig();
        r2 = android.graphics.Bitmap.Config.ARGB_8888;
        if (r1 == r2) goto L_0x0022;
        return r0;
        r0 = java.lang.Runtime.getRuntime();
        r1 = r0.maxMemory();
        r3 = r0.totalMemory();
        r5 = r0.freeMemory();
        r3 = r3 - r5;
        r1 = r1 - r3;
        r0 = r11.getByteCount();
        r3 = (long) r0;
        r5 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r7 = r3 + r5;
        r0 = "SnapScanImpl";
        r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r9 > 0) goto L_0x004e;
        r1 = new jxn;
        r1.<init>(r11);
        r11 = defpackage.kaz.a(r1, r0);
        goto L_0x009f;
        r5 = r1 - r5;
        r5 = (double) r5;
        r1 = (double) r1;
        r7 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        java.lang.Double.isNaN(r1);
        r1 = r1 / r7;
        r1 = java.lang.Math.max(r5, r1);
        r1 = (long) r1;
        r5 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r3 = (double) r3;
        r1 = (double) r1;
        java.lang.Double.isNaN(r3);
        java.lang.Double.isNaN(r1);
        r3 = r3 / r1;
        r1 = java.lang.Math.sqrt(r3);
        r5 = r5 / r1;
        r1 = 4607092346807469998; // 0x3fefae147ae147ae float:5.848603E35 double:0.99;
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r3 <= 0) goto L_0x007c;
        r1 = new jxn;
        r1.<init>(r11);
        goto L_0x0049;
        r0 = new abtl;
        r1 = r11.getWidth();
        r2 = r11.getHeight();
        r0.<init>(r1, r2);
        r0 = r0.a(r5);
        r1 = r10.c;
        r3 = r0.b();
        r4 = r0.c();
        r5 = 1;
        r6 = "SnapScanImpl";
        r2 = r11;
        r11 = r1.a(r2, r3, r4, r5, r6);
        r0 = r11.a();	 Catch:{ all -> 0x00d5 }
        r0 = (defpackage.jwj) r0;	 Catch:{ all -> 0x00d5 }
        r0 = r0.a();	 Catch:{ all -> 0x00d5 }
        r1 = r0.getByteCount();	 Catch:{ all -> 0x00d5 }
        r1 = java.nio.ByteBuffer.allocateDirect(r1);	 Catch:{ all -> 0x00d5 }
        r0.copyPixelsToBuffer(r1);	 Catch:{ all -> 0x00d5 }
        r5 = r1.array();	 Catch:{ all -> 0x00d5 }
        r4 = r0.getHeight();	 Catch:{ all -> 0x00d5 }
        r3 = r0.getWidth();	 Catch:{ all -> 0x00d5 }
        r0 = a();	 Catch:{ all -> 0x00d5 }
        r7 = a(r0);	 Catch:{ all -> 0x00d5 }
        r2 = 1;	 Catch:{ all -> 0x00d5 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ all -> 0x00d5 }
        r8 = 1;	 Catch:{ all -> 0x00d5 }
        r9 = 1;	 Catch:{ all -> 0x00d5 }
        r0 = nativeProcessFrameWithFalseAlarmCheck(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00d5 }
        r11.dispose();
        return r0;
        r0 = move-exception;
        r11.dispose();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.scan.core.SnapScanImpl.a(android.graphics.Bitmap):com.snap.scan.core.SnapScanResult");
    }
}
