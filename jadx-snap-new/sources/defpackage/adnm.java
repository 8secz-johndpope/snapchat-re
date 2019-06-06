package defpackage;

import android.os.Debug;
import android.os.Debug.MemoryInfo;
import org.opencv.imgproc.Imgproc;

/* renamed from: adnm */
public final class adnm {
    public static String a() {
        Debug.getMemoryInfo(new MemoryInfo());
        return String.format("TotalPss: %dmB; DalvikPss: %dmB; NativePss: %dmB; OtherPss: %dmB", new Object[]{Integer.valueOf(r0.getTotalPss() / Imgproc.INTER_TAB_SIZE2), Integer.valueOf(r0.dalvikPss / Imgproc.INTER_TAB_SIZE2), Integer.valueOf(r0.nativePss / Imgproc.INTER_TAB_SIZE2), Integer.valueOf(r0.otherPss / Imgproc.INTER_TAB_SIZE2)});
    }
}
