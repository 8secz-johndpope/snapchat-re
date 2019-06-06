package com.google.android.gms.internal;

import java.security.GeneralSecurityException;

final class zzduh implements zzdxm {
    private final String zzmfn;
    private final int zzmfo;
    private zzdvc zzmfp;
    private zzdum zzmfq;
    private int zzmfr;

    zzduh(zzdwl zzdwl) {
        this.zzmfn = zzdwl.zzbqu();
        String str = "invalid KeyFormat protobuf, expected AesGcmKeyFormat";
        if (this.zzmfn.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzdve zzt = zzdve.zzt(zzdwl.zzbqv());
                this.zzmfp = (zzdvc) zzdtn.zzb(zzdwl);
                this.zzmfo = zzt.getKeySize();
            } catch (zzfie e) {
                throw new GeneralSecurityException(str, e);
            }
        } else if (this.zzmfn.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzduo zzj = zzduo.zzj(zzdwl.zzbqv());
                this.zzmfq = (zzdum) zzdtn.zzb(zzdwl);
                this.zzmfr = zzj.zzbop().getKeySize();
                this.zzmfo = this.zzmfr + zzj.zzboq().getKeySize();
            } catch (zzfie e2) {
                throw new GeneralSecurityException(str, e2);
            }
        } else {
            String str2 = "unsupported AEAD DEM key type: ";
            str = String.valueOf(this.zzmfn);
            throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x00be in {4, 6, 9, 11, 13} preds:[]
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
    public final com.google.android.gms.internal.zzdsy zzah(byte[] r4) {
        /*
        r3 = this;
        r0 = r4.length;
        r1 = r3.zzmfo;
        if (r0 != r1) goto L_0x00b6;
        r0 = r3.zzmfn;
        r1 = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        r0 = r0.equals(r1);
        r1 = 0;
        if (r0 == 0) goto L_0x0037;
        r0 = com.google.android.gms.internal.zzdvc.zzbpi();
        r2 = r3.zzmfp;
        r0 = r0.zza(r2);
        r0 = (com.google.android.gms.internal.zzdvc.zza) r0;
        r2 = r3.zzmfo;
        r4 = com.google.android.gms.internal.zzfgs.zzf(r4, r1, r2);
        r4 = r0.zzs(r4);
        r4 = r4.zzczx();
        r4 = (com.google.android.gms.internal.zzfhu) r4;
        r4 = (com.google.android.gms.internal.zzdvc) r4;
        r0 = r3.zzmfn;
        r4 = com.google.android.gms.internal.zzdtn.zzb(r0, r4);
        r4 = (com.google.android.gms.internal.zzdsy) r4;
        return r4;
        r0 = r3.zzmfn;
        r2 = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x00ae;
        r0 = r3.zzmfr;
        r0 = java.util.Arrays.copyOfRange(r4, r1, r0);
        r1 = r3.zzmfr;
        r2 = r3.zzmfo;
        r4 = java.util.Arrays.copyOfRange(r4, r1, r2);
        r1 = com.google.android.gms.internal.zzduq.zzbou();
        r2 = r3.zzmfq;
        r2 = r2.zzbol();
        r1 = r1.zza(r2);
        r1 = (com.google.android.gms.internal.zzduq.zza) r1;
        r0 = com.google.android.gms.internal.zzfgs.zzaz(r0);
        r0 = r1.zzm(r0);
        r0 = r0.zzczx();
        r0 = (com.google.android.gms.internal.zzfhu) r0;
        r0 = (com.google.android.gms.internal.zzduq) r0;
        r1 = com.google.android.gms.internal.zzdwa.zzbql();
        r2 = r3.zzmfq;
        r2 = r2.zzbom();
        r1 = r1.zza(r2);
        r1 = (com.google.android.gms.internal.zzdwa.zza) r1;
        r4 = com.google.android.gms.internal.zzfgs.zzaz(r4);
        r4 = r1.zzaf(r4);
        r4 = r4.zzczx();
        r4 = (com.google.android.gms.internal.zzfhu) r4;
        r4 = (com.google.android.gms.internal.zzdwa) r4;
        r1 = com.google.android.gms.internal.zzdum.zzbon();
        r2 = r3.zzmfq;
        r2 = r2.getVersion();
        r1 = r1.zzgc(r2);
        r0 = r1.zzb(r0);
        r4 = r0.zzb(r4);
        r4 = r4.zzczx();
        r4 = (com.google.android.gms.internal.zzfhu) r4;
        r4 = (com.google.android.gms.internal.zzdum) r4;
        goto L_0x002e;
        r4 = new java.security.GeneralSecurityException;
        r0 = "unknown DEM key type";
        r4.<init>(r0);
        throw r4;
        r4 = new java.security.GeneralSecurityException;
        r0 = "Symmetric key has incorrect length";
        r4.<init>(r0);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzduh.zzah(byte[]):com.google.android.gms.internal.zzdsy");
    }

    public final int zzbok() {
        return this.zzmfo;
    }
}
