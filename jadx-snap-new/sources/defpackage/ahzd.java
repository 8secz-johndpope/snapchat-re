package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ahzd */
public final class ahzd {
    public static aebd a(ahzb ahzb) {
        aebd aebd = new aebd();
        if (!(ahzb.a == null || ahzb.a.isEmpty())) {
            if (aebd.a == null) {
                aebd.a = new HashMap();
            }
            aebd.a.putAll(ahzb.a);
        }
        if (ahzb.b != null) {
            aebd.b = new aebq[ahzb.b.size()];
            for (int i = 0; i < ahzb.b.size(); i++) {
                aebq[] aebqArr = aebd.b;
                aibu aibu = (aibu) ahzb.b.get(i);
                aebq aebq = new aebq();
                if (aibu.a != null) {
                    aebq.a = aibu.a;
                }
                if (aibu.b != null) {
                    aebq.b = aibu.b;
                }
                if (aibu.c != null) {
                    aebq.c = aibu.c;
                }
                aebqArr[i] = aebq;
            }
        }
        return aebd;
    }

    public static ahzb a(aebd aebd) {
        ahzb ahzb = new ahzb();
        if (!(aebd.a == null || aebd.a.isEmpty())) {
            ahzb.a = aebd.a;
        }
        if (aebd.b.length > 0) {
            ArrayList arrayList = new ArrayList();
            for (aebq aebq : aebd.b) {
                aibu aibu = new aibu();
                if (!aebq.a.isEmpty()) {
                    aibu.a = aebq.a;
                }
                if (!aebq.b.isEmpty()) {
                    aibu.b = aebq.b;
                }
                if (!aebq.c.isEmpty()) {
                    aibu.c = aebq.c;
                }
                arrayList.add(aibu);
            }
            if (!arrayList.isEmpty()) {
                ahzb.b = arrayList;
            }
        }
        return ahzb;
    }
}
