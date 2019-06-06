package defpackage;

import java.util.Set;

/* renamed from: gir */
public final class gir {
    akbk<? extends ajdx<gej>> a;
    akbk<? extends ajdj<gej>> b;
    akbk<? extends ajdx<gej>> c;
    final Set<gdy> d;

    /* renamed from: gir$a */
    static final class a extends akcs implements akbl<gej, ajdx<gej>> {
        private /* synthetic */ gir a;

        a(gir gir) {
            this.a = gir;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (gej) obj;
            akcr.b(obj, "result");
            obj = ((ajdj) gir.a(this.a).invoke()).d(obj);
            akcr.a(obj, "fallbackProvider().toSingle(result)");
            return obj;
        }
    }

    /* renamed from: gir$b */
    static final class b extends akcs implements akbl<gej, ajdx<gej>> {
        private /* synthetic */ gir a;

        b(gir gir) {
            this.a = gir;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (gej) obj;
            akcr.b(obj, "result");
            obj = ((ajdj) gir.a(this.a).invoke()).d(obj);
            akcr.a(obj, "fallbackProvider().toSingle(result)");
            return obj;
        }
    }

    /* renamed from: gir$c */
    static final class c extends akcs implements akbl<gej, ajdx<gej>> {
        private /* synthetic */ gir a;

        c(gir gir) {
            this.a = gir;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((gej) obj, "it");
            akbk akbk = this.a.c;
            if (akbk == null) {
                akcr.a("resolveProvider");
            }
            return (ajdx) akbk.invoke();
        }
    }

    public gir(Set<? extends gdy> set) {
        akcr.b(set, "cacheAccessControls");
        this.d = set;
    }

    public static final /* synthetic */ akbk a(gir gir) {
        akbk akbk = gir.b;
        if (akbk == null) {
            akcr.a("fallbackProvider");
        }
        return akbk;
    }
}
