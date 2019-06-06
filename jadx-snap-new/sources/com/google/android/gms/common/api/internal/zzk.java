package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.zzs;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzk implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final zzk zzfuo = new zzk();
    private boolean zzdyq = false;
    private final AtomicBoolean zzfup = new AtomicBoolean();
    private final AtomicBoolean zzfuq = new AtomicBoolean();
    private final ArrayList<zzl> zzfur = new ArrayList();

    private zzk() {
    }

    public static void zza(Application application) {
        synchronized (zzfuo) {
            if (!zzfuo.zzdyq) {
                application.registerActivityLifecycleCallbacks(zzfuo);
                application.registerComponentCallbacks(zzfuo);
                zzfuo.zzdyq = true;
            }
        }
    }

    public static zzk zzaij() {
        return zzfuo;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x001f in {5, 7, 10} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private final void zzbj(boolean r6) {
        /*
        r5 = this;
        r0 = zzfuo;
        monitor-enter(r0);
        r1 = r5.zzfur;	 Catch:{ all -> 0x001c }
        r1 = (java.util.ArrayList) r1;	 Catch:{ all -> 0x001c }
        r2 = r1.size();	 Catch:{ all -> 0x001c }
        r3 = 0;	 Catch:{ all -> 0x001c }
        if (r3 >= r2) goto L_0x001a;	 Catch:{ all -> 0x001c }
        r4 = r1.get(r3);	 Catch:{ all -> 0x001c }
        r3 = r3 + 1;	 Catch:{ all -> 0x001c }
        r4 = (com.google.android.gms.common.api.internal.zzl) r4;	 Catch:{ all -> 0x001c }
        r4.zzbj(r6);	 Catch:{ all -> 0x001c }
        goto L_0x000c;	 Catch:{ all -> 0x001c }
        monitor-exit(r0);	 Catch:{ all -> 0x001c }
        return;	 Catch:{ all -> 0x001c }
        r6 = move-exception;	 Catch:{ all -> 0x001c }
        monitor-exit(r0);	 Catch:{ all -> 0x001c }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzk.zzbj(boolean):void");
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.zzfup.compareAndSet(true, false);
        this.zzfuq.set(true);
        if (compareAndSet) {
            zzbj(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.zzfup.compareAndSet(true, false);
        this.zzfuq.set(true);
        if (compareAndSet) {
            zzbj(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.zzfup.compareAndSet(false, true)) {
            this.zzfuq.set(true);
            zzbj(true);
        }
    }

    public final void zza(zzl zzl) {
        synchronized (zzfuo) {
            this.zzfur.add(zzl);
        }
    }

    @TargetApi(16)
    public final boolean zzbi(boolean z) {
        if (!this.zzfuq.get()) {
            if (!zzs.zzans()) {
                return true;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.zzfuq.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.zzfup.set(true);
            }
        }
        return this.zzfup.get();
    }
}
