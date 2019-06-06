package defpackage;

import java.util.List;

/* renamed from: mwf */
public final class mwf {

    /* renamed from: mwf$a */
    public static final class a implements mwe {
        private /* synthetic */ ajxe a;

        a(ajxe ajxe) {
            this.a = ajxe;
        }

        public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
            akcr.b(aVar, "queryCriteria");
            return ((mwe) this.a.b()).a(aVar);
        }
    }

    public static final mwe a(akbk<? extends mwe> akbk) {
        akcr.b(akbk, "receiver$0");
        return new a(ajxh.a(akbk));
    }
}
