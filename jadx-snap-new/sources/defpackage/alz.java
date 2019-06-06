package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import defpackage.amf.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
import org.opencv.imgproc.Imgproc;

/* renamed from: alz */
public abstract class alz implements alu<InputStream> {
    public static final alz a = new 1();
    public static final alz b = new 2();
    private static final Set<a> c = EnumSet.of(a.JPEG, a.PNG_A, a.PNG);
    private static final Queue<Options> d = aps.a(0);

    /* renamed from: alz$1 */
    static class 1 extends alz {
        1() {
        }

        /* Access modifiers changed, original: protected|final */
        public final int a(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }

        public final String a() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }
    }

    /* renamed from: alz$2 */
    static class 2 extends alz {
        2() {
        }

        /* Access modifiers changed, original: protected|final */
        public final int a(int i, int i2, int i3, int i4) {
            i = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            i3 = 1;
            i2 = Math.max(1, Integer.highestOneBit(i));
            if (i2 >= i) {
                i3 = 0;
            }
            return i2 << i3;
        }

        public final String a() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }
    }

    /* renamed from: alz$3 */
    static class 3 extends alz {
        3() {
        }

        /* Access modifiers changed, original: protected|final */
        public final int a(int i, int i2, int i3, int i4) {
            return 0;
        }

        public final String a() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }
    }

    static {
        3 3 = new 3();
    }

    /* JADX WARNING: Missing block: B:13:0x002e, code skipped:
            if (android.util.Log.isLoggable(r1, 5) == false) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:14:0x0030, code skipped:
            android.util.Log.w(r1, r0, r6);
     */
    /* JADX WARNING: Missing block: B:25:0x0053, code skipped:
            if (android.util.Log.isLoggable(r1, 5) == false) goto L_0x0056;
     */
    private static android.graphics.Bitmap.Config a(java.io.InputStream r6, defpackage.aim r7) {
        /*
        r0 = "Cannot reset the input stream";
        r1 = "Downsampler";
        r2 = defpackage.aim.ALWAYS_ARGB_8888;
        if (r7 == r2) goto L_0x006d;
    L_0x0008:
        r2 = defpackage.aim.PREFER_ARGB_8888;
        if (r7 == r2) goto L_0x006d;
    L_0x000c:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 16;
        if (r2 != r3) goto L_0x0013;
    L_0x0012:
        goto L_0x006d;
    L_0x0013:
        r2 = 0;
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r6.mark(r3);
        r3 = 5;
        r4 = new amf;	 Catch:{ IOException -> 0x0036 }
        r4.<init>(r6);	 Catch:{ IOException -> 0x0036 }
        r4 = r4.a();	 Catch:{ IOException -> 0x0036 }
        r2 = r4.hasAlpha;	 Catch:{ IOException -> 0x0036 }
        r6.reset();	 Catch:{ IOException -> 0x0029 }
        goto L_0x0056;
    L_0x0029:
        r6 = move-exception;
        r7 = android.util.Log.isLoggable(r1, r3);
        if (r7 == 0) goto L_0x0056;
    L_0x0030:
        android.util.Log.w(r1, r0, r6);
        goto L_0x0056;
    L_0x0034:
        r7 = move-exception;
        goto L_0x005e;
    L_0x0036:
        r4 = move-exception;
        r5 = android.util.Log.isLoggable(r1, r3);	 Catch:{ all -> 0x0034 }
        if (r5 == 0) goto L_0x004a;
    L_0x003d:
        r5 = "Cannot determine whether the image has alpha or not from header for format ";
        r7 = java.lang.String.valueOf(r7);	 Catch:{ all -> 0x0034 }
        r7 = r5.concat(r7);	 Catch:{ all -> 0x0034 }
        android.util.Log.w(r1, r7, r4);	 Catch:{ all -> 0x0034 }
    L_0x004a:
        r6.reset();	 Catch:{ IOException -> 0x004e }
        goto L_0x0056;
    L_0x004e:
        r6 = move-exception;
        r7 = android.util.Log.isLoggable(r1, r3);
        if (r7 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x0030;
    L_0x0056:
        if (r2 == 0) goto L_0x005b;
    L_0x0058:
        r6 = android.graphics.Bitmap.Config.ARGB_8888;
        return r6;
    L_0x005b:
        r6 = android.graphics.Bitmap.Config.RGB_565;
        return r6;
    L_0x005e:
        r6.reset();	 Catch:{ IOException -> 0x0062 }
        goto L_0x006c;
    L_0x0062:
        r6 = move-exception;
        r2 = android.util.Log.isLoggable(r1, r3);
        if (r2 == 0) goto L_0x006c;
    L_0x0069:
        android.util.Log.w(r1, r0, r6);
    L_0x006c:
        throw r7;
    L_0x006d:
        r6 = android.graphics.Bitmap.Config.ARGB_8888;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alz.a(java.io.InputStream, aim):android.graphics.Bitmap$Config");
    }

    private static Bitmap a(apq apq, ami ami, Options options, ajr ajr) {
        String str = "Downsampler";
        if (options.inJustDecodeBounds) {
            apq.mark(5242880);
        } else {
            ami.a();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str2 = options.outMimeType;
        try {
            ami = BitmapFactory.decodeStream(apq, null, options);
            try {
                if (options.inJustDecodeBounds) {
                    apq.reset();
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 6)) {
                    StringBuilder stringBuilder = new StringBuilder("Exception loading inDecodeBounds=");
                    stringBuilder.append(options.inJustDecodeBounds);
                    stringBuilder.append(" sample=");
                    stringBuilder.append(options.inSampleSize);
                    Log.e(str, stringBuilder.toString(), e);
                }
            }
            return ami;
        } catch (IllegalArgumentException e2) {
            String str3;
            StringBuilder stringBuilder2 = new StringBuilder("Exception decoding bitmap, outWidth: ");
            stringBuilder2.append(i);
            stringBuilder2.append(", outHeight: ");
            stringBuilder2.append(i2);
            stringBuilder2.append(", outMimeType: ");
            stringBuilder2.append(str2);
            stringBuilder2.append(", inBitmap: ");
            Bitmap bitmap = options.inBitmap;
            if (bitmap == null) {
                str3 = null;
            } else {
                String stringBuilder3;
                if (VERSION.SDK_INT >= 19) {
                    StringBuilder stringBuilder4 = new StringBuilder(" (");
                    stringBuilder4.append(bitmap.getAllocationByteCount());
                    stringBuilder4.append(")");
                    stringBuilder3 = stringBuilder4.toString();
                } else {
                    stringBuilder3 = "";
                }
                StringBuilder stringBuilder5 = new StringBuilder("[");
                stringBuilder5.append(bitmap.getWidth());
                stringBuilder5.append("x");
                stringBuilder5.append(bitmap.getHeight());
                stringBuilder5.append("] ");
                stringBuilder5.append(bitmap.getConfig());
                stringBuilder5.append(stringBuilder3);
                str3 = stringBuilder5.toString();
            }
            stringBuilder2.append(str3);
            IOException iOException = new IOException(stringBuilder2.toString(), e2);
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
            }
            if (options.inBitmap != null) {
                try {
                    apq.reset();
                    ajr.a(options.inBitmap);
                    options.inBitmap = null;
                    return alz.a(apq, ami, options, ajr);
                } catch (IOException unused) {
                    throw iOException;
                }
            }
            throw iOException;
        }
    }

    private static void a(Options options) {
        alz.b(options);
        synchronized (d) {
            d.offer(options);
        }
    }

    private static boolean a(InputStream inputStream) {
        String str = "Cannot reset the input stream";
        String str2 = "Downsampler";
        if (19 <= VERSION.SDK_INT) {
            return true;
        }
        inputStream.mark(Imgproc.INTER_TAB_SIZE2);
        try {
            boolean contains = c.contains(new amf(inputStream).a());
            try {
                inputStream.reset();
            } catch (IOException e) {
                if (Log.isLoggable(str2, 5)) {
                    Log.w(str2, str, e);
                }
            }
            return contains;
        } catch (IOException e2) {
            if (Log.isLoggable(str2, 5)) {
                Log.w(str2, "Cannot determine the image type from header", e2);
            }
            try {
                inputStream.reset();
            } catch (IOException e3) {
                if (Log.isLoggable(str2, 5)) {
                    Log.w(str2, str, e3);
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                inputStream.reset();
            } catch (IOException e32) {
                if (Log.isLoggable(str2, 5)) {
                    Log.w(str2, str, e32);
                }
            }
            throw th;
        }
    }

    @TargetApi(11)
    private static synchronized Options b() {
        Options options;
        synchronized (alz.class) {
            synchronized (d) {
                options = (Options) d.poll();
            }
            if (options == null) {
                options = new Options();
                alz.b(options);
            }
        }
        return options;
    }

    @TargetApi(11)
    private static void b(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    public abstract int a(int i, int i2, int i3, int i4);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:195:0x0321 in {10, 11, 12, 20, 21, 24, 25, 30, 40, 41, 42, 47, 51, 53, 54, 61, 62, 65, 66, 67, 70, 76, 77, 79, 80, 82, 89, 91, 94, 96, 102, 103, 107, 108, 109, 110, 113, 114, 116, 119, 120, 121, 123, 124, 128, 138, 139, 145, 146, 147, 148, 149, 150, 151, 152, 153, 156, 159, 160, 163, 164, 165, 167, 171, 173, 175, 176, 178, 181, 183, 189, 190, 192, 194} preds:[]
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
    public final android.graphics.Bitmap a(java.io.InputStream r20, defpackage.ajr r21, int r22, int r23, defpackage.aim r24) {
        /*
        r19 = this;
        r1 = r19;
        r2 = r21;
        r3 = "Cannot reset the input stream";
        r4 = "Downsampler";
        r5 = defpackage.apl.a;
        r6 = r5.a();
        r7 = r5.a();
        r8 = defpackage.alz.b();
        r9 = new ami;
        r0 = r20;
        r9.<init>(r0, r7);
        r10 = defpackage.apn.a(r9);
        r11 = new apq;
        r11.<init>(r10);
        r0 = 5242880; // 0x500000 float:7.34684E-39 double:2.590327E-317;
        r10.mark(r0);	 Catch:{ all -> 0x0310 }
        r0 = new amf;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r0.<init>(r10);	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r14 = r0.b;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r14 = r14.a();	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r15 = 65496; // 0xffd8 float:9.178E-41 double:3.23593E-319;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = r14 & r15;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r13 == r15) goto L_0x0048;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = 19789; // 0x4d4d float:2.773E-41 double:9.777E-320;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r14 == r13) goto L_0x0048;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = 18761; // 0x4949 float:2.629E-41 double:9.269E-320;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r14 != r13) goto L_0x0046;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        goto L_0x0048;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = 0;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        goto L_0x0049;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = 1;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r13 == 0) goto L_0x013d;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = r0.b;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = r13.b();	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r14 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r15 = 3;
        r12 = "ImageHeaderParser";
        if (r13 == r14) goto L_0x006c;
        r0 = android.util.Log.isLoggable(r12, r15);	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r0 == 0) goto L_0x0076;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r0 = "Unknown segmentId=";	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = java.lang.String.valueOf(r13);	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r0 = r0.concat(r13);	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        android.util.Log.d(r12, r0);	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        goto L_0x0076;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = r0.b;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r13 = r13.b();	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r14 = 218; // 0xda float:3.05E-43 double:1.077E-321;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r13 != r14) goto L_0x007d;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r17 = r5;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r18 = r6;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r1 = 0;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        goto L_0x010e;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r14 = 217; // 0xd9 float:3.04E-43 double:1.07E-321;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r13 != r14) goto L_0x008a;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r0 = android.util.Log.isLoggable(r12, r15);	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r0 == 0) goto L_0x0076;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r0 = "Found MARKER_EOI in exif segment";	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        goto L_0x0068;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r14 = r0.b;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r14 = r14.a();	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r16 = 2;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r14 = r14 + -2;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r15 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        if (r13 == r15) goto L_0x00da;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r15 = r0.b;	 Catch:{ IOException -> 0x015d, all -> 0x0156 }
        r1 = (long) r14;
        r17 = r5;
        r18 = r6;
        r5 = r15.a(r1);	 Catch:{ IOException -> 0x0118 }
        r15 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));	 Catch:{ IOException -> 0x0118 }
        if (r15 == 0) goto L_0x00d0;	 Catch:{ IOException -> 0x0118 }
        r0 = 3;	 Catch:{ IOException -> 0x0118 }
        r0 = android.util.Log.isLoggable(r12, r0);	 Catch:{ IOException -> 0x0118 }
        if (r0 == 0) goto L_0x007a;	 Catch:{ IOException -> 0x0118 }
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0118 }
        r1 = "Unable to skip enough data, type: ";	 Catch:{ IOException -> 0x0118 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0118 }
        r0.append(r13);	 Catch:{ IOException -> 0x0118 }
        r1 = ", wanted to skip: ";	 Catch:{ IOException -> 0x0118 }
        r0.append(r1);	 Catch:{ IOException -> 0x0118 }
        r0.append(r14);	 Catch:{ IOException -> 0x0118 }
        r1 = ", but actually skipped: ";	 Catch:{ IOException -> 0x0118 }
        r0.append(r1);	 Catch:{ IOException -> 0x0118 }
        r0.append(r5);	 Catch:{ IOException -> 0x0118 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0118 }
        android.util.Log.d(r12, r0);	 Catch:{ IOException -> 0x0118 }
        goto L_0x007a;	 Catch:{ IOException -> 0x0118 }
        r1 = r19;	 Catch:{ IOException -> 0x0118 }
        r2 = r21;	 Catch:{ IOException -> 0x0118 }
        r5 = r17;	 Catch:{ IOException -> 0x0118 }
        r6 = r18;	 Catch:{ IOException -> 0x0118 }
        goto L_0x004b;	 Catch:{ IOException -> 0x0118 }
        r17 = r5;	 Catch:{ IOException -> 0x0118 }
        r18 = r6;	 Catch:{ IOException -> 0x0118 }
        r1 = new byte[r14];	 Catch:{ IOException -> 0x0118 }
        r0 = r0.b;	 Catch:{ IOException -> 0x0118 }
        r0 = r0.a(r1);	 Catch:{ IOException -> 0x0118 }
        if (r0 == r14) goto L_0x010e;	 Catch:{ IOException -> 0x0118 }
        r1 = 3;	 Catch:{ IOException -> 0x0118 }
        r1 = android.util.Log.isLoggable(r12, r1);	 Catch:{ IOException -> 0x0118 }
        if (r1 == 0) goto L_0x007a;	 Catch:{ IOException -> 0x0118 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0118 }
        r2 = "Unable to read segment data, type: ";	 Catch:{ IOException -> 0x0118 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x0118 }
        r1.append(r13);	 Catch:{ IOException -> 0x0118 }
        r2 = ", length: ";	 Catch:{ IOException -> 0x0118 }
        r1.append(r2);	 Catch:{ IOException -> 0x0118 }
        r1.append(r14);	 Catch:{ IOException -> 0x0118 }
        r2 = ", actually read: ";	 Catch:{ IOException -> 0x0118 }
        r1.append(r2);	 Catch:{ IOException -> 0x0118 }
        r1.append(r0);	 Catch:{ IOException -> 0x0118 }
        r0 = r1.toString();	 Catch:{ IOException -> 0x0118 }
        goto L_0x00cc;	 Catch:{ IOException -> 0x0118 }
        if (r1 == 0) goto L_0x011a;	 Catch:{ IOException -> 0x0118 }
        r0 = r1.length;	 Catch:{ IOException -> 0x0118 }
        r2 = defpackage.amf.a;	 Catch:{ IOException -> 0x0118 }
        r2 = r2.length;	 Catch:{ IOException -> 0x0118 }
        if (r0 <= r2) goto L_0x011a;	 Catch:{ IOException -> 0x0118 }
        r14 = 1;	 Catch:{ IOException -> 0x0118 }
        goto L_0x011b;	 Catch:{ IOException -> 0x0118 }
        r0 = move-exception;	 Catch:{ IOException -> 0x0118 }
        goto L_0x0162;	 Catch:{ IOException -> 0x0118 }
        r14 = 0;	 Catch:{ IOException -> 0x0118 }
        if (r14 == 0) goto L_0x0130;	 Catch:{ IOException -> 0x0118 }
        r0 = 0;	 Catch:{ IOException -> 0x0118 }
        r2 = defpackage.amf.a;	 Catch:{ IOException -> 0x0118 }
        r2 = r2.length;	 Catch:{ IOException -> 0x0118 }
        if (r0 >= r2) goto L_0x0130;	 Catch:{ IOException -> 0x0118 }
        r2 = r1[r0];	 Catch:{ IOException -> 0x0118 }
        r5 = defpackage.amf.a;	 Catch:{ IOException -> 0x0118 }
        r5 = r5[r0];	 Catch:{ IOException -> 0x0118 }
        if (r2 == r5) goto L_0x012d;	 Catch:{ IOException -> 0x0118 }
        r14 = 0;	 Catch:{ IOException -> 0x0118 }
        goto L_0x0130;	 Catch:{ IOException -> 0x0118 }
        r0 = r0 + 1;	 Catch:{ IOException -> 0x0118 }
        goto L_0x011e;	 Catch:{ IOException -> 0x0118 }
        if (r14 == 0) goto L_0x0141;	 Catch:{ IOException -> 0x0118 }
        r0 = new amf$b;	 Catch:{ IOException -> 0x0118 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x0118 }
        r0 = defpackage.amf.a(r0);	 Catch:{ IOException -> 0x0118 }
        r14 = r0;
        goto L_0x0143;
        r17 = r5;
        r18 = r6;
        r0 = -1;
        r14 = -1;
        r10.reset();	 Catch:{ IOException -> 0x0147 }
        goto L_0x0153;
        r0 = move-exception;
        r1 = r0;
        r2 = 5;
        r0 = android.util.Log.isLoggable(r4, r2);	 Catch:{ all -> 0x017c }
        if (r0 == 0) goto L_0x0153;	 Catch:{ all -> 0x017c }
        android.util.Log.w(r4, r3, r1);	 Catch:{ all -> 0x017c }
        r1 = r18;
        goto L_0x0193;
        r0 = move-exception;
        r2 = r5;
        r1 = r6;
        r5 = r7;
        r6 = r0;
        goto L_0x02fd;
        r0 = move-exception;
        r17 = r5;
        r18 = r6;
        r1 = 5;
        r2 = android.util.Log.isLoggable(r4, r1);	 Catch:{ all -> 0x02f5 }
        if (r2 == 0) goto L_0x0178;
        r1 = "Cannot determine the image orientation from header";	 Catch:{ all -> 0x016f }
        android.util.Log.w(r4, r1, r0);	 Catch:{ all -> 0x016f }
        goto L_0x0178;
        r0 = move-exception;
        r6 = r0;
        r5 = r7;
        r2 = r17;
        r1 = r18;
        goto L_0x02fd;
        r10.reset();	 Catch:{ IOException -> 0x0184 }
        goto L_0x0190;
        r0 = move-exception;
        r5 = r7;
        r2 = r17;
        r1 = r18;
        goto L_0x0314;
        r0 = move-exception;
        r1 = r0;
        r2 = 5;
        r0 = android.util.Log.isLoggable(r4, r2);	 Catch:{ all -> 0x017c }
        if (r0 == 0) goto L_0x0190;	 Catch:{ all -> 0x017c }
        android.util.Log.w(r4, r3, r1);	 Catch:{ all -> 0x017c }
        r1 = r18;
        r14 = 0;
        r8.inTempStorage = r1;	 Catch:{ all -> 0x02f0 }
        r2 = 1;	 Catch:{ all -> 0x02f0 }
        r8.inJustDecodeBounds = r2;	 Catch:{ all -> 0x02f0 }
        r2 = r21;	 Catch:{ all -> 0x02f0 }
        defpackage.alz.a(r11, r9, r8, r2);	 Catch:{ all -> 0x02f0 }
        r3 = 0;	 Catch:{ all -> 0x02f0 }
        r8.inJustDecodeBounds = r3;	 Catch:{ all -> 0x02f0 }
        r4 = 2;	 Catch:{ all -> 0x02f0 }
        r0 = new int[r4];	 Catch:{ all -> 0x02f0 }
        r4 = r8.outWidth;	 Catch:{ all -> 0x02f0 }
        r0[r3] = r4;	 Catch:{ all -> 0x02f0 }
        r4 = r8.outHeight;	 Catch:{ all -> 0x02f0 }
        r5 = 1;	 Catch:{ all -> 0x02f0 }
        r0[r5] = r4;	 Catch:{ all -> 0x02f0 }
        r4 = r0[r3];	 Catch:{ all -> 0x02f0 }
        r0 = r0[r5];	 Catch:{ all -> 0x02f0 }
        r5 = 270; // 0x10e float:3.78E-43 double:1.334E-321;	 Catch:{ all -> 0x02f0 }
        r6 = 90;	 Catch:{ all -> 0x02f0 }
        switch(r14) {
            case 3: goto L_0x01bf;
            case 4: goto L_0x01bf;
            case 5: goto L_0x01bc;
            case 6: goto L_0x01bc;
            case 7: goto L_0x01b9;
            case 8: goto L_0x01b9;
            default: goto L_0x01b7;
        };	 Catch:{ all -> 0x02f0 }
        r12 = 0;	 Catch:{ all -> 0x02f0 }
        goto L_0x01c1;	 Catch:{ all -> 0x02f0 }
        r12 = 270; // 0x10e float:3.78E-43 double:1.334E-321;	 Catch:{ all -> 0x02f0 }
        goto L_0x01c1;	 Catch:{ all -> 0x02f0 }
        r12 = 90;	 Catch:{ all -> 0x02f0 }
        goto L_0x01c1;	 Catch:{ all -> 0x02f0 }
        r12 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;	 Catch:{ all -> 0x02f0 }
        r13 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ all -> 0x02f0 }
        r15 = r23;	 Catch:{ all -> 0x02f0 }
        if (r15 != r13) goto L_0x01cb;	 Catch:{ all -> 0x02f0 }
        r15 = r22;	 Catch:{ all -> 0x02f0 }
        r3 = r0;	 Catch:{ all -> 0x02f0 }
        goto L_0x01ce;	 Catch:{ all -> 0x02f0 }
        r3 = r15;	 Catch:{ all -> 0x02f0 }
        r15 = r22;	 Catch:{ all -> 0x02f0 }
        if (r15 != r13) goto L_0x01d1;	 Catch:{ all -> 0x02f0 }
        r15 = r4;	 Catch:{ all -> 0x02f0 }
        if (r12 == r6) goto L_0x01dd;	 Catch:{ all -> 0x02f0 }
        if (r12 != r5) goto L_0x01d6;	 Catch:{ all -> 0x02f0 }
        goto L_0x01dd;	 Catch:{ all -> 0x02f0 }
        r5 = r19;	 Catch:{ all -> 0x02f0 }
        r3 = r5.a(r4, r0, r15, r3);	 Catch:{ all -> 0x02f0 }
        goto L_0x01e3;	 Catch:{ all -> 0x02f0 }
        r5 = r19;	 Catch:{ all -> 0x02f0 }
        r3 = r5.a(r0, r4, r15, r3);	 Catch:{ all -> 0x02f0 }
        if (r3 != 0) goto L_0x01e7;	 Catch:{ all -> 0x02f0 }
        r3 = 0;	 Catch:{ all -> 0x02f0 }
        goto L_0x01eb;	 Catch:{ all -> 0x02f0 }
        r3 = java.lang.Integer.highestOneBit(r3);	 Catch:{ all -> 0x02f0 }
        r6 = 1;	 Catch:{ all -> 0x02f0 }
        r3 = java.lang.Math.max(r6, r3);	 Catch:{ all -> 0x02f0 }
        r12 = r24;	 Catch:{ all -> 0x02f0 }
        r12 = defpackage.alz.a(r11, r12);	 Catch:{ all -> 0x02f0 }
        r8.inSampleSize = r3;	 Catch:{ all -> 0x02f0 }
        r8.inPreferredConfig = r12;	 Catch:{ all -> 0x02f0 }
        r13 = r8.inSampleSize;	 Catch:{ all -> 0x02f0 }
        if (r13 == r6) goto L_0x0204;	 Catch:{ all -> 0x02f0 }
        r6 = 19;	 Catch:{ all -> 0x02f0 }
        r13 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x02f0 }
        if (r6 > r13) goto L_0x0233;	 Catch:{ all -> 0x02f0 }
        r6 = defpackage.alz.a(r11);	 Catch:{ all -> 0x02f0 }
        if (r6 == 0) goto L_0x0233;
        r4 = (double) r4;
        r13 = r7;
        r6 = (double) r3;
        java.lang.Double.isNaN(r4);
        java.lang.Double.isNaN(r6);
        r4 = r4 / r6;
        r3 = java.lang.Math.ceil(r4);	 Catch:{ all -> 0x02ed }
        r3 = (int) r3;
        r4 = (double) r0;
        java.lang.Double.isNaN(r4);
        java.lang.Double.isNaN(r6);
        r4 = r4 / r6;
        r4 = java.lang.Math.ceil(r4);	 Catch:{ all -> 0x02ed }
        r0 = (int) r4;	 Catch:{ all -> 0x02ed }
        r0 = r2.b(r3, r0, r12);	 Catch:{ all -> 0x02ed }
        r3 = 11;	 Catch:{ all -> 0x02ed }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x02ed }
        if (r3 > r4) goto L_0x0234;	 Catch:{ all -> 0x02ed }
        r8.inBitmap = r0;	 Catch:{ all -> 0x02ed }
        goto L_0x0234;	 Catch:{ all -> 0x02ed }
        r13 = r7;	 Catch:{ all -> 0x02ed }
        r0 = defpackage.alz.a(r11, r9, r8, r2);	 Catch:{ all -> 0x02ed }
        r3 = r10.a;	 Catch:{ all -> 0x02ed }
        if (r3 != 0) goto L_0x02e4;	 Catch:{ all -> 0x02ed }
        if (r0 == 0) goto L_0x02d3;	 Catch:{ all -> 0x02ed }
        r3 = new android.graphics.Matrix;	 Catch:{ all -> 0x02ed }
        r3.<init>();	 Catch:{ all -> 0x02ed }
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;	 Catch:{ all -> 0x02ed }
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;	 Catch:{ all -> 0x02ed }
        switch(r14) {
            case 2: goto L_0x0272;
            case 3: goto L_0x026c;
            case 4: goto L_0x0266;
            case 5: goto L_0x0260;
            case 6: goto L_0x025a;
            case 7: goto L_0x0251;
            case 8: goto L_0x024b;
            default: goto L_0x024a;
        };	 Catch:{ all -> 0x02ed }
        goto L_0x0275;	 Catch:{ all -> 0x02ed }
        r4 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;	 Catch:{ all -> 0x02ed }
        r3.setRotate(r4);	 Catch:{ all -> 0x02ed }
        goto L_0x0275;	 Catch:{ all -> 0x02ed }
        r6 = -1028390912; // 0xffffffffc2b40000 float:-90.0 double:NaN;	 Catch:{ all -> 0x02ed }
        r3.setRotate(r6);	 Catch:{ all -> 0x02ed }
        r3.postScale(r5, r4);	 Catch:{ all -> 0x02ed }
        goto L_0x0275;	 Catch:{ all -> 0x02ed }
        r4 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;	 Catch:{ all -> 0x02ed }
        r3.setRotate(r4);	 Catch:{ all -> 0x02ed }
        goto L_0x0275;	 Catch:{ all -> 0x02ed }
        r6 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;	 Catch:{ all -> 0x02ed }
        r3.setRotate(r6);	 Catch:{ all -> 0x02ed }
        goto L_0x0256;	 Catch:{ all -> 0x02ed }
        r6 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;	 Catch:{ all -> 0x02ed }
        r3.setRotate(r6);	 Catch:{ all -> 0x02ed }
        goto L_0x0256;	 Catch:{ all -> 0x02ed }
        r4 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;	 Catch:{ all -> 0x02ed }
        r3.setRotate(r4);	 Catch:{ all -> 0x02ed }
        goto L_0x0275;	 Catch:{ all -> 0x02ed }
        r3.setScale(r5, r4);	 Catch:{ all -> 0x02ed }
        r4 = r3.isIdentity();	 Catch:{ all -> 0x02ed }
        if (r4 == 0) goto L_0x027d;	 Catch:{ all -> 0x02ed }
        r14 = r0;	 Catch:{ all -> 0x02ed }
        goto L_0x02c7;	 Catch:{ all -> 0x02ed }
        r4 = new android.graphics.RectF;	 Catch:{ all -> 0x02ed }
        r5 = 0;	 Catch:{ all -> 0x02ed }
        r6 = 0;	 Catch:{ all -> 0x02ed }
        r7 = r0.getWidth();	 Catch:{ all -> 0x02ed }
        r7 = (float) r7;	 Catch:{ all -> 0x02ed }
        r9 = r0.getHeight();	 Catch:{ all -> 0x02ed }
        r9 = (float) r9;	 Catch:{ all -> 0x02ed }
        r4.<init>(r5, r6, r7, r9);	 Catch:{ all -> 0x02ed }
        r3.mapRect(r4);	 Catch:{ all -> 0x02ed }
        r5 = r4.width();	 Catch:{ all -> 0x02ed }
        r5 = java.lang.Math.round(r5);	 Catch:{ all -> 0x02ed }
        r6 = r4.height();	 Catch:{ all -> 0x02ed }
        r6 = java.lang.Math.round(r6);	 Catch:{ all -> 0x02ed }
        r7 = defpackage.aml.a(r0);	 Catch:{ all -> 0x02ed }
        r9 = r2.a(r5, r6, r7);	 Catch:{ all -> 0x02ed }
        if (r9 != 0) goto L_0x02af;	 Catch:{ all -> 0x02ed }
        r9 = android.graphics.Bitmap.createBitmap(r5, r6, r7);	 Catch:{ all -> 0x02ed }
        r5 = r4.left;	 Catch:{ all -> 0x02ed }
        r5 = -r5;	 Catch:{ all -> 0x02ed }
        r4 = r4.top;	 Catch:{ all -> 0x02ed }
        r4 = -r4;	 Catch:{ all -> 0x02ed }
        r3.postTranslate(r5, r4);	 Catch:{ all -> 0x02ed }
        r4 = new android.graphics.Canvas;	 Catch:{ all -> 0x02ed }
        r4.<init>(r9);	 Catch:{ all -> 0x02ed }
        r5 = new android.graphics.Paint;	 Catch:{ all -> 0x02ed }
        r6 = 6;	 Catch:{ all -> 0x02ed }
        r5.<init>(r6);	 Catch:{ all -> 0x02ed }
        r4.drawBitmap(r0, r3, r5);	 Catch:{ all -> 0x02ed }
        r14 = r9;	 Catch:{ all -> 0x02ed }
        r3 = r0.equals(r14);	 Catch:{ all -> 0x02ed }
        if (r3 != 0) goto L_0x02d0;	 Catch:{ all -> 0x02ed }
        r2.a(r0);	 Catch:{ all -> 0x02ed }
        r2 = r17;
        goto L_0x02d6;
        r2 = r17;
        r14 = 0;
        r2.a(r1);
        r5 = r13;
        r2.a(r5);
        r10.a();
        defpackage.alz.a(r8);
        return r14;
        r5 = r13;
        r2 = r17;
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0301 }
        r0.<init>(r3);	 Catch:{ all -> 0x0301 }
        throw r0;	 Catch:{ all -> 0x0301 }
        r0 = move-exception;
        r5 = r13;
        goto L_0x02f2;
        r0 = move-exception;
        r5 = r7;
        r2 = r17;
        goto L_0x0314;
        r0 = move-exception;
        r5 = r7;
        r2 = r17;
        r1 = r18;
        goto L_0x015a;
        r10.reset();	 Catch:{ IOException -> 0x0303 }
        goto L_0x030f;
        r0 = move-exception;
        goto L_0x0314;
        r0 = move-exception;
        r7 = r0;
        r9 = 5;
        r0 = android.util.Log.isLoggable(r4, r9);	 Catch:{ all -> 0x0301 }
        if (r0 == 0) goto L_0x030f;	 Catch:{ all -> 0x0301 }
        android.util.Log.w(r4, r3, r7);	 Catch:{ all -> 0x0301 }
        throw r6;	 Catch:{ all -> 0x0301 }
        r0 = move-exception;
        r2 = r5;
        r1 = r6;
        r5 = r7;
        r2.a(r1);
        r2.a(r5);
        r10.a();
        defpackage.alz.a(r8);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alz.a(java.io.InputStream, ajr, int, int, aim):android.graphics.Bitmap");
    }
}
