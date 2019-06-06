package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: myu */
public final class myu {

    /* renamed from: myu$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return ajvo.a(ajot.a);
        }
    }

    /* renamed from: myu$e */
    static final class e<T> implements ajdr<T> {
        private /* synthetic */ akbk a;
        private /* synthetic */ Object b = null;

        e(akbk akbk, Object obj) {
            this.a = akbk;
        }

        public final void subscribe(ajdq<T> ajdq) {
            akcr.b(ajdq, Event.EMITTER);
            if (!ajdq.isDisposed()) {
                ajdq.a((ajej) this.a.invoke());
                Object obj = this.b;
                if (obj != null) {
                    ajdq.a(obj);
                }
            }
        }
    }

    /* renamed from: myu$c */
    static final class c<T1, T2, R> implements ajex<T, K, ajxm<? extends T, ? extends K>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return ajxs.a(obj, obj2);
        }
    }

    /* renamed from: myu$d */
    static final class d<T1, T2, R> implements ajex<T, K, ajxm<? extends T, ? extends K>> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return ajxs.a(obj, obj2);
        }
    }

    /* renamed from: myu$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = ajdp.b((ajdt) ajdp.b(obj), (ajdt) ajvo.a(ajpu.a));
            akcr.a(obj, "Observable.merge(Observa…), Observable.never<T>())");
            return obj;
        }
    }

    public static final <R> ajdp<R> a(ajdp<?> ajdp) {
        akcr.b(ajdp, "receiver$0");
        Object u = ajdp.u(b.a);
        akcr.a(u, "switchMap { Observable.empty<R>() }");
        return u;
    }

    public static final <T, K> ajdp<ajxm<T, K>> a(ajdp<T> ajdp, ajdp<K> ajdp2) {
        akcr.b(ajdp, "first");
        akcr.b(ajdp2, "second");
        Object a = ajdp.a((ajdt) ajdp, (ajdt) ajdp2, (ajex) c.a);
        akcr.a(a, "Observable.combineLatest…ction { f, s -> f to s })");
        return a;
    }

    public static final <T> ajdp<T> a(akbk<? extends ajej> akbk) {
        akcr.b(akbk, "receiver$0");
        Object a = ajdp.a((ajdr) new e(akbk, null));
        akcr.a(a, "Observable.create { emit…}\n            }\n        }");
        akcr.a(a, "let { disposableProvider…        }\n        }\n    }");
        return a;
    }

    public static final <T> ajdp<T> b(ajdp<T> ajdp) {
        akcr.b(ajdp, "receiver$0");
        Object u = ajdp.u(a.a);
        akcr.a(u, "switchMap { always(it) }");
        return u;
    }

    public static final <T, K> ajdp<ajxm<T, K>> b(ajdp<T> ajdp, ajdp<K> ajdp2) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(ajdp2, "other");
        Object a = ajdp.a((ajdt) ajdp2, (ajex) d.a);
        akcr.a(a, "withLatestFrom(other, Bi…ction { f, s -> f to s })");
        return a;
    }

    public static final ajdp<Object> b(akbk<? extends ajej> akbk) {
        akcr.b(akbk, "receiver$0");
        return myu.a((akbk) akbk);
    }
}
