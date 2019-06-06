package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: fco */
public final class fco implements gnb {
    private final ajwy<fcr> a;
    private final ajwy<ezd> b;
    private final List<gna> c;

    /* renamed from: fco$a */
    class a implements gno {
        private a() {
        }

        /* synthetic */ a(fco fco, byte b) {
            this();
        }

        public final void a(String str, String str2, String str3) {
        }

        public final void a(String str, String str2, String str3, long j, int i) {
        }

        public final void a(String str, String str2, String str3, long j, gnf gnf) {
        }

        public final void a(String str, String str2, String str3, String str4, long j) {
        }
    }

    public fco(ajwy<fcr> ajwy, ajwy<ezd> ajwy2) {
        this.a = ajwy;
        this.b = ajwy2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new gna("cognac_preload_fixed_time", true, true, 5, -1, false, new gnh(0, 60, ""), null));
        arrayList.add(new gna("cognac_preload_forground", true, true, 5, -1, false, null, new gnm(gnn.BACKGROUND, 5)));
        this.c = arrayList;
    }

    public final ajdx<Integer> a(gfu gfu, Map<String, String> map) {
        return ((fcr) this.a.get()).a();
    }

    public final boolean a() {
        return ((ezd) this.b.get()).i();
    }

    public final List<gna> b() {
        return this.c;
    }

    public final gno c() {
        return new a(this, (byte) 0);
    }
}
