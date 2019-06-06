package defpackage;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.brightcove.player.event.Event;

/* renamed from: akh */
public final class akh {
    public final int a;
    public final int b;
    private final Context c;

    /* renamed from: akh$b */
    interface b {
        int a();

        int b();
    }

    /* renamed from: akh$a */
    static class a implements b {
        private final DisplayMetrics a;

        public a(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }

        public final int a() {
            return this.a.widthPixels;
        }

        public final int b() {
            return this.a.heightPixels;
        }
    }

    public akh(Context context) {
        this(context, (ActivityManager) context.getSystemService(Event.ACTIVITY), new a(context.getResources().getDisplayMetrics()));
    }

    private akh(Context context, ActivityManager activityManager, b bVar) {
        this.c = context;
        int round = Math.round(((float) ((activityManager.getMemoryClass() << 10) << 10)) * (akh.a(activityManager) ? 0.33f : 0.4f));
        int a = (bVar.a() * bVar.b()) << 2;
        int i = a << 2;
        boolean z = true;
        a <<= 1;
        int i2 = a + i;
        if (i2 <= round) {
            this.b = a;
            this.a = i;
        } else {
            a = Math.round(((float) round) / 6.0f);
            this.b = a << 1;
            this.a = a << 2;
        }
        String str = "MemorySizeCalculator";
        if (Log.isLoggable(str, 3)) {
            StringBuilder stringBuilder = new StringBuilder("Calculated memory cache size: ");
            stringBuilder.append(a(this.b));
            stringBuilder.append(" pool size: ");
            stringBuilder.append(a(this.a));
            stringBuilder.append(" memory class limited? ");
            if (i2 <= round) {
                z = false;
            }
            stringBuilder.append(z);
            stringBuilder.append(" max size: ");
            stringBuilder.append(a(round));
            stringBuilder.append(" memoryClass: ");
            stringBuilder.append(activityManager.getMemoryClass());
            stringBuilder.append(" isLowMemoryDevice: ");
            stringBuilder.append(akh.a(activityManager));
            Log.d(str, stringBuilder.toString());
        }
    }

    private String a(int i) {
        return Formatter.formatFileSize(this.c, (long) i);
    }

    @TargetApi(19)
    private static boolean a(ActivityManager activityManager) {
        return VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : false;
    }
}
