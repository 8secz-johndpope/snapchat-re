package defpackage;

import com.google.common.base.Supplier;
import defpackage.edg.a;
import java.util.List;

/* renamed from: dzr */
public final class dzr implements dzo {
    private final dzq a;
    private final abss b;
    private final Supplier<eca> c;

    /* renamed from: dzr$a */
    static class a extends eaa {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean a(abtl abtl, abtl abtl2, abtl abtl3) {
            return eaa.b(abtl, abtl2, abtl3) ? true : eaa.c(abtl, abtl2, abtl3) ? false : eaa.a(this.a, abtl2, abtl3);
        }
    }

    public dzr(Supplier<eca> supplier) {
        this(new dzq(), abss.a(), supplier);
    }

    private dzr(dzq dzq, abss abss, Supplier<eca> supplier) {
        this.a = dzq;
        this.b = abss;
        this.c = supplier;
    }

    public final void a(dpp dpp, a aVar) {
        boolean o = dpp.o();
        eca eca = (eca) this.c.get();
        ecf a = this.a.a(eca);
        abtl a2 = this.a.a(o);
        if (a2 == null) {
            a aVar2 = new a(this.a.a(o, eca, a));
            List a3 = dzq.a(dpp, a);
            abtl abtl = aVar.a().c;
            if (abtl != null) {
                a2 = aVar2.a(abtl, a3);
            } else if (this.b.f()) {
                throw new IllegalStateException("Preview resolution must be initialized before picture resolution.");
            } else {
                return;
            }
        }
        if (a2 != null) {
            aVar.f = a;
            aVar.c = a2;
        }
    }
}
