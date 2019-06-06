package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: aby */
public final class aby {
    public final int a;
    public final int b;
    public final int c;
    private final Context d;

    /* renamed from: aby$a */
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
            if (VERSION.SDK_INT >= 26 && aby.a(this.b)) {
                this.e = MapboxConstants.MINIMUM_ZOOM;
            }
        }

        public final aby a() {
            return new aby(this);
        }
    }

    /* renamed from: aby$c */
    interface c {
        int a();

        int b();
    }

    /* renamed from: aby$b */
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

    aby(a aVar) {
        this.d = aVar.a;
        this.c = aby.a(aVar.b) ? aVar.h / 2 : aVar.h;
        ActivityManager activityManager = aVar.b;
        float f = aVar.f;
        float f2 = aVar.g;
        float memoryClass = (float) ((activityManager.getMemoryClass() << 10) << 10);
        if (aby.a(activityManager)) {
            f = f2;
        }
        int round = Math.round(memoryClass * f);
        f = (float) ((aVar.c.a() * aVar.c.b()) << 2);
        int round2 = Math.round(aVar.e * f);
        int round3 = Math.round(f * aVar.d);
        int i = round - this.c;
        int i2 = round3 + round2;
        if (i2 <= i) {
            this.b = round3;
            this.a = round2;
        } else {
            f = ((float) i) / (aVar.e + aVar.d);
            this.b = Math.round(aVar.d * f);
            this.a = Math.round(f * aVar.e);
        }
        String str = "MemorySizeCalculator";
        if (Log.isLoggable(str, 3)) {
            StringBuilder stringBuilder = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            stringBuilder.append(a(this.b));
            stringBuilder.append(", pool size: ");
            stringBuilder.append(a(this.a));
            stringBuilder.append(", byte array size: ");
            stringBuilder.append(a(this.c));
            stringBuilder.append(", memory class limited? ");
            stringBuilder.append(i2 > round);
            stringBuilder.append(", max size: ");
            stringBuilder.append(a(round));
            stringBuilder.append(", memoryClass: ");
            stringBuilder.append(aVar.b.getMemoryClass());
            stringBuilder.append(", isLowMemoryDevice: ");
            stringBuilder.append(aby.a(aVar.b));
            Log.d(str, stringBuilder.toString());
        }
    }

    private String a(int i) {
        return Formatter.formatFileSize(this.d, (long) i);
    }

    @TargetApi(19)
    static boolean a(ActivityManager activityManager) {
        return VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : true;
    }
}
