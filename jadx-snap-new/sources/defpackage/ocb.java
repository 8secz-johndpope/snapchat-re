package defpackage;

import com.google.common.collect.ImmutableList;
import defpackage.alkc.b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ocb */
public final class ocb extends vzb {
    final String a;
    final ImmutableList<b> b;
    final int c;
    final obq d;
    final acss e;
    private final ajwl<Integer> g;
    private final wae h;

    /* renamed from: ocb$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        private /* synthetic */ ocb a;

        public a(ocb ocb) {
            this.a = ocb;
        }

        public final R apply(T1 t1, T2 t2) {
            Object obj = (Integer) t2;
            if (((vzx) t1).b.isEmpty() || this.a.b.isEmpty()) {
                return znk.a;
            }
            ocb ocb = this.a;
            ImmutableList immutableList = ocb.b;
            akcr.a(obj, "limit");
            int intValue = obj.intValue();
            akcr.b(immutableList, "results");
            int i = 0;
            int i2 = intValue < immutableList.size() ? 1 : 0;
            List<Object> c = ajyu.c((Iterable) immutableList, intValue);
            List arrayList = new ArrayList();
            for (Object obj2 : c) {
                int a = wdu.a(i, c.size(), i2 ^ 1);
                akcr.a(obj2, "scoredResult");
                akcr.b(obj2, "searchData");
                obz obz = new obz(obj2, "");
                long j = (long) i;
                String valueOf = String.valueOf(i);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(String.valueOf(ocb.c));
                stringBuilder.append(i);
                arrayList.add(new ocg(obz, j, a, new vzv(valueOf, stringBuilder.toString(), ocb.f), ocb.d, ocb.e));
                i++;
            }
            R a2 = znk.a(znk.a(new wgg(ocb.a)), znk.a(arrayList));
            if (i2 != 0) {
                a2 = znk.a(a2, znk.a(new whb(ocb.c)));
            }
            return a2;
        }
    }

    public ocb(String str, ImmutableList<b> immutableList, wae wae, int i, obq obq, acss acss) {
        akcr.b(str, "title");
        akcr.b(immutableList, "results");
        akcr.b(wae, "searchQuery");
        akcr.b(obq, "mapSearchCallback");
        akcr.b(acss, "playbackController");
        super(i);
        this.a = str;
        this.b = immutableList;
        this.h = wae;
        this.c = i;
        this.d = obq;
        this.e = acss;
        Object i2 = ajwl.i(Integer.valueOf(4));
        akcr.a(i2, "BehaviorSubject.createDe…TIAL_DISPLAY_ITEMS_LIMIT)");
        this.g = i2;
    }

    public final ajdp<vzx> a() {
        Object b = ajdp.b(new vzx(this.h, this.b));
        akcr.a(b, "Observable.just(SearchSe…ls(searchQuery, results))");
        return b;
    }

    public final ajdp<znh<zmy>> b() {
        ajdp a = ajdp.a((ajdt) a(), (ajdt) this.g, (ajex) new a(this));
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    @akqq
    public final void onViewMoreEvent(wcx wcx) {
        akcr.b(wcx, "viewMoreEvent");
        if (wcx.a == this.f) {
            ajwl ajwl = this.g;
            Object p = ajwl.p();
            if (p == null) {
                akcr.a();
            }
            ajwl.a(Integer.valueOf(((Number) p).intValue() + 10));
        }
    }
}
