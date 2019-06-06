package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajnn */
final class ajnn {
    static <T> boolean a(Object obj, ajfc<? super T, ? extends ajdb> ajfc, ajcz ajcz) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        ajdb ajdb = null;
        try {
            obj = ((Callable) obj).call();
            if (obj != null) {
                ajdb = (ajdb) ajfv.a(ajfc.apply(obj), "The mapper returned a null CompletableSource");
            }
            if (ajdb == null) {
                ajfq.a(ajcz);
            } else {
                ajdb.a(ajcz);
            }
            return true;
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, ajcz);
            return true;
        }
    }

    static <T, R> boolean a(Object obj, ajfc<? super T, ? extends ajdn<? extends R>> ajfc, ajdv<? super R> ajdv) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        ajdn ajdn = null;
        try {
            obj = ((Callable) obj).call();
            if (obj != null) {
                ajdn = (ajdn) ajfv.a(ajfc.apply(obj), "The mapper returned a null MaybeSource");
            }
            if (ajdn == null) {
                ajfq.a((ajdv) ajdv);
            } else {
                ajdn.b(ajmy.b(ajdv));
            }
            return true;
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
            return true;
        }
    }

    static <T, R> boolean b(Object obj, ajfc<? super T, ? extends ajeb<? extends R>> ajfc, ajdv<? super R> ajdv) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        ajeb ajeb = null;
        try {
            obj = ((Callable) obj).call();
            if (obj != null) {
                ajeb = (ajeb) ajfv.a(ajfc.apply(obj), "The mapper returned a null SingleSource");
            }
            if (ajeb == null) {
                ajfq.a((ajdv) ajdv);
            } else {
                ajeb.a(ajsv.b(ajdv));
            }
            return true;
        } catch (Throwable th) {
            ajep.a(th);
            ajfq.a(th, (ajdv) ajdv);
            return true;
        }
    }
}
