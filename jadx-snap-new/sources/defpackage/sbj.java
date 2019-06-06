package defpackage;

import com.google.common.base.Preconditions;
import defpackage.saq.a;

/* renamed from: sbj */
public final class sbj {
    public static final saq<sai> a = new a().a();

    public static saq a(Throwable th) {
        Preconditions.checkNotNull(th);
        return sbj.a(th, 3, null);
    }

    public static saq a(Throwable th, int i, san san) {
        Preconditions.checkNotNull(th);
        a aVar = new a();
        aVar.d = th;
        aVar.e = san;
        aVar.g = i;
        return aVar.a();
    }

    public static saq a(saq<sai> saq, Throwable th) {
        sbg.a((sai) saq.h);
        a f = saq.f();
        f.d = (Throwable) Preconditions.checkNotNull(th);
        return f.a();
    }
}
