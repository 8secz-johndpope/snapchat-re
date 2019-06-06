package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

/* renamed from: achq */
public final class achq<T extends achg> {
    public Boolean a;
    public final T b;
    public final T c;
    public final Predicate<Void> d;
    private final String e;

    public achq(T t, T t2, Predicate<Void> predicate, String str) {
        akcr.b(predicate, "predicate");
        akcr.b(str, "tag");
        this.b = t;
        this.c = t2;
        this.d = predicate;
        this.e = str;
        boolean z = (this.b == null && this.c == null) ? false : true;
        Preconditions.checkArgument(z);
    }

    /* JADX WARNING: Missing block: B:3:0x000d, code skipped:
            if (r2 == null) goto L_0x000f;
     */
    public final java.lang.String toString() {
        /*
        r5 = this;
        r0 = 4;
        r1 = new java.lang.Object[r0];
        r2 = r5.b;
        r3 = "ANY PAGE";
        if (r2 == 0) goto L_0x000f;
    L_0x0009:
        r2 = r2.c();
        if (r2 != 0) goto L_0x0010;
    L_0x000f:
        r2 = r3;
    L_0x0010:
        r4 = 0;
        r1[r4] = r2;
        r2 = 1;
        r4 = r5.c;
        if (r4 == 0) goto L_0x0020;
    L_0x0018:
        r4 = r4.c();
        if (r4 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0020;
    L_0x001f:
        r3 = r4;
    L_0x0020:
        r1[r2] = r3;
        r2 = r5.a;
        if (r2 == 0) goto L_0x0032;
    L_0x0026:
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x002f;
    L_0x002c:
        r2 = "ENABLED";
        goto L_0x0034;
    L_0x002f:
        r2 = "DISABLED";
        goto L_0x0034;
    L_0x0032:
        r2 = "UNEVALUATED";
    L_0x0034:
        r3 = 2;
        r1[r3] = r2;
        r2 = 3;
        r3 = r5.e;
        r1[r2] = r3;
        r0 = java.util.Arrays.copyOf(r1, r0);
        r1 = "%s to %s is %s Tag=[%s]";
        r0 = java.lang.String.format(r1, r0);
        r1 = "java.lang.String.format(format, *args)";
        defpackage.akcr.a(r0, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achq.toString():java.lang.String");
    }
}
