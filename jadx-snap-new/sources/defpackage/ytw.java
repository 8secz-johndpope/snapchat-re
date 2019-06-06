package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.res.Configuration;

/* renamed from: ytw */
public abstract class ytw implements aipt, aipu, aipv, aipw, ats {
    protected final Application mApplication;
    private volatile ats mApplicationLike = null;

    protected ytw(Application application) {
        this.mApplication = application;
    }

    public aipq<Activity> activityInjector() {
        return ((aipt) getApplication()).activityInjector();
    }

    public aipq<BroadcastReceiver> broadcastReceiverInjector() {
        return ((aipu) getApplication()).broadcastReceiverInjector();
    }

    public aipq<ContentProvider> contentProviderInjector() {
        return ((aipv) getApplication()).contentProviderInjector();
    }

    public abstract ats createApplication();

    public synchronized ats getApplication() {
        if (this.mApplicationLike == null) {
            this.mApplicationLike = createApplication();
        }
        return this.mApplicationLike;
    }

    public Object getSystemService(String str) {
        return getApplication().getSystemService(str);
    }

    /* Access modifiers changed, original: protected */
    public ats instantiateApplicationLikeClass(String str) {
        try {
            return (ats) Class.forName(str).getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.mApplication});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        getApplication().onConfigurationChanged(configuration);
    }

    public void onCreate() {
        getApplication().onCreate();
    }

    public void onLowMemory() {
        getApplication().onLowMemory();
    }

    public void onTerminate() {
        getApplication().onTerminate();
    }

    public void onTrimMemory(int i) {
        getApplication().onTrimMemory(i);
    }

    public aipq<Service> serviceInjector() {
        return ((aipw) getApplication()).serviceInjector();
    }
}
