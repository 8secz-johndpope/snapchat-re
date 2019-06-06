package defpackage;

import android.view.animation.Interpolator;
import defpackage.acum.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acwd */
public final class acwd {
    public final List<acvr> a = new ArrayList();
    public final Interpolator b = new acun();
    public final acum c;
    public final a<acvr> d = new 1();
    public float e;
    public acvc f;

    /* renamed from: acwd$1 */
    class 1 implements a<acvr> {
        1() {
        }

        public final int a() {
            return 2;
        }

        public final void a(float[] fArr, Iterable<acvr> iterable) {
            int i = 0;
            for (acvr acvr : iterable) {
                int i2 = i + 1;
                fArr[i] = (float) acvr.p.c;
                i = i2 + 1;
                fArr[i2] = (float) acvr.p.d;
            }
        }
    }

    public acwd(acum acum) {
        this.c = acum;
    }
}
