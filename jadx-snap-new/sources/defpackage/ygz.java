package defpackage;

import defpackage.agbj.a;
import java.util.List;

/* renamed from: ygz */
public final class ygz {
    public static final List<agbj> a;

    static {
        ygz ygz = new ygz();
        agbj[] agbjArr = new agbj[4];
        agbj agbj = new agbj();
        agbj.a = a.PRIVATE.a();
        agbjArr[0] = agbj;
        agbj = new agbj();
        agbj.a = a.GEOFENCE.a();
        agbjArr[1] = agbj;
        agbj = new agbj();
        agbj.a = a.CUSTOM.a();
        agbjArr[2] = agbj;
        agbj = new agbj();
        agbj.a = a.GROUP_CHAT.a();
        agbjArr[3] = agbj;
        a = ajym.b((Object[]) agbjArr);
    }

    private ygz() {
    }
}
