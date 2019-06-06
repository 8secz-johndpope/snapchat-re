package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.mvc.c;
import java.io.File;

/* renamed from: mvf */
public final class mvf implements aiqc<Supplier<File>> {
    private final ajwy<Context> a;

    public static Supplier<File> a(Context context) {
        return (Supplier) aiqf.a(c.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return mvf.a((Context) this.a.get());
    }
}
