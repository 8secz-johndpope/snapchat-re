package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzabh
public final class zzakm {
    private static Map<String, List<Map<String, Object>>> zzdia = new HashMap();
    private static List<MediaCodecInfo> zzdib;
    private static final Object zzdic = new Object();

    @TargetApi(21)
    private static Integer[] zza(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:64:0x0162 in {7, 18, 19, 24, 26, 37, 40, 43, 44, 48, 53, 55, 56, 60, 63} preds:[]
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
    @android.annotation.TargetApi(16)
    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> zzct(java.lang.String r14) {
        /*
        r0 = zzdic;
        monitor-enter(r0);
        r1 = zzdia;	 Catch:{ all -> 0x015f }
        r1 = r1.containsKey(r14);	 Catch:{ all -> 0x015f }
        if (r1 == 0) goto L_0x0015;	 Catch:{ all -> 0x015f }
        r1 = zzdia;	 Catch:{ all -> 0x015f }
        r14 = r1.get(r14);	 Catch:{ all -> 0x015f }
        r14 = (java.util.List) r14;	 Catch:{ all -> 0x015f }
        monitor-exit(r0);	 Catch:{ all -> 0x015f }
        return r14;
        r1 = zzdic;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        monitor-enter(r1);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r2 = zzdib;	 Catch:{ all -> 0x0138 }
        r3 = 21;	 Catch:{ all -> 0x0138 }
        r4 = 0;	 Catch:{ all -> 0x0138 }
        if (r2 == 0) goto L_0x0021;	 Catch:{ all -> 0x0138 }
        monitor-exit(r1);	 Catch:{ all -> 0x0138 }
        goto L_0x005a;	 Catch:{ all -> 0x0138 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0138 }
        if (r2 < r3) goto L_0x0035;	 Catch:{ all -> 0x0138 }
        r2 = new android.media.MediaCodecList;	 Catch:{ all -> 0x0138 }
        r2.<init>(r4);	 Catch:{ all -> 0x0138 }
        r2 = r2.getCodecInfos();	 Catch:{ all -> 0x0138 }
        r2 = java.util.Arrays.asList(r2);	 Catch:{ all -> 0x0138 }
        zzdib = r2;	 Catch:{ all -> 0x0138 }
        goto L_0x001f;	 Catch:{ all -> 0x0138 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x0138 }
        r5 = 16;	 Catch:{ all -> 0x0138 }
        if (r2 < r5) goto L_0x0055;	 Catch:{ all -> 0x0138 }
        r2 = android.media.MediaCodecList.getCodecCount();	 Catch:{ all -> 0x0138 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0138 }
        r5.<init>(r2);	 Catch:{ all -> 0x0138 }
        zzdib = r5;	 Catch:{ all -> 0x0138 }
        r5 = 0;	 Catch:{ all -> 0x0138 }
        if (r5 >= r2) goto L_0x001f;	 Catch:{ all -> 0x0138 }
        r6 = android.media.MediaCodecList.getCodecInfoAt(r5);	 Catch:{ all -> 0x0138 }
        r7 = zzdib;	 Catch:{ all -> 0x0138 }
        r7.add(r6);	 Catch:{ all -> 0x0138 }
        r5 = r5 + 1;	 Catch:{ all -> 0x0138 }
        goto L_0x0047;	 Catch:{ all -> 0x0138 }
        r2 = java.util.Collections.emptyList();	 Catch:{ all -> 0x0138 }
        goto L_0x0032;
        r1 = new java.util.ArrayList;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r1.<init>();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r2 = zzdib;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r2 = r2.iterator();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r5 = r2.hasNext();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        if (r5 == 0) goto L_0x0131;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r5 = r2.next();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r5 = (android.media.MediaCodecInfo) r5;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6 = r5.isEncoder();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        if (r6 != 0) goto L_0x0065;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6 = r5.getSupportedTypes();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6 = java.util.Arrays.asList(r6);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6 = r6.contains(r14);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        if (r6 == 0) goto L_0x0065;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6 = new java.util.HashMap;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.<init>();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7 = "codecName";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = r5.getName();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r7, r8);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r5 = r5.getCapabilitiesForType(r14);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7 = new java.util.ArrayList;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7.<init>();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = r5.profileLevels;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = r8.length;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r10 = 0;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        if (r10 >= r9) goto L_0x00be;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r11 = r8[r10];	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r12 = 2;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r12 = new java.lang.Integer[r12];	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r13 = r11.profile;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r13 = java.lang.Integer.valueOf(r13);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r12[r4] = r13;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r11 = r11.level;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r11 = java.lang.Integer.valueOf(r11);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r13 = 1;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r12[r13] = r11;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7.add(r12);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r10 = r10 + 1;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        goto L_0x00a0;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = "profileLevels";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r8, r7);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        if (r7 < r3) goto L_0x0119;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7 = r5.getVideoCapabilities();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = "bitRatesBps";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = r7.getBitrateRange();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = zza(r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r8, r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = "widthAlignment";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = r7.getWidthAlignment();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r8, r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = "heightAlignment";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = r7.getHeightAlignment();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r8, r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = "frameRates";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = r7.getSupportedFrameRates();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = zza(r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r8, r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = "widths";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = r7.getSupportedWidths();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r9 = zza(r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r8, r9);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = "heights";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7 = r7.getSupportedHeights();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7 = zza(r7);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r8, r7);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r8 = 23;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        if (r7 < r8) goto L_0x012c;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r7 = "instancesLimit";	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r5 = r5.getMaxSupportedInstances();	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r6.put(r7, r5);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r1.add(r6);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        goto L_0x0065;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r2 = zzdia;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r2.put(r14, r1);	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        monitor-exit(r0);	 Catch:{ all -> 0x015f }
        return r1;
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0138 }
        throw r2;	 Catch:{ RuntimeException -> 0x013d, LinkageError -> 0x013b }
        r1 = move-exception;
        goto L_0x013e;
        r1 = move-exception;
        r2 = new java.util.HashMap;	 Catch:{ all -> 0x015f }
        r2.<init>();	 Catch:{ all -> 0x015f }
        r3 = "error";	 Catch:{ all -> 0x015f }
        r1 = r1.getClass();	 Catch:{ all -> 0x015f }
        r1 = r1.getSimpleName();	 Catch:{ all -> 0x015f }
        r2.put(r3, r1);	 Catch:{ all -> 0x015f }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x015f }
        r1.<init>();	 Catch:{ all -> 0x015f }
        r1.add(r2);	 Catch:{ all -> 0x015f }
        r2 = zzdia;	 Catch:{ all -> 0x015f }
        r2.put(r14, r1);	 Catch:{ all -> 0x015f }
        monitor-exit(r0);	 Catch:{ all -> 0x015f }
        return r1;	 Catch:{ all -> 0x015f }
        r14 = move-exception;	 Catch:{ all -> 0x015f }
        monitor-exit(r0);	 Catch:{ all -> 0x015f }
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzakm.zzct(java.lang.String):java.util.List");
    }
}
