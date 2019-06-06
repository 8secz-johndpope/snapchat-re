package defpackage;

/* renamed from: akqu */
final class akqu {
    final Object a;
    final akqs b;
    volatile boolean c = true;

    akqu(Object obj, akqs akqs) {
        this.a = obj;
        this.b = akqs;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akqu) {
            akqu akqu = (akqu) obj;
            if (this.a == akqu.a && this.b.equals(akqu.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.f.hashCode();
    }
}
