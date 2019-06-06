package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aiqh */
public final class aiqh {
    public a a;
    private final Application b;

    /* renamed from: aiqh$b */
    public static abstract class b {
        public void a(Activity activity) {
        }

        public void b(Activity activity) {
        }

        public void c(Activity activity) {
        }

        public void d(Activity activity) {
        }

        public void e(Activity activity) {
        }
    }

    /* renamed from: aiqh$a */
    public static class a {
        public final Set<ActivityLifecycleCallbacks> a = new HashSet();
        public final Application b;

        a(Application application) {
            this.b = application;
        }

        /* Access modifiers changed, original: final */
        @TargetApi(14)
        public final boolean a(final b bVar) {
            if (this.b == null) {
                return false;
            }
            1 1 = new ActivityLifecycleCallbacks() {
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    bVar.a(activity);
                }

                public final void onActivityDestroyed(Activity activity) {
                }

                public final void onActivityPaused(Activity activity) {
                    bVar.d(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    bVar.c(activity);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                    bVar.b(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    bVar.e(activity);
                }
            };
            this.b.registerActivityLifecycleCallbacks(1);
            this.a.add(1);
            return true;
        }
    }

    public aiqh(Context context) {
        this.b = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.a = new a(this.b);
        }
    }

    public final boolean a(b bVar) {
        a aVar = this.a;
        return aVar != null && aVar.a(bVar);
    }
}
