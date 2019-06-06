package defpackage;

import defpackage.aclg.c;
import defpackage.aclg.d;
import java.util.EnumMap;

/* renamed from: aclh */
public final class aclh implements c {
    public final ackt a(aclg aclg, adbv adbv, addk addk, acqi acqi, zfw zfw) {
        aclg aclg2 = aclg;
        adbv adbv2 = adbv;
        acum t = aclg.t();
        ackj ackj = new ackj(aclg2.f, adbv2, aclg2.z);
        acta acta = new acta(aclg2.f, aclg2.z, adbv2);
        ackq ackq = r0;
        acta acta2 = acta;
        ackj ackj2 = ackj;
        acum acum = t;
        ackq ackq2 = new ackq(adbv, aclg2.l, aclg2.d, aclg2.f, aclg2.f.m, aclg.t(), aclg2.z, aclg2.s.a, aclg, addk, acqi, aclg2.y, zfw);
        acln acln = new acln(aclg2.d, aclg2.A, aclg2.f);
        ackm ackm = new ackm(aclg2.f, aclg2.b, aclg2.r, adbv, aclg2.z, aclg2.s.a);
        acup acup = new acup("sc-map-content", "sc-content-insert", ackj2, acta2, ackq, acln);
        acup acup2 = new acup("sc-map-heatmap", "sc-heat-insert", ackm);
        EnumMap enumMap = new EnumMap(d.class);
        enumMap.put(d.BOTTOM, ackj2);
        enumMap.put(d.TAP_ANIMATION, acta2);
        enumMap.put(d.CONTENT, ackq);
        enumMap.put(d.HEATMAP, ackm);
        enumMap.put(d.TOP, acln);
        return new ackt(aclg2.l, enumMap, acum, acup, acup2);
    }
}
