package defpackage;

import android.view.ViewStub;

/* renamed from: tqz */
public final class tqz implements aiqc<tpw> {
    private final ajwy<ViewStub> a;
    private final ajwy<tpl> b;
    private final ajwy<Boolean> c;

    public static tpw a(ViewStub viewStub, tpl tpl, boolean z) {
        return (tpw) aiqf.a(tqy.a(viewStub, tpl, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return tqz.a((ViewStub) this.a.get(), (tpl) this.b.get(), ((Boolean) this.c.get()).booleanValue());
    }
}
