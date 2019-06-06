package defpackage;

import defpackage.qus.i;

/* renamed from: rfg */
public final class rfg implements sem {
    private final qus a;

    public rfg(qus qus) {
        akcr.b(qus, "messagesRepository");
        this.a = qus;
    }

    public final ajdp<Integer> a() {
        Object j = this.a.b().p(i.a).j(ajfu.a);
        akcr.a(j, "getNewContentInteraction…  .distinctUntilChanged()");
        return j;
    }
}
