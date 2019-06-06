package defpackage;

import android.os.Handler;
import android.os.Looper;
import defpackage.abnn.b;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: abms */
public class abms extends Handler {
    protected final abss C;
    private final b a;

    private abms(abss abss, Looper looper) {
        super(looper);
        this.C = abss;
        this.a = null;
    }

    public abms(Looper looper) {
        this(abss.a(), looper);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    public final boolean k() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (post(new Runnable() {
            public final void run() {
                countDownLatch.countDown();
            }
        })) {
            try {
                if (!countDownLatch.await(4000, TimeUnit.MILLISECONDS)) {
                    if (this.C.f()) {
                        a();
                    } else {
                        b();
                    }
                    countDownLatch.await();
                }
                return true;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                if (!this.C.c()) {
                    return false;
                }
                throw new RuntimeException(e);
            }
        } else if (!this.C.c()) {
            return false;
        } else {
            throw new RuntimeException("Action was not taken but we were asked to wait for it.");
        }
    }
}
