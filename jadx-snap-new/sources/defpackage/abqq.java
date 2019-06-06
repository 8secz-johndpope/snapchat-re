package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.math.BigDecimal;

/* renamed from: abqq */
public final class abqq {
    public static double a(long j) {
        return abqq.a(j, 3);
    }

    public static double a(long j, int i) {
        try {
            j = new BigDecimal(j).divide(new BigDecimal(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL), i, 4).doubleValue();
            return j;
        } catch (ArithmeticException unused) {
            double pow = Math.pow(10.0d, (double) i);
            double d = (double) j;
            Double.isNaN(d);
            d = (double) Math.round((d / 1000.0d) * pow);
            Double.isNaN(d);
            return d / pow;
        }
    }
}
