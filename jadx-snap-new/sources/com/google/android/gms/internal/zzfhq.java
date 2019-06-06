package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzfhq<FieldDescriptorType extends zzfhs<FieldDescriptorType>> {
    private static final zzfhq zzppc = new zzfhq(true);
    private boolean zzldh;
    private final zzfjy<FieldDescriptorType, Object> zzppa = zzfjy.zzmq(16);
    private boolean zzppb = false;

    private zzfhq() {
    }

    private zzfhq(boolean z) {
        if (!this.zzldh) {
            this.zzppa.zzbkr();
            this.zzldh = true;
        }
    }

    static int zza(zzfky zzfky, int i, Object obj) {
        i = zzfhg.zzlw(i);
        if (zzfky == zzfky.GROUP) {
            zzfhz.zzh((zzfjc) obj);
            i <<= 1;
        }
        return i + zzb(zzfky, obj);
    }

    private void zza(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.zzczn()) {
            zza(fieldDescriptorType.zzczl(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fieldDescriptorType.zzczl(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzfig) {
            this.zzppb = true;
        }
        this.zzppa.put((Comparable) fieldDescriptorType, obj);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x004e in {2, 7, 11, 12, 17, 18, 19, 20, 21, 22, 23, 24, 26, 28} preds:[]
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
    private static void zza(com.google.android.gms.internal.zzfky r2, java.lang.Object r3) {
        /*
        com.google.android.gms.internal.zzfhz.checkNotNull(r3);
        r0 = com.google.android.gms.internal.zzfhr.zzppd;
        r2 = r2.zzdci();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x0040;
            case 2: goto L_0x003d;
            case 3: goto L_0x003a;
            case 4: goto L_0x0037;
            case 5: goto L_0x0034;
            case 6: goto L_0x0031;
            case 7: goto L_0x0028;
            case 8: goto L_0x001e;
            case 9: goto L_0x0015;
            default: goto L_0x0014;
        };
        goto L_0x0043;
        r2 = r3 instanceof com.google.android.gms.internal.zzfjc;
        if (r2 != 0) goto L_0x0026;
        r2 = r3 instanceof com.google.android.gms.internal.zzfig;
        if (r2 == 0) goto L_0x0043;
        goto L_0x0026;
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x0026;
        r2 = r3 instanceof com.google.android.gms.internal.zzfia;
        if (r2 == 0) goto L_0x0043;
        r1 = 1;
        goto L_0x0043;
        r2 = r3 instanceof com.google.android.gms.internal.zzfgs;
        if (r2 != 0) goto L_0x0026;
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0043;
        goto L_0x0026;
        r0 = r3 instanceof java.lang.String;
        goto L_0x0042;
        r0 = r3 instanceof java.lang.Boolean;
        goto L_0x0042;
        r0 = r3 instanceof java.lang.Double;
        goto L_0x0042;
        r0 = r3 instanceof java.lang.Float;
        goto L_0x0042;
        r0 = r3 instanceof java.lang.Long;
        goto L_0x0042;
        r0 = r3 instanceof java.lang.Integer;
        r1 = r0;
        if (r1 == 0) goto L_0x0046;
        return;
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfhq.zza(com.google.android.gms.internal.zzfky, java.lang.Object):void");
    }

    private static int zzb(zzfhs<?> zzfhs, Object obj) {
        zzfky zzczl = zzfhs.zzczl();
        int zzhu = zzfhs.zzhu();
        if (!zzfhs.zzczn()) {
            return zza(zzczl, zzhu, obj);
        }
        int i = 0;
        if (zzfhs.zzczo()) {
            for (Object obj2 : (List) obj2) {
                i += zzb(zzczl, obj2);
            }
            return (zzfhg.zzlw(zzhu) + i) + zzfhg.zzmf(i);
        }
        for (Object obj22 : (List) obj22) {
            i += zza(zzczl, zzhu, obj22);
        }
        return i;
    }

    private static int zzb(zzfky zzfky, Object obj) {
        switch (zzfky) {
            case DOUBLE:
                return zzfhg.zzo(((Double) obj).doubleValue());
            case FLOAT:
                return zzfhg.zzg(((Float) obj).floatValue());
            case INT64:
                return zzfhg.zzcx(((Long) obj).longValue());
            case UINT64:
                return zzfhg.zzcy(((Long) obj).longValue());
            case INT32:
                return zzfhg.zzlx(((Integer) obj).intValue());
            case FIXED64:
                return zzfhg.zzda(((Long) obj).longValue());
            case FIXED32:
                return zzfhg.zzma(((Integer) obj).intValue());
            case BOOL:
                return zzfhg.zzdm(((Boolean) obj).booleanValue());
            case GROUP:
                return zzfhg.zzg((zzfjc) obj);
            case MESSAGE:
                return obj instanceof zzfig ? zzfhg.zza((zzfig) obj) : zzfhg.zzf((zzfjc) obj);
            case STRING:
                return obj instanceof zzfgs ? zzfhg.zzaz((zzfgs) obj) : zzfhg.zztx((String) obj);
            case BYTES:
                return obj instanceof zzfgs ? zzfhg.zzaz((zzfgs) obj) : zzfhg.zzbd((byte[]) obj);
            case UINT32:
                return zzfhg.zzly(((Integer) obj).intValue());
            case SFIXED32:
                return zzfhg.zzmb(((Integer) obj).intValue());
            case SFIXED64:
                return zzfhg.zzdb(((Long) obj).longValue());
            case SINT32:
                return zzfhg.zzlz(((Integer) obj).intValue());
            case SINT64:
                return zzfhg.zzcz(((Long) obj).longValue());
            case ENUM:
                return obj instanceof zzfia ? zzfhg.zzmc(((zzfia) obj).zzhu()) : zzfhg.zzmc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int zzb(Entry<FieldDescriptorType, Object> entry) {
        zzfhs zzfhs = (zzfhs) entry.getKey();
        Object value = entry.getValue();
        return (zzfhs.zzczm() != zzfld.MESSAGE || zzfhs.zzczn() || zzfhs.zzczo()) ? zzb(zzfhs, value) : value instanceof zzfig ? zzfhg.zzb(((zzfhs) entry.getKey()).zzhu(), (zzfig) value) : zzfhg.zzd(((zzfhs) entry.getKey()).zzhu(), (zzfjc) value);
    }

    public static <T extends zzfhs<T>> zzfhq<T> zzczj() {
        return zzppc;
    }

    public final /* synthetic */ Object clone() {
        Entry zzmr;
        zzfhq zzfhq = new zzfhq();
        for (int i = 0; i < this.zzppa.zzdbp(); i++) {
            zzmr = this.zzppa.zzmr(i);
            zzfhq.zza((zzfhs) zzmr.getKey(), zzmr.getValue());
        }
        for (Entry zzmr2 : this.zzppa.zzdbq()) {
            zzfhq.zza((zzfhs) zzmr2.getKey(), zzmr2.getValue());
        }
        zzfhq.zzppb = this.zzppb;
        return zzfhq;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfhq)) {
            return false;
        }
        return this.zzppa.equals(((zzfhq) obj).zzppa);
    }

    public final int hashCode() {
        return this.zzppa.hashCode();
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzppb ? new zzfij(this.zzppa.entrySet().iterator()) : this.zzppa.entrySet().iterator();
    }

    public final int zzczk() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzppa.zzdbp(); i2++) {
            i += zzb(this.zzppa.zzmr(i2));
        }
        for (Entry zzb : this.zzppa.zzdbq()) {
            i += zzb(zzb);
        }
        return i;
    }
}
