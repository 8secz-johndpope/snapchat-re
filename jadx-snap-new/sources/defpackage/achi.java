package defpackage;

import com.snap.core.db.record.FeedModel;

/* renamed from: achi */
public final class achi<T extends achg, C extends achd<T, C>> {
    public final aciv<T, C> a;
    public final achr b;
    public final acis c;
    public final acgw d;
    public final aciv<T, C> e;
    public final aciv<T, C> f;
    public final achj g;
    public final boolean h;
    public final float i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final acih m;
    private final aciv<T, C> n;

    public achi(acgu<T> acgu, aciv<T, C> aciv, aciv<T, C> aciv2, achj achj, boolean z, float f, boolean z2, boolean z3, boolean z4, acih acih) {
        acgu<T> acgu2 = acgu;
        akcr.b(acgu, "navigationAction");
        akcr.b(aciv, FeedModel.SOURCEPAGE);
        akcr.b(aciv2, "destinationPage");
        akcr.b(achj, "navigationGestureState");
        Object a = acgu.a();
        if (a == null) {
            akcr.a();
        }
        akcr.a(a, "navigationAction.inputGesture!!");
        Object b = acgu.b();
        akcr.a(b, "navigationAction.outputTransition");
        Object c = acgu.c();
        akcr.a(c, "navigationAction.navigationType");
        this(a, b, c, aciv, aciv2, achj, z, f, z2, z3, z4, acih);
    }

    public achi(achr achr, acis acis, acgw acgw, aciv<T, C> aciv, aciv<T, C> aciv2, achj achj, boolean z, float f, boolean z2, boolean z3, boolean z4, acih acih) {
        akcr.b(achr, "inputGesture");
        akcr.b(acis, "outputTransition");
        akcr.b(acgw, "navigationType");
        akcr.b(aciv, FeedModel.SOURCEPAGE);
        akcr.b(aciv2, "destinationPage");
        akcr.b(achj, "navigationGestureState");
        this.b = achr;
        this.c = acis;
        this.d = acgw;
        this.e = aciv;
        this.f = aciv2;
        this.g = achj;
        this.h = z;
        this.i = f;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = acih;
        this.a = this.d == acgw.PRESENT ? this.f : this.e;
        this.n = this.d == acgw.PRESENT ? this.e : this.f;
    }

    public final boolean a() {
        return this.i == 1.0f;
    }

    public final boolean a(T t) {
        akcr.b(t, "pageType");
        return akcr.a(this.e.e(), (Object) t) || akcr.a(this.f.e(), (Object) t);
    }

    public final boolean b() {
        return this.d == acgw.PRESENT;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof achi) {
                achi achi = (achi) obj;
                if (akcr.a(this.b, achi.b) && akcr.a(this.c, achi.c) && akcr.a(this.d, achi.d) && akcr.a(this.e, achi.e) && akcr.a(this.f, achi.f) && akcr.a(this.g, achi.g)) {
                    if ((this.h == achi.h ? 1 : null) != null && Float.compare(this.i, achi.i) == 0) {
                        if ((this.j == achi.j ? 1 : null) != null) {
                            if ((this.k == achi.k ? 1 : null) != null) {
                                if ((this.l == achi.l ? 1 : null) == null || !akcr.a(this.m, achi.m)) {
                                    return false;
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
        achr achr = this.b;
        int i = 0;
        int hashCode = (achr != null ? achr.hashCode() : 0) * 31;
        acis acis = this.c;
        hashCode = (hashCode + (acis != null ? acis.hashCode() : 0)) * 31;
        acgw acgw = this.d;
        hashCode = (hashCode + (acgw != null ? acgw.hashCode() : 0)) * 31;
        aciv aciv = this.e;
        hashCode = (hashCode + (aciv != null ? aciv.hashCode() : 0)) * 31;
        aciv = this.f;
        hashCode = (hashCode + (aciv != null ? aciv.hashCode() : 0)) * 31;
        achj achj = this.g;
        hashCode = (hashCode + (achj != null ? achj.hashCode() : 0)) * 31;
        int i2 = this.h;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (((hashCode + i2) * 31) + Float.floatToIntBits(this.i)) * 31;
        i2 = this.j;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.k;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.l;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        acih acih = this.m;
        if (acih != null) {
            i = acih.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NavigationEvent(inputGesture=");
        stringBuilder.append(this.b);
        stringBuilder.append(", outputTransition=");
        stringBuilder.append(this.c);
        stringBuilder.append(", navigationType=");
        stringBuilder.append(this.d);
        stringBuilder.append(", sourcePage=");
        stringBuilder.append(this.e);
        stringBuilder.append(", destinationPage=");
        stringBuilder.append(this.f);
        stringBuilder.append(", navigationGestureState=");
        stringBuilder.append(this.g);
        stringBuilder.append(", isProgrammatic=");
        stringBuilder.append(this.h);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.i);
        stringBuilder.append(", isLastInNavigable=");
        stringBuilder.append(this.j);
        stringBuilder.append(", isFirstInNavigable=");
        stringBuilder.append(this.k);
        stringBuilder.append(", isFirstCall=");
        stringBuilder.append(this.l);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.m);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
