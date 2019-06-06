package defpackage;

import com.google.common.base.Supplier;
import java.util.List;

/* renamed from: ibn */
public final class ibn implements hzc {
    private final ibx a;
    private final Supplier<byte[]> b;
    private final Supplier<byte[]> c;

    ibn(ibx ibx, Supplier<byte[]> supplier, Supplier<byte[]> supplier2) {
        this.a = ibx;
        this.b = supplier;
        this.c = supplier2;
    }

    public final ich a(String str, String str2, ahql ahql, String str3, icf icf, boolean z, hyr hyr) {
        return this.a.a(str, str2, ahql, str3, icf, z, hyr, this.b, this.c);
    }

    public final ich a(List<String> list, String str, String str2, icf icf) {
        return this.a.a(list, str, str2, icf, this.b, this.c);
    }
}
