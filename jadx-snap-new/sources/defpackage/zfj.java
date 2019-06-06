package defpackage;

import defpackage.zga.d;

/* renamed from: zfj */
public final class zfj extends zfu {
    private final idd b;
    private final Runnable c;

    private zfj(idd idd, Runnable runnable) {
        this.b = idd;
        this.c = runnable;
        this.a = idd.toString();
    }

    public static Runnable a(idd idd, Runnable runnable) {
        if (runnable instanceof zfj) {
            return runnable;
        }
        if (runnable instanceof d) {
            d dVar = (d) runnable;
            if (dVar.a instanceof zfj) {
                idd = ((zfj) dVar.a).b;
            }
        }
        return new zfj(idd, runnable);
    }

    public final void run() {
        try {
            zgf.a(this.b);
            this.c.run();
        } finally {
            zgf.b();
        }
    }
}
