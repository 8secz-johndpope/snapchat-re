package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zgm */
public final class zgm extends AtomicBoolean {
    private String a;
    private int b;

    private zgm(String str, int i) {
        super(false);
        this.a = str;
        this.b = i;
    }

    public static zgm a(String str) {
        return new zgm(str, zgo.a());
    }

    public final void a() {
        if (compareAndSet(false, true)) {
            int i = this.b;
            if (i != -1) {
                zgo.a(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("Metric already captured.");
    }
}
