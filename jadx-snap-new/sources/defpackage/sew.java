package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;

/* renamed from: sew */
public final class sew implements sel {
    private final Context a;

    public sew(Context context) {
        akcr.b(context, "context");
        this.a = context;
    }

    public final void a() {
        int i = (!akcr.a(Build.MANUFACTURER, (Object) "samsung") || VERSION.SDK_INT < 28) ? 0 : -1;
        akgi.a(this.a, i);
    }

    public final boolean a(int i) {
        return akgi.a(this.a, i);
    }
}
