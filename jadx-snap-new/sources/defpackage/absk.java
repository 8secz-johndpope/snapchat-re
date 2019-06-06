package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;

/* renamed from: absk */
public final class absk implements absa {
    private static final boolean a = (VERSION.SDK_INT >= 21);
    private final Context b;

    public absk(Context context) {
        this.b = context;
    }

    @TargetApi(21)
    public final boolean a() {
        if (a) {
            PowerManager powerManager = (PowerManager) this.b.getSystemService("power");
            if (powerManager != null) {
                return powerManager.isPowerSaveMode();
            }
        }
        return false;
    }
}
