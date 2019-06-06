package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aizd */
public interface aizd {
    public static final aizd a = new 1();

    /* renamed from: aizd$1 */
    class 1 implements aizd {
        private long b = (TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis()) - System.nanoTime());

        1() {
        }

        public final long a() {
            return System.nanoTime() + this.b;
        }
    }

    long a();
}
