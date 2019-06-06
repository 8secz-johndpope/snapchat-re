package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jzh */
public final class jzh extends jys {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final ajr b;
    private final ajwy<jwk> c;
    private final ide d;

    public jzh(ajr ajr, ajwy<jwk> ajwy, ide ide) {
        akcr.b(ajr, "bitmapPool");
        akcr.b(ide, "feature");
        this.b = ajr;
        this.c = ajwy;
        this.d = ide;
    }

    public final kaz<jwj> b(int i, int i2, Config config, String str) {
        jwj jwj;
        Object a;
        akcr.b(config, "config");
        akcr.b(str, "callerContext");
        Object a2 = this.b.a(i, i2, config);
        if (a2 == null) {
            a2 = Bitmap.createBitmap(i, i2, config);
        }
        jzl jzl = new jzl(this.b, a2);
        idd callsite = this.d.callsite(str);
        ajwy ajwy = this.c;
        if (ajwy != null) {
            jwk jwk = (jwk) ajwy.get();
            if (jwk != null) {
                jwj = jzl;
                akcr.a(a2, "bitmap");
                jwj = jwk.a(jwj, a2.getAllocationByteCount(), callsite);
                a = kaz.a((ajej) jwj, str);
                akcr.a(a, "RefCountDisposable.of(\n …           callerContext)");
                return a;
            }
        }
        jwj = jzl;
        a = kaz.a((ajej) jwj, str);
        akcr.a(a, "RefCountDisposable.of(\n …           callerContext)");
        return a;
    }

    public final void dispose() {
        this.a.set(true);
    }

    public final boolean isDisposed() {
        return this.a.get();
    }
}
