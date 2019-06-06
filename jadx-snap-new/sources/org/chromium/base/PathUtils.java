package org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Environment;
import android.text.TextUtils;
import defpackage.akon;
import defpackage.akoq;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.base.annotations.CalledByNative;

public abstract class PathUtils {
    private static /* synthetic */ boolean a = (PathUtils.class.desiredAssertionStatus() ^ 1);

    static class a {
        static final String[] a = PathUtils.a();
    }

    static {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
    }

    private PathUtils() {
    }

    private static /* synthetic */ void a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
                return;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                return;
            }
        }
        autoCloseable.close();
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0075=Splitter:B:28:0x0075, B:18:0x0068=Splitter:B:18:0x0068} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0031 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    static java.lang.String[] a() {
        /*
        r0 = 0;
        r1 = r0.g;	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        r2 = 1;
        r1.set(r2);	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        r1 = r0.f;	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        r3 = 0;
        r1 = r1.cancel(r3);	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        if (r1 == 0) goto L_0x0079;
    L_0x0010:
        r1 = defpackage.akoq.a();	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        r4 = 3;
        r4 = new java.lang.String[r4];	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r5 = defpackage.akon.a;	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r6 = r5.getDir(r0, r3);	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r6 = r6.getPath();	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r4[r3] = r6;	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r6 = r4[r3];	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r8 = 21;
        if (r7 < r8) goto L_0x004b;
    L_0x002b:
        r7 = 448; // 0x1c0 float:6.28E-43 double:2.213E-321;
        android.system.Os.chmod(r6, r7);	 Catch:{ Exception -> 0x0031 }
        goto L_0x004b;
    L_0x0031:
        r7 = "PathUtils";
        r8 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r9 = "Failed to set permissions for path \"";
        r8.<init>(r9);	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r8.append(r6);	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r6 = "\"";
        r8.append(r6);	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r6 = r8.toString();	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r8 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        defpackage.akoo.c(r7, r6, r8);	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
    L_0x004b:
        r6 = "textures";
        r3 = r5.getDir(r6, r3);	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r3 = r3.getPath();	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r4[r2] = r3;	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r2 = r5.getCacheDir();	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        if (r2 == 0) goto L_0x0068;
    L_0x005d:
        r2 = 2;
        r3 = r5.getCacheDir();	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r3 = r3.getPath();	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
        r4[r2] = r3;	 Catch:{ Throwable -> 0x006f, all -> 0x006c }
    L_0x0068:
        a(r0, r1);	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        return r4;
    L_0x006c:
        r2 = move-exception;
        r3 = r0;
        goto L_0x0075;
    L_0x006f:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0071 }
    L_0x0071:
        r3 = move-exception;
        r10 = r3;
        r3 = r2;
        r2 = r10;
    L_0x0075:
        a(r3, r1);	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        throw r2;	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
    L_0x0079:
        r1 = r0.f;	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        r1 = r1.get();	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        r1 = (java.lang.String[]) r1;	 Catch:{ InterruptedException | ExecutionException -> 0x0082, InterruptedException | ExecutionException -> 0x0082 }
        return r1;
    L_0x0082:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.PathUtils.a():java.lang.String[]");
    }

    @CalledByNative
    public static String[] getAllPrivateDownloadsDirectories() {
        File[] externalFilesDirs;
        int i = 0;
        if (VERSION.SDK_INT >= 19) {
            akoq a = akoq.a();
            try {
                externalFilesDirs = akon.a.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
                a(null, a);
            } catch (Throwable th) {
                a(th, a);
            }
        } else {
            externalFilesDirs = new File[]{Environment.getExternalStorageDirectory()};
        }
        ArrayList arrayList = new ArrayList();
        while (i < externalFilesDirs.length) {
            if (!(externalFilesDirs[i] == null || TextUtils.isEmpty(externalFilesDirs[i].getAbsolutePath()))) {
                arrayList.add(externalFilesDirs[i].getAbsolutePath());
            }
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @CalledByNative
    public static String getCacheDirectory() {
        if (a) {
            return a.a[2];
        }
        throw new AssertionError("setDataDirectorySuffix must be called first.");
    }

    @CalledByNative
    public static String getDataDirectory() {
        if (a) {
            return a.a[0];
        }
        throw new AssertionError("setDataDirectorySuffix must be called first.");
    }

    /* JADX WARNING: Missing block: B:29:0x0089, code skipped:
            a(r0, r1);
     */
    @org.chromium.base.annotations.CalledByNative
    private static java.lang.String getDownloadsDirectory() {
        /*
        r0 = android.os.StrictMode.allowThreadDiskReads();
        r1 = new akoq;
        r2 = 0;
        r1.<init>(r0, r2);
        r0 = 0;
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x0087 }
        r5 = android.os.Environment.DIRECTORY_DOWNLOADS;	 Catch:{ Throwable -> 0x0087 }
        r5 = android.os.Environment.getExternalStoragePublicDirectory(r5);	 Catch:{ Throwable -> 0x0087 }
        r5 = r5.getPath();	 Catch:{ Throwable -> 0x0087 }
        r13 = "Android.StrictMode.DownloadsDir";
        r6 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Throwable -> 0x0087 }
        r6 = r6 - r3;
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ Throwable -> 0x0087 }
        r4 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ Throwable -> 0x0087 }
        if (r3 == r4) goto L_0x002b;
    L_0x0026:
        r4 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ Throwable -> 0x0087 }
        if (r3 == r4) goto L_0x002b;
    L_0x002a:
        r2 = 1;
    L_0x002b:
        r4 = org.chromium.base.metrics.RecordHistogram.b;	 Catch:{ Throwable -> 0x0087 }
        if (r4 != 0) goto L_0x003a;
    L_0x002f:
        if (r2 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x003a;
    L_0x0032:
        r2 = new java.lang.AssertionError;	 Catch:{ Throwable -> 0x0087 }
        r3 = "TimesHistogram doesn't support MICROSECOND and NANOSECONDS time units. Consider using CountHistogram instead.";
        r2.<init>(r3);	 Catch:{ Throwable -> 0x0087 }
        throw r2;	 Catch:{ Throwable -> 0x0087 }
    L_0x003a:
        r2 = r3.toMillis(r6);	 Catch:{ Throwable -> 0x0087 }
        r4 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ Throwable -> 0x0087 }
        r6 = 10;
        r6 = r4.toMillis(r6);	 Catch:{ Throwable -> 0x0087 }
        r14 = org.chromium.base.metrics.RecordHistogram.a(r13);	 Catch:{ Throwable -> 0x0087 }
        r4 = org.chromium.base.metrics.RecordHistogram.b;	 Catch:{ Throwable -> 0x0087 }
        if (r4 != 0) goto L_0x005e;
    L_0x004e:
        r4 = org.chromium.base.metrics.RecordHistogram.a(r6);	 Catch:{ Throwable -> 0x0087 }
        r8 = (long) r4;	 Catch:{ Throwable -> 0x0087 }
        r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r4 != 0) goto L_0x0058;
    L_0x0057:
        goto L_0x005e;
    L_0x0058:
        r2 = new java.lang.AssertionError;	 Catch:{ Throwable -> 0x0087 }
        r2.<init>();	 Catch:{ Throwable -> 0x0087 }
        throw r2;	 Catch:{ Throwable -> 0x0087 }
    L_0x005e:
        r9 = org.chromium.base.metrics.RecordHistogram.a(r2);	 Catch:{ Throwable -> 0x0087 }
        r2 = 1;
        r10 = org.chromium.base.metrics.RecordHistogram.a(r2);	 Catch:{ Throwable -> 0x0087 }
        r11 = org.chromium.base.metrics.RecordHistogram.a(r6);	 Catch:{ Throwable -> 0x0087 }
        r12 = 50;
        r6 = r13;
        r7 = r14;
        r2 = org.chromium.base.metrics.RecordHistogram.nativeRecordCustomTimesHistogramMilliseconds(r6, r7, r9, r10, r11, r12);	 Catch:{ Throwable -> 0x0087 }
        r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1));
        if (r4 == 0) goto L_0x0081;
    L_0x0078:
        r4 = org.chromium.base.metrics.RecordHistogram.a;	 Catch:{ Throwable -> 0x0087 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ Throwable -> 0x0087 }
        r4.put(r13, r2);	 Catch:{ Throwable -> 0x0087 }
    L_0x0081:
        a(r0, r1);
        return r5;
    L_0x0085:
        r2 = move-exception;
        goto L_0x0089;
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0085 }
    L_0x0089:
        a(r0, r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.PathUtils.getDownloadsDirectory():java.lang.String");
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    @CalledByNative
    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = akon.a.getApplicationInfo();
        return ((applicationInfo.flags & 128) != 0 || (applicationInfo.flags & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        if (a) {
            return a.a[1];
        }
        throw new AssertionError("setDataDirectorySuffix must be called first.");
    }
}
