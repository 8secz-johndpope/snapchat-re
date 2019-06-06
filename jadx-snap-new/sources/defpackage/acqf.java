package defpackage;

import defpackage.alhh.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acqf */
public final class acqf {
    public List<String> a;
    public aljr b;
    public alhh c;
    public alhi d;
    public boolean e;
    public boolean f;
    public int g;
    private alhj h;

    public acqf(alhj alhj) {
        this.a = new ArrayList();
        if (alhj.b != null) {
            for (a aVar : alhj.b.c) {
                this.a.add(aVar.b);
            }
        } else if (alhj.c != null) {
            this.a.add(alhj.c.b);
        }
        this.h = alhj;
        this.c = alhj.b;
        this.d = alhj.c;
        this.g = alhj.d;
    }

    public acqf(aljr aljr, boolean z, boolean z2) {
        this.a = new ArrayList();
        if (aljr.a != null) {
            if (!(aljr.a.b == null || aljr.a.b.c == null)) {
                for (a aVar : aljr.a.b.c) {
                    this.a.add(aVar.b);
                }
            }
            this.b = aljr;
            this.h = aljr.a;
            this.c = null;
            this.d = null;
            this.e = z;
            this.f = z2;
            this.g = aljr.a.d;
        }
    }

    public final String toString() {
        Object[] objArr;
        String str;
        if (this.b != null) {
            objArr = new Object[]{Boolean.valueOf(this.e), Boolean.valueOf(this.f), this.b.toString()};
            str = "Ghost:%b, placeholder:%b, my-status: %s";
        } else {
            alhi alhi = this.d;
            if (alhi != null) {
                return alhi.toString();
            }
            alhh alhh = this.c;
            if (alhh != null) {
                return alhh.toString();
            }
            objArr = new Object[]{Integer.valueOf(this.g), this.h};
            str = "Version: %d. Explore status %s";
        }
        return String.format(str, objArr);
    }
}
