package defpackage;

import android.graphics.Bitmap.CompressFormat;
import defpackage.vml.a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: vmh */
public final class vmh implements vmg {
    final vmk a;
    final jwb b;
    private final ajxe c = ajxh.a(new c(this));
    private final ajxe d = ajxh.a(new b(this));
    private final a e;
    private final ajwy<vlu> f;

    /* renamed from: vmh$a */
    public static final class a {
    }

    /* renamed from: vmh$c */
    static final class c extends akcs implements akbk<Boolean> {
        private /* synthetic */ vmh a;

        c(vmh vmh) {
            this.a = vmh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(this.a.a());
        }
    }

    /* renamed from: vmh$b */
    static final class b extends akcs implements akbk<jwa> {
        private /* synthetic */ vmh a;

        b(vmh vmh) {
            this.a = vmh;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.b.a(this.a.a);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(vmh.class), "isNativeLibraryLoaded", "isNativeLibraryLoaded()Z"), new akdc(akde.a(vmh.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;")};
    }

    public vmh(a aVar, vmk vmk, jwb jwb, ajwy<vlu> ajwy) {
        akcr.b(aVar, "nativeImageTranscoder");
        akcr.b(vmk, "imageTranscodingFeature");
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(ajwy, "imageTranscodingMetricProvider");
        this.e = aVar;
        this.a = vmk;
        this.b = jwb;
        this.f = ajwy;
    }

    private static a a(kaz<jwj> kaz, CompressFormat compressFormat, abyf abyf, OutputStream outputStream) {
        CompressFormat compressFormat2 = compressFormat;
        abyf abyf2 = abyf;
        akcr.b(kaz, "bitmap");
        akcr.b(compressFormat2, "compressFormat");
        akcr.b(abyf2, "transcodingOptions");
        if (abyf2.d <= 0 || abyf2.d > 100) {
            return new a(false, null, 0, 0, "Android encoding error. Invalid jpeg encoding quality.", false, 14);
        }
        OutputStream byteArrayOutputStream = outputStream == null ? new ByteArrayOutputStream(8192) : outputStream;
        boolean compress = jwz.a(kaz).compress(compressFormat2, abyf2.d, byteArrayOutputStream);
        ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) (!(byteArrayOutputStream instanceof ByteArrayOutputStream) ? null : byteArrayOutputStream);
        byte[] toByteArray = byteArrayOutputStream2 != null ? byteArrayOutputStream2.toByteArray() : null;
        if (outputStream == null) {
            byteArrayOutputStream.close();
        }
        return new a(compress, toByteArray, jwz.a(kaz).getWidth(), jwz.a(kaz).getHeight(), null, false, 16);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0219  */
    public final defpackage.vml.a a(defpackage.vmj r33, defpackage.kaz<defpackage.jwj> r34, defpackage.abyg r35, defpackage.abyf r36, java.io.OutputStream r37) {
        /*
        r32 = this;
        r0 = r32;
        r1 = r33;
        r2 = r34;
        r3 = r35;
        r4 = r36;
        r5 = r37;
        r6 = "transcodingContext";
        defpackage.akcr.b(r1, r6);
        r7 = "bitmap";
        defpackage.akcr.b(r2, r7);
        r8 = "transcodingType";
        defpackage.akcr.b(r3, r8);
        r8 = "transcodingOptions";
        defpackage.akcr.b(r4, r8);
        r9 = r0.f;
        r9 = r9.get();
        r9 = (defpackage.vlu) r9;
        r10 = defpackage.jwz.a(r34);
        r12 = r10.getWidth();
        r10 = defpackage.jwz.a(r34);
        r13 = r10.getHeight();
        r10 = defpackage.jwz.a(r34);
        r14 = r10.getByteCount();
        r10 = r4.d;
        r16 = java.lang.Integer.valueOf(r10);
        r10 = r4.b;
        r17 = java.lang.Integer.valueOf(r10);
        r10 = r4.c;
        r18 = java.lang.Integer.valueOf(r10);
        defpackage.akcr.b(r1, r6);
        r6 = "type";
        defpackage.akcr.b(r3, r6);
        r6 = r9.d;
        r10 = r6.c();
        r9.a = r10;
        r9.b = r3;
        r6 = r1.a;
        r10 = r9.a();
        r11 = r6.toString();
        r10.p(r11);
        r10 = r9.a();
        r11 = defpackage.vov.a(r6);
        r10.a(r11);
        r10 = r9.a();
        r11 = defpackage.vov.c(r6);
        r10.a(r11);
        r10 = r9.a();
        r6 = defpackage.vov.b(r6);
        r10.a(r6);
        r6 = r9.a();
        r10 = r1.b;
        r6.n(r10);
        r6 = r9.a();
        r1 = r1.c;
        r6.o(r1);
        r1 = r9.a();
        r15 = r9.b;
        r6 = "imageTranscodingType";
        if (r15 != 0) goto L_0x00b1;
    L_0x00ae:
        defpackage.akcr.a(r6);
    L_0x00b1:
        r11 = 1;
        r10 = r9;
        r10 = r10.a(r11, r12, r13, r14, r15);
        r1.r(r10);
        r1 = r9.a();
        r10 = 0;
        if (r16 == 0) goto L_0x00cb;
    L_0x00c1:
        r11 = r16.intValue();
        r11 = (long) r11;
        r11 = java.lang.Long.valueOf(r11);
        goto L_0x00cc;
    L_0x00cb:
        r11 = r10;
    L_0x00cc:
        r1.a(r11);
        r1 = r9.a();
        if (r17 == 0) goto L_0x00df;
    L_0x00d5:
        r11 = r17.intValue();
        r11 = (long) r11;
        r11 = java.lang.Long.valueOf(r11);
        goto L_0x00e0;
    L_0x00df:
        r11 = r10;
    L_0x00e0:
        r1.b(r11);
        r1 = r9.a();
        if (r18 == 0) goto L_0x00f3;
    L_0x00e9:
        r11 = r18.intValue();
        r11 = (long) r11;
        r11 = java.lang.Long.valueOf(r11);
        goto L_0x00f4;
    L_0x00f3:
        r11 = r10;
    L_0x00f4:
        r1.c(r11);
        r1 = defpackage.vmi.a;
        r3 = r35.ordinal();
        r1 = r1[r3];
        r3 = 2;
        r11 = 1;
        if (r1 == r11) goto L_0x014e;
    L_0x0103:
        if (r1 == r3) goto L_0x0146;
    L_0x0105:
        r3 = 3;
        if (r1 != r3) goto L_0x010b;
    L_0x0108:
        r1 = android.graphics.Bitmap.CompressFormat.WEBP;
        goto L_0x0148;
    L_0x010b:
        r1 = "Illegal argument ImageTranscodingType";
        r2 = "errorMessage";
        defpackage.akcr.b(r1, r2);
        r2 = r9.d;
        r2 = r2.c();
        r4 = r9.a();
        r5 = r9.a;
        r2 = r2 - r5;
        r2 = java.lang.Long.valueOf(r2);
        r4.d(r2);
        r2 = r9.a();
        r2.t(r1);
        r2 = r9.c;
        r2 = r2.get();
        r2 = (defpackage.dib) r2;
        r3 = r9.a();
        r3 = (defpackage.aajt) r3;
        r2.a(r3);
        r2 = new java.lang.IllegalArgumentException;
        r2.<init>(r1);
        r2 = (java.lang.Throwable) r2;
        throw r2;
    L_0x0146:
        r1 = android.graphics.Bitmap.CompressFormat.PNG;
    L_0x0148:
        r1 = defpackage.vmh.a(r2, r1, r4, r5);
        goto L_0x01e8;
    L_0x014e:
        r1 = defpackage.jwz.a(r34);
        r1 = r1.getConfig();
        r12 = android.graphics.Bitmap.Config.ARGB_8888;
        if (r1 != r12) goto L_0x01dc;
    L_0x015a:
        r1 = r0.c;
        r1 = r1.b();
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x01dc;
    L_0x0168:
        defpackage.akcr.b(r2, r7);
        defpackage.akcr.b(r4, r8);
        r1 = new int[r3];
        r1 = {0, 0};
        r12 = defpackage.jwz.a(r34);
        defpackage.akcr.b(r12, r7);
        r3 = "outResolution";
        defpackage.akcr.b(r1, r3);
        defpackage.akcr.b(r4, r8);
        r14 = r4.d;
        r15 = r4.a;
        r3 = r4.b;
        r7 = r4.c;
        r13 = r1;
        r16 = r3;
        r17 = r7;
        r3 = com.snap.camera.jni.SnapImageTranscoder.nativeEncodeBitmapToJpeg(r12, r13, r14, r15, r16, r17);
        r7 = "SnapImageTranscoder.nati…dingOptions.targetHeight)";
        defpackage.akcr.a(r3, r7);
        r7 = r3.length;
        r8 = 0;
        if (r7 != 0) goto L_0x019e;
    L_0x019c:
        r7 = 1;
        goto L_0x019f;
    L_0x019e:
        r7 = 0;
    L_0x019f:
        r7 = r7 ^ r11;
        if (r7 == 0) goto L_0x01c6;
    L_0x01a2:
        r7 = r1[r8];
        if (r7 <= 0) goto L_0x01c6;
    L_0x01a6:
        r7 = r1[r11];
        if (r7 <= 0) goto L_0x01c6;
    L_0x01aa:
        if (r5 == 0) goto L_0x01af;
    L_0x01ac:
        r5.write(r3);
    L_0x01af:
        r7 = new vml$a;
        r17 = 1;
        r19 = r1[r8];
        r20 = r1[r11];
        r21 = 0;
        r22 = 1;
        r23 = 16;
        r16 = r7;
        r18 = r3;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23);
        r1 = r7;
        goto L_0x01dd;
    L_0x01c6:
        r1 = new vml$a;
        r25 = 0;
        r26 = 0;
        r27 = 0;
        r28 = 0;
        r30 = 0;
        r31 = 14;
        r29 = "Libjpeg encoding error.";
        r24 = r1;
        r24.<init>(r25, r26, r27, r28, r29, r30, r31);
        goto L_0x01dd;
    L_0x01dc:
        r1 = r10;
    L_0x01dd:
        if (r1 == 0) goto L_0x01e4;
    L_0x01df:
        r3 = r1.a;
        if (r3 == 0) goto L_0x01e4;
    L_0x01e3:
        goto L_0x01e8;
    L_0x01e4:
        r1 = android.graphics.Bitmap.CompressFormat.JPEG;
        goto L_0x0148;
    L_0x01e8:
        r2 = r1;
        r2 = (defpackage.vml) r2;
        r3 = "imageTranscodingResult";
        defpackage.akcr.b(r2, r3);
        r3 = r9.d;
        r3 = r3.c();
        r5 = r9.a();
        r7 = r9.a;
        r3 = r3 - r7;
        r3 = java.lang.Long.valueOf(r3);
        r5.d(r3);
        r3 = r9.a();
        r11 = 0;
        r12 = r2.b();
        r13 = r2.c();
        r14 = r2.d();
        r15 = r9.b;
        if (r15 != 0) goto L_0x021c;
    L_0x0219:
        defpackage.akcr.a(r6);
    L_0x021c:
        r10 = r9;
        r4 = r10.a(r11, r12, r13, r14, r15);
        r3.s(r4);
        r3 = r9.a();
        r2 = r2.a();
        r3.t(r2);
        r2 = r9.c;
        r2 = r2.get();
        r2 = (defpackage.dib) r2;
        r3 = r9.a();
        r3 = (defpackage.aajt) r3;
        r2.a(r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vmh.a(vmj, kaz, abyg, abyf, java.io.OutputStream):vml$a");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a() {
        boolean z;
        abmr.b();
        z = false;
        try {
            System.loadLibrary("libjpeg");
            System.loadLibrary("image-processing-engine");
            z = true;
        } catch (SecurityException | UnsatisfiedLinkError unused) {
        }
        return z;
    }
}
