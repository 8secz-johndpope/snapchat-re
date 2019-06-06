package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: abmp */
public final class abmp implements ThreadFactory {
    private static final AtomicInteger a = new AtomicInteger(0);
    private final AtomicInteger b = new AtomicInteger(0);
    private final String c;
    private final int d;

    public abmp(String str) {
        this.c = str;
        this.d = 10;
    }

    public final Thread newThread(Runnable runnable) {
        int incrementAndGet = this.b.incrementAndGet();
        a.incrementAndGet();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append("-");
        stringBuilder.append(incrementAndGet);
        return new abmo(stringBuilder.toString(), runnable, 10);
    }
}
