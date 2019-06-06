package defpackage;

/* renamed from: acqt */
public final class acqt {
    private final acpv a;

    public acqt(acpv acpv) {
        akcr.b(acpv, "exploreDataSource");
        this.a = acpv;
    }

    public static acvs a(acqs acqs, adbr adbr) {
        akcr.b(adbr, "mapStatusBitmapProvider");
        if ((acqs != null ? acqs.a : null) == null) {
            return null;
        }
        return (((CharSequence) acqs.a).length() == 0 ? 1 : null) == null ? new acwa(adbr, acqs.b, acqs.a) : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARNING: Missing block: B:14:0x003b, code skipped:
            if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Missing block: B:22:0x0054, code skipped:
            if (r2 != null) goto L_0x003d;
     */
    public final defpackage.acqs a(java.lang.String r9, java.lang.String r10, defpackage.alhq r11) {
        /*
        r8 = this;
        r0 = "friendId";
        defpackage.akcr.b(r9, r0);
        r0 = "friendLocation";
        defpackage.akcr.b(r11, r0);
        r0 = r8.a;
        r0 = r0.i();
        r1 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = defpackage.akcr.a(r9, r10);
        if (r0 == 0) goto L_0x0046;
    L_0x001a:
        r0 = r8.a;
        r0 = r0.g();
        r2 = "exploreDataSource.myExploreStatusesList";
        defpackage.akcr.a(r0, r2);
        r0 = defpackage.ajyu.g(r0);
        r0 = (defpackage.acqf) r0;
        if (r0 == 0) goto L_0x0044;
    L_0x002d:
        r2 = r0.b;
        if (r2 == 0) goto L_0x0044;
    L_0x0031:
        r2 = r2.a;
        if (r2 == 0) goto L_0x0044;
    L_0x0035:
        r2 = r2.b;
        if (r2 == 0) goto L_0x0044;
    L_0x0039:
        r2 = r2.c;
        if (r2 == 0) goto L_0x0044;
    L_0x003d:
        r2 = defpackage.ajyi.d(r2);
        r2 = (defpackage.alhh.a) r2;
        goto L_0x0057;
    L_0x0044:
        r2 = r1;
        goto L_0x0057;
    L_0x0046:
        r0 = r8.a;
        r0 = r0.b(r9);
        if (r0 == 0) goto L_0x0044;
    L_0x004e:
        r2 = r0.c;
        if (r2 == 0) goto L_0x0044;
    L_0x0052:
        r2 = r2.c;
        if (r2 == 0) goto L_0x0044;
    L_0x0056:
        goto L_0x003d;
    L_0x0057:
        if (r2 == 0) goto L_0x005e;
    L_0x0059:
        r3 = r2.g();
        goto L_0x005f;
    L_0x005e:
        r3 = r1;
    L_0x005f:
        if (r2 == 0) goto L_0x006a;
    L_0x0061:
        r11 = defpackage.acqe.a(r2, r11);
        r11 = java.lang.Boolean.valueOf(r11);
        goto L_0x006b;
    L_0x006a:
        r11 = r1;
    L_0x006b:
        r4 = new acqw;
        if (r2 == 0) goto L_0x0078;
    L_0x006f:
        r5 = r2.g;
        if (r5 == 0) goto L_0x0078;
    L_0x0073:
        r5 = r5.a();
        goto L_0x0079;
    L_0x0078:
        r5 = r1;
    L_0x0079:
        if (r2 == 0) goto L_0x0084;
    L_0x007b:
        r6 = r2.g;
        if (r6 == 0) goto L_0x0084;
    L_0x007f:
        r6 = r6.b();
        goto L_0x0085;
    L_0x0084:
        r6 = r1;
    L_0x0085:
        if (r2 == 0) goto L_0x0090;
    L_0x0087:
        r2 = r2.g;
        if (r2 == 0) goto L_0x0090;
    L_0x008b:
        r2 = r2.c();
        goto L_0x0091;
    L_0x0090:
        r2 = r1;
    L_0x0091:
        r7 = 8;
        r4.<init>(r5, r6, r2, r7);
        if (r0 == 0) goto L_0x00b9;
    L_0x0098:
        r2 = java.lang.Boolean.TRUE;
        r11 = defpackage.akcr.a(r11, r2);
        r2 = 1;
        r11 = r11 ^ r2;
        if (r11 == 0) goto L_0x00a3;
    L_0x00a2:
        goto L_0x00b9;
    L_0x00a3:
        r11 = r8.a;
        r11 = r11.b(r0);
        if (r11 != 0) goto L_0x00b3;
    L_0x00ab:
        r9 = defpackage.akcr.a(r9, r10);
        if (r9 == 0) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00b3;
    L_0x00b2:
        r2 = 0;
    L_0x00b3:
        r9 = new acqs;
        r9.<init>(r3, r2, r4);
        return r9;
    L_0x00b9:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqt.a(java.lang.String, java.lang.String, alhq):acqs");
    }
}
