package com.snap.snapchat.shell;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.os.Build.VERSION;
import com.facebook.buck.android.support.exopackage.ExopackageApplication;
import com.snap.android.linearallocexpander.LaExpander;
import com.snap.mushroom.base.EarlyInitComponent;
import com.snap.mushroom.base.HasEarlyInitComponent;
import defpackage.abmf;
import defpackage.abmg;
import defpackage.aipq;
import defpackage.aipt;
import defpackage.aipu;
import defpackage.aipv;
import defpackage.aipw;
import defpackage.dl;

public class MushroomAppShell extends ExopackageApplication implements abmg, aipt, aipu, aipv, aipw, HasEarlyInitComponent {
    public MushroomAppShell() {
        this("com.snap.snapchat.shell.MushroomDelegatingApplicationLike");
    }

    private MushroomAppShell(String str) {
        super(str);
    }

    private static boolean c() {
        boolean z = false;
        try {
            String str = "x86";
            z = str.equals((String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"ro.product.cpu.abi", ""}));
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    public final void a() {
        super.a();
        if (VERSION.SDK_INT <= 19 && !c()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getBaseContext().getFilesDir());
            stringBuilder.append("/linear_alloc_expander.props");
            LaExpander.initialize(stringBuilder.toString());
            LaExpander.enableArenaReinintialization(true);
            LaExpander.setNewArenaSize(33554432);
            LaExpander.setPostReinitializationTimeout(15000);
            LaExpander.setMaxAttemptsCount(10);
            LaExpander.tryReinitializeArena();
        }
        dl.a((Context) this);
    }

    public aipq<Activity> activityInjector() {
        return ((aipt) this.a).activityInjector();
    }

    public aipq<BroadcastReceiver> broadcastReceiverInjector() {
        return ((aipu) this.a).broadcastReceiverInjector();
    }

    public aipq<ContentProvider> contentProviderInjector() {
        return ((aipv) this.a).contentProviderInjector();
    }

    public EarlyInitComponent earlyInitComponent() {
        return ((HasEarlyInitComponent) this.a).earlyInitComponent();
    }

    public <T extends abmf> T getTestBridge(Class<T> cls) {
        return ((abmg) this.a).getTestBridge(cls);
    }

    public aipq<Service> serviceInjector() {
        return ((aipw) this.a).serviceInjector();
    }
}
