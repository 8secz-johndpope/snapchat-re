package defpackage;

import defpackage.ajdw.c;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: ajtj */
public class ajtj extends c implements ajej {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public ajtj(ThreadFactory threadFactory) {
        this.b = ajto.a(threadFactory);
    }

    public final ajej a(Runnable runnable) {
        return a(runnable, 0, null);
    }

    public final ajej a(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.c ? ajfq.INSTANCE : a(runnable, j, timeUnit, null);
    }

    public final ajtn a(Runnable runnable, long j, TimeUnit timeUnit, ajfo ajfo) {
        ajtn ajtn = new ajtn(ajvo.a(runnable), ajfo);
        if (ajfo != null && !ajfo.a(ajtn)) {
            return ajtn;
        }
        Future submit;
        if (j <= 0) {
            try {
                submit = this.b.submit(ajtn);
            } catch (RejectedExecutionException e) {
                if (ajfo != null) {
                    ajfo.b(ajtn);
                }
                ajvo.a(e);
            }
        } else {
            submit = this.b.schedule(ajtn, j, timeUnit);
        }
        ajtn.a(submit);
        return ajtn;
    }

    public final ajej b(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        runnable = ajvo.a(runnable);
        if (j2 <= 0) {
            Future submit;
            ajtg ajtg = new ajtg(runnable, this.b);
            if (j <= 0) {
                try {
                    submit = this.b.submit(ajtg);
                } catch (RejectedExecutionException e) {
                    ajvo.a(e);
                    return ajfq.INSTANCE;
                }
            }
            submit = this.b.schedule(ajtg, j, timeUnit);
            ajtg.a(submit);
            return ajtg;
        }
        ajtl ajtl = new ajtl(runnable);
        ajtl.a(this.b.scheduleAtFixedRate(ajtl, j, j2, timeUnit));
        return ajtl;
    }

    public final ajej b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future submit;
        ajtm ajtm = new ajtm(ajvo.a(runnable));
        if (j <= 0) {
            try {
                submit = this.b.submit(ajtm);
            } catch (RejectedExecutionException e) {
                ajvo.a(e);
                return ajfq.INSTANCE;
            }
        }
        submit = this.b.schedule(ajtm, j, timeUnit);
        ajtm.a(submit);
        return ajtm;
    }

    public void dispose() {
        if (!this.c) {
            this.c = true;
            this.b.shutdownNow();
        }
    }

    public boolean isDisposed() {
        return this.c;
    }
}
