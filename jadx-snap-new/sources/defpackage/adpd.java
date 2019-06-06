package defpackage;

import com.brightcove.player.media.ErrorFields;

/* renamed from: adpd */
public final class adpd<T extends aeie> {
    final boolean a;
    final String b;
    final String c;
    final T d;
    private final String e;
    private final String f;

    public adpd(T t, String str) {
        akcr.b(t, ErrorFields.MESSAGE);
        akcr.b(str, "myUsername");
        this.d = t;
        this.f = str;
        String str2 = this.d.i.c;
        if (str2 == null) {
            akcr.a();
        }
        this.e = str2;
        this.a = akcr.a(this.d.i.a, this.f);
        this.b = this.d.i.a;
        if (this.a) {
            Object obj = this.d.i.b.get(0);
            if (obj == null) {
                akcr.a();
            }
            str2 = (String) obj;
        } else {
            str2 = this.d.i.a;
            if (str2 == null) {
                akcr.a();
            }
        }
        this.c = str2;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.f, r3.f) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.adpd;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.adpd) r3;
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.f;
        r3 = r3.f;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adpd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        aeie aeie = this.d;
        int i = 0;
        int hashCode = (aeie != null ? aeie.hashCode() : 0) * 31;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DirectMessage(message=");
        stringBuilder.append(this.d);
        stringBuilder.append(", myUsername=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
