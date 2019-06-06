package com.snap.ui.view.multisnap;

import defpackage.ajej;
import defpackage.ajxw;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;

public final class MultiSnapThumbnailViewModelKt {
    private static final String TAG = "MultiSnapThumbnailViewModel";

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:40:0x011f in {5, 6, 7, 8, 12, 13, 14, 15, 19, 31, 34, 36, 39} preds:[]
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
    public static final java.util.NavigableMap<java.lang.Integer, defpackage.kaz<defpackage.jwj>> copyAtLeastOne(java.util.NavigableMap<java.lang.Integer, defpackage.kaz<defpackage.jwj>> r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r6, r0);
        r0 = "owner";
        defpackage.akcr.b(r9, r0);
        r0 = new java.util.concurrent.ConcurrentSkipListMap;
        r0.<init>();
        if (r7 == 0) goto L_0x003a;
        r1 = r7;	 Catch:{ Exception -> 0x0116 }
        r1 = (java.lang.Number) r1;	 Catch:{ Exception -> 0x0116 }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x0116 }
        r2 = r6.lastKey();	 Catch:{ Exception -> 0x0116 }
        r3 = "lastKey()";	 Catch:{ Exception -> 0x0116 }
        defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x0116 }
        r2 = (java.lang.Number) r2;	 Catch:{ Exception -> 0x0116 }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x0116 }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Exception -> 0x0116 }
        if (r2 <= 0) goto L_0x0034;	 Catch:{ Exception -> 0x0116 }
        r1 = r6.lastKey();	 Catch:{ Exception -> 0x0116 }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x0116 }
        goto L_0x0038;	 Catch:{ Exception -> 0x0116 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0116 }
        if (r1 != 0) goto L_0x0040;	 Catch:{ Exception -> 0x0116 }
        r1 = r6.firstKey();	 Catch:{ Exception -> 0x0116 }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x0116 }
        if (r8 == 0) goto L_0x006b;	 Catch:{ Exception -> 0x0116 }
        r2 = r8;	 Catch:{ Exception -> 0x0116 }
        r2 = (java.lang.Number) r2;	 Catch:{ Exception -> 0x0116 }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x0116 }
        r3 = r6.firstKey();	 Catch:{ Exception -> 0x0116 }
        r4 = "firstKey()";	 Catch:{ Exception -> 0x0116 }
        defpackage.akcr.a(r3, r4);	 Catch:{ Exception -> 0x0116 }
        r3 = (java.lang.Number) r3;	 Catch:{ Exception -> 0x0116 }
        r3 = r3.intValue();	 Catch:{ Exception -> 0x0116 }
        r3 = defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x0116 }
        if (r3 >= 0) goto L_0x0065;	 Catch:{ Exception -> 0x0116 }
        r2 = r6.firstKey();	 Catch:{ Exception -> 0x0116 }
        r2 = (java.lang.Integer) r2;	 Catch:{ Exception -> 0x0116 }
        goto L_0x0069;	 Catch:{ Exception -> 0x0116 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ Exception -> 0x0116 }
        if (r2 != 0) goto L_0x0071;	 Catch:{ Exception -> 0x0116 }
        r2 = r6.lastKey();	 Catch:{ Exception -> 0x0116 }
        r2 = (java.lang.Integer) r2;	 Catch:{ Exception -> 0x0116 }
        r3 = 1;	 Catch:{ Exception -> 0x0116 }
        r1 = r6.subMap(r1, r3, r2, r3);	 Catch:{ Exception -> 0x0116 }
        r2 = "subMap(lowerBoundNonNull… upperBoundNonNull, true)";	 Catch:{ Exception -> 0x0116 }
        defpackage.akcr.a(r1, r2);	 Catch:{ Exception -> 0x0116 }
        r1 = (java.util.Map) r1;	 Catch:{ Exception -> 0x0116 }
        r2 = new java.util.LinkedHashMap;	 Catch:{ Exception -> 0x0116 }
        r4 = r1.size();	 Catch:{ Exception -> 0x0116 }
        r4 = defpackage.ajzm.a(r4);	 Catch:{ Exception -> 0x0116 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x0116 }
        r2 = (java.util.Map) r2;	 Catch:{ Exception -> 0x0116 }
        r1 = r1.entrySet();	 Catch:{ Exception -> 0x0116 }
        r1 = (java.lang.Iterable) r1;	 Catch:{ Exception -> 0x0116 }
        r1 = r1.iterator();	 Catch:{ Exception -> 0x0116 }
        r4 = r1.hasNext();	 Catch:{ Exception -> 0x0116 }
        if (r4 == 0) goto L_0x00b7;	 Catch:{ Exception -> 0x0116 }
        r4 = r1.next();	 Catch:{ Exception -> 0x0116 }
        r5 = r4;	 Catch:{ Exception -> 0x0116 }
        r5 = (java.util.Map.Entry) r5;	 Catch:{ Exception -> 0x0116 }
        r5 = r5.getKey();	 Catch:{ Exception -> 0x0116 }
        r4 = (java.util.Map.Entry) r4;	 Catch:{ Exception -> 0x0116 }
        r4 = r4.getValue();	 Catch:{ Exception -> 0x0116 }
        r4 = (defpackage.kaz) r4;	 Catch:{ Exception -> 0x0116 }
        r4 = r4.a(r9);	 Catch:{ Exception -> 0x0116 }
        r2.put(r5, r4);	 Catch:{ Exception -> 0x0116 }
        goto L_0x0096;	 Catch:{ Exception -> 0x0116 }
        r0.putAll(r2);	 Catch:{ Exception -> 0x0116 }
        r1 = r0.isEmpty();	 Catch:{ Exception -> 0x0116 }
        if (r1 == 0) goto L_0x0113;	 Catch:{ Exception -> 0x0116 }
        r1 = r6;	 Catch:{ Exception -> 0x0116 }
        r1 = (java.util.Map) r1;	 Catch:{ Exception -> 0x0116 }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x0116 }
        r1 = r1 ^ r3;
        if (r1 == 0) goto L_0x0113;
        r1 = "it.value.clone(owner)";
        r2 = "it.key";
        if (r7 == 0) goto L_0x00f3;
        r7 = r6.lowerEntry(r7);	 Catch:{ Exception -> 0x0116 }
        if (r7 == 0) goto L_0x00f3;	 Catch:{ Exception -> 0x0116 }
        r6 = r0;	 Catch:{ Exception -> 0x0116 }
        r6 = (java.util.Map) r6;	 Catch:{ Exception -> 0x0116 }
        r8 = r7.getKey();	 Catch:{ Exception -> 0x0116 }
        defpackage.akcr.a(r8, r2);	 Catch:{ Exception -> 0x0116 }
        r7 = r7.getValue();	 Catch:{ Exception -> 0x0116 }
        r7 = (defpackage.kaz) r7;	 Catch:{ Exception -> 0x0116 }
        r7 = r7.a(r9);	 Catch:{ Exception -> 0x0116 }
        defpackage.akcr.a(r7, r1);	 Catch:{ Exception -> 0x0116 }
        r6.put(r8, r7);	 Catch:{ Exception -> 0x0116 }
        r0 = (java.util.NavigableMap) r0;	 Catch:{ Exception -> 0x0116 }
        return r0;	 Catch:{ Exception -> 0x0116 }
        r6 = r6.higherEntry(r8);	 Catch:{ Exception -> 0x0116 }
        if (r6 == 0) goto L_0x0113;	 Catch:{ Exception -> 0x0116 }
        r7 = r0;	 Catch:{ Exception -> 0x0116 }
        r7 = (java.util.Map) r7;	 Catch:{ Exception -> 0x0116 }
        r8 = r6.getKey();	 Catch:{ Exception -> 0x0116 }
        defpackage.akcr.a(r8, r2);	 Catch:{ Exception -> 0x0116 }
        r6 = r6.getValue();	 Catch:{ Exception -> 0x0116 }
        r6 = (defpackage.kaz) r6;	 Catch:{ Exception -> 0x0116 }
        r6 = r6.a(r9);	 Catch:{ Exception -> 0x0116 }
        defpackage.akcr.a(r6, r1);	 Catch:{ Exception -> 0x0116 }
        r7.put(r8, r6);	 Catch:{ Exception -> 0x0116 }
        r0 = (java.util.NavigableMap) r0;	 Catch:{ Exception -> 0x0116 }
        return r0;
        r6 = move-exception;
        r0 = (java.util.Map) r0;
        dispose(r0);
        r6 = (java.lang.Throwable) r6;
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.MultiSnapThumbnailViewModelKt.copyAtLeastOne(java.util.NavigableMap, java.lang.Integer, java.lang.Integer, java.lang.String):java.util.NavigableMap");
    }

    public static /* synthetic */ NavigableMap copyAtLeastOne$default(NavigableMap navigableMap, Integer num, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            str = TAG;
        }
        return copyAtLeastOne(navigableMap, num, num2, str);
    }

    public static final void dispose(Map<? extends Object, ? extends ajej> map) {
        akcr.b(map, "receiver$0");
        Collection arrayList = new ArrayList(map.size());
        for (Entry value : map.entrySet()) {
            ((ajej) value.getValue()).dispose();
            arrayList.add(ajxw.a);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x00a9 in {5, 15, 16, 17, 19, 22} preds:[]
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
    public static final java.util.NavigableMap<java.lang.Integer, defpackage.kaz<defpackage.jwj>> extend(java.util.NavigableMap<java.lang.Integer, defpackage.kaz<defpackage.jwj>> r4, java.util.List<? extends defpackage.ajxm<? extends defpackage.kaz<defpackage.jwj>, java.lang.Integer>> r5, java.lang.String r6) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r4, r0);
        r0 = "bitmapAndTimestamps";
        defpackage.akcr.b(r5, r0);
        r0 = "owner";
        defpackage.akcr.b(r6, r0);
        r0 = new java.util.concurrent.ConcurrentSkipListMap;
        r0.<init>();
        r4 = (java.util.Map) r4;	 Catch:{ Exception -> 0x00a0 }
        r1 = new java.util.LinkedHashMap;	 Catch:{ Exception -> 0x00a0 }
        r2 = r4.size();	 Catch:{ Exception -> 0x00a0 }
        r2 = defpackage.ajzm.a(r2);	 Catch:{ Exception -> 0x00a0 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00a0 }
        r1 = (java.util.Map) r1;	 Catch:{ Exception -> 0x00a0 }
        r4 = r4.entrySet();	 Catch:{ Exception -> 0x00a0 }
        r4 = (java.lang.Iterable) r4;	 Catch:{ Exception -> 0x00a0 }
        r4 = r4.iterator();	 Catch:{ Exception -> 0x00a0 }
        r2 = r4.hasNext();	 Catch:{ Exception -> 0x00a0 }
        if (r2 == 0) goto L_0x0050;	 Catch:{ Exception -> 0x00a0 }
        r2 = r4.next();	 Catch:{ Exception -> 0x00a0 }
        r3 = r2;	 Catch:{ Exception -> 0x00a0 }
        r3 = (java.util.Map.Entry) r3;	 Catch:{ Exception -> 0x00a0 }
        r3 = r3.getKey();	 Catch:{ Exception -> 0x00a0 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ Exception -> 0x00a0 }
        r2 = r2.getValue();	 Catch:{ Exception -> 0x00a0 }
        r2 = (defpackage.kaz) r2;	 Catch:{ Exception -> 0x00a0 }
        r2 = r2.a(r6);	 Catch:{ Exception -> 0x00a0 }
        r1.put(r3, r2);	 Catch:{ Exception -> 0x00a0 }
        goto L_0x002f;	 Catch:{ Exception -> 0x00a0 }
        r0.putAll(r1);	 Catch:{ Exception -> 0x00a0 }
        r4 = r5.iterator();	 Catch:{ Exception -> 0x00a0 }
        r5 = r4.hasNext();	 Catch:{ Exception -> 0x00a0 }
        if (r5 == 0) goto L_0x009d;	 Catch:{ Exception -> 0x00a0 }
        r5 = r4.next();	 Catch:{ Exception -> 0x00a0 }
        r5 = (defpackage.ajxm) r5;	 Catch:{ Exception -> 0x00a0 }
        r1 = r5.b;	 Catch:{ Exception -> 0x00a0 }
        r1 = r0.get(r1);	 Catch:{ Exception -> 0x00a0 }
        r1 = (defpackage.kaz) r1;	 Catch:{ Exception -> 0x00a0 }
        r2 = "pair.first.clone(owner)";
        if (r1 == 0) goto L_0x008c;
        r3 = r5.a;	 Catch:{ Exception -> 0x00a0 }
        r3 = (defpackage.kaz) r3;	 Catch:{ Exception -> 0x00a0 }
        if (r1 == r3) goto L_0x0057;	 Catch:{ Exception -> 0x00a0 }
        r1.dispose();	 Catch:{ Exception -> 0x00a0 }
        r1 = r0;	 Catch:{ Exception -> 0x00a0 }
        r1 = (java.util.Map) r1;	 Catch:{ Exception -> 0x00a0 }
        r3 = r5.b;	 Catch:{ Exception -> 0x00a0 }
        r5 = r5.a;	 Catch:{ Exception -> 0x00a0 }
        r5 = (defpackage.kaz) r5;	 Catch:{ Exception -> 0x00a0 }
        r5 = r5.a(r6);	 Catch:{ Exception -> 0x00a0 }
        defpackage.akcr.a(r5, r2);	 Catch:{ Exception -> 0x00a0 }
        r1.put(r3, r5);	 Catch:{ Exception -> 0x00a0 }
        goto L_0x0057;	 Catch:{ Exception -> 0x00a0 }
        r1 = r0;	 Catch:{ Exception -> 0x00a0 }
        r1 = (java.util.Map) r1;	 Catch:{ Exception -> 0x00a0 }
        r3 = r5.b;	 Catch:{ Exception -> 0x00a0 }
        r5 = r5.a;	 Catch:{ Exception -> 0x00a0 }
        r5 = (defpackage.kaz) r5;	 Catch:{ Exception -> 0x00a0 }
        r5 = r5.a(r6);	 Catch:{ Exception -> 0x00a0 }
        defpackage.akcr.a(r5, r2);	 Catch:{ Exception -> 0x00a0 }
        goto L_0x0088;	 Catch:{ Exception -> 0x00a0 }
        r0 = (java.util.NavigableMap) r0;	 Catch:{ Exception -> 0x00a0 }
        return r0;
        r4 = move-exception;
        r0 = (java.util.Map) r0;
        dispose(r0);
        r4 = (java.lang.Throwable) r4;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.MultiSnapThumbnailViewModelKt.extend(java.util.NavigableMap, java.util.List, java.lang.String):java.util.NavigableMap");
    }
}
