package defpackage;

import android.util.Log;
import android.util.Pair;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.bqg.d;
import java.util.Arrays;
import java.util.Collections;
import org.opencv.imgproc.Imgproc;

/* renamed from: bpn */
public final class bpn implements bpr {
    private static final byte[] b = new byte[]{(byte) 73, (byte) 68, (byte) 51};
    long a;
    private final boolean c;
    private final bzb d;
    private final bzc e;
    private final String f;
    private String g;
    private bnu h;
    private bnu i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private long o;
    private int p;
    private bnu q;
    private long r;

    public bpn() {
        this(true, null);
    }

    public bpn(boolean z, String str) {
        this.d = new bzb(new byte[7]);
        this.e = new bzc(Arrays.copyOf(b, 10));
        c();
        this.c = z;
        this.f = str;
    }

    private void a(bnu bnu, long j, int i, int i2) {
        this.j = 3;
        this.k = i;
        this.q = bnu;
        this.r = j;
        this.p = i2;
    }

    private boolean a(bzc bzc, byte[] bArr, int i) {
        int min = Math.min(bzc.b(), i - this.k);
        bzc.a(bArr, this.k, min);
        this.k += min;
        return this.k == i;
    }

    private void b(bzc bzc) {
        byte[] bArr = bzc.a;
        int i = bzc.b;
        int i2 = bzc.c;
        while (i < i2) {
            int i3 = i + 1;
            i = bArr[i] & 255;
            if (this.l != RasterSource.DEFAULT_TILE_SIZE || i < 240 || i == 255) {
                int i4 = this.l;
                i |= i4;
                if (i != 329) {
                    if (i == 511) {
                        this.l = RasterSource.DEFAULT_TILE_SIZE;
                    } else if (i == 836) {
                        i = Imgproc.INTER_TAB_SIZE2;
                    } else if (i == 1075) {
                        d();
                    } else if (i4 != 256) {
                        this.l = 256;
                        i3--;
                    }
                    i = i3;
                } else {
                    i = 768;
                }
                this.l = i;
                i = i3;
            } else {
                boolean z = true;
                if ((i & 1) != 0) {
                    z = false;
                }
                this.m = z;
                e();
            }
            bzc.c(i3);
            return;
        }
        bzc.c(i);
    }

    private void c(bzc bzc) {
        int min = Math.min(bzc.b(), this.p - this.k);
        this.q.a(bzc, min);
        this.k += min;
        int i = this.k;
        int i2 = this.p;
        if (i == i2) {
            this.q.a(this.a, 1, i2, 0, null);
            this.a += this.r;
            c();
        }
    }

    private void d() {
        this.j = 1;
        this.k = 3;
        this.p = 0;
        this.e.c(0);
    }

    private void e() {
        this.j = 2;
        this.k = 0;
    }

    private void f() {
        this.i.a(this.e, 10);
        this.e.c(6);
        a(this.i, 0, 10, this.e.n() + 10);
    }

    private void g() {
        int c;
        this.d.a(0);
        if (this.n) {
            this.d.b(10);
        } else {
            c = this.d.c(2) + 1;
            if (c != 2) {
                StringBuilder stringBuilder = new StringBuilder("Detected audio object type: ");
                stringBuilder.append(c);
                stringBuilder.append(", but assuming AAC LC.");
                Log.w("AdtsReader", stringBuilder.toString());
                c = 2;
            }
            int c2 = this.d.c(4);
            this.d.b(1);
            byte[] a = byr.a(c, c2, this.d.c(3));
            Pair a2 = byr.a(a);
            blg a3 = blg.a(this.g, "audio/mp4a-latm", null, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(a), null, 0, this.f);
            this.o = 1024000000 / ((long) a3.t);
            this.h.a(a3);
            this.n = true;
        }
        this.d.b(4);
        c = (this.d.c(13) - 2) - 5;
        if (this.m) {
            c -= 2;
        }
        int i = c;
        a(this.h, this.o, 0, i);
    }

    public final void a() {
        c();
    }

    public final void a(long j, boolean z) {
        this.a = j;
    }

    public final void a(bnm bnm, d dVar) {
        dVar.a();
        this.g = dVar.c();
        this.h = bnm.a(dVar.b(), 1);
        if (this.c) {
            dVar.a();
            this.i = bnm.a(dVar.b(), 4);
            this.i.a(blg.b(dVar.c(), "application/id3"));
            return;
        }
        this.i = new bnj();
    }

    public final void a(bzc bzc) {
        while (bzc.b() > 0) {
            int i = this.j;
            if (i == 0) {
                b(bzc);
            } else if (i != 1) {
                if (i == 2) {
                    if (a(bzc, this.d.a, this.m ? 7 : 5)) {
                        g();
                    }
                } else if (i == 3) {
                    c(bzc);
                }
            } else if (a(bzc, this.e.a, 10)) {
                f();
            }
        }
    }

    public final void b() {
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }
}
