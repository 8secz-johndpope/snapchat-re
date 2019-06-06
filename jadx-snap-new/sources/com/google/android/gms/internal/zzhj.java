package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

@TargetApi(14)
final class zzhj implements ActivityLifecycleCallbacks {
    private Activity mActivity;
    private Context mContext;
    private final Object mLock = new Object();
    private boolean zzarf = false;
    private boolean zzayw = true;
    private boolean zzayx = false;
    private final List<zzhl> zzayy = new ArrayList();
    private final List<zzhy> zzayz = new ArrayList();
    private Runnable zzaza;
    private long zzazb;

    zzhj() {
    }

    private final void setActivity(Activity activity) {
        synchronized (this.mLock) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.mActivity = activity;
            }
        }
    }

    public final Activity getActivity() {
        return this.mActivity;
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0045 in {6, 9, 18, 21, 23, 26} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void onActivityDestroyed(android.app.Activity r6) {
        /*
        r5 = this;
        r0 = r5.mLock;
        monitor-enter(r0);
        r1 = r5.mActivity;	 Catch:{ all -> 0x0042 }
        if (r1 != 0) goto L_0x0009;	 Catch:{ all -> 0x0042 }
        monitor-exit(r0);	 Catch:{ all -> 0x0042 }
        return;	 Catch:{ all -> 0x0042 }
        r1 = r5.mActivity;	 Catch:{ all -> 0x0042 }
        r1 = r1.equals(r6);	 Catch:{ all -> 0x0042 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ all -> 0x0042 }
        r1 = 0;	 Catch:{ all -> 0x0042 }
        r5.mActivity = r1;	 Catch:{ all -> 0x0042 }
        r1 = r5.zzayz;	 Catch:{ all -> 0x0042 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0042 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0042 }
        if (r2 == 0) goto L_0x0040;	 Catch:{ all -> 0x0042 }
        r2 = r1.next();	 Catch:{ all -> 0x0042 }
        r2 = (com.google.android.gms.internal.zzhy) r2;	 Catch:{ all -> 0x0042 }
        r2 = r2.zza(r6);	 Catch:{ Exception -> 0x0030 }
        if (r2 == 0) goto L_0x001a;	 Catch:{ Exception -> 0x0030 }
        r1.remove();	 Catch:{ Exception -> 0x0030 }
        goto L_0x001a;
        r2 = move-exception;
        r3 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0042 }
        r4 = "AppActivityTracker.ActivityListener.onActivityDestroyed";	 Catch:{ all -> 0x0042 }
        r3.zza(r2, r4);	 Catch:{ all -> 0x0042 }
        r3 = "onActivityStateChangedListener threw exception.";	 Catch:{ all -> 0x0042 }
        com.google.android.gms.internal.zzaky.zzb(r3, r2);	 Catch:{ all -> 0x0042 }
        goto L_0x001a;	 Catch:{ all -> 0x0042 }
        monitor-exit(r0);	 Catch:{ all -> 0x0042 }
        return;	 Catch:{ all -> 0x0042 }
        r6 = move-exception;	 Catch:{ all -> 0x0042 }
        monitor-exit(r0);	 Catch:{ all -> 0x0042 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhj.onActivityDestroyed(android.app.Activity):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x004d in {9, 12, 16, 18, 22} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void onActivityPaused(android.app.Activity r6) {
        /*
        r5 = this;
        r5.setActivity(r6);
        r0 = r5.mLock;
        monitor-enter(r0);
        r1 = r5.zzayz;	 Catch:{ all -> 0x004a }
        r1 = r1.iterator();	 Catch:{ all -> 0x004a }
        r2 = r1.hasNext();	 Catch:{ all -> 0x004a }
        if (r2 == 0) goto L_0x002c;	 Catch:{ all -> 0x004a }
        r2 = r1.next();	 Catch:{ all -> 0x004a }
        r2 = (com.google.android.gms.internal.zzhy) r2;	 Catch:{ all -> 0x004a }
        r2.onActivityPaused(r6);	 Catch:{ Exception -> 0x001c }
        goto L_0x000c;
        r2 = move-exception;
        r3 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x004a }
        r4 = "AppActivityTracker.ActivityListener.onActivityPaused";	 Catch:{ all -> 0x004a }
        r3.zza(r2, r4);	 Catch:{ all -> 0x004a }
        r3 = "onActivityStateChangedListener threw exception.";	 Catch:{ all -> 0x004a }
        com.google.android.gms.internal.zzaky.zzb(r3, r2);	 Catch:{ all -> 0x004a }
        goto L_0x000c;	 Catch:{ all -> 0x004a }
        monitor-exit(r0);	 Catch:{ all -> 0x004a }
        r6 = 1;
        r5.zzayx = r6;
        r6 = r5.zzaza;
        if (r6 == 0) goto L_0x003b;
        r6 = com.google.android.gms.internal.zzaij.zzdfn;
        r0 = r5.zzaza;
        r6.removeCallbacks(r0);
        r6 = com.google.android.gms.internal.zzaij.zzdfn;
        r0 = new com.google.android.gms.internal.zzhk;
        r0.<init>(r5);
        r5.zzaza = r0;
        r1 = r5.zzazb;
        r6.postDelayed(r0, r1);
        return;
        r6 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x004a }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhj.onActivityPaused(android.app.Activity):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:33:0x0069 in {2, 12, 15, 23, 26, 27, 29, 32} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void onActivityResumed(android.app.Activity r8) {
        /*
        r7 = this;
        r7.setActivity(r8);
        r0 = 0;
        r7.zzayx = r0;
        r0 = r7.zzayw;
        r1 = 1;
        r0 = r0 ^ r1;
        r7.zzayw = r1;
        r2 = r7.zzaza;
        if (r2 == 0) goto L_0x0017;
        r2 = com.google.android.gms.internal.zzaij.zzdfn;
        r3 = r7.zzaza;
        r2.removeCallbacks(r3);
        r2 = r7.mLock;
        monitor-enter(r2);
        r3 = r7.zzayz;	 Catch:{ all -> 0x0066 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0066 }
        r4 = r3.hasNext();	 Catch:{ all -> 0x0066 }
        if (r4 == 0) goto L_0x0040;	 Catch:{ all -> 0x0066 }
        r4 = r3.next();	 Catch:{ all -> 0x0066 }
        r4 = (com.google.android.gms.internal.zzhy) r4;	 Catch:{ all -> 0x0066 }
        r4.onActivityResumed(r8);	 Catch:{ Exception -> 0x0030 }
        goto L_0x0020;
        r4 = move-exception;
        r5 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ all -> 0x0066 }
        r6 = "AppActivityTracker.ActivityListener.onActivityResumed";	 Catch:{ all -> 0x0066 }
        r5.zza(r4, r6);	 Catch:{ all -> 0x0066 }
        r5 = "onActivityStateChangedListener threw exception.";	 Catch:{ all -> 0x0066 }
        com.google.android.gms.internal.zzaky.zzb(r5, r4);	 Catch:{ all -> 0x0066 }
        goto L_0x0020;	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x005f;	 Catch:{ all -> 0x0066 }
        r8 = r7.zzayy;	 Catch:{ all -> 0x0066 }
        r8 = r8.iterator();	 Catch:{ all -> 0x0066 }
        r0 = r8.hasNext();	 Catch:{ all -> 0x0066 }
        if (r0 == 0) goto L_0x0064;	 Catch:{ all -> 0x0066 }
        r0 = r8.next();	 Catch:{ all -> 0x0066 }
        r0 = (com.google.android.gms.internal.zzhl) r0;	 Catch:{ all -> 0x0066 }
        r0.zzh(r1);	 Catch:{ Exception -> 0x0058 }
        goto L_0x0048;
        r0 = move-exception;
        r3 = "OnForegroundStateChangedListener threw exception.";	 Catch:{ all -> 0x0066 }
        com.google.android.gms.internal.zzaky.zzb(r3, r0);	 Catch:{ all -> 0x0066 }
        goto L_0x0048;	 Catch:{ all -> 0x0066 }
        r8 = "App is still foreground.";	 Catch:{ all -> 0x0066 }
        com.google.android.gms.internal.zzaky.zzby(r8);	 Catch:{ all -> 0x0066 }
        monitor-exit(r2);	 Catch:{ all -> 0x0066 }
        return;	 Catch:{ all -> 0x0066 }
        r8 = move-exception;	 Catch:{ all -> 0x0066 }
        monitor-exit(r2);	 Catch:{ all -> 0x0066 }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhj.onActivityResumed(android.app.Activity):void");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (!this.zzarf) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                setActivity((Activity) context);
            }
            this.mContext = application;
            this.zzazb = ((Long) zzlc.zzio().zzd(zzoi.zzbpb)).longValue();
            this.zzarf = true;
        }
    }

    public final void zza(zzhl zzhl) {
        synchronized (this.mLock) {
            this.zzayy.add(zzhl);
        }
    }
}
