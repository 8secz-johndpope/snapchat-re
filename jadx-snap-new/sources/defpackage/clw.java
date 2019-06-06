package defpackage;

import android.webkit.CookieManager;

/* renamed from: clw */
public final class clw implements aiqc<CookieManager> {
    static {
        clw clw = new clw();
    }

    public static CookieManager a() {
        Object instance = CookieManager.getInstance();
        akcr.a(instance, "CookieManager.getInstance()");
        return (CookieManager) aiqf.a(instance, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return clw.a();
    }
}
