package defpackage;

import android.content.Context;
import java.util.Map;

/* renamed from: pwo */
public final class pwo implements aiqc<pqt> {
    private final ajwy<Context> a;
    private final ajwy<zgb> b;
    private final ajwy<adqp> c;
    private final ajwy<Map<Class<?>, ajdx<prr>>> d;
    private final ajwy<gpb> e;

    public static pqt a(ajwy<Context> ajwy, zgb zgb, ajwy<adqp> ajwy2, ajwy<Map<Class<?>, ajdx<prr>>> ajwy3, ajwy<gpb> ajwy4) {
        akcr.b(ajwy, "context");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy2, "userMessagingGatewayService");
        akcr.b(ajwy3, "messageReceiverMap");
        akcr.b(ajwy4, "userAuthStore");
        return (pqt) aiqf.a(new qew(ajwy, zgb.a(pql.j.callsite("sessionController")), ajwy2, ajwy3, ajwy4), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ajwy ajwy = this.a;
        ajwy ajwy2 = this.b;
        return pwo.a(ajwy, (zgb) ajwy2.get(), this.c, this.d, this.e);
    }
}
