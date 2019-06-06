package com.google.android.gms.internal;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class zzdxx<T_WRAPPER extends zzdxy<T_ENGINE>, T_ENGINE> {
    private static final Logger logger = Logger.getLogger(zzdxx.class.getName());
    private static final List<Provider> zzmlj;
    public static final zzdxx<zzdxz, Cipher> zzmlk = new zzdxx(new zzdxz());
    public static final zzdxx<zzdyd, Mac> zzmll = new zzdxx(new zzdyd());
    private static zzdxx<zzdyf, Signature> zzmlm = new zzdxx(new zzdyf());
    private static zzdxx<zzdye, MessageDigest> zzmln = new zzdxx(new zzdye());
    public static final zzdxx<zzdya, KeyAgreement> zzmlo = new zzdxx(new zzdya());
    public static final zzdxx<zzdyc, KeyPairGenerator> zzmlp = new zzdxx(new zzdyc());
    public static final zzdxx<zzdyb, KeyFactory> zzmlq = new zzdxx(new zzdyb());
    private T_WRAPPER zzmlr;
    private List<Provider> zzmls = zzmlj;
    private boolean zzmlt = true;

    static {
        if (zzdyo.zzakt()) {
            String[] strArr = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                Provider provider = Security.getProvider(strArr[i]);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    logger.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{r4}));
                }
            }
            zzmlj = arrayList;
        } else {
            zzmlj = new ArrayList();
        }
    }

    private zzdxx(T_WRAPPER t_wrapper) {
        this.zzmlr = t_wrapper;
    }

    private final boolean zza(String str, Provider provider) {
        try {
            this.zzmlr.zzb(str, provider);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x002f in {5, 7, 10, 12} preds:[]
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
    public final T_ENGINE zzoy(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3.zzmls;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x001f;
        r1 = r0.next();
        r1 = (java.security.Provider) r1;
        r2 = r3.zza(r4, r1);
        if (r2 == 0) goto L_0x0006;
        r0 = r3.zzmlr;
        r4 = r0.zzb(r4, r1);
        return r4;
        r0 = r3.zzmlt;
        if (r0 == 0) goto L_0x0027;
        r0 = r3.zzmlr;
        r1 = 0;
        goto L_0x001a;
        r4 = new java.security.GeneralSecurityException;
        r0 = "No good Provider found.";
        r4.<init>(r0);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdxx.zzoy(java.lang.String):java.lang.Object");
    }
}
