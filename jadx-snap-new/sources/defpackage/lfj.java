package defpackage;

/* renamed from: lfj */
public final class lfj implements lfq {
    private final ide a;
    private final gqr b;
    private final akbl<String, ajxw> c;
    private final akbk<Boolean> d;

    public lfj(ide ide, gqr gqr, akbl<? super String, ajxw> akbl, akbk<Boolean> akbk) {
        akcr.b(ide, "attributedFeature");
        akcr.b(gqr, "exceptionTracker");
        akcr.b(akbl, "toaster");
        akcr.b(akbk, "isInternalBuild");
        this.a = ide;
        this.b = gqr;
        this.c = akbl;
        this.d = akbk;
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fc A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ca A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0294 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0206 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a0 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03b1 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a8 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03c0 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03b9 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03d9 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ca A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03f6 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03e9 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ca A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fc A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0206 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0294 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a0 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02a8 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03b1 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03b9 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x03c0 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ca A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03d9 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03e9 A:{Catch:{ Exception -> 0x0429 }} */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03f6 A:{Catch:{ Exception -> 0x0429 }} */
    public final defpackage.mux a(defpackage.aenr r38, defpackage.mwg r39) {
        /*
        r37 = this;
        r1 = r37;
        r2 = r38;
        r0 = r39;
        r3 = "it.webViewUrl";
        r4 = "it.videoId";
        r5 = "response.lensData";
        r6 = "response";
        defpackage.akcr.b(r2, r6);
        r6 = "lensSource";
        defpackage.akcr.b(r0, r6);
        r25 = 0;
        r6 = r2.T;	 Catch:{ Exception -> 0x0429 }
        if (r6 == 0) goto L_0x0079;
    L_0x001c:
        r7 = r6.g;	 Catch:{ Exception -> 0x0429 }
        if (r7 != 0) goto L_0x0024;
    L_0x0020:
        r7 = defpackage.ajyw.a;	 Catch:{ Exception -> 0x0429 }
        r7 = (java.util.List) r7;	 Catch:{ Exception -> 0x0429 }
    L_0x0024:
        r7 = (java.lang.Iterable) r7;	 Catch:{ Exception -> 0x0429 }
        r8 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0429 }
        r8.<init>();	 Catch:{ Exception -> 0x0429 }
        r8 = (java.util.Collection) r8;	 Catch:{ Exception -> 0x0429 }
        r7 = r7.iterator();	 Catch:{ Exception -> 0x0429 }
    L_0x0031:
        r9 = r7.hasNext();	 Catch:{ Exception -> 0x0429 }
        if (r9 == 0) goto L_0x0050;
    L_0x0037:
        r9 = r7.next();	 Catch:{ Exception -> 0x0429 }
        r9 = (java.lang.String) r9;	 Catch:{ Exception -> 0x0429 }
        r10 = "key";
        defpackage.akcr.a(r9, r10);	 Catch:{ Exception -> 0x0429 }
        r9 = defpackage.muz.a.a(r9);	 Catch:{ Exception -> 0x0429 }
        if (r9 != 0) goto L_0x004a;
    L_0x0048:
        r9 = r25;
    L_0x004a:
        if (r9 == 0) goto L_0x0031;
    L_0x004c:
        r8.add(r9);	 Catch:{ Exception -> 0x0429 }
        goto L_0x0031;
    L_0x0050:
        r8 = (java.util.List) r8;	 Catch:{ Exception -> 0x0429 }
        r7 = defpackage.muu.SCHEDULED_FRONT;	 Catch:{ Exception -> 0x0429 }
        if (r0 != r7) goto L_0x0059;
    L_0x0056:
        r6 = defpackage.mvb.FRONT_FACING;	 Catch:{ Exception -> 0x0429 }
        goto L_0x006c;
    L_0x0059:
        r7 = defpackage.muu.SCHEDULED_REAR;	 Catch:{ Exception -> 0x0429 }
        if (r0 != r7) goto L_0x0060;
    L_0x005d:
        r6 = defpackage.mvb.REAR_FACING;	 Catch:{ Exception -> 0x0429 }
        goto L_0x006c;
    L_0x0060:
        r6 = r6.c;	 Catch:{ Exception -> 0x0429 }
        if (r6 != 0) goto L_0x0068;
    L_0x0064:
        r6 = defpackage.ajyw.a;	 Catch:{ Exception -> 0x0429 }
        r6 = (java.util.List) r6;	 Catch:{ Exception -> 0x0429 }
    L_0x0068:
        r6 = defpackage.mvb.a.a(r6);	 Catch:{ Exception -> 0x0429 }
    L_0x006c:
        r7 = new mvy;	 Catch:{ Exception -> 0x0429 }
        r8 = (java.lang.Iterable) r8;	 Catch:{ Exception -> 0x0429 }
        r8 = defpackage.ajyu.m(r8);	 Catch:{ Exception -> 0x0429 }
        r7.<init>(r6, r8);	 Catch:{ Exception -> 0x0429 }
        r12 = r7;
        goto L_0x007c;
    L_0x0079:
        r6 = defpackage.mvy.c;	 Catch:{ Exception -> 0x0429 }
        r12 = r6;
    L_0x007c:
        r6 = r2.v;	 Catch:{ Exception -> 0x0429 }
        defpackage.akcr.a(r6, r5);	 Catch:{ Exception -> 0x0429 }
        r6 = r6.a();	 Catch:{ Exception -> 0x0429 }
        if (r6 == 0) goto L_0x0423;
    L_0x0087:
        r7 = defpackage.lfk.a;	 Catch:{ Exception -> 0x0429 }
        r6 = r6.ordinal();	 Catch:{ Exception -> 0x0429 }
        r6 = r7[r6];	 Catch:{ Exception -> 0x0429 }
        r7 = 3;
        r8 = 2;
        r9 = 1;
        if (r6 == r9) goto L_0x009e;
    L_0x0094:
        if (r6 == r8) goto L_0x009b;
    L_0x0096:
        if (r6 != r7) goto L_0x0423;
    L_0x0098:
        r6 = defpackage.muy.FRONT;	 Catch:{ Exception -> 0x0429 }
        goto L_0x00a0;
    L_0x009b:
        r6 = defpackage.muy.REAR;	 Catch:{ Exception -> 0x0429 }
        goto L_0x00a0;
    L_0x009e:
        r6 = defpackage.muy.NONE;	 Catch:{ Exception -> 0x0429 }
    L_0x00a0:
        r13 = r6;
        r6 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r6 = r6.n;	 Catch:{ Exception -> 0x0429 }
        r10 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r10 = r10.l;	 Catch:{ Exception -> 0x0429 }
        r11 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r11 = r11.m;	 Catch:{ Exception -> 0x0429 }
        r14 = r2.ak;	 Catch:{ Exception -> 0x0429 }
        if (r14 == 0) goto L_0x00b4;
    L_0x00b1:
        r14 = r14.a;	 Catch:{ Exception -> 0x0429 }
        goto L_0x00b6;
    L_0x00b4:
        r14 = r25;
    L_0x00b6:
        r15 = new mud;	 Catch:{ Exception -> 0x0429 }
        r16 = 0;
        if (r11 == 0) goto L_0x00c1;
    L_0x00bc:
        r11 = r11.booleanValue();	 Catch:{ Exception -> 0x0429 }
        goto L_0x00c2;
    L_0x00c1:
        r11 = 0;
    L_0x00c2:
        if (r10 == 0) goto L_0x00c9;
    L_0x00c4:
        r10 = r10.booleanValue();	 Catch:{ Exception -> 0x0429 }
        goto L_0x00ca;
    L_0x00c9:
        r10 = 0;
    L_0x00ca:
        r15.<init>(r6, r14, r11, r10);	 Catch:{ Exception -> 0x0429 }
        r6 = r2.R;	 Catch:{ Exception -> 0x0429 }
        if (r6 == 0) goto L_0x0100;
    L_0x00d1:
        r10 = new mtx;	 Catch:{ Exception -> 0x0429 }
        r11 = r6.a;	 Catch:{ Exception -> 0x0429 }
        r14 = r6.b;	 Catch:{ Exception -> 0x0429 }
        r7 = r6.c;	 Catch:{ Exception -> 0x0429 }
        r8 = "it.skipTrack";
        defpackage.akcr.a(r7, r8);	 Catch:{ Exception -> 0x0429 }
        r29 = r7.booleanValue();	 Catch:{ Exception -> 0x0429 }
        r7 = r6.d;	 Catch:{ Exception -> 0x0429 }
        r8 = r6.j;	 Catch:{ Exception -> 0x0429 }
        r9 = r6.f;	 Catch:{ Exception -> 0x0429 }
        r0 = r6.g;	 Catch:{ Exception -> 0x0429 }
        r6 = r6.h;	 Catch:{ Exception -> 0x0429 }
        r26 = r10;
        r27 = r11;
        r28 = r14;
        r30 = r7;
        r31 = r8;
        r32 = r9;
        r33 = r0;
        r34 = r6;
        r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34);	 Catch:{ Exception -> 0x0429 }
        goto L_0x0102;
    L_0x0100:
        r10 = r25;
    L_0x0102:
        r0 = r2.D;	 Catch:{ Exception -> 0x0429 }
        r6 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r6 = r6.u;	 Catch:{ Exception -> 0x0429 }
        if (r6 == 0) goto L_0x0115;
    L_0x010a:
        r7 = defpackage.aepw.SNAPPABLE;	 Catch:{ Exception -> 0x0429 }
        r7 = r7.a();	 Catch:{ Exception -> 0x0429 }
        r6 = r6.contains(r7);	 Catch:{ Exception -> 0x0429 }
        goto L_0x0116;
    L_0x0115:
        r6 = 0;
    L_0x0116:
        if (r6 == 0) goto L_0x014e;
    L_0x0118:
        r6 = new mwr;	 Catch:{ Exception -> 0x0429 }
        r7 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r7 = r7.y;	 Catch:{ Exception -> 0x0429 }
        r8 = r2.v;	 Catch:{ Exception -> 0x0429 }
        defpackage.akcr.a(r8, r5);	 Catch:{ Exception -> 0x0429 }
        r5 = r8.b();	 Catch:{ Exception -> 0x0429 }
        r8 = "response.lensData.snappableReplyTypeEnum";
        defpackage.akcr.a(r5, r8);	 Catch:{ Exception -> 0x0429 }
        r8 = defpackage.lfk.b;	 Catch:{ Exception -> 0x0429 }
        r5 = r5.ordinal();	 Catch:{ Exception -> 0x0429 }
        r5 = r8[r5];	 Catch:{ Exception -> 0x0429 }
        r8 = 1;
        if (r5 == r8) goto L_0x013d;
    L_0x0137:
        r8 = 2;
        if (r5 == r8) goto L_0x0146;
    L_0x013a:
        r8 = 3;
        if (r5 != r8) goto L_0x0140;
    L_0x013d:
        r5 = defpackage.mwr.a.REPLY;	 Catch:{ Exception -> 0x0429 }
        goto L_0x0148;
    L_0x0140:
        r0 = new ajxk;	 Catch:{ Exception -> 0x0429 }
        r0.<init>();	 Catch:{ Exception -> 0x0429 }
        throw r0;	 Catch:{ Exception -> 0x0429 }
    L_0x0146:
        r5 = defpackage.mwr.a.MAIN;	 Catch:{ Exception -> 0x0429 }
    L_0x0148:
        r6.<init>(r7, r5);	 Catch:{ Exception -> 0x0429 }
        r23 = r6;
        goto L_0x0150;
    L_0x014e:
        r23 = r25;
    L_0x0150:
        r5 = new mhs$b;	 Catch:{ Exception -> 0x0429 }
        r6 = r2.a;	 Catch:{ Exception -> 0x0429 }
        r7 = "response.filterId";
        defpackage.akcr.a(r6, r7);	 Catch:{ Exception -> 0x0429 }
        r5.<init>(r6);	 Catch:{ Exception -> 0x0429 }
        r6 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r6 = r6.d;	 Catch:{ Exception -> 0x0429 }
        r6 = defpackage.miq.a.b(r6);	 Catch:{ Exception -> 0x0429 }
        r7 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r7 = r7.g;	 Catch:{ Exception -> 0x0429 }
        r8 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r8 = r8.b;	 Catch:{ Exception -> 0x0429 }
        r9 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r9 = r9.s;	 Catch:{ Exception -> 0x0429 }
        r11 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r11 = r11.c;	 Catch:{ Exception -> 0x0429 }
        r11 = defpackage.miq.a.b(r11);	 Catch:{ Exception -> 0x0429 }
        r14 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r14 = r14.t;	 Catch:{ Exception -> 0x0429 }
        r14 = defpackage.miq.a.b(r14);	 Catch:{ Exception -> 0x0429 }
        r20 = r15;
        r15 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r15 = r15.e;	 Catch:{ Exception -> 0x0429 }
        r1 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r1 = r1.f;	 Catch:{ Exception -> 0x0429 }
        if (r15 == 0) goto L_0x01ab;
    L_0x018c:
        r21 = r15;
        r21 = (java.lang.CharSequence) r21;	 Catch:{ Exception -> 0x0429 }
        r21 = defpackage.akgb.a(r21);	 Catch:{ Exception -> 0x0429 }
        if (r21 == 0) goto L_0x0197;
    L_0x0196:
        goto L_0x01ab;
    L_0x0197:
        r15 = defpackage.mhs.a.a(r15);	 Catch:{ Exception -> 0x0429 }
        if (r1 != 0) goto L_0x01a1;
    L_0x019d:
        r1 = defpackage.ajyx.a;	 Catch:{ Exception -> 0x0429 }
        r1 = (java.util.Map) r1;	 Catch:{ Exception -> 0x0429 }
    L_0x01a1:
        r21 = r13;
        r13 = new mup$b;	 Catch:{ Exception -> 0x0429 }
        r13.<init>(r15, r1);	 Catch:{ Exception -> 0x0429 }
    L_0x01a8:
        r13 = (defpackage.mup) r13;	 Catch:{ Exception -> 0x0429 }
        goto L_0x01c6;
    L_0x01ab:
        r21 = r13;
        if (r1 == 0) goto L_0x01c1;
    L_0x01af:
        r13 = r1.isEmpty();	 Catch:{ Exception -> 0x0429 }
        r15 = 1;
        r13 = r13 ^ r15;
        if (r13 == 0) goto L_0x01c1;
    L_0x01b7:
        r13 = new mup$b;	 Catch:{ Exception -> 0x0429 }
        r15 = defpackage.mhs.c.a;	 Catch:{ Exception -> 0x0429 }
        r15 = (defpackage.mhs) r15;	 Catch:{ Exception -> 0x0429 }
        r13.<init>(r15, r1);	 Catch:{ Exception -> 0x0429 }
        goto L_0x01a8;
    L_0x01c1:
        r1 = defpackage.mup.c.a;	 Catch:{ Exception -> 0x0429 }
        r1 = (defpackage.mup) r1;	 Catch:{ Exception -> 0x0429 }
        r13 = r1;
    L_0x01c6:
        r1 = r2.p;	 Catch:{ Exception -> 0x0429 }
        if (r1 == 0) goto L_0x01fc;
    L_0x01ca:
        r1 = r1.booleanValue();	 Catch:{ Exception -> 0x0429 }
        if (r1 == 0) goto L_0x01f5;
    L_0x01d0:
        r1 = r2.q;	 Catch:{ Exception -> 0x0429 }
        if (r1 == 0) goto L_0x01eb;
    L_0x01d4:
        r1 = r1.f;	 Catch:{ Exception -> 0x0429 }
        if (r1 == 0) goto L_0x01e0;
    L_0x01d8:
        r15 = new mws$b$b$a;	 Catch:{ Exception -> 0x0429 }
        r15.<init>(r1);	 Catch:{ Exception -> 0x0429 }
        r15 = (defpackage.mws.b.b) r15;	 Catch:{ Exception -> 0x0429 }
        goto L_0x01e5;
    L_0x01e0:
        r1 = defpackage.mws.b.b.b.a;	 Catch:{ Exception -> 0x0429 }
        r15 = r1;
        r15 = (defpackage.mws.b.b) r15;	 Catch:{ Exception -> 0x0429 }
    L_0x01e5:
        r1 = new mws$b;	 Catch:{ Exception -> 0x0429 }
        r1.<init>(r15);	 Catch:{ Exception -> 0x0429 }
        goto L_0x01ed;
    L_0x01eb:
        r1 = r25;
    L_0x01ed:
        r15 = new mws$c;	 Catch:{ Exception -> 0x0429 }
        r15.<init>(r1);	 Catch:{ Exception -> 0x0429 }
        r15 = (defpackage.mws) r15;	 Catch:{ Exception -> 0x0429 }
        goto L_0x01fa;
    L_0x01f5:
        r1 = defpackage.mws.a.a;	 Catch:{ Exception -> 0x0429 }
        r15 = r1;
        r15 = (defpackage.mws) r15;	 Catch:{ Exception -> 0x0429 }
    L_0x01fa:
        r1 = r15;
        goto L_0x0200;
    L_0x01fc:
        r1 = defpackage.mws.a.a;	 Catch:{ Exception -> 0x0429 }
        r1 = (defpackage.mws) r1;	 Catch:{ Exception -> 0x0429 }
    L_0x0200:
        r15 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r15 = r15.j;	 Catch:{ Exception -> 0x0429 }
        if (r15 == 0) goto L_0x0294;
    L_0x0206:
        r15 = (java.lang.Iterable) r15;	 Catch:{ Exception -> 0x0429 }
        r22 = r1;
        r1 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0429 }
        r24 = r12;
        r12 = 10;
        r12 = defpackage.ajyn.a(r15, r12);	 Catch:{ Exception -> 0x0429 }
        r1.<init>(r12);	 Catch:{ Exception -> 0x0429 }
        r1 = (java.util.Collection) r1;	 Catch:{ Exception -> 0x0429 }
        r12 = r15.iterator();	 Catch:{ Exception -> 0x0429 }
    L_0x021d:
        r15 = r12.hasNext();	 Catch:{ Exception -> 0x0429 }
        if (r15 == 0) goto L_0x028d;
    L_0x0223:
        r15 = r12.next();	 Catch:{ Exception -> 0x0429 }
        r15 = (defpackage.aepo) r15;	 Catch:{ Exception -> 0x0429 }
        r34 = r12;
        r12 = new mhs$b;	 Catch:{ Exception -> 0x0429 }
        r35 = r13;
        r13 = r15.b;	 Catch:{ Exception -> 0x0429 }
        r36 = r14;
        r14 = "it.id";
        defpackage.akcr.a(r13, r14);	 Catch:{ Exception -> 0x0429 }
        r12.<init>(r13);	 Catch:{ Exception -> 0x0429 }
        r13 = r15.e;	 Catch:{ Exception -> 0x0429 }
        r28 = defpackage.miq.a.b(r13);	 Catch:{ Exception -> 0x0429 }
        r13 = r15.j;	 Catch:{ Exception -> 0x0429 }
        r14 = "";
        if (r13 != 0) goto L_0x024a;
    L_0x0247:
        r29 = r14;
        goto L_0x024c;
    L_0x024a:
        r29 = r13;
    L_0x024c:
        r13 = r15.a;	 Catch:{ Exception -> 0x0429 }
        r26 = r14;
        r14 = "it.type";
        defpackage.akcr.a(r13, r14);	 Catch:{ Exception -> 0x0429 }
        r30 = defpackage.muc.b.a.a(r13);	 Catch:{ Exception -> 0x0429 }
        r13 = r15.c;	 Catch:{ Exception -> 0x0429 }
        r14 = "it.requestTiming";
        defpackage.akcr.a(r13, r14);	 Catch:{ Exception -> 0x0429 }
        r31 = defpackage.muc.a.a.a(r13);	 Catch:{ Exception -> 0x0429 }
        r13 = r15.d;	 Catch:{ Exception -> 0x0429 }
        if (r13 == 0) goto L_0x026f;
    L_0x0268:
        r13 = r13.intValue();	 Catch:{ Exception -> 0x0429 }
        r32 = r13;
        goto L_0x0271;
    L_0x026f:
        r32 = 1;
    L_0x0271:
        r13 = r15.i;	 Catch:{ Exception -> 0x0429 }
        if (r13 != 0) goto L_0x0278;
    L_0x0275:
        r33 = r26;
        goto L_0x027a;
    L_0x0278:
        r33 = r13;
    L_0x027a:
        r13 = new muc;	 Catch:{ Exception -> 0x0429 }
        r26 = r13;
        r27 = r12;
        r26.<init>(r27, r28, r29, r30, r31, r32, r33);	 Catch:{ Exception -> 0x0429 }
        r1.add(r13);	 Catch:{ Exception -> 0x0429 }
        r12 = r34;
        r13 = r35;
        r14 = r36;
        goto L_0x021d;
    L_0x028d:
        r35 = r13;
        r36 = r14;
        r1 = (java.util.List) r1;	 Catch:{ Exception -> 0x0429 }
        goto L_0x029e;
    L_0x0294:
        r22 = r1;
        r24 = r12;
        r35 = r13;
        r36 = r14;
        r1 = r25;
    L_0x029e:
        if (r1 != 0) goto L_0x02a4;
    L_0x02a0:
        r1 = defpackage.ajyw.a;	 Catch:{ Exception -> 0x0429 }
        r1 = (java.util.List) r1;	 Catch:{ Exception -> 0x0429 }
    L_0x02a4:
        r12 = r2.ai;	 Catch:{ Exception -> 0x0429 }
        if (r12 == 0) goto L_0x03b1;
    L_0x02a8:
        r12 = r2.ai;	 Catch:{ Exception -> 0x0429 }
        r13 = "response.attachment";
        defpackage.akcr.a(r12, r13);	 Catch:{ Exception -> 0x0429 }
        r13 = "attachment";
        defpackage.akcr.b(r12, r13);	 Catch:{ Exception -> 0x0429 }
        r13 = r12.a();	 Catch:{ Exception -> 0x0429 }
        if (r13 != 0) goto L_0x02bb;
    L_0x02ba:
        goto L_0x02cf;
    L_0x02bb:
        r14 = defpackage.kwc.a;	 Catch:{ Exception -> 0x0429 }
        r13 = r13.ordinal();	 Catch:{ Exception -> 0x0429 }
        r13 = r14[r13];	 Catch:{ Exception -> 0x0429 }
        r14 = 1;
        if (r13 == r14) goto L_0x0383;
    L_0x02c6:
        r14 = 2;
        if (r13 == r14) goto L_0x034c;
    L_0x02c9:
        r4 = 3;
        if (r13 == r4) goto L_0x0320;
    L_0x02cc:
        r3 = 4;
        if (r13 == r3) goto L_0x02d3;
    L_0x02cf:
        r3 = r25;
        goto L_0x03af;
    L_0x02d3:
        r3 = r12.f;	 Catch:{ Exception -> 0x0429 }
        if (r3 == 0) goto L_0x0319;
    L_0x02d7:
        r4 = r3.a;	 Catch:{ Exception -> 0x0429 }
        if (r4 == 0) goto L_0x0319;
    L_0x02db:
        r4 = r3.h;	 Catch:{ Exception -> 0x0429 }
        if (r4 == 0) goto L_0x0319;
    L_0x02df:
        r4 = r3.b();	 Catch:{ Exception -> 0x0429 }
        r13 = defpackage.ahkn.a.WEB_SITE;	 Catch:{ Exception -> 0x0429 }
        if (r4 != r13) goto L_0x02e9;
    L_0x02e7:
        r4 = 1;
        goto L_0x02ea;
    L_0x02e9:
        r4 = 0;
    L_0x02ea:
        if (r4 == 0) goto L_0x02f1;
    L_0x02ec:
        r4 = r3.j;	 Catch:{ Exception -> 0x0429 }
        r32 = r4;
        goto L_0x02f3;
    L_0x02f1:
        r32 = r25;
    L_0x02f3:
        r4 = new mva$b;	 Catch:{ Exception -> 0x0429 }
        r13 = r3.a;	 Catch:{ Exception -> 0x0429 }
        r14 = "it.uri";
        defpackage.akcr.a(r13, r14);	 Catch:{ Exception -> 0x0429 }
        r14 = r3.c;	 Catch:{ Exception -> 0x0429 }
        r3 = r3.h;	 Catch:{ Exception -> 0x0429 }
        r15 = "it.androidPackageId";
        defpackage.akcr.a(r3, r15);	 Catch:{ Exception -> 0x0429 }
        r15 = r12.d;	 Catch:{ Exception -> 0x0429 }
        r12 = r12.g;	 Catch:{ Exception -> 0x0429 }
        r26 = r4;
        r27 = r13;
        r28 = r14;
        r29 = r3;
        r30 = r15;
        r31 = r12;
        r26.<init>(r27, r28, r29, r30, r31, r32);	 Catch:{ Exception -> 0x0429 }
        goto L_0x031b;
    L_0x0319:
        r4 = r25;
    L_0x031b:
        r3 = r4;
        r3 = (defpackage.mva) r3;	 Catch:{ Exception -> 0x0429 }
        goto L_0x03af;
    L_0x0320:
        r3 = r12.e;	 Catch:{ Exception -> 0x0429 }
        if (r3 == 0) goto L_0x0349;
    L_0x0324:
        r4 = r3.c;	 Catch:{ Exception -> 0x0429 }
        if (r4 == 0) goto L_0x0349;
    L_0x0328:
        r4 = new mva$a;	 Catch:{ Exception -> 0x0429 }
        r13 = r3.c;	 Catch:{ Exception -> 0x0429 }
        r14 = "it.androidAppUrl";
        defpackage.akcr.a(r13, r14);	 Catch:{ Exception -> 0x0429 }
        r14 = r3.a;	 Catch:{ Exception -> 0x0429 }
        r3 = r3.d;	 Catch:{ Exception -> 0x0429 }
        r15 = r12.d;	 Catch:{ Exception -> 0x0429 }
        r12 = r12.g;	 Catch:{ Exception -> 0x0429 }
        r26 = r4;
        r27 = r13;
        r28 = r14;
        r29 = r3;
        r30 = r15;
        r31 = r12;
        r26.<init>(r27, r28, r29, r30, r31);	 Catch:{ Exception -> 0x0429 }
        goto L_0x031b;
    L_0x0349:
        r4 = r25;
        goto L_0x031b;
    L_0x034c:
        r4 = r12.c;	 Catch:{ Exception -> 0x0429 }
        if (r4 == 0) goto L_0x037d;
    L_0x0350:
        r13 = r4.a;	 Catch:{ Exception -> 0x0429 }
        if (r13 == 0) goto L_0x037d;
    L_0x0354:
        r13 = r4.a;	 Catch:{ Exception -> 0x0429 }
        defpackage.akcr.a(r13, r3);	 Catch:{ Exception -> 0x0429 }
        r13 = (java.lang.CharSequence) r13;	 Catch:{ Exception -> 0x0429 }
        r13 = r13.length();	 Catch:{ Exception -> 0x0429 }
        if (r13 != 0) goto L_0x0363;
    L_0x0361:
        r13 = 1;
        goto L_0x0364;
    L_0x0363:
        r13 = 0;
    L_0x0364:
        if (r13 != 0) goto L_0x037d;
    L_0x0366:
        r13 = new mva$d;	 Catch:{ Exception -> 0x0429 }
        r14 = r4.a;	 Catch:{ Exception -> 0x0429 }
        defpackage.akcr.a(r14, r3);	 Catch:{ Exception -> 0x0429 }
        r3 = java.lang.Boolean.TRUE;	 Catch:{ Exception -> 0x0429 }
        r4 = r4.b;	 Catch:{ Exception -> 0x0429 }
        r3 = defpackage.akcr.a(r3, r4);	 Catch:{ Exception -> 0x0429 }
        r4 = r12.d;	 Catch:{ Exception -> 0x0429 }
        r12 = r12.g;	 Catch:{ Exception -> 0x0429 }
        r13.<init>(r14, r3, r4, r12);	 Catch:{ Exception -> 0x0429 }
        goto L_0x037f;
    L_0x037d:
        r13 = r25;
    L_0x037f:
        r3 = r13;
        r3 = (defpackage.mva) r3;	 Catch:{ Exception -> 0x0429 }
        goto L_0x03af;
    L_0x0383:
        r3 = r12.b;	 Catch:{ Exception -> 0x0429 }
        if (r3 == 0) goto L_0x03ac;
    L_0x0387:
        r13 = r3.a;	 Catch:{ Exception -> 0x0429 }
        if (r13 == 0) goto L_0x03ac;
    L_0x038b:
        r13 = r3.a;	 Catch:{ Exception -> 0x0429 }
        defpackage.akcr.a(r13, r4);	 Catch:{ Exception -> 0x0429 }
        r13 = (java.lang.CharSequence) r13;	 Catch:{ Exception -> 0x0429 }
        r13 = r13.length();	 Catch:{ Exception -> 0x0429 }
        if (r13 != 0) goto L_0x039a;
    L_0x0398:
        r13 = 1;
        goto L_0x039b;
    L_0x039a:
        r13 = 0;
    L_0x039b:
        if (r13 != 0) goto L_0x03ac;
    L_0x039d:
        r13 = new mva$c;	 Catch:{ Exception -> 0x0429 }
        r3 = r3.a;	 Catch:{ Exception -> 0x0429 }
        defpackage.akcr.a(r3, r4);	 Catch:{ Exception -> 0x0429 }
        r4 = r12.d;	 Catch:{ Exception -> 0x0429 }
        r12 = r12.g;	 Catch:{ Exception -> 0x0429 }
        r13.<init>(r3, r4, r12);	 Catch:{ Exception -> 0x0429 }
        goto L_0x037f;
    L_0x03ac:
        r13 = r25;
        goto L_0x037f;
    L_0x03af:
        r15 = r3;
        goto L_0x03b3;
    L_0x03b1:
        r15 = r25;
    L_0x03b3:
        r3 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r3 = r3.A;	 Catch:{ Exception -> 0x0429 }
        if (r3 == 0) goto L_0x03c0;
    L_0x03b9:
        r3 = r3.booleanValue();	 Catch:{ Exception -> 0x0429 }
        r26 = r3;
        goto L_0x03c2;
    L_0x03c0:
        r26 = 0;
    L_0x03c2:
        r3 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r14 = r3.h;	 Catch:{ Exception -> 0x0429 }
        r3 = r2.E;	 Catch:{ Exception -> 0x0429 }
        if (r3 == 0) goto L_0x03d9;
    L_0x03ca:
        r3 = r3.a;	 Catch:{ Exception -> 0x0429 }
        if (r3 == 0) goto L_0x03d4;
    L_0x03ce:
        r4 = new mue;	 Catch:{ Exception -> 0x0429 }
        r4.<init>(r3);	 Catch:{ Exception -> 0x0429 }
        goto L_0x03d6;
    L_0x03d4:
        r4 = r25;
    L_0x03d6:
        r27 = r4;
        goto L_0x03db;
    L_0x03d9:
        r27 = r25;
    L_0x03db:
        r13 = new mwt;	 Catch:{ Exception -> 0x0429 }
        r3 = r2.v;	 Catch:{ Exception -> 0x0429 }
        r3 = r3.d;	 Catch:{ Exception -> 0x0429 }
        r13.<init>(r10, r0, r3);	 Catch:{ Exception -> 0x0429 }
        r0 = r2.O;	 Catch:{ Exception -> 0x0429 }
        r3 = -1;
        if (r0 == 0) goto L_0x03f6;
    L_0x03e9:
        r0 = (java.lang.Number) r0;	 Catch:{ Exception -> 0x0429 }
        r0 = r0.intValue();	 Catch:{ Exception -> 0x0429 }
        if (r0 <= 0) goto L_0x03f4;
    L_0x03f1:
        r4 = 1;
        r3 = r0 + -1;
    L_0x03f4:
        r0 = r3;
        goto L_0x03f7;
    L_0x03f6:
        r0 = -1;
    L_0x03f7:
        r28 = new mux;	 Catch:{ Exception -> 0x0429 }
        r3 = r28;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r11;
        r10 = r36;
        r11 = r35;
        r12 = r24;
        r24 = r13;
        r13 = r21;
        r21 = r14;
        r14 = r39;
        r18 = r20;
        r16 = r22;
        r17 = r1;
        r19 = r26;
        r20 = r21;
        r21 = r27;
        r22 = r24;
        r24 = r0;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);	 Catch:{ Exception -> 0x0429 }
        return r28;
    L_0x0423:
        r0 = new ajxk;	 Catch:{ Exception -> 0x0429 }
        r0.<init>();	 Catch:{ Exception -> 0x0429 }
        throw r0;	 Catch:{ Exception -> 0x0429 }
    L_0x0429:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r3 = "Failed to map a GeofilterResponse to a Lens with id [";
        r1.<init>(r3);
        r2 = r2.a;
        r1.append(r2);
        r2 = 93;
        r1.append(r2);
        r1 = r1.toString();
        r2 = r37;
        r3 = r2.b;
        r4 = defpackage.gqt.NORMAL;
        r0 = (java.lang.Throwable) r0;
        r5 = r2.a;
        r6 = "DefaultGeofilterToLensMapper";
        r5 = r5.callsite(r6);
        r3.a(r4, r0, r5);
        r0 = r2.d;
        r0 = r0.invoke();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0465;
    L_0x0460:
        r0 = r2.c;
        r0.invoke(r1);
    L_0x0465:
        return r25;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfj.a(aenr, mwg):mux");
    }
}
