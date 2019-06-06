package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import com.brightcove.player.event.Event;

/* renamed from: ppu */
public final class ppu implements ppm {
    private final ActivityManager a;
    private int b;
    private long c = 0;
    private long d = 0;

    public ppu(Context context) {
        this.a = (ActivityManager) context.getSystemService(Event.ACTIVITY);
    }

    private MemoryInfo f() {
        try {
            return this.a.getProcessMemoryInfo(new int[]{Process.myPid()})[0];
        } catch (Exception unused) {
            return null;
        }
    }

    private int g() {
        if (this.b == 0) {
            try {
                this.b = this.a.getLargeMemoryClass();
            } catch (Exception unused) {
                this.b = this.a.getMemoryClass();
            }
        }
        return this.b;
    }

    public final ActivityManager.MemoryInfo a() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.a.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int b() {
        return this.a.getMemoryClass();
    }

    public final long c() {
        if (this.d == 0) {
            this.d = ((long) g()) * 1048576;
        }
        return this.d;
    }

    public final long d() {
        if (this.c == 0) {
            this.c = ((long) this.a.getMemoryClass()) * 1048576;
        }
        return this.c;
    }

    public final String e() {
        StringBuilder stringBuilder = new StringBuilder();
        if (VERSION.SDK_INT >= 23) {
            stringBuilder.append(f().getMemoryStats());
        } else {
            MemoryInfo f = f();
            stringBuilder.append("{total-pss=");
            stringBuilder.append(f.getTotalPss());
            stringBuilder.append(", java-heap=");
            stringBuilder.append(f.dalvikPss);
            stringBuilder.append(", native-heap=");
            stringBuilder.append(f.nativePss);
            stringBuilder.append(", other=");
            stringBuilder.append(f.otherPss);
            stringBuilder.append("}");
        }
        Runtime runtime = Runtime.getRuntime();
        stringBuilder.append("\nruntime.free-memory=");
        stringBuilder.append(runtime.freeMemory() / 1024);
        stringBuilder.append(", runtime.total-memory=");
        stringBuilder.append(runtime.totalMemory() / 1024);
        stringBuilder.append(", runtime.max-memory=");
        stringBuilder.append(runtime.maxMemory() / 1024);
        ActivityManager.MemoryInfo a = a();
        if (a != null) {
            stringBuilder.append("\ndevice-avail=");
            stringBuilder.append(a.availMem / 1024);
        }
        return stringBuilder.toString();
    }
}
