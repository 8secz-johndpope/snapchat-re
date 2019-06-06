package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: jzv */
public final class jzv {
    public final int a;
    public final int b;
    private final Context c;
    private final int d;

    /* renamed from: jzv$c */
    interface c {
        int a();

        int b();
    }

    /* renamed from: jzv$a */
    public static final class a {
        private static int i = (VERSION.SDK_INT < 26 ? 4 : 1);
        final Context a;
        ActivityManager b;
        c c;
        float d = 2.0f;
        float e = ((float) i);
        float f = 0.4f;
        float g = 0.33f;
        int h = 4194304;

        public a(Context context) {
            this.a = context;
            this.b = (ActivityManager) context.getSystemService(Event.ACTIVITY);
            this.c = new b(context.getResources().getDisplayMetrics());
            if (VERSION.SDK_INT >= 26 && jzv.a(this.b)) {
                this.e = MapboxConstants.MINIMUM_ZOOM;
            }
        }
    }

    /* renamed from: jzv$b */
    static final class b implements c {
        private final DisplayMetrics a;

        b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        public final int a() {
            return this.a.widthPixels;
        }

        public final int b() {
            return this.a.heightPixels;
        }
    }

    public jzv(a aVar) {
        this.c = aVar.a;
        this.d = jzv.a(aVar.b) ? aVar.h / 2 : aVar.h;
        ActivityManager activityManager = aVar.b;
        float f = aVar.f;
        float f2 = aVar.g;
        float memoryClass = (float) ((activityManager.getMemoryClass() << 10) << 10);
        if (jzv.a(activityManager)) {
            f = f2;
        }
        int round = Math.round(memoryClass * f);
        f = (float) ((aVar.c.a() * aVar.c.b()) << 2);
        int round2 = Math.round(aVar.e * f);
        int round3 = Math.round(f * aVar.d);
        round -= this.d;
        if (round3 + round2 <= round) {
            this.b = round3;
            this.a = round2;
            return;
        }
        float f3 = ((float) round) / (aVar.e + aVar.d);
        this.b = Math.round(aVar.d * f3);
        this.a = Math.round(f3 * aVar.e);
    }

    @TargetApi(19)
    static boolean a(ActivityManager activityManager) {
        return VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : true;
    }
}
