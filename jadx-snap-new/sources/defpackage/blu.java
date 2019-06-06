package defpackage;

/* renamed from: blu */
public final class blu {
    public static final blu a = new blu(0);
    public final int b;

    public blu(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.b == ((blu) obj).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
