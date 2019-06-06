package defpackage;

import defpackage.kqe.c.a;
import defpackage.kqe.c.c;
import defpackage.kqe.c.d;
import defpackage.kqe.c.e;
import defpackage.kqe.c.f;
import defpackage.kqe.c.h;
import defpackage.mhk.b;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ksc */
public final class ksc implements ksf {
    private final ReentrantLock a;
    private boolean b;
    private final HashMap<ksd, ajwj<c>> c;
    private AtomicReference<ksg> d;
    private final kse e;
    private final mhk f;

    public /* synthetic */ ksc(kse kse) {
        this(kse, b.a);
    }

    private ksc(kse kse, mhk mhk) {
        akcr.b(kse, "lensExplorerEventReporter");
        akcr.b(mhk, "clock");
        this.e = kse;
        this.f = mhk;
        this.a = new ReentrantLock();
        this.c = new HashMap();
        this.d = new AtomicReference(null);
    }

    private final void a(ajwj<c> ajwj, long j) {
        Object obj = ajwj.a;
        akcr.a(obj, "timedEvent.value()");
        c cVar = (c) obj;
        j -= ajwj.b;
        if (j >= 100) {
            this.e.a(cVar);
        }
        if (j >= 1250) {
            this.e.a(cVar, j);
        }
    }

    public final void a(kqe.c cVar) {
        String str = "event";
        akcr.b(cVar, str);
        ajwj ajwj = null;
        ksg ksg;
        Lock lock;
        ksd ksd;
        if (cVar instanceof f) {
            ksg = new ksg(this.f.a(TimeUnit.MILLISECONDS));
            if (this.d.compareAndSet(null, ksg)) {
                this.e.a(ksg);
            }
        } else if (cVar instanceof h) {
            lock = this.a;
            lock.lock();
            try {
                this.b = true;
            } finally {
                lock.unlock();
            }
        } else if (cVar instanceof kqe.c.b) {
            lock = this.a;
            lock.lock();
            try {
                List list;
                if (this.b) {
                    this.b = false;
                    Object keySet = this.c.keySet();
                    akcr.a(keySet, "displayedItems.keys");
                    List<ksd> k = ajyu.k((Iterable) keySet);
                    LinkedList linkedList = new LinkedList();
                    for (ksd remove : k) {
                        ajwj = (ajwj) this.c.remove(remove);
                        if (ajwj != null) {
                            linkedList.add(ajwj);
                        }
                    }
                    list = linkedList;
                } else {
                    list = ajyw.a;
                }
                lock.unlock();
                for (ajwj ajwj2 : list) {
                    akcr.a((Object) ajwj2, "it");
                    a(ajwj2, this.f.a(TimeUnit.MILLISECONDS));
                }
            } catch (Throwable th) {
                lock.unlock();
            }
        } else if (cVar instanceof a) {
            ksg = (ksg) this.d.getAndSet(null);
            if (ksg != null) {
                this.e.b(ksg);
            }
        } else if (cVar instanceof e) {
            this.e.a((e) cVar);
        } else if (cVar instanceof c) {
            c cVar2 = (c) cVar;
            akcr.b(cVar2, str);
            ksd = new ksd(cVar2.b, cVar2.e);
            Lock lock2 = this.a;
            lock2.lock();
            try {
                if (((ajwj) this.c.get(ksd)) == null && this.b) {
                    this.c.put(ksd, new ajwj(cVar2, this.f.a(TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS));
                }
                lock2.unlock();
            } catch (Throwable th2) {
                lock2.unlock();
            }
        } else {
            if (cVar instanceof d) {
                d dVar = (d) cVar;
                akcr.b(dVar, str);
                ksd = new ksd(dVar.b, dVar.c);
                lock = this.a;
                lock.lock();
                try {
                    if (this.b) {
                        ajwj = (ajwj) this.c.remove(ksd);
                    }
                    lock.unlock();
                    if (ajwj != null) {
                        a(ajwj, this.f.a(TimeUnit.MILLISECONDS));
                    }
                } catch (Throwable th3) {
                    lock.unlock();
                }
            }
        }
    }
}
