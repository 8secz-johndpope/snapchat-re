package defpackage;

import defpackage.lyw.b;
import defpackage.lyw.b.d;
import defpackage.lyx.a;

/* renamed from: lye */
public final class lye {
    static final akbl<b, ajdp<lyx.b>> a = a.a;
    static final akbl<a, lyw.a> b = b.a;

    /* renamed from: lye$a */
    static final class a extends akcs implements akbl<b, ajdp<lyx.b>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            b bVar = (b) obj;
            akcr.b(bVar, "result");
            if (bVar instanceof d) {
                obj = ajdp.b(new lyx.b.b());
                str = "just(ExplorerView.Model.Shown())";
            } else if (bVar instanceof b.b) {
                obj = ajdp.b(defpackage.lyx.b.a.a);
                str = "just(ExplorerView.Model.Hidden)";
            } else {
                obj = ajvo.a(ajot.a);
                str = "Observable.empty()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: lye$b */
    static final class b extends akcs implements akbl<a, lyw.a> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "event");
            if (aVar instanceof a.a) {
                return defpackage.lyw.a.b.a;
            }
            throw new ajxk();
        }
    }
}
