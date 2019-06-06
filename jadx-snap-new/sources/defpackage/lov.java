package defpackage;

import defpackage.lqh.a;
import defpackage.lqh.a.b;

/* renamed from: lov */
final class lov {
    static final lov c = new lov(b.a, b.a);
    final a a;
    final a b;

    /* renamed from: lov$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public lov(a aVar, a aVar2) {
        akcr.b(aVar, "previous");
        akcr.b(aVar2, "current");
        this.a = aVar;
        this.b = aVar2;
    }

    public final boolean a() {
        return !(this.a instanceof a.a) && (this.b instanceof a.a.a);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.lov;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.lov) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lov.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a aVar2 = this.b;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Actions(previous=");
        stringBuilder.append(this.a);
        stringBuilder.append(", current=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
