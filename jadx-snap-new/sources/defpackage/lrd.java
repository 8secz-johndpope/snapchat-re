package defpackage;

/* renamed from: lrd */
final class lrd {
    static final lrd b;
    final lqe a;
    private final lqe c;

    /* renamed from: lrd$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
        lqe lqe = lqe.FRONT;
        b = new lrd(lqe, lqe);
    }

    public lrd(lqe lqe, lqe lqe2) {
        akcr.b(lqe, "previousCameraFacing");
        akcr.b(lqe2, "currentCameraFacing");
        this.c = lqe;
        this.a = lqe2;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.a, r3.a) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.lrd;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.lrd) r3;
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.a;
        r3 = r3.a;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        lqe lqe = this.c;
        int i = 0;
        int hashCode = (lqe != null ? lqe.hashCode() : 0) * 31;
        lqe lqe2 = this.a;
        if (lqe2 != null) {
            i = lqe2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CameraFlipEvent(previousCameraFacing=");
        stringBuilder.append(this.c);
        stringBuilder.append(", currentCameraFacing=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
