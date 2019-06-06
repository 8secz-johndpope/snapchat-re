package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import com.snapchat.android.R;
import java.util.Locale;

/* renamed from: adbj */
public final class adbj {
    public static String a(Resources resources, float f) {
        int round;
        int i;
        if (TextUtils.equals(Locale.getDefault().getCountry(), Locale.US.getCountry())) {
            double d = (double) f;
            Double.isNaN(d);
            round = (int) Math.round(d / 0.305d);
            if (round > 5280) {
                round /= 5280;
                i = R.string.nyc_distance_unit_short_mile;
            } else {
                i = R.string.nyc_distance_unit_short_ft;
            }
        } else {
            round = Math.round(f);
            if (round > MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL) {
                round /= MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
                i = R.string.nyc_distance_unit_short_km;
            } else {
                i = R.string.nyc_distance_unit_short_m;
            }
        }
        String string = resources.getString(i);
        double d2 = (double) round;
        double pow = Math.pow(10.0d, Math.floor(Math.log10(d2)));
        Double.isNaN(d2);
        return resources.getString(R.string.nyc_accuracy_ring_snippet, new Object[]{Integer.valueOf((int) (Math.ceil(d2 / pow) * pow)), string});
    }
}
