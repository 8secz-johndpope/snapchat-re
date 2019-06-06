package defpackage;

import defpackage.rxw.a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rxz */
public final class rxz implements rxw {
    private final AtomicInteger a;
    private final a b;

    public rxz(a aVar) {
        this(aVar, (byte) 0);
    }

    private rxz(a aVar, byte b) {
        this.b = aVar;
        this.a = new AtomicInteger(3);
    }

    public final boolean a(akov akov) {
        if (akov instanceof akpc) {
            akpc akpc = (akpc) akov;
            if (akpc.c() && akpc.a() == 3 && this.a.getAndDecrement() > 0) {
                this.b.retry();
                return true;
            }
        }
        return false;
    }
}
