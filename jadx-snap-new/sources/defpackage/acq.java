package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: acq */
public interface acq<Model, Data> {

    /* renamed from: acq$a */
    public static class a<Data> {
        public final zd a;
        public final List<zd> b;
        public final zm<Data> c;

        private a(zd zdVar, List<zd> list, zm<Data> zmVar) {
            String str = "Argument must not be null";
            this.a = (zd) ahl.a((Object) zdVar, str);
            this.b = (List) ahl.a((Object) list, str);
            this.c = (zm) ahl.a((Object) zmVar, str);
        }

        public a(zd zdVar, zm<Data> zmVar) {
            this(zdVar, Collections.emptyList(), zmVar);
        }
    }

    a<Data> a(Model model, int i, int i2, zf zfVar);

    boolean a(Model model);
}
