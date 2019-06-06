package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ajcx */
public abstract class ajcx implements ajdb {
    public static ajcx a(long j, TimeUnit timeUnit) {
        return ajcx.a(j, timeUnit, ajwh.b);
    }

    public static ajcx a(long j, TimeUnit timeUnit, ajdw ajdw) {
        ajfv.a((Object) timeUnit, "unit is null");
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajii(j, timeUnit, ajdw));
    }

    public static ajcx a(ajda ajda) {
        ajfv.a((Object) ajda, "source is null");
        return ajvo.a(new ajhh(ajda));
    }

    public static <T> ajcx a(ajeb<T> ajeb) {
        ajfv.a((Object) ajeb, "single is null");
        return ajvo.a(new ajhu(ajeb));
    }

    public static ajcx a(ajev ajev) {
        ajfv.a((Object) ajev, "run is null");
        return ajvo.a(new ajhp(ajev));
    }

    private ajcx a(ajfb<? super ajej> ajfb, ajfb<? super Throwable> ajfb2, ajev ajev, ajev ajev2, ajev ajev3, ajev ajev4) {
        ajfv.a((Object) ajfb, "onSubscribe is null");
        ajfv.a((Object) ajfb2, "onError is null");
        ajfv.a((Object) ajev, "onComplete is null");
        ajfv.a((Object) ajev2, "onTerminate is null");
        ajfv.a((Object) ajev3, "onAfterTerminate is null");
        ajfv.a((Object) ajev4, "onDispose is null");
        return ajvo.a(new ajie(this, ajfb, ajfb2, ajev, ajev2, ajev3, ajev4));
    }

    public static <T> ajcx a(akuw<T> akuw) {
        ajfv.a((Object) akuw, "publisher is null");
        return ajvo.a(new ajhs(akuw));
    }

    public static ajcx a(akuw<? extends ajdb> akuw, int i, boolean z) {
        ajfv.a((Object) akuw, "sources is null");
        ajfv.a(i, "maxConcurrency");
        return ajvo.a(new ajhw(akuw, i, z));
    }

    public static ajcx a(Iterable<? extends ajdb> iterable) {
        ajfv.a((Object) iterable, "sources is null");
        return ajvo.a(new ajhg(iterable));
    }

    public static ajcx a(Runnable runnable) {
        ajfv.a((Object) runnable, "run is null");
        return ajvo.a(new ajht(runnable));
    }

    public static ajcx a(Callable<? extends ajdb> callable) {
        ajfv.a((Object) callable, "completableSupplier");
        return ajvo.a(new ajhi(callable));
    }

    public static ajcx a(ajdb... ajdbArr) {
        ajfv.a((Object) ajdbArr, "sources is null");
        return ajvo.a(new ajhf(ajdbArr));
    }

    private static NullPointerException a(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public static ajcx b(Iterable<? extends ajdb> iterable) {
        ajfv.a((Object) iterable, "sources is null");
        return ajvo.a(new ajia(iterable));
    }

    public static ajcx b(Throwable th) {
        ajfv.a((Object) th, "error is null");
        return ajvo.a(new ajho(th));
    }

    public static ajcx b(Callable<?> callable) {
        ajfv.a((Object) callable, "callable is null");
        return ajvo.a(new ajhq(callable));
    }

    public static ajcx b(ajdb... ajdbArr) {
        ajfv.a((Object) ajdbArr, "sources is null");
        return ajvo.a(new ajhx(ajdbArr));
    }

    public static ajcx c(Iterable<? extends ajdb> iterable) {
        ajfv.a((Object) iterable, "sources is null");
        return ajvo.a(new ajhz(iterable));
    }

    public static ajcx c(ajdb... ajdbArr) {
        ajfv.a((Object) ajdbArr, "sources is null");
        return ajvo.a(new ajhy(ajdbArr));
    }

    private ajcx d(long j, TimeUnit timeUnit, ajdw ajdw) {
        ajfv.a((Object) timeUnit, "unit is null");
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajhj(this, j, timeUnit, ajdw));
    }

    private static ajcx d(ajdb... ajdbArr) {
        ajfv.a((Object) ajdbArr, "sources is null");
        return ajvo.a(new ajhc(ajdbArr));
    }

    private static ajcx e(ajdb ajdb) {
        ajfv.a((Object) ajdb, "source is null");
        return ajdb instanceof ajcx ? ajvo.a((ajcx) ajdb) : ajvo.a(new ajhv(ajdb));
    }

    public final ajcx a(long j, TimeUnit timeUnit, ajdw ajdw, ajdb ajdb) {
        ajfv.a((Object) timeUnit, "unit is null");
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajih(this, j, timeUnit, ajdw, ajdb));
    }

    public final ajcx a(ajdb ajdb) {
        ajfv.a((Object) ajdb, "other is null");
        return ajcx.d(this, ajdb);
    }

    public final ajcx a(ajdc ajdc) {
        return ajcx.e(((ajdc) ajfv.a((Object) ajdc, "transformer is null")).a(this));
    }

    public final ajcx a(ajdw ajdw) {
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajic(this, ajdw));
    }

    public final ajcx a(ajfb<? super Throwable> ajfb) {
        ajfb ajfb2 = ajfu.d;
        ajev ajev = ajfu.c;
        ajev ajev2 = ajfu.c;
        return a(ajfb2, ajfb, ajev, ajev, ajev2, ajev2);
    }

    public final ajcx a(ajfc<? super Throwable, ? extends ajdb> ajfc) {
        ajfv.a((Object) ajfc, "errorMapper is null");
        return ajvo.a(new ajif(this, ajfc));
    }

    public final ajcx a(ajfl<? super Throwable> ajfl) {
        ajfv.a((Object) ajfl, "predicate is null");
        return ajvo.a(new ajid(this, ajfl));
    }

    public final <T> ajdj<T> a(ajdn<T> ajdn) {
        ajfv.a((Object) ajdn, "next is null");
        return ajvo.a(new ajlq(ajdn, this));
    }

    public final <T> ajdp<T> a(ajdt<T> ajdt) {
        ajfv.a((Object) ajdt, "next is null");
        return ajvo.a(new ajnd(this, ajdt));
    }

    public final <T> ajdx<T> a(T t) {
        ajfv.a((Object) t, "completionValue is null");
        return ajvo.a(new ajil(this, null, t));
    }

    public final ajej a(ajev ajev, ajfb<? super Throwable> ajfb) {
        ajfv.a((Object) ajfb, "onError is null");
        ajfv.a((Object) ajev, "onComplete is null");
        ajcz ajgn = new ajgn(ajfb, ajev);
        a(ajgn);
        return ajgn;
    }

    public final void a(ajcz ajcz) {
        NullPointerException e;
        ajfv.a((Object) ajcz, "s is null");
        try {
            ajcz = ajvo.a(this, ajcz);
            ajfv.a((Object) ajcz, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            b(ajcz);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            ajep.a(th);
            ajvo.a(th);
            e2 = ajcx.a(th);
        }
    }

    public final ajcx b(long j, TimeUnit timeUnit) {
        return d(j, timeUnit, ajwh.b);
    }

    public final ajcx b(long j, TimeUnit timeUnit, ajdw ajdw) {
        return d(j, timeUnit, ajdw);
    }

    public final ajcx b(ajdb ajdb) {
        ajfv.a((Object) ajdb, "next is null");
        return ajvo.a(new ajhd(this, ajdb));
    }

    public final ajcx b(ajdw ajdw) {
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajig(this, ajdw));
    }

    public final ajcx b(ajev ajev) {
        ajfb ajfb = ajfu.d;
        ajev ajev2 = ajfu.c;
        return a(ajfb, ajfb, ajev, ajev2, ajev2, ajfu.c);
    }

    public final ajcx b(ajfb<? super Throwable> ajfb) {
        ajfv.a((Object) ajfb, "onEvent is null");
        return ajvo.a(new ajhm(this, ajfb));
    }

    public final <T> ajdx<T> b(ajeb<T> ajeb) {
        ajfv.a((Object) ajeb, "next is null");
        return ajvo.a(new ajrs(ajeb, this));
    }

    public final void b() {
        ajcz ajgm = new ajgm();
        a(ajgm);
        ajgm.b();
    }

    public abstract void b(ajcz ajcz);

    public final ajcx c(long j, TimeUnit timeUnit) {
        return a(j, timeUnit, ajwh.b, null);
    }

    public final ajcx c(long j, TimeUnit timeUnit, ajdw ajdw) {
        return a(j, timeUnit, ajdw, null);
    }

    public final ajcx c(ajdb ajdb) {
        ajfv.a((Object) ajdb, "other is null");
        return ajvo.a(new ajhd(this, ajdb));
    }

    public final ajcx c(ajdw ajdw) {
        ajfv.a((Object) ajdw, "scheduler is null");
        return ajvo.a(new ajhk(this, ajdw));
    }

    public final ajcx c(ajev ajev) {
        ajfb ajfb = ajfu.d;
        ajev ajev2 = ajfu.c;
        return a(ajfb, ajfb, ajev2, ajev2, ajfu.c, ajev);
    }

    public final ajcx c(ajfb<? super ajej> ajfb) {
        ajfb ajfb2 = ajfu.d;
        ajev ajev = ajfu.c;
        ajev ajev2 = ajfu.c;
        return a(ajfb, ajfb2, ajev, ajev, ajev2, ajev2);
    }

    public final <T> ajdx<T> c(Callable<? extends T> callable) {
        ajfv.a((Object) callable, "completionValueSupplier is null");
        return ajvo.a(new ajil(this, callable, null));
    }

    public final Throwable c() {
        ajcz ajgm = new ajgm();
        a(ajgm);
        return ajgm.c();
    }

    public final ajcx d() {
        return ajvo.a(new ajhe(this));
    }

    public final ajcx d(ajdb ajdb) {
        ajfv.a((Object) ajdb, "other is null");
        return ajcx.b(this, ajdb);
    }

    public final ajcx d(ajev ajev) {
        ajfb ajfb = ajfu.d;
        ajev ajev2 = ajfu.c;
        ajev ajev3 = ajfu.c;
        return a(ajfb, ajfb, ajev2, ajev, ajev3, ajev3);
    }

    public final ajcx e(ajev ajev) {
        ajfb ajfb = ajfu.d;
        ajev ajev2 = ajfu.c;
        return a(ajfb, ajfb, ajev2, ajev2, ajev, ajfu.c);
    }

    public final ajej e() {
        ajcz ajgr = new ajgr();
        a(ajgr);
        return ajgr;
    }

    public final ajcx f(ajev ajev) {
        ajfv.a((Object) ajev, "onFinally is null");
        return ajvo.a(new ajhl(this, ajev));
    }

    public final <T> ajde<T> f() {
        return this instanceof ajfx ? ((ajfx) this).an_() : ajvo.a(new ajij(this));
    }

    public final <T> ajdj<T> g() {
        return this instanceof ajfy ? ((ajfy) this).ao_() : ajvo.a(new ajmd(this));
    }

    public final ajej g(ajev ajev) {
        ajfv.a((Object) ajev, "onComplete is null");
        ajcz ajgn = new ajgn(ajev);
        a(ajgn);
        return ajgn;
    }

    public final <T> ajdp<T> h() {
        return this instanceof ajfz ? ((ajfz) this).ap_() : ajvo.a(new ajik(this));
    }
}
