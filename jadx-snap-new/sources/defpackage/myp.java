package defpackage;

import com.google.common.base.Supplier;

/* renamed from: myp */
public final class myp extends adiv {
    private adiv a;
    private final Supplier<adiv> b;

    public myp(adiv adiv, Supplier<adiv> supplier) {
        akcr.b(adiv, "renderPass");
        akcr.b(supplier, "fallbackRenderPass");
        this.a = adiv;
        this.b = supplier;
    }

    public final void a(int i, int i2, adic adic) {
        this.a.a(i, i2, adic);
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        this.a.a(i, j, adie, adhu);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0010 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:4|5|6|8) */
    /* JADX WARNING: Missing block: B:5:?, code skipped:
            r0.a.e();
     */
    /* JADX WARNING: Missing block: B:6:0x0015, code skipped:
            r1 = r0.b.get();
            defpackage.akcr.a(r1, "fallbackRenderPass.get()");
            r0.a = (defpackage.adiv) r1;
            r0.a.a(r11, r12, r13, r14, r15, r16, r17);
     */
    /* JADX WARNING: Missing block: B:8:0x0032, code skipped:
            return;
     */
    public final void a(defpackage.adie r11, defpackage.adie r12, int r13, int r14, defpackage.adic r15, defpackage.adne r16, defpackage.adhz r17) {
        /*
        r10 = this;
        r0 = r10;
        r1 = r0.a;	 Catch:{ adjz -> 0x0010 }
        r2 = r11;
        r3 = r12;
        r4 = r13;
        r5 = r14;
        r6 = r15;
        r7 = r16;
        r8 = r17;
        r1.a(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ adjz -> 0x0010 }
        return;
    L_0x0010:
        r1 = r0.a;	 Catch:{ adjz -> 0x0015 }
        r1.e();	 Catch:{ adjz -> 0x0015 }
    L_0x0015:
        r1 = r0.b;
        r1 = r1.get();
        r2 = "fallbackRenderPass.get()";
        defpackage.akcr.a(r1, r2);
        r1 = (defpackage.adiv) r1;
        r0.a = r1;
        r2 = r0.a;
        r3 = r11;
        r4 = r12;
        r5 = r13;
        r6 = r14;
        r7 = r15;
        r8 = r16;
        r9 = r17;
        r2.a(r3, r4, r5, r6, r7, r8, r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myp.a(adie, adie, int, int, adic, adne, adhz):void");
    }

    public final void e() {
        this.a.e();
    }
}
