package defpackage;

import defpackage.jf.a;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: abmk */
public final class abmk<T> implements a<T> {
    private final ReentrantLock a = new ReentrantLock();
    private final Object[] b = new Object[20];
    private int c;

    public final T a() {
        if (!this.a.tryLock()) {
            return null;
        }
        try {
            if (this.c > 0) {
                int i = this.c - 1;
                T t = this.b[i];
                this.b[i] = null;
                this.c--;
                return t;
            }
            this.a.unlock();
            return null;
        } finally {
            this.a.unlock();
        }
    }

    public final boolean a(T t) {
        if (!this.a.tryLock()) {
            return false;
        }
        boolean z;
        Object obj;
        int i = 0;
        while (true) {
            try {
                z = true;
                if (i >= this.c) {
                    obj = null;
                    break;
                } else if (this.b[i] == t) {
                    obj = 1;
                    break;
                } else {
                    i++;
                }
            } finally {
                this.a.unlock();
            }
        }
        if (obj != null) {
            throw new IllegalStateException("Already in the pool!");
        } else if (this.c < 20) {
            this.b[this.c] = t;
            this.c += z;
            return z;
        } else {
            this.a.unlock();
            return false;
        }
    }
}
