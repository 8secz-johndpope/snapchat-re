package defpackage;

import defpackage.jxa.a;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: acut */
public final class acut {
    static final idd a = adcw.b.callsite("PoiMediaManager");
    public final aczv b;
    public final acux c = new acux(0);
    public final acuy d;
    public final adcl e;
    final adbv f;
    private final actz g;
    private final jwe h;
    private final ajei i;

    /* renamed from: acut$a */
    public static class a implements aczq<byte[]> {
        private final adbt a;
        private final WeakReference<acut> b;
        private final long c = System.currentTimeMillis();

        public a(adbt adbt, acut acut) {
            this.a = adbt;
            this.b = new WeakReference(acut);
        }

        public final /* synthetic */ void a(Object obj, aczw aczw) {
            byte[] bArr = (byte[]) obj;
            acut acut = (acut) this.b.get();
            if (aczw == null && acut != null) {
                acut.a(acut, this.a, bArr);
            }
        }
    }

    /* renamed from: acut$b */
    static class b implements acus {
        private final WeakReference<acut> a;
        private final adbt b;
        private final kaz<jwj> c;

        public b(acut acut, adbt adbt, kaz<jwj> kaz) {
            this.a = new WeakReference(acut);
            this.b = adbt;
            this.c = kaz;
        }

        public final void onTextureUploaded(acxn acxn) {
            acut acut = (acut) this.a.get();
            if (acut != null) {
                acut.c.b(this.b.a);
                acut.d.a(this.b.a, acxn);
                this.c.dispose();
                acut.f.m();
            }
        }
    }

    /* renamed from: acut$c */
    static class c implements jwg {
        private c() {
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final String a() {
            return "POI_TRANSFORMATION";
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
        /* JADX WARNING: Missing block: B:12:0x005e, code skipped:
            if (r4 <= 1.0f) goto L_0x006b;
     */
        /* JADX WARNING: Missing block: B:16:0x0068, code skipped:
            if (r4 <= 1.0f) goto L_0x006b;
     */
        public final defpackage.kaz<defpackage.jwj> a(defpackage.jwa r11, defpackage.kaz<defpackage.jwj> r12, int r13, int r14) {
            /*
            r10 = this;
            r12 = r12.a();
            r12 = (defpackage.jwj) r12;
            r1 = r12.a();
            r12 = r1.getWidth();
            r13 = r1.getHeight();
            r12 = java.lang.Math.min(r12, r13);
            r13 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
            r12 = java.lang.Math.min(r13, r12);
            r13 = 0;
            if (r1 != 0) goto L_0x0020;
        L_0x001f:
            return r13;
        L_0x0020:
            r14 = r1.getWidth();
            r0 = r1.getHeight();
            if (r14 >= r0) goto L_0x0030;
        L_0x002a:
            r14 = (float) r12;
            r0 = r1.getWidth();
            goto L_0x0035;
        L_0x0030:
            r14 = (float) r12;
            r0 = r1.getHeight();
        L_0x0035:
            r0 = (float) r0;
            r14 = r14 / r0;
            r0 = new android.graphics.Matrix;
            r0.<init>();
            r0.setScale(r14, r14);
            r14 = r1.getWidth();
            r14 = (float) r14;
            r2 = r1.getHeight();
            r2 = (float) r2;
            r3 = r14 / r2;
            r4 = (float) r12;
            r5 = r4 / r4;
            r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r7 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
            r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r3 <= 0) goto L_0x0061;
        L_0x0057:
            r4 = r4 / r2;
            r14 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
            if (r14 < 0) goto L_0x006d;
        L_0x005c:
            r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r14 <= 0) goto L_0x006b;
        L_0x0060:
            goto L_0x006d;
        L_0x0061:
            r4 = r4 / r14;
            r14 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
            if (r14 < 0) goto L_0x006d;
        L_0x0066:
            r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r14 <= 0) goto L_0x006b;
        L_0x006a:
            goto L_0x006d;
        L_0x006b:
            r6 = r13;
            goto L_0x0071;
        L_0x006d:
            r0.setScale(r4, r4);
            r6 = r0;
        L_0x0071:
            if (r6 == 0) goto L_0x0097;
        L_0x0073:
            r2 = 0;
            r3 = 0;
            r4 = r1.getWidth();
            r5 = r1.getHeight();
            r7 = 1;
            r8 = r1.getConfig();
            r13 = defpackage.acut.a;
            r9 = r13.toString();
            r0 = r11;
            r13 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9);
            r14 = r13.a();
            r14 = (defpackage.jwj) r14;
            r1 = r14.a();
        L_0x0097:
            r3 = r1;
            r14 = r3.getWidth();
            r14 = r14 - r12;
            r0 = 0;
            r14 = java.lang.Math.max(r0, r14);
            r1 = r3.getHeight();
            r1 = r1 - r12;
            r0 = java.lang.Math.max(r0, r1);
            r4 = r14 / 2;
            r5 = r0 / 2;
            r14 = defpackage.acut.a;
            r8 = r14.toString();
            r2 = r11;
            r6 = r12;
            r7 = r12;
            r11 = r2.a(r3, r4, r5, r6, r7, r8);
            if (r13 == 0) goto L_0x00c1;
        L_0x00be:
            r13.dispose();
        L_0x00c1:
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acut$c.a(jwa, kaz, int, int):kaz");
        }
    }

    public acut(adcl adcl, aczv aczv, actz actz, ajei ajei, jwe jwe, adbv adbv) {
        this.b = aczv;
        this.g = actz;
        this.e = adcl;
        this.h = jwe;
        this.i = ajei;
        this.d = new acuy(100, actz);
        this.f = adbv;
    }

    static /* synthetic */ void a(acut acut, adbt adbt, byte[] bArr) {
        try {
            bArr = adbt.a(bArr);
            if (bArr != null) {
                a a = new a().a(true);
                a.i = acut.i;
                if (adbt.c != 1) {
                    a.a(new c());
                }
                acut.i.a(acut.h.a().a(new jwf(adbt.b, new ByteArrayInputStream(bArr), true), a, a.b()).a(new -$$Lambda$acut$Rx1usBpAJAuZaAu3maCB9Fto3UM(acut, adbt), -$$Lambda$acut$tErc4BXF9H4OB39RpSymc32nNZI.INSTANCE));
            }
        } catch (GeneralSecurityException unused) {
        }
    }

    private static /* synthetic */ void a(Throwable th) {
    }

    public final void a(Set<String> set, ArrayList<String> arrayList) {
        arrayList.clear();
        this.c.a((List) arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (set.contains(it.next())) {
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.e.b((String) it2.next());
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.c.b((String) it2.next());
            }
        }
    }
}
