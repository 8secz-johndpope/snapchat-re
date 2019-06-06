package defpackage;

import defpackage.tuq.b;
import java.util.List;
import java.util.Set;

/* renamed from: tvc */
public final class tvc implements aiqc<List<tqi>> {
    private final ajwy<ttf> a;
    private final ajwy<Set<tqi>> b;
    private final ajwy<twa> c;
    private final ajwy<ftl> d;

    public static List<tqi> a(ttf ttf, Set<tqi> set, ajwy<twa> ajwy, ajwy<ftl> ajwy2) {
        return (List) aiqf.a(b.a(ttf, (Set) set, (ajwy) ajwy, (ajwy) ajwy2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return tvc.a((ttf) ajwy.get(), (Set) ajwy2.get(), this.c, this.d);
    }
}
