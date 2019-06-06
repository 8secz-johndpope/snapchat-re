package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class zzbx {
    private static boolean zzyw;
    private static MessageDigest zzyx;
    private static final Object zzyy = new Object();
    private static final Object zzyz = new Object();
    static CountDownLatch zzza = new CountDownLatch(1);

    static String zza(zzba zzba, String str) {
        byte[] zzc = zzfls.zzc(zzba);
        if (((Boolean) zzlc.zzio().zzd(zzoi.zzbrr)).booleanValue()) {
            zzc = zza(zzc, str);
        } else if (zzdq.zzajk != null) {
            zzc = zzdq.zzajk.zzd(zzc, str != null ? str.getBytes() : new byte[0]);
            zzbg zzbg = new zzbg();
            zzbg.zzgp = new byte[][]{zzc};
            zzbg.zzgr = Integer.valueOf(2);
            zzc = zzfls.zzc(zzbg);
        } else {
            throw new GeneralSecurityException();
        }
        return zzbv.zza(zzc, true);
    }

    private static Vector<byte[]> zza(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector vector = new Vector();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] zza(byte[] bArr, String str) {
        Vector zza = zza(bArr, 255);
        if (zza == null || zza.size() == 0) {
            return zza(zzfls.zzc(zzc(4096)), str, true);
        }
        zzbg zzbg = new zzbg();
        zzbg.zzgp = new byte[zza.size()][];
        Iterator it = zza.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            zzbg.zzgp[i] = zza((byte[]) it.next(), str, false);
            i = i2;
        }
        zzbg.zzgk = zzb(bArr);
        return zzfls.zzc(zzbg);
    }

    private static byte[] zza(byte[] bArr, String str, boolean z) {
        ByteBuffer put;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = zzfls.zzc(zzc(4096));
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        bArr = put.array();
        if (z) {
            bArr = ByteBuffer.allocate(256).put(zzb(bArr)).put(bArr).array();
        }
        byte[] bArr3 = new byte[256];
        new zzca().zza(bArr, bArr3);
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzffa(str.getBytes("UTF-8")).zzay(bArr3);
        }
        return bArr3;
    }

    private static MessageDigest zzaa() {
        boolean await;
        zzz();
        try {
            await = zzza.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            await = false;
        }
        if (!await) {
            return null;
        }
        MessageDigest messageDigest = zzyx;
        return messageDigest == null ? null : messageDigest;
    }

    public static byte[] zzb(byte[] bArr) {
        synchronized (zzyy) {
            MessageDigest zzaa = zzaa();
            if (zzaa != null) {
                zzaa.reset();
                zzaa.update(bArr);
                bArr = zzyx.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return bArr;
    }

    private static zzba zzc(long j) {
        zzba zzba = new zzba();
        zzba.zzds = Long.valueOf(4096);
        return zzba;
    }

    static void zzz() {
        synchronized (zzyz) {
            if (!zzyw) {
                zzyw = true;
                new Thread(new zzbz()).start();
            }
        }
    }
}
