package defpackage;

import android.media.AudioAttributes;

/* renamed from: bmd */
public final class bmd {
    public static final bmd a = new a().a();
    public final int b;
    public final int c;
    public final int d;
    AudioAttributes e;

    /* renamed from: bmd$a */
    public static final class a {
        public int a = 0;
        public int b = 1;
        private int c = 0;

        public final bmd a() {
            return new bmd(this.a, this.b);
        }
    }

    /* synthetic */ bmd(int i, int i2) {
        this(i, 0, i2);
    }

    private bmd(int i, int i2, int i3) {
        this.b = i;
        this.c = 0;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bmd bmd = (bmd) obj;
            return this.b == bmd.b && this.c == bmd.c && this.d == bmd.d;
        }
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }
}
