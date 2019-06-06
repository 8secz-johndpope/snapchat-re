package defpackage;

import java.util.List;

/* renamed from: jii */
public final class jii implements itr {
    private final hyq a;
    private final zfw b = zgb.a(hyn.a.callsite("FideliusFriendUpdatesProcessor"));

    public jii(hyq hyq) {
        this.a = hyq;
    }

    private /* synthetic */ void b(String str, String str2) {
        hyp c = this.a.c("friend_added_".concat(String.valueOf(str)));
        if (c != null) {
            c.a(str2);
        }
    }

    public final void a(aelf aelf, String str) {
        this.b.b().a(new -$$Lambda$jii$yvvnjXcC9_hYUV_ASV-uHrebdlk(this, str, aelf));
    }

    public final void a(String str, String str2) {
        this.b.b().a(new -$$Lambda$jii$0kjBrDiYu4eN9hkiDYSDWk4VaFE(this, str2, str));
    }

    public final void a(List<aelf> list, String str) {
        this.b.b().a(new -$$Lambda$jii$C7dDhmkVrteONeBQtKY1exq7OIw(this, str, list));
    }
}
