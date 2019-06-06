package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings.System;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzbt;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzabh
public final class zzfv implements OnGlobalLayoutListener, OnScrollChangedListener {
    private final Context mApplicationContext;
    private Object mLock = new Object();
    private boolean zzarz = false;
    private zzake zzavf;
    private final WeakReference<zzahd> zzavv;
    private WeakReference<ViewTreeObserver> zzavw;
    private final zzhf zzavx;
    protected final zzft zzavy;
    private final WindowManager zzavz;
    private final PowerManager zzawa;
    private final KeyguardManager zzawb;
    private final DisplayMetrics zzawc;
    private zzgc zzawd;
    private boolean zzawe;
    private boolean zzawf = false;
    private boolean zzawg;
    private boolean zzawh;
    private boolean zzawi;
    private BroadcastReceiver zzawj;
    private final HashSet<zzfs> zzawk = new HashSet();
    private final HashSet<zzgq> zzawl = new HashSet();
    private final Rect zzawm = new Rect();
    private final zzfy zzawn;
    private float zzawo;

    public zzfv(Context context, zzko zzko, zzahd zzahd, zzala zzala, zzhf zzhf) {
        this.zzavv = new WeakReference(zzahd);
        this.zzavx = zzhf;
        this.zzavw = new WeakReference(null);
        this.zzawg = true;
        this.zzawi = false;
        this.zzavf = new zzake(200);
        this.zzavy = new zzft(UUID.randomUUID().toString(), zzala, zzko.zzbia, zzahd.zzdch, zzahd.zzfz(), zzko.zzbid);
        this.zzavz = (WindowManager) context.getSystemService("window");
        this.zzawa = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.zzawb = (KeyguardManager) context.getSystemService("keyguard");
        this.mApplicationContext = context;
        this.zzawn = new zzfy(this, new Handler());
        this.mApplicationContext.getContentResolver().registerContentObserver(System.CONTENT_URI, true, this.zzawn);
        this.zzawc = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.zzavz.getDefaultDisplay();
        this.zzawm.right = defaultDisplay.getWidth();
        this.zzawm.bottom = defaultDisplay.getHeight();
        zzgb();
    }

    private final boolean isScreenOn() {
        return VERSION.SDK_INT >= 20 ? this.zzawa.isInteractive() : this.zzawa.isScreenOn();
    }

    private static int zza(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    private final JSONObject zza(View view, Boolean bool) {
        View view2 = view;
        String str = "isVisible";
        String str2 = "isAttachedToWindow";
        if (view2 == null) {
            return zzgg().put(str2, false).put("isScreenOn", isScreenOn()).put(str, false);
        }
        boolean isAttachedToWindow = zzbt.zzen().isAttachedToWindow(view2);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view2.getLocationOnScreen(iArr);
            view2.getLocationInWindow(iArr2);
        } catch (Exception e) {
            zzaky.zzb("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view2.getGlobalVisibleRect(rect2, null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view2.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view2.getHitRect(rect4);
        JSONObject zzgg = zzgg();
        JSONObject put = zzgg.put("windowVisibility", view.getWindowVisibility()).put(str2, isAttachedToWindow);
        JSONObject jSONObject = new JSONObject();
        int zza = zza(this.zzawm.top, this.zzawc);
        String str3 = Property.TEXT_ANCHOR_TOP;
        jSONObject = jSONObject.put(str3, zza);
        zza = zza(this.zzawm.bottom, this.zzawc);
        String str4 = Property.TEXT_ANCHOR_BOTTOM;
        String str5 = "left";
        String str6 = str;
        String str7 = "right";
        JSONObject jSONObject2 = zzgg;
        put.put("viewBox", jSONObject.put(str4, zza).put(str5, zza(this.zzawm.left, this.zzawc)).put(str7, zza(this.zzawm.right, this.zzawc))).put("adBox", new JSONObject().put(str3, zza(rect.top, this.zzawc)).put(str4, zza(rect.bottom, this.zzawc)).put(str5, zza(rect.left, this.zzawc)).put(str7, zza(rect.right, this.zzawc))).put("globalVisibleBox", new JSONObject().put(str3, zza(rect2.top, this.zzawc)).put(str4, zza(rect2.bottom, this.zzawc)).put(str5, zza(rect2.left, this.zzawc)).put(str7, zza(rect2.right, this.zzawc))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put(str3, zza(rect3.top, this.zzawc)).put(str4, zza(rect3.bottom, this.zzawc)).put(str5, zza(rect3.left, this.zzawc)).put(str7, zza(rect3.right, this.zzawc))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put(str3, zza(rect4.top, this.zzawc)).put(str4, zza(rect4.bottom, this.zzawc)).put(str5, zza(rect4.left, this.zzawc)).put(str7, zza(rect4.right, this.zzawc))).put("screenDensity", (double) this.zzawc.density);
        Boolean valueOf = bool == null ? Boolean.valueOf(zzbt.zzel().zza(view2, this.zzawa, this.zzawb)) : bool;
        JSONObject jSONObject3 = jSONObject2;
        jSONObject3.put(str6, valueOf.booleanValue());
        return jSONObject3;
    }

    private static JSONObject zza(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    private final void zza(JSONObject jSONObject, boolean z) {
        try {
            jSONObject = zza(jSONObject);
            ArrayList arrayList = new ArrayList(this.zzawl);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((zzgq) obj).zzb(jSONObject, z);
            }
        } catch (Throwable th) {
            zzaky.zzb("Skipping active view message.", th);
        }
    }

    private final void zzgd() {
        zzgc zzgc = this.zzawd;
        if (zzgc != null) {
            zzgc.zza(this);
        }
    }

    private final void zzgf() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.zzavw.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    private final JSONObject zzgg() {
        JSONObject jSONObject = new JSONObject();
        String str = "activeViewJSON";
        String str2 = "timestamp";
        str = "adFormat";
        str = "hashCode";
        str = "isMraid";
        str = "isStopped";
        str = "isPaused";
        str = "isNative";
        str = "isScreenOn";
        str = "appMuted";
        str2 = "appVolume";
        str2 = "deviceVolume";
        jSONObject.put("afmaVersion", this.zzavy.zzfw()).put(str, this.zzavy.zzfx()).put(str2, zzbt.zzes().elapsedRealtime()).put(str, this.zzavy.zzfv()).put(str, this.zzavy.zzfy()).put(str, this.zzavy.zzfz()).put(str, this.zzawf).put(str, this.zzarz).put(str, this.zzavy.zzga()).put(str, isScreenOn()).put(str, zzbt.zzfj().zzdq()).put(str2, (double) zzbt.zzfj().zzdp()).put(str2, (double) this.zzawo);
        return jSONObject;
    }

    public final void onGlobalLayout() {
        zzl(2);
    }

    public final void onScrollChanged() {
        zzl(1);
    }

    public final void pause() {
        synchronized (this.mLock) {
            this.zzarz = true;
            zzl(3);
        }
    }

    public final void resume() {
        synchronized (this.mLock) {
            this.zzarz = false;
            zzl(3);
        }
    }

    public final void stop() {
        synchronized (this.mLock) {
            this.zzawf = true;
            zzl(3);
        }
    }

    public final void zza(zzgc zzgc) {
        synchronized (this.mLock) {
            this.zzawd = zzgc;
        }
    }

    public final void zza(zzgq zzgq) {
        if (this.zzawl.isEmpty()) {
            synchronized (this.mLock) {
                if (this.zzawj == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.zzawj = new zzfw(this);
                    zzbt.zzfk().zza(this.mApplicationContext, this.zzawj, intentFilter);
                }
            }
            zzl(3);
        }
        this.zzawl.add(zzgq);
        try {
            zzgq.zzb(zza(zza(this.zzavx.zzgh(), null)), false);
        } catch (JSONException e) {
            zzaky.zzb("Skipping measurement update for new client.", e);
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzgq zzgq, Map<String, String> map) {
        String valueOf = String.valueOf(this.zzavy.zzfy());
        String str = "Received request to untrack: ";
        zzaky.zzby(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        zzb(zzgq);
    }

    public final void zzb(zzgq zzgq) {
        this.zzawl.remove(zzgq);
        zzgq.zzgl();
        if (this.zzawl.isEmpty()) {
            synchronized (this.mLock) {
                zzgf();
                synchronized (this.mLock) {
                    if (this.zzawj != null) {
                        try {
                            zzbt.zzfk().zza(this.mApplicationContext, this.zzawj);
                        } catch (IllegalStateException e) {
                            zzaky.zzb("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            zzbt.zzep().zza(e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.zzawj = null;
                    }
                }
                this.mApplicationContext.getContentResolver().unregisterContentObserver(this.zzawn);
                int i = 0;
                this.zzawg = false;
                zzgd();
                ArrayList arrayList = new ArrayList(this.zzawl);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zzb((zzgq) obj);
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean zze(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.zzavy.zzfy());
    }

    /* Access modifiers changed, original: final */
    public final void zzf(Map<String, String> map) {
        zzl(3);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A:{LOOP_END, LOOP:0: B:10:0x002b->B:12:0x0031} */
    public final void zzg(java.util.Map<java.lang.String, java.lang.String> r4) {
        /*
        r3 = this;
        r0 = "isVisible";
        r1 = r4.containsKey(r0);
        if (r1 != 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r1 = r4.get(r0);
        r2 = "1";
        r1 = r2.equals(r1);
        if (r1 != 0) goto L_0x0024;
    L_0x0015:
        r4 = r4.get(r0);
        r0 = "true";
        r4 = r0.equals(r4);
        if (r4 == 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0024;
    L_0x0022:
        r4 = 0;
        goto L_0x0025;
    L_0x0024:
        r4 = 1;
    L_0x0025:
        r0 = r3.zzawk;
        r0 = r0.iterator();
    L_0x002b:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x003b;
    L_0x0031:
        r1 = r0.next();
        r1 = (com.google.android.gms.internal.zzfs) r1;
        r1.zza(r3, r4);
        goto L_0x002b;
    L_0x003b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfv.zzg(java.util.Map):void");
    }

    public final void zzgb() {
        this.zzawo = zzaja.zzav(this.mApplicationContext);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0049 in {8, 11, 12, 14, 17, 18, 19, 21, 24} preds:[]
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
    public final void zzgc() {
        /*
        r5 = this;
        r0 = r5.mLock;
        monitor-enter(r0);
        r1 = r5.zzawg;	 Catch:{ all -> 0x0046 }
        if (r1 == 0) goto L_0x0044;	 Catch:{ all -> 0x0046 }
        r1 = 1;	 Catch:{ all -> 0x0046 }
        r5.zzawh = r1;	 Catch:{ all -> 0x0046 }
        r2 = r5.zzgg();	 Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
        r3 = "doneReasonCode";	 Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
        r4 = "u";	 Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
        r2.put(r3, r4);	 Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
        r5.zza(r2, r1);	 Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
        goto L_0x0024;
        r1 = move-exception;
        r2 = "Failure while processing active view data.";	 Catch:{ all -> 0x0046 }
        com.google.android.gms.internal.zzaky.zzb(r2, r1);	 Catch:{ all -> 0x0046 }
        goto L_0x0024;	 Catch:{ all -> 0x0046 }
        r1 = move-exception;	 Catch:{ all -> 0x0046 }
        r2 = "JSON failure while processing active view data.";	 Catch:{ all -> 0x0046 }
        goto L_0x001c;	 Catch:{ all -> 0x0046 }
        r1 = "Untracking ad unit: ";	 Catch:{ all -> 0x0046 }
        r2 = r5.zzavy;	 Catch:{ all -> 0x0046 }
        r2 = r2.zzfy();	 Catch:{ all -> 0x0046 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0046 }
        r3 = r2.length();	 Catch:{ all -> 0x0046 }
        if (r3 == 0) goto L_0x003b;	 Catch:{ all -> 0x0046 }
        r1 = r1.concat(r2);	 Catch:{ all -> 0x0046 }
        goto L_0x0041;	 Catch:{ all -> 0x0046 }
        r2 = new java.lang.String;	 Catch:{ all -> 0x0046 }
        r2.<init>(r1);	 Catch:{ all -> 0x0046 }
        r1 = r2;	 Catch:{ all -> 0x0046 }
        com.google.android.gms.internal.zzaky.zzby(r1);	 Catch:{ all -> 0x0046 }
        monitor-exit(r0);	 Catch:{ all -> 0x0046 }
        return;	 Catch:{ all -> 0x0046 }
        r1 = move-exception;	 Catch:{ all -> 0x0046 }
        monitor-exit(r0);	 Catch:{ all -> 0x0046 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfv.zzgc():void");
    }

    public final boolean zzge() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzawg;
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:71:0x00d3 in {8, 9, 13, 18, 19, 24, 25, 30, 37, 43, 46, 48, 49, 51, 60, 61, 62, 65, 67, 70} preds:[]
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
    protected final void zzl(int r8) {
        /*
        r7 = this;
        r0 = r7.mLock;
        monitor-enter(r0);
        r1 = r7.zzawl;	 Catch:{ all -> 0x00d0 }
        r1 = r1.iterator();	 Catch:{ all -> 0x00d0 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x00d0 }
        r3 = 0;	 Catch:{ all -> 0x00d0 }
        r4 = 1;	 Catch:{ all -> 0x00d0 }
        if (r2 == 0) goto L_0x001f;	 Catch:{ all -> 0x00d0 }
        r2 = r1.next();	 Catch:{ all -> 0x00d0 }
        r2 = (com.google.android.gms.internal.zzgq) r2;	 Catch:{ all -> 0x00d0 }
        r2 = r2.zzgk();	 Catch:{ all -> 0x00d0 }
        if (r2 == 0) goto L_0x0009;	 Catch:{ all -> 0x00d0 }
        r1 = 1;	 Catch:{ all -> 0x00d0 }
        goto L_0x0020;	 Catch:{ all -> 0x00d0 }
        r1 = 0;	 Catch:{ all -> 0x00d0 }
        if (r1 == 0) goto L_0x00ce;	 Catch:{ all -> 0x00d0 }
        r1 = r7.zzawg;	 Catch:{ all -> 0x00d0 }
        if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x00d0 }
        goto L_0x00ce;	 Catch:{ all -> 0x00d0 }
        r1 = r7.zzavx;	 Catch:{ all -> 0x00d0 }
        r1 = r1.zzgh();	 Catch:{ all -> 0x00d0 }
        if (r1 == 0) goto L_0x0040;	 Catch:{ all -> 0x00d0 }
        r2 = com.google.android.gms.ads.internal.zzbt.zzel();	 Catch:{ all -> 0x00d0 }
        r5 = r7.zzawa;	 Catch:{ all -> 0x00d0 }
        r6 = r7.zzawb;	 Catch:{ all -> 0x00d0 }
        r2 = r2.zza(r1, r5, r6);	 Catch:{ all -> 0x00d0 }
        if (r2 == 0) goto L_0x0040;	 Catch:{ all -> 0x00d0 }
        r2 = 1;	 Catch:{ all -> 0x00d0 }
        goto L_0x0041;	 Catch:{ all -> 0x00d0 }
        r2 = 0;	 Catch:{ all -> 0x00d0 }
        if (r1 == 0) goto L_0x0053;	 Catch:{ all -> 0x00d0 }
        if (r2 == 0) goto L_0x0053;	 Catch:{ all -> 0x00d0 }
        r5 = new android.graphics.Rect;	 Catch:{ all -> 0x00d0 }
        r5.<init>();	 Catch:{ all -> 0x00d0 }
        r6 = 0;	 Catch:{ all -> 0x00d0 }
        r5 = r1.getGlobalVisibleRect(r5, r6);	 Catch:{ all -> 0x00d0 }
        if (r5 == 0) goto L_0x0053;	 Catch:{ all -> 0x00d0 }
        r5 = 1;	 Catch:{ all -> 0x00d0 }
        goto L_0x0054;	 Catch:{ all -> 0x00d0 }
        r5 = 0;	 Catch:{ all -> 0x00d0 }
        r6 = r7.zzavx;	 Catch:{ all -> 0x00d0 }
        r6 = r6.zzgi();	 Catch:{ all -> 0x00d0 }
        if (r6 == 0) goto L_0x0061;	 Catch:{ all -> 0x00d0 }
        r7.zzgc();	 Catch:{ all -> 0x00d0 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d0 }
        return;	 Catch:{ all -> 0x00d0 }
        if (r8 != r4) goto L_0x0071;	 Catch:{ all -> 0x00d0 }
        r6 = r7.zzavf;	 Catch:{ all -> 0x00d0 }
        r6 = r6.tryAcquire();	 Catch:{ all -> 0x00d0 }
        if (r6 != 0) goto L_0x0071;	 Catch:{ all -> 0x00d0 }
        r6 = r7.zzawi;	 Catch:{ all -> 0x00d0 }
        if (r5 != r6) goto L_0x0071;	 Catch:{ all -> 0x00d0 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d0 }
        return;	 Catch:{ all -> 0x00d0 }
        if (r5 != 0) goto L_0x007b;	 Catch:{ all -> 0x00d0 }
        r6 = r7.zzawi;	 Catch:{ all -> 0x00d0 }
        if (r6 != 0) goto L_0x007b;	 Catch:{ all -> 0x00d0 }
        if (r8 != r4) goto L_0x007b;	 Catch:{ all -> 0x00d0 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d0 }
        return;
        r8 = java.lang.Boolean.valueOf(r2);	 Catch:{ JSONException -> 0x008b, RuntimeException -> 0x0089 }
        r8 = r7.zza(r1, r8);	 Catch:{ JSONException -> 0x008b, RuntimeException -> 0x0089 }
        r7.zza(r8, r3);	 Catch:{ JSONException -> 0x008b, RuntimeException -> 0x0089 }
        r7.zzawi = r5;	 Catch:{ JSONException -> 0x008b, RuntimeException -> 0x0089 }
        goto L_0x0091;
        r8 = move-exception;
        goto L_0x008c;
        r8 = move-exception;
        r1 = "Active view update failed.";	 Catch:{ all -> 0x00d0 }
        com.google.android.gms.internal.zzaky.zza(r1, r8);	 Catch:{ all -> 0x00d0 }
        r8 = r7.zzavx;	 Catch:{ all -> 0x00d0 }
        r8 = r8.zzgj();	 Catch:{ all -> 0x00d0 }
        r8 = r8.zzgh();	 Catch:{ all -> 0x00d0 }
        if (r8 == 0) goto L_0x00c9;	 Catch:{ all -> 0x00d0 }
        r1 = r7.zzavw;	 Catch:{ all -> 0x00d0 }
        r1 = r1.get();	 Catch:{ all -> 0x00d0 }
        r1 = (android.view.ViewTreeObserver) r1;	 Catch:{ all -> 0x00d0 }
        r8 = r8.getViewTreeObserver();	 Catch:{ all -> 0x00d0 }
        if (r8 == r1) goto L_0x00c9;	 Catch:{ all -> 0x00d0 }
        r7.zzgf();	 Catch:{ all -> 0x00d0 }
        r2 = r7.zzawe;	 Catch:{ all -> 0x00d0 }
        if (r2 == 0) goto L_0x00ba;	 Catch:{ all -> 0x00d0 }
        if (r1 == 0) goto L_0x00c2;	 Catch:{ all -> 0x00d0 }
        r1 = r1.isAlive();	 Catch:{ all -> 0x00d0 }
        if (r1 == 0) goto L_0x00c2;	 Catch:{ all -> 0x00d0 }
        r7.zzawe = r4;	 Catch:{ all -> 0x00d0 }
        r8.addOnScrollChangedListener(r7);	 Catch:{ all -> 0x00d0 }
        r8.addOnGlobalLayoutListener(r7);	 Catch:{ all -> 0x00d0 }
        r1 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x00d0 }
        r1.<init>(r8);	 Catch:{ all -> 0x00d0 }
        r7.zzavw = r1;	 Catch:{ all -> 0x00d0 }
        r7.zzgd();	 Catch:{ all -> 0x00d0 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d0 }
        return;	 Catch:{ all -> 0x00d0 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d0 }
        return;	 Catch:{ all -> 0x00d0 }
        r8 = move-exception;	 Catch:{ all -> 0x00d0 }
        monitor-exit(r0);	 Catch:{ all -> 0x00d0 }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzfv.zzl(int):void");
    }
}
