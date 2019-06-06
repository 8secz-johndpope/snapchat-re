package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajkv */
public final class ajkv {

    /* renamed from: ajkv$a */
    static final class a<T, R> extends ajde<R> {
        private T b;
        private ajfc<? super T, ? extends akuw<? extends R>> c;

        a(T t, ajfc<? super T, ? extends akuw<? extends R>> ajfc) {
            this.b = t;
            this.c = ajfc;
        }

        public final void a_(akux<? super R> akux) {
            try {
                akuw akuw = (akuw) ajfv.a(this.c.apply(this.b), "The mapper returned a null Publisher");
                if (akuw instanceof Callable) {
                    try {
                        Object call = ((Callable) akuw).call();
                        if (call == null) {
                            ajuf.a((akux) akux);
                            return;
                        } else {
                            akux.a(new ajug(akux, call));
                            return;
                        }
                    } catch (Throwable th) {
                        ajep.a(th);
                        ajuf.a(th, akux);
                        return;
                    }
                }
                akuw.a(akux);
            } catch (Throwable th2) {
                ajuf.a(th2, akux);
            }
        }
    }

    public static <T, U> ajde<U> a(T t, ajfc<? super T, ? extends akuw<? extends U>> ajfc) {
        return ajvo.a(new a(t, ajfc));
    }

    public static <T, R> boolean a(akuw<T> akuw, akux<? super R> akux, ajfc<? super T, ? extends akuw<? extends R>> ajfc) {
        if (!(akuw instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) akuw).call();
            if (call == null) {
                ajuf.a((akux) akux);
                return true;
            }
            akuw akuw2 = (akuw) ajfv.a(ajfc.apply(call), "The mapper returned a null Publisher");
            if (akuw2 instanceof Callable) {
                call = ((Callable) akuw2).call();
                if (call == null) {
                    ajuf.a((akux) akux);
                    return true;
                }
                akux.a(new ajug(akux, call));
            } else {
                akuw2.a(akux);
            }
            return true;
        } catch (Throwable th) {
            ajep.a(th);
            ajuf.a(th, akux);
            return true;
        }
    }
}
