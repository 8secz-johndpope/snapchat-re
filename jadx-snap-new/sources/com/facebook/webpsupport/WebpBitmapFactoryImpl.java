package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.TypedValue;
import defpackage.aue;
import defpackage.aux;
import defpackage.avm;
import defpackage.azz;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@aue
public class WebpBitmapFactoryImpl {
    private static boolean a = (VERSION.SDK_INT >= 11);

    private static InputStream a(InputStream inputStream) {
        return !inputStream.markSupported() ? new BufferedInputStream(inputStream, 20) : inputStream;
    }

    private static void a(Bitmap bitmap, Options options) {
        if (!(bitmap == null || options == null)) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (!(i2 == 0 || i == i2 || i == options.inScreenDensity || !options.inScaled)) {
                    bitmap.setDensity(i2);
                }
            } else if (a && options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    private static byte[] a(InputStream inputStream, Options options) {
        inputStream.mark(20);
        byte[] bArr = (options == null || options.inTempStorage == null || options.inTempStorage.length < 20) ? new byte[20] : options.inTempStorage;
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    private static void b(Bitmap bitmap, Options options) {
        a(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    @aue
    private static Bitmap createBitmap(int i, int i2, Options options) {
        if (a && options != null && options.inBitmap != null && options.inBitmap.isMutable()) {
            return options.inBitmap;
        }
        aux aux = null;
        return aux.a();
    }

    @aue
    private static byte[] getInTempStorageFromOptions(Options options) {
        return (options == null || options.inTempStorage == null) ? new byte[8192] : options.inTempStorage;
    }

    @aue
    private static float getScaleFromOptions(Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f;
        }
        i = options.inDensity;
        int i2 = options.inTargetDensity;
        return (i == 0 || i2 == 0 || i == options.inScreenDensity) ? f : ((float) i2) / ((float) i);
    }

    @aue
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @aue
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, Options options) {
        azz.a();
        if (!avm.a || !avm.a(bArr, i, i2)) {
            return originalDecodeByteArray(bArr, i, i2, options);
        }
        Bitmap nativeDecodeByteArray = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        b(nativeDecodeByteArray, options);
        return nativeDecodeByteArray;
    }

    @aue
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @aue
    public static Bitmap hookDecodeFile(String str, Options options) {
        FileInputStream fileInputStream;
        Throwable th;
        Throwable th2;
        Bitmap bitmap = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                bitmap = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
            } catch (Throwable th22) {
                Throwable th3 = th22;
                th22 = th;
                th = th3;
            }
        } catch (Exception unused) {
        }
        return bitmap;
        throw th;
        if (th22 != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th22.addSuppressed(th4);
            }
        } else {
            fileInputStream.close();
        }
        throw th;
    }

    @aue
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    @aue
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options) {
        azz.a();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        Bitmap nativeDecodeStream;
        if (nativeSeek != -1) {
            InputStream a = a(new FileInputStream(fileDescriptor));
            try {
                byte[] a2 = a(a, options);
                if (avm.a && avm.a(a2, 0, 20)) {
                    nativeDecodeStream = nativeDecodeStream(a, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    setPaddingDefaultValues(rect);
                    b(nativeDecodeStream, options);
                } else {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    nativeDecodeStream = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                }
                try {
                    a.close();
                    return nativeDecodeStream;
                } catch (Throwable unused) {
                    return nativeDecodeStream;
                }
            } catch (Throwable unused2) {
            }
        } else {
            nativeDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return nativeDecodeStream;
        }
    }

    @aue
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @aue
    public static Bitmap hookDecodeResource(Resources resources, int i, Options options) {
        InputStream openRawResource;
        Throwable th;
        Throwable th2;
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            openRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } catch (Throwable th22) {
                Throwable th3 = th22;
                th22 = th;
                th = th3;
            }
        } catch (Exception unused) {
        }
        if (!a || bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
        if (openRawResource != null) {
            if (th22 != null) {
                try {
                    openRawResource.close();
                } catch (Throwable th4) {
                    th22.addSuppressed(th4);
                }
            } else {
                openRawResource.close();
            }
        }
        throw th;
        throw th;
    }

    /* JADX WARNING: Missing block: B:10:0x0019, code skipped:
            if (r2 != 65535) goto L_0x0013;
     */
    @defpackage.aue
    public static android.graphics.Bitmap hookDecodeResourceStream(android.content.res.Resources r1, android.util.TypedValue r2, java.io.InputStream r3, android.graphics.Rect r4, android.graphics.BitmapFactory.Options r5) {
        /*
        if (r5 != 0) goto L_0x0007;
    L_0x0002:
        r5 = new android.graphics.BitmapFactory$Options;
        r5.<init>();
    L_0x0007:
        r0 = r5.inDensity;
        if (r0 != 0) goto L_0x001c;
    L_0x000b:
        if (r2 == 0) goto L_0x001c;
    L_0x000d:
        r2 = r2.density;
        if (r2 != 0) goto L_0x0016;
    L_0x0011:
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
    L_0x0013:
        r5.inDensity = r2;
        goto L_0x001c;
    L_0x0016:
        r0 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r2 == r0) goto L_0x001c;
    L_0x001b:
        goto L_0x0013;
    L_0x001c:
        r2 = r5.inTargetDensity;
        if (r2 != 0) goto L_0x002a;
    L_0x0020:
        if (r1 == 0) goto L_0x002a;
    L_0x0022:
        r1 = r1.getDisplayMetrics();
        r1 = r1.densityDpi;
        r5.inTargetDensity = r1;
    L_0x002a:
        r1 = hookDecodeStream(r3, r4, r5);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResourceStream(android.content.res.Resources, android.util.TypedValue, java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @aue
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @aue
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, Options options) {
        azz.a();
        inputStream = a(inputStream);
        byte[] a = a(inputStream, options);
        if (!avm.a || !avm.a(a, 0, 20)) {
            return originalDecodeStream(inputStream, rect, options);
        }
        Bitmap nativeDecodeStream = nativeDecodeStream(inputStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        b(nativeDecodeStream, options);
        setPaddingDefaultValues(rect);
        return nativeDecodeStream;
    }

    @aue
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, Options options, float f, byte[] bArr2);

    @aue
    private static native Bitmap nativeDecodeStream(InputStream inputStream, Options options, float f, byte[] bArr);

    @aue
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @aue
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @aue
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @aue
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @aue
    private static Bitmap originalDecodeFile(String str, Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @aue
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @aue
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @aue
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @aue
    private static Bitmap originalDecodeResource(Resources resources, int i, Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @aue
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @aue
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @aue
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @aue
    private static void setBitmapSize(Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @aue
    private static boolean setOutDimensions(Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @aue
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @aue
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(Options options) {
        return (VERSION.SDK_INT < 19 || options == null) ? true : options.inPremultiplied;
    }
}
