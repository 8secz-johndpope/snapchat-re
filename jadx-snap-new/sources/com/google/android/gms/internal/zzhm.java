package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.util.zzs;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
@TargetApi(14)
public final class zzhm extends Thread {
    private final Object mLock;
    private boolean mStarted = false;
    private final int zzayc;
    private final int zzaye;
    private boolean zzazd = false;
    private final zzhh zzaze;
    private final zzabf zzazf;
    private final int zzazg;
    private final int zzazh;
    private final int zzazi;
    private final int zzazj;
    private final int zzazk;
    private final int zzazl;
    private final String zzazm;
    private final boolean zzazn;
    private boolean zzbm = false;

    public zzhm(zzhh zzhh, zzabf zzabf) {
        this.zzaze = zzhh;
        this.zzazf = zzabf;
        this.mLock = new Object();
        this.zzayc = ((Integer) zzlc.zzio().zzd(zzoi.zzbni)).intValue();
        this.zzazh = ((Integer) zzlc.zzio().zzd(zzoi.zzbnj)).intValue();
        this.zzaye = ((Integer) zzlc.zzio().zzd(zzoi.zzbnk)).intValue();
        this.zzazi = ((Integer) zzlc.zzio().zzd(zzoi.zzbnl)).intValue();
        this.zzazj = ((Integer) zzlc.zzio().zzd(zzoi.zzbno)).intValue();
        this.zzazk = ((Integer) zzlc.zzio().zzd(zzoi.zzbnq)).intValue();
        this.zzazl = ((Integer) zzlc.zzio().zzd(zzoi.zzbnr)).intValue();
        this.zzazg = ((Integer) zzlc.zzio().zzd(zzoi.zzbnm)).intValue();
        this.zzazm = (String) zzlc.zzio().zzd(zzoi.zzbnt);
        this.zzazn = ((Boolean) zzlc.zzio().zzd(zzoi.zzbnv)).booleanValue();
        setName("ContentFetchTask");
    }

    private final zzhq zza(View view, zzhg zzhg) {
        int i = 0;
        if (view == null) {
            return new zzhq(this, 0, 0);
        }
        Context context = zzbt.zzeo().getContext();
        if (context != null) {
            String str = (String) view.getTag(context.getResources().getIdentifier((String) zzlc.zzio().zzd(zzoi.zzbns), "id", context.getPackageName()));
            if (!(TextUtils.isEmpty(this.zzazm) || str == null || !str.equals(this.zzazm))) {
                return new zzhq(this, 0, 0);
            }
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzhq(this, 0, 0);
            }
            zzhg.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new zzhq(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzaof)) {
            Object obj;
            zzhg.zzgt();
            WebView webView = (WebView) view;
            if (zzs.zzanv()) {
                zzhg.zzgt();
                webView.post(new zzho(this, zzhg, webView, globalVisibleRect));
                obj = 1;
            } else {
                obj = null;
            }
            return obj != null ? new zzhq(this, 0, 1) : new zzhq(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new zzhq(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i2 = 0;
            int i3 = 0;
            while (i < viewGroup.getChildCount()) {
                zzhq zza = zza(viewGroup.getChildAt(i), zzhg);
                i2 += zza.zzazv;
                i3 += zza.zzazw;
                i++;
            }
            return new zzhq(this, i2, i3);
        }
    }

    private static boolean zzgy() {
        boolean z = false;
        try {
            Context context = zzbt.zzeo().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Event.ACTIVITY);
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (Process.myPid() == runningAppProcessInfo.pid) {
                            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
                                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                if (powerManager == null ? false : powerManager.isScreenOn()) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            return z;
        } catch (Throwable th) {
            zzbt.zzep().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final void zzha() {
        synchronized (this.mLock) {
            this.zzazd = true;
            boolean z = this.zzazd;
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("ContentFetchThread: paused, mPause = ");
            stringBuilder.append(z);
            zzaky.zzby(stringBuilder.toString());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:44:0x0094 in {5, 7, 16, 19, 22, 23, 25, 27, 29, 37, 40, 43} preds:[]
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
    public final void run() {
        /*
        r4 = this;
        r0 = zzgy();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        if (r0 == 0) goto L_0x0059;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = com.google.android.gms.ads.internal.zzbt.zzeo();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = r0.getActivity();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        if (r0 != 0) goto L_0x0019;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = "ContentFetchThread: no activity. Sleeping.";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.zzaky.zzby(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r4.zzha();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x005f;
        if (r0 == 0) goto L_0x005f;
        r1 = 0;
        r2 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r2 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r2 = r2.getDecorView();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r0 = r0.getWindow();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r0 = r0.getDecorView();	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r0 = r0.findViewById(r2);	 Catch:{ Exception -> 0x003d, InterruptedException -> 0x0076 }
        r1 = r0;
        goto L_0x004c;
        r0 = move-exception;
        r2 = com.google.android.gms.ads.internal.zzbt.zzep();	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r3 = "ContentFetchTask.extractContent";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r2.zza(r0, r3);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = "Failed getting root view of activity. Content not extracted.";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.zzaky.zzby(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        if (r1 == 0) goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        if (r1 == 0) goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = new com.google.android.gms.internal.zzhn;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0.<init>(r4, r1);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r1.post(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x005f;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = "ContentFetchTask: sleeping";	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        com.google.android.gms.internal.zzaky.zzby(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x0015;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = r4.zzazg;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = r0 * 1000;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        goto L_0x007c;
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.zzaky.zzb(r1, r0);
        r1 = r4.zzazf;
        r2 = "ContentFetchTask.run";
        r1.zza(r0, r2);
        goto L_0x007c;
        r0 = move-exception;
        r1 = "Error in ContentFetchTask";
        com.google.android.gms.internal.zzaky.zzb(r1, r0);
        r0 = r4.mLock;
        monitor-enter(r0);
    L_0x007f:
        r1 = r4.zzazd;	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x008e;
        r1 = "ContentFetchTask: waiting";	 Catch:{ InterruptedException -> 0x007f }
        com.google.android.gms.internal.zzaky.zzby(r1);	 Catch:{ InterruptedException -> 0x007f }
        r1 = r4.mLock;	 Catch:{ InterruptedException -> 0x007f }
        r1.wait();	 Catch:{ InterruptedException -> 0x007f }
        goto L_0x007f;
        monitor-exit(r0);	 Catch:{ all -> 0x0091 }
        goto L_0x0000;	 Catch:{ all -> 0x0091 }
        r1 = move-exception;	 Catch:{ all -> 0x0091 }
        monitor-exit(r0);	 Catch:{ all -> 0x0091 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzhm.run():void");
    }

    public final void wakeup() {
        synchronized (this.mLock) {
            this.zzazd = false;
            this.mLock.notifyAll();
            zzaky.zzby("ContentFetchThread: wakeup");
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzhg zzhg, WebView webView, String str, boolean z) {
        zzhg.zzgs();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.zzazn || TextUtils.isEmpty(webView.getTitle())) {
                    zzhg.zza(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    str = webView.getTitle();
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(optString).length());
                    stringBuilder.append(str);
                    stringBuilder.append("\n");
                    stringBuilder.append(optString);
                    zzhg.zza(stringBuilder.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (zzhg.zzgn()) {
                this.zzaze.zzb(zzhg);
            }
        } catch (JSONException unused) {
            zzaky.zzby("Json string may be malformed.");
        } catch (Throwable th) {
            zzaky.zza("Failed to get webview content.", th);
            this.zzazf.zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzgx() {
        synchronized (this.mLock) {
            if (this.mStarted) {
                zzaky.zzby("Content hash thread already started, quiting...");
                return;
            }
            this.mStarted = true;
            start();
        }
    }

    public final zzhg zzgz() {
        return this.zzaze.zzgw();
    }

    public final boolean zzhb() {
        return this.zzazd;
    }

    /* Access modifiers changed, original: final */
    public final void zzj(View view) {
        try {
            zzhg zzhg = new zzhg(this.zzayc, this.zzazh, this.zzaye, this.zzazi, this.zzazj, this.zzazk, this.zzazl);
            zzhq zza = zza(view, zzhg);
            zzhg.zzgu();
            if (zza.zzazv != 0 || zza.zzazw != 0) {
                if (zza.zzazw != 0 || zzhg.zzgv() != 0) {
                    if (zza.zzazw != 0 || !this.zzaze.zza(zzhg)) {
                        this.zzaze.zzc(zzhg);
                    }
                }
            }
        } catch (Exception e) {
            zzaky.zzb("Exception in fetchContentOnUIThread", e);
            this.zzazf.zza(e, "ContentFetchTask.fetchContent");
        }
    }
}
