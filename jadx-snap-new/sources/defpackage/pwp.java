package defpackage;

import defpackage.pwl.b.a;
import java.util.concurrent.Callable;

/* renamed from: pwp */
public final class pwp implements aiqc<ajdx<hwm<?, ?>>> {
    private final ajwy<rej> a;

    public static ajdx<hwm<?, ?>> a(aipn<rej> aipn) {
        akcr.b(aipn, "sendConversationMessageJobProcessor");
        Object a = ajdx.c((Callable) new pwm(new a(aipn))).a();
        akcr.a(a, "Single.fromCallable<Dura…obProcessor::get).cache()");
        return (ajdx) aiqf.a(a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return pwp.a(aiqb.b(this.a));
    }
}
