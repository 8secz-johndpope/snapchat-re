package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.os.Handler;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: fxc */
public abstract class fxc<T extends gpp> extends att implements aipt, aipu, aipv, aipw {
    public Application applicationContext;
    public fxb<T> applicationCore;

    /* renamed from: fxc$a */
    static final class a implements Runnable {
        public static final a a = new a();

        a() {
        }

        public final void run() {
        }
    }

    public fxc(Application application) {
        akcr.b(application, "application");
        this();
        this.applicationContext = application;
        AppContext.setApplicationContext(application);
    }

    private final void enableStrictMode() {
        new Handler().postAtFrontOfQueue(a.a);
    }

    private final boolean shouldEnableStrictMode() {
        return false;
    }

    public aipq<Activity> activityInjector() {
        fxb fxb = this.applicationCore;
        if (fxb == null) {
            akcr.a("applicationCore");
        }
        return fxb.activityInjector();
    }

    public aipq<BroadcastReceiver> broadcastReceiverInjector() {
        fxb fxb = this.applicationCore;
        if (fxb == null) {
            akcr.a("applicationCore");
        }
        return fxb.broadcastReceiverInjector();
    }

    public aipq<ContentProvider> contentProviderInjector() {
        fxb fxb = this.applicationCore;
        if (fxb == null) {
            akcr.a("applicationCore");
        }
        return fxb.contentProviderInjector();
    }

    public final Application getApplicationContext() {
        Application application = this.applicationContext;
        if (application == null) {
            akcr.a("applicationContext");
        }
        return application;
    }

    public final fxb<T> getApplicationCore() {
        fxb fxb = this.applicationCore;
        if (fxb == null) {
            akcr.a("applicationCore");
        }
        return fxb;
    }

    public final void onCreate() {
        if (shouldEnableStrictMode()) {
            enableStrictMode();
        }
        performInjection();
        if (!shouldSkipInitialization()) {
            onPostInjection();
            fxb fxb = this.applicationCore;
            if (fxb == null) {
                akcr.a("applicationCore");
            }
            fxb.a();
        }
    }

    public void onPostInjection() {
    }

    public abstract void performInjection();

    public aipq<Service> serviceInjector() {
        fxb fxb = this.applicationCore;
        if (fxb == null) {
            akcr.a("applicationCore");
        }
        return fxb.serviceInjector();
    }

    public final void setApplicationContext(Application application) {
        akcr.b(application, "<set-?>");
        this.applicationContext = application;
    }

    public final void setApplicationCore(fxb<T> fxb) {
        akcr.b(fxb, "<set-?>");
        this.applicationCore = fxb;
    }

    public boolean shouldSkipInitialization() {
        return false;
    }
}
