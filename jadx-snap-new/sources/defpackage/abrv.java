package defpackage;

import android.content.Context;

/* renamed from: abrv */
final class abrv implements abru {
    private abru a;

    abrv(Context context, String str) {
        this.a = "huawei".equalsIgnoreCase(str) ? new abrt(context) : new abrs(context);
    }

    public final boolean a() {
        return this.a.a();
    }

    public final boolean b() {
        return this.a.b();
    }
}
