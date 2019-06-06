package defpackage;

import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;

/* renamed from: ahzo */
public final class ahzo {
    public static ahzm a(aebf aebf) {
        ahzm ahzm = new ahzm();
        if (!(aebf.a == null || MessageNano.messageNanoEquals(aebf.a, new aebg()))) {
            ArrayList arrayList;
            aebg aebg = aebf.a;
            ahzp ahzp = new ahzp();
            if (aebg.a.length > 0) {
                arrayList = new ArrayList();
                for (adzo a : aebg.a) {
                    arrayList.add(aent.a(a));
                }
                if (!arrayList.isEmpty()) {
                    ahzp.a = arrayList;
                }
            }
            if (aebg.b.length > 0) {
                arrayList = new ArrayList();
                for (Object add : aebg.b) {
                    arrayList.add(add);
                }
                ahzp.b = arrayList;
            }
            if (aebg.c.length > 0) {
                arrayList = new ArrayList();
                for (adzo a2 : aebg.c) {
                    arrayList.add(aent.a(a2));
                }
                if (!arrayList.isEmpty()) {
                    ahzp.c = arrayList;
                }
            }
            if (aebg.d.length > 0) {
                arrayList = new ArrayList();
                for (adzo a22 : aebg.d) {
                    arrayList.add(aent.a(a22));
                }
                if (!arrayList.isEmpty()) {
                    ahzp.d = arrayList;
                }
            }
            if (aebg.e.length > 0) {
                arrayList = new ArrayList();
                for (adzo a222 : aebg.e) {
                    arrayList.add(aent.a(a222));
                }
                if (!arrayList.isEmpty()) {
                    ahzp.e = arrayList;
                }
            }
            if (aebg.f.length > 0) {
                arrayList = new ArrayList();
                for (adzo a2222 : aebg.f) {
                    arrayList.add(aent.a(a2222));
                }
                if (!arrayList.isEmpty()) {
                    ahzp.f = arrayList;
                }
            }
            if (aebg.g.length > 0) {
                arrayList = new ArrayList();
                for (adzy a3 : aebg.g) {
                    arrayList.add(aerl.a(a3));
                }
                if (!arrayList.isEmpty()) {
                    ahzp.g = arrayList;
                }
            }
            if (!(aebg.h == null || MessageNano.messageNanoEquals(aebg.h, new adsi()))) {
                ahzp.h = afjw.a(aebg.h);
            }
            if (aebg.i.length > 0) {
                arrayList = new ArrayList();
                for (adzo a22222 : aebg.i) {
                    arrayList.add(aent.a(a22222));
                }
                if (!arrayList.isEmpty()) {
                    ahzp.i = arrayList;
                }
            }
            if (aebg.j.length > 0) {
                arrayList = new ArrayList();
                for (adzo a222222 : aebg.j) {
                    arrayList.add(aent.a(a222222));
                }
                if (!arrayList.isEmpty()) {
                    ahzp.j = arrayList;
                }
            }
            if (aebg.k.length > 0) {
                arrayList = new ArrayList();
                for (aebs aebs : aebg.k) {
                    aicb aicb = new aicb();
                    aicb.a = Long.valueOf(aebs.a);
                    aicb.b = aebs.b;
                    aicb.c = Long.valueOf(aebs.c);
                    arrayList.add(aicb);
                }
                if (!arrayList.isEmpty()) {
                    ahzp.k = arrayList;
                }
            }
            ahzm.a = ahzp;
        }
        if (!(aebf.b == null || MessageNano.messageNanoEquals(aebf.b, new aebh()))) {
            ahzm.b = ahzt.a(aebf.b);
        }
        return ahzm;
    }
}
