package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import defpackage.ajk.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: ajf */
public final class ajf implements a {
    private static final a n = new a();
    private static final Handler o = new Handler(Looper.getMainLooper(), new b());
    public final List<aoo> a;
    public final ajg b;
    public final aio c;
    final ExecutorService d;
    final boolean e;
    public boolean f;
    ajn<?> g;
    public boolean h;
    public boolean i;
    public Set<aoo> j;
    public ajk k;
    ajj<?> l;
    public volatile Future<?> m;
    private final a p;
    private final ExecutorService q;
    private Exception r;

    /* renamed from: ajf$a */
    static class a {
        a() {
        }
    }

    /* renamed from: ajf$b */
    static class b implements Callback {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final boolean handleMessage(Message message) {
            if (1 != message.what && 2 != message.what) {
                return false;
            }
            ajf ajf = (ajf) message.obj;
            if (1 != message.what) {
                ajf.a(ajf);
            } else if (ajf.f) {
                ajf.g.c();
            } else if (ajf.a.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            } else {
                ajf.l = new ajj(ajf.g, ajf.e);
                ajf.h = true;
                ajf.l.d();
                ajf.b.a(ajf.c, ajf.l);
                for (aoo aoo : ajf.a) {
                    if (!ajf.b(aoo)) {
                        ajf.l.d();
                        aoo.a(ajf.l);
                    }
                }
                ajf.l.e();
            }
            return true;
        }
    }

    public ajf(aio aio, ExecutorService executorService, ExecutorService executorService2, boolean z, ajg ajg) {
        this(aio, executorService, executorService2, z, ajg, n);
    }

    private ajf(aio aio, ExecutorService executorService, ExecutorService executorService2, boolean z, ajg ajg, a aVar) {
        this.a = new ArrayList();
        this.c = aio;
        this.d = executorService;
        this.q = executorService2;
        this.e = z;
        this.b = ajg;
        this.p = aVar;
    }

    public final void a(ajk ajk) {
        this.m = this.q.submit(ajk);
    }

    public final void a(ajn<?> ajn) {
        this.g = ajn;
        o.obtainMessage(1, this).sendToTarget();
    }

    public final void a(aoo aoo) {
        aps.a();
        if (this.h) {
            aoo.a(this.l);
        } else if (this.i) {
            aoo.a(this.r);
        } else {
            this.a.add(aoo);
        }
    }

    public final void a(Exception exception) {
        this.r = exception;
        o.obtainMessage(2, this).sendToTarget();
    }

    /* Access modifiers changed, original: final */
    public final boolean b(aoo aoo) {
        Set set = this.j;
        return set != null && set.contains(aoo);
    }
}
