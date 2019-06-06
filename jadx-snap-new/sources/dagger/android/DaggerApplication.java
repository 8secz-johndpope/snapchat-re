package dagger.android;

import android.app.Application;
import defpackage.aipq;
import defpackage.aipt;
import defpackage.aipu;
import defpackage.aipv;
import defpackage.aipw;

public abstract class DaggerApplication extends Application implements aipt, aipu, aipv, aipw {
    private volatile boolean a = true;

    public abstract aipq<? extends DaggerApplication> a();

    public void onCreate() {
        super.onCreate();
        if (this.a) {
            synchronized (this) {
                if (this.a) {
                    a().a(this);
                    if (this.a) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }
}
