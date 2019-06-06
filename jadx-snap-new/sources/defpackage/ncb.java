package defpackage;

import android.view.View;

/* renamed from: ncb */
public final class ncb {
    final achb<zjm, zjk> a;

    /* renamed from: ncb$a */
    static final class a extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ akbk a;

        a(akbk akbk) {
            this.a = akbk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.invoke();
            return ajxw.a;
        }
    }

    /* renamed from: ncb$b */
    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ akbk a;

        b(akbk akbk) {
            this.a = akbk;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.invoke();
            return ajxw.a;
        }
    }

    public ncb(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        this.a = achb;
    }
}
