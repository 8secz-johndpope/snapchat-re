package defpackage;

import defpackage.lxc.b;

/* renamed from: lwu */
public final class lwu implements ajdu<b, b> {
    private final ajdp<Boolean> a;
    private final ajdp<lqf> b;
    private final zfw c;

    /* renamed from: lwu$a */
    public static final class a<T1, T2, R> implements ajex<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            Object obj = (Boolean) t2;
            b bVar = (b) t1;
            akcr.a(obj, "shouldHide");
            return obj.booleanValue() ? defpackage.lxc.b.a.a : bVar;
        }
    }

    public lwu(ajdp<Boolean> ajdp, ajdp<lqf> ajdp2, zfw zfw) {
        akcr.b(ajdp, "hideWhen");
        akcr.b(ajdp2, "cameraLifecycle");
        akcr.b(zfw, "qualifiedSchedulers");
        this.a = ajdp;
        this.b = ajdp2;
        this.c = zfw;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object h = ajdp.b((ajdt) this.a, (ajdt) lqg.a(this.b, this.c)).h(Boolean.TRUE);
        akcr.a(h, "shouldHideEvents");
        ajdp = ajdp.a((ajdt) ajdp, (ajdt) h, (ajex) new a());
        if (ajdp == null) {
            akcr.a();
        }
        return ajdp;
    }
}
