package defpackage;

import com.google.common.base.Enums;
import java.util.List;

/* renamed from: dzq */
final class dzq {
    private final dpf a;

    /* renamed from: dzq$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[eca.values().length];
        static final /* synthetic */ int[] b = new int[ecf.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Missing block: B:15:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.ecf.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.ecf.JPEG;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.ecf.GPU;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = defpackage.eca.values();
            r2 = r2.length;
            r2 = new int[r2];
            a = r2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = defpackage.eca.CAMERA1;	 Catch:{ NoSuchFieldError -> 0x0032 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0032 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0032 }
        L_0x0032:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = defpackage.eca.CAMERA2;	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dzq$1.<clinit>():void");
        }
    }

    public dzq() {
        this(dpg.a());
    }

    private dzq(dpf dpf) {
        this.a = dpf;
    }

    private ecf a() {
        return (ecf) Enums.getIfPresent(ecf.class, this.a.L()).or(ecf.JPEG);
    }

    static List<abtl> a(dpp dpp, ecf ecf) {
        int i = 1.b[ecf.ordinal()];
        if (i == 1) {
            return dpp.e();
        }
        if (i == 2) {
            return dpp.f();
        }
        throw new IllegalArgumentException("unsupported pic mode : ".concat(String.valueOf(ecf)));
    }

    /* Access modifiers changed, original: final */
    public final int a(boolean z, eca eca, ecf ecf) {
        int i = 1.a[eca.ordinal()];
        boolean z2 = true;
        if (i == 1) {
            return this.a.h(z);
        }
        if (i == 2) {
            dpf dpf = this.a;
            if (ecf != ecf.GPU) {
                z2 = false;
            }
            return dpf.i(z2);
        }
        throw new IllegalArgumentException("unsupported camera api : ".concat(String.valueOf(eca)));
    }

    /* Access modifiers changed, original: final */
    public final abtl a(boolean z) {
        return this.a.l(z);
    }

    /* Access modifiers changed, original: final */
    public final ecf a(eca eca) {
        int i = 1.a[eca.ordinal()];
        if (i == 1) {
            return ecf.JPEG;
        }
        if (i == 2) {
            return a();
        }
        throw new IllegalArgumentException("unsupported camera api : ".concat(String.valueOf(eca)));
    }
}
