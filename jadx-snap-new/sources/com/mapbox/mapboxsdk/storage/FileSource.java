package com.mapbox.mapboxsdk.storage;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import com.mapbox.mapboxsdk.Mapbox;
import defpackage.alsj;

public class FileSource {
    private static FileSource INSTANCE;
    private long nativePtr;

    public interface ResourceTransformCallback {
        String onURL(int i, String str);
    }

    private FileSource(String str, AssetManager assetManager) {
        initialize(Mapbox.getAccessToken(), str, assetManager);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    public static java.lang.String getCachePath(android.content.Context r5) {
        /*
        r0 = 1;
        r1 = 0;
        r2 = r5.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0021, Exception -> 0x0019 }
        r3 = r5.getPackageName();	 Catch:{ NameNotFoundException -> 0x0021, Exception -> 0x0019 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r2 = r2.getApplicationInfo(r3, r4);	 Catch:{ NameNotFoundException -> 0x0021, Exception -> 0x0019 }
        r2 = r2.metaData;	 Catch:{ NameNotFoundException -> 0x0021, Exception -> 0x0019 }
        r3 = "com.mapbox.SetStorageExternal";
        r2 = r2.getBoolean(r3, r1);	 Catch:{ NameNotFoundException -> 0x0021, Exception -> 0x0019 }
        goto L_0x002c;
    L_0x0019:
        r2 = move-exception;
        r3 = new java.lang.Object[r0];
        r3[r1] = r2;
        r2 = "Failed to read the storage key: ";
        goto L_0x0028;
    L_0x0021:
        r2 = move-exception;
        r3 = new java.lang.Object[r0];
        r3[r1] = r2;
        r2 = "Failed to read the package metadata: ";
    L_0x0028:
        defpackage.alsj.d(r2, r3);
        r2 = 0;
    L_0x002c:
        r3 = 0;
        if (r2 == 0) goto L_0x0048;
    L_0x002f:
        r2 = isExternalStorageReadable();
        if (r2 == 0) goto L_0x0048;
    L_0x0035:
        r2 = r5.getExternalFilesDir(r3);	 Catch:{ NullPointerException -> 0x003e }
        r3 = r2.getAbsolutePath();	 Catch:{ NullPointerException -> 0x003e }
        goto L_0x0048;
    L_0x003e:
        r2 = move-exception;
        r0 = new java.lang.Object[r0];
        r0[r1] = r2;
        r1 = "Failed to obtain the external storage path: ";
        defpackage.alsj.d(r1, r0);
    L_0x0048:
        if (r3 != 0) goto L_0x0052;
    L_0x004a:
        r5 = r5.getFilesDir();
        r3 = r5.getAbsolutePath();
    L_0x0052:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.storage.FileSource.getCachePath(android.content.Context):java.lang.String");
    }

    public static synchronized FileSource getInstance(Context context) {
        FileSource fileSource;
        synchronized (FileSource.class) {
            if (INSTANCE == null) {
                INSTANCE = new FileSource(getCachePath(context), context.getResources().getAssets());
            }
            fileSource = INSTANCE;
        }
        return fileSource;
    }

    public static synchronized FileSource getInstance(String str, Context context) {
        FileSource fileSource;
        synchronized (FileSource.class) {
            if (INSTANCE == null) {
                INSTANCE = new FileSource(str, context.getResources().getAssets());
            }
            fileSource = INSTANCE;
        }
        return fileSource;
    }

    private native void initialize(String str, String str2, AssetManager assetManager);

    public static boolean isExternalStorageReadable() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return true;
        }
        alsj.c("External storage was requested but it isn't readable. For API level < 18 make sure you've requested READ_EXTERNAL_STORAGE or WRITE_EXTERNAL_STORAGE permissions in your app Manifest (defaulting to internal storage).", new Object[0]);
        return false;
    }

    public native void finalize();

    public native String getAccessToken();

    public native void setAccessToken(String str);

    public native void setApiBaseUrl(String str);

    public native void setResourceTransform(ResourceTransformCallback resourceTransformCallback);
}
