package defpackage;

import android.graphics.Bitmap.Config;

/* renamed from: avt */
public final class avt {
    public static final avt a = new avt(new avu());
    private int b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private Config g;
    private avv h;

    private avt(avu avu) {
        this.b = avu.a;
        this.g = avu.b;
        this.h = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.g == ((avt) obj).g;
    }

    public final int hashCode() {
        return ((((((this.b * 31) * 31) * 31) * 31) * 31) + this.g.ordinal()) * 31;
    }

    public final String toString() {
        return String.format(null, "%d-%b-%b-%b-%b-%s-%s", new Object[]{Integer.valueOf(this.b), Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, this.g.name(), null});
    }
}
