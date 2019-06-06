package defpackage;

/* renamed from: acvq */
public final class acvq {
    static final acvr[] a = new acvr[0];
    private final adcf<acvr>[] b;

    /* renamed from: acvq$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[acwg.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Failed to process nested try/catch */
        static {
            /*
            r0 = defpackage.acwg.a();
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acvq$1.<clinit>():void");
        }
    }

    /* renamed from: acvq$a */
    static class a extends adcf<acvr> {
        public a(int i) {
            super(acvq.a, i);
        }
    }

    public acvq() {
        int[] a = acwg.a();
        this.b = new a[a.length];
        for (int i : a) {
            int i2 = i2 - 1;
            int i3 = 1.a[i2];
            if (i3 == 1) {
                this.b[i2] = new a(5000);
            } else if (i3 == 2) {
                this.b[i2] = new a(100);
            } else {
                throw new UnsupportedOperationException("If you add a new marker type, you are required to add it here as well");
            }
        }
    }

    public final adcf<acvr> a(int i) {
        return this.b[i - 1];
    }
}
