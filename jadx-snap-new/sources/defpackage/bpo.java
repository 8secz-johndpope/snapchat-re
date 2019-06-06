package defpackage;

import android.util.SparseArray;
import defpackage.bqg.b;
import defpackage.bqg.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.opencv.imgproc.Imgproc;

/* renamed from: bpo */
public final class bpo implements c {
    private final int a;
    private final List<blg> b;

    public bpo() {
        this(0);
    }

    public bpo(int i) {
        this(0, Collections.emptyList());
    }

    public bpo(int i, List<blg> list) {
        List list2;
        this.a = i;
        if (!a(32) && list2.isEmpty()) {
            list2 = Collections.singletonList(blg.a(null, "application/cea-608"));
        }
        this.b = list2;
    }

    private bqd a(b bVar) {
        if (a(32)) {
            return new bqd(this.b);
        }
        bzc bzc = new bzc(bVar.d);
        List list = this.b;
        while (bzc.b() > 0) {
            int d = bzc.b + bzc.d();
            if (bzc.d() == Imgproc.COLOR_BGRA2YUV_YV12) {
                list = new ArrayList();
                int d2 = bzc.d() & 31;
                for (int i = 0; i < d2; i++) {
                    String str;
                    String e = bzc.e(3);
                    int d3 = bzc.d();
                    int i2 = 1;
                    if (((d3 & 128) != 0 ? 1 : null) != null) {
                        i2 = d3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                    }
                    list.add(blg.a(null, str, 0, e, i2));
                    bzc.d(2);
                }
            }
            bzc.c(d);
        }
        return new bqd(list);
    }

    private boolean a(int i) {
        return (i & this.a) != 0;
    }

    public final SparseArray<bqg> a() {
        return new SparseArray();
    }

    public final bqg a(int i, b bVar) {
        if (i == 2) {
            return new bpz(new bps());
        }
        if (i == 3 || i == 4) {
            return new bpz(new bpx(bVar.b));
        }
        if (i == 15) {
            return a(2) ? null : new bpz(new bpn(false, bVar.b));
        } else {
            if (i == 17) {
                return a(2) ? null : new bpz(new bpw(bVar.b));
            } else {
                if (i == 21) {
                    return new bpz(new bpv());
                }
                if (i == 27) {
                    return a(4) ? null : new bpz(new bpt(a(bVar), a(1), a(8)));
                } else {
                    if (i == 36) {
                        return new bpz(new bpu(a(bVar)));
                    }
                    if (i == 89) {
                        return new bpz(new bpq(bVar.c));
                    }
                    if (i != 138) {
                        if (i != 129) {
                            if (i != 130) {
                                if (i == Imgproc.COLOR_BGRA2YUV_YV12) {
                                    return a(16) ? null : new bqc(new bqe());
                                } else {
                                    if (i != 135) {
                                        return null;
                                    }
                                }
                            }
                        }
                        return new bpz(new bpl(bVar.b));
                    }
                    return new bpz(new bpp(bVar.b));
                }
            }
        }
    }
}
