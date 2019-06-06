package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajuh */
public class ajuh extends AtomicInteger implements akuy {
    private akuy a;
    private long b;
    public volatile boolean c;
    public boolean d;
    private AtomicReference<akuy> e = new AtomicReference();
    private AtomicLong f = new AtomicLong();
    private AtomicLong g = new AtomicLong();
    private boolean h = false;

    private void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    private void d() {
        akuy akuy = null;
        long j = 0;
        int i = 1;
        do {
            akuy akuy2 = (akuy) this.e.get();
            if (akuy2 != null) {
                akuy2 = (akuy) this.e.getAndSet(null);
            }
            long j2 = this.f.get();
            if (j2 != 0) {
                j2 = this.f.getAndSet(0);
            }
            long j3 = this.g.get();
            if (j3 != 0) {
                j3 = this.g.getAndSet(0);
            }
            akuy akuy3 = this.a;
            if (this.c) {
                if (akuy3 != null) {
                    akuy3.b();
                    this.a = null;
                }
                if (akuy2 != null) {
                    akuy2.b();
                }
            } else {
                long j4 = this.b;
                if (j4 != Long.MAX_VALUE) {
                    j4 = ajum.a(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j3 = j4 - j3;
                        if (j3 < 0) {
                            ajui.c(j3);
                            j3 = 0;
                        }
                        j4 = j3;
                    }
                    this.b = j4;
                }
                if (akuy2 != null) {
                    this.a = akuy2;
                    if (j4 != 0) {
                        j = ajum.a(j, j4);
                        akuy = akuy2;
                    }
                } else if (!(akuy3 == null || j2 == 0)) {
                    j = ajum.a(j, j2);
                    akuy = akuy3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            akuy.a(j);
        }
    }

    public final void a(long j) {
        if (ajui.b(j) && !this.d) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j2 = this.b;
                if (j2 != Long.MAX_VALUE) {
                    j2 = ajum.a(j2, j);
                    this.b = j2;
                    if (j2 == Long.MAX_VALUE) {
                        this.d = true;
                    }
                }
                akuy akuy = this.a;
                if (decrementAndGet() != 0) {
                    d();
                }
                if (akuy != null) {
                    akuy.a(j);
                }
                return;
            }
            ajum.a(this.f, j);
            c();
        }
    }

    public void b() {
        if (!this.c) {
            this.c = true;
            c();
        }
    }

    public final void b(long j) {
        if (!this.d) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j2 = this.b;
                if (j2 != Long.MAX_VALUE) {
                    j2 -= j;
                    j = 0;
                    if (j2 < 0) {
                        ajui.c(j2);
                    } else {
                        j = j2;
                    }
                    this.b = j;
                }
                if (decrementAndGet() != 0) {
                    d();
                    return;
                }
                return;
            }
            ajum.a(this.g, j);
            c();
        }
    }

    public final void b(akuy akuy) {
        if (this.c) {
            akuy.b();
            return;
        }
        ajfv.a((Object) akuy, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            this.a = akuy;
            long j = this.b;
            if (decrementAndGet() != 0) {
                d();
            }
            if (j != 0) {
                akuy.a(j);
            }
            return;
        }
        this.e.getAndSet(akuy);
        c();
    }
}
