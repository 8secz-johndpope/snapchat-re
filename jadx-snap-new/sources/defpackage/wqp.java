package defpackage;

/* renamed from: wqp */
public final class wqp {
    private final aipn<dib> a;

    /* renamed from: wqp$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[aima.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.aima.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.aima.LIGHT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.aima.MEDIUM;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.aima.HARD;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.aima.HARDER;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wqp$1.<clinit>():void");
        }
    }

    public wqp(aipn<dib> aipn) {
        this.a = aipn;
    }

    private static abab a(aima aima) {
        int i = 1.a[aima.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? abab.MEDIUM : abab.LIGHTER : abab.LIGHT : abab.MEDIUM : abab.HARD;
    }

    private static aazs b(String str, boolean z) {
        aazs aazs = new aazs();
        aazs.a = str;
        aazs.b = Boolean.TRUE;
        aazs.c = Boolean.valueOf(z);
        return aazs;
    }

    public final void a(aaos aaos) {
        aajt aaou = new aaou();
        aaou.a = aaos;
        ((dib) this.a.get()).a(aaou);
    }

    public final void a(abga abga) {
        aajt aaov = new aaov();
        aaov.a = abga;
        ((dib) this.a.get()).a(aaov);
    }

    public final void a(ailz ailz) {
        aazt aazt = ailz == ailz.PROBLEM ? aazt.PROBLEM : aazt.IMPROVEMENT;
        aajt aazu = new aazu();
        aazu.a = aazt;
        ((dib) this.a.get()).a(aazu);
    }

    public final void a(aima aima, aima aima2) {
        aajt abad = new abad();
        abad.b = wqp.a(aima2);
        abad.a = wqp.a(aima);
        ((dib) this.a.get()).a(abad);
    }

    public final void a(String str) {
        aajt aazz = new aazz();
        aazz.a(wqp.b(str, false));
        ((dib) this.a.get()).a(aazz);
    }

    public final void a(String str, aazr aazr) {
        aajt aazv = new aazv();
        aazv.a(wqp.b(str, false));
        aazv.a = aazr;
        ((dib) this.a.get()).a(aazv);
    }

    public final void a(String str, String str2) {
        aajt aazw = new aazw();
        aazw.a(wqp.b(str, false));
        aazw.a = str2;
        aazw.b = Boolean.FALSE;
        ((dib) this.a.get()).a(aazw);
    }

    public final void a(String str, String str2, String str3, boolean z) {
        aajt aaot = new aaot();
        aaot.a = str;
        aaot.b = str2;
        aaot.c = str3;
        aaot.d = Boolean.valueOf(z);
        aaot.e = Boolean.TRUE;
        ((dib) this.a.get()).a(aaot);
    }

    public final void a(String str, boolean z) {
        aajt aazy = new aazy();
        aazy.a(wqp.b(str, z));
        aazy.a = Long.valueOf(0);
        ((dib) this.a.get()).a(aazy);
    }

    public final void a(String str, boolean z, String str2) {
        aajt abaa = new abaa();
        abaa.a(wqp.b(str, z));
        Long valueOf = Long.valueOf(0);
        abaa.b = valueOf;
        abaa.c = str2;
        abaa.a = valueOf;
        ((dib) this.a.get()).a(abaa);
    }

    public final void a(String str, boolean z, String str2, abac abac) {
        aajt aazx = new aazx();
        aazx.a(wqp.b(str, z));
        aazx.a = str2;
        aazx.b = abac;
        ((dib) this.a.get()).a(aazx);
    }

    public final void a(boolean z) {
        aajt abae = new abae();
        abae.a = Boolean.valueOf(z);
        abae.b = Boolean.TRUE;
        ((dib) this.a.get()).a(abae);
    }

    public final void b(String str, String str2) {
        aajt aaor = new aaor();
        aaor.a = str;
        aaor.b = str2;
        aaor.c = Boolean.TRUE;
        ((dib) this.a.get()).a(aaor);
    }
}
