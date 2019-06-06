package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.bn.a;

/* renamed from: bu */
public final class bu extends bw {
    bn a;
    bu b;
    bu c;
    public float d;
    int e = 0;
    private float g;
    private float h;
    private bu i;
    private float j;
    private bv k = null;
    private int l = 1;
    private bv m = null;
    private int n = 1;

    public bu(bn bnVar) {
        this.a = bnVar;
    }

    private static String a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public final void a() {
        if (this.f != 1 && this.e != 4) {
            bu buVar;
            float f;
            bu buVar2;
            bu buVar3;
            bv bvVar = this.k;
            if (bvVar != null) {
                if (bvVar.f == 1) {
                    this.h = ((float) this.l) * this.k.a;
                } else {
                    return;
                }
            }
            bvVar = this.m;
            if (bvVar != null) {
                if (bvVar.f == 1) {
                    this.j = ((float) this.n) * this.m.a;
                } else {
                    return;
                }
            }
            if (this.e == 1) {
                buVar = this.b;
                if (buVar == null || buVar.f == 1) {
                    buVar = this.b;
                    if (buVar == null) {
                        this.c = this;
                        f = this.h;
                    } else {
                        this.c = buVar.c;
                        f = buVar.d + this.h;
                    }
                    this.d = f;
                    d();
                    return;
                }
            }
            if (this.e == 2) {
                buVar = this.b;
                if (buVar != null && buVar.f == 1) {
                    buVar = this.i;
                    if (buVar != null) {
                        buVar = buVar.b;
                        if (buVar != null && buVar.f == 1) {
                            float f2;
                            buVar = this.b;
                            this.c = buVar.c;
                            buVar2 = this.i;
                            buVar3 = buVar2.b;
                            buVar2.c = buVar3.c;
                            f = this.j > MapboxConstants.MINIMUM_ZOOM ? buVar.d - buVar3.d : buVar3.d - buVar.d;
                            if (this.a.c == a.LEFT || this.a.c == a.RIGHT) {
                                f -= (float) this.a.b.l();
                                f2 = this.a.b.L;
                            } else {
                                f -= (float) this.a.b.m();
                                f2 = this.a.b.M;
                            }
                            int b = this.a.b();
                            int b2 = this.i.a.b();
                            if (this.a.d == this.i.a.d) {
                                f2 = 0.5f;
                                b = 0;
                                b2 = 0;
                            }
                            float f3 = (float) b;
                            float f4 = (float) b2;
                            f = (f - f3) - f4;
                            if (this.j > MapboxConstants.MINIMUM_ZOOM) {
                                bu buVar4 = this.i;
                                buVar4.d = (buVar4.b.d + f4) + (f * f2);
                                this.d = (this.b.d - f3) - (f * (1.0f - f2));
                            } else {
                                this.d = (this.b.d + f3) + (f * f2);
                                buVar3 = this.i;
                                buVar3.d = (buVar3.b.d - f4) - (f * (1.0f - f2));
                            }
                            d();
                            this.i.d();
                            return;
                        }
                    }
                }
            }
            if (this.e == 3) {
                buVar = this.b;
                if (buVar != null && buVar.f == 1) {
                    buVar = this.i;
                    if (buVar != null) {
                        buVar = buVar.b;
                        if (buVar != null && buVar.f == 1) {
                            buVar = this.b;
                            this.c = buVar.c;
                            buVar2 = this.i;
                            buVar3 = buVar2.b;
                            buVar2.c = buVar3.c;
                            this.d = buVar.d + this.h;
                            buVar2.d = buVar3.d + buVar2.h;
                            d();
                            this.i.d();
                            return;
                        }
                    }
                }
            }
            if (this.e == 5) {
                this.a.b.c();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bi biVar) {
        bk bkVar = this.a.h;
        bu buVar = this.c;
        if (buVar == null) {
            biVar.a(bkVar, (int) this.d);
        } else {
            biVar.c(bkVar, biVar.a(buVar.a), (int) this.d, 6);
        }
    }

    public final void a(bu buVar, float f) {
        if (this.f == 0 || !(this.c == buVar || this.d == f)) {
            this.c = buVar;
            this.d = f;
            if (this.f == 1) {
                c();
            }
            d();
        }
    }

    public final void a(bu buVar, int i) {
        this.e = 1;
        this.b = buVar;
        this.h = (float) i;
        this.b.a(this);
    }

    public final void a(bu buVar, int i, bv bvVar) {
        this.b = buVar;
        this.b.a(this);
        this.k = bvVar;
        this.l = i;
        this.k.a(this);
    }

    public final void b() {
        super.b();
        this.b = null;
        this.h = MapboxConstants.MINIMUM_ZOOM;
        this.k = null;
        this.l = 1;
        this.m = null;
        this.n = 1;
        this.c = null;
        this.d = MapboxConstants.MINIMUM_ZOOM;
        this.g = MapboxConstants.MINIMUM_ZOOM;
        this.i = null;
        this.j = MapboxConstants.MINIMUM_ZOOM;
        this.e = 0;
    }

    public final void b(bu buVar, float f) {
        this.i = buVar;
        this.j = f;
    }

    public final void b(bu buVar, int i) {
        this.b = buVar;
        this.h = (float) i;
        this.b.a(this);
    }

    public final void b(bu buVar, int i, bv bvVar) {
        this.i = buVar;
        this.m = bvVar;
        this.n = i;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder;
        if (this.f == 1) {
            str = ", RESOLVED: ";
            String str2 = "[";
            if (this.c == this) {
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(this.a);
                stringBuilder.append(str);
                stringBuilder.append(this.d);
                str = "]  type: ";
            } else {
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(this.a);
                stringBuilder.append(str);
                stringBuilder.append(this.c);
                stringBuilder.append(":");
                stringBuilder.append(this.d);
                str = "] type: ";
            }
        } else {
            stringBuilder = new StringBuilder("{ ");
            stringBuilder.append(this.a);
            str = " UNRESOLVED} type: ";
        }
        stringBuilder.append(str);
        stringBuilder.append(bu.a(this.e));
        return stringBuilder.toString();
    }
}
