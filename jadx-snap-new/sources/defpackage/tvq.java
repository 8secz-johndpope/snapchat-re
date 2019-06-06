package defpackage;

import android.graphics.Rect;
import defpackage.iib.a;

/* renamed from: tvq */
public final class tvq {
    public final ajdx<Rect> a;
    public final ajdx<iia> b;
    private final ajdp<ajxm<a, Rect>> c;

    /* renamed from: tvq$c */
    static final class c<T1, T2, R> implements ajex<a, Rect, ajxm<? extends a, ? extends Rect>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            a aVar = (a) obj;
            Rect rect = (Rect) obj2;
            akcr.b(aVar, "screenParameters");
            akcr.b(rect, "insets");
            return ajxs.a(aVar, rect);
        }
    }

    /* renamed from: tvq$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            defpackage.iib.a aVar = (defpackage.iib.a) ajxm.a;
            Rect rect = (Rect) ajxm.b;
            Object obj2 = aVar.b;
            akcr.a(obj2, "screenParameters.fullscreenResolution");
            int i = obj2.c() ? rect.bottom : 0;
            Rect rect2 = new Rect(rect);
            rect2.bottom = i;
            return rect2;
        }
    }

    /* renamed from: tvq$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            a aVar = (a) ajxm.a;
            Rect rect = (Rect) ajxm.b;
            Object obj2 = aVar.b;
            String str = "screenParameters.fullscreenResolution";
            akcr.a(obj2, str);
            int i = obj2.c() ? rect.bottom : 0;
            Object obj3 = aVar.b;
            akcr.a(obj3, str);
            int a = obj3.a();
            Object obj4 = aVar.b;
            akcr.a(obj4, str);
            return new iia(a, obj4.b() - i);
        }
    }

    public tvq(iib iib, zgb zgb, zkq zkq) {
        akcr.b(iib, "screenParameterProvider");
        akcr.b(zgb, "schedulesProvider");
        akcr.b(zkq, "insetsDetector");
        this.c = ajdp.a((ajdt) iib.b().i(), (ajdt) zkq.a(), (ajex) c.a).b((ajdw) zgb.a(toc.d.callsite("EditsContainerConfigProvider")).h());
        Object e = this.c.p(a.a).e();
        String str = "screenParametersAndInset…         }.firstOrError()";
        akcr.a(e, str);
        this.a = e;
        e = this.c.p(b.a).e();
        akcr.a(e, str);
        this.b = e;
    }
}
