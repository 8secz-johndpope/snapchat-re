package defpackage;

/* renamed from: gis */
public final class gis {

    /* renamed from: gis$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ akbl a;

        a(akbl akbl) {
            this.a = akbl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (gej) obj;
            akcr.b(obj, "result");
            if (!obj.a()) {
                return (ajdx) this.a.invoke(obj);
            }
            obj = ajdx.b(obj);
            akcr.a(obj, "Single.just(result)");
            return obj;
        }
    }

    static final ajdx<gej> a(ajdx<gej> ajdx, akbl<? super gej, ? extends ajdx<gej>> akbl) {
        Object a = ajdx.a((ajfc) new a(akbl));
        akcr.a(a, "this.flatMap { result: C…     mapper(result)\n    }");
        return a;
    }
}
