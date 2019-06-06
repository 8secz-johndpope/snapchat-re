package defpackage;

/* renamed from: abtg */
public final class abtg {

    /* renamed from: abtg$1 */
    public static /* synthetic */ class 1 {
        public static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.abtg.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.abtg.a.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.abtg.a.CENTER_CROP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.abtg.a.FILL_WIDTH;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abtg$1.<clinit>():void");
        }
    }

    /* renamed from: abtg$a */
    public enum a {
        FIT_CENTER,
        FILL_WIDTH,
        CENTER_CROP,
        NONE
    }

    public static abtl a(abtl abtl, abtl abtl2, a aVar) {
        abtl abtl3;
        int b;
        double d;
        double f;
        int i;
        int i2;
        if (aVar == a.FILL_WIDTH) {
            abtl3 = new abtl(0, 0);
            b = abtl2.b();
            d = (double) b;
            f = abtl.f();
            Double.isNaN(d);
            i = (int) (d / f);
            abtl3.a(b);
            abtl3.b(i);
            return abtl3;
        } else if (aVar == a.FIT_CENTER) {
            abtl3 = new abtl(0, 0);
            if (abtl2.c(abtl)) {
                b = abtl2.c();
                d = (double) b;
                f = abtl.f();
                Double.isNaN(d);
                i = (int) (d * f);
            } else {
                b = abtl2.b();
                d = (double) b;
                f = abtl.f();
                Double.isNaN(d);
                i2 = b;
                b = (int) (d / f);
                i = i2;
            }
            abtl3.a(i);
            abtl3.b(b);
            return abtl3;
        } else if (aVar != a.CENTER_CROP) {
            return aVar == a.NONE ? abtl : null;
        } else {
            abtl3 = new abtl(0, 0);
            if (abtl2.c(abtl)) {
                b = abtl2.b();
                d = (double) b;
                f = abtl.f();
                Double.isNaN(d);
                i2 = b;
                b = (int) (d / f);
                i = i2;
            } else {
                b = abtl2.c();
                d = (double) b;
                f = abtl.f();
                Double.isNaN(d);
                i = (int) (d * f);
            }
            abtl3.a(i);
            abtl3.b(b);
            return abtl3;
        }
    }
}
