package defpackage;

import android.os.Handler;
import com.google.common.base.Supplier;
import defpackage.dpa.a;
import defpackage.dpa.b;

/* renamed from: doo */
public final class doo {
    public static aipn<doo> a;
    public final Supplier<Handler> b;

    /* renamed from: doo$3 */
    public class 3 implements Runnable {
        private /* synthetic */ dov a;
        private /* synthetic */ long b;

        public 3(dov dov, long j) {
            this.a = dov;
            this.b = j;
        }

        public final void run() {
            this.a.a(this.b);
        }
    }

    /* renamed from: doo$4 */
    public class 4 implements Runnable {
        private /* synthetic */ dov a;

        public 4(dov dov) {
            this.a = dov;
        }

        public final void run() {
            this.a.a();
        }
    }

    public doo(Supplier<Handler> supplier) {
        this.b = supplier;
    }

    public static doo a() {
        return (doo) a.get();
    }

    public static void a(dop dop, dpp dpp, abtl abtl, dnm dnm) {
        if (dop != null) {
            long currentTimeMillis = System.currentTimeMillis();
            dnz.a().a(abmb.CAMERA_OPENED);
            dop.a(dpp, abtl, currentTimeMillis, dnm);
        }
    }

    public final void a(final dom dom, final boolean z, final dpp dpp) {
        if (dom != null) {
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    dom.onAutoFocus(z, dpp);
                }
            });
        }
    }

    public final void a(final don don) {
        if (don != null) {
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    don.a();
                }
            });
        }
    }

    public final void a(final dop dop, final int i, final eca eca) {
        if (dop != null) {
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    dop.a();
                }
            });
        }
    }

    public final void a(final doq doq, final String str) {
        if (doq != null) {
            doq.d();
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    doq.a();
                }
            });
        }
    }

    public final void a(final dor dor, final float f) {
        if (dor != null) {
            ((Handler) this.b.get()).postDelayed(new Runnable() {
                public final void run() {
                    dor.onCameraZoomRatioChanged(f);
                }
            }, 200);
        }
    }

    public final void a(final doz doz, final String str) {
        if (doz != null) {
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                }
            });
        }
    }

    public final void a(dpa dpa, a aVar, String str, boolean z, int i, b bVar) {
        if (dpa != null) {
            final dpa dpa2 = dpa;
            final a aVar2 = aVar;
            final String str2 = str;
            final boolean z2 = z;
            final int i2 = i;
            final b bVar2 = bVar;
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    dpa2.a(aVar2, str2, z2, i2, bVar2);
                }
            });
        }
    }

    public final void a(dpa dpa, dpb dpb, Integer num, String str, long j, boolean z, int i, b bVar) {
        if (dpa != null) {
            dpa.a(dpb, num, str, j, z, i, bVar);
            final dpa dpa2 = dpa;
            final dpb dpb2 = dpb;
            final Integer num2 = num;
            final String str2 = str;
            final long j2 = j;
            final boolean z2 = z;
            final int i2 = i;
            final b bVar2 = bVar;
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    dpa2.a(dpb2, str2, j2, bVar2);
                }
            });
        }
    }

    public final void a(dpa dpa, boolean z, int i, b bVar, float f, float f2) {
        if (dpa != null) {
            dpa.a();
            final dpa dpa2 = dpa;
            final boolean z2 = z;
            final int i2 = i;
            final b bVar2 = bVar;
            final float f3 = f;
            final float f4 = f2;
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    dpa2.a(bVar2);
                }
            });
        }
    }

    public final void a(final dpc dpc, final String str) {
        if (dpc != null) {
            dpc.a(null);
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                }
            });
        }
    }

    public final void a(final dpc dpc, final String str, ebt ebt) {
        if (dpc != null) {
            dpc.a(ebt);
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                }
            });
        }
    }

    public final void b(final doq doq, final String str) {
        if (doq != null) {
            doq.d();
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    doq.b();
                }
            });
        }
    }

    public final void b(final doz doz, final String str) {
        if (doz != null) {
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                }
            });
        }
    }

    public final void c(final doq doq, final String str) {
        if (doq != null) {
            doq.d();
            ((Handler) this.b.get()).post(new Runnable() {
                public final void run() {
                    doq.c();
                }
            });
        }
    }
}
