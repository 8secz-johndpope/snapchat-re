package defpackage;

/* renamed from: sdd */
public final class sdd {
    final boolean a;
    final String b;
    final String c;
    final akbl<sdr, Boolean> d;

    public sdd() {
        this(false, null, 15);
    }

    private sdd(boolean z, String str) {
        this.a = z;
        this.b = null;
        this.c = str;
        this.d = null;
    }

    public /* synthetic */ sdd(boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        this(z, str);
    }
}
