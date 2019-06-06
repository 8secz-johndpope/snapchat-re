package defpackage;

import com.google.common.base.Supplier;

/* renamed from: ibm */
public final class ibm implements hza {
    private final ibv a;
    private final Supplier<byte[]> b;
    private final Supplier<byte[]> c;

    ibm(ibv ibv, Supplier<byte[]> supplier, Supplier<byte[]> supplier2) {
        this.a = ibv;
        this.b = supplier;
        this.c = supplier2;
    }

    public final String a(String str, icg icg, String str2, boolean z, icf icf, String str3, String str4) {
        return this.a.a(str, icg, str2, z, icf, this.b, this.c, str3, str4);
    }
}
