package defpackage;

import defpackage.rzo.a;

/* renamed from: glx */
public final class glx implements a<ryz, glv, glq> {
    private final rzf.a a;
    private final int b;

    public glx(rzf.a aVar, int i) {
        akcr.b(aVar, "queueType");
        this.a = aVar;
        this.b = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f5 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f5 A:{SKIP} */
    public final /* synthetic */ defpackage.ryv a(java.lang.Object r10, java.lang.Object r11) {
        /*
        r9 = this;
        r10 = (defpackage.glv) r10;
        r11 = (defpackage.glq) r11;
        r0 = "pending";
        defpackage.akcr.b(r10, r0);
        r0 = "executing";
        defpackage.akcr.b(r11, r0);
        r11 = r11.a;
        r0 = r9.a;
        r11 = r11.get(r0);
        r11 = (java.util.List) r11;
        r0 = 0;
        if (r11 == 0) goto L_0x0020;
    L_0x001b:
        r11 = r11.size();
        goto L_0x0021;
    L_0x0020:
        r11 = 0;
    L_0x0021:
        r10 = r10.a;
        r1 = r9.a;
        r10 = r10.get(r1);
        r10 = (java.util.List) r10;
        r1 = 0;
        r2 = 1;
        if (r10 == 0) goto L_0x0040;
    L_0x002f:
        r3 = r10;
        r3 = (java.util.Collection) r3;
        r3 = r3.isEmpty();
        r3 = r3 ^ r2;
        if (r3 == 0) goto L_0x0040;
    L_0x0039:
        r10 = r10.get(r0);
        r10 = (defpackage.rzf) r10;
        goto L_0x0041;
    L_0x0040:
        r10 = r1;
    L_0x0041:
        if (r10 == 0) goto L_0x0050;
    L_0x0043:
        r3 = r10.a();
        r3 = (defpackage.ryz) r3;
        if (r3 == 0) goto L_0x0050;
    L_0x004b:
        r3 = r3.c();
        goto L_0x0051;
    L_0x0050:
        r3 = r1;
    L_0x0051:
        if (r3 == 0) goto L_0x005b;
    L_0x0053:
        r4 = r3;
        r4 = (java.util.Collection) r4;
        r4 = defpackage.rzh.a(r4);
        goto L_0x005c;
    L_0x005b:
        r4 = 0;
    L_0x005c:
        r5 = "receiver$0";
        if (r3 == 0) goto L_0x009d;
    L_0x0060:
        r6 = r3;
        r6 = (java.util.Collection) r6;
        defpackage.akcr.b(r6, r5);
        r7 = r6.isEmpty();
        r7 = r7 ^ r2;
        if (r7 == 0) goto L_0x009d;
    L_0x006d:
        r6 = (java.lang.Iterable) r6;
        r7 = r6;
        r7 = (java.util.Collection) r7;
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x0098;
    L_0x0078:
        r6 = r6.iterator();
    L_0x007c:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x0098;
    L_0x0082:
        r7 = r6.next();
        r7 = (defpackage.rzg) r7;
        r7 = r7.b;
        defpackage.akcr.b(r7, r5);
        r8 = defpackage.rzc.ForegroundPrefetch;
        if (r7 != r8) goto L_0x0093;
    L_0x0091:
        r7 = 1;
        goto L_0x0094;
    L_0x0093:
        r7 = 0;
    L_0x0094:
        if (r7 != 0) goto L_0x007c;
    L_0x0096:
        r6 = 0;
        goto L_0x0099;
    L_0x0098:
        r6 = 1;
    L_0x0099:
        if (r6 == 0) goto L_0x009d;
    L_0x009b:
        r6 = 1;
        goto L_0x009e;
    L_0x009d:
        r6 = 0;
    L_0x009e:
        if (r3 == 0) goto L_0x00dc;
    L_0x00a0:
        r3 = (java.util.Collection) r3;
        defpackage.akcr.b(r3, r5);
        r7 = r3.isEmpty();
        r7 = r7 ^ r2;
        if (r7 == 0) goto L_0x00dc;
    L_0x00ac:
        r3 = (java.lang.Iterable) r3;
        r7 = r3;
        r7 = (java.util.Collection) r7;
        r7 = r7.isEmpty();
        if (r7 != 0) goto L_0x00d7;
    L_0x00b7:
        r3 = r3.iterator();
    L_0x00bb:
        r7 = r3.hasNext();
        if (r7 == 0) goto L_0x00d7;
    L_0x00c1:
        r7 = r3.next();
        r7 = (defpackage.rzg) r7;
        r7 = r7.b;
        defpackage.akcr.b(r7, r5);
        r8 = defpackage.rzc.BackgroundPrefetch;
        if (r7 != r8) goto L_0x00d2;
    L_0x00d0:
        r7 = 1;
        goto L_0x00d3;
    L_0x00d2:
        r7 = 0;
    L_0x00d3:
        if (r7 != 0) goto L_0x00bb;
    L_0x00d5:
        r3 = 0;
        goto L_0x00d8;
    L_0x00d7:
        r3 = 1;
    L_0x00d8:
        if (r3 == 0) goto L_0x00dc;
    L_0x00da:
        r3 = 1;
        goto L_0x00dd;
    L_0x00dc:
        r3 = 0;
    L_0x00dd:
        if (r6 == 0) goto L_0x00e1;
    L_0x00df:
        r3 = 1;
        goto L_0x00f0;
    L_0x00e1:
        if (r4 != 0) goto L_0x00e9;
    L_0x00e3:
        if (r3 == 0) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00e9;
    L_0x00e6:
        r3 = r9.b;
        goto L_0x00f0;
    L_0x00e9:
        r3 = r9.b;
        r3 = r3 - r2;
        r3 = java.lang.Math.max(r2, r3);
    L_0x00f0:
        if (r11 >= r3) goto L_0x00f3;
    L_0x00f2:
        r0 = 1;
    L_0x00f3:
        if (r10 == 0) goto L_0x00ff;
    L_0x00f5:
        if (r0 == 0) goto L_0x00ff;
    L_0x00f7:
        r11 = new rzq;
        r11.<init>(r10);
        r11 = (defpackage.ryv) r11;
        return r11;
    L_0x00ff:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.glx.a(java.lang.Object, java.lang.Object):ryv");
    }
}
