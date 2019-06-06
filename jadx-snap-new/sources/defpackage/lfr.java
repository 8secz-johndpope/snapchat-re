package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: lfr */
public final class lfr {
    private static final akbl<aenr, Boolean> a = b.a;
    private static final akbl<aenr, Boolean> b = a.a;

    /* renamed from: lfr$b */
    static final class b extends akcs implements akbl<aenr, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aenr aenr = (aenr) obj;
            akcr.b(aenr, "geofilterResponse");
            Boolean bool = aenr.p;
            boolean z = false;
            if (!(bool != null ? bool.booleanValue() : false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: lfr$a */
    static final class a extends akcs implements akbl<aenr, Boolean> {
        public static final a a = new a();

        a() {
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
            r2 = this;
            r3 = (defpackage.aenr) r3;
            r0 = "geofilterResponse";
            defpackage.akcr.b(r3, r0);
            r3 = r3.v;
            r0 = 0;
            if (r3 == 0) goto L_0x001b;
        L_0x000c:
            r3 = r3.u;
            if (r3 == 0) goto L_0x001b;
        L_0x0010:
            r1 = defpackage.aepw.SNAPPABLE;
            r1 = r1.a();
            r3 = r3.contains(r1);
            goto L_0x001c;
        L_0x001b:
            r3 = 0;
        L_0x001c:
            if (r3 != 0) goto L_0x001f;
        L_0x001e:
            r0 = 1;
        L_0x001f:
            r3 = java.lang.Boolean.valueOf(r0);
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lfr$a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static final List<mux> a(List<? extends aenr> list, lfq lfq, mwg mwg, boolean z, boolean z2) {
        Collection arrayList;
        akcr.b(list, "receiver$0");
        akcr.b(lfq, "geofilterToLensMapper");
        akcr.b(mwg, "lensSource");
        int i = z2 ^ 1;
        akbl akbl = b;
        if (i != 0) {
            Collection arrayList2 = new ArrayList();
            for (Object next : list) {
                if (((Boolean) akbl.invoke(next)).booleanValue()) {
                    arrayList2.add(next);
                }
            }
            list = (List) arrayList2;
        }
        int i2 = z ^ 1;
        akbl akbl2 = a;
        if (i2 != 0) {
            arrayList = new ArrayList();
            for (Object next2 : r3) {
                if (((Boolean) akbl2.invoke(next2)).booleanValue()) {
                    arrayList.add(next2);
                }
            }
            list = (List) arrayList;
        }
        arrayList = new ArrayList();
        for (aenr a : r3) {
            mux a2 = lfq.a(a, mwg);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return (List) arrayList;
    }
}
