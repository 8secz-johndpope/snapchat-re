package defpackage;

/* renamed from: ifh */
public final class ifh {

    /* renamed from: ifh$a */
    static final class a<T> implements ajfb<iff<T>> {
        private /* synthetic */ akbl a;

        a(akbl akbl) {
            this.a = akbl;
        }

        public final /* synthetic */ void accept(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "event");
            this.a.invoke(iff);
        }
    }

    public static final <T> void a(ifg ifg, Class<T> cls, akbl<? super iff<T>, ajxw> akbl) {
        akcr.b(ifg, "receiver$0");
        akcr.b(cls, "clazz");
        akcr.b(akbl, "callback");
        ifg.a((Class) cls, (ajfb) new a(akbl));
    }
}
