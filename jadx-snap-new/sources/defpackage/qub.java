package defpackage;

import defpackage.qtz.a.a;
import java.util.concurrent.Callable;

/* renamed from: qub */
public final class qub implements aiqc<ajdx<hwm<?, ?>>> {
    private final ajwy<ren> a;

    public static ajdx<hwm<?, ?>> a(aipn<ren> aipn) {
        akcr.b(aipn, "sendMessageParcelProcessorLazy");
        Object a = ajdx.c((Callable) new qua(new a(aipn))).a();
        akcr.a(a, "Single.fromCallable<Dura…ocessorLazy::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return qub.a(aiqb.b(this.a));
    }
}
