package defpackage;

import java.util.List;

/* renamed from: tql */
public final class tql {
    public final acae a;
    public final abzx b;
    public final List<abzy> c;
    public final List<acab> d;
    public final Integer e;
    public final String f;
    private final ajxe g;

    /* renamed from: tql$a */
    static final class a extends akcs implements akbk<Boolean> {
        private /* synthetic */ tql a;

        a(tql tql) {
            this.a = tql;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z = false;
            int i = this.a.a != acae.UNFILTERED ? 1 : 0;
            if (this.a.b != null) {
                i++;
            }
            i += this.a.c.size();
            if (this.a.e != null) {
                i++;
            }
            if (!(this.a.d == null || (this.a.d.isEmpty() ^ 1) == 0)) {
                i++;
            }
            if (i > 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(tql.class), "hasMoreThanOneFilter", "getHasMoreThanOneFilter()Z");
    }

    public tql() {
        this(null, null, null, null, null, null, 63);
    }

    private tql(acae acae, abzx abzx, List<? extends abzy> list, List<? extends acab> list2, Integer num, String str) {
        akcr.b(acae, "visualFilterType");
        akcr.b(list, "geoFilters");
        akcr.b(list2, "venueFilters");
        this.a = acae;
        this.b = abzx;
        this.c = list;
        this.d = list2;
        this.e = num;
        this.f = str;
        this.g = ajxh.a(new a(this));
    }

    public /* synthetic */ tql(acae acae, abzx abzx, List list, List list2, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            acae = acae.UNFILTERED;
        }
        acae acae2 = acae;
        abzx abzx2 = (i & 2) != 0 ? null : abzx;
        if ((i & 4) != 0) {
            list = ajyw.a;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = ajyw.a;
        }
        this(acae2, abzx2, list3, list2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str);
    }

    public static /* synthetic */ tql a(tql tql, acae acae, abzx abzx, List list, List list2, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            acae = tql.a;
        }
        acae acae2 = acae;
        if ((i & 2) != 0) {
            abzx = tql.b;
        }
        abzx abzx2 = abzx;
        if ((i & 4) != 0) {
            list = tql.c;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = tql.d;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            num = tql.e;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            str = tql.f;
        }
        String str2 = str;
        akcr.b(acae2, "visualFilterType");
        akcr.b(list3, "geoFilters");
        akcr.b(list4, "venueFilters");
        return new tql(acae2, abzx2, list3, list4, num2, str2);
    }

    public final boolean a() {
        return ((Boolean) this.g.b()).booleanValue();
    }

    /* JADX WARNING: Missing block: B:14:0x0042, code skipped:
            if (defpackage.akcr.a(r2.f, r3.f) != false) goto L_0x0047;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0047;
    L_0x0002:
        r0 = r3 instanceof defpackage.tql;
        if (r0 == 0) goto L_0x0045;
    L_0x0006:
        r3 = (defpackage.tql) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0026:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x0030:
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0045;
    L_0x003a:
        r0 = r2.f;
        r3 = r3.f;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0045;
    L_0x0044:
        goto L_0x0047;
    L_0x0045:
        r3 = 0;
        return r3;
    L_0x0047:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tql.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        acae acae = this.a;
        int i = 0;
        int hashCode = (acae != null ? acae.hashCode() : 0) * 31;
        abzx abzx = this.b;
        hashCode = (hashCode + (abzx != null ? abzx.hashCode() : 0)) * 31;
        List list = this.c;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.d;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.e;
        hashCode = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SelectedFiltersInfo(visualFilterType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", motionFilterType=");
        stringBuilder.append(this.b);
        stringBuilder.append(", geoFilters=");
        stringBuilder.append(this.c);
        stringBuilder.append(", venueFilters=");
        stringBuilder.append(this.d);
        stringBuilder.append(", streakFilterStreakCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", selectedLensId=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
