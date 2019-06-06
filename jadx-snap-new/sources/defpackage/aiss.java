package defpackage;

import android.content.Context;

/* renamed from: aiss */
public final class aiss implements Runnable {
    private final Context a;
    private final aiso b;

    public aiss(Context context, aiso aiso) {
        this.a = context;
        this.b = aiso;
    }

    public final void run() {
        try {
            airf.a(this.a, "Performing time based file roll over.");
            if (!this.b.c()) {
                this.b.d();
            }
        } catch (Exception unused) {
            airf.b(this.a, "Failed to roll over file");
        }
    }
}
