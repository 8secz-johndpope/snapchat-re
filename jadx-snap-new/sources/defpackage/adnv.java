package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build.VERSION;
import com.brightcove.player.event.Event;
import com.google.common.base.Preconditions;
import defpackage.adnu.a;

/* renamed from: adnv */
public final class adnv {
    private final Context a;
    private final adoe b;

    public adnv(Context context) {
        this(context, null);
    }

    public adnv(Context context, adoe adoe) {
        this.a = (Context) Preconditions.checkNotNull(context);
        this.b = adoe;
    }

    private static boolean a() {
        return !VERSION.RELEASE.equals("4.4.2");
    }

    public final adnu a(adob adob) {
        try {
            int a = adob.a();
            int b = adob.b();
            int i = 0;
            int i2 = 0;
            for (Integer intValue : adob.h()) {
                int intValue2 = intValue.intValue();
                i = intValue2 - i;
                if (i > i2) {
                    i2 = i;
                }
                i = intValue2;
            }
            int f = adob.f() - i;
            int i3 = f > i2 ? f : i2;
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService(Event.ACTIVITY);
            MemoryInfo memoryInfo = new MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long min = Math.min(memoryInfo.availMem, 104857600);
            long j = (long) i3;
            if (((((long) a) * ((long) b)) << 2) * j < min) {
                return new adnu(adnv.a(), true, i3, a, b);
            }
            min = (min / j) / 4;
            double d = (double) a;
            double d2 = (double) b;
            Double.isNaN(d);
            Double.isNaN(d2);
            d /= d2;
            double d3 = (double) min;
            Double.isNaN(d3);
            int sqrt = (int) Math.sqrt(d3 * d);
            d2 = (double) sqrt;
            Double.isNaN(d2);
            int i4 = (sqrt / 2) << 1;
            int i5 = (((int) (d2 / d)) / 2) << 1;
            if (i4 >= 400) {
                if (i5 >= 400) {
                    return new adnu(adnv.a(), false, i3, i4, i5);
                }
            }
            return new adnu(a.INSUFFICIENT_MEMORY);
        } catch (adke unused) {
            return new adnu(a.INVALID_MEDIA);
        }
    }

    public final adnu a(String str, adno adno) {
        adob adob = null;
        try {
            adob = ((adoe) Preconditions.checkNotNull(this.b)).b(str, adno);
            adnu a = a(adob);
            return a;
        } finally {
            if (adob != null) {
                adob.l();
            }
        }
    }
}
