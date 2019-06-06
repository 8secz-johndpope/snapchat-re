package defpackage;

import com.google.common.base.Preconditions;
import java.util.Locale;

/* renamed from: abrj */
public final class abrj<T> {
    public final long a;
    private final T b;

    public abrj(T t, long j) {
        Preconditions.checkNotNull(t);
        this.b = t;
        this.a = j;
    }

    public final T a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "TimestampedValue{time=%tT}", new Object[]{Long.valueOf(this.a)});
    }
}
