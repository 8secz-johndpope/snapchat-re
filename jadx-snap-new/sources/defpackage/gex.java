package defpackage;

/* renamed from: gex */
public final class gex extends Throwable {
    public gex() {
        this(null, null, 3);
    }

    public gex(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ gex(String str, Throwable th, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        this(str, th);
    }
}
