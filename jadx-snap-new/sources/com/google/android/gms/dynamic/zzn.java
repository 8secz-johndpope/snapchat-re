package com.google.android.gms.dynamic;

import com.google.android.gms.dynamic.IObjectWrapper.zza;

public final class zzn<T> extends zza {
    private final T mWrappedObject;

    private zzn(T t) {
        this.mWrappedObject = t;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x006f in {3, 8, 9, 17, 20, 23, 25, 27} preds:[]
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
    public static <T> T zzy(com.google.android.gms.dynamic.IObjectWrapper r7) {
        /*
        r0 = r7 instanceof com.google.android.gms.dynamic.zzn;
        if (r0 == 0) goto L_0x0009;
        r7 = (com.google.android.gms.dynamic.zzn) r7;
        r7 = r7.mWrappedObject;
        return r7;
        r7 = r7.asBinder();
        r0 = r7.getClass();
        r0 = r0.getDeclaredFields();
        r1 = 0;
        r2 = r0.length;
        r3 = 0;
        r4 = r1;
        r1 = 0;
        if (r3 >= r2) goto L_0x002a;
        r5 = r0[r3];
        r6 = r5.isSynthetic();
        if (r6 != 0) goto L_0x0027;
        r1 = r1 + 1;
        r4 = r5;
        r3 = r3 + 1;
        goto L_0x001a;
        r2 = 1;
        if (r1 != r2) goto L_0x0055;
        r0 = r4.isAccessible();
        if (r0 != 0) goto L_0x004d;
        r4.setAccessible(r2);
        r7 = r4.get(r7);	 Catch:{ NullPointerException -> 0x0044, IllegalAccessException -> 0x003b }
        return r7;
        r7 = move-exception;
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Could not access the field in remoteBinder.";
        r0.<init>(r1, r7);
        throw r0;
        r7 = move-exception;
        r0 = new java.lang.IllegalArgumentException;
        r1 = "Binder object is null.";
        r0.<init>(r1, r7);
        throw r0;
        r7 = new java.lang.IllegalArgumentException;
        r0 = "IObjectWrapper declared field not private!";
        r7.<init>(r0);
        throw r7;
        r7 = new java.lang.IllegalArgumentException;
        r0 = r0.length;
        r1 = 64;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r1);
        r1 = "Unexpected number of IObjectWrapper declared fields: ";
        r2.append(r1);
        r2.append(r0);
        r0 = r2.toString();
        r7.<init>(r0);
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.zzn.zzy(com.google.android.gms.dynamic.IObjectWrapper):java.lang.Object");
    }

    public static <T> IObjectWrapper zzz(T t) {
        return new zzn(t);
    }
}
