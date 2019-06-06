package defpackage;

import defpackage.ebp.d;
import defpackage.ebp.f;
import defpackage.tpl.b;
import defpackage.tpl.b.a;
import defpackage.tpl.b.e;

/* renamed from: tpn */
public final class tpn {
    public static final boolean a(tpl tpl) {
        akcr.b(tpl, "receiver$0");
        ebp ebp = tpl.a;
        return ebp instanceof d ? true : ebp instanceof f ? ((f) tpl.a).a : false;
    }

    public static final boolean b(tpl tpl) {
        akcr.b(tpl, "receiver$0");
        return tpl.b instanceof e;
    }

    public static final boolean c(tpl tpl) {
        akcr.b(tpl, "receiver$0");
        return (tpl.b instanceof b.d) || (tpl.b instanceof a);
    }
}
