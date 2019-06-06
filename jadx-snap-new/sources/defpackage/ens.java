package defpackage;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import com.snapchat.android.R;
import defpackage.dnk.e;
import defpackage.dpr.b;
import defpackage.dpr.c;
import defpackage.dpt.a;
import defpackage.dpv.a.b.d;

/* renamed from: ens */
public final class ens implements aiqc<dpt> {
    private final ajwy<a> a;
    private final ajwy<View> b;
    private final ajwy<dni> c;
    private final ajwy<dnr> d;
    private final ajwy<ajdp<Point>> e;
    private final ajwy<ajdp<ebn>> f;
    private final ajwy<ajdp<ebs>> g;
    private final ajwy<ajdp<dva>> h;
    private final ajwy<ajdp<ebk>> i;
    private final ajwy<ajdp<Float>> j;
    private final ajwy<ajdp<Double>> k;
    private final ajwy<ajfb<dpz>> l;
    private final ajwy<ViewStub> m;
    private final ajwy<View> n;
    private final ajwy<ajdv<Boolean>> o;
    private final ajwy<ajdv<Boolean>> p;
    private final ajwy<Supplier<Optional<dnk>>> q;
    private final ajwy<dnc> r;
    private final ajwy<ajdp<dps>> s;
    private final ajwy<czq<byte[]>> t;

    public static dpt a(a aVar, View view, dni dni, dnr dnr, ajdp<Point> ajdp, ajdp<ebn> ajdp2, ajdp<ebs> ajdp3, ajdp<dva> ajdp4, ajdp<ebk> ajdp5, ajdp<Float> ajdp6, ajdp<Double> ajdp7, ajfb<dpz> ajfb, ViewStub viewStub, View view2, ajdv<Boolean> ajdv, ajdv<Boolean> ajdv2, Supplier<Optional<dnk>> supplier, dnc dnc, ajdp<dps> ajdp8, czq<byte[]> czq) {
        dpv dpv;
        dnr dnr2;
        ajdp<Point> ajdp9;
        ajdp<ebn> ajdp10;
        ajdp<dva> ajdp11;
        ajdp<ebs> ajdp12;
        ajdp<ebk> ajdp13;
        ajdp<Float> ajdp14;
        a aVar2 = aVar;
        View view3 = view;
        ide ide = dni.b().d.c;
        dpr cVar = dnh.c.equals(dni.b()) ? new c((byte) 0) : b.b;
        dnk dnk = (dnk) ((Optional) supplier.get()).orNull();
        if (dnk instanceof dnk.b) {
            dnk.b bVar = (dnk.b) dnk;
            if (!bVar.a && (cVar instanceof c)) {
                cVar = new c(bVar.b);
            }
            dpv = bVar.e;
            if (dpv != null) {
                aVar.a(dpv);
                if (dpv instanceof d) {
                    cVar = dpr.a.b;
                }
                aVar2 = aVar.a(ide).a(cVar).a((ViewGroup) view.findViewById(R.id.lenses_feature_container)).a(view.findViewById(R.id.gesture_detection_view));
                dnr2 = dnr;
                ajdp9 = ajdp;
                ajdp10 = ajdp2;
                ajdp11 = ajdp4;
                ajdp12 = ajdp3;
                aVar2 = aVar2.a(dnr).a((ajdp) ajdp).b((ajdp) ajdp2).c(ajdp3.a(new elb(ajdp4)));
                ajdp13 = ajdp5;
                ajdp14 = ajdp6;
                return (dpt) aiqf.a(aVar2.d(ajdp5).e(ajdp6).f(ajdp7).a((ajfb) ajfb).a(viewStub).b(view2).a((ajdv) ajdv).b((ajdv) ajdv2).a(dnc).g(ajdp8).a((czq) czq).a(), "Cannot return null from a non-@Nullable @Provides method");
            }
            dpv = dpv.a.a.b.a;
        } else if (dnk instanceof e.b) {
            dpv = dpv.a.a.a.b.a;
        } else {
            if (dnk instanceof e.a) {
                aVar.a(new dpv.a.a.a.a(((e.a) dnk).a));
            } else if (dnk instanceof e.c) {
                dpv = dpv.a.a.a.c.a;
            }
            aVar2 = aVar.a(ide).a(cVar).a((ViewGroup) view.findViewById(R.id.lenses_feature_container)).a(view.findViewById(R.id.gesture_detection_view));
            dnr2 = dnr;
            ajdp9 = ajdp;
            ajdp10 = ajdp2;
            ajdp11 = ajdp4;
            ajdp12 = ajdp3;
            aVar2 = aVar2.a(dnr).a((ajdp) ajdp).b((ajdp) ajdp2).c(ajdp3.a(new elb(ajdp4)));
            ajdp13 = ajdp5;
            ajdp14 = ajdp6;
            return (dpt) aiqf.a(aVar2.d(ajdp5).e(ajdp6).f(ajdp7).a((ajfb) ajfb).a(viewStub).b(view2).a((ajdv) ajdv).b((ajdv) ajdv2).a(dnc).g(ajdp8).a((czq) czq).a(), "Cannot return null from a non-@Nullable @Provides method");
        }
        aVar.a(dpv);
        aVar2 = aVar.a(ide).a(cVar).a((ViewGroup) view.findViewById(R.id.lenses_feature_container)).a(view.findViewById(R.id.gesture_detection_view));
        dnr2 = dnr;
        ajdp9 = ajdp;
        ajdp10 = ajdp2;
        ajdp11 = ajdp4;
        ajdp12 = ajdp3;
        aVar2 = aVar2.a(dnr).a((ajdp) ajdp).b((ajdp) ajdp2).c(ajdp3.a(new elb(ajdp4)));
        ajdp13 = ajdp5;
        ajdp14 = ajdp6;
        return (dpt) aiqf.a(aVar2.d(ajdp5).e(ajdp6).f(ajdp7).a((ajfb) ajfb).a(viewStub).b(view2).a((ajdv) ajdv).b((ajdv) ajdv2).a(dnc).g(ajdp8).a((czq) czq).a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return ens.a((a) this.a.get(), (View) this.b.get(), (dni) this.c.get(), (dnr) this.d.get(), (ajdp) this.e.get(), (ajdp) this.f.get(), (ajdp) this.g.get(), (ajdp) this.h.get(), (ajdp) this.i.get(), (ajdp) this.j.get(), (ajdp) this.k.get(), (ajfb) this.l.get(), (ViewStub) this.m.get(), (View) this.n.get(), (ajdv) this.o.get(), (ajdv) this.p.get(), (Supplier) this.q.get(), (dnc) this.r.get(), (ajdp) this.s.get(), (czq) this.t.get());
    }
}
