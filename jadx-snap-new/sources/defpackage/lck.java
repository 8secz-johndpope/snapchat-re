package defpackage;

import defpackage.mhs.b;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: lck */
public final class lck implements lcq {
    private final ConcurrentHashMap<b, abnb> a = new ConcurrentHashMap();

    public final abnb a(b bVar) {
        akcr.b(bVar, "identifier");
        return (abnb) this.a.get(bVar);
    }

    /* JADX WARNING: Missing block: B:9:0x003b, code skipped:
            if (r0 == null) goto L_0x003d;
     */
    public final defpackage.mhs.b a(defpackage.abnb r4) {
        /*
        r3 = this;
        r0 = "algorithm";
        defpackage.akcr.b(r4, r0);
        r0 = r3.a;
        r0 = r0.entrySet();
        r1 = "registry.entries";
        defpackage.akcr.a(r0, r1);
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
    L_0x0016:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0030;
    L_0x001c:
        r1 = r0.next();
        r2 = r1;
        r2 = (java.util.Map.Entry) r2;
        r2 = r2.getValue();
        r2 = (defpackage.abnb) r2;
        r2 = defpackage.akcr.a(r2, r4);
        if (r2 == 0) goto L_0x0016;
    L_0x002f:
        goto L_0x0031;
    L_0x0030:
        r1 = 0;
    L_0x0031:
        r1 = (java.util.Map.Entry) r1;
        if (r1 == 0) goto L_0x003d;
    L_0x0035:
        r0 = r1.getKey();
        r0 = (defpackage.mhs.b) r0;
        if (r0 != 0) goto L_0x0052;
    L_0x003d:
        r0 = java.util.UUID.randomUUID();
        r0 = r0.toString();
        r1 = new mhs$b;
        r1.<init>(r0);
        r0 = r3.a;
        r0 = (java.util.Map) r0;
        r0.put(r1, r4);
        r0 = r1;
    L_0x0052:
        r4 = "registry.entries.find { …egistry[it] = algorithm }";
        defpackage.akcr.a(r0, r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lck.a(abnb):mhs$b");
    }
}
