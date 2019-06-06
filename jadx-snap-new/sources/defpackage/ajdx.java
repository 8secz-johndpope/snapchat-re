package defpackage;

import defpackage.ajsk.a;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: ajdx */
public abstract class ajdx<T> implements ajeb<T> {
    public static <T> ajde<T> a(ajeb<? extends T> ajeb, ajeb<? extends T> ajeb2) {
        ajfv.a((Object) ajeb, "source1 is null");
        ajfv.a((Object) ajeb2, "source2 is null");
        return ajdx.a(ajde.a(ajeb, ajeb2));
    }

    public static <T> ajde<T> a(akuw<? extends ajeb<? extends T>> akuw) {
        ajfv.a((Object) akuw, "sources is null");
        ajfv.a(2, "prefetch");
        return ajvo.a(new ajix(akuw, a.INSTANCE, 1));
    }

    public static ajdx<Long> a(long j, TimeUnit timeUnit) {
        return ajdx.a(j, timeUnit, ajwh.b);
    }

    public static ajdx<Long> a(long j, TimeUnit timeUnit, ajdw ajdw) {
        ajfv.a((Object) timeUnit, "unit is null");
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajst(j, timeUnit, ajdw));
    }

    public static <T> ajdx<T> a(ajde<T> ajde) {
        return ajvo.a(new ajkx(ajde));
    }

    public static <T> ajdx<T> a(ajea<T> ajea) {
        ajfv.a((Object) ajea, "source is null");
        return ajvo.a(new ajrp(ajea));
    }

    private static <T> ajdx<T> a(ajeb<T> ajeb) {
        ajfv.a((Object) ajeb, "source is null");
        return ajeb instanceof ajdx ? ajvo.a((ajdx) ajeb) : ajvo.a(new ajsi(ajeb));
    }

    public static <T1, T2, T3, T4, T5, R> ajdx<R> a(ajeb<? extends T1> ajeb, ajeb<? extends T2> ajeb2, ajeb<? extends T3> ajeb3, ajeb<? extends T4> ajeb4, ajeb<? extends T5> ajeb5, ajff<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> ajff) {
        ajfv.a((Object) ajeb, "source1 is null");
        ajfv.a((Object) ajeb2, "source2 is null");
        ajfv.a((Object) ajeb3, "source3 is null");
        ajfv.a((Object) ajeb4, "source4 is null");
        ajfv.a((Object) ajeb5, "source5 is null");
        return ajdx.a(ajfu.a((ajff) ajff), ajeb, ajeb2, ajeb3, ajeb4, ajeb5);
    }

    public static <T1, T2, T3, T4, R> ajdx<R> a(ajeb<? extends T1> ajeb, ajeb<? extends T2> ajeb2, ajeb<? extends T3> ajeb3, ajeb<? extends T4> ajeb4, ajfe<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> ajfe) {
        ajfv.a((Object) ajeb, "source1 is null");
        ajfv.a((Object) ajeb2, "source2 is null");
        ajfv.a((Object) ajeb3, "source3 is null");
        ajfv.a((Object) ajeb4, "source4 is null");
        return ajdx.a(ajfu.a((ajfe) ajfe), ajeb, ajeb2, ajeb3, ajeb4);
    }

    public static <T1, T2, T3, R> ajdx<R> a(ajeb<? extends T1> ajeb, ajeb<? extends T2> ajeb2, ajeb<? extends T3> ajeb3, ajfd<? super T1, ? super T2, ? super T3, ? extends R> ajfd) {
        ajfv.a((Object) ajeb, "source1 is null");
        ajfv.a((Object) ajeb2, "source2 is null");
        ajfv.a((Object) ajeb3, "source3 is null");
        return ajdx.a(ajfu.a((ajfd) ajfd), ajeb, ajeb2, ajeb3);
    }

    public static <T1, T2, R> ajdx<R> a(ajeb<? extends T1> ajeb, ajeb<? extends T2> ajeb2, ajex<? super T1, ? super T2, ? extends R> ajex) {
        ajfv.a((Object) ajeb, "source1 is null");
        ajfv.a((Object) ajeb2, "source2 is null");
        return ajdx.a(ajfu.a((ajex) ajex), ajeb, ajeb2);
    }

    public static <T, R> ajdx<R> a(ajfc<? super Object[], ? extends R> ajfc, ajeb<? extends T>... ajebArr) {
        ajfv.a((Object) ajfc, "zipper is null");
        ajfv.a((Object) ajebArr, "sources is null");
        return ajebArr.length == 0 ? ajdx.b(new NoSuchElementException()) : ajvo.a(new ajsx(ajebArr, ajfc));
    }

    public static <T, R> ajdx<R> a(Iterable<? extends ajeb<? extends T>> iterable, ajfc<? super Object[], ? extends R> ajfc) {
        ajfv.a((Object) ajfc, "zipper is null");
        ajfv.a((Object) iterable, "sources is null");
        return ajvo.a(new ajsy(iterable, ajfc));
    }

    public static <T> ajdx<T> a(Callable<? extends ajeb<? extends T>> callable) {
        ajfv.a((Object) callable, "singleSupplier is null");
        return ajvo.a(new ajrq(callable));
    }

    public static <T> ajde<T> b(akuw<? extends ajeb<? extends T>> akuw) {
        ajfv.a((Object) akuw, "sources is null");
        return ajvo.a(new ajjs(akuw, a.INSTANCE, false, ajde.a));
    }

    public static <T> ajdx<T> b(T t) {
        ajfv.a((Object) t, "value is null");
        return ajvo.a(new ajsl(t));
    }

    public static <T> ajdx<T> b(Throwable th) {
        ajfv.a((Object) th, "error is null");
        return ajdx.b(ajfu.a((Object) th));
    }

    public static <T> ajdx<T> b(Callable<? extends Throwable> callable) {
        ajfv.a((Object) callable, "errorSupplier is null");
        return ajvo.a(new ajsb(callable));
    }

    public static <T> ajdx<T> c(Callable<? extends T> callable) {
        ajfv.a((Object) callable, "callable is null");
        return ajvo.a(new ajsh(callable));
    }

    private ajdx<T> d(long j, TimeUnit timeUnit, ajdw ajdw) {
        ajfv.a((Object) timeUnit, "unit is null");
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajrr(this, j, timeUnit, ajdw));
    }

    public final ajdj<T> a(ajfl<? super T> ajfl) {
        ajfv.a((Object) ajfl, "predicate is null");
        return ajvo.a(new ajlx(this, ajfl));
    }

    public final ajdx<T> a() {
        return ajvo.a(new ajro(this));
    }

    public final ajdx<T> a(long j) {
        return ajdx.a(f().a(j));
    }

    public final ajdx<T> a(long j, TimeUnit timeUnit, ajdw ajdw, ajeb<? extends T> ajeb) {
        ajfv.a((Object) timeUnit, "unit is null");
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajss(this, j, timeUnit, ajdw, ajeb));
    }

    public final ajdx<T> a(ajdw ajdw) {
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajso(this, ajdw));
    }

    public final ajdx<T> a(ajdx<? extends T> ajdx) {
        ajfv.a((Object) ajdx, "resumeSingleInCaseOfError is null");
        return h(ajfu.b((Object) ajdx));
    }

    public final <R> ajdx<R> a(ajec<? super T, ? extends R> ajec) {
        return ajdx.a(((ajec) ajfv.a((Object) ajec, "transformer is null")).apply(this));
    }

    public final ajdx<T> a(ajev ajev) {
        ajfv.a((Object) ajev, "onAfterTerminate is null");
        return ajvo.a(new ajru(this, ajev));
    }

    public final ajdx<T> a(ajew<? super T, ? super Throwable> ajew) {
        ajfv.a((Object) ajew, "onEvent is null");
        return ajvo.a(new ajry(this, ajew));
    }

    public final ajdx<T> a(ajfb<? super T> ajfb) {
        ajfv.a((Object) ajfb, "doAfterSuccess is null");
        return ajvo.a(new ajrt(this, ajfb));
    }

    public final <R> ajdx<R> a(ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajsc(this, ajfc));
    }

    public final <U> ajdx<U> a(Class<? extends U> cls) {
        ajfv.a((Object) cls, "clazz is null");
        return f(ajfu.a((Class) cls));
    }

    public final ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2) {
        ajfv.a((Object) ajfb, "onSuccess is null");
        ajfv.a((Object) ajfb2, "onError is null");
        ajdz ajgo = new ajgo(ajfb, ajfb2);
        a(ajgo);
        return ajgo;
    }

    public final void a(ajdz<? super T> ajdz) {
        ajfv.a((Object) ajdz, "subscriber is null");
        ajdz a = ajvo.a(this, (ajdz) ajdz);
        ajfv.a((Object) a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ajep.a(th);
            new NullPointerException("subscribeActual failed").initCause(th);
        }
    }

    public final <R> ajdj<R> b(ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajsf(this, ajfc));
    }

    public final ajdx<T> b(long j, TimeUnit timeUnit) {
        return d(j, timeUnit, ajwh.b);
    }

    public final ajdx<T> b(long j, TimeUnit timeUnit, ajdw ajdw) {
        return d(j, timeUnit, ajdw);
    }

    public final ajdx<T> b(ajdw ajdw) {
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajsr(this, ajdw));
    }

    public final ajdx<T> b(ajev ajev) {
        ajfv.a((Object) ajev, "onFinally is null");
        return ajvo.a(new ajrv(this, ajev));
    }

    public final ajdx<T> b(ajfb<? super ajej> ajfb) {
        ajfv.a((Object) ajfb, "onSubscribe is null");
        return ajvo.a(new ajrz(this, ajfb));
    }

    public final ajej b(ajew<? super T, ? super Throwable> ajew) {
        ajfv.a((Object) ajew, "onCallback is null");
        ajdz ajgj = new ajgj(ajew);
        a(ajgj);
        return ajgj;
    }

    public final T b() {
        ajdz ajgm = new ajgm();
        a(ajgm);
        return ajgm.b();
    }

    public abstract void b(ajdz<? super T> ajdz);

    public final <U> ajdp<U> c(ajfc<? super T, ? extends Iterable<? extends U>> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajse(this, ajfc));
    }

    public final ajdx<T> c(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, ajwh.b, null);
    }

    public final ajdx<T> c(long j, TimeUnit timeUnit, ajdw ajdw) {
        return a(j, timeUnit, ajdw, null);
    }

    public final ajdx<T> c(ajdw ajdw) {
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajsw(this, ajdw));
    }

    public final ajdx<T> c(ajev ajev) {
        ajfv.a((Object) ajev, "onDispose is null");
        return ajvo.a(new ajrw(this, ajev));
    }

    public final ajdx<T> c(ajfb<? super T> ajfb) {
        ajfv.a((Object) ajfb, "onSuccess is null");
        return ajvo.a(new ajsa(this, ajfb));
    }

    public final ajdx<T> c(T t) {
        ajfv.a((Object) t, "value is null");
        return ajvo.a(new ajsp(this, null, t));
    }

    public final <E extends ajdz<? super T>> E c(E e) {
        a((ajdz) e);
        return e;
    }

    public final ajej c() {
        return a(ajfu.d, ajfu.e);
    }

    @Deprecated
    public final ajcx d() {
        return ajvo.a(new ajhu(this));
    }

    public final <R> ajdp<R> d(ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajno(this, ajfc));
    }

    public final ajdx<T> d(ajfb<? super Throwable> ajfb) {
        ajfv.a((Object) ajfb, "onError is null");
        return ajvo.a(new ajrx(this, ajfb));
    }

    public final ajcx e() {
        return ajvo.a(new ajhu(this));
    }

    public final ajcx e(ajfc<? super T, ? extends ajdb> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajsd(this, ajfc));
    }

    public final ajej e(ajfb<? super T> ajfb) {
        return a((ajfb) ajfb, ajfu.e);
    }

    public final ajde<T> f() {
        return this instanceof ajfx ? ((ajfx) this).an_() : ajvo.a(new ajsu(this));
    }

    public final <R> ajdx<R> f(ajfc<? super T, ? extends R> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajsm(this, ajfc));
    }

    public final ajdx<T> g(ajfc<Throwable, ? extends T> ajfc) {
        ajfv.a((Object) ajfc, "resumeFunction is null");
        return ajvo.a(new ajsp(this, ajfc, null));
    }

    public final Future<T> g() {
        return (Future) c(new ajgs());
    }

    public final ajdj<T> h() {
        return this instanceof ajfy ? ((ajfy) this).ao_() : ajvo.a(new ajme(this));
    }

    public final ajdx<T> h(ajfc<? super Throwable, ? extends ajeb<? extends T>> ajfc) {
        ajfv.a((Object) ajfc, "resumeFunctionInCaseOfError is null");
        return ajvo.a(new ajsq(this, ajfc));
    }

    public final ajde<T> i(ajfc<? super ajde<Object>, ? extends akuw<?>> ajfc) {
        return f().f(ajfc);
    }

    public final ajdp<T> i() {
        return this instanceof ajfz ? ((ajfz) this).ap_() : ajvo.a(new ajsv(this));
    }

    public final ajdx<T> j(ajfc<? super ajde<Throwable>, ? extends akuw<?>> ajfc) {
        return ajdx.a(f().g(ajfc));
    }

    public final <R> R k(ajfc<? super ajdx<T>, R> ajfc) {
        try {
            return ((ajfc) ajfv.a((Object) ajfc, "convert is null")).apply(this);
        } catch (Throwable th) {
            ajep.a(th);
            RuntimeException a = ajur.a(th);
        }
    }
}
