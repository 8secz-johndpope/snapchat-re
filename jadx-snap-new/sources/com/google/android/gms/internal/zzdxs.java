package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

public final class zzdxs {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:50:0x014e in {4, 9, 25, 27, 29, 34, 35, 36, 40, 42, 43, 46, 47, 49} preds:[]
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
    private static java.math.BigInteger zza(java.math.BigInteger r9, boolean r10, java.security.spec.EllipticCurve r11) {
        /*
        r10 = zza(r11);
        r0 = r11.getA();
        r11 = r11.getB();
        r1 = r9.multiply(r9);
        r0 = r1.add(r0);
        r9 = r0.multiply(r9);
        r9 = r9.add(r11);
        r9 = r9.mod(r10);
        r11 = r10.signum();
        r0 = 1;
        if (r11 != r0) goto L_0x0146;
        r9 = r9.mod(r10);
        r11 = 0;
        r1 = java.math.BigInteger.ZERO;
        r1 = r9.equals(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x0039;
        r9 = java.math.BigInteger.ZERO;
        goto L_0x0137;
        r1 = r10.testBit(r2);
        r3 = 2;
        if (r1 == 0) goto L_0x0056;
        r1 = r10.testBit(r0);
        if (r1 == 0) goto L_0x0056;
        r11 = java.math.BigInteger.ONE;
        r11 = r10.add(r11);
        r11 = r11.shiftRight(r3);
        r11 = r9.modPow(r11, r10);
        goto L_0x011d;
        r1 = r10.testBit(r2);
        if (r1 == 0) goto L_0x011d;
        r1 = r10.testBit(r0);
        if (r1 != 0) goto L_0x011d;
        r11 = java.math.BigInteger.ONE;
        r1 = java.math.BigInteger.ONE;
        r1 = r10.subtract(r1);
        r1 = r1.shiftRight(r0);
        r4 = 0;
        r5 = r11.multiply(r11);
        r5 = r5.subtract(r9);
        r5 = r5.mod(r10);
        r6 = java.math.BigInteger.ZERO;
        r6 = r5.equals(r6);
        if (r6 != 0) goto L_0x0136;
        r6 = r5.modPow(r1, r10);
        r7 = java.math.BigInteger.ONE;
        r7 = r6.add(r7);
        r7 = r7.equals(r10);
        if (r7 != 0) goto L_0x00bd;
        r5 = java.math.BigInteger.ONE;
        r5 = r6.equals(r5);
        r6 = "p is not prime";
        if (r5 == 0) goto L_0x00b7;
        r5 = java.math.BigInteger.ONE;
        r11 = r11.add(r5);
        r4 = r4 + r0;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r4 != r5) goto L_0x006f;
        r5 = 80;
        r5 = r10.isProbablePrime(r5);
        if (r5 == 0) goto L_0x00b1;
        goto L_0x006f;
        r9 = new java.security.InvalidAlgorithmParameterException;
        r9.<init>(r6);
        throw r9;
        r9 = new java.security.InvalidAlgorithmParameterException;
        r9.<init>(r6);
        throw r9;
        r1 = java.math.BigInteger.ONE;
        r1 = r10.add(r1);
        r1 = r1.shiftRight(r0);
        r4 = java.math.BigInteger.ONE;
        r6 = r1.bitLength();
        r6 = r6 - r3;
        r3 = r11;
        if (r6 < 0) goto L_0x011c;
        r7 = r3.multiply(r4);
        r3 = r3.multiply(r3);
        r4 = r4.multiply(r4);
        r4 = r4.mod(r10);
        r4 = r4.multiply(r5);
        r3 = r3.add(r4);
        r3 = r3.mod(r10);
        r4 = r7.add(r7);
        r4 = r4.mod(r10);
        r7 = r1.testBit(r6);
        if (r7 == 0) goto L_0x0119;
        r7 = r3.multiply(r11);
        r8 = r4.multiply(r5);
        r7 = r7.add(r8);
        r7 = r7.mod(r10);
        r4 = r11.multiply(r4);
        r3 = r4.add(r3);
        r3 = r3.mod(r10);
        r4 = r3;
        r3 = r7;
        r6 = r6 + -1;
        goto L_0x00cf;
        r11 = r3;
        if (r11 == 0) goto L_0x0136;
        r1 = r11.multiply(r11);
        r1 = r1.mod(r10);
        r9 = r1.compareTo(r9);
        if (r9 != 0) goto L_0x012e;
        goto L_0x0136;
        r9 = new java.security.GeneralSecurityException;
        r10 = "Could not find a modular square root";
        r9.<init>(r10);
        throw r9;
        r9 = r11;
        r11 = r9.testBit(r2);
        if (r0 == r11) goto L_0x0145;
        r9 = r10.subtract(r9);
        r9 = r9.mod(r10);
        return r9;
        r9 = new java.security.InvalidAlgorithmParameterException;
        r10 = "p must be positive";
        r9.<init>(r10);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzdxs.zza(java.math.BigInteger, boolean, java.security.spec.EllipticCurve):java.math.BigInteger");
    }

    private static BigInteger zza(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static KeyPair zza(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzdxx.zzmlp.zzoy("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static ECPublicKey zza(zzdxu zzdxu, byte[] bArr, byte[] bArr2) {
        ECParameterSpec zza = zza(zzdxu);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        zza(eCPoint, zza.getCurve());
        return (ECPublicKey) ((KeyFactory) zzdxx.zzmlq.zzoy("EC")).generatePublic(new ECPublicKeySpec(eCPoint, zza));
    }

    public static ECParameterSpec zza(zzdxu zzdxu) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = zzdxt.zzmky[zzdxu.ordinal()];
        if (i == 1) {
            str = "115792089210356248762697446949407573530086143415290314195533631308867097853951";
            str2 = "115792089210356248762697446949407573529996955224135760342422259061068512044369";
            str3 = "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b";
            str4 = "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296";
            str5 = "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5";
        } else if (i == 2) {
            str = "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319";
            str2 = "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643";
            str3 = "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef";
            str4 = "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7";
            str5 = "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f";
        } else if (i == 3) {
            str = "6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151";
            str2 = "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449";
            str3 = "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00";
            str4 = "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66";
            str5 = "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650";
        } else {
            str = String.valueOf(zzdxu);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 22);
            stringBuilder.append("curve not implemented:");
            stringBuilder.append(str);
            throw new NoSuchAlgorithmException(stringBuilder.toString());
        }
        return zzb(str, str2, str3, str4, str5);
    }

    static void zza(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger zza = zza(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(zza) != -1) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(zza) != -1) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(zza).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(zza))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) {
        zza(eCPoint, eCPrivateKey.getParams().getCurve());
        ECParameterSpec params = eCPrivateKey.getParams();
        params.getCurve();
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, params));
        KeyAgreement keyAgreement = (KeyAgreement) zzdxx.zzmlo.zzoy("ECDH");
        keyAgreement.init(eCPrivateKey);
        keyAgreement.doPhase(generatePublic, true);
        byte[] generateSecret = keyAgreement.generateSecret();
        EllipticCurve curve = eCPrivateKey.getParams().getCurve();
        BigInteger bigInteger = new BigInteger(1, generateSecret);
        if (bigInteger.signum() == -1 || bigInteger.compareTo(zza(curve)) != -1) {
            throw new GeneralSecurityException("shared secret is out of range");
        }
        zza(bigInteger, true, curve);
        return generateSecret;
    }

    public static int zzb(EllipticCurve ellipticCurve) {
        return (zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static ECParameterSpec zzb(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
