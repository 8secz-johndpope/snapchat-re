package defpackage;

/* renamed from: acmg */
public final class acmg {
    public static final acmg e;
    public final cgi a;
    public final double b;
    public final double c;
    public final double d;

    /* renamed from: acmg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static acmg a(cgi cgi, double d) {
            return new acmg(cgi, 0.0d, 0.0d, d);
        }
    }

    static {
        a aVar = new a();
        Object a = cgo.a();
        akcr.a(a, "LatLngUtils.newLatLng()");
        akcr.b(a, "latLng");
        e = new acmg(a, 0.0d, 0.0d, 0.0d);
    }

    public acmg(cgi cgi, double d, double d2, double d3) {
        this.a = cgi;
        this.b = d;
        this.c = d2;
        this.d = d3;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (java.lang.Double.compare(r4.d, r5.d) == 0) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x0033;
    L_0x0002:
        r0 = r5 instanceof defpackage.acmg;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r5 = (defpackage.acmg) r5;
        r0 = r4.a;
        r1 = r5.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r4.b;
        r2 = r5.b;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x0031;
    L_0x001c:
        r0 = r4.c;
        r2 = r5.c;
        r0 = java.lang.Double.compare(r0, r2);
        if (r0 != 0) goto L_0x0031;
    L_0x0026:
        r0 = r4.d;
        r2 = r5.d;
        r5 = java.lang.Double.compare(r0, r2);
        if (r5 != 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r5 = 0;
        return r5;
    L_0x0033:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        cgi cgi = this.a;
        int hashCode = (cgi != null ? cgi.hashCode() : 0) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.c);
        hashCode = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        doubleToLongBits = Double.doubleToLongBits(this.d);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CameraPosition(target=");
        stringBuilder.append(this.a);
        stringBuilder.append(", bearing=");
        stringBuilder.append(this.b);
        stringBuilder.append(", tilt=");
        stringBuilder.append(this.c);
        stringBuilder.append(", zoom=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
