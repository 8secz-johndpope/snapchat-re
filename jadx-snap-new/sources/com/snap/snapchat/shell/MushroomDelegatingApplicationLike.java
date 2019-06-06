package com.snap.snapchat.shell;

import android.app.Application;
import com.snap.framework.developer.BuildConfigInfo;
import com.snap.mushroom.MainActivity;
import com.snap.mushroom.base.EarlyInitComponent;
import com.snap.mushroom.base.HasEarlyInitComponent;
import com.snap.snapchat.BuildConfig;
import defpackage.abmf;
import defpackage.abmg;
import defpackage.ats;
import defpackage.ytv;
import defpackage.ytw;
import defpackage.ytx;
import defpackage.yud;

public class MushroomDelegatingApplicationLike extends ytw implements abmg, HasEarlyInitComponent {
    private static final String DELEGATE_APPLICATION_CLASS_NAME = "com.snap.mushroom.app.MushroomApplication";

    public MushroomDelegatingApplicationLike(Application application) {
        super(application);
    }

    public ats createApplication() {
        BuildConfigInfo buildConfigInfo = new BuildConfigInfo(BuildConfig.class);
        ats instantiateApplicationLikeClass = instantiateApplicationLikeClass(DELEGATE_APPLICATION_CLASS_NAME);
        if (instantiateApplicationLikeClass instanceof ytv) {
            String canonicalName = MainActivity.class.getCanonicalName();
            if (canonicalName != null) {
                ytx ytx = new ytx(new yud(this.mApplication, buildConfigInfo, canonicalName, ""));
                ytx.a.c();
                ((ytv) instantiateApplicationLikeClass).attachDynamicAppModule(ytx);
            } else {
                throw new IllegalArgumentException("Invalid activity");
            }
        }
        return instantiateApplicationLikeClass;
    }

    public EarlyInitComponent earlyInitComponent() {
        return ((HasEarlyInitComponent) getApplication()).earlyInitComponent();
    }

    public <T extends abmf> T getTestBridge(Class<T> cls) {
        return ((abmg) getApplication()).getTestBridge(cls);
    }
}
