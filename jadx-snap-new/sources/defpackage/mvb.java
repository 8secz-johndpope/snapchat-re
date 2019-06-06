package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mvb */
public enum mvb {
    FRONT_FACING,
    REAR_FACING,
    MIXED_FACING,
    NONE;
    
    public static final a Companion = null;

    /* renamed from: mvb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        private static mvb a(String str) {
            akcr.b(str, "string");
            for (mvb mvb : mvb.values()) {
                if (akgb.a(mvb.name(), str, true)) {
                    return mvb;
                }
            }
            return mvb.NONE;
        }

        public static mvb a(List<String> list) {
            akcr.b(list, "strings");
            Iterable<String> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (String a : iterable) {
                arrayList.add(a.a(a));
            }
            List list2 = (List) arrayList;
            return list2.contains(mvb.MIXED_FACING) ? mvb.MIXED_FACING : (list2.contains(mvb.FRONT_FACING) && list2.contains(mvb.REAR_FACING)) ? mvb.MIXED_FACING : list2.contains(mvb.FRONT_FACING) ? mvb.FRONT_FACING : list2.contains(mvb.REAR_FACING) ? mvb.REAR_FACING : mvb.NONE;
        }
    }

    static {
        Companion = new a();
    }

    /* JADX WARNING: Missing block: B:9:0x001c, code skipped:
            return true;
     */
    public final boolean a(defpackage.mvb r5) {
        /*
        r4 = this;
        r0 = "other";
        defpackage.akcr.b(r5, r0);
        r0 = r4;
        r0 = (defpackage.mvb) r0;
        r1 = NONE;
        r2 = 0;
        if (r0 == r1) goto L_0x001d;
    L_0x000d:
        if (r5 != r1) goto L_0x0010;
    L_0x000f:
        goto L_0x001d;
    L_0x0010:
        r1 = MIXED_FACING;
        r3 = 1;
        if (r0 == r1) goto L_0x001c;
    L_0x0015:
        if (r5 != r1) goto L_0x0018;
    L_0x0017:
        goto L_0x001c;
    L_0x0018:
        if (r0 != r5) goto L_0x001b;
    L_0x001a:
        return r3;
    L_0x001b:
        return r2;
    L_0x001c:
        return r3;
    L_0x001d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvb.a(mvb):boolean");
    }
}
