package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;

/* renamed from: abpi */
public final class abpi implements abph {
    public ActivityManager a;
    private int b;

    public final MemoryInfo a() {
        try {
            MemoryInfo memoryInfo = new MemoryInfo();
            this.a.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int b() {
        ActivityManager activityManager = this.a;
        if (activityManager != null && this.b == 0) {
            try {
                this.b = activityManager.getLargeMemoryClass();
            } catch (Exception unused) {
                this.b = this.a.getMemoryClass();
            }
        }
        return this.b;
    }
}
