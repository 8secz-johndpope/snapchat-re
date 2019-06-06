package defpackage;

import java.util.concurrent.Callable;

/* renamed from: sfq */
public final class sfq implements seo {
    private final ajdx<Boolean> a = a(sft.NOTIFICATION_VIBRATION);
    private final ajdx<Boolean> b = a(sft.NOTIFICATION_WAKE_SCREEN);
    private final ajdx<Boolean> c = a(sft.NOTIFICATION_SOUND);
    private final ajdx<Boolean> d = a(sft.NOTIFICATION_RINGING);
    private final ajdx<Boolean> e = a(sft.NOTIFICATION_LED);
    private final ajdx<Boolean> f = a(sft.NOTIFICATIONS_ENABLE);
    private final ajdx<sep> g;
    private final ftl h;

    /* renamed from: sfq$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ sfq a;

        a(sfq sfq) {
            this.a = sfq;
        }

        public final /* synthetic */ Object call() {
            return new sep(this.a.h.a((fth) sft.NOTIFICATION_VIBRATION), this.a.h.a((fth) sft.NOTIFICATION_WAKE_SCREEN), this.a.h.a((fth) sft.NOTIFICATION_SOUND), this.a.h.a((fth) sft.NOTIFICATION_RINGING), this.a.h.a((fth) sft.NOTIFICATION_LED), this.a.h.a((fth) sft.NOTIFICATIONS_ENABLE), this.a.h.a((fth) sft.DISABLE_NOTIFICATION_AUTO_BUNDLING));
        }
    }

    public sfq(ftl ftl) {
        akcr.b(ftl, "configProvider");
        this.h = ftl;
        Object c = ajdx.c((Callable) new a(this));
        akcr.a(c, "Single.fromCallable {\n  …leanGet()\n        )\n    }");
        this.g = c;
    }

    private final ajdx<Boolean> a(sft sft) {
        Object b = this.h.b((fth) sft);
        akcr.a(b, "configProvider.getBooleanConfig(this)");
        return b;
    }

    public final ajdx<Boolean> a() {
        return this.f;
    }

    public final ajdx<sep> b() {
        return this.g;
    }
}
