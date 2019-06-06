package defpackage;

/* renamed from: gpg */
public final class gpg {
    public final boolean a;
    public final zfn b;

    public gpg(boolean z, zfn zfn) {
        akcr.b(zfn, "cpuMetric");
        this.a = z;
        this.b = zfn;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gpg) {
                gpg gpg = (gpg) obj;
                if ((this.a == gpg.a ? 1 : null) == null || !akcr.a(this.b, gpg.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        zfn zfn = this.b;
        return i + (zfn != null ? zfn.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CpuEvent(isForeground=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cpuMetric=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
