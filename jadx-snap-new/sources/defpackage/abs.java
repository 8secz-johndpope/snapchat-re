package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: abs */
final class abs {
    final Map<String, a> a = new HashMap();
    final b b = new b();

    /* renamed from: abs$a */
    static class a {
        final Lock a = new ReentrantLock();
        int b;

        a() {
        }
    }

    /* renamed from: abs$b */
    static class b {
        final Queue<a> a = new ArrayDeque();

        b() {
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

    abs() {
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) ahl.a(this.a.get(str), "Argument must not be null");
            if (aVar.b > 0) {
                aVar.b--;
                if (aVar.b == 0) {
                    a aVar2 = (a) this.a.remove(str);
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
                        stringBuilder.append(", safeKey: ");
                        stringBuilder.append(str);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
            } else {
                StringBuilder stringBuilder2 = new StringBuilder("Cannot release a lock that is not held, safeKey: ");
                stringBuilder2.append(str);
                stringBuilder2.append(", interestedThreads: ");
                stringBuilder2.append(aVar.b);
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        aVar.a.unlock();
    }
}
