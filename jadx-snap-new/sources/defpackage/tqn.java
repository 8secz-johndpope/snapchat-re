package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: tqn */
public final class tqn {
    public final boolean a;
    public final boolean b;
    public final tql c;
    public final tql d;
    private final ajxe e;
    private final ajxe f;

    /* renamed from: tqn$a */
    static final class a extends akcs implements akbk<List<? extends abzy>> {
        private /* synthetic */ tqn a;

        a(tqn tqn) {
            this.a = tqn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            tql tql = this.a.d;
            return tql != null ? ajyu.d((Collection) tql.c, (Iterable) this.a.c.c) : this.a.c.c;
        }
    }

    /* renamed from: tqn$b */
    static final class b extends akcs implements akbk<List<? extends acab>> {
        private /* synthetic */ tqn a;

        b(tqn tqn) {
            this.a = tqn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            tql tql = this.a.d;
            return tql != null ? ajyu.d((Collection) tql.d, (Iterable) this.a.c.d) : this.a.c.d;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(tqn.class), "geoFilters", "getGeoFilters()Ljava/util/List;"), new akdc(akde.a(tqn.class), "venueFilters", "getVenueFilters()Ljava/util/List;")};
    }

    public /* synthetic */ tqn(tql tql) {
        this(tql, null);
    }

    private tqn(tql tql, tql tql2) {
        akcr.b(tql, "current");
        this.c = tql;
        this.d = tql2;
        this.e = ajxh.a(new a(this));
        this.f = ajxh.a(new b(this));
        boolean z = true;
        this.a = this.d != null;
        if (!(this.a || this.c.a())) {
            z = false;
        }
        this.b = z;
    }

    private static tqn a(tql tql, tql tql2) {
        akcr.b(tql, "current");
        return new tqn(tql, tql2);
    }

    public final acae a() {
        tql tql = this.d;
        if (tql != null) {
            acae acae = tql.a;
            if (acae != null) {
                return acae;
            }
        }
        return this.c.a;
    }

    public final tqn a(int i) {
        return tqn.a(this.c, tql.a(this.c, null, null, null, null, Integer.valueOf(i), null, 47));
    }

    public final tqn a(abzx abzx) {
        akcr.b(abzx, "motionFilterType");
        return tqn.a(this.c, tql.a(this.c, null, abzx, null, null, null, null, 61));
    }

    public final tqn a(abzy abzy) {
        akcr.b(abzy, "geofilter");
        tql tql = this.c;
        return tqn.a(this.c, tql.a(tql, null, null, ajyu.a((Collection) tql.c, (Object) abzy), null, null, null, 59));
    }

    public final tqn a(acab acab) {
        akcr.b(acab, "venueFilter");
        tql tql = this.c;
        return tqn.a(this.c, tql.a(tql, null, null, null, ajyu.a((Collection) tql.d, (Object) acab), null, null, 55));
    }

    public final tqn a(acae acae) {
        akcr.b(acae, "visualFilterType");
        return tqn.a(this.c, tql.a(this.c, acae, null, null, null, null, null, 62));
    }

    public final abzx b() {
        tql tql = this.d;
        if (tql != null) {
            abzx abzx = tql.b;
            if (abzx != null) {
                return abzx;
            }
        }
        return this.c.b;
    }

    public final List<abzy> c() {
        return (List) this.e.b();
    }

    public final List<acab> d() {
        return (List) this.f.b();
    }

    public final tqn e() {
        return tqn.a(this.c, tql.a(this.c, null, null, null, null, null, null, 63));
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.tqn;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.tqn) r3;
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.d;
        r3 = r3.d;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        tql tql = this.c;
        int i = 0;
        int hashCode = (tql != null ? tql.hashCode() : 0) * 31;
        tql tql2 = this.d;
        if (tql2 != null) {
            i = tql2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StackedFiltersInfo(current=");
        stringBuilder.append(this.c);
        stringBuilder.append(", new=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
