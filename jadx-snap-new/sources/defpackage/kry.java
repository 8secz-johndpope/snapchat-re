package defpackage;

/* renamed from: kry */
public final class kry {

    /* renamed from: kry$a */
    static final class a<T> implements ajfb<T> {
        private /* synthetic */ akbl a;

        a(akbl akbl) {
            this.a = akbl;
        }

        public final void accept(T t) {
            this.a.invoke(t);
        }
    }

    /* renamed from: kry$b */
    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ akbl a;

        b(akbl akbl) {
            this.a = akbl;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            akbl akbl = this.a;
            akcr.a(obj, "it");
            akbl.invoke(obj);
        }
    }

    public static final <T> void a(ajdx<T> ajdx, akbl<? super T, ajxw> akbl, akbl<? super Throwable, ajxw> akbl2, ajei ajei) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(akbl, "onSuccess");
        akcr.b(akbl2, "onError");
        akcr.b(ajei, "compositeDisposable");
        ajdx.a((ajdz) new krx(new a(akbl), new b(akbl2), ajei));
    }
}
