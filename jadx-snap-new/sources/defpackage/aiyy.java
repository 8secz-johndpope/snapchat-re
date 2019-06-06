package defpackage;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: aiyy */
public final class aiyy {
    public static final aiyy a = new aiyy(new 1());
    final IdentityHashMap<b<?>, a> b = new IdentityHashMap();
    ScheduledExecutorService c;
    private final c d;

    /* renamed from: aiyy$b */
    public interface b<T> {
        T a();

        void a(T t);
    }

    /* renamed from: aiyy$1 */
    class 1 implements c {
        1() {
        }

        public final ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(aixo.c("grpc-shared-destroyer-%d"));
        }
    }

    /* renamed from: aiyy$a */
    static class a {
        final Object a;
        int b;
        ScheduledFuture<?> c;

        a(Object obj) {
            this.a = obj;
        }
    }

    /* renamed from: aiyy$c */
    interface c {
        ScheduledExecutorService a();
    }

    private aiyy(c cVar) {
        this.d = cVar;
    }

    public static <T> T a(b<T> bVar, T t) {
        return a.b(bVar, t);
    }

    private synchronized <T> T b(final b<T> bVar, final T t) {
        final a aVar = (a) this.b.get(bVar);
        if (aVar != null) {
            boolean z = false;
            Preconditions.checkArgument(t == aVar.a, "Releasing the wrong instance");
            Preconditions.checkState(aVar.b > 0, "Refcount has already reached zero");
            aVar.b--;
            if (aVar.b == 0) {
                if (aixo.a) {
                    bVar.a(t);
                    this.b.remove(bVar);
                } else {
                    if (aVar.c == null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "Destroy task already scheduled");
                    if (this.c == null) {
                        this.c = this.d.a();
                    }
                    aVar.c = this.c.schedule(new aixy(new Runnable() {
                        public final void run() {
                            synchronized (aiyy.this) {
                                if (aVar.b == 0) {
                                    bVar.a(t);
                                    aiyy.this.b.remove(bVar);
                                    if (aiyy.this.b.isEmpty()) {
                                        aiyy.this.c.shutdown();
                                        aiyy.this.c = null;
                                    }
                                }
                            }
                        }
                    }), 1, TimeUnit.SECONDS);
                }
            }
        } else {
            throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(bVar)));
        }
        return null;
    }

    public final synchronized <T> T a(b<T> bVar) {
        a aVar;
        aVar = (a) this.b.get(bVar);
        if (aVar == null) {
            aVar = new a(bVar.a());
            this.b.put(bVar, aVar);
        }
        if (aVar.c != null) {
            aVar.c.cancel(false);
            aVar.c = null;
        }
        aVar.b++;
        return aVar.a;
    }
}
