package defpackage;

import defpackage.iyw.d;

/* renamed from: iug */
public final class iug implements sem {
    private final iyw a;

    public iug(iyw iyw) {
        akcr.b(iyw, "friendingClient");
        this.a = iyw;
    }

    public final ajdp<Integer> a() {
        iyw iyw = this.a;
        Object s = ((ftl) iyw.a.get()).s(jic.APP_BADGE_FOR_FRIEND_REQUEST_TYPE);
        akcr.a(s, "configProvider.get().obs…_FOR_FRIEND_REQUEST_TYPE)");
        ajdp a = ajdp.a((ajdt) s, (ajdt) iyw.b(), (ajdt) ((jkd) iyw.e.get()).e(), (ajfd) new d(iyw));
        if (a == null) {
            akcr.a();
        }
        return a;
    }
}
