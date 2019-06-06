package defpackage;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: airr */
public final class airr {
    private final String a;
    private final String b;
    private final boolean c;
    private long d;
    private long e;

    public airr(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = Log.isLoggable(str2, 2) ^ 1;
    }

    public final synchronized void a() {
        if (!this.c) {
            this.d = SystemClock.elapsedRealtime();
            this.e = 0;
        }
    }

    public final synchronized void b() {
        if (!this.c) {
            if (this.e == 0) {
                this.e = SystemClock.elapsedRealtime() - this.d;
                String str = this.b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.a);
                stringBuilder.append(": ");
                stringBuilder.append(this.e);
                stringBuilder.append("ms");
                Log.v(str, stringBuilder.toString());
            }
        }
    }
}
