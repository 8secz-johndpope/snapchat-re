package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import defpackage.mvc.c;
import java.util.Collection;
import java.util.Set;

/* renamed from: mvo */
public final class mvo implements aiqc<Set<mwe>> {
    private final ajwy<Context> a;
    private final ajwy<ide> b;
    private final ajwy<zgb> c;
    private final ajwy<Gson> d;
    private final ajwy<Collection<? extends akca<? super Context, ? super zfw, ? super Gson, ? extends mwe>>> e;

    public static Set<mwe> a(Context context, ide ide, zgb zgb, Gson gson, Collection<? extends akca<? super Context, ? super zfw, ? super Gson, ? extends mwe>> collection) {
        return (Set) aiqf.a(c.a(context, ide, zgb, gson, (Collection) collection), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mvo.a((Context) this.a.get(), (ide) this.b.get(), (zgb) this.c.get(), (Gson) this.d.get(), (Collection) this.e.get());
    }
}
