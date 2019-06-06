package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: adq */
public final class adq {
    public static final ze<yy> a = ze.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", yy.DEFAULT);
    public static final ze<Boolean> b = ze.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);
    static final a c = new 1();
    private static ze<Boolean> d = ze.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
    private static final Set<String> e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
    private static final Set<ImageType> f = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));
    private static final Queue<Options> g = ahm.a(0);
    private final abg h;
    private final DisplayMetrics i;
    private final abd j;
    private final List<ImageHeaderParser> k;
    private final adu l = adu.a();

    /* renamed from: adq$a */
    public interface a {
        void a();

        void a(abg abg, Bitmap bitmap);
    }

    /* renamed from: adq$1 */
    class 1 implements a {
        1() {
        }

        public final void a() {
        }

        public final void a(abg abg, Bitmap bitmap) {
        }
    }

    public adq(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, abg abg, abd abd) {
        this.k = list;
        String str = "Argument must not be null";
        this.i = (DisplayMetrics) ahl.a((Object) displayMetrics, str);
        this.h = (abg) ahl.a((Object) abg, str);
        this.j = (abd) ahl.a((Object) abd, str);
    }

    private static int a(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    private static synchronized Options a() {
        Options options;
        synchronized (adq.class) {
            synchronized (g) {
                options = (Options) g.poll();
            }
            if (options == null) {
                options = new Options();
                adq.c(options);
            }
        }
        return options;
    }

    @TargetApi(19)
    private static String a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String stringBuilder;
        if (VERSION.SDK_INT >= 19) {
            StringBuilder stringBuilder2 = new StringBuilder(" (");
            stringBuilder2.append(bitmap.getAllocationByteCount());
            stringBuilder2.append(")");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        StringBuilder stringBuilder3 = new StringBuilder("[");
        stringBuilder3.append(bitmap.getWidth());
        stringBuilder3.append("x");
        stringBuilder3.append(bitmap.getHeight());
        stringBuilder3.append("] ");
        stringBuilder3.append(bitmap.getConfig());
        stringBuilder3.append(stringBuilder);
        return stringBuilder3.toString();
    }

    private static boolean a(Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static int[] a(InputStream inputStream, Options options, a aVar, abg abg) {
        options.inJustDecodeBounds = true;
        adq.b(inputStream, options, aVar, abg);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0084 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:18|19|21|22) */
    private static android.graphics.Bitmap b(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, defpackage.adq.a r11, defpackage.abg r12) {
        /*
        r0 = "Downsampler";
        r1 = r10.inJustDecodeBounds;
        if (r1 == 0) goto L_0x000c;
    L_0x0006:
        r1 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r9.mark(r1);
        goto L_0x000f;
    L_0x000c:
        r11.a();
    L_0x000f:
        r1 = r10.outWidth;
        r2 = r10.outHeight;
        r3 = r10.outMimeType;
        r4 = defpackage.adz.b;
        r4.lock();
        r4 = 0;
        r11 = android.graphics.BitmapFactory.decodeStream(r9, r4, r10);	 Catch:{ IllegalArgumentException -> 0x002e }
        r12 = defpackage.adz.b;
        r12.unlock();
        r10 = r10.inJustDecodeBounds;
        if (r10 == 0) goto L_0x002b;
    L_0x0028:
        r9.reset();
    L_0x002b:
        return r11;
    L_0x002c:
        r9 = move-exception;
        goto L_0x0086;
    L_0x002e:
        r5 = move-exception;
        r6 = new java.io.IOException;	 Catch:{ all -> 0x002c }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002c }
        r8 = "Exception decoding bitmap, outWidth: ";
        r7.<init>(r8);	 Catch:{ all -> 0x002c }
        r7.append(r1);	 Catch:{ all -> 0x002c }
        r1 = ", outHeight: ";
        r7.append(r1);	 Catch:{ all -> 0x002c }
        r7.append(r2);	 Catch:{ all -> 0x002c }
        r1 = ", outMimeType: ";
        r7.append(r1);	 Catch:{ all -> 0x002c }
        r7.append(r3);	 Catch:{ all -> 0x002c }
        r1 = ", inBitmap: ";
        r7.append(r1);	 Catch:{ all -> 0x002c }
        r1 = r10.inBitmap;	 Catch:{ all -> 0x002c }
        r1 = defpackage.adq.a(r1);	 Catch:{ all -> 0x002c }
        r7.append(r1);	 Catch:{ all -> 0x002c }
        r1 = r7.toString();	 Catch:{ all -> 0x002c }
        r6.<init>(r1, r5);	 Catch:{ all -> 0x002c }
        r1 = 3;
        r1 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x006c;
    L_0x0067:
        r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use";
        android.util.Log.d(r0, r1, r6);	 Catch:{ all -> 0x002c }
    L_0x006c:
        r0 = r10.inBitmap;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0085;
    L_0x0070:
        r9.reset();	 Catch:{ IOException -> 0x0084 }
        r0 = r10.inBitmap;	 Catch:{ IOException -> 0x0084 }
        r12.a(r0);	 Catch:{ IOException -> 0x0084 }
        r10.inBitmap = r4;	 Catch:{ IOException -> 0x0084 }
        r9 = defpackage.adq.b(r9, r10, r11, r12);	 Catch:{ IOException -> 0x0084 }
        r10 = defpackage.adz.b;
        r10.unlock();
        return r9;
    L_0x0084:
        throw r6;	 Catch:{ all -> 0x002c }
    L_0x0085:
        throw r6;	 Catch:{ all -> 0x002c }
    L_0x0086:
        r10 = defpackage.adz.b;
        r10.unlock();
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adq.b(java.io.InputStream, android.graphics.BitmapFactory$Options, adq$a, abg):android.graphics.Bitmap");
    }

    private static void b(Options options) {
        adq.c(options);
        synchronized (g) {
            g.offer(options);
        }
    }

    private static void c(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:251:0x05bc in {4, 5, 12, 13, 17, 18, 19, 20, 23, 24, 27, 28, 33, 38, 41, 43, 52, 53, 58, 63, 68, 69, 74, 79, 84, 85, 86, 89, 90, 91, 92, 93, 99, 100, 103, 104, 107, 108, 109, 111, 113, 117, 118, 119, 126, 133, 134, 136, 137, 138, 145, 151, 153, 155, 160, 161, 163, 164, 167, 168, 169, 172, 175, 178, 179, 185, 188, 189, 192, 199, 200, 202, 203, 206, 210, 213, 214, 215, 216, 217, 218, 219, 220, 221, 224, 225, 230, 233, 236, 239, 241, 243, 245, 246, 248, 250} preds:[]
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
    public final defpackage.aax<android.graphics.Bitmap> a(java.io.InputStream r32, int r33, int r34, defpackage.zf r35, defpackage.adq.a r36) {
        /*
        r31 = this;
        r1 = r31;
        r2 = r32;
        r3 = r33;
        r4 = r34;
        r0 = r35;
        r5 = r36;
        r6 = r32.markSupported();
        r7 = "You must provide an InputStream that supports mark()";
        defpackage.ahl.a(r6, r7);
        r6 = r1.j;
        r7 = byte[].class;
        r8 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r6 = r6.a(r8, r7);
        r6 = (byte[]) r6;
        r7 = defpackage.adq.a();
        r7.inTempStorage = r6;
        r8 = a;
        r8 = r0.a(r8);
        r8 = (defpackage.yy) r8;
        r9 = defpackage.adp.f;
        r9 = r0.a(r9);
        r9 = (defpackage.adp) r9;
        r10 = d;
        r10 = r0.a(r10);
        r10 = (java.lang.Boolean) r10;
        r10 = r10.booleanValue();
        r11 = b;
        r11 = r0.a(r11);
        r12 = 0;
        r13 = 1;
        if (r11 == 0) goto L_0x005d;
        r11 = b;
        r0 = r0.a(r11);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x005d;
        r0 = 1;
        goto L_0x005e;
        r0 = 0;
        r14 = defpackage.ahh.a();	 Catch:{ all -> 0x05b1 }
        r11 = r1.h;	 Catch:{ all -> 0x05b1 }
        r11 = defpackage.adq.a(r2, r7, r5, r11);	 Catch:{ all -> 0x05b1 }
        r16 = r6;
        r6 = r11[r12];	 Catch:{ all -> 0x05ac }
        r11 = r11[r13];	 Catch:{ all -> 0x05ac }
        r12 = r7.outMimeType;	 Catch:{ all -> 0x05ac }
        r13 = -1;	 Catch:{ all -> 0x05ac }
        if (r6 == r13) goto L_0x0075;	 Catch:{ all -> 0x05ac }
        if (r11 != r13) goto L_0x0076;	 Catch:{ all -> 0x05ac }
        r0 = 0;	 Catch:{ all -> 0x05ac }
        r13 = r1.k;	 Catch:{ all -> 0x05ac }
        r17 = r14;	 Catch:{ all -> 0x05ac }
        r14 = r1.j;	 Catch:{ all -> 0x05ac }
        r13 = defpackage.zc.b(r13, r2, r14);	 Catch:{ all -> 0x05ac }
        switch(r13) {
            case 3: goto L_0x008a;
            case 4: goto L_0x008a;
            case 5: goto L_0x0087;
            case 6: goto L_0x0087;
            case 7: goto L_0x0084;
            case 8: goto L_0x0084;
            default: goto L_0x0083;
        };	 Catch:{ all -> 0x05ac }
        goto L_0x008f;	 Catch:{ all -> 0x05ac }
        r14 = 270; // 0x10e float:3.78E-43 double:1.334E-321;	 Catch:{ all -> 0x05ac }
        goto L_0x0090;	 Catch:{ all -> 0x05ac }
        r14 = 90;	 Catch:{ all -> 0x05ac }
        goto L_0x0090;	 Catch:{ all -> 0x05ac }
        r19 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;	 Catch:{ all -> 0x05ac }
        r14 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;	 Catch:{ all -> 0x05ac }
        goto L_0x0090;	 Catch:{ all -> 0x05ac }
        r14 = 0;	 Catch:{ all -> 0x05ac }
        r19 = defpackage.adz.a(r13);	 Catch:{ all -> 0x05ac }
        r15 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ all -> 0x05ac }
        if (r3 != r15) goto L_0x009a;	 Catch:{ all -> 0x05ac }
        r15 = r6;	 Catch:{ all -> 0x05ac }
        goto L_0x009b;	 Catch:{ all -> 0x05ac }
        r15 = r3;	 Catch:{ all -> 0x05ac }
        r21 = r13;	 Catch:{ all -> 0x05ac }
        r13 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ all -> 0x05ac }
        if (r4 != r13) goto L_0x00a3;	 Catch:{ all -> 0x05ac }
        r13 = r11;	 Catch:{ all -> 0x05ac }
        goto L_0x00a4;	 Catch:{ all -> 0x05ac }
        r13 = r4;	 Catch:{ all -> 0x05ac }
        r4 = r1.k;	 Catch:{ all -> 0x05ac }
        r3 = r1.j;	 Catch:{ all -> 0x05ac }
        r3 = defpackage.zc.a(r4, r2, r3);	 Catch:{ all -> 0x05ac }
        r4 = r1.h;	 Catch:{ all -> 0x05ac }
        r22 = r12;
        r12 = ", density: ";
        r23 = r10;
        r10 = "x";
        r24 = r8;
        r8 = "Downsampler";
        if (r6 <= 0) goto L_0x02c1;
        if (r11 > 0) goto L_0x00c0;
        goto L_0x02c1;
        r20 = r0;
        r0 = 90;
        if (r14 == r0) goto L_0x00d0;
        r0 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        if (r14 != r0) goto L_0x00cb;
        goto L_0x00d0;
        r0 = r9.a(r6, r11, r15, r13);	 Catch:{ all -> 0x05ac }
        goto L_0x00d4;
        r0 = r9.a(r11, r6, r15, r13);	 Catch:{ all -> 0x05a8 }
        r14 = 0;	 Catch:{ all -> 0x05a8 }
        r25 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1));	 Catch:{ all -> 0x05a8 }
        if (r25 <= 0) goto L_0x0283;	 Catch:{ all -> 0x05a8 }
        r14 = r9.a();	 Catch:{ all -> 0x05a8 }
        if (r14 == 0) goto L_0x027b;
        r1 = (float) r6;
        r35 = r12;
        r12 = r0 * r1;
        r26 = r8;
        r25 = r9;
        r8 = (double) r12;
        r27 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        java.lang.Double.isNaN(r8);
        r8 = r8 + r27;
        r8 = (int) r8;
        r9 = (float) r11;
        r12 = r0 * r9;
        r29 = r13;
        r12 = (double) r12;
        java.lang.Double.isNaN(r12);
        r12 = r12 + r27;
        r12 = (int) r12;
        r8 = r6 / r8;	 Catch:{ all -> 0x05a8 }
        r12 = r11 / r12;	 Catch:{ all -> 0x05a8 }
        r13 = 1;	 Catch:{ all -> 0x05a8 }
        if (r14 != r13) goto L_0x0109;	 Catch:{ all -> 0x05a8 }
        r8 = java.lang.Math.max(r8, r12);	 Catch:{ all -> 0x05a8 }
        goto L_0x010d;	 Catch:{ all -> 0x05a8 }
        r8 = java.lang.Math.min(r8, r12);	 Catch:{ all -> 0x05a8 }
        r12 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x05a8 }
        r13 = 23;	 Catch:{ all -> 0x05a8 }
        if (r12 > r13) goto L_0x011f;	 Catch:{ all -> 0x05a8 }
        r12 = e;	 Catch:{ all -> 0x05a8 }
        r13 = r7.outMimeType;	 Catch:{ all -> 0x05a8 }
        r12 = r12.contains(r13);	 Catch:{ all -> 0x05a8 }
        if (r12 == 0) goto L_0x011f;	 Catch:{ all -> 0x05a8 }
        r13 = 1;	 Catch:{ all -> 0x05a8 }
        goto L_0x0135;	 Catch:{ all -> 0x05a8 }
        r8 = java.lang.Integer.highestOneBit(r8);	 Catch:{ all -> 0x05a8 }
        r12 = 1;	 Catch:{ all -> 0x05a8 }
        r13 = java.lang.Math.max(r12, r8);	 Catch:{ all -> 0x05a8 }
        if (r14 != r12) goto L_0x0135;	 Catch:{ all -> 0x05a8 }
        r8 = (float) r13;	 Catch:{ all -> 0x05a8 }
        r12 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x05a8 }
        r14 = r12 / r0;	 Catch:{ all -> 0x05a8 }
        r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1));	 Catch:{ all -> 0x05a8 }
        if (r8 >= 0) goto L_0x0135;	 Catch:{ all -> 0x05a8 }
        r13 = r13 << 1;	 Catch:{ all -> 0x05a8 }
        r7.inSampleSize = r13;	 Catch:{ all -> 0x05a8 }
        r8 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG;	 Catch:{ all -> 0x05a8 }
        if (r3 != r8) goto L_0x0162;	 Catch:{ all -> 0x05a8 }
        r4 = 8;	 Catch:{ all -> 0x05a8 }
        r4 = java.lang.Math.min(r13, r4);	 Catch:{ all -> 0x05a8 }
        r4 = (float) r4;	 Catch:{ all -> 0x05a8 }
        r1 = r1 / r4;	 Catch:{ all -> 0x05a8 }
        r8 = r0;	 Catch:{ all -> 0x05a8 }
        r0 = (double) r1;	 Catch:{ all -> 0x05a8 }
        r0 = java.lang.Math.ceil(r0);	 Catch:{ all -> 0x05a8 }
        r0 = (int) r0;	 Catch:{ all -> 0x05a8 }
        r9 = r9 / r4;	 Catch:{ all -> 0x05a8 }
        r12 = r8;	 Catch:{ all -> 0x05a8 }
        r8 = (double) r9;	 Catch:{ all -> 0x05a8 }
        r8 = java.lang.Math.ceil(r8);	 Catch:{ all -> 0x05a8 }
        r1 = (int) r8;	 Catch:{ all -> 0x05a8 }
        r4 = r13 / 8;	 Catch:{ all -> 0x05a8 }
        if (r4 <= 0) goto L_0x0158;	 Catch:{ all -> 0x05a8 }
        r0 = r0 / r4;	 Catch:{ all -> 0x05a8 }
        r1 = r1 / r4;	 Catch:{ all -> 0x05a8 }
        r9 = r25;	 Catch:{ all -> 0x05a8 }
        r4 = r29;	 Catch:{ all -> 0x05a8 }
        r30 = r1;	 Catch:{ all -> 0x05a8 }
        r1 = r0;	 Catch:{ all -> 0x05a8 }
        r0 = r30;	 Catch:{ all -> 0x05a8 }
        goto L_0x01bc;	 Catch:{ all -> 0x05a8 }
        r12 = r0;	 Catch:{ all -> 0x05a8 }
        r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;	 Catch:{ all -> 0x05a8 }
        if (r3 == r0) goto L_0x01a9;	 Catch:{ all -> 0x05a8 }
        r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A;	 Catch:{ all -> 0x05a8 }
        if (r3 != r0) goto L_0x016c;	 Catch:{ all -> 0x05a8 }
        goto L_0x01a9;	 Catch:{ all -> 0x05a8 }
        r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP;	 Catch:{ all -> 0x05a8 }
        if (r3 == r0) goto L_0x018f;	 Catch:{ all -> 0x05a8 }
        r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A;	 Catch:{ all -> 0x05a8 }
        if (r3 != r0) goto L_0x0175;	 Catch:{ all -> 0x05a8 }
        goto L_0x018f;	 Catch:{ all -> 0x05a8 }
        r0 = r6 % r13;	 Catch:{ all -> 0x05a8 }
        if (r0 != 0) goto L_0x0183;	 Catch:{ all -> 0x05a8 }
        r0 = r11 % r13;	 Catch:{ all -> 0x05a8 }
        if (r0 == 0) goto L_0x017e;	 Catch:{ all -> 0x05a8 }
        goto L_0x0183;	 Catch:{ all -> 0x05a8 }
        r0 = r6 / r13;	 Catch:{ all -> 0x05a8 }
        r1 = r11 / r13;	 Catch:{ all -> 0x05a8 }
        goto L_0x0158;	 Catch:{ all -> 0x05a8 }
        r0 = defpackage.adq.a(r2, r7, r5, r4);	 Catch:{ all -> 0x05a8 }
        r1 = 0;	 Catch:{ all -> 0x05a8 }
        r4 = r0[r1];	 Catch:{ all -> 0x05a8 }
        r1 = 1;	 Catch:{ all -> 0x05a8 }
        r0 = r0[r1];	 Catch:{ all -> 0x05a8 }
        r1 = r4;	 Catch:{ all -> 0x05a8 }
        goto L_0x01b8;	 Catch:{ all -> 0x05a8 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x05a8 }
        r4 = 24;	 Catch:{ all -> 0x05a8 }
        if (r0 < r4) goto L_0x01a1;	 Catch:{ all -> 0x05a8 }
        r0 = (float) r13;	 Catch:{ all -> 0x05a8 }
        r1 = r1 / r0;	 Catch:{ all -> 0x05a8 }
        r1 = java.lang.Math.round(r1);	 Catch:{ all -> 0x05a8 }
        r9 = r9 / r0;	 Catch:{ all -> 0x05a8 }
        r0 = java.lang.Math.round(r9);	 Catch:{ all -> 0x05a8 }
        goto L_0x01b8;	 Catch:{ all -> 0x05a8 }
        r0 = (float) r13;	 Catch:{ all -> 0x05a8 }
        r1 = r1 / r0;	 Catch:{ all -> 0x05a8 }
        r4 = (double) r1;	 Catch:{ all -> 0x05a8 }
        r4 = java.lang.Math.floor(r4);	 Catch:{ all -> 0x05a8 }
        goto L_0x01b0;	 Catch:{ all -> 0x05a8 }
        r0 = (float) r13;	 Catch:{ all -> 0x05a8 }
        r1 = r1 / r0;	 Catch:{ all -> 0x05a8 }
        r4 = (double) r1;	 Catch:{ all -> 0x05a8 }
        r4 = java.lang.Math.floor(r4);	 Catch:{ all -> 0x05a8 }
        r1 = (int) r4;	 Catch:{ all -> 0x05a8 }
        r9 = r9 / r0;	 Catch:{ all -> 0x05a8 }
        r4 = (double) r9;	 Catch:{ all -> 0x05a8 }
        r4 = java.lang.Math.floor(r4);	 Catch:{ all -> 0x05a8 }
        r0 = (int) r4;	 Catch:{ all -> 0x05a8 }
        r9 = r25;	 Catch:{ all -> 0x05a8 }
        r4 = r29;	 Catch:{ all -> 0x05a8 }
        r5 = r9.a(r1, r0, r15, r4);	 Catch:{ all -> 0x05a8 }
        r8 = (double) r5;	 Catch:{ all -> 0x05a8 }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x05a8 }
        r14 = 19;	 Catch:{ all -> 0x05a8 }
        if (r5 < r14) goto L_0x01f7;	 Catch:{ all -> 0x05a8 }
        r5 = defpackage.adq.a(r8);	 Catch:{ all -> 0x05a8 }
        r14 = r3;
        r2 = (double) r5;
        java.lang.Double.isNaN(r2);
        java.lang.Double.isNaN(r8);
        r2 = r2 * r8;
        r2 = r2 + r27;
        r2 = (int) r2;
        r3 = (float) r2;
        r5 = (float) r5;
        r3 = r3 / r5;
        r25 = r12;
        r5 = r13;
        r12 = (double) r3;
        java.lang.Double.isNaN(r8);
        java.lang.Double.isNaN(r12);
        r12 = r8 / r12;
        r2 = (double) r2;
        java.lang.Double.isNaN(r2);
        r12 = r12 * r2;
        r12 = r12 + r27;
        r2 = (int) r12;
        r7.inTargetDensity = r2;	 Catch:{ all -> 0x05a8 }
        r2 = defpackage.adq.a(r8);	 Catch:{ all -> 0x05a8 }
        r7.inDensity = r2;	 Catch:{ all -> 0x05a8 }
        goto L_0x01fb;	 Catch:{ all -> 0x05a8 }
        r14 = r3;	 Catch:{ all -> 0x05a8 }
        r25 = r12;	 Catch:{ all -> 0x05a8 }
        r5 = r13;	 Catch:{ all -> 0x05a8 }
        r2 = defpackage.adq.a(r7);	 Catch:{ all -> 0x05a8 }
        if (r2 == 0) goto L_0x0205;	 Catch:{ all -> 0x05a8 }
        r2 = 1;	 Catch:{ all -> 0x05a8 }
        r7.inScaled = r2;	 Catch:{ all -> 0x05a8 }
        goto L_0x020a;	 Catch:{ all -> 0x05a8 }
        r2 = 0;	 Catch:{ all -> 0x05a8 }
        r7.inTargetDensity = r2;	 Catch:{ all -> 0x05a8 }
        r7.inDensity = r2;	 Catch:{ all -> 0x05a8 }
        r3 = r26;	 Catch:{ all -> 0x05a8 }
        r2 = 2;	 Catch:{ all -> 0x05a8 }
        r12 = android.util.Log.isLoggable(r3, r2);	 Catch:{ all -> 0x05a8 }
        if (r12 == 0) goto L_0x0275;	 Catch:{ all -> 0x05a8 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05a8 }
        r12 = "Calculate scaling, source: [";	 Catch:{ all -> 0x05a8 }
        r2.<init>(r12);	 Catch:{ all -> 0x05a8 }
        r2.append(r6);	 Catch:{ all -> 0x05a8 }
        r2.append(r10);	 Catch:{ all -> 0x05a8 }
        r2.append(r11);	 Catch:{ all -> 0x05a8 }
        r12 = "], target: [";	 Catch:{ all -> 0x05a8 }
        r2.append(r12);	 Catch:{ all -> 0x05a8 }
        r2.append(r15);	 Catch:{ all -> 0x05a8 }
        r2.append(r10);	 Catch:{ all -> 0x05a8 }
        r2.append(r4);	 Catch:{ all -> 0x05a8 }
        r12 = "], power of two scaled: [";	 Catch:{ all -> 0x05a8 }
        r2.append(r12);	 Catch:{ all -> 0x05a8 }
        r2.append(r1);	 Catch:{ all -> 0x05a8 }
        r2.append(r10);	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r0 = "], exact scale factor: ";	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r0 = r25;	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r0 = ", power of 2 sample size: ";	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r2.append(r5);	 Catch:{ all -> 0x05a8 }
        r0 = ", adjusted scale factor: ";	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r2.append(r8);	 Catch:{ all -> 0x05a8 }
        r0 = ", target density: ";	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r0 = r7.inTargetDensity;	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r1 = r35;	 Catch:{ all -> 0x05a8 }
        r2.append(r1);	 Catch:{ all -> 0x05a8 }
        r0 = r7.inDensity;	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r0 = r2.toString();	 Catch:{ all -> 0x05a8 }
        android.util.Log.v(r3, r0);	 Catch:{ all -> 0x05a8 }
        goto L_0x0277;	 Catch:{ all -> 0x05a8 }
        r1 = r35;	 Catch:{ all -> 0x05a8 }
        r5 = r31;	 Catch:{ all -> 0x05a8 }
        r2 = r14;	 Catch:{ all -> 0x05a8 }
        goto L_0x02f7;	 Catch:{ all -> 0x05a8 }
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x05a8 }
        r1 = "Cannot round with null rounding";	 Catch:{ all -> 0x05a8 }
        r0.<init>(r1);	 Catch:{ all -> 0x05a8 }
        throw r0;	 Catch:{ all -> 0x05a8 }
        r4 = r13;	 Catch:{ all -> 0x05a8 }
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x05a8 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05a8 }
        r3 = "Cannot scale with factor: ";	 Catch:{ all -> 0x05a8 }
        r2.<init>(r3);	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r0 = " from: ";	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r2.append(r9);	 Catch:{ all -> 0x05a8 }
        r0 = ", source: [";	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r2.append(r6);	 Catch:{ all -> 0x05a8 }
        r2.append(r10);	 Catch:{ all -> 0x05a8 }
        r2.append(r11);	 Catch:{ all -> 0x05a8 }
        r0 = "], target: [";	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r2.append(r15);	 Catch:{ all -> 0x05a8 }
        r2.append(r10);	 Catch:{ all -> 0x05a8 }
        r2.append(r4);	 Catch:{ all -> 0x05a8 }
        r0 = "]";	 Catch:{ all -> 0x05a8 }
        r2.append(r0);	 Catch:{ all -> 0x05a8 }
        r0 = r2.toString();	 Catch:{ all -> 0x05a8 }
        r1.<init>(r0);	 Catch:{ all -> 0x05a8 }
        throw r1;	 Catch:{ all -> 0x05a8 }
        r20 = r0;	 Catch:{ all -> 0x05a8 }
        r14 = r3;	 Catch:{ all -> 0x05a8 }
        r3 = r8;	 Catch:{ all -> 0x05a8 }
        r1 = r12;	 Catch:{ all -> 0x05a8 }
        r4 = r13;	 Catch:{ all -> 0x05a8 }
        r0 = 3;	 Catch:{ all -> 0x05a8 }
        r0 = android.util.Log.isLoggable(r3, r0);	 Catch:{ all -> 0x05a8 }
        if (r0 == 0) goto L_0x02f4;	 Catch:{ all -> 0x05a8 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05a8 }
        r2 = "Unable to determine dimensions for: ";	 Catch:{ all -> 0x05a8 }
        r0.<init>(r2);	 Catch:{ all -> 0x05a8 }
        r2 = r14;	 Catch:{ all -> 0x05a8 }
        r0.append(r2);	 Catch:{ all -> 0x05a8 }
        r5 = " with target [";	 Catch:{ all -> 0x05a8 }
        r0.append(r5);	 Catch:{ all -> 0x05a8 }
        r0.append(r15);	 Catch:{ all -> 0x05a8 }
        r0.append(r10);	 Catch:{ all -> 0x05a8 }
        r0.append(r4);	 Catch:{ all -> 0x05a8 }
        r5 = "]";	 Catch:{ all -> 0x05a8 }
        r0.append(r5);	 Catch:{ all -> 0x05a8 }
        r0 = r0.toString();	 Catch:{ all -> 0x05a8 }
        android.util.Log.d(r3, r0);	 Catch:{ all -> 0x05a8 }
        goto L_0x02f5;
        r2 = r14;
        r5 = r31;
        r0 = r5.l;	 Catch:{ all -> 0x05a6 }
        if (r20 == 0) goto L_0x0321;	 Catch:{ all -> 0x05a6 }
        r8 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x05a6 }
        r9 = 26;	 Catch:{ all -> 0x05a6 }
        if (r8 < r9) goto L_0x0321;	 Catch:{ all -> 0x05a6 }
        if (r19 == 0) goto L_0x0304;	 Catch:{ all -> 0x05a6 }
        goto L_0x0321;	 Catch:{ all -> 0x05a6 }
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ all -> 0x05a6 }
        if (r15 < r8) goto L_0x0314;	 Catch:{ all -> 0x05a6 }
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ all -> 0x05a6 }
        if (r4 < r8) goto L_0x0314;	 Catch:{ all -> 0x05a6 }
        r0 = r0.b();	 Catch:{ all -> 0x05a6 }
        if (r0 == 0) goto L_0x0314;	 Catch:{ all -> 0x05a6 }
        r12 = 1;	 Catch:{ all -> 0x05a6 }
        goto L_0x0315;	 Catch:{ all -> 0x05a6 }
        r12 = 0;	 Catch:{ all -> 0x05a6 }
        if (r12 == 0) goto L_0x031f;	 Catch:{ all -> 0x05a6 }
        r0 = android.graphics.Bitmap.Config.HARDWARE;	 Catch:{ all -> 0x05a6 }
        r7.inPreferredConfig = r0;	 Catch:{ all -> 0x05a6 }
        r8 = 0;	 Catch:{ all -> 0x05a6 }
        r7.inMutable = r8;	 Catch:{ all -> 0x05a6 }
        goto L_0x0323;	 Catch:{ all -> 0x05a6 }
        r8 = 0;	 Catch:{ all -> 0x05a6 }
        goto L_0x0323;	 Catch:{ all -> 0x05a6 }
        r8 = 0;	 Catch:{ all -> 0x05a6 }
        r12 = 0;	 Catch:{ all -> 0x05a6 }
        if (r12 != 0) goto L_0x0375;	 Catch:{ all -> 0x05a6 }
        r0 = defpackage.yy.PREFER_ARGB_8888;	 Catch:{ all -> 0x05a6 }
        r9 = r24;	 Catch:{ all -> 0x05a6 }
        if (r9 == r0) goto L_0x036e;	 Catch:{ all -> 0x05a6 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x05a6 }
        r12 = 16;
        if (r0 != r12) goto L_0x0332;
        goto L_0x036e;
        r0 = r5.k;	 Catch:{ IOException -> 0x0343 }
        r12 = r5.j;	 Catch:{ IOException -> 0x0343 }
        r13 = r32;
        r0 = defpackage.zc.a(r0, r13, r12);	 Catch:{ IOException -> 0x0341 }
        r12 = r0.hasAlpha();	 Catch:{ IOException -> 0x0341 }
        goto L_0x035b;
        r0 = move-exception;
        goto L_0x0346;
        r0 = move-exception;
        r13 = r32;
        r12 = 3;
        r12 = android.util.Log.isLoggable(r3, r12);	 Catch:{ all -> 0x05a6 }
        if (r12 == 0) goto L_0x035a;	 Catch:{ all -> 0x05a6 }
        r12 = "Cannot determine whether the image has alpha or not from header, format ";	 Catch:{ all -> 0x05a6 }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x05a6 }
        r9 = r12.concat(r9);	 Catch:{ all -> 0x05a6 }
        android.util.Log.d(r3, r9, r0);	 Catch:{ all -> 0x05a6 }
        r12 = 0;	 Catch:{ all -> 0x05a6 }
        if (r12 == 0) goto L_0x0360;	 Catch:{ all -> 0x05a6 }
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ all -> 0x05a6 }
        goto L_0x0362;	 Catch:{ all -> 0x05a6 }
        r0 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ all -> 0x05a6 }
        r7.inPreferredConfig = r0;	 Catch:{ all -> 0x05a6 }
        r0 = r7.inPreferredConfig;	 Catch:{ all -> 0x05a6 }
        r9 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ all -> 0x05a6 }
        if (r0 != r9) goto L_0x0377;	 Catch:{ all -> 0x05a6 }
        r9 = 1;	 Catch:{ all -> 0x05a6 }
        r7.inDither = r9;	 Catch:{ all -> 0x05a6 }
        goto L_0x0377;	 Catch:{ all -> 0x05a6 }
        r13 = r32;	 Catch:{ all -> 0x05a6 }
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ all -> 0x05a6 }
        r7.inPreferredConfig = r0;	 Catch:{ all -> 0x05a6 }
        goto L_0x0377;	 Catch:{ all -> 0x05a6 }
        r13 = r32;	 Catch:{ all -> 0x05a6 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x05a6 }
        r9 = 19;	 Catch:{ all -> 0x05a6 }
        if (r0 < r9) goto L_0x037e;	 Catch:{ all -> 0x05a6 }
        r8 = 1;	 Catch:{ all -> 0x05a6 }
        r0 = r7.inSampleSize;	 Catch:{ all -> 0x05a6 }
        r9 = 0;	 Catch:{ all -> 0x05a6 }
        r12 = 1;	 Catch:{ all -> 0x05a6 }
        if (r0 == r12) goto L_0x0386;	 Catch:{ all -> 0x05a6 }
        if (r8 == 0) goto L_0x043c;	 Catch:{ all -> 0x05a6 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x05a6 }
        r14 = 19;	 Catch:{ all -> 0x05a6 }
        if (r0 < r14) goto L_0x038d;	 Catch:{ all -> 0x05a6 }
        goto L_0x0394;	 Catch:{ all -> 0x05a6 }
        r0 = f;	 Catch:{ all -> 0x05a6 }
        r0 = r0.contains(r2);	 Catch:{ all -> 0x05a6 }
        r12 = r0;	 Catch:{ all -> 0x05a6 }
        if (r12 == 0) goto L_0x043c;	 Catch:{ all -> 0x05a6 }
        if (r6 < 0) goto L_0x039f;	 Catch:{ all -> 0x05a6 }
        if (r11 < 0) goto L_0x039f;	 Catch:{ all -> 0x05a6 }
        if (r23 == 0) goto L_0x039f;	 Catch:{ all -> 0x05a6 }
        if (r8 == 0) goto L_0x039f;	 Catch:{ all -> 0x05a6 }
        goto L_0x041c;	 Catch:{ all -> 0x05a6 }
        r0 = defpackage.adq.a(r7);	 Catch:{ all -> 0x05a6 }
        if (r0 == 0) goto L_0x03ad;	 Catch:{ all -> 0x05a6 }
        r0 = r7.inTargetDensity;	 Catch:{ all -> 0x05a6 }
        r0 = (float) r0;	 Catch:{ all -> 0x05a6 }
        r2 = r7.inDensity;	 Catch:{ all -> 0x05a6 }
        r2 = (float) r2;	 Catch:{ all -> 0x05a6 }
        r0 = r0 / r2;	 Catch:{ all -> 0x05a6 }
        goto L_0x03af;	 Catch:{ all -> 0x05a6 }
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x05a6 }
        r2 = r7.inSampleSize;	 Catch:{ all -> 0x05a6 }
        r4 = (float) r6;	 Catch:{ all -> 0x05a6 }
        r8 = (float) r2;	 Catch:{ all -> 0x05a6 }
        r4 = r4 / r8;	 Catch:{ all -> 0x05a6 }
        r14 = (double) r4;	 Catch:{ all -> 0x05a6 }
        r14 = java.lang.Math.ceil(r14);	 Catch:{ all -> 0x05a6 }
        r4 = (int) r14;	 Catch:{ all -> 0x05a6 }
        r12 = (float) r11;	 Catch:{ all -> 0x05a6 }
        r12 = r12 / r8;	 Catch:{ all -> 0x05a6 }
        r14 = (double) r12;	 Catch:{ all -> 0x05a6 }
        r14 = java.lang.Math.ceil(r14);	 Catch:{ all -> 0x05a6 }
        r8 = (int) r14;	 Catch:{ all -> 0x05a6 }
        r4 = (float) r4;	 Catch:{ all -> 0x05a6 }
        r4 = r4 * r0;	 Catch:{ all -> 0x05a6 }
        r15 = java.lang.Math.round(r4);	 Catch:{ all -> 0x05a6 }
        r4 = (float) r8;	 Catch:{ all -> 0x05a6 }
        r4 = r4 * r0;	 Catch:{ all -> 0x05a6 }
        r4 = java.lang.Math.round(r4);	 Catch:{ all -> 0x05a6 }
        r8 = 2;	 Catch:{ all -> 0x05a6 }
        r12 = android.util.Log.isLoggable(r3, r8);	 Catch:{ all -> 0x05a6 }
        if (r12 == 0) goto L_0x041c;	 Catch:{ all -> 0x05a6 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05a6 }
        r12 = "Calculated target [";	 Catch:{ all -> 0x05a6 }
        r8.<init>(r12);	 Catch:{ all -> 0x05a6 }
        r8.append(r15);	 Catch:{ all -> 0x05a6 }
        r8.append(r10);	 Catch:{ all -> 0x05a6 }
        r8.append(r4);	 Catch:{ all -> 0x05a6 }
        r12 = "] for source [";	 Catch:{ all -> 0x05a6 }
        r8.append(r12);	 Catch:{ all -> 0x05a6 }
        r8.append(r6);	 Catch:{ all -> 0x05a6 }
        r8.append(r10);	 Catch:{ all -> 0x05a6 }
        r8.append(r11);	 Catch:{ all -> 0x05a6 }
        r12 = "], sampleSize: ";	 Catch:{ all -> 0x05a6 }
        r8.append(r12);	 Catch:{ all -> 0x05a6 }
        r8.append(r2);	 Catch:{ all -> 0x05a6 }
        r2 = ", targetDensity: ";	 Catch:{ all -> 0x05a6 }
        r8.append(r2);	 Catch:{ all -> 0x05a6 }
        r2 = r7.inTargetDensity;	 Catch:{ all -> 0x05a6 }
        r8.append(r2);	 Catch:{ all -> 0x05a6 }
        r8.append(r1);	 Catch:{ all -> 0x05a6 }
        r2 = r7.inDensity;	 Catch:{ all -> 0x05a6 }
        r8.append(r2);	 Catch:{ all -> 0x05a6 }
        r2 = ", density multiplier: ";	 Catch:{ all -> 0x05a6 }
        r8.append(r2);	 Catch:{ all -> 0x05a6 }
        r8.append(r0);	 Catch:{ all -> 0x05a6 }
        r0 = r8.toString();	 Catch:{ all -> 0x05a6 }
        android.util.Log.v(r3, r0);	 Catch:{ all -> 0x05a6 }
        if (r15 <= 0) goto L_0x043c;	 Catch:{ all -> 0x05a6 }
        if (r4 <= 0) goto L_0x043c;	 Catch:{ all -> 0x05a6 }
        r0 = r5.h;	 Catch:{ all -> 0x05a6 }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x05a6 }
        r8 = 26;	 Catch:{ all -> 0x05a6 }
        if (r2 < r8) goto L_0x0431;	 Catch:{ all -> 0x05a6 }
        r2 = r7.inPreferredConfig;	 Catch:{ all -> 0x05a6 }
        r8 = android.graphics.Bitmap.Config.HARDWARE;	 Catch:{ all -> 0x05a6 }
        if (r2 == r8) goto L_0x043c;	 Catch:{ all -> 0x05a6 }
        r2 = r7.outConfig;	 Catch:{ all -> 0x05a6 }
        goto L_0x0432;	 Catch:{ all -> 0x05a6 }
        r2 = r9;	 Catch:{ all -> 0x05a6 }
        if (r2 != 0) goto L_0x0436;	 Catch:{ all -> 0x05a6 }
        r2 = r7.inPreferredConfig;	 Catch:{ all -> 0x05a6 }
        r0 = r0.b(r15, r4, r2);	 Catch:{ all -> 0x05a6 }
        r7.inBitmap = r0;	 Catch:{ all -> 0x05a6 }
        r0 = r5.h;	 Catch:{ all -> 0x05a6 }
        r2 = r36;	 Catch:{ all -> 0x05a6 }
        r0 = defpackage.adq.b(r13, r7, r2, r0);	 Catch:{ all -> 0x05a6 }
        r4 = r5.h;	 Catch:{ all -> 0x05a6 }
        r2.a(r4, r0);	 Catch:{ all -> 0x05a6 }
        r2 = 2;	 Catch:{ all -> 0x05a6 }
        r2 = android.util.Log.isLoggable(r3, r2);	 Catch:{ all -> 0x05a6 }
        if (r2 == 0) goto L_0x04d5;	 Catch:{ all -> 0x05a6 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05a6 }
        r4 = "Decoded ";	 Catch:{ all -> 0x05a6 }
        r2.<init>(r4);	 Catch:{ all -> 0x05a6 }
        r4 = defpackage.adq.a(r0);	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r4 = " from [";	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r2.append(r6);	 Catch:{ all -> 0x05a6 }
        r2.append(r10);	 Catch:{ all -> 0x05a6 }
        r2.append(r11);	 Catch:{ all -> 0x05a6 }
        r4 = "] ";	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r4 = r22;	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r4 = " with inBitmap ";	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r4 = r7.inBitmap;	 Catch:{ all -> 0x05a6 }
        r4 = defpackage.adq.a(r4);	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r4 = " for [";	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r4 = r33;	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r2.append(r10);	 Catch:{ all -> 0x05a6 }
        r4 = r34;	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r4 = "], sample size: ";	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r4 = r7.inSampleSize;	 Catch:{ all -> 0x05a6 }
        r2.append(r4);	 Catch:{ all -> 0x05a6 }
        r2.append(r1);	 Catch:{ all -> 0x05a6 }
        r1 = r7.inDensity;	 Catch:{ all -> 0x05a6 }
        r2.append(r1);	 Catch:{ all -> 0x05a6 }
        r1 = ", target density: ";	 Catch:{ all -> 0x05a6 }
        r2.append(r1);	 Catch:{ all -> 0x05a6 }
        r1 = r7.inTargetDensity;	 Catch:{ all -> 0x05a6 }
        r2.append(r1);	 Catch:{ all -> 0x05a6 }
        r1 = ", thread: ";	 Catch:{ all -> 0x05a6 }
        r2.append(r1);	 Catch:{ all -> 0x05a6 }
        r1 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x05a6 }
        r1 = r1.getName();	 Catch:{ all -> 0x05a6 }
        r2.append(r1);	 Catch:{ all -> 0x05a6 }
        r1 = ", duration: ";	 Catch:{ all -> 0x05a6 }
        r2.append(r1);	 Catch:{ all -> 0x05a6 }
        r10 = defpackage.ahh.a(r17);	 Catch:{ all -> 0x05a6 }
        r2.append(r10);	 Catch:{ all -> 0x05a6 }
        r1 = r2.toString();	 Catch:{ all -> 0x05a6 }
        android.util.Log.v(r3, r1);	 Catch:{ all -> 0x05a6 }
        if (r0 == 0) goto L_0x0595;	 Catch:{ all -> 0x05a6 }
        r1 = r5.i;	 Catch:{ all -> 0x05a6 }
        r1 = r1.densityDpi;	 Catch:{ all -> 0x05a6 }
        r0.setDensity(r1);	 Catch:{ all -> 0x05a6 }
        r1 = r5.h;	 Catch:{ all -> 0x05a6 }
        r2 = defpackage.adz.a(r21);	 Catch:{ all -> 0x05a6 }
        if (r2 != 0) goto L_0x04e9;	 Catch:{ all -> 0x05a6 }
        r9 = r0;	 Catch:{ all -> 0x05a6 }
        goto L_0x0582;	 Catch:{ all -> 0x05a6 }
        r2 = new android.graphics.Matrix;	 Catch:{ all -> 0x05a6 }
        r2.<init>();	 Catch:{ all -> 0x05a6 }
        r3 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;	 Catch:{ all -> 0x05a6 }
        switch(r21) {
            case 2: goto L_0x0521;
            case 3: goto L_0x051b;
            case 4: goto L_0x0513;
            case 5: goto L_0x050b;
            case 6: goto L_0x0505;
            case 7: goto L_0x04fa;
            case 8: goto L_0x04f4;
            default: goto L_0x04f3;
        };	 Catch:{ all -> 0x05a6 }
        goto L_0x0526;	 Catch:{ all -> 0x05a6 }
        r3 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;	 Catch:{ all -> 0x05a6 }
        r2.setRotate(r3);	 Catch:{ all -> 0x05a6 }
        goto L_0x0526;	 Catch:{ all -> 0x05a6 }
        r4 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;	 Catch:{ all -> 0x05a6 }
        r2.setRotate(r4);	 Catch:{ all -> 0x05a6 }
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x05a6 }
        r2.postScale(r3, r4);	 Catch:{ all -> 0x05a6 }
        goto L_0x0526;	 Catch:{ all -> 0x05a6 }
        r3 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;	 Catch:{ all -> 0x05a6 }
        r2.setRotate(r3);	 Catch:{ all -> 0x05a6 }
        goto L_0x0526;	 Catch:{ all -> 0x05a6 }
        r4 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;	 Catch:{ all -> 0x05a6 }
        r2.setRotate(r4);	 Catch:{ all -> 0x05a6 }
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x05a6 }
        goto L_0x0501;	 Catch:{ all -> 0x05a6 }
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x05a6 }
        r6 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;	 Catch:{ all -> 0x05a6 }
        r2.setRotate(r6);	 Catch:{ all -> 0x05a6 }
        goto L_0x0501;	 Catch:{ all -> 0x05a6 }
        r3 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;	 Catch:{ all -> 0x05a6 }
        r2.setRotate(r3);	 Catch:{ all -> 0x05a6 }
        goto L_0x0526;	 Catch:{ all -> 0x05a6 }
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x05a6 }
        r2.setScale(r3, r4);	 Catch:{ all -> 0x05a6 }
        r3 = new android.graphics.RectF;	 Catch:{ all -> 0x05a6 }
        r4 = r0.getWidth();	 Catch:{ all -> 0x05a6 }
        r4 = (float) r4;	 Catch:{ all -> 0x05a6 }
        r6 = r0.getHeight();	 Catch:{ all -> 0x05a6 }
        r6 = (float) r6;	 Catch:{ all -> 0x05a6 }
        r8 = 0;	 Catch:{ all -> 0x05a6 }
        r3.<init>(r8, r8, r4, r6);	 Catch:{ all -> 0x05a6 }
        r2.mapRect(r3);	 Catch:{ all -> 0x05a6 }
        r4 = r3.width();	 Catch:{ all -> 0x05a6 }
        r4 = java.lang.Math.round(r4);	 Catch:{ all -> 0x05a6 }
        r6 = r3.height();	 Catch:{ all -> 0x05a6 }
        r6 = java.lang.Math.round(r6);	 Catch:{ all -> 0x05a6 }
        r8 = r0.getConfig();	 Catch:{ all -> 0x05a6 }
        if (r8 == 0) goto L_0x0554;	 Catch:{ all -> 0x05a6 }
        r8 = r0.getConfig();	 Catch:{ all -> 0x05a6 }
        goto L_0x0556;	 Catch:{ all -> 0x05a6 }
        r8 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ all -> 0x05a6 }
        r1 = r1.a(r4, r6, r8);	 Catch:{ all -> 0x05a6 }
        r4 = r3.left;	 Catch:{ all -> 0x05a6 }
        r4 = -r4;	 Catch:{ all -> 0x05a6 }
        r3 = r3.top;	 Catch:{ all -> 0x05a6 }
        r3 = -r3;	 Catch:{ all -> 0x05a6 }
        r2.postTranslate(r4, r3);	 Catch:{ all -> 0x05a6 }
        r3 = r0.hasAlpha();	 Catch:{ all -> 0x05a6 }
        r1.setHasAlpha(r3);	 Catch:{ all -> 0x05a6 }
        r3 = defpackage.adz.b;	 Catch:{ all -> 0x05a6 }
        r3.lock();	 Catch:{ all -> 0x05a6 }
        r3 = new android.graphics.Canvas;	 Catch:{ all -> 0x058e }
        r3.<init>(r1);	 Catch:{ all -> 0x058e }
        r4 = defpackage.adz.a;	 Catch:{ all -> 0x058e }
        r3.drawBitmap(r0, r2, r4);	 Catch:{ all -> 0x058e }
        r3.setBitmap(r9);	 Catch:{ all -> 0x058e }
        r2 = defpackage.adz.b;	 Catch:{ all -> 0x05a6 }
        r2.unlock();	 Catch:{ all -> 0x05a6 }
        r9 = r1;	 Catch:{ all -> 0x05a6 }
        r1 = r0.equals(r9);	 Catch:{ all -> 0x05a6 }
        if (r1 != 0) goto L_0x0595;	 Catch:{ all -> 0x05a6 }
        r1 = r5.h;	 Catch:{ all -> 0x05a6 }
        r1.a(r0);	 Catch:{ all -> 0x05a6 }
        goto L_0x0595;	 Catch:{ all -> 0x05a6 }
        r0 = move-exception;	 Catch:{ all -> 0x05a6 }
        r1 = defpackage.adz.b;	 Catch:{ all -> 0x05a6 }
        r1.unlock();	 Catch:{ all -> 0x05a6 }
        throw r0;	 Catch:{ all -> 0x05a6 }
        r0 = r5.h;	 Catch:{ all -> 0x05a6 }
        r0 = defpackage.adl.a(r9, r0);	 Catch:{ all -> 0x05a6 }
        defpackage.adq.b(r7);
        r1 = r5.j;
        r6 = r16;
        r1.a(r6);
        return r0;
        r0 = move-exception;
        goto L_0x05ae;
        r0 = move-exception;
        r5 = r31;
        goto L_0x05ae;
        r0 = move-exception;
        r5 = r1;
        r6 = r16;
        goto L_0x05b3;
        r0 = move-exception;
        r5 = r1;
        defpackage.adq.b(r7);
        r1 = r5.j;
        r1.a(r6);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adq.a(java.io.InputStream, int, int, zf, adq$a):aax");
    }
}
