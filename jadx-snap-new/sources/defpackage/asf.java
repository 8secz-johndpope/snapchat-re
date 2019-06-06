package defpackage;

import defpackage.ati.a;

/* renamed from: asf */
final class asf implements asq {
    private final ass a;
    private final atc b;

    /* renamed from: asf$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Failed to process nested try/catch */
        static {
            /*
            r0 = defpackage.ati.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 2;
            r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.asf$1.<clinit>():void");
        }
    }

    public asf(ass ass, atc atc) {
        this.a = ass;
        this.b = atc;
    }

    public final boolean a(asp asp) {
        int i = 1.a[asp.b.g() - 1];
        if (i == 1) {
            this.a.a(asp);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.b.a(asp);
            return true;
        }
    }
}
