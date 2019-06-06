package com.snap.composer.jsmodules;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import com.snap.composer.logger.LogLevel;
import com.snap.composer.logger.Logger;
import defpackage.ajei;
import defpackage.ajek;
import defpackage.ajev;
import defpackage.ajwo;
import defpackage.ajxm;
import defpackage.ajxs;
import defpackage.ajxw;
import defpackage.ajzm;
import defpackage.akcr;

public final class ComposerApplicationModule extends ComposerBridgeModule implements ActivityLifecycleCallbacks {
    private ajwo<ajxw> a;
    private final ajwo<ajxw> b;

    public ComposerApplicationModule(Context context, ajei ajei, Logger logger) {
        akcr.b(context, "context");
        akcr.b(ajei, "disposable");
        akcr.b(logger, "logger");
        Object ajwo = new ajwo();
        String str = "PublishSubject.create<Unit>()";
        akcr.a(ajwo, str);
        this.a = ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.b = ajwo;
        context = context.getApplicationContext();
        if (!(context instanceof Application)) {
            context = null;
        }
        final Application application = (Application) context;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this);
            ajei.a(ajek.a((ajev) new ajev(this) {
                private /* synthetic */ ComposerApplicationModule a;

                public final void run() {
                    application.unregisterActivityLifecycleCallbacks(this.a);
                }
            }));
            return;
        }
        logger.log(LogLevel.Companion.getERROR(), "ApplicationContext did not return the application instance. Observing app lifecycle will not work.");
    }

    public final Object loadModule() {
        r0 = new ajxm[2];
        r0[0] = ajxs.a("observeEnteredBackground", makeObserverMethod(this.a));
        r0[1] = ajxs.a("observeEnteredForeground", makeObserverMethod(this.b));
        return ajzm.a(r0);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.a.a(ajxw.a);
    }

    public final void onActivityResumed(Activity activity) {
        this.b.a(ajxw.a);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
