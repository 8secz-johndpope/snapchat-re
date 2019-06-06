package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import defpackage.tpl.b.b;
import defpackage.ubb.a;

/* renamed from: ukg */
public final class ukg implements tzm {
    private final String a = this.b.c;
    private final ugi b;
    private final ftl c;
    private final Activity d;

    public ukg(ugi ugi, ftl ftl, Activity activity) {
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
        if (tzn.f().b instanceof b) {
            return null;
        }
        Context baseContext = this.d.getBaseContext();
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
