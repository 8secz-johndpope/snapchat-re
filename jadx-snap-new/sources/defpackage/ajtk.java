package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ajtk */
public final class ajtk extends AtomicLong implements ThreadFactory {
    private String a;
    private int b;
    private boolean c;

    /* renamed from: ajtk$a */
    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public ajtk(String str) {
        this(str, 5, false);
    }

    public ajtk(String str, int i) {
        this(str, i, false);
    }

    public ajtk(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder(this.a);
        stringBuilder.append('-');
        stringBuilder.append(incrementAndGet());
        String stringBuilder2 = stringBuilder.toString();
        Thread aVar = this.c ? new a(runnable, stringBuilder2) : new Thread(runnable, stringBuilder2);
        aVar.setPriority(this.b);
        aVar.setDaemon(true);
        return aVar;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RxThreadFactory[");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
