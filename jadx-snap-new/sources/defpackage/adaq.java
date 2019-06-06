package defpackage;

/* renamed from: adaq */
public final class adaq {
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ adaq() {
        String str = "";
        this(str, str, null);
    }

    public adaq(String str, String str2, String str3) {
        akcr.b(str, "userId");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* JADX WARNING: Missing block: B:9:0x0022, code skipped:
            if (r4 == null) goto L_0x0024;
     */
    public final java.lang.String a(defpackage.acwi r4) {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r3.a;
        r0.append(r1);
        r1 = r3.b;
        r2 = "";
        if (r1 != 0) goto L_0x0011;
    L_0x0010:
        r1 = r2;
    L_0x0011:
        r0.append(r1);
        r1 = r3.c;
        if (r1 != 0) goto L_0x0019;
    L_0x0018:
        r1 = r2;
    L_0x0019:
        r0.append(r1);
        if (r4 == 0) goto L_0x0024;
    L_0x001e:
        r4 = r4.a();
        if (r4 != 0) goto L_0x0025;
    L_0x0024:
        r4 = r2;
    L_0x0025:
        r0.append(r4);
        r4 = r0.toString();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adaq.a(acwi):java.lang.String");
    }

    public final boolean a() {
        CharSequence charSequence = this.b;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        return obj == null;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.adaq;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.adaq) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.c;
        r3 = r3.c;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adaq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BitmojiProviderKey(userId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", avatarId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", imageId=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
