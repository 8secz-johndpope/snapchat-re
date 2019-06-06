package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: adby */
public final class adby {

    /* renamed from: adby$a */
    public static class a {
        public final double a;
        public final cgj b;

        a(double d, cgj cgj) {
            this.a = d;
            this.b = cgj;
        }
    }

    private static int a(int i, int i2, int i3, float f, float f2) {
        float f3 = (float) i2;
        float f4 = (float) i;
        return (int) (((((adam.a(f) * acwb.a(i3)) * f4) / f3) * f3) + (((f2 * f3) / f4) * f3));
    }

    public static int a(View view, alhm alhm, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        int length = (alhm == null || alhm.e == null) ? 0 : alhm.e.length;
        return adby.a(width, height, length, f, (float) MapboxConstants.MINIMUM_ZOOM);
    }

    public static int a(View view, alhm alhm, float f, float f2) {
        int width = view.getWidth();
        int height = view.getHeight();
        int length = (alhm == null || alhm.e == null) ? 0 : alhm.e.length;
        return adby.a(width, height, length, f * 1.5f, f2 * 0.09f);
    }

    public static a a(List<alhq> list, Rect rect, acmj acmj, double d, double d2) {
        List arrayList = new ArrayList(list);
        cgj cgj = null;
        double d3 = 0.0d;
        while (arrayList.size() > 1) {
            cgj = adbu.a(arrayList);
            acmg b = acmj.b(cgj, rect);
            if (b != null) {
                d3 = b.d;
            }
            arrayList.remove(arrayList.size() - 1);
            if (d3 >= d) {
                break;
            }
        }
        return ((arrayList.size() == 1 || d3 < d) && cgj == null) ? new a(d, null) : d3 > d2 ? new a(d2, null) : new a(0.0d, cgj);
    }

    private static cgj a(List<cgi> list) {
        double d;
        double longitude;
        List<cgi> list2 = list;
        Collections.sort(list2, -$$Lambda$adby$oHMjjNyRI5VRA-crDvPg3eiWsE8.INSTANCE);
        int i = 0;
        double latitude = ((cgi) list2.get(0)).getLatitude();
        double longitude2 = ((cgi) list2.get(0)).getLongitude();
        cgi cgi = (cgi) list2.get(0);
        double d2 = 0.0d;
        double d3 = latitude;
        double d4 = longitude2;
        for (cgi cgi2 : list) {
            double d5 = latitude;
            d3 = Math.max(d3, cgi2.getLatitude());
            d = longitude2;
            latitude = Math.min(d5, cgi2.getLatitude());
            longitude2 = cgi2.getLongitude() - cgi.getLongitude();
            if (longitude2 > d2) {
                d2 = cgi.getLongitude();
                double d6 = longitude2;
                longitude2 = cgi2.getLongitude();
                d4 = d2;
                d2 = d6;
            } else {
                longitude2 = d;
            }
            cgi = cgi2;
            i = 0;
        }
        d = longitude2;
        double d7 = latitude;
        if (((cgi) list2.get(i)).getLongitude() - (((cgi) list2.get(list.size() - 1)).getLongitude() - 360.0d) > d2) {
            longitude = ((cgi) list2.get(0)).getLongitude();
            d4 = ((cgi) list2.get(list.size() - 1)).getLongitude();
        } else {
            longitude = d;
        }
        if (longitude > d4) {
            longitude -= 360.0d;
        }
        return new cgm(d3, d4, d7, longitude);
    }

    public static cgj a(nbo nbo, List<alhq> list) {
        ArrayList arrayList = new ArrayList();
        for (alhq alhq : list) {
            alhm b = nbo.b(alhq.a);
            arrayList.add(b != null ? cgo.a((double) b.c, (double) b.d) : cgo.a((double) alhq.b, (double) alhq.c));
        }
        return adby.a(arrayList);
    }
}
