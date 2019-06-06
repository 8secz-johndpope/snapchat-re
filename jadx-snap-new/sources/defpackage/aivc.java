package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: aivc */
public final class aivc {
    private static final AtomicLong b = new AtomicLong();
    public final long a;
    private final String c;

    private aivc(String str, long j) {
        this.c = str;
        this.a = j;
    }

    public static aivc a(String str) {
        return new aivc(str, b.incrementAndGet());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append("-");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
