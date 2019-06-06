package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ajdj */
public abstract class ajdj<T> implements ajdn<T> {
    public static <T> ajde<T> a(ajdn<? extends T> ajdn, ajdn<? extends T> ajdn2) {
        ajfv.a((Object) ajdn, "source1 is null");
        ajfv.a((Object) ajdn2, "source2 is null");
        return ajdj.a(ajdn, ajdn2);
    }

    public static <T> ajde<T> a(akuw<? extends ajdn<? extends T>> akuw) {
        ajfv.a((Object) akuw, "source is null");
        ajfv.a(Integer.MAX_VALUE, "maxConcurrency");
        return ajvo.a(new ajjs(akuw, ajmz.INSTANCE, false, 1));
    }

    public static <T> ajde<T> a(Iterable<? extends ajdn<? extends T>> iterable) {
        ajfv.a((Object) iterable, "sources is null");
        return ajvo.a(new ajln(iterable));
    }

    private static <T> ajde<T> a(ajdn<? extends T>... ajdnArr) {
        ajfv.a((Object) ajdnArr, "sources is null");
        return ajvo.a(new ajlm(ajdnArr));
    }

    public static <T> ajdj<T> a(ajdm<T> ajdm) {
        ajfv.a((Object) ajdm, "onSubscribe is null");
        return ajvo.a(new ajlo(ajdm));
    }

    public static <T1, T2, R> ajdj<R> a(ajdn<? extends T1> ajdn, ajdn<? extends T2> ajdn2, ajex<? super T1, ? super T2, ? extends R> ajex) {
        ajfv.a((Object) ajdn, "source1 is null");
        ajfv.a((Object) ajdn2, "source2 is null");
        return ajdj.a(ajfu.a((ajex) ajex), ajdn, ajdn2);
    }

    public static <T, R> ajdj<R> a(ajfc<? super Object[], ? extends R> ajfc, ajdn<? extends T>... ajdnArr) {
        ajfv.a((Object) ajdnArr, "sources is null");
        if (ajdnArr.length == 0) {
            return ajvo.a(ajlu.a);
        }
        ajfv.a((Object) ajfc, "zipper is null");
        return ajvo.a(new ajnc(ajdnArr, ajfc));
    }

    public static <T> ajdj<T> a(Callable<? extends ajdn<? extends T>> callable) {
        ajfv.a((Object) callable, "maybeSupplier is null");
        return ajvo.a(new ajlp(callable));
    }

    public static <T> ajdj<T> b(T t) {
        ajfv.a((Object) t, "item is null");
        return ajvo.a(new ajmj(t));
    }

    public static <T> ajdj<T> b(Throwable th) {
        ajfv.a((Object) th, "exception is null");
        return ajvo.a(new ajlv(th));
    }

    public static <T> ajdj<T> b(Callable<? extends T> callable) {
        ajfv.a((Object) callable, "callable is null");
        return ajvo.a(new ajmc(callable));
    }

    private <E extends ajdl<? super T>> E c(E e) {
        b((ajdl) e);
        return e;
    }

    public final ajdj<T> a(ajdn<? extends T> ajdn) {
        ajfv.a((Object) ajdn, "next is null");
        return g(ajfu.b((Object) ajdn));
    }

    public final ajdj<T> a(ajdw ajdw) {
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajmn(this, ajdw));
    }

    public final ajdj<T> a(ajev ajev) {
        ajfv.a((Object) ajev, "onFinally is null");
        return ajvo.a(new ajls(this, ajev));
    }

    public final ajdj<T> a(ajfb<? super Throwable> ajfb) {
        ajfb ajfb2 = ajfu.d;
        ajfb ajfb3 = (ajfb) ajfv.a((Object) ajfb, "onError is null");
        ajev ajev = ajfu.c;
        return ajvo.a(new ajmr(this, ajfb2, ajfb2, ajfb3, ajev, ajev, ajfu.c));
    }

    public final <R> ajdj<R> a(ajfc<? super T, ? extends ajdn<? extends R>> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajmb(this, ajfc));
    }

    public final ajdj<T> a(ajfl<? super T> ajfl) {
        ajfv.a((Object) ajfl, "predicate is null");
        return ajvo.a(new ajlw(this, ajfl));
    }

    public final ajdx<T> a(ajeb<? extends T> ajeb) {
        ajfv.a((Object) ajeb, "other is null");
        return ajvo.a(new ajmu(this, ajeb));
    }

    public final ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2) {
        return a((ajfb) ajfb, (ajfb) ajfb2, ajfu.c);
    }

    public final ajej a(ajfb<? super T> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev) {
        ajfv.a((Object) ajfb, "onSuccess is null");
        ajfv.a((Object) ajfb2, "onError is null");
        ajfv.a((Object) ajev, "onComplete is null");
        return (ajej) c(new ajll(ajfb, ajfb2, ajev));
    }

    public abstract void a(ajdl<? super T> ajdl);

    public final ajdj<T> b(ajdn<? extends T> ajdn) {
        ajfv.a((Object) ajdn, "other is null");
        return ajvo.a(new ajmt(this, ajdn));
    }

    public final ajdj<T> b(ajdw ajdw) {
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajms(this, ajdw));
    }

    public final ajdj<T> b(ajev ajev) {
        ajfb ajfb = ajfu.d;
        ajfb ajfb2 = ajfu.d;
        ajev ajev2 = ajfu.c;
        return ajvo.a(new ajmr(this, ajfb, ajfb, ajfb2, ajev2, ajev2, (ajev) ajfv.a((Object) ajev, "onDispose is null")));
    }

    public final ajdj<T> b(ajfb<? super ajej> ajfb) {
        ajfb ajfb2 = (ajfb) ajfv.a((Object) ajfb, "onSubscribe is null");
        ajfb ajfb3 = ajfu.d;
        ajev ajev = ajfu.c;
        return ajvo.a(new ajmr(this, ajfb2, ajfb3, ajfb3, ajev, ajev, ajfu.c));
    }

    public final ajdj<T> b(ajfl<? super Throwable> ajfl) {
        ajfv.a((Object) ajfl, "predicate is null");
        return ajvo.a(new ajmo(this, ajfl));
    }

    public final <R> ajdp<R> b(ajfc<? super T, ? extends ajdt<? extends R>> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajng(this, ajfc));
    }

    public final T b() {
        ajdl ajgm = new ajgm();
        b(ajgm);
        return ajgm.b();
    }

    public final void b(ajdl<? super T> ajdl) {
        ajfv.a((Object) ajdl, "observer is null");
        ajdl a = ajvo.a(this, (ajdl) ajdl);
        ajfv.a((Object) a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            a(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ajep.a(th);
            new NullPointerException("subscribeActual failed").initCause(th);
        }
    }

    public final ajdj<T> c() {
        return ajvo.a(new ajlk(this));
    }

    public final ajdj<T> c(ajev ajev) {
        ajfb ajfb = ajfu.d;
        ajfb ajfb2 = ajfu.d;
        ajev ajev2 = (ajev) ajfv.a((Object) ajev, "onComplete is null");
        ajev ajev3 = ajfu.c;
        return ajvo.a(new ajmr(this, ajfb, ajfb, ajfb2, ajev2, ajev3, ajev3));
    }

    public final ajdj<T> c(ajfb<? super T> ajfb) {
        ajfb ajfb2 = ajfu.d;
        ajfb ajfb3 = (ajfb) ajfv.a((Object) ajfb, "onSubscribe is null");
        ajfb ajfb4 = ajfu.d;
        ajev ajev = ajfu.c;
        return ajvo.a(new ajmr(this, ajfb2, ajfb3, ajfb4, ajev, ajev, ajfu.c));
    }

    public final ajdj<T> c(T t) {
        ajfv.a((Object) t, "item is null");
        return b(ajdj.b((Object) t));
    }

    public final <R> ajdx<R> c(ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajlz(this, ajfc));
    }

    public final ajcx d() {
        return ajvo.a(new ajmg(this));
    }

    public final <R> ajdj<R> d(ajfc<? super T, ? extends ajeb<? extends R>> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajma(this, ajfc));
    }

    public final ajdx<T> d(T t) {
        ajfv.a((Object) t, "defaultValue is null");
        return ajvo.a(new ajna(this, t));
    }

    public final ajej d(ajfb<? super T> ajfb) {
        return a((ajfb) ajfb, ajfu.e, ajfu.c);
    }

    public final ajcx e(ajfc<? super T, ? extends ajdb> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajly(this, ajfc));
    }

    public final ajdx<Boolean> e() {
        return ajvo.a(new ajmi(this));
    }

    public final ajde<T> f() {
        return this instanceof ajfx ? ((ajfx) this).an_() : ajvo.a(new ajmx(this));
    }

    public final <R> ajdj<R> f(ajfc<? super T, ? extends R> ajfc) {
        ajfv.a((Object) ajfc, "mapper is null");
        return ajvo.a(new ajmk(this, ajfc));
    }

    public final ajdj<T> g(ajfc<? super Throwable, ? extends ajdn<? extends T>> ajfc) {
        ajfv.a((Object) ajfc, "resumeFunction is null");
        return ajvo.a(new ajmp(this, ajfc));
    }

    public final ajdp<T> g() {
        return this instanceof ajfz ? ((ajfz) this).ap_() : ajvo.a(new ajmy(this));
    }

    public final ajdj<T> h(ajfc<? super Throwable, ? extends T> ajfc) {
        ajfv.a((Object) ajfc, "valueSupplier is null");
        return ajvo.a(new ajmq(this, ajfc));
    }

    public final ajdx<T> h() {
        return ajvo.a(new ajna(this, null));
    }

    public final ajej i() {
        return a(ajfu.d, ajfu.e, ajfu.c);
    }
}
