package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ContentProvider;
import com.brightcove.player.event.Event;

/* renamed from: aipp */
public final class aipp {
    public static void a(Activity activity) {
        aiqf.a(activity, Event.ACTIVITY);
        Application application = activity.getApplication();
        if (application instanceof aipt) {
            aipq activityInjector = ((aipt) application).activityInjector();
            aiqf.a(activityInjector, "%s.activityInjector() returned null", application.getClass());
            activityInjector.a(activity);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), aipt.class.getCanonicalName()}));
    }

    public static void a(Service service) {
        aiqf.a(service, "service");
        Application application = service.getApplication();
        if (application instanceof aipw) {
            aipq serviceInjector = ((aipw) application).serviceInjector();
            aiqf.a(serviceInjector, "%s.serviceInjector() returned null", application.getClass());
            serviceInjector.a(service);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), aipw.class.getCanonicalName()}));
    }

    public static void a(ContentProvider contentProvider) {
        aiqf.a(contentProvider, "contentProvider");
        Application application = (Application) contentProvider.getContext().getApplicationContext();
        if (application instanceof aipv) {
            aipq contentProviderInjector = ((aipv) application).contentProviderInjector();
            aiqf.a(contentProviderInjector, "%s.contentProviderInjector() returned null", application.getClass());
            contentProviderInjector.a(contentProvider);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), aipv.class.getCanonicalName()}));
    }
}
