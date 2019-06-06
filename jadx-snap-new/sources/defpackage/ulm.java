package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.brightcove.player.event.Event;
import defpackage.ubb.a;

/* renamed from: ulm */
public final class ulm implements tzm {
    private final String a = this.b.c;
    private final ugi b;
    private final Activity c;

    public ulm(ugi ugi, Activity activity) {
        akcr.b(ugi, "toolIcon");
        akcr.b(activity, Event.ACTIVITY);
        this.b = ugi;
        this.c = activity;
    }

    public final String a() {
        return this.a;
    }

    public final tzj a(tzn tzn, ajei ajei) {
        akcr.b(tzn, "target");
        akcr.b(ajei, "activationDisposable");
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
