package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzcx {
    private static Cipher zzaic;
    private static final Object zzaid = new Object();
    private static final Object zzaie = new Object();
    private final SecureRandom zzaib = null;

    public zzcx(SecureRandom secureRandom) {
    }

    private static Cipher getCipher() {
        Cipher cipher;
        synchronized (zzaie) {
            if (zzaic == null) {
                zzaic = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = zzaic;
        }
        return cipher;
    }

    public final byte[] zzb(byte[] bArr, String str) {
        if (bArr.length == 16) {
            try {
                byte[] zza = zzbv.zza(str, false);
                if (zza.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(zza.length);
                    allocate.put(zza);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    zza = new byte[(zza.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(zza);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (zzaid) {
                        getCipher().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        zza = getCipher().doFinal(zza);
                    }
                    return zza;
                }
                throw new zzcy(this);
            } catch (NoSuchAlgorithmException e) {
                throw new zzcy(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzcy(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzcy(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzcy(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzcy(this, e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new zzcy(this, e6);
            } catch (IllegalArgumentException e7) {
                throw new zzcy(this, e7);
            }
        }
        throw new zzcy(this);
    }

    public final String zzc(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 16) {
            try {
                byte[] iv;
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (zzaid) {
                    getCipher().init(1, secretKeySpec, null);
                    bArr2 = getCipher().doFinal(bArr2);
                    iv = getCipher().getIV();
                }
                int length = bArr2.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(bArr2);
                allocate.flip();
                bArr = new byte[length];
                allocate.get(bArr);
                return zzbv.zza(bArr, false);
            } catch (NoSuchAlgorithmException e) {
                throw new zzcy(this, e);
            } catch (InvalidKeyException e2) {
                throw new zzcy(this, e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzcy(this, e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzcy(this, e4);
            } catch (BadPaddingException e5) {
                throw new zzcy(this, e5);
            }
        }
        throw new zzcy(this);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0030 in {6, 7, 9, 12} preds:[]
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
    public final byte[] zzl(java.lang.String r4) {
        /*
        r3 = this;
        r0 = 0;
        r4 = com.google.android.gms.internal.zzbv.zza(r4, r0);	 Catch:{ IllegalArgumentException -> 0x0029 }
        r1 = r4.length;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r2 = 32;	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r1 != r2) goto L_0x0023;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r1 = 4;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r2 = 16;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4 = java.nio.ByteBuffer.wrap(r4, r1, r2);	 Catch:{ IllegalArgumentException -> 0x0029 }
        r1 = new byte[r2];	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4.get(r1);	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 >= r2) goto L_0x0022;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4 = r1[r0];	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4 = r4 ^ 68;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4 = (byte) r4;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r1[r0] = r4;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r0 = r0 + 1;	 Catch:{ IllegalArgumentException -> 0x0029 }
        goto L_0x0016;	 Catch:{ IllegalArgumentException -> 0x0029 }
        return r1;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4 = new com.google.android.gms.internal.zzcy;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0029 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0029 }
        r4 = move-exception;
        r0 = new com.google.android.gms.internal.zzcy;
        r0.<init>(r3, r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcx.zzl(java.lang.String):byte[]");
    }
}
