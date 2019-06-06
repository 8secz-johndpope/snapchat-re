package defpackage;

/* renamed from: akdy */
public final class akdy extends akdw implements akdv<Integer> {
    static final akdy d = new akdy(1, 0);

    /* renamed from: akdy$a */
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

    public akdy(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean a() {
        return this.a > this.b;
    }

    public final boolean a(int i) {
        return this.a <= i && i <= this.b;
    }

    public final /* synthetic */ Comparable b() {
        return Integer.valueOf(this.a);
    }

    public final /* synthetic */ Comparable c() {
        return Integer.valueOf(this.b);
    }

    /* JADX WARNING: Missing block: B:9:0x001f, code skipped:
            if (r2.b == r3.b) goto L_0x0021;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        r0 = r3 instanceof defpackage.akdy;
        if (r0 == 0) goto L_0x0023;
    L_0x0004:
        r0 = r2.a();
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = r3;
        r0 = (defpackage.akdy) r0;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0021;
    L_0x0013:
        r0 = r2.a;
        r3 = (defpackage.akdy) r3;
        r1 = r3.a;
        if (r0 != r1) goto L_0x0023;
    L_0x001b:
        r0 = r2.b;
        r3 = r3.b;
        if (r0 != r3) goto L_0x0023;
    L_0x0021:
        r3 = 1;
        return r3;
    L_0x0023:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdy.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return a() ? -1 : (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("..");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
