package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: akb */
final class akb {
    final Map<aio, a> a = new HashMap();
    final b b = new b();

    /* renamed from: akb$a */
    static class a {
        final Lock a;
        int b;

        private a() {
            this.a = new ReentrantLock();
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: akb$b */
    static class b {
        final Queue<a> a;

        private b() {
            this.a = new ArrayDeque();
        }

        /* synthetic */ b(byte b) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final a a() {
            a aVar;
            synchronized (this.a) {
                aVar = (a) this.a.poll();
            }
            return aVar == null ? new a() : aVar;
        }
    }

    akb() {
    }

    /* Access modifiers changed, original: final */
    public final void a(aio aio) {
        a aVar;
        synchronized (this) {
            aVar = (a) this.a.get(aio);
            if (aVar != null) {
                if (aVar.b > 0) {
                    int i = aVar.b - 1;
                    aVar.b = i;
                    if (i == 0) {
                        a aVar2 = (a) this.a.remove(aio);
                        if (aVar2.equals(aVar)) {
                            b bVar = this.b;
                            synchronized (bVar.a) {
                                if (bVar.a.size() < 10) {
                                    bVar.a.offer(aVar2);
                                }
                            }
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("Removed the wrong lock, expected to remove: ");
                            stringBuilder.append(aVar);
                            stringBuilder.append(", but actually removed: ");
                            stringBuilder.append(aVar2);
                            stringBuilder.append(", key: ");
                            stringBuilder.append(aio);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                    }
                }
            }
            StringBuilder stringBuilder2 = new StringBuilder("Cannot release a lock that is not held, key: ");
            stringBuilder2.append(aio);
            stringBuilder2.append(", interestedThreads: ");
            stringBuilder2.append(aVar == null ? 0 : aVar.b);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        aVar.a.unlock();
    }
}
