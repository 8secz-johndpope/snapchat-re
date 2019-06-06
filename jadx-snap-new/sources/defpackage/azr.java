package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: azr */
public class azr {
    final Map<String, azt> a = new HashMap();
    final Set<azt> b = new CopyOnWriteArraySet();
    private final azw c;
    private final CopyOnWriteArraySet<Object> d = new CopyOnWriteArraySet();
    private boolean e = true;

    public azr(azw azw) {
        if (azw != null) {
            this.c = azw;
            this.c.a(this);
            return;
        }
        throw new IllegalArgumentException("springLooper is required");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARNING: Missing block: B:44:0x0160, code skipped:
            if (r0 != null) goto L_0x0162;
     */
    private void b(double r32) {
        /*
        r31 = this;
        r0 = r31;
        r1 = r0.b;
        r1 = r1.iterator();
    L_0x0008:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x01be;
    L_0x000e:
        r2 = r1.next();
        r2 = (defpackage.azt) r2;
        r3 = r2.b();
        if (r3 == 0) goto L_0x0021;
    L_0x001a:
        r3 = r2.i;
        if (r3 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x0021;
    L_0x001f:
        r3 = 0;
        goto L_0x0022;
    L_0x0021:
        r3 = 1;
    L_0x0022:
        if (r3 == 0) goto L_0x01b3;
    L_0x0024:
        r6 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r6 = r32 / r6;
        r3 = r2.b();
        if (r3 == 0) goto L_0x003a;
    L_0x0031:
        r8 = r2.i;
        if (r8 != 0) goto L_0x0036;
    L_0x0035:
        goto L_0x003a;
    L_0x0036:
        r16 = r1;
        goto L_0x01b0;
    L_0x003a:
        r8 = 4589276106681592316; // 0x3fb0624dd2f1a9fc float:-5.18969491E11 double:0.064;
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x0044;
    L_0x0043:
        r6 = r8;
    L_0x0044:
        r8 = r2.l;
        r8 = r8 + r6;
        r2.l = r8;
        r6 = r2.a;
        r6 = r6.b;
        r8 = r2.a;
        r8 = r8.a;
        r10 = r2.d;
        r10 = r10.a;
        r12 = r2.d;
        r12 = r12.b;
        r14 = r2.f;
        r14 = r14.a;
        r5 = r2.f;
        r4 = r5.b;
        r16 = r1;
    L_0x0063:
        r0 = r2.l;
        r17 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r19 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1));
        if (r19 < 0) goto L_0x00e8;
    L_0x006e:
        r0 = r2.l;
        r0 = r0 - r17;
        r2.l = r0;
        r0 = r2.l;
        r4 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1));
        if (r4 >= 0) goto L_0x0082;
    L_0x007a:
        r0 = r2.e;
        r0.a = r10;
        r0 = r2.e;
        r0.b = r12;
    L_0x0082:
        r0 = r2.h;
        r0 = r0 - r14;
        r0 = r0 * r6;
        r4 = r8 * r12;
        r0 = r0 - r4;
        r4 = r12 * r17;
        r14 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r4 = r4 * r14;
        r4 = r4 + r10;
        r19 = r0 * r17;
        r19 = r19 * r14;
        r19 = r12 + r19;
        r14 = r2.h;
        r14 = r14 - r4;
        r14 = r14 * r6;
        r4 = r8 * r19;
        r14 = r14 - r4;
        r4 = r19 * r17;
        r21 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r4 = r4 * r21;
        r4 = r4 + r10;
        r23 = r14 * r17;
        r23 = r23 * r21;
        r23 = r12 + r23;
        r21 = r0;
        r0 = r2.h;
        r0 = r0 - r4;
        r0 = r0 * r6;
        r4 = r8 * r23;
        r0 = r0 - r4;
        r4 = r23 * r17;
        r4 = r4 + r10;
        r25 = r0 * r17;
        r25 = r12 + r25;
        r27 = r10;
        r10 = r2.h;
        r10 = r10 - r4;
        r10 = r10 * r6;
        r29 = r8 * r25;
        r10 = r10 - r29;
        r19 = r19 + r23;
        r23 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r19 = r19 * r23;
        r19 = r12 + r19;
        r19 = r19 + r25;
        r29 = 4595172819793696085; // 0x3fc5555555555555 float:1.46601547E13 double:0.16666666666666666;
        r19 = r19 * r29;
        r14 = r14 + r0;
        r14 = r14 * r23;
        r0 = r21 + r14;
        r0 = r0 + r10;
        r0 = r0 * r29;
        r19 = r19 * r17;
        r10 = r27 + r19;
        r0 = r0 * r17;
        r12 = r12 + r0;
        r14 = r4;
        r4 = r25;
        goto L_0x0063;
    L_0x00e8:
        r27 = r10;
        r0 = r2.f;
        r0.a = r14;
        r0 = r2.f;
        r0.b = r4;
        r0 = r2.d;
        r0.a = r10;
        r0 = r2.d;
        r0.b = r12;
        r0 = r2.l;
        r4 = 0;
        r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r8 <= 0) goto L_0x0127;
    L_0x0102:
        r0 = r2.l;
        r0 = r0 / r17;
        r8 = r2.d;
        r9 = r2.d;
        r9 = r9.a;
        r9 = r9 * r0;
        r11 = r2.e;
        r11 = r11.a;
        r13 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r13 = r13 - r0;
        r11 = r11 * r13;
        r9 = r9 + r11;
        r8.a = r9;
        r8 = r2.d;
        r9 = r2.d;
        r9 = r9.b;
        r9 = r9 * r0;
        r0 = r2.e;
        r0 = r0.b;
        r0 = r0 * r13;
        r9 = r9 + r0;
        r8.b = r9;
    L_0x0127:
        r0 = r2.b();
        if (r0 != 0) goto L_0x0162;
    L_0x012d:
        r0 = r2.b;
        if (r0 == 0) goto L_0x017f;
    L_0x0131:
        r0 = r2.a;
        r0 = r0.b;
        r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r8 <= 0) goto L_0x015f;
    L_0x0139:
        r0 = r2.g;
        r8 = r2.h;
        r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x014b;
    L_0x0141:
        r0 = r2.d;
        r0 = r0.a;
        r8 = r2.h;
        r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r10 > 0) goto L_0x015d;
    L_0x014b:
        r0 = r2.g;
        r8 = r2.h;
        r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r10 <= 0) goto L_0x015f;
    L_0x0153:
        r0 = r2.d;
        r0 = r0.a;
        r8 = r2.h;
        r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r10 >= 0) goto L_0x015f;
    L_0x015d:
        r0 = 1;
        goto L_0x0160;
    L_0x015f:
        r0 = 0;
    L_0x0160:
        if (r0 == 0) goto L_0x017f;
    L_0x0162:
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x0171;
    L_0x0166:
        r0 = r2.h;
        r2.g = r0;
        r0 = r2.d;
        r6 = r2.h;
        r0.a = r6;
        goto L_0x017b;
    L_0x0171:
        r0 = r2.d;
        r0 = r0.a;
        r2.h = r0;
        r0 = r2.h;
        r2.g = r0;
    L_0x017b:
        r2.c(r4);
        r3 = 1;
    L_0x017f:
        r0 = r2.i;
        if (r0 == 0) goto L_0x0188;
    L_0x0183:
        r0 = 0;
        r2.i = r0;
        r1 = 1;
        goto L_0x018a;
    L_0x0188:
        r0 = 0;
        r1 = 0;
    L_0x018a:
        if (r3 == 0) goto L_0x0190;
    L_0x018c:
        r3 = 1;
        r2.i = r3;
        r0 = 1;
    L_0x0190:
        r3 = r2.k;
        r3 = r3.iterator();
    L_0x0196:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x01b0;
    L_0x019c:
        r4 = r3.next();
        r4 = (defpackage.azv) r4;
        if (r1 == 0) goto L_0x01a7;
    L_0x01a4:
        r4.onSpringActivate(r2);
    L_0x01a7:
        r4.onSpringUpdate(r2);
        if (r0 == 0) goto L_0x0196;
    L_0x01ac:
        r4.onSpringAtRest(r2);
        goto L_0x0196;
    L_0x01b0:
        r0 = r31;
        goto L_0x01ba;
    L_0x01b3:
        r16 = r1;
        r1 = r0.b;
        r1.remove(r2);
    L_0x01ba:
        r1 = r16;
        goto L_0x0008;
    L_0x01be:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azr.b(double):void");
    }

    public final azt a() {
        azt azt = new azt(this);
        if (this.a.containsKey(azt.c)) {
            throw new IllegalArgumentException("spring is already registered");
        }
        this.a.put(azt.c, azt);
        return azt;
    }

    public final void a(double d) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        b(d);
        if (this.b.isEmpty()) {
            this.e = true;
        }
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        if (this.e) {
            this.c.b();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        azt azt = (azt) this.a.get(str);
        if (azt != null) {
            this.b.add(azt);
            if (this.e) {
                this.e = false;
                this.c.a();
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("springId ");
        stringBuilder.append(str);
        stringBuilder.append(" does not reference a registered spring");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
