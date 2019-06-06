package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jyv */
public final class jyv extends jys {
    public final jyn a;
    private final ajwo<a> b;
    private final ajei c = new ajei();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final ide e;
    private final ajwy<jwk> f;

    /* renamed from: jyv$a */
    public enum a {
        ;

        private a(String str) {
        }
    }

    public jyv(ide ide, jyn jyn, ajwy<jwk> ajwy, ajfb<a> ajfb) {
        akcr.b(ide, "feature");
        akcr.b(jyn, "bitmapPool");
        akcr.b(ajwy, "disposableBitmapTracker");
        akcr.b(ajfb, "consumer");
        this.e = ide;
        this.a = jyn;
        this.f = ajwy;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<BitmapFactoryEvent>()");
        this.b = ajwo;
        this.c.a((ajej) this.a);
        this.c.a(this.b.f((ajfb) ajfb));
    }

    /* Access modifiers changed, original: protected|final */
    public final kaz<jwj> b(int i, int i2, Config config, String str) {
        akcr.b(config, "config");
        akcr.b(str, "callerContext");
        Bitmap a = this.a.a(i, i2, config);
        if (a == null) {
            a = Bitmap.createBitmap(i, i2, config);
        }
        idd callsite = this.e.callsite(str);
        Object a2 = kaz.a((ajej) ((jwk) this.f.get()).a(new jyu(this.a, a), callsite), callsite.toString());
        akcr.a(a2, "RefCountDisposable.of(\n …butedCallsite.toString())");
        return a2;
    }

    public final void dispose() {
        if (this.d.compareAndSet(false, true)) {
            this.b.a(a.DISPOSE);
            this.b.a();
            this.c.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.d.get();
    }
}
