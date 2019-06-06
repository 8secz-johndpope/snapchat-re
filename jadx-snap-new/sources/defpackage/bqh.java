package defpackage;

import android.util.Log;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.bqj.a;

/* renamed from: bqh */
public final class bqh implements bnk {
    private bnm a;
    private bnu b;
    private bqi c;
    private int d;
    private int e;

    /* renamed from: bqh$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bqh()};
        }
    }

    static {
        1 1 = new 1();
    }

    public final int a(bnl bnl, bnr bnr) {
        bqi bqi;
        long j;
        if (this.c == null) {
            this.c = bqj.a(bnl);
            bqi = this.c;
            if (bqi != null) {
                this.b.a(blg.a(null, "audio/raw", null, (bqi.b * bqi.d) * bqi.a, 32768, this.c.a, this.c.b, this.c.e, null, null, 0, null));
                this.d = this.c.c;
            } else {
                throw new bln("Unsupported or unrecognized wav header.");
            }
        }
        bqi = this.c;
        Object obj = (bqi.f == 0 || bqi.g == 0) ? null : 1;
        if (obj == null) {
            obj = this.c;
            byo.a((Object) bnl);
            byo.a(obj);
            bnl.a();
            bzc bzc = new bzc(8);
            while (true) {
                a a = a.a(bnl, bzc);
                if (a.a == bzo.f(UnlockablesModel.DATA)) {
                    bnl.b(8);
                    long c = bnl.c();
                    long j2 = a.b;
                    obj.f = c;
                    obj.g = j2;
                    this.a.a(this.c);
                    break;
                }
                StringBuilder stringBuilder = new StringBuilder("Ignoring unknown WAV chunk: ");
                stringBuilder.append(a.a);
                Log.w("WavHeaderReader", stringBuilder.toString());
                j = a.b + 8;
                if (a.a == bzo.f("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    bnl.b((int) j);
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                    stringBuilder2.append(a.a);
                    throw new bln(stringBuilder2.toString());
                }
            }
        }
        int a2 = this.b.a(bnl, 32768 - this.e, true);
        if (a2 != -1) {
            this.e += a2;
        }
        int i = this.e / this.d;
        if (i > 0) {
            j = this.c.a(bnl.c() - ((long) this.e));
            int i2 = i * this.d;
            this.e -= i2;
            this.b.a(j, 1, i2, this.e, null);
        }
        return a2 == -1 ? -1 : 0;
    }

    public final void a(long j, long j2) {
        this.e = 0;
    }

    public final void a(bnm bnm) {
        this.a = bnm;
        this.b = bnm.a(0, 1);
        this.c = null;
        bnm.a();
    }

    public final boolean a(bnl bnl) {
        return bqj.a(bnl) != null;
    }
}
