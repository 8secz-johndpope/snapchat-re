package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.brightcove.player.event.Event;

/* renamed from: tih */
public abstract class tih {
    public Context f;
    protected Bundle g;
    public zkf h;
    public FragmentActivity i;
    protected fv j;
    protected tgq k;
    protected boolean l;

    public void a(Context context, Bundle bundle, boolean z, tgq tgq, zkf zkf, FragmentActivity fragmentActivity, fv fvVar) {
        akcr.b(context, "context");
        akcr.b(bundle, "arguments");
        akcr.b(zkf, "rxBus");
        akcr.b(fragmentActivity, "fragmentActivity");
        akcr.b(fvVar, Event.FRAGMENT);
        this.f = context;
        this.g = bundle;
        this.l = z;
        this.k = tgq;
        this.h = zkf;
        this.i = fragmentActivity;
        this.j = fvVar;
    }

    public void d() {
        fv fvVar = this.j;
        if (fvVar == null) {
            akcr.a(Event.FRAGMENT);
        }
        if (fvVar.isAdded()) {
            FragmentActivity fragmentActivity = this.i;
            if (fragmentActivity == null) {
                akcr.a("fragmentActivity");
            }
            fragmentActivity.onBackPressed();
        }
    }

    public final Context g() {
        Context context = this.f;
        if (context == null) {
            akcr.a("context");
        }
        return context;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bundle h() {
        Bundle bundle = this.g;
        if (bundle == null) {
            akcr.a("arguments");
        }
        return bundle;
    }
}
