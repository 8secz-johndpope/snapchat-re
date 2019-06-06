package android.support.v4.app;

import android.app.Activity;
import android.os.Bundle;
import defpackage.j;
import defpackage.j.b;
import defpackage.jh;
import defpackage.l;
import defpackage.m;
import defpackage.u;

public class SupportActivity extends Activity implements l {
    private jh<Class<? extends Object>, Object> a = new jh();
    private m b = new m(this);

    public j getLifecycle() {
        return this.b;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u.a((Activity) this);
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.b.b(b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
