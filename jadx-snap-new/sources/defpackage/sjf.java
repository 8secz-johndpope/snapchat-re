package defpackage;

/* renamed from: sjf */
public final class sjf {
    static final ajxe p = ajxh.a(b.a);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* renamed from: sjf$b */
    static final class b extends akcs implements akbk<sjf> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new sjf(false, false, false, 8000, 8000, 5, false, false, 4, 4, false, false, false, false, false);
        }
    }

    /* renamed from: sjf$a */
    public static final class a {
        static {
            new aken[1][0] = new akdc(akde.a(a.class), "DEFAULT", "getDEFAULT()Lcom/snap/opera/config/OperaExperimentsConfig;");
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static sjf a() {
            return (sjf) sjf.p.b();
        }
    }

    static {
        a aVar = new a();
    }

    public sjf(boolean z, boolean z2, boolean z3, long j, long j2, long j3, boolean z4, boolean z5, int i, int i2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z4;
        this.h = z5;
        this.i = i;
        this.j = i2;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
        this.o = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sjf) {
                sjf sjf = (sjf) obj;
                if ((this.a == sjf.a ? 1 : null) != null) {
                    if ((this.b == sjf.b ? 1 : null) != null) {
                        if ((this.c == sjf.c ? 1 : null) != null) {
                            if ((this.d == sjf.d ? 1 : null) != null) {
                                if ((this.e == sjf.e ? 1 : null) != null) {
                                    if ((this.f == sjf.f ? 1 : null) != null) {
                                        if ((this.g == sjf.g ? 1 : null) != null) {
                                            if ((this.h == sjf.h ? 1 : null) != null) {
                                                if ((this.i == sjf.i ? 1 : null) != null) {
                                                    if ((this.j == sjf.j ? 1 : null) != null) {
                                                        if ((this.k == sjf.k ? 1 : null) != null) {
                                                            if ((this.l == sjf.l ? 1 : null) != null) {
                                                                if ((this.m == sjf.m ? 1 : null) != null) {
                                                                    if ((this.n == sjf.n ? 1 : null) != null) {
                                                                        if ((this.o == sjf.o ? 1 : null) != null) {
                                                                            return true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.c;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        long j = this.d;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.e;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        i3 = this.g;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.h;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (((((i + i3) * 31) + this.i) * 31) + this.j) * 31;
        i3 = this.k;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.l;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.m;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.n;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.o;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("OperaExperimentsConfig(useResponsiveLayoutImageSnaps=");
        stringBuilder.append(this.a);
        stringBuilder.append(", useResponsiveLayoutVideoSnaps=");
        stringBuilder.append(this.b);
        stringBuilder.append(", enableCustomHttpSettingsExoplayer=");
        stringBuilder.append(this.c);
        stringBuilder.append(", exoplayerDefaultConnectionTimeoutMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", exoplayerRequestTimeoutMs=");
        stringBuilder.append(this.e);
        stringBuilder.append(", exoplayerMaximumRequestRetries=");
        stringBuilder.append(this.f);
        stringBuilder.append(", logHighResolutionImages=");
        stringBuilder.append(this.g);
        stringBuilder.append(", enableImageResolutionLimit=");
        stringBuilder.append(this.h);
        stringBuilder.append(", prefetchOnCell=");
        stringBuilder.append(this.i);
        stringBuilder.append(", prefetchOnWifi=");
        stringBuilder.append(this.j);
        stringBuilder.append(", singlePageResolution=");
        stringBuilder.append(this.k);
        stringBuilder.append(", asyncExoplayerRelease=");
        stringBuilder.append(this.l);
        stringBuilder.append(", operaLowEndDeviceAnimations=");
        stringBuilder.append(this.m);
        stringBuilder.append(", useWindowConfiguration=");
        stringBuilder.append(this.n);
        stringBuilder.append(", useExoplayerForLongform=");
        stringBuilder.append(this.o);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
