package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: sg */
public class sg {
    private Context a;
    private SharedPreferences b;

    public sg(Context context) {
        this.a = context;
    }

    public final SharedPreferences a() {
        SharedPreferences sharedPreferences;
        synchronized (sg.class) {
            if (this.b == null) {
                this.b = this.a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.b;
        }
        return sharedPreferences;
    }

    public final void a(boolean z) {
        a().edit().putBoolean("reschedule_needed", z).apply();
    }
}
