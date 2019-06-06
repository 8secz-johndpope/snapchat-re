package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class zzflp implements Cloneable {
    private Object value;
    private zzfln<?, ?> zzpvr;
    private List<zzflu> zzpvs = new ArrayList();

    zzflp() {
    }

    private final byte[] toByteArray() {
        byte[] bArr = new byte[zzq()];
        zza(zzflk.zzbf(bArr));
        return bArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:47:0x00d1 in {4, 5, 10, 11, 14, 20, 23, 26, 29, 32, 35, 42, 43, 46} preds:[]
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
    private com.google.android.gms.internal.zzflp zzdcm() {
        /*
        r5 = this;
        r0 = new com.google.android.gms.internal.zzflp;
        r0.<init>();
        r1 = r5.zzpvr;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r0.zzpvr = r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.zzpvs;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 != 0) goto L_0x0011;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = 0;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r0.zzpvs = r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x0018;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r0.zzpvs;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r2 = r5.zzpvs;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1.addAll(r2);	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x00c9;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof com.google.android.gms.internal.zzfls;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x0030;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (com.google.android.gms.internal.zzfls) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (com.google.android.gms.internal.zzfls) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r0.value = r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x00c9;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof byte[];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x003f;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (byte[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x002c;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof byte[][];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r2 = 0;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x005f;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (byte[][]) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r3 = r1.length;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r3 = new byte[r3][];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r0.value = r3;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r4 = r1.length;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r2 >= r4) goto L_0x00c9;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r4 = r1[r2];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r4 = r4.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r4 = (byte[]) r4;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r3[r2] = r4;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r2 = r2 + 1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x004f;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof boolean[];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x006e;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (boolean[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x002c;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof int[];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x007d;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (int[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x002c;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof long[];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x008c;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (long[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x002c;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof float[];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x009b;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (float[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x002c;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof double[];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x00aa;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (double[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        goto L_0x002c;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r1 instanceof com.google.android.gms.internal.zzfls[];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r1 == 0) goto L_0x00c9;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = r5.value;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r1 = (com.google.android.gms.internal.zzfls[]) r1;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r3 = r1.length;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r3 = new com.google.android.gms.internal.zzfls[r3];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r0.value = r3;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r4 = r1.length;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        if (r2 >= r4) goto L_0x00c9;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r4 = r1[r2];	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r4 = r4.clone();	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r4 = (com.google.android.gms.internal.zzfls) r4;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r3[r2] = r4;	 Catch:{ CloneNotSupportedException -> 0x00ca }
        r2 = r2 + 1;
        goto L_0x00b9;
        return r0;
        r0 = move-exception;
        r1 = new java.lang.AssertionError;
        r1.<init>(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzflp.zzdcm():com.google.android.gms.internal.zzflp");
    }

    public final /* synthetic */ Object clone() {
        return zzdcm();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzflp)) {
            return false;
        }
        zzflp zzflp = (zzflp) obj;
        if (this.value == null || zzflp.value == null) {
            List list = this.zzpvs;
            if (list != null) {
                List list2 = zzflp.zzpvs;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(toByteArray(), zzflp.toByteArray());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        zzfln zzfln = this.zzpvr;
        if (zzfln != zzflp.zzpvr) {
            return false;
        }
        if (!zzfln.zznro.isArray()) {
            return this.value.equals(zzflp.value);
        }
        Object obj2 = this.value;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) zzflp.value) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) zzflp.value) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) zzflp.value) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) zzflp.value) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) zzflp.value) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) zzflp.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) zzflp.value);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzflk zzflk) {
        Object obj = this.value;
        if (obj != null) {
            zzfln zzfln = this.zzpvr;
            if (zzfln.zzpvm) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    Object obj2 = Array.get(obj, i);
                    if (obj2 != null) {
                        zzfln.zza(obj2, zzflk);
                    }
                }
                return;
            }
            zzfln.zza(obj, zzflk);
            return;
        }
        for (zzflu zzflu : this.zzpvs) {
            zzflk.zzmy(zzflu.tag);
            zzflk.zzbh(zzflu.zzjwl);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzflu zzflu) {
        this.zzpvs.add(zzflu);
    }

    /* Access modifiers changed, original: final */
    public final int zzq() {
        Object obj = this.value;
        int i = 0;
        int i2;
        if (obj != null) {
            zzfln zzfln = this.zzpvr;
            if (!zzfln.zzpvm) {
                return zzfln.zzcw(obj);
            }
            int length = Array.getLength(obj);
            i2 = 0;
            while (i < length) {
                if (Array.get(obj, i) != null) {
                    i2 += zzfln.zzcw(Array.get(obj, i));
                }
                i++;
            }
            return i2;
        }
        i2 = 0;
        for (zzflu zzflu : this.zzpvs) {
            i2 += (zzflk.zzmf(zzflu.tag) + 0) + zzflu.zzjwl.length;
        }
        return i2;
    }
}
