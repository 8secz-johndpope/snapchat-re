package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzdtn {
    private static final Logger logger = Logger.getLogger(zzdtn.class.getName());
    private static final ConcurrentMap<String, zzdtf> zzmfb = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzmfc = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzdsz> zzmfd = new ConcurrentHashMap();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:44:0x0111 in {16, 18, 21, 23, 25, 27, 30, 32, 40, 41, 43} preds:[]
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
    public static <P> com.google.android.gms.internal.zzdtl<P> zza(com.google.android.gms.internal.zzdtg r8, com.google.android.gms.internal.zzdtf<P> r9) {
        /*
        r9 = r8.zzboe();
        r0 = r9.zzbrl();
        if (r0 == 0) goto L_0x0109;
        r0 = r9.zzbrj();
        r9 = r9.zzbrk();
        r9 = r9.iterator();
        r1 = 1;
        r2 = 0;
        r3 = 0;
        r4 = 1;
        r5 = r9.hasNext();
        if (r5 == 0) goto L_0x00ac;
        r5 = r9.next();
        r5 = (com.google.android.gms.internal.zzdwp.zzb) r5;
        r6 = r5.zzbrn();
        if (r6 == 0) goto L_0x0094;
        r6 = r5.zzbrr();
        r7 = com.google.android.gms.internal.zzdxb.UNKNOWN_PREFIX;
        if (r6 == r7) goto L_0x007c;
        r6 = r5.zzbrp();
        r7 = com.google.android.gms.internal.zzdwj.UNKNOWN_STATUS;
        if (r6 == r7) goto L_0x0064;
        r6 = r5.zzbrp();
        r7 = com.google.android.gms.internal.zzdwj.ENABLED;
        if (r6 != r7) goto L_0x0056;
        r6 = r5.zzbrq();
        if (r6 != r0) goto L_0x0056;
        if (r3 != 0) goto L_0x004e;
        r3 = 1;
        goto L_0x0056;
        r8 = new java.security.GeneralSecurityException;
        r9 = "keyset contains multiple primary keys";
        r8.<init>(r9);
        throw r8;
        r5 = r5.zzbro();
        r5 = r5.zzbqw();
        r6 = com.google.android.gms.internal.zzdwg.zzb.ASYMMETRIC_PUBLIC;
        if (r5 == r6) goto L_0x001a;
        r4 = 0;
        goto L_0x001a;
        r8 = new java.security.GeneralSecurityException;
        r9 = new java.lang.Object[r1];
        r0 = r5.zzbrq();
        r0 = java.lang.Integer.valueOf(r0);
        r9[r2] = r0;
        r0 = "key %d has unknown status";
        r9 = java.lang.String.format(r0, r9);
        r8.<init>(r9);
        throw r8;
        r8 = new java.security.GeneralSecurityException;
        r9 = new java.lang.Object[r1];
        r0 = r5.zzbrq();
        r0 = java.lang.Integer.valueOf(r0);
        r9[r2] = r0;
        r0 = "key %d has unknown prefix";
        r9 = java.lang.String.format(r0, r9);
        r8.<init>(r9);
        throw r8;
        r8 = new java.security.GeneralSecurityException;
        r9 = new java.lang.Object[r1];
        r0 = r5.zzbrq();
        r0 = java.lang.Integer.valueOf(r0);
        r9[r2] = r0;
        r0 = "key %d has no key data";
        r9 = java.lang.String.format(r0, r9);
        r8.<init>(r9);
        throw r8;
        if (r3 != 0) goto L_0x00b9;
        if (r4 == 0) goto L_0x00b1;
        goto L_0x00b9;
        r8 = new java.security.GeneralSecurityException;
        r9 = "keyset doesn't contain a valid primary key";
        r8.<init>(r9);
        throw r8;
        r9 = new com.google.android.gms.internal.zzdtl;
        r9.<init>();
        r0 = r8.zzboe();
        r0 = r0.zzbrk();
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0108;
        r1 = r0.next();
        r1 = (com.google.android.gms.internal.zzdwp.zzb) r1;
        r2 = r1.zzbrp();
        r3 = com.google.android.gms.internal.zzdwj.ENABLED;
        if (r2 != r3) goto L_0x00ca;
        r2 = r1.zzbro();
        r2 = r2.zzbqu();
        r3 = r1.zzbro();
        r3 = r3.zzbqv();
        r2 = zza(r2, r3);
        r2 = r9.zza(r2, r1);
        r1 = r1.zzbrq();
        r3 = r8.zzboe();
        r3 = r3.zzbrj();
        if (r1 != r3) goto L_0x00ca;
        r9.zza(r2);
        goto L_0x00ca;
        return r9;
        r8 = new java.security.GeneralSecurityException;
        r9 = "empty keyset";
        r8.<init>(r9);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdtn.zza(com.google.android.gms.internal.zzdtg, com.google.android.gms.internal.zzdtf):com.google.android.gms.internal.zzdtl");
    }

    public static <P> zzdwg zza(zzdwl zzdwl) {
        zzdtf zzon = zzon(zzdwl.zzbqu());
        if (((Boolean) zzmfc.get(zzdwl.zzbqu())).booleanValue()) {
            return zzon.zzc(zzdwl.zzbqv());
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(zzdwl.zzbqu());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public static <P> zzfjc zza(String str, zzfjc zzfjc) {
        zzdtf zzon = zzon(str);
        if (((Boolean) zzmfc.get(str)).booleanValue()) {
            return zzon.zzb(zzfjc);
        }
        String str2 = "newKey-operation not permitted for key type ";
        str = String.valueOf(str);
        throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    private static <P> P zza(String str, zzfgs zzfgs) {
        return zzon(str).zza(zzfgs);
    }

    public static synchronized <P> void zza(String str, zzdsz<P> zzdsz) {
        synchronized (zzdtn.class) {
            if (zzmfd.containsKey(str.toLowerCase())) {
                if (!zzdsz.getClass().equals(((zzdsz) zzmfd.get(str.toLowerCase())).getClass())) {
                    Logger logger = logger;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "addCatalogue";
                    String str4 = "Attempted overwrite of a catalogueName catalogue for name ";
                    String valueOf = String.valueOf(str);
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 47);
                    stringBuilder.append("catalogue for name ");
                    stringBuilder.append(str);
                    stringBuilder.append(" has been already registered");
                    throw new GeneralSecurityException(stringBuilder.toString());
                }
            }
            zzmfd.put(str.toLowerCase(), zzdsz);
        }
    }

    public static <P> void zza(String str, zzdtf<P> zzdtf) {
        zza(str, zzdtf, true);
    }

    public static synchronized <P> void zza(String str, zzdtf<P> zzdtf, boolean z) {
        synchronized (zzdtn.class) {
            if (zzdtf != null) {
                if (zzmfb.containsKey(str)) {
                    zzdtf zzon = zzon(str);
                    boolean booleanValue = ((Boolean) zzmfc.get(str)).booleanValue();
                    if (!zzdtf.getClass().equals(zzon.getClass()) || (!booleanValue && z)) {
                        Logger logger = logger;
                        Level level = Level.WARNING;
                        String str2 = "com.google.crypto.tink.Registry";
                        String str3 = "registerKeyManager";
                        String str4 = "Attempted overwrite of a registered key manager for key type ";
                        String valueOf = String.valueOf(str);
                        logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, zzon.getClass().getName(), zzdtf.getClass().getName()}));
                    }
                }
                zzmfb.put(str, zzdtf);
                zzmfc.put(str, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static <P> zzfjc zzb(zzdwl zzdwl) {
        zzdtf zzon = zzon(zzdwl.zzbqu());
        if (((Boolean) zzmfc.get(zzdwl.zzbqu())).booleanValue()) {
            return zzon.zzb(zzdwl.zzbqv());
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(zzdwl.zzbqu());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public static <P> P zzb(String str, zzfjc zzfjc) {
        return zzon(str).zza(zzfjc);
    }

    public static <P> P zzf(String str, byte[] bArr) {
        return zza(str, zzfgs.zzaz(bArr));
    }

    public static <P> zzdsz<P> zzom(String str) {
        if (str != null) {
            zzdsz zzdsz = (zzdsz) zzmfd.get(str.toLowerCase());
            if (zzdsz != null) {
                return zzdsz;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                str = String.valueOf(format);
                format = "Maybe call DeterministicAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                str = String.valueOf(format);
                format = "Maybe call StreamingAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                str = String.valueOf(format);
                format = "Maybe call HybridConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                str = String.valueOf(format);
                format = "Maybe call MacConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                str = String.valueOf(format);
                format = "Maybe call SignatureConfig.init().";
            } else {
                if (str.toLowerCase().startsWith("tink")) {
                    str = String.valueOf(format);
                    format = "Maybe call TinkConfig.init().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str.concat(format);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    private static <P> zzdtf<P> zzon(String str) {
        zzdtf zzdtf = (zzdtf) zzmfb.get(str);
        if (zzdtf != null) {
            return zzdtf;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 78);
        stringBuilder.append("No key manager found for key type: ");
        stringBuilder.append(str);
        stringBuilder.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(stringBuilder.toString());
    }
}
