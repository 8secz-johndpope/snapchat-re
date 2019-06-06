package defpackage;

import com.google.common.base.MoreObjects;

/* renamed from: acas */
public final class acas {
    public final double a;
    public final double b;

    public acas(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final Double a() {
        return Double.valueOf(this.a);
    }

    public final Double b() {
        return Double.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acas acas = (acas) obj;
        return new akmc().a(this.a, acas.a).a(this.b, acas.b).a;
    }

    public final int hashCode() {
        return new akmd().a(this.a).a(this.b).a;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("x", this.a).add("y", this.b).toString();
    }
}
