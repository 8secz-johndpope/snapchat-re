package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.ldf.a;

/* renamed from: ldg */
public final class ldg implements aiqc<Supplier<String>> {
    private final ajwy<Uri> a;

    public static Supplier<String> a(ajwy<Uri> ajwy) {
        akcr.b(ajwy, "baseUrlProvider");
        return (Supplier) aiqf.a(Suppliers.memoize(new a(ajwy)), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ldg.a(this.a);
    }
}
