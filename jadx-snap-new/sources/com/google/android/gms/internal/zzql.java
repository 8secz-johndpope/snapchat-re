package com.google.android.gms.internal;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzbt;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@zzabh
public final class zzql extends zzrc implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    static final String[] zzbzo = new String[]{"2011", "1009"};
    private final Object mLock = new Object();
    private zzpv zzbyi;
    private View zzbzt;
    private Point zzbzv = new Point();
    private Point zzbzw = new Point();
    private WeakReference<zzgr> zzbzx = new WeakReference(null);
    private final WeakReference<View> zzcaa;
    private final Map<String, WeakReference<View>> zzcab = new HashMap();
    private final Map<String, WeakReference<View>> zzcac = new HashMap();
    private final Map<String, WeakReference<View>> zzcad = new HashMap();

    public zzql(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        zzbt.zzfg();
        zzaml.zza(view, (OnGlobalLayoutListener) this);
        zzbt.zzfg();
        zzaml.zza(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.zzcaa = new WeakReference(view);
        zzi(hashMap);
        this.zzcad.putAll(this.zzcab);
        zzj(hashMap2);
        this.zzcad.putAll(this.zzcac);
        zzoi.initialize(view.getContext());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x003e in {7, 8, 9, 14, 17, 18, 20, 23} preds:[]
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
    private final void zza(com.google.android.gms.internal.zzpz r7) {
        /*
        r6 = this;
        r0 = r6.mLock;
        monitor-enter(r0);
        r1 = zzbzo;	 Catch:{ all -> 0x003b }
        r2 = r1.length;	 Catch:{ all -> 0x003b }
        r3 = 0;	 Catch:{ all -> 0x003b }
        if (r3 >= r2) goto L_0x001f;	 Catch:{ all -> 0x003b }
        r4 = r1[r3];	 Catch:{ all -> 0x003b }
        r5 = r6.zzcad;	 Catch:{ all -> 0x003b }
        r4 = r5.get(r4);	 Catch:{ all -> 0x003b }
        r4 = (java.lang.ref.WeakReference) r4;	 Catch:{ all -> 0x003b }
        if (r4 == 0) goto L_0x001c;	 Catch:{ all -> 0x003b }
        r1 = r4.get();	 Catch:{ all -> 0x003b }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x003b }
        goto L_0x0020;	 Catch:{ all -> 0x003b }
        r3 = r3 + 1;	 Catch:{ all -> 0x003b }
        goto L_0x0007;	 Catch:{ all -> 0x003b }
        r1 = 0;	 Catch:{ all -> 0x003b }
        r2 = r1 instanceof android.widget.FrameLayout;	 Catch:{ all -> 0x003b }
        if (r2 != 0) goto L_0x0029;	 Catch:{ all -> 0x003b }
        r7.zzks();	 Catch:{ all -> 0x003b }
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;	 Catch:{ all -> 0x003b }
        r2 = new com.google.android.gms.internal.zzqn;	 Catch:{ all -> 0x003b }
        r2.<init>(r6, r1);	 Catch:{ all -> 0x003b }
        r3 = r7 instanceof com.google.android.gms.internal.zzpu;	 Catch:{ all -> 0x003b }
        if (r3 == 0) goto L_0x0036;	 Catch:{ all -> 0x003b }
        r7.zzb(r1, r2);	 Catch:{ all -> 0x003b }
        goto L_0x0039;	 Catch:{ all -> 0x003b }
        r7.zza(r1, r2);	 Catch:{ all -> 0x003b }
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;	 Catch:{ all -> 0x003b }
        r7 = move-exception;	 Catch:{ all -> 0x003b }
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzql.zza(com.google.android.gms.internal.zzpz):void");
    }

    private final boolean zza(String[] strArr) {
        for (Object obj : strArr) {
            if (this.zzcab.get(obj) != null) {
                return true;
            }
        }
        for (Object obj2 : strArr) {
            if (this.zzcac.get(obj2) != null) {
                return false;
            }
        }
        return false;
    }

    private final void zzi(Map<String, View> map) {
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view = (View) entry.getValue();
            if (view != null) {
                this.zzcab.put(str, new WeakReference(view));
                if (!"1098".equals(str)) {
                    view.setOnTouchListener(this);
                    view.setClickable(true);
                    view.setOnClickListener(this);
                }
            }
        }
    }

    private final void zzj(Map<String, View> map) {
        for (Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                this.zzcac.put((String) entry.getKey(), new WeakReference(view));
                view.setOnTouchListener(this);
            }
        }
    }

    private final void zzk(View view) {
        synchronized (this.mLock) {
            if (this.zzbyi != null) {
                zzpv zzkp = this.zzbyi instanceof zzpu ? ((zzpu) this.zzbyi).zzkp() : this.zzbyi;
                if (zzkp != null) {
                    zzkp.zzk(view);
                }
            }
        }
    }

    private final int zzt(int i) {
        synchronized (this.mLock) {
            zzlc.zzij();
            i = zzako.zzb(this.zzbyi.getContext(), i);
        }
        return i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0093 in {6, 10, 19, 20, 21, 22, 24, 27} preds:[]
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
    public final void onClick(android.view.View r9) {
        /*
        r8 = this;
        r0 = r8.mLock;
        monitor-enter(r0);
        r1 = r8.zzbyi;	 Catch:{ all -> 0x0090 }
        if (r1 != 0) goto L_0x0009;	 Catch:{ all -> 0x0090 }
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;	 Catch:{ all -> 0x0090 }
        r1 = r8.zzcaa;	 Catch:{ all -> 0x0090 }
        r1 = r1.get();	 Catch:{ all -> 0x0090 }
        r7 = r1;	 Catch:{ all -> 0x0090 }
        r7 = (android.view.View) r7;	 Catch:{ all -> 0x0090 }
        if (r7 != 0) goto L_0x0016;	 Catch:{ all -> 0x0090 }
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;	 Catch:{ all -> 0x0090 }
        r5 = new android.os.Bundle;	 Catch:{ all -> 0x0090 }
        r5.<init>();	 Catch:{ all -> 0x0090 }
        r1 = "x";	 Catch:{ all -> 0x0090 }
        r2 = r8.zzbzv;	 Catch:{ all -> 0x0090 }
        r2 = r2.x;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzt(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "y";	 Catch:{ all -> 0x0090 }
        r2 = r8.zzbzv;	 Catch:{ all -> 0x0090 }
        r2 = r2.y;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzt(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "start_x";	 Catch:{ all -> 0x0090 }
        r2 = r8.zzbzw;	 Catch:{ all -> 0x0090 }
        r2 = r2.x;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzt(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = "start_y";	 Catch:{ all -> 0x0090 }
        r2 = r8.zzbzw;	 Catch:{ all -> 0x0090 }
        r2 = r2.y;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzt(r2);	 Catch:{ all -> 0x0090 }
        r2 = (float) r2;	 Catch:{ all -> 0x0090 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0090 }
        r1 = r8.zzbzt;	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0087;	 Catch:{ all -> 0x0090 }
        r1 = r8.zzbzt;	 Catch:{ all -> 0x0090 }
        r1 = r1.equals(r9);	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0087;	 Catch:{ all -> 0x0090 }
        r1 = r8.zzbyi;	 Catch:{ all -> 0x0090 }
        r1 = r1 instanceof com.google.android.gms.internal.zzpu;	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x0080;	 Catch:{ all -> 0x0090 }
        r1 = r8.zzbyi;	 Catch:{ all -> 0x0090 }
        r1 = (com.google.android.gms.internal.zzpu) r1;	 Catch:{ all -> 0x0090 }
        r1 = r1.zzkp();	 Catch:{ all -> 0x0090 }
        if (r1 == 0) goto L_0x008e;	 Catch:{ all -> 0x0090 }
        r1 = r8.zzbyi;	 Catch:{ all -> 0x0090 }
        r1 = (com.google.android.gms.internal.zzpu) r1;	 Catch:{ all -> 0x0090 }
        r2 = r1.zzkp();	 Catch:{ all -> 0x0090 }
        r4 = "1007";	 Catch:{ all -> 0x0090 }
        r6 = r8.zzcad;	 Catch:{ all -> 0x0090 }
        r3 = r9;	 Catch:{ all -> 0x0090 }
        r2.zza(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0090 }
        goto L_0x008e;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzbyi;	 Catch:{ all -> 0x0090 }
        r4 = "1007";	 Catch:{ all -> 0x0090 }
        r6 = r8.zzcad;	 Catch:{ all -> 0x0090 }
        goto L_0x007b;	 Catch:{ all -> 0x0090 }
        r1 = r8.zzbyi;	 Catch:{ all -> 0x0090 }
        r2 = r8.zzcad;	 Catch:{ all -> 0x0090 }
        r1.zza(r9, r2, r5, r7);	 Catch:{ all -> 0x0090 }
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        return;	 Catch:{ all -> 0x0090 }
        r9 = move-exception;	 Catch:{ all -> 0x0090 }
        monitor-exit(r0);	 Catch:{ all -> 0x0090 }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzql.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.mLock) {
            if (this.zzbyi != null) {
                View view = (View) this.zzcaa.get();
                if (view != null) {
                    this.zzbyi.zzc(view, this.zzcad);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.mLock) {
            if (this.zzbyi != null) {
                View view = (View) this.zzcaa.get();
                if (view != null) {
                    this.zzbyi.zzc(view, this.zzcad);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbyi == null) {
                return false;
            }
            View view2 = (View) this.zzcaa.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.zzbzv = point;
            if (motionEvent.getAction() == 0) {
                this.zzbzw = point;
            }
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.setLocation((float) point.x, (float) point.y);
            this.zzbyi.zzd(motionEvent);
            motionEvent.recycle();
            return false;
        }
    }

    public final void unregisterNativeAd() {
        synchronized (this.mLock) {
            this.zzbzt = null;
            this.zzbyi = null;
            this.zzbzv = null;
            this.zzbzw = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:96:0x0183 in {8, 13, 19, 36, 41, 47, 50, 53, 56, 60, 77, 79, 82, 87, 92, 95} preds:[]
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
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper r9) {
        /*
        r8 = this;
        r0 = r8.mLock;
        monitor-enter(r0);
        r1 = 0;
        r8.zzk(r1);	 Catch:{ all -> 0x0180 }
        r9 = com.google.android.gms.dynamic.zzn.zzy(r9);	 Catch:{ all -> 0x0180 }
        r2 = r9 instanceof com.google.android.gms.internal.zzpz;	 Catch:{ all -> 0x0180 }
        if (r2 != 0) goto L_0x0016;	 Catch:{ all -> 0x0180 }
        r9 = "Not an instance of native engine. This is most likely a transient error";	 Catch:{ all -> 0x0180 }
        com.google.android.gms.internal.zzaky.zzcz(r9);	 Catch:{ all -> 0x0180 }
        monitor-exit(r0);	 Catch:{ all -> 0x0180 }
        return;	 Catch:{ all -> 0x0180 }
        r9 = (com.google.android.gms.internal.zzpz) r9;	 Catch:{ all -> 0x0180 }
        r2 = r9.zzkn();	 Catch:{ all -> 0x0180 }
        if (r2 != 0) goto L_0x0025;	 Catch:{ all -> 0x0180 }
        r9 = "Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.";	 Catch:{ all -> 0x0180 }
        com.google.android.gms.internal.zzaky.e(r9);	 Catch:{ all -> 0x0180 }
        monitor-exit(r0);	 Catch:{ all -> 0x0180 }
        return;	 Catch:{ all -> 0x0180 }
        r2 = r8.zzcaa;	 Catch:{ all -> 0x0180 }
        r2 = r2.get();	 Catch:{ all -> 0x0180 }
        r7 = r2;	 Catch:{ all -> 0x0180 }
        r7 = (android.view.View) r7;	 Catch:{ all -> 0x0180 }
        r2 = r8.zzbyi;	 Catch:{ all -> 0x0180 }
        if (r2 == 0) goto L_0x004d;	 Catch:{ all -> 0x0180 }
        if (r7 == 0) goto L_0x004d;	 Catch:{ all -> 0x0180 }
        r2 = com.google.android.gms.internal.zzoi.zzbsn;	 Catch:{ all -> 0x0180 }
        r3 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0180 }
        r2 = r3.zzd(r2);	 Catch:{ all -> 0x0180 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ all -> 0x0180 }
        r2 = r2.booleanValue();	 Catch:{ all -> 0x0180 }
        if (r2 == 0) goto L_0x004d;	 Catch:{ all -> 0x0180 }
        r2 = r8.zzbyi;	 Catch:{ all -> 0x0180 }
        r3 = r8.zzcad;	 Catch:{ all -> 0x0180 }
        r2.zzb(r7, r3);	 Catch:{ all -> 0x0180 }
        r2 = r8.mLock;	 Catch:{ all -> 0x0180 }
        monitor-enter(r2);	 Catch:{ all -> 0x0180 }
        r3 = r8.zzbyi;	 Catch:{ all -> 0x017d }
        r3 = r3 instanceof com.google.android.gms.internal.zzpz;	 Catch:{ all -> 0x017d }
        if (r3 != 0) goto L_0x0058;	 Catch:{ all -> 0x017d }
        monitor-exit(r2);	 Catch:{ all -> 0x017d }
        goto L_0x0096;	 Catch:{ all -> 0x017d }
        r3 = r8.zzbyi;	 Catch:{ all -> 0x017d }
        r3 = (com.google.android.gms.internal.zzpz) r3;	 Catch:{ all -> 0x017d }
        r4 = r8.zzcaa;	 Catch:{ all -> 0x017d }
        r4 = r4.get();	 Catch:{ all -> 0x017d }
        r4 = (android.view.View) r4;	 Catch:{ all -> 0x017d }
        if (r3 == 0) goto L_0x0056;	 Catch:{ all -> 0x017d }
        r5 = r3.getContext();	 Catch:{ all -> 0x017d }
        if (r5 == 0) goto L_0x0056;	 Catch:{ all -> 0x017d }
        if (r4 == 0) goto L_0x0056;	 Catch:{ all -> 0x017d }
        r5 = com.google.android.gms.ads.internal.zzbt.zzfh();	 Catch:{ all -> 0x017d }
        r4 = r4.getContext();	 Catch:{ all -> 0x017d }
        r4 = r5.zzs(r4);	 Catch:{ all -> 0x017d }
        if (r4 == 0) goto L_0x0056;	 Catch:{ all -> 0x017d }
        r3 = r3.zzku();	 Catch:{ all -> 0x017d }
        if (r3 == 0) goto L_0x0086;	 Catch:{ all -> 0x017d }
        r4 = 0;	 Catch:{ all -> 0x017d }
        r3.zzw(r4);	 Catch:{ all -> 0x017d }
        r4 = r8.zzbzx;	 Catch:{ all -> 0x017d }
        r4 = r4.get();	 Catch:{ all -> 0x017d }
        r4 = (com.google.android.gms.internal.zzgr) r4;	 Catch:{ all -> 0x017d }
        if (r4 == 0) goto L_0x0056;	 Catch:{ all -> 0x017d }
        if (r3 == 0) goto L_0x0056;	 Catch:{ all -> 0x017d }
        r4.zzb(r3);	 Catch:{ all -> 0x017d }
        goto L_0x0056;
        r2 = r8.zzbyi;	 Catch:{ all -> 0x0180 }
        r2 = r2 instanceof com.google.android.gms.internal.zzpu;	 Catch:{ all -> 0x0180 }
        if (r2 == 0) goto L_0x00ae;	 Catch:{ all -> 0x0180 }
        r2 = r8.zzbyi;	 Catch:{ all -> 0x0180 }
        r2 = (com.google.android.gms.internal.zzpu) r2;	 Catch:{ all -> 0x0180 }
        r2 = r2.zzko();	 Catch:{ all -> 0x0180 }
        if (r2 == 0) goto L_0x00ae;	 Catch:{ all -> 0x0180 }
        r2 = r8.zzbyi;	 Catch:{ all -> 0x0180 }
        r2 = (com.google.android.gms.internal.zzpu) r2;	 Catch:{ all -> 0x0180 }
        r2.zzc(r9);	 Catch:{ all -> 0x0180 }
        goto L_0x00ba;	 Catch:{ all -> 0x0180 }
        r8.zzbyi = r9;	 Catch:{ all -> 0x0180 }
        r2 = r9 instanceof com.google.android.gms.internal.zzpu;	 Catch:{ all -> 0x0180 }
        if (r2 == 0) goto L_0x00ba;	 Catch:{ all -> 0x0180 }
        r2 = r9;	 Catch:{ all -> 0x0180 }
        r2 = (com.google.android.gms.internal.zzpu) r2;	 Catch:{ all -> 0x0180 }
        r2.zzc(r1);	 Catch:{ all -> 0x0180 }
        r2 = r8.zzcad;	 Catch:{ all -> 0x0180 }
        r3 = "1098";	 Catch:{ all -> 0x0180 }
        r2 = r2.get(r3);	 Catch:{ all -> 0x0180 }
        r2 = (java.lang.ref.WeakReference) r2;	 Catch:{ all -> 0x0180 }
        if (r2 != 0) goto L_0x00cc;	 Catch:{ all -> 0x0180 }
        r1 = "Ad choices asset view is not provided.";	 Catch:{ all -> 0x0180 }
        com.google.android.gms.internal.zzaky.zzcz(r1);	 Catch:{ all -> 0x0180 }
        goto L_0x010a;	 Catch:{ all -> 0x0180 }
        r2 = r2.get();	 Catch:{ all -> 0x0180 }
        r2 = (android.view.View) r2;	 Catch:{ all -> 0x0180 }
        r3 = r2 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0180 }
        if (r3 == 0) goto L_0x00d9;	 Catch:{ all -> 0x0180 }
        r1 = r2;	 Catch:{ all -> 0x0180 }
        r1 = (android.view.ViewGroup) r1;	 Catch:{ all -> 0x0180 }
        if (r1 == 0) goto L_0x010a;	 Catch:{ all -> 0x0180 }
        r2 = 1;	 Catch:{ all -> 0x0180 }
        r2 = r9.zza(r8, r2);	 Catch:{ all -> 0x0180 }
        r8.zzbzt = r2;	 Catch:{ all -> 0x0180 }
        r2 = r8.zzbzt;	 Catch:{ all -> 0x0180 }
        if (r2 == 0) goto L_0x010a;	 Catch:{ all -> 0x0180 }
        r2 = r8.zzcad;	 Catch:{ all -> 0x0180 }
        r3 = "1007";	 Catch:{ all -> 0x0180 }
        r4 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0180 }
        r5 = r8.zzbzt;	 Catch:{ all -> 0x0180 }
        r4.<init>(r5);	 Catch:{ all -> 0x0180 }
        r2.put(r3, r4);	 Catch:{ all -> 0x0180 }
        r2 = r8.zzcab;	 Catch:{ all -> 0x0180 }
        r3 = "1007";	 Catch:{ all -> 0x0180 }
        r4 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0180 }
        r5 = r8.zzbzt;	 Catch:{ all -> 0x0180 }
        r4.<init>(r5);	 Catch:{ all -> 0x0180 }
        r2.put(r3, r4);	 Catch:{ all -> 0x0180 }
        r1.removeAllViews();	 Catch:{ all -> 0x0180 }
        r2 = r8.zzbzt;	 Catch:{ all -> 0x0180 }
        r1.addView(r2);	 Catch:{ all -> 0x0180 }
        r3 = r8.zzcab;	 Catch:{ all -> 0x0180 }
        r4 = r8.zzcac;	 Catch:{ all -> 0x0180 }
        r1 = r9;	 Catch:{ all -> 0x0180 }
        r2 = r7;	 Catch:{ all -> 0x0180 }
        r5 = r8;	 Catch:{ all -> 0x0180 }
        r6 = r8;	 Catch:{ all -> 0x0180 }
        r1.zza(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0180 }
        r1 = com.google.android.gms.internal.zzaij.zzdfn;	 Catch:{ all -> 0x0180 }
        r2 = new com.google.android.gms.internal.zzqm;	 Catch:{ all -> 0x0180 }
        r2.<init>(r8, r9);	 Catch:{ all -> 0x0180 }
        r1.post(r2);	 Catch:{ all -> 0x0180 }
        r8.zzk(r7);	 Catch:{ all -> 0x0180 }
        r9 = r8.zzbyi;	 Catch:{ all -> 0x0180 }
        r9.zzi(r7);	 Catch:{ all -> 0x0180 }
        r9 = r8.mLock;	 Catch:{ all -> 0x0180 }
        monitor-enter(r9);	 Catch:{ all -> 0x0180 }
        r1 = r8.zzbyi;	 Catch:{ all -> 0x017a }
        r1 = r1 instanceof com.google.android.gms.internal.zzpz;	 Catch:{ all -> 0x017a }
        if (r1 != 0) goto L_0x0132;	 Catch:{ all -> 0x017a }
        monitor-exit(r9);	 Catch:{ all -> 0x017a }
        goto L_0x0178;	 Catch:{ all -> 0x017a }
        r1 = r8.zzbyi;	 Catch:{ all -> 0x017a }
        r1 = (com.google.android.gms.internal.zzpz) r1;	 Catch:{ all -> 0x017a }
        r2 = r8.zzcaa;	 Catch:{ all -> 0x017a }
        r2 = r2.get();	 Catch:{ all -> 0x017a }
        r2 = (android.view.View) r2;	 Catch:{ all -> 0x017a }
        if (r1 == 0) goto L_0x0130;	 Catch:{ all -> 0x017a }
        r3 = r1.getContext();	 Catch:{ all -> 0x017a }
        if (r3 == 0) goto L_0x0130;	 Catch:{ all -> 0x017a }
        if (r2 == 0) goto L_0x0130;	 Catch:{ all -> 0x017a }
        r3 = com.google.android.gms.ads.internal.zzbt.zzfh();	 Catch:{ all -> 0x017a }
        r4 = r2.getContext();	 Catch:{ all -> 0x017a }
        r3 = r3.zzs(r4);	 Catch:{ all -> 0x017a }
        if (r3 == 0) goto L_0x0130;	 Catch:{ all -> 0x017a }
        r3 = r8.zzbzx;	 Catch:{ all -> 0x017a }
        r3 = r3.get();	 Catch:{ all -> 0x017a }
        r3 = (com.google.android.gms.internal.zzgr) r3;	 Catch:{ all -> 0x017a }
        if (r3 != 0) goto L_0x0170;	 Catch:{ all -> 0x017a }
        r3 = new com.google.android.gms.internal.zzgr;	 Catch:{ all -> 0x017a }
        r4 = r2.getContext();	 Catch:{ all -> 0x017a }
        r3.<init>(r4, r2);	 Catch:{ all -> 0x017a }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x017a }
        r2.<init>(r3);	 Catch:{ all -> 0x017a }
        r8.zzbzx = r2;	 Catch:{ all -> 0x017a }
        r1 = r1.zzku();	 Catch:{ all -> 0x017a }
        r3.zza(r1);	 Catch:{ all -> 0x017a }
        goto L_0x0130;
        monitor-exit(r0);	 Catch:{ all -> 0x0180 }
        return;
        r1 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x017a }
        throw r1;	 Catch:{ all -> 0x0180 }
        r9 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x017d }
        throw r9;	 Catch:{ all -> 0x0180 }
        r9 = move-exception;	 Catch:{ all -> 0x0180 }
        monitor-exit(r0);	 Catch:{ all -> 0x0180 }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzql.zza(com.google.android.gms.dynamic.IObjectWrapper):void");
    }
}
