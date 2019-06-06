package defpackage;

import com.google.common.base.Supplier;
import defpackage.mvc.c;
import java.io.File;

/* renamed from: mvg */
public final class mvg implements aiqc<mvr> {
    private final ajwy<Supplier<File>> a;

    public static mvr a(Supplier<File> supplier) {
        return (mvr) aiqf.a(c.a((Supplier) supplier), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mvg.a((Supplier) this.a.get());
    }
}
