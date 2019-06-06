package defpackage;

import defpackage.mec.c;
import defpackage.mec.c.b;
import defpackage.meo.a;

/* renamed from: mdi */
public final class mdi {
    static final akbl<c, ajdp<? extends a>> a = a.a;

    /* renamed from: mdi$a */
    static final class a extends akcs implements akbl<c, ajdp<? extends defpackage.meo.a>> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            obj = (c) obj;
            akcr.b(obj, "result");
            if (akcr.a(obj, defpackage.mec.c.a.a)) {
                obj = ajdp.b(defpackage.meo.a.c.a);
                str = "Observable.just(FullScre…uttonUseCase.Action.Show)";
            } else if (obj instanceof b) {
                obj = ajdp.b(defpackage.meo.a.b.a);
                str = "Observable.just(FullScre…uttonUseCase.Action.Hide)";
            } else {
                obj = ajvo.a(ajot.a);
                str = "Observable.empty()";
            }
            akcr.a(obj, str);
            return obj;
        }
    }
}
