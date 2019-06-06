package defpackage;

import android.graphics.Rect;
import android.util.Range;
import java.util.List;

/* renamed from: eim */
public final class eim implements doa {
    private final dug a;
    private final dqo b;

    public eim(dug dug, dqo dqo) {
        akcr.b(dug, "cameraTelemetry");
        akcr.b(dqo, "cameraStore");
        this.a = dug;
        this.b = dqo;
    }

    private static aabw a(edd edd) {
        aabw aabw = new aabw();
        List list = edd.i;
        String str = null;
        aabw.a(list != null ? list.toString() : null);
        list = edd.j;
        aabw.b(list != null ? list.toString() : null);
        list = edd.o;
        aabw.c(list != null ? list.toString() : null);
        list = edd.p;
        aabw.d(list != null ? list.toString() : null);
        list = edd.q;
        aabw.e(list != null ? list.toString() : null);
        list = edd.r;
        aabw.f(list != null ? list.toString() : null);
        list = edd.s;
        aabw.g(list != null ? list.toString() : null);
        list = edd.t;
        if (list != null) {
            str = list.toString();
        }
        aabw.h(str);
        aabw.c(Boolean.valueOf(edd.k));
        aabw.d(Boolean.valueOf(edd.l));
        aabw.e(Boolean.valueOf(edd.m));
        aabw.b(Long.valueOf((long) edd.n));
        aabw.c(Long.valueOf((long) edd.u));
        aabw.a(Double.valueOf((double) edd.v));
        aabw.b(Double.valueOf((double) edd.w));
        aabw.c(Double.valueOf((double) edd.x));
        return aabw;
    }

    public final void a(int i, boolean z, boolean z2, edd edd) {
        akcr.b(edd, "scCameraCapacity");
        if (this.b.a(z)) {
            aabw a = eim.a(edd);
            a.a(aabv.CAMERA1);
            a.a(Long.valueOf((long) i));
            a.a(Boolean.valueOf(z));
            a.b(Boolean.valueOf(z2));
            this.a.a(a);
        }
    }

    public final void a(ede[] edeArr, edc[] edcArr) {
        akcr.b(edeArr, "scCameraInfos");
        akcr.b(edcArr, "scCamera2Capacities");
        if (this.b.d() && edeArr.length == edcArr.length) {
            int length = edeArr.length;
            for (int i = 0; i < length; i++) {
                aabt aabt;
                edc edc = edcArr[i];
                ede ede = edeArr[i];
                aabw a = eim.a(edc);
                a.a(aabv.CAMERA2);
                String b = ede.b();
                String str = null;
                a.a(b != null ? akga.f(b) : null);
                a.a(Boolean.valueOf(ede.a()));
                a.b(ede.c());
                Rect rect = edc.a;
                a.i(rect != null ? rect.toString() : null);
                ebz ebz = edc.b;
                if (ebz == null) {
                    aabt = null;
                } else {
                    switch (ein.a[ebz.ordinal()]) {
                        case 1:
                            aabt = aabt.FULL;
                            break;
                        case 2:
                            aabt = aabt.LEGACY;
                            break;
                        case 3:
                            aabt = aabt.LEVEL_3;
                            break;
                        case 4:
                            aabt = aabt.LIMITED;
                            break;
                        case 5:
                            aabt = aabt.UNKNOWN;
                            break;
                        case 6:
                            aabt = aabt.UNUSED;
                            break;
                        default:
                            throw new ajxk();
                    }
                }
                a.a(aabt);
                a.d(Double.valueOf((double) edc.c));
                Range range = edc.d;
                a.j(range != null ? range.toString() : null);
                List list = edc.e;
                a.k(list != null ? list.toString() : null);
                a.d(Long.valueOf((long) edc.f));
                range = edc.g;
                a.l(range != null ? range.toString() : null);
                List list2 = edc.h;
                if (list2 != null) {
                    str = list2.toString();
                }
                a.m(str);
                this.a.a(a);
            }
        }
    }
}
