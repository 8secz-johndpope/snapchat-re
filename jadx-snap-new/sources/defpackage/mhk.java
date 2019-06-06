package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: mhk */
public interface mhk {

    /* renamed from: mhk$b */
    public static final class b implements mhk {
        public static final b a = new b();

        private b() {
        }

        public final long a(TimeUnit timeUnit) {
            akcr.b(timeUnit, "timeUnit");
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: mhk$a */
    public static final class a implements mhk {
        public static final a a = new a();

        private a() {
        }

        public final long a(TimeUnit timeUnit) {
            akcr.b(timeUnit, "timeUnit");
            return timeUnit == TimeUnit.NANOSECONDS ? SystemClock.elapsedRealtimeNanos() : timeUnit.convert(SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
        }
    }

    long a(TimeUnit timeUnit);
}
