package android.arch.lifecycle;

import defpackage.f;
import defpackage.f.d;
import defpackage.j.b;
import defpackage.l;
import defpackage.r;
import java.util.Map.Entry;

public abstract class LiveData<T> {
    protected static final Object b = new Object();
    final Object a = new Object();
    protected int c = 0;
    protected volatile Object d;
    volatile Object e;
    private f<r<T>, a> f = new f();
    private int g;
    private boolean h;
    private boolean i;
    private final Runnable j;

    abstract class a {
        final r<T> a;
        boolean b;
        int c = -1;

        a(r<T> rVar) {
            this.a = rVar;
        }

        /* Access modifiers changed, original: final */
        public final void a(boolean z) {
            if (z != this.b) {
                this.b = z;
                int i = 1;
                Object obj = LiveData.this.c == 0 ? 1 : null;
                LiveData liveData = LiveData.this;
                int i2 = liveData.c;
                if (!this.b) {
                    i = -1;
                }
                liveData.c = i2 + i;
                if (obj != null && this.b) {
                    LiveData.this.a();
                }
                if (LiveData.this.c == 0 && !this.b) {
                    LiveData.this.b();
                }
                if (this.b) {
                    LiveData.this.a(this);
                }
            }
        }

        public abstract boolean a();

        /* Access modifiers changed, original: 0000 */
        public boolean a(l lVar) {
            return false;
        }

        /* Access modifiers changed, original: 0000 */
        public void b() {
        }
    }

    class LifecycleBoundObserver extends a implements GenericLifecycleObserver {
        private l d;

        LifecycleBoundObserver(l lVar, r<T> rVar) {
            super(rVar);
            this.d = lVar;
        }

        public final void a(l lVar, defpackage.j.a aVar) {
            if (this.d.getLifecycle().a() == b.DESTROYED) {
                LiveData.this.a(this.a);
            } else {
                a(a());
            }
        }

        /* Access modifiers changed, original: final */
        public final boolean a() {
            return this.d.getLifecycle().a().a(b.STARTED);
        }

        /* Access modifiers changed, original: final */
        public final boolean a(l lVar) {
            return this.d == lVar;
        }

        /* Access modifiers changed, original: final */
        public final void b() {
            this.d.getLifecycle().b(this);
        }
    }

    public LiveData() {
        Object obj = b;
        this.d = obj;
        this.e = obj;
        this.g = -1;
        this.j = new Runnable() {
            public final void run() {
                Object obj;
                synchronized (LiveData.this.a) {
                    obj = LiveData.this.e;
                    LiveData.this.e = LiveData.b;
                }
                LiveData.this.b(obj);
            }
        };
    }

    private static void a(String str) {
        if (!defpackage.b.a().a.b()) {
            StringBuilder stringBuilder = new StringBuilder("Cannot invoke ");
            stringBuilder.append(str);
            stringBuilder.append(" on a background thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void b(a aVar) {
        if (!aVar.b) {
            return;
        }
        if (aVar.a()) {
            int i = aVar.c;
            int i2 = this.g;
            if (i < i2) {
                aVar.c = i2;
                aVar.a.a(this.d);
                return;
            }
            return;
        }
        aVar.a(false);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            a aVar2;
            if (aVar2 == null) {
                d a = this.f.a();
                while (a.hasNext()) {
                    b((a) ((Entry) a.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
            b(aVar2);
            aVar2 = null;
        } while (this.i);
        this.h = false;
    }

    /* Access modifiers changed, original: protected */
    public void a(T t) {
        Object obj;
        synchronized (this.a) {
            obj = this.e == b ? 1 : null;
            this.e = t;
        }
        if (obj != null) {
            defpackage.b.a().b(this.j);
        }
    }

    public final void a(l lVar, r<T> rVar) {
        if (lVar.getLifecycle().a() != b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(lVar, rVar);
            a aVar = (a) this.f.a(rVar, lifecycleBoundObserver);
            if (aVar != null && !aVar.a(lVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (aVar == null) {
                lVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public void a(r<T> rVar) {
        a("removeObserver");
        a aVar = (a) this.f.b(rVar);
        if (aVar != null) {
            aVar.b();
            aVar.a(false);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    /* Access modifiers changed, original: protected */
    public void b(T t) {
        a("setValue");
        this.g++;
        this.d = t;
        a(null);
    }
}
