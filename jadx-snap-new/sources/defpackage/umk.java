package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import defpackage.tpl.b.a;
import defpackage.tpl.b.b;

/* renamed from: umk */
public final class umk implements tzm {
    private final String a = this.b.c;
    private final ugi b;
    private final ftl c;
    private final Activity d;

    public umk(ugi ugi, ftl ftl, Activity activity) {
        akcr.b(ugi, "toolIcon");
        akcr.b(ftl, "configProvider");
        akcr.b(activity, Event.ACTIVITY);
        this.b = ugi;
        this.c = ftl;
        this.d = activity;
    }

    public final String a() {
        return this.a;
    }

    public final tzj a(tzn tzn, ajei ajei) {
        akcr.b(tzn, "target");
        akcr.b(ajei, "activationDisposable");
        tpl f = tzn.f();
        if (!tpt.b(f) || (f.b instanceof b) || (f.b instanceof a) || f.a.a()) {
            return null;
        }
        Context baseContext = this.d.getBaseContext();
        akcr.a((Object) baseContext, "context");
        int a = ubb.a.a(baseContext, this.b.e);
        FrameLayout frameLayout = new FrameLayout(baseContext);
        View a2 = ubb.a.a(baseContext, a, ((Boolean) tzn.e().b.b()).booleanValue() ? this.b.b : this.b.a);
        abtc a3 = ubb.a.a(a2, frameLayout, (tzl) this.b);
        tzn.c().a(frameLayout);
        ubb.a.a(frameLayout, this.b, tzn.a(), ajei);
        if (tpn.a(f)) {
            frameLayout.setVisibility(8);
        }
        return new tzj(a2, frameLayout, a3);
    }
}
