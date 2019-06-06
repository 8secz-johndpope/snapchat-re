package defpackage;

import android.content.Context;
import defpackage.tvy.a;
import java.util.Set;

/* renamed from: ktm */
public final class ktm implements aiqc<a> {
    private final ajwy<Context> a;
    private final ajwy<lfu.a> b;
    private final ajwy<zgb> c;
    private final ajwy<lnr> d;
    private final ajwy<Set<akbl<mmt, mph>>> e;
    private final ajwy<iha> f;
    private final ajwy<kpc> g;

    public static a a(Context context, lfu.a aVar, zgb zgb, lnr lnr, Set<akbl<mmt, mph>> set, ajwy<iha> ajwy, ajwy<kpc> ajwy2) {
        return (a) aiqf.a(ksw.a(context, aVar, zgb, lnr, (Set) set, (ajwy) ajwy, (ajwy) ajwy2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        ajwy ajwy5 = this.e;
        return ktm.a((Context) ajwy.get(), (lfu.a) ajwy2.get(), (zgb) ajwy3.get(), (lnr) ajwy4.get(), (Set) ajwy5.get(), this.f, this.g);
    }
}
