package defpackage;

import android.util.Pair;
import com.google.common.base.Supplier;

/* renamed from: igu */
public final class igu {

    /* renamed from: igu$a */
    class a {
        T a;

        a() {
        }
    }

    /* renamed from: igu$b */
    public interface b {
    }

    /* renamed from: igu$1 */
    static class 1 implements ajev {
        1() {
        }

        public final void run() {
        }
    }

    /* renamed from: igu$2 */
    static class 2 implements ajfb<T> {
        2() {
        }

        public final void accept(T t) {
        }
    }

    public static ajev a() {
        return new 1();
    }

    public static ajfb<Throwable> a(String str) {
        return new -$$Lambda$igu$5p1MHN2h9RXNqanCfGW6lSa75Uk(-$$Lambda$jZTzHEtkH85NcnLpBRZ1rBqHCH4.INSTANCE, str, "Rx fail.", new Object[0]);
    }

    public static <T> ajfl<T> a(ajfl<T> ajfl) {
        return new -$$Lambda$igu$B2gxHkOGw6UGjWX0CTL3adgryFw(ajfl);
    }

    public static <T> Pair<ajej, Supplier<T>> a(ajdp<T> ajdp, T t) {
        a aVar = new a();
        aVar.a = t;
        return new Pair(ajdp.f(new -$$Lambda$igu$h0SOYyX69Y9UDjj409tZYx8H1vQ(aVar)), new -$$Lambda$igu$hEggtpEAJ5Adaa_eXp9dQuhxdgw(aVar));
    }

    private static /* synthetic */ void a(b bVar, String str, String str2, Object[] objArr, Throwable th) {
    }

    public static <T> ajfb<T> b() {
        return new 2();
    }
}
