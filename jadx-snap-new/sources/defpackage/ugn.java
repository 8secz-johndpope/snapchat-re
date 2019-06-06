package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import defpackage.ubb.a;

/* renamed from: ugn */
public final class ugn implements tzm {
    private final String a = this.b.c;
    private final ugi b;
    private final Activity c;
    private final ftl d;

    public ugn(ugi ugi, Activity activity, ftl ftl) {
        akcr.b(ugi, "toolIcon");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ftl, "configProvider");
        this.b = ugi;
        this.c = activity;
        this.d = ftl;
    }

    public final String a() {
        return this.a;
    }

    public final tzj a(tzn tzn, ajei ajei) {
        akcr.b(tzn, "target");
        akcr.b(ajei, "activationDisposable");
        if (tpn.a(tzn.f()) || !tpn.b(tzn.f()) || !((Boolean) tzn.e().a.b()).booleanValue()) {
            return null;
        }
        Context baseContext = this.c.getBaseContext();
        akcr.a((Object) baseContext, "context");
        int a = a.a(baseContext, this.b.e);
        FrameLayout frameLayout = new FrameLayout(baseContext);
        View a2 = a.a(baseContext, a, this.b.a);
        abtc a3 = a.a(a2, frameLayout, (tzl) this.b);
        tzn.c().a(frameLayout);
        a.a(frameLayout, this.b, tzn.a(), ajei);
        return new tzj(a2, frameLayout, a3);
    }
}
