package defpackage;

/* renamed from: actw */
public final class actw {
    final String a;
    final float b;
    final float c;
    final actx d;
    final String e;

    public actw(String str, float f, float f2, actx actx, String str2) {
        akcr.b(str, "text");
        akcr.b(actx, "type");
        akcr.b(str2, "friendId");
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = actx;
        this.e = str2;
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x003d;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof defpackage.actw;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (defpackage.actw) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = java.lang.Float.compare(r0, r1);
        if (r0 != 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = java.lang.Float.compare(r0, r1);
        if (r0 != 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.e;
        r3 = r3.e;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31;
        actx actx = this.d;
        hashCode = (hashCode + (actx != null ? actx.hashCode() : 0)) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StatusLabelModel(text=");
        stringBuilder.append(this.a);
        stringBuilder.append(", offsetX=");
        stringBuilder.append(this.b);
        stringBuilder.append(", offsetY=");
        stringBuilder.append(this.c);
        stringBuilder.append(", type=");
        stringBuilder.append(this.d);
        stringBuilder.append(", friendId=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
