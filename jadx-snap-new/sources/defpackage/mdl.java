package defpackage;

import defpackage.mec.c;
import defpackage.mec.c.b;
import defpackage.mec.c.d;
import defpackage.mft.a;

/* renamed from: mdl */
public final class mdl {
    static final akbl<c, ajdp<? extends a>> a = a.a;

    /* renamed from: mdl$a */
    static final class a extends akcs implements akbl<c, ajdp<? extends defpackage.mft.a>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            obj = (c) obj;
            akcr.b(obj, "result");
            if ((obj instanceof b) || akcr.a(obj, defpackage.mec.c.d.a.a)) {
                obj = ajdp.b(defpackage.mft.a.b.a.a);
                str = "Observable.just(StartBut…Case.Action.Show.Loading)";
            } else if (akcr.a(obj, c.c.a)) {
                obj = ajdp.b(defpackage.mft.a.a.a);
                str = "Observable.just(StartButtonUseCase.Action.Hide)";
            } else if (akcr.a(obj, d.b.a)) {
                obj = ajdp.b(defpackage.mft.a.b.b.a);
                str = "Observable.just(StartBut…seCase.Action.Show.Start)";
            } else {
                obj = ajvo.a(ajot.a);
                str = "Observable.empty()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }
}
