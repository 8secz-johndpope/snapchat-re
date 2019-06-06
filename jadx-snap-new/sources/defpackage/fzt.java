package defpackage;

import com.google.common.collect.Lists;
import java.util.concurrent.Executor;

/* renamed from: fzt */
public final class fzt implements aiqc<gjw> {
    private final ajwy<gjy> a;
    private final ajwy<akxe> b;
    private final ajwy<Executor> c;

    public static gjw a(gjy gjy, aipn<akxe> aipn, Executor executor) {
        return (gjw) aiqf.a(new gjw(Lists.newArrayList(gjy), aipn, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return fzt.a((gjy) this.a.get(), aiqb.b(this.b), (Executor) this.c.get());
    }
}
