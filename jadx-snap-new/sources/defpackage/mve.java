package defpackage;

import com.google.gson.Gson;
import defpackage.mvc.c;

/* renamed from: mve */
public final class mve implements aiqc<Gson> {
    private final ajwy<Gson> a;

    public static Gson a(Gson gson) {
        return (Gson) aiqf.a(c.a(gson), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mve.a((Gson) this.a.get());
    }
}
