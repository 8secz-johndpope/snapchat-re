package defpackage;

/* renamed from: ajvw */
public final class ajvw {

    /* renamed from: ajvw$a */
    static final class a extends akcq implements akbw<T, R, ajxm<? extends T, ? extends R>> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final String getName() {
            return "<init>";
        }

        public final akej getOwner() {
            return akde.a(ajxm.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            akcr.b(obj, "p1");
            akcr.b(obj2, "p2");
            return new ajxm(obj, obj2);
        }
    }

    public static final <T, R> ajde<ajxm<T, R>> a(ajde<T> ajde, ajde<R> ajde2) {
        akcr.b(ajde, "$receiver");
        akcr.b(ajde2, "flowable");
        Object a = ajde.a((akuw) ajde, (akuw) ajde2, (ajex) new ajvx(a.a));
        akcr.a(a, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return a;
    }
}
