package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: yju */
public final class yju {
    public WeakReference<yip> a;

    /* renamed from: yju$a */
    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ String a;

        a(String str) {
            this.a = str;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    /* renamed from: yju$b */
    static final class b extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }
}
