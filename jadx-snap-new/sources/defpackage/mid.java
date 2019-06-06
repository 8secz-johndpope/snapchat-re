package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: mid */
public interface mid<I, R> {

    /* renamed from: mid$a */
    public static final class a {
        public static <I, R> ajdp<min> a(TimeUnit timeUnit) {
            akcr.b(timeUnit, "timeUnit");
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            return a;
        }

        public static <I, R> ajdp<R> a(mid<? super I, R> mid, I i) {
            Object i2 = mid.b(i).i();
            akcr.a(i2, "toSingle(input).toObservable()");
            return i2;
        }
    }

    ajdp<min> a(long j, TimeUnit timeUnit);

    R a(I i);

    ajdx<R> b(I i);

    ajdp<R> c(I i);
}
