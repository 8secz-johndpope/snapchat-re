package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import org.opencv.imgproc.Imgproc;

/* renamed from: atb */
final class atb implements atm {
    private final int a = Imgproc.INTER_TAB_SIZE2;

    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= Imgproc.INTER_TAB_SIZE2) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[Imgproc.INTER_TAB_SIZE2];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, RasterSource.DEFAULT_TILE_SIZE);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - RasterSource.DEFAULT_TILE_SIZE, stackTraceElementArr2, RasterSource.DEFAULT_TILE_SIZE, RasterSource.DEFAULT_TILE_SIZE);
        return stackTraceElementArr2;
    }
}
