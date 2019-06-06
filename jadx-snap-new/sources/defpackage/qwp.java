package defpackage;

/* renamed from: qwp */
public final class qwp {
    public final qwn a;
    public final qwn b;
    public final boolean c;
    public final boolean d;
    public final qwn e;
    public final qwn f;
    public final qwn g;
    public final qwn h;
    public final qwn i;
    public final qwn j;
    public final qwn k;
    public final qwm l;
    private final qwn m;
    private final qwn n;
    private final qwn o;
    private final qwn p;
    private final qwn q;
    private final qwn r;

    private /* synthetic */ qwp() {
        qwm qwm = new qwm(iin.UNKNOWN, 0, null, 12);
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, qwm);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fc  */
    public qwp(defpackage.qwn r2, defpackage.qwn r3, defpackage.qwn r4, defpackage.qwn r5, defpackage.qwn r6, defpackage.qwn r7, defpackage.qwn r8, defpackage.qwn r9, defpackage.qwn r10, defpackage.qwn r11, defpackage.qwn r12, defpackage.qwn r13, defpackage.qwn r14, defpackage.qwm r15) {
        /*
        r1 = this;
        r0 = "localInteractionInfo";
        defpackage.akcr.b(r15, r0);
        r1.<init>();
        r1.e = r2;
        r1.f = r3;
        r1.g = r4;
        r1.h = r5;
        r1.m = r6;
        r1.i = r7;
        r1.j = r8;
        r1.n = r9;
        r1.k = r10;
        r1.o = r11;
        r1.p = r12;
        r1.q = r13;
        r1.r = r14;
        r1.l = r15;
        r2 = 4;
        r2 = new defpackage.qwn[r2];
        r3 = r1.p;
        r4 = 0;
        r2[r4] = r3;
        r3 = r1.r;
        r5 = 1;
        r2[r5] = r3;
        r3 = r1.m;
        r6 = 2;
        r2[r6] = r3;
        r3 = r1.n;
        r7 = 3;
        r2[r7] = r3;
        r2 = defpackage.ajym.e(r2);
        r2 = (java.lang.Iterable) r2;
        r2 = r2.iterator();
        r3 = r2.hasNext();
        r7 = 0;
        r8 = 0;
        if (r3 != 0) goto L_0x0050;
    L_0x004e:
        r3 = r7;
        goto L_0x007f;
    L_0x0050:
        r3 = r2.next();
        r10 = r3;
        r10 = (defpackage.qwn) r10;
        r10 = r10.j;
        if (r10 == 0) goto L_0x0060;
    L_0x005b:
        r10 = r10.longValue();
        goto L_0x0061;
    L_0x0060:
        r10 = r8;
    L_0x0061:
        r12 = r2.hasNext();
        if (r12 == 0) goto L_0x007f;
    L_0x0067:
        r12 = r2.next();
        r13 = r12;
        r13 = (defpackage.qwn) r13;
        r13 = r13.j;
        if (r13 == 0) goto L_0x0077;
    L_0x0072:
        r13 = r13.longValue();
        goto L_0x0078;
    L_0x0077:
        r13 = r8;
    L_0x0078:
        r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1));
        if (r15 >= 0) goto L_0x0061;
    L_0x007c:
        r3 = r12;
        r10 = r13;
        goto L_0x0061;
    L_0x007f:
        r3 = (defpackage.qwn) r3;
        r1.a = r3;
        r2 = new defpackage.qwn[r6];
        r3 = r1.o;
        r2[r4] = r3;
        r3 = r1.q;
        r2[r5] = r3;
        r2 = defpackage.ajym.e(r2);
        r2 = (java.lang.Iterable) r2;
        r2 = r2.iterator();
        r3 = r2.hasNext();
        if (r3 != 0) goto L_0x009e;
    L_0x009d:
        goto L_0x00cf;
    L_0x009e:
        r3 = r2.next();
        r6 = r3;
        r6 = (defpackage.qwn) r6;
        r6 = r6.j;
        if (r6 == 0) goto L_0x00ae;
    L_0x00a9:
        r6 = r6.longValue();
        goto L_0x00af;
    L_0x00ae:
        r6 = r8;
    L_0x00af:
        r10 = r6;
        r7 = r3;
    L_0x00b1:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x00cf;
    L_0x00b7:
        r3 = r2.next();
        r6 = r3;
        r6 = (defpackage.qwn) r6;
        r6 = r6.j;
        if (r6 == 0) goto L_0x00c7;
    L_0x00c2:
        r12 = r6.longValue();
        goto L_0x00c8;
    L_0x00c7:
        r12 = r8;
    L_0x00c8:
        r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r6 >= 0) goto L_0x00b1;
    L_0x00cc:
        r7 = r3;
        r10 = r12;
        goto L_0x00b1;
    L_0x00cf:
        r7 = (defpackage.qwn) r7;
        r1.b = r7;
        r2 = r1.b;
        if (r2 == 0) goto L_0x00f5;
    L_0x00d7:
        r2 = r2.j;
        if (r2 == 0) goto L_0x00e0;
    L_0x00db:
        r2 = r2.longValue();
        goto L_0x00e1;
    L_0x00e0:
        r2 = r8;
    L_0x00e1:
        r6 = r1.a;
        if (r6 == 0) goto L_0x00ee;
    L_0x00e5:
        r6 = r6.j;
        if (r6 == 0) goto L_0x00ee;
    L_0x00e9:
        r6 = r6.longValue();
        goto L_0x00ef;
    L_0x00ee:
        r6 = r8;
    L_0x00ef:
        r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r10 < 0) goto L_0x00f5;
    L_0x00f3:
        r2 = 1;
        goto L_0x00f6;
    L_0x00f5:
        r2 = 0;
    L_0x00f6:
        r1.c = r2;
        r2 = r1.a;
        if (r2 == 0) goto L_0x010d;
    L_0x00fc:
        r2 = r2.j;
        if (r2 == 0) goto L_0x0104;
    L_0x0100:
        r8 = r2.longValue();
    L_0x0104:
        r2 = r1.l;
        r2 = r2.b;
        r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r6 < 0) goto L_0x010d;
    L_0x010c:
        r4 = 1;
    L_0x010d:
        r1.d = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwp.<init>(qwn, qwn, qwn, qwn, qwn, qwn, qwn, qwn, qwn, qwn, qwn, qwn, qwn, qwm):void");
    }

    /* JADX WARNING: Missing block: B:30:0x0092, code skipped:
            if (defpackage.akcr.a(r2.l, r3.l) != false) goto L_0x0097;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0097;
    L_0x0002:
        r0 = r3 instanceof defpackage.qwp;
        if (r0 == 0) goto L_0x0095;
    L_0x0006:
        r3 = (defpackage.qwp) r3;
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0012:
        r0 = r2.f;
        r1 = r3.f;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x001c:
        r0 = r2.g;
        r1 = r3.g;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0026:
        r0 = r2.h;
        r1 = r3.h;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0030:
        r0 = r2.m;
        r1 = r3.m;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x003a:
        r0 = r2.i;
        r1 = r3.i;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0044:
        r0 = r2.j;
        r1 = r3.j;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x004e:
        r0 = r2.n;
        r1 = r3.n;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0058:
        r0 = r2.k;
        r1 = r3.k;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0062:
        r0 = r2.o;
        r1 = r3.o;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x006c:
        r0 = r2.p;
        r1 = r3.p;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0076:
        r0 = r2.q;
        r1 = r3.q;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x0080:
        r0 = r2.r;
        r1 = r3.r;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0095;
    L_0x008a:
        r0 = r2.l;
        r3 = r3.l;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0095;
    L_0x0094:
        goto L_0x0097;
    L_0x0095:
        r3 = 0;
        return r3;
    L_0x0097:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwp.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        qwn qwn = this.e;
        int i = 0;
        int hashCode = (qwn != null ? qwn.hashCode() : 0) * 31;
        qwn qwn2 = this.f;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.g;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.h;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.m;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.i;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.j;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.n;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.k;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.o;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.p;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.q;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwn2 = this.r;
        hashCode = (hashCode + (qwn2 != null ? qwn2.hashCode() : 0)) * 31;
        qwm qwm = this.l;
        if (qwm != null) {
            i = qwm.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        if (this.e != null) {
            stringBuilder = new StringBuilder("lastSendingMessage=");
            stringBuilder.append(this.e);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.f != null) {
            stringBuilder = new StringBuilder("lastWaitingToSendMessage=");
            stringBuilder.append(this.f);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.g != null) {
            stringBuilder = new StringBuilder("lastReceivedNotViewedSnapWithSound=");
            stringBuilder.append(this.g);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.h != null) {
            stringBuilder = new StringBuilder("lastReceivedNotViewedSnapWithNoSound=");
            stringBuilder.append(this.h);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.m != null) {
            stringBuilder = new StringBuilder("lastReceivedViewedSnap=");
            stringBuilder.append(this.m);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.i != null) {
            stringBuilder = new StringBuilder("lastReceivedNotViewedChat=");
            stringBuilder.append(this.i);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.n != null) {
            stringBuilder = new StringBuilder("lastReceivedViewedChat=");
            stringBuilder.append(this.n);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.o != null) {
            stringBuilder = new StringBuilder("lastSentNotViewedSnap=");
            stringBuilder.append(this.o);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.p != null) {
            stringBuilder = new StringBuilder("lastSentViewedSnap=");
            stringBuilder.append(this.p);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.q != null) {
            stringBuilder = new StringBuilder("lastSentNotViewedChat=");
            stringBuilder.append(this.q);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        if (this.r != null) {
            stringBuilder = new StringBuilder("lastSentViewedChat=");
            stringBuilder.append(this.r);
            stringBuilder.append(10);
            stringBuilder2.append(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder("localInteractionInfo=");
        stringBuilder.append(this.l);
        stringBuilder.append(10);
        stringBuilder2.append(stringBuilder.toString());
        Object stringBuilder3 = stringBuilder2.toString();
        akcr.a(stringBuilder3, "builder.toString()");
        return stringBuilder3;
    }
}
