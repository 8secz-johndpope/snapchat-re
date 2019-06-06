package defpackage;

import defpackage.edg.a;
import java.util.List;

/* renamed from: dzs */
public final class dzs implements dzo {
    private final eaa a;
    private final abse b;
    private final dpf c;

    /* renamed from: dzs$a */
    static class a extends eaa {
        private final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean a(abtl abtl, abtl abtl2, abtl abtl3) {
            return eaa.b(abtl, abtl2, abtl3) ? true : eaa.c(abtl, abtl2, abtl3) ? false : (abtl2.d() <= this.a || !abtl2.a(abtl3)) ? (abtl3.d() <= this.a || !abtl3.a(abtl2)) ? eaa.d(abtl, abtl2, abtl3) : true : false;
        }
    }

    public dzs() {
        this(new a(dpg.a().K()), new abse(), dpg.a());
    }

    private dzs(eaa eaa, abse abse, dpf dpf) {
        this.a = eaa;
        this.b = abse;
        this.c = dpf;
    }

    public final void a(dpp dpp, a aVar) {
        abtl j = this.c.j(dpp.o());
        List g = dpp.g();
        if (j == null || !g.contains(j)) {
            j = this.a.a(new abtl(this.b.heightPixels, this.b.widthPixels), g);
        }
        if (j != null) {
            aVar.b = j;
        }
    }
}
