package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import defpackage.bns.b;
import defpackage.bqg.d;

/* renamed from: bpm */
public final class bpm implements bnk {
    private static final int a = bzo.f("ID3");
    private final long b;
    private final bpn c;
    private final bzc d;
    private boolean e;

    /* renamed from: bpm$1 */
    static class 1 implements bnn {
        1() {
        }

        public final bnk[] a() {
            return new bnk[]{new bpm()};
        }
    }

    static {
        1 1 = new 1();
    }

    public bpm() {
        this((byte) 0);
    }

    private bpm(byte b) {
        this.b = 0;
        this.c = new bpn();
        this.d = new bzc((int) Callback.DEFAULT_DRAG_ANIMATION_DURATION);
    }

    public final int a(bnl bnl, bnr bnr) {
        int a = bnl.a(this.d.a, 0, Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        if (a == -1) {
            return -1;
        }
        this.d.c(0);
        this.d.b(a);
        if (!this.e) {
            this.c.a = 0;
            this.e = true;
        }
        this.c.a(this.d);
        return 0;
    }

    public final void a(long j, long j2) {
        this.e = false;
        this.c.c();
    }

    public final void a(bnm bnm) {
        this.c.a(bnm, new d(0, 1));
        bnm.a();
        bnm.a(new b(-9223372036854775807L));
    }

    /* JADX WARNING: Missing block: B:8:0x004e, code skipped:
            r11.a();
            r5 = r5 + 1;
     */
    /* JADX WARNING: Missing block: B:9:0x0057, code skipped:
            if ((r5 - r4) < 8192) goto L_0x005a;
     */
    /* JADX WARNING: Missing block: B:10:0x0059, code skipped:
            return false;
     */
    public final boolean a(defpackage.bnl r11) {
        /*
        r10 = this;
        r0 = new bzc;
        r1 = 10;
        r0.<init>(r1);
        r2 = new bzb;
        r3 = r0.a;
        r2.<init>(r3);
        r3 = 0;
        r4 = 0;
    L_0x0010:
        r5 = r0.a;
        r11.c(r5, r3, r1);
        r0.c(r3);
        r5 = r0.g();
        r6 = a;
        if (r5 != r6) goto L_0x002f;
    L_0x0020:
        r5 = 3;
        r0.d(r5);
        r5 = r0.n();
        r6 = r5 + 10;
        r4 = r4 + r6;
        r11.c(r5);
        goto L_0x0010;
    L_0x002f:
        r11.a();
        r11.c(r4);
        r5 = r4;
    L_0x0036:
        r1 = 0;
        r6 = 0;
    L_0x0038:
        r7 = r0.a;
        r8 = 2;
        r11.c(r7, r3, r8);
        r0.c(r3);
        r7 = r0.e();
        r8 = 65526; // 0xfff6 float:9.1821E-41 double:3.2374E-319;
        r7 = r7 & r8;
        r8 = 65520; // 0xfff0 float:9.1813E-41 double:3.2371E-319;
        if (r7 == r8) goto L_0x005e;
    L_0x004e:
        r11.a();
        r5 = r5 + 1;
        r1 = r5 - r4;
        r6 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        if (r1 < r6) goto L_0x005a;
    L_0x0059:
        return r3;
    L_0x005a:
        r11.c(r5);
        goto L_0x0036;
    L_0x005e:
        r7 = 1;
        r1 = r1 + r7;
        r8 = 4;
        if (r1 < r8) goto L_0x0068;
    L_0x0063:
        r9 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        if (r6 <= r9) goto L_0x0068;
    L_0x0067:
        return r7;
    L_0x0068:
        r7 = r0.a;
        r11.c(r7, r3, r8);
        r7 = 14;
        r2.a(r7);
        r7 = 13;
        r7 = r2.c(r7);
        r8 = 6;
        if (r7 > r8) goto L_0x007c;
    L_0x007b:
        return r3;
    L_0x007c:
        r8 = r7 + -6;
        r11.c(r8);
        r6 = r6 + r7;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpm.a(bnl):boolean");
    }
}
