package dagger.android;

import android.app.Activity;
import android.os.Bundle;
import defpackage.aipp;

public abstract class DaggerActivity extends Activity {
    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        aipp.a((Activity) this);
        super.onCreate(bundle);
    }
}
