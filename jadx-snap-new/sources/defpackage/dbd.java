package defpackage;

import android.os.SystemClock;
import defpackage.nbt.a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: dbd */
public final class dbd extends dbc {
    private final AtomicLong a = new AtomicLong(0);
    private final AtomicLong b = new AtomicLong(0);
    private final AtomicLong c = new AtomicLong(0);
    private long d = 0;
    private int e = 0;
    private final abqo f;
    private final AtomicLong g;

    /* renamed from: dbd$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Missing block: B:9:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.nbt.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = 3;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r3 = 2;
            r2[r3] = r3;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0018 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0018 }
        L_0x0018:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dbd$1.<clinit>():void");
        }
    }

    public dbd(abqo abqo) {
        this.f = abqo;
        this.g = new AtomicLong(SystemClock.elapsedRealtime());
    }

    private boolean a(dbb dbb) {
        dau.a((Object) dbb, "Null value passed to getSnapshot!");
        dbb.c = this.c.get();
        dbb.b = this.b.get();
        dbb.a = this.a.get();
        synchronized (this.g) {
            dbb.d = this.d + (this.e == 0 ? 0 : SystemClock.elapsedRealtime() - this.g.get());
        }
        return true;
    }

    public final void a(int i) {
        if (!isDisposed()) {
            AtomicLong atomicLong;
            i = 1.a[i - 1];
            if (i == 1) {
                atomicLong = this.c;
            } else if (i != 2) {
                if (i == 3) {
                    this.a.incrementAndGet();
                }
                return;
            } else {
                atomicLong = this.b;
            }
            atomicLong.incrementAndGet();
        }
    }

    public final /* synthetic */ das b() {
        return new dbb();
    }

    public final void b(int i) {
        if (!isDisposed() && i == 4) {
            synchronized (this.g) {
                if (this.e == 0) {
                    this.g.set(SystemClock.elapsedRealtime());
                }
                this.e++;
            }
        }
    }

    public final void c(int i) {
        if (!isDisposed() && i == 4) {
            synchronized (this.g) {
                this.e--;
                if (this.e < 0) {
                    this.e = 0;
                } else if (this.e == 0) {
                    this.d += SystemClock.elapsedRealtime() - this.g.get();
                }
            }
        }
    }
}
