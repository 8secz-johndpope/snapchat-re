package defpackage;

import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.kqe.w;
import defpackage.lvf.a;
import defpackage.lvi.b;
import defpackage.lvi.b.c;
import java.util.List;

/* renamed from: lvn */
public final class lvn implements ajdu<b, b> {
    final kqf a;

    /* renamed from: lvn$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, MapboxEvent.KEY_MODEL);
            if (bVar instanceof c) {
                c cVar = (c) bVar;
                int i = 0;
                for (defpackage.lvf.a aVar : cVar.a) {
                    Object obj2 = ((aVar instanceof defpackage.lvf.a.b) && ((defpackage.lvf.a.b) aVar).c()) ? 1 : null;
                    if (obj2 != null) {
                        break;
                    }
                    i++;
                }
                i = -1;
                if (i >= 0) {
                    return ajdp.b(ajxs.a(Integer.valueOf(i), cVar.a));
                }
            }
            return ajvo.a(ajot.a);
        }
    }

    /* renamed from: lvn$b */
    static final class b<T1, T2> implements ajey<ajxm<? extends Integer, ? extends List<? extends a>>, ajxm<? extends Integer, ? extends List<? extends a>>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj, Object obj2) {
            ajxm ajxm = (ajxm) obj;
            ajxm ajxm2 = (ajxm) obj2;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            akcr.b(ajxm2, "<name for destructuring parameter 1>");
            int intValue = ((Number) ajxm.a).intValue();
            List list = (List) ajxm.b;
            int intValue2 = ((Number) ajxm2.a).intValue();
            List list2 = (List) ajxm2.b;
            if (intValue != intValue2) {
                return false;
            }
            obj = list.get(intValue);
            String str = "null cannot be cast to non-null type com.snap.lenses.camera.carousel.imagepicker.ImagePickerItemView.Model.Image";
            if (obj != null) {
                defpackage.lvf.a.b bVar = (defpackage.lvf.a.b) obj;
                obj2 = list2.get(intValue2);
                if (obj2 != null) {
                    return akcr.a(bVar.b(), ((defpackage.lvf.a.b) obj2).b());
                }
                throw new ajxt(str);
            }
            throw new ajxt(str);
        }
    }

    /* renamed from: lvn$c */
    static final class c<T> implements ajfb<ajxm<? extends Integer, ? extends List<? extends a>>> {
        private /* synthetic */ lvn a;

        c(lvn lvn) {
            this.a = lvn;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            this.a.a.a(new w(((Number) ajxm.a).intValue(), ((List) ajxm.b).size()));
        }
    }

    public lvn(kqf kqf) {
        akcr.b(kqf, "analyticsEventHandler");
        this.a = kqf;
    }

    public final ajdt<b> apply(ajdp<b> ajdp) {
        akcr.b(ajdp, "upstream");
        ajdp a = ajpy.k(ajdp).a();
        Object a2 = a.k((ajfc) a.a).a((ajey) b.a);
        akcr.a(a2, "share.flatMap { model ->…ond.uri\n                }");
        ajdp d = a2.d((ajfb) new c(this));
        akcr.a((Object) d, "reporter");
        Object e = a.e((ajdt) myu.a(d));
        akcr.a(e, "share.mergeWith(reporter.empty())");
        return (ajdt) e;
    }
}
