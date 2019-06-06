package defpackage;

import java.util.concurrent.Callable;

/* renamed from: zqr */
public final class zqr {

    /* renamed from: zqr$a */
    static final class a extends akcq implements akbk<zrq> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (zrq) ((ajwy) this.receiver).get();
        }
    }

    public static ajdx<zrs> a(ajwy<zrq> ajwy) {
        akcr.b(ajwy, "defaultLocProviderLazy");
        Object c = ajdx.c((Callable) new zqs(new a(ajwy)));
        akcr.a(c, "Single.fromCallable(defaultLocProviderLazy::get)");
        return c;
    }
}
