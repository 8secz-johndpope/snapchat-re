package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: se */
public class se {
    private final Context a;
    private SharedPreferences b;
    private boolean c;

    public se(Context context) {
        this.a = context;
    }

    private int a(String str) {
        int i = 0;
        int i2 = this.b.getInt(str, 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        a(str, i);
        return i2;
    }

    private void a(String str, int i) {
        this.b.edit().putInt(str, i).apply();
    }

    private void b() {
        if (!this.c) {
            this.b = this.a.getSharedPreferences("androidx.work.util.id", 0);
            this.c = true;
        }
    }

    public final int a() {
        int a;
        synchronized (se.class) {
            b();
            a = a("next_alarm_manager_id");
        }
        return a;
    }

    public final int a(int i, int i2) {
        int a;
        synchronized (se.class) {
            b();
            a = a("next_job_scheduler_id");
            if (a < 0 || a > i2) {
                a = 0;
                a("next_job_scheduler_id", 1);
            }
        }
        return a;
    }
}
