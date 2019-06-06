package defpackage;

import com.google.common.base.Optional;
import defpackage.akgx.a;
import java.util.Set;

/* renamed from: fze */
public final class fze implements aiqc<a> {
    private final ajwy<Optional<a>> a;
    private final ajwy<ryw<ryz>> b;
    private final ajwy<Set<glu>> c;
    private final ajwy<zgb> d;

    public static a a(Optional<a> optional, aipn<ryw<ryz>> aipn, Set<glu> set) {
        return (a) aiqf.a(fzb.a(optional, aipn, set), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        ajwy ajwy4 = this.d;
        Optional optional = (Optional) ajwy.get();
        aipn b = aiqb.b(ajwy2);
        Set set = (Set) ajwy3.get();
        ajwy4.get();
        return fze.a(optional, b, set);
    }
}
