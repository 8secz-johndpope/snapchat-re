package defpackage;

/* renamed from: hwn */
public final class hwn {
    public final Class<? extends hwg<?>> a;
    public final hwp b;
    public final Class<?> c;
    public final ajdx<hwm<hwg<?>, ?>> d;

    public hwn(Class<? extends hwg<?>> cls, hwp hwp, Class<?> cls2, ajdx<hwm<hwg<?>, ?>> ajdx) {
        akcr.b(cls, "jobType");
        akcr.b(hwp, "jobScope");
        akcr.b(cls2, "jobMetadataType");
        akcr.b(ajdx, "jobProcessor");
        this.a = cls;
        this.b = hwp;
        this.c = cls2;
        this.d = ajdx;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof defpackage.hwn;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (defpackage.hwn) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.d;
        r3 = r3.d;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Class cls = this.a;
        int i = 0;
        int hashCode = (cls != null ? cls.hashCode() : 0) * 31;
        hwp hwp = this.b;
        hashCode = (hashCode + (hwp != null ? hwp.hashCode() : 0)) * 31;
        Class cls2 = this.c;
        hashCode = (hashCode + (cls2 != null ? cls2.hashCode() : 0)) * 31;
        ajdx ajdx = this.d;
        if (ajdx != null) {
            i = ajdx.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DurableJobProcessorConfig(jobType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", jobScope=");
        stringBuilder.append(this.b);
        stringBuilder.append(", jobMetadataType=");
        stringBuilder.append(this.c);
        stringBuilder.append(", jobProcessor=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
