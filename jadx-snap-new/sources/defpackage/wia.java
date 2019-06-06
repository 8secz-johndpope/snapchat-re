package defpackage;

import defpackage.abnf.a;
import java.security.SecureRandom;

/* renamed from: wia */
public final class wia implements aiqc<SecureRandom> {
    static {
        wia wia = new wia();
    }

    public static SecureRandom a() {
        return (SecureRandom) aiqf.a(a.a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return wia.a();
    }
}
