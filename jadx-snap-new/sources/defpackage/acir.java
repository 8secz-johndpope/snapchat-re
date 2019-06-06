package defpackage;

import android.view.View;

/* renamed from: acir */
public final class acir implements acis {
    private final acis[] f;

    private acir(acis... acisArr) {
        this.f = acisArr;
    }

    public static acir a(acis... acisArr) {
        return new acir(acisArr);
    }

    public final acis a() {
        acis[] acisArr = new acis[this.f.length];
        int i = 0;
        while (true) {
            acis[] acisArr2 = this.f;
            if (i >= acisArr2.length) {
                return acir.a(acisArr);
            }
            acisArr[i] = acisArr2[i].a();
            i++;
        }
    }

    public final void a(View view, achi<?, ?> achi) {
        int i = 0;
        while (true) {
            acis[] acisArr = this.f;
            if (i < acisArr.length) {
                acisArr[i].a(view, achi);
                i++;
            } else {
                return;
            }
        }
    }

    public final void b(View view, achi<?, ?> achi) {
        int i = 0;
        while (true) {
            acis[] acisArr = this.f;
            if (i < acisArr.length) {
                acisArr[i].b(view, achi);
                i++;
            } else {
                return;
            }
        }
    }

    public final void c(View view, achi<?, ?> achi) {
        int i = 0;
        while (true) {
            acis[] acisArr = this.f;
            if (i < acisArr.length) {
                acisArr[i].c(view, achi);
                i++;
            } else {
                return;
            }
        }
    }
}
