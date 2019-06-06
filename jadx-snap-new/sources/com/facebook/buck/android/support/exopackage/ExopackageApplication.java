package com.facebook.buck.android.support.exopackage;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import defpackage.ats;

public abstract class ExopackageApplication<T extends ats> extends Application {
    protected T a;
    private final String b;
    private final int c = 0;

    protected ExopackageApplication(String str) {
        this.b = str;
    }

    private T c() {
        try {
            return (ats) Class.forName(this.b).getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void d() {
        if (this.a == null) {
            this.a = c();
        }
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        a();
        d();
    }

    public final T b() {
        return this.a;
    }

    public Object getSystemService(String str) {
        ats ats = this.a;
        if (ats != null) {
            Object systemService = ats.getSystemService(str);
            if (systemService != null) {
                return systemService;
            }
        }
        return super.getSystemService(str);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ats ats = this.a;
        if (ats != null) {
            ats.onConfigurationChanged(configuration);
        }
    }

    public final void onCreate() {
        super.onCreate();
        d();
        this.a.onCreate();
    }

    public final void onLowMemory() {
        super.onLowMemory();
        ats ats = this.a;
        if (ats != null) {
            ats.onLowMemory();
        }
    }

    public final void onTerminate() {
        super.onTerminate();
        ats ats = this.a;
        if (ats != null) {
            ats.onTerminate();
        }
    }

    @TargetApi(14)
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        ats ats = this.a;
        if (ats != null) {
            ats.onTrimMemory(i);
        }
    }
}
