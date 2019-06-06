package defpackage;

/* renamed from: nau */
public final class nau {
    public final String a;
    public final String b;
    public final String c;
    public final Long d;
    public final Long e;
    public final String f;
    public final String g;

    public nau() {
        this(null, null, null, null, 127);
    }

    public nau(String str, String str2, String str3, Long l, Long l2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = l;
        this.e = l2;
        this.f = str4;
        this.g = str5;
    }

    public /* synthetic */ nau(String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null, null, null, (i & 64) != 0 ? null : str4);
    }

    public final boolean a() {
        return this.g != null;
    }

    /* JADX WARNING: Missing block: B:16:0x004c, code skipped:
            if (defpackage.akcr.a(r2.g, r3.g) != false) goto L_0x0051;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0051;
    L_0x0002:
        r0 = r3 instanceof defpackage.nau;
        if (r0 == 0) goto L_0x004f;
    L_0x0006:
        r3 = (defpackage.nau) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0026:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0030:
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x003a:
        r0 = r2.f;
        r1 = r3.f;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x004f;
    L_0x0044:
        r0 = r2.g;
        r3 = r3.g;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x004f;
    L_0x004e:
        goto L_0x0051;
    L_0x004f:
        r3 = 0;
        return r3;
    L_0x0051:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nau.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        str2 = this.f;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserData(userId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", userName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", displayName=");
        stringBuilder.append(this.c);
        stringBuilder.append(", birthDate=");
        stringBuilder.append(this.d);
        stringBuilder.append(", score=");
        stringBuilder.append(this.e);
        stringBuilder.append(", countryCode=");
        stringBuilder.append(this.f);
        stringBuilder.append(", bitmojiAvatarId=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
