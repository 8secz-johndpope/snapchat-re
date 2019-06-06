package defpackage;

import java.util.Comparator;
import java.util.Map;

/* renamed from: acre */
public final class acre {

    /* renamed from: acre$a */
    static final class a<T> implements Comparator<alhm> {
        private /* synthetic */ Map a;

        a(Map map) {
            this.a = map;
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            alhm alhm = (alhm) obj2;
            Long l = (Long) this.a.get((alhm) obj);
            long j = Long.MAX_VALUE;
            long longValue = l != null ? l.longValue() : Long.MAX_VALUE;
            l = (Long) this.a.get(alhm);
            if (l != null) {
                j = l.longValue();
            }
            return longValue < j ? -1 : 1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    public static final void a(android.location.Location r8, defpackage.alhq r9, java.util.List<defpackage.alhm> r10) {
        /*
        r0 = "friendClusters";
        defpackage.akcr.b(r10, r0);
        r0 = new java.util.LinkedHashMap;
        r0.<init>();
        r0 = (java.util.Map) r0;
        if (r8 == 0) goto L_0x0023;
    L_0x000e:
        r1 = r8.getLatitude();
        r8 = r8.getLongitude();
    L_0x0016:
        r8 = com.google.common.geometry.S2LatLng.fromDegrees(r1, r8);
    L_0x001a:
        r8 = com.google.common.geometry.S2CellId.fromLatLng(r8);
        r8 = r8.id();
        goto L_0x0037;
    L_0x0023:
        if (r9 == 0) goto L_0x0030;
    L_0x0025:
        r8 = r9.c();
        r1 = (double) r8;
        r8 = r9.d();
        r8 = (double) r8;
        goto L_0x0016;
    L_0x0030:
        r8 = 0;
        r8 = com.google.common.geometry.S2LatLng.fromDegrees(r8, r8);
        goto L_0x001a;
    L_0x0037:
        r1 = r10.iterator();
    L_0x003b:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x006d;
    L_0x0041:
        r2 = r1.next();
        r2 = (defpackage.alhm) r2;
        r3 = r2.b();
        r3 = (double) r3;
        r5 = r2.c();
        r5 = (double) r5;
        r3 = com.google.common.geometry.S2LatLng.fromDegrees(r3, r5);
        r3 = com.google.common.geometry.S2CellId.fromLatLng(r3);
        r3 = r3.id();
        r3 = r3 - r8;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 >= 0) goto L_0x0065;
    L_0x0064:
        r3 = -r3;
    L_0x0065:
        r3 = java.lang.Long.valueOf(r3);
        r0.put(r2, r3);
        goto L_0x003b;
    L_0x006d:
        r8 = new acre$a;
        r8.<init>(r0);
        r8 = (java.util.Comparator) r8;
        defpackage.ajyq.a(r10, r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acre.a(android.location.Location, alhq, java.util.List):void");
    }
}
