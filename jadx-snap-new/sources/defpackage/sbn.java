package defpackage;

import com.google.common.base.Preconditions;
import defpackage.sbm.a;

/* renamed from: sbn */
public final class sbn<T> implements sat<T> {
    private final sak<sai> a;
    private final saq<T> b;
    private final sbs<sao> c;
    private final sar d;

    public sbn(sak sak, saq<T> saq, sar sar, sbs<sao> sbs) {
        Class cls = sai.class;
        Preconditions.checkNotNull(sak);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(sak);
        Preconditions.checkNotNull(cls);
        Object n = sak.n();
        Object obj = (n == null || cls.isAssignableFrom(n.getClass())) ? 1 : null;
        if (obj == null) {
            sak = new a(sak).b(null).e();
        }
        this.a = sak;
        this.b = saq;
        this.c = sbs;
        this.d = sar;
    }

    public final saq a() {
        return this.b;
    }

    public final void a(sad<sao> sad) {
        this.c.addListener(sad);
    }

    public final sak<sai> b() {
        return this.a;
    }

    public final sar c() {
        return this.d;
    }
}
