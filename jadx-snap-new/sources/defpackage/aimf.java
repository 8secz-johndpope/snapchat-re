package defpackage;

import android.annotation.SuppressLint;
import android.util.Log;
import com.snapcv.BuildConfig;

/* renamed from: aimf */
public final class aimf {
    private static volatile Boolean a;

    private aimf() {
        throw new AssertionError("No instances.");
    }

    public static boolean a() {
        Boolean bool = a;
        if (bool == null) {
            synchronized (aimf.class) {
                bool = a;
                if (bool == null) {
                    bool = Boolean.valueOf(aimf.b());
                    a = bool;
                }
            }
        }
        return bool.booleanValue();
    }

    @SuppressLint({"CatchThrowable"})
    private static boolean b() {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("libpng");
            System.loadLibrary("libjpeg");
            System.loadLibrary("opencv");
            System.loadLibrary("protobuf");
            System.loadLibrary("catalyst");
            System.loadLibrary("dnn");
            System.loadLibrary("fastdnn");
            System.loadLibrary("3dstickers");
            System.loadLibrary("objectdetection.1.0.506a50e71227.3867");
            System.loadLibrary("segmentation.1.0.506a50e71227.3867");
            System.loadLibrary(BuildConfig.LIB_SNAPCV_NAME);
            return true;
        } catch (SecurityException | UnsatisfiedLinkError e) {
            StringBuilder stringBuilder = new StringBuilder("Failed to load native libraries: ");
            stringBuilder.append(e.getMessage());
            Log.e("NativeLibraryLoader", stringBuilder.toString(), e);
            return false;
        }
    }
}
