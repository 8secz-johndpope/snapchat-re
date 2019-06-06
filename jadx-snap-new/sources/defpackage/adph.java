package defpackage;

import com.brightcove.player.media.ErrorFields;

/* renamed from: adph */
public final class adph<T extends aeie> {
    final String a;
    final boolean b;
    final String c;
    final T d;
    private final String e;
    private final String f;

    public adph(T t, String str, String str2) {
        Object obj;
        Object obj2;
        akcr.b(t, ErrorFields.MESSAGE);
        akcr.b(str, "myUsername");
        akcr.b(str2, "myUserId");
        this.d = t;
        this.e = str;
        this.f = str2;
        String str3 = this.d.i.c;
        if (str3 == null) {
            akcr.a();
        }
        this.a = str3;
        aeie aeie = this.d;
        if (aeie instanceof aetd) {
            obj = ((aetd) aeie).g;
            obj2 = this.f;
        } else {
            obj = aeie.i.a;
            obj2 = this.e;
        }
        this.b = akcr.a(obj, obj2);
        aeie = this.d;
        if (aeie instanceof aetd) {
            if (akcr.a(((aetd) aeie).g, this.f)) {
                str3 = this.e;
                this.c = str3;
            }
            aeie = this.d;
        }
        str3 = aeie.i.a;
        this.c = str3;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.f, r3.f) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.adph;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.adph) r3;
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.f;
        r3 = r3.f;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adph.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        aeie aeie = this.d;
        int i = 0;
        int hashCode = (aeie != null ? aeie.hashCode() : 0) * 31;
        String str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GroupMessage(message=");
        stringBuilder.append(this.d);
        stringBuilder.append(", myUsername=");
        stringBuilder.append(this.e);
        stringBuilder.append(", myUserId=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
