package defpackage;

import com.google.common.base.Supplier;
import defpackage.iib.a;
import defpackage.mio.b;
import java.util.concurrent.TimeUnit;

/* renamed from: kxo */
public final class kxo implements mio {
    private final Supplier<absi> a;
    private final Supplier<iib> b;
    private final zfw c;
    private final ajdw d;
    private final long e;
    private final TimeUnit f;

    public /* synthetic */ kxo(Supplier supplier, Supplier supplier2, zfw zfw) {
        this(supplier, supplier2, zfw, zfw.b(), TimeUnit.SECONDS);
    }

    private kxo(Supplier<absi> supplier, Supplier<iib> supplier2, zfw zfw, ajdw ajdw, TimeUnit timeUnit) {
        akcr.b(supplier, "softNavBarDetectorSupplier");
        akcr.b(supplier2, "screenParameterProviderSupplier");
        akcr.b(zfw, "qualifiedSchedulers");
        akcr.b(ajdw, "timeoutScheduler");
        akcr.b(timeUnit, "timeoutTimeUnit");
        this.a = supplier;
        this.b = supplier2;
        this.c = zfw;
        this.d = ajdw;
        this.e = 1;
        this.f = timeUnit;
    }

    private final iia a() {
        try {
            return ((a) ((iib) this.b.get()).b().b((ajdw) this.c.b()).c(1, this.f, this.d).b()).b;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final mih a(b bVar) {
        akcr.b(bVar, "element");
        if (!akcr.a((Object) bVar, b.a.a)) {
            return mih.e;
        }
        Object obj = (absi) this.a.get();
        if (!obj.b()) {
            return mih.e;
        }
        iia a = a();
        if (a == null) {
            return mih.e;
        }
        akcr.a(obj, "softNavBarDetector");
        return new mih(0, a.b() - obj.f(), a.a(), a.b());
    }
}
