package defpackage;

import java.util.Locale;

/* renamed from: god */
public final class god implements gno {
    private final gns a;

    public god(gns gns) {
        this.a = gns;
    }

    private static String a(String str, String str2) {
        return String.format(Locale.US, "%s:%s", new Object[]{str, str2});
    }

    public final void a(String str, String str2, String str3) {
        aabk aabk = new aabk();
        aabk.b = str3;
        aabk.a = god.a(str, str2);
        this.a.a(aabk);
    }

    public final void a(String str, String str2, String str3, long j, int i) {
        aabi aabi = new aabi();
        aabi.d = str3;
        aabi.a = god.a(str, str2);
        aabi.b = Long.valueOf(j);
        aabi.c = String.format(Locale.US, "complete:%d", new Object[]{Integer.valueOf(i)});
        this.a.a(aabi);
    }

    public final void a(String str, String str2, String str3, long j, gnf gnf) {
        aabj aabj = new aabj();
        aabj.e = str3;
        aabj.d = god.a(str, str2);
        aabj.c = Long.valueOf(j);
        aabj.b = gnf.a == gdj.BACKGROUND ? aabc.IN_BACKGROUND : aabc.ACTIVE_FOREGROUND;
        aabj.a = gnf.b;
        this.a.a(aabj);
    }

    public final void a(String str, String str2, String str3, String str4, long j) {
        aabi aabi = new aabi();
        aabi.d = str3;
        aabi.a = god.a(str, str2);
        aabi.b = Long.valueOf(j);
        aabi.c = str4;
        this.a.a(aabi);
    }
}
