package defpackage;

import java.security.KeyFactory;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ian */
public final class ian {
    public final SecureRandom a;
    public final hys b;
    public final ajwy<hyk> c;

    public ian(SecureRandom secureRandom, hys hys, ajwy<hyk> ajwy) {
        this.a = secureRandom;
        this.b = hys;
        this.c = ajwy;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 0 || bArr2.length == 0) {
            throw new IllegalArgumentException("Zero length keys");
        }
        hyr a = this.b.a(hyt.SEC_ECDH_GENERATE_SECRET_LATENCY).a();
        KeyAgreement instance = KeyAgreement.getInstance("ECDH");
        PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr);
        String str = "EC";
        instance.init(KeyFactory.getInstance(str).generatePrivate(pKCS8EncodedKeySpec));
        instance.doPhase(KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArr2)), true);
        bArr = instance.generateSecret();
        ((hyk) this.c.get()).d(a);
        return bArr;
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        hyr a = this.b.a(hyt.SEC_HMAC_TAG_LATENCY).a();
        String str = "HmacSHA256";
        Mac instance = Mac.getInstance(str);
        instance.init(new SecretKeySpec(bArr, str));
        bArr = instance.doFinal(bArr2);
        ((hyk) this.c.get()).e(a);
        return bArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x00d7 in {2, 3, 8, 11, 13, 15} preds:[]
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
    public final byte[] c(byte[] r8, byte[] r9) {
        /*
        r7 = this;
        r0 = r7.b;
        r1 = defpackage.hyt.SEC_HKDF_LATENCY;
        r0 = r0.a(r1);
        r0 = r0.a();
        r1 = new akvp;
        r2 = new akvm;
        r2.<init>();
        r1.<init>(r2);
        r2 = new akwa;
        r2.<init>(r8, r9);
        r2 = (defpackage.akwa) r2;
        r8 = r1.a;
        r9 = r2.b;
        r9 = defpackage.akwc.b(r9);
        r3 = r2.a;
        r3 = defpackage.akwc.b(r3);
        r4 = r1.a;
        r5 = new akwb;
        r5.<init>(r3);
        r4.a(r5);
        if (r9 != 0) goto L_0x0046;
        r9 = r1.a;
        r4 = new akwb;
        r5 = r1.b;
        r5 = new byte[r5];
        r4.<init>(r5);
        r9.a(r4);
        goto L_0x0050;
        r4 = r1.a;
        r5 = new akwb;
        r5.<init>(r9);
        r4.a(r5);
        r9 = r1.a;
        r4 = r3.length;
        r9.a(r3, r4);
        r9 = r1.b;
        r9 = new byte[r9];
        r3 = r1.a;
        r3.a(r9);
        r3 = new akwb;
        r3.<init>(r9);
        r8.a(r3);
        r8 = r2.c;
        r8 = defpackage.akwc.b(r8);
        r1.c = r8;
        r8 = 0;
        r1.e = r8;
        r9 = r1.b;
        r9 = new byte[r9];
        r1.d = r9;
        r9 = 80;
        r2 = new byte[r9];
        r3 = r1.e;
        r3 = r3 + r9;
        r4 = r1.b;
        r4 = r4 * 255;
        if (r3 > r4) goto L_0x00cf;
        r3 = r1.e;
        r4 = r1.b;
        r3 = r3 % r4;
        if (r3 != 0) goto L_0x008f;
        r1.a();
        r3 = r1.e;
        r4 = r1.b;
        r3 = r3 % r4;
        r4 = r1.b;
        r5 = r1.e;
        r6 = r1.b;
        r5 = r5 % r6;
        r4 = r4 - r5;
        r4 = java.lang.Math.min(r4, r9);
        r5 = r1.d;
        java.lang.System.arraycopy(r5, r3, r2, r8, r4);
        r3 = r1.e;
        r3 = r3 + r4;
        r1.e = r3;
        r9 = r9 - r4;
        if (r9 <= 0) goto L_0x00c3;
        r1.a();
        r3 = r1.b;
        r3 = java.lang.Math.min(r3, r9);
        r5 = r1.d;
        java.lang.System.arraycopy(r5, r8, r2, r4, r3);
        r5 = r1.e;
        r5 = r5 + r3;
        r1.e = r5;
        r9 = r9 - r3;
        r4 = r4 + r3;
        goto L_0x00ab;
        r8 = r7.c;
        r8 = r8.get();
        r8 = (defpackage.hyk) r8;
        r8.f(r0);
        return r2;
        r8 = new akvc;
        r9 = "HKDF may only be used for 255 * HashLen bytes of output";
        r8.<init>(r9);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ian.c(byte[], byte[]):byte[]");
    }
}
