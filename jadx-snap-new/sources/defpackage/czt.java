package defpackage;

import android.os.Build.VERSION;

/* renamed from: czt */
public final class czt implements aiqc<dah> {
    private final ajwy<dai> a;
    private final ajwy<daj> b;

    public static dah a(ajwy<dai> ajwy, ajwy<daj> ajwy2) {
        return (dah) aiqf.a((dah) (VERSION.SDK_INT >= 28 ? ajwy.get() : ajwy2.get()), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return czt.a(this.a, this.b);
    }
}
