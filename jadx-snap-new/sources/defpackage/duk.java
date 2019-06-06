package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import defpackage.ablu.a;
import defpackage.ablu.b;
import defpackage.ablu.e;
import defpackage.ablu.f;
import defpackage.ablu.g;
import defpackage.ebi.q;
import defpackage.ebi.r;
import defpackage.ebi.s;
import defpackage.epm.1;
import java.util.UUID;

/* renamed from: duk */
public final class duk {
    final ablu a;
    final dof b;
    final aipn<ablb> c;
    UUID d;
    boolean e;
    private final dqm f;
    private final ftl g;
    private final Supplier<Optional<dnk>> h;
    private final eil i;
    private final dug j;
    private final Supplier<Optional<eeb>> k;
    private final Supplier<aaoh> l;
    private final ilv m;
    private final Supplier<abaw> n;
    private final Supplier<aaqd> o;

    public duk(dqm dqm, ablu ablu, ftl ftl, Supplier<Optional<dnk>> supplier, dug dug, Supplier<Optional<eeb>> supplier2, Supplier<aaoh> supplier3, ilv ilv, eil eil, dof dof, Supplier<abaw> supplier4, Supplier<aaqd> supplier5, aipn<ablb> aipn) {
        this.f = dqm;
        this.a = ablu;
        this.g = ftl;
        this.h = supplier;
        this.i = eil;
        this.j = dug;
        this.m = ilv;
        this.k = supplier2;
        this.l = supplier3;
        this.b = dof;
        this.n = supplier4;
        this.o = supplier5;
        this.c = aipn;
    }

    public final void a() {
        this.a.a(e.PRE_CAPTURE_OPERATION_FINISHED);
        ablu ablu = this.a;
        int i = 1.c[this.f.d().ordinal()];
        a aVar = i != 1 ? i != 2 ? null : a.BACK : a.FRONT;
        ablu.a(aVar);
    }

    public final void a(aaig aaig) {
        aaie aaie = new aaie();
        aaie.a = aaig;
        aaie.c = aaif.SHUTTER;
        aaie.d = this.d.toString();
        aaie.b = "CAMERA/VIEW_FINDER";
        aaie.e = Boolean.valueOf(this.i.a());
        aaie.f = Boolean.valueOf(this.i.c());
        this.j.a(aaie);
        this.b.a(this.d, aaie.a, aaie.b, aaie.c, this.e);
        this.b.a(dof.a.SNAP_ACTION);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020c  */
    /* JADX WARNING: Missing block: B:19:0x0079, code skipped:
            if (r11 == 4) goto L_0x008b;
     */
    public final void a(defpackage.abyi r21) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = r1.e;
        r3 = new aaii;
        r3.<init>();
        r4 = r2.k;
        r4 = r4.booleanValue();
        r7 = 1;
        if (r4 == 0) goto L_0x0017;
    L_0x0015:
        r9 = r7;
        goto L_0x0019;
    L_0x0017:
        r9 = 0;
    L_0x0019:
        r4 = r1.e;
        r11 = "receiver$0";
        defpackage.akcr.b(r4, r11);
        r4 = r4.a;
        r12 = "this.mediaType";
        defpackage.akcr.a(r4, r12);
        r4 = r4.intValue();
        r4 = defpackage.abyp.a(r4);
        if (r4 == 0) goto L_0x0034;
    L_0x0031:
        r12 = defpackage.aasc.VIDEO;
        goto L_0x0036;
    L_0x0034:
        r12 = defpackage.aasc.IMAGE;
    L_0x0036:
        r13 = r2.h;
        r3.u = r13;
        r13 = java.lang.Long.valueOf(r9);
        r3.b = r13;
        r13 = r2.j;
        r3.c = r13;
        r3.g = r12;
        r13 = java.lang.Boolean.FALSE;
        r3.f = r13;
        r13 = r2.l;
        r3.h = r13;
        r13 = r0.k;
        r13 = r13.get();
        r13 = (com.google.common.base.Optional) r13;
        defpackage.akcr.b(r13, r11);
        r11 = r13.isPresent();
        r14 = 1;
        if (r11 == 0) goto L_0x008b;
    L_0x0060:
        r11 = r13.get();
        r11 = (defpackage.eeb) r11;
        if (r11 == 0) goto L_0x0085;
    L_0x0068:
        r13 = defpackage.eet.a;
        r11 = r11.ordinal();
        r11 = r13[r11];
        if (r11 == r14) goto L_0x0082;
    L_0x0072:
        r13 = 2;
        if (r11 == r13) goto L_0x007f;
    L_0x0075:
        r13 = 3;
        if (r11 == r13) goto L_0x007c;
    L_0x0078:
        r13 = 4;
        if (r11 != r13) goto L_0x0085;
    L_0x007b:
        goto L_0x008b;
    L_0x007c:
        r11 = defpackage.aace.PORTRAIT;
        goto L_0x008d;
    L_0x007f:
        r11 = defpackage.aace.BATCH_CAPTURE;
        goto L_0x008d;
    L_0x0082:
        r11 = defpackage.aace.TIMER;
        goto L_0x008d;
    L_0x0085:
        r1 = new ajxk;
        r1.<init>();
        throw r1;
    L_0x008b:
        r11 = defpackage.aace.NONE;
    L_0x008d:
        r3.j = r11;
        r11 = r0.l;
        r11 = r11.get();
        r11 = (defpackage.aaoh) r11;
        r3.k = r11;
        r11 = r0.f;
        r11 = r11.m();
        r13 = r11.isPresent();
        if (r13 == 0) goto L_0x00b0;
    L_0x00a5:
        r11 = r11.get();
        r11 = (defpackage.dnm) r11;
        r11 = r11.name();
        goto L_0x00b1;
    L_0x00b0:
        r11 = 0;
    L_0x00b1:
        r3.i = r11;
        if (r4 == 0) goto L_0x0110;
    L_0x00b5:
        r13 = r0.g;
        r5 = defpackage.dnd.RECORD_THREE_SECOND_SEGMENT;
        r5 = r13.a(r5);
        if (r5 == 0) goto L_0x00c2;
    L_0x00bf:
        r5 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        goto L_0x00c4;
    L_0x00c2:
        r5 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x00c4:
        r6 = r0.g;
        r13 = defpackage.dnd.MULTISNAP_MIN_LAST_SEGMENT_LENGTH;
        r6 = r6.f(r13);
        r5 = r5 + r6;
        r6 = r2.u;
        r18 = r6.longValue();
        r5 = (long) r5;
        r13 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1));
        if (r13 <= 0) goto L_0x00da;
    L_0x00d8:
        r5 = 1;
        goto L_0x00db;
    L_0x00da:
        r5 = 0;
    L_0x00db:
        if (r5 == 0) goto L_0x00e0;
    L_0x00dd:
        r16 = r7;
        goto L_0x00e2;
    L_0x00e0:
        r16 = 0;
    L_0x00e2:
        r5 = java.lang.Long.valueOf(r16);
        r1 = r1.e;
        r1 = r1.u;
        r14 = r1.longValue();
        r14 = (double) r14;
        r16 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        java.lang.Double.isNaN(r14);
        r14 = r14 / r16;
        r15 = java.lang.Double.valueOf(r14);
        r3.a = r5;
        r3.e = r15;
        r1 = r0.m;
        r14 = defpackage.inq.VIDEO_MEDIA_SUCCESS;
        r1.c(r14, r7);
        r1 = r0.b;
        r7 = defpackage.dof.a.VIDEO_CREATION;
        r1.a(r7);
        goto L_0x0120;
    L_0x0110:
        r1 = r0.m;
        r5 = defpackage.inq.PHOTO_MEDIA_SUCCESS;
        r1.c(r5, r7);
        r1 = r0.b;
        r5 = defpackage.dof.a.IMAGE_CREATION;
        r1.a(r5);
        r5 = 0;
        r15 = 0;
    L_0x0120:
        r1 = r0.h;
        r1 = r1.get();
        r1 = (com.google.common.base.Optional) r1;
        r1 = r1.asSet();
        r1 = r1.iterator();
    L_0x0130:
        r7 = r1.hasNext();
        if (r7 == 0) goto L_0x0150;
    L_0x0136:
        r7 = r1.next();
        r7 = (defpackage.dnk) r7;
        r8 = r7 instanceof defpackage.dnk.b;
        if (r8 == 0) goto L_0x0130;
    L_0x0140:
        r7 = (defpackage.dnk.b) r7;
        r8 = r7.a;
        if (r8 == 0) goto L_0x014b;
    L_0x0146:
        r7 = r7.b;
        r3.w = r7;
        goto L_0x0130;
    L_0x014b:
        r7 = r7.b;
        r3.v = r7;
        goto L_0x0130;
    L_0x0150:
        r1 = r0.n;
        r1 = r1.get();
        r1 = (defpackage.abaw) r1;
        r3.d = r1;
        r1 = r2.w;
        if (r1 == 0) goto L_0x01f6;
    L_0x015e:
        r7 = defpackage.aapp.values();
        r8 = r7.length;
        r14 = 0;
    L_0x0164:
        if (r14 >= r8) goto L_0x017a;
    L_0x0166:
        r16 = r7[r14];
        r6 = r16.name();
        r11 = r1.c;
        r6 = r6.equals(r11);
        if (r6 == 0) goto L_0x0177;
    L_0x0174:
        r6 = r16;
        goto L_0x017b;
    L_0x0177:
        r14 = r14 + 1;
        goto L_0x0164;
    L_0x017a:
        r6 = 0;
    L_0x017b:
        r7 = r1.k;
        r7 = r7.booleanValue();
        if (r7 == 0) goto L_0x01d4;
    L_0x0183:
        r7 = new aaoc;
        r7.<init>();
        r8 = java.lang.Long.valueOf(r9);
        r7.b = r8;
        r8 = r2.j;
        r7.c = r8;
        r8 = r0.n;
        r8 = r8.get();
        r8 = (defpackage.abaw) r8;
        r7.d = r8;
        r7.g = r12;
        r8 = java.lang.Boolean.FALSE;
        r7.f = r8;
        r8 = r1.a;
        r7.i = r8;
        r7.k = r6;
        r6 = r1.h;
        r7.q = r6;
        r6 = r1.b;
        r7.j = r6;
        r6 = r1.i;
        r7.m = r6;
        r6 = r1.j;
        r7.l = r6;
        r6 = r1.e;
        r7.p = r6;
        r6 = r1.d;
        r7.o = r6;
        r1 = r1.f;
        r7.n = r1;
        if (r4 == 0) goto L_0x01ce;
    L_0x01c6:
        r7.a = r5;
        r7.e = r15;
        r1 = r2.l;
        r7.h = r1;
    L_0x01ce:
        r1 = r0.j;
        r1.a(r7);
        goto L_0x01f6;
    L_0x01d4:
        r2 = r1.a;
        r3.l = r2;
        r3.n = r6;
        r2 = r1.h;
        r3.t = r2;
        r2 = r1.b;
        r3.m = r2;
        r2 = r1.i;
        r3.p = r2;
        r2 = r1.j;
        r3.o = r2;
        r2 = r1.e;
        r3.s = r2;
        r2 = r1.d;
        r3.r = r2;
        r1 = r1.f;
        r3.q = r1;
    L_0x01f6:
        r1 = r0.h;
        r1 = r1.get();
        r1 = (com.google.common.base.Optional) r1;
        r1 = r1.asSet();
        r1 = r1.iterator();
    L_0x0206:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0274;
    L_0x020c:
        r2 = r1.next();
        r2 = (defpackage.dnk) r2;
        r4 = r2 instanceof defpackage.dnk.a;
        if (r4 == 0) goto L_0x0206;
    L_0x0216:
        r2 = (defpackage.dnk.a) r2;
        r1 = r2.a;
        r15 = new aahp;
        r15.<init>();
        r4 = r1.b;
        r15.b = r4;
        r4 = r1.c;
        r15.a = r4;
        r4 = r1.f;
        r4 = android.text.TextUtils.isEmpty(r4);
        r5 = 1;
        r4 = r4 ^ r5;
        r1 = r1.e;
        r1 = android.text.TextUtils.isEmpty(r1);
        r1 = r1 ^ r5;
        r6 = r2.a;
        r6 = r6.d;
        if (r6 == 0) goto L_0x023f;
    L_0x023c:
        r17 = 1;
        goto L_0x0241;
    L_0x023f:
        r17 = 0;
    L_0x0241:
        if (r17 == 0) goto L_0x024d;
    L_0x0243:
        r5 = r6.s;
        if (r5 == 0) goto L_0x024a;
    L_0x0247:
        r5 = defpackage.aahq.ANIMATED;
        goto L_0x024f;
    L_0x024a:
        r5 = defpackage.aahq.STATIC;
        goto L_0x024f;
    L_0x024d:
        r5 = defpackage.aahq.NONE;
    L_0x024f:
        r15.g = r5;
        r5 = java.lang.Boolean.valueOf(r4);
        r15.c = r5;
        r5 = java.lang.Boolean.valueOf(r1);
        r15.e = r5;
        r2 = r2.c;
        if (r2 == 0) goto L_0x0275;
    L_0x0261:
        if (r4 == 0) goto L_0x0267;
    L_0x0263:
        r2 = java.lang.Boolean.TRUE;
        r15.d = r2;
    L_0x0267:
        if (r1 == 0) goto L_0x026d;
    L_0x0269:
        r1 = java.lang.Boolean.TRUE;
        r15.f = r1;
    L_0x026d:
        if (r17 == 0) goto L_0x0275;
    L_0x026f:
        r1 = java.lang.Boolean.TRUE;
        r15.h = r1;
        goto L_0x0275;
    L_0x0274:
        r15 = 0;
    L_0x0275:
        r3.a(r15);
        r1 = r0.j;
        r1.a(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duk.a(abyi):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(aesf aesf, aeew aeew) {
        this.a.a(aeew.j.booleanValue());
        this.a.a("width", String.valueOf(aeew.q));
        this.a.a("height", String.valueOf(aeew.p));
        ablu ablu = this.a;
        int i = 1.b[this.f.g().ordinal()];
        f fVar = null;
        b bVar = i != 1 ? i != 2 ? i != 3 ? null : b.AR_CORE : b.CAMERA2 : b.CAMERA1;
        ablu.a(bVar);
        ablu = this.a;
        int i2 = 1.a[aesf.ordinal()];
        g gVar = i2 != 1 ? i2 != 2 ? null : g.VIDEO : g.PICTURE;
        ablu.a(gVar);
        ablu ablu2 = this.a;
        int i3 = 1.f[((aaqd) this.o.get()).ordinal()];
        if (i3 == 1) {
            fVar = f.ENABLED;
        } else if (i3 == 2) {
            fVar = f.DETECTED;
        } else if (i3 == 3) {
            fVar = f.NOT_DETECTED;
        } else if (i3 == 4) {
            fVar = f.NOT_SUPPORTED;
        }
        ablu2.a(fVar);
    }

    public final void a(ebi ebi) {
        dog dog;
        String stringBuilder;
        dof dof = this.b;
        if (akcr.a((Object) ebi, s.d)) {
            dog = dog.CANCEL_BY_USER;
        } else if (akcr.a((Object) ebi, r.d)) {
            dog = dog.INVALID_STATE;
        } else if (akcr.a((Object) ebi, q.d)) {
            dog = dog.NO_RETRY_WHEN_TAKING_PHOTO_FAILS;
        } else {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(dog.RECORDING_OTHER_FAILURE.toString());
            stringBuilder2.append("_");
            stringBuilder2.append(ebi.a);
            stringBuilder = stringBuilder2.toString();
            dof.a(stringBuilder, ebi.b, ebi.c);
        }
        stringBuilder = dog.toString();
        dof.a(stringBuilder, ebi.b, ebi.c);
    }

    public final void a(String str) {
        this.a.b(str);
    }

    public final void b() {
        this.a.a(e.CAMERA_CAPTURE_CONTENT_READY);
    }

    public final void c() {
        this.a.a(e.CONTENT_PROXY_SENT);
    }
}
