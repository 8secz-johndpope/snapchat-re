package android.support.multidex;

import android.app.Application;
import android.content.Context;
import defpackage.dl;

public class MultiDexApplication extends Application {
    /* Access modifiers changed, original: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        dl.a((Context) this);
    }
}
