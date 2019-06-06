package defpackage;

import android.content.Context;
import android.provider.Settings.System;

/* renamed from: abrt */
final class abrt implements abru {
    private final Context a;

    abrt(Context context) {
        this.a = context.getApplicationContext();
    }

    public final boolean a() {
        return System.getInt(this.a.getContentResolver(), "hide_virtual_key", 0) != 0;
    }

    public final boolean b() {
        return true;
    }
}
