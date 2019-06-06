package defpackage;

import android.content.Context;

/* renamed from: kto */
public final class kto implements aiqc<mwy> {
    private final ajwy<Context> a;
    private final ajwy<achb<zjm, zjk>> b;
    private final ajwy<zgb> c;

    public static mwy a(Context context, achb<zjm, zjk> achb, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(achb, "navigationHost");
        akcr.b(zgb, "schedulersProvider");
        return (mwy) aiqf.a(new lkg(context, achb, zgb.a(kus.b.callsite("DefaultModalDialogLauncher")), kus.b), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return kto.a((Context) this.a.get(), (achb) this.b.get(), (zgb) this.c.get());
    }
}
