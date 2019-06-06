package defpackage;

/* renamed from: aiqy */
public final class aiqy {
    public final String a;
    public final boolean b;

    aiqy(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aiqy aiqy = (aiqy) obj;
        if (this.b != aiqy.b) {
            return false;
        }
        String str = this.a;
        return str == null ? aiqy.a == null : str.equals(aiqy.a);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }
}
