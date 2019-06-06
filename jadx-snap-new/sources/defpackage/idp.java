package defpackage;

import android.view.Choreographer;

/* renamed from: idp */
public final class idp implements aiqc<Choreographer> {
    public static Choreographer a() {
        return (Choreographer) aiqf.a(Choreographer.getInstance(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return idp.a();
    }
}
