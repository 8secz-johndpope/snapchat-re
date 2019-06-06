package defpackage;

import java.util.Locale;

/* renamed from: ecb */
public final class ecb {
    public final int a;
    public final int b;

    public ecb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "fps range [%d, %d]", new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
