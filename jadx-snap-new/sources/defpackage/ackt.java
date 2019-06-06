package defpackage;

import defpackage.aclg.d;
import defpackage.acup.a;
import java.util.EnumMap;

/* renamed from: ackt */
public final class ackt {
    public final EnumMap<d, a> a;
    public final acup[] b;
    final acyc c;
    private final acum d;

    public ackt(acyc acyc, EnumMap<d, a> enumMap, acum acum, acup... acupArr) {
        this.c = acyc;
        this.d = acum;
        this.a = enumMap;
        this.b = acupArr;
    }

    public final Object a(adbv adbv, cgi cgi, int i) {
        acmj j = adbv.j();
        if (j != null && adbv.e()) {
            acum acum = this.d;
            if (acum == null) {
                return null;
            }
            float latitude = (float) cgi.getLatitude();
            float longitude = (float) cgi.getLongitude();
            float f = adbv.b.density;
            acum.a[0] = latitude;
            acum.a[1] = longitude;
            j.a(2, acum.a, acum.b, f);
            float[] fArr = acum.b;
            for (int length = this.b.length - 1; length >= 0; length--) {
                Object a = this.b[length].a(cgi, fArr[0], fArr[1], i);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    public final void a() {
        for (acup acup : this.b) {
            acup.f = 0;
        }
    }

    public final void a(acmj acmj) {
        for (acup acup : this.b) {
            if (acup.h != null) {
                acmj.a(acup.h, acup.f);
            }
        }
    }
}
