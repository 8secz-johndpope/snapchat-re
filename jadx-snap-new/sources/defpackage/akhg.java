package defpackage;

import defpackage.akhs.a;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: akhg */
public final class akhg {
    private int a = 64;
    private int b = 5;
    private ExecutorService c;
    private final Deque<a> d = new ArrayDeque();
    private final Deque<a> e = new ArrayDeque();
    private final Deque<akhs> f = new ArrayDeque();

    private synchronized ExecutorService a() {
        if (this.c == null) {
            this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), akib.a("OkHttp Dispatcher", false));
        }
        return this.c;
    }

    private <T> void a(Deque<T> deque, T t, boolean z) {
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    b();
                }
                c();
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
    }

    private void b() {
        if (this.e.size() < this.a && !this.d.isEmpty()) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (c(aVar) < this.b) {
                    it.remove();
                    this.e.add(aVar);
                    a().execute(aVar);
                }
                if (this.e.size() >= this.a) {
                    break;
                }
            }
        }
    }

    private synchronized int c() {
        return this.e.size() + this.f.size();
    }

    private int c(a aVar) {
        int i = 0;
        for (a a : this.e) {
            if (a.a().equals(aVar.a())) {
                i++;
            }
        }
        return i;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(a aVar) {
        if (this.e.size() >= this.a || c(aVar) >= this.b) {
            this.d.add(aVar);
            return;
        }
        this.e.add(aVar);
        a().execute(aVar);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(akhs akhs) {
        this.f.add(akhs);
    }

    /* Access modifiers changed, original: final */
    public final void b(a aVar) {
        a(this.e, aVar, true);
    }

    /* Access modifiers changed, original: final */
    public final void b(akhs akhs) {
        a(this.f, akhs, false);
    }
}
