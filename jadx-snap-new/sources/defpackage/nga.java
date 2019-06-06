package defpackage;

import java.util.Random;

/* renamed from: nga */
public interface nga {

    /* renamed from: nga$a */
    public interface a<T> {
        void a();

        void a(T t);
    }

    /* renamed from: nga$b */
    public static final class b {
        static {
            b bVar = new b();
        }

        private b() {
        }

        public static long a(int i, Random random) {
            akcr.b(random, "randomJitter");
            if (i <= 0) {
                return 0;
            }
            long min = (1 << Math.min(i - 1, 29)) * 1000;
            if (min <= 0) {
                min = 30000;
            }
            long min2 = Math.min(min, 30000) / 2;
            return min2 + Math.abs(random.nextLong() % min2);
        }
    }

    /* renamed from: nga$c */
    public static final class c {
        public static final c a = new c();

        private c() {
        }
    }

    /* renamed from: nga$d */
    public interface d extends a<aljb> {
    }

    /* renamed from: nga$e */
    public interface e extends a<alke> {
    }

    void a(ncp ncp, e eVar);

    void a(a<alhe> aVar);

    void a(d dVar);
}
