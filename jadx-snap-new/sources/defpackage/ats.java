package defpackage;

import android.content.res.Configuration;

/* renamed from: ats */
public interface ats {
    Object getSystemService(String str);

    void onConfigurationChanged(Configuration configuration);

    void onCreate();

    void onLowMemory();

    void onTerminate();

    void onTrimMemory(int i);
}
