package defpackage;

/* renamed from: tob */
public final class tob {
    public final String a;
    public final String b;
    public final boolean c;
    public String d;
    public Long e;

    public tob() {
        this(null, null, false, 31);
    }

    private tob(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = null;
        this.e = null;
    }

    public /* synthetic */ tob(String str, String str2, boolean z, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        this(str, str2, z);
    }
}
