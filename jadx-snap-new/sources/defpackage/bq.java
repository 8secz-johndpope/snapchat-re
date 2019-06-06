package defpackage;

import defpackage.bn.a;
import java.util.ArrayList;

/* renamed from: bq */
public final class bq extends bo {
    public int V = -1;
    private bn W = this.t;
    private int X;
    private boolean Y;
    private int Z;
    public float a = -1.0f;
    private bt aa;
    private int ab;
    public int b = -1;

    public bq() {
        int i = 0;
        this.X = 0;
        this.Y = false;
        this.Z = 0;
        this.aa = new bt();
        this.ab = 8;
        this.y.clear();
        this.y.add(this.W);
        int length = this.x.length;
        while (i < length) {
            this.x[i] = this.W;
            i++;
        }
    }

    public final void A() {
        if (this.A != null) {
            int b = bi.b(this.W);
            if (this.X == 1) {
                b(b);
                c(0);
                e(this.A.m());
                d(0);
                return;
            }
            b(0);
            c(b);
            d(this.A.l());
            e(0);
        }
    }

    public final bn a(a aVar) {
        switch (aVar) {
            case LEFT:
            case RIGHT:
                if (this.X == 1) {
                    return this.W;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.X == 0) {
                    return this.W;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(aVar.name());
    }

    public final void a(int i) {
        bo boVar = this.A;
        if (boVar != null) {
            int i2;
            if (this.X == 1) {
                this.t.a.a(boVar.t.a, 0);
                this.v.a.a(boVar.t.a, 0);
                if (this.b != -1) {
                    this.s.a.a(boVar.s.a, this.b);
                    this.u.a.a(boVar.s.a, this.b);
                    return;
                } else if (this.V != -1) {
                    this.s.a.a(boVar.u.a, -this.V);
                    this.u.a.a(boVar.u.a, -this.V);
                    return;
                } else if (this.a != -1.0f && boVar.y() == 1) {
                    i2 = (int) (((float) boVar.B) * this.a);
                    this.s.a.a(boVar.s.a, i2);
                    this.u.a.a(boVar.s.a, i2);
                    return;
                }
            }
            this.s.a.a(boVar.s.a, 0);
            this.u.a.a(boVar.s.a, 0);
            if (this.b != -1) {
                this.t.a.a(boVar.t.a, this.b);
                this.v.a.a(boVar.t.a, this.b);
            } else if (this.V != -1) {
                this.t.a.a(boVar.v.a, -this.V);
                this.v.a.a(boVar.v.a, -this.V);
            } else if (this.a != -1.0f && boVar.z() == 1) {
                i2 = (int) (((float) boVar.C) * this.a);
                this.t.a.a(boVar.t.a, i2);
                this.v.a.a(boVar.t.a, i2);
            }
        }
    }

    public final void a(bi biVar) {
        bp bpVar = (bp) this.A;
        if (bpVar != null) {
            Object a = bpVar.a(a.LEFT);
            Object a2 = bpVar.a(a.RIGHT);
            Object obj = (this.A == null || this.A.z[0] != 2) ? null : 1;
            if (this.X == 0) {
                a = bpVar.a(a.TOP);
                a2 = bpVar.a(a.BOTTOM);
                obj = (this.A == null || this.A.z[1] != 2) ? null : 1;
            }
            bk a3;
            bk a4;
            if (this.b != -1) {
                a3 = biVar.a(this.W);
                biVar.c(a3, biVar.a(a), this.b, 6);
                if (obj != null) {
                    biVar.a(biVar.a(a2), a3, 0, 5);
                }
            } else if (this.V != -1) {
                a3 = biVar.a(this.W);
                a4 = biVar.a(a2);
                biVar.c(a3, a4, -this.V, 6);
                if (obj != null) {
                    biVar.a(a3, biVar.a(a), 0, 5);
                    biVar.a(a4, a3, 0, 5);
                }
            } else {
                if (this.a != -1.0f) {
                    a3 = biVar.a(this.W);
                    bk a5 = biVar.a(a);
                    a4 = biVar.a(a2);
                    float f = this.a;
                    bf b = biVar.b();
                    b.d.a(a3, -1.0f);
                    b.d.a(a5, 1.0f - f);
                    b.d.a(a4, f);
                    biVar.a(b);
                }
            }
        }
    }

    public final boolean a() {
        return true;
    }

    public final void j(int i) {
        if (this.X != i) {
            this.X = i;
            this.y.clear();
            this.W = this.X == 1 ? this.s : this.t;
            this.y.add(this.W);
            i = this.x.length;
            for (int i2 = 0; i2 < i; i2++) {
                this.x[i2] = this.W;
            }
        }
    }

    public final ArrayList<bn> u() {
        return this.y;
    }
}
