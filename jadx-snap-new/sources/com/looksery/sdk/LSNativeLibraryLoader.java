package com.looksery.sdk;

import android.content.Context;
import android.util.Log;
import com.snapcv.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class LSNativeLibraryLoader {
    private static final String TAG = "LSNativeLibraryLoader";
    private static volatile String sLastLoadErrorMessage = "";
    private static final List<String> sLibraries;
    private static volatile Boolean sNativeLibLoadedSuccessfully;

    static {
        ArrayList arrayList = new ArrayList();
        sLibraries = arrayList;
        arrayList.add("c++_shared");
        sLibraries.add("libpng");
        sLibraries.add("libjpeg");
        sLibraries.add("opencv");
        sLibraries.add("snapscan");
        sLibraries.add("protobuf");
        sLibraries.add("catalyst");
        sLibraries.add("dnn");
        sLibraries.add("fastdnn");
        sLibraries.add("3dstickers");
        sLibraries.add("objectdetection.1.0.506a50e71227.3867");
        sLibraries.add("segmentation.1.0.506a50e71227.3867");
        sLibraries.add(BuildConfig.LIB_SNAPCV_NAME);
        sLibraries.add(com.snapchat.labscv.BuildConfig.LIB_LABSCV_NAME);
        sLibraries.add(BuildConfig.LIB_LOOKSERY_NAME);
    }

    private LSNativeLibraryLoader() {
        throw new AssertionError("No instances.");
    }

    public static boolean checkIfLoadedOrTryToLoad() {
        Boolean bool = sNativeLibLoadedSuccessfully;
        if (bool == null) {
            synchronized (LSNativeLibraryLoader.class) {
                bool = sNativeLibLoadedSuccessfully;
                if (bool == null) {
                    bool = Boolean.valueOf(loadNative());
                    sNativeLibLoadedSuccessfully = bool;
                }
            }
        }
        return bool.booleanValue();
    }

    public static void ensureAllAreLoaded() {
        if (!checkIfLoadedOrTryToLoad()) {
            StringBuilder stringBuilder = new StringBuilder("Native libraries aren't loaded: ");
            stringBuilder.append(sLastLoadErrorMessage);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public static String getLastLoadError() {
        return sLastLoadErrorMessage;
    }

    private static boolean loadNative() {
        try {
            for (String loadLibrary : sLibraries) {
                System.loadLibrary(loadLibrary);
            }
            return true;
        } catch (Throwable th) {
            Log.e(TAG, "loadNative failed", th);
            sLastLoadErrorMessage = th.getMessage();
            return false;
        }
    }

    public static String[] resolveLibrariesPathnames(Context context) {
        File file = new File(context.getApplicationInfo().nativeLibraryDir);
        List list = sLibraries;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = new File(file, System.mapLibraryName(strArr[i])).getAbsolutePath();
        }
        return strArr;
    }
}
