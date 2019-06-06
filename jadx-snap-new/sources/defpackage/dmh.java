package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: dmh */
public final class dmh implements dlx {
    private final ilv a;

    public dmh(ilv ilv) {
        this.a = ilv;
    }

    private static String a(String str) {
        return str.length() <= 63 ? str : str.substring(0, 63);
    }

    private static ilz b(inp inp, String... strArr) {
        int i = 2;
        boolean z = strArr != null && strArr.length >= 2;
        Preconditions.checkArgument(z);
        Preconditions.checkArgument(strArr.length % 2 == 0);
        Preconditions.checkArgument(strArr.length <= 6);
        ilz a = inp.a(strArr[0], dmh.a(strArr[1]));
        while (i < strArr.length) {
            a = a.a(strArr[i], dmh.a(strArr[i + 1]));
            i += 2;
        }
        return a;
    }

    public final void a(inp inp, long j, String... strArr) {
        if (strArr.length > 0) {
            this.a.a(dmh.b(inp, strArr), j);
        } else {
            this.a.a((ily) inp, j);
        }
    }

    public final void a(inp inp, String... strArr) {
        if (strArr.length > 0) {
            this.a.c(dmh.b(inp, strArr), 1);
        } else {
            this.a.c((ily) inp, 1);
        }
    }
}
