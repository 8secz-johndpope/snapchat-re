package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: adow */
public final class adow {
    public static final String a(aefi aefi, String str) {
        akcr.b(aefi, "receiver$0");
        akcr.b(str, "myUsername");
        Preconditions.checkArgument(aefi.b.isEmpty() ^ 1, "Chat conversation must have at least 1 participant", new Object[0]);
        Object obj = aefi.b;
        akcr.a(obj, "participants");
        for (Object next : (Iterable) obj) {
            if ((akcr.a((String) next, (Object) str) ^ 1) != 0) {
                break;
            }
        }
        Object next2 = null;
        String str2 = (String) next2;
        return str2 == null ? str : str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    public static final defpackage.adoz b(defpackage.aefi r20, java.lang.String r21) {
        /*
        r0 = r20;
        r1 = r21;
        r2 = "receiver$0";
        defpackage.akcr.b(r0, r2);
        r2 = "myUsername";
        defpackage.akcr.b(r1, r2);
        r2 = defpackage.adow.a(r20, r21);
        r3 = r0.c;
        if (r3 == 0) goto L_0x0036;
    L_0x0016:
        r3 = r0.c;
        r3 = r3.R;
        r4 = 0;
        if (r3 == 0) goto L_0x0023;
    L_0x001e:
        r6 = r3.longValue();
        goto L_0x0024;
    L_0x0023:
        r6 = r4;
    L_0x0024:
        r3 = r0.d;
        if (r3 == 0) goto L_0x0030;
    L_0x0028:
        r3 = r3.d;
        if (r3 == 0) goto L_0x0030;
    L_0x002c:
        r4 = r3.longValue();
    L_0x0030:
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x0036;
    L_0x0034:
        r3 = 1;
        goto L_0x0037;
    L_0x0036:
        r3 = 0;
    L_0x0037:
        if (r3 == 0) goto L_0x0082;
    L_0x0039:
        r3 = new adoz;
        r4 = r0.c;
        r5 = "lastSnap";
        defpackage.akcr.a(r4, r5);
        r4 = defpackage.adoy.a(r4, r1, r2);
        if (r4 == 0) goto L_0x004a;
    L_0x0048:
        r6 = r1;
        goto L_0x004b;
    L_0x004a:
        r6 = r2;
    L_0x004b:
        r7 = 0;
        r4 = r0.c;
        defpackage.akcr.a(r4, r5);
        r4 = defpackage.adoy.a(r4, r1, r2);
        if (r4 == 0) goto L_0x0059;
    L_0x0057:
        r8 = r2;
        goto L_0x005a;
    L_0x0059:
        r8 = r1;
    L_0x005a:
        r1 = r0.c;
        defpackage.akcr.a(r1, r5);
        r1 = defpackage.adoy.c(r1);
        r2 = r0.c;
        defpackage.akcr.a(r2, r5);
        r9 = defpackage.adoy.d(r2);
        r0 = r0.c;
        defpackage.akcr.a(r0, r5);
        r0 = defpackage.adoy.e(r0);
        r10 = defpackage.gcp.a.a(r0);
        r11 = 2;
        r4 = r3;
        r5 = r6;
        r6 = r7;
        r7 = r1;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11);
        return r3;
    L_0x0082:
        r1 = new adoz;
        r2 = r0.d;
        r3 = 0;
        if (r2 == 0) goto L_0x008d;
    L_0x0089:
        r2 = r2.c;
        r13 = r2;
        goto L_0x008e;
    L_0x008d:
        r13 = r3;
    L_0x008e:
        r2 = r0.d;
        if (r2 == 0) goto L_0x0096;
    L_0x0092:
        r2 = r2.e;
        r14 = r2;
        goto L_0x0097;
    L_0x0096:
        r14 = r3;
    L_0x0097:
        r2 = r0.d;
        if (r2 == 0) goto L_0x009f;
    L_0x009b:
        r2 = r2.d;
        r15 = r2;
        goto L_0x00a0;
    L_0x009f:
        r15 = r3;
    L_0x00a0:
        r2 = r0.d;
        if (r2 == 0) goto L_0x00a9;
    L_0x00a4:
        r2 = r2.a;
        r16 = r2;
        goto L_0x00ab;
    L_0x00a9:
        r16 = r3;
    L_0x00ab:
        r0 = r0.d;
        if (r0 == 0) goto L_0x00b4;
    L_0x00af:
        r0 = r0.b;
        r17 = r0;
        goto L_0x00b6;
    L_0x00b4:
        r17 = r3;
    L_0x00b6:
        r18 = 0;
        r19 = 32;
        r12 = r1;
        r12.<init>(r13, r14, r15, r16, r17, r18, r19);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adow.b(aefi, java.lang.String):adoz");
    }
}
