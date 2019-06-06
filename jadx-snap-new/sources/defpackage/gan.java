package defpackage;

import com.google.common.base.Optional;
import defpackage.rwz.a;
import defpackage.rxa.b;

/* renamed from: gan */
public final class gan implements aiqc<a> {
    private final ajwy<rxl> a;
    private final ajwy<ihh> b;
    private final ajwy<Optional<ajwy<rym>>> c;
    private final ajwy<rzr> d;

    public static a a(ajwy<rxl> ajwy, ajwy<ihh> ajwy2, Optional<ajwy<rym>> optional, ajwy<rzr> ajwy3) {
        return (a) aiqf.a(new rwt(ajwy, ajwy2, optional, ajwy3, b.UPLOAD), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        ajwy ajwy3 = this.c;
        return gan.a(ajwy, ajwy2, (Optional) ajwy3.get(), this.d);
    }
}
