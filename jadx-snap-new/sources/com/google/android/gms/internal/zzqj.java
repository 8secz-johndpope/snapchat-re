package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.gms.ads.internal.zzbt;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@zzabh
public final class zzqj extends zzqx implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener {
    private static String[] zzbzo = new String[]{"2011", "1009", "3010"};
    private final Object mLock = new Object();
    private FrameLayout zzamk;
    private zzpv zzbyi;
    private final FrameLayout zzbzp;
    private View zzbzq;
    private final boolean zzbzr;
    private Map<String, WeakReference<View>> zzbzs = Collections.synchronizedMap(new HashMap());
    private View zzbzt;
    private boolean zzbzu = false;
    private Point zzbzv = new Point();
    private Point zzbzw = new Point();
    private WeakReference<zzgr> zzbzx = new WeakReference(null);

    @TargetApi(21)
    public zzqj(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.zzbzp = frameLayout;
        this.zzamk = frameLayout2;
        zzbt.zzfg();
        zzaml.zza(this.zzbzp, (OnGlobalLayoutListener) this);
        zzbt.zzfg();
        zzaml.zza(this.zzbzp, (OnScrollChangedListener) this);
        this.zzbzp.setOnTouchListener(this);
        this.zzbzp.setOnClickListener(this);
        if (frameLayout2 != null && zzs.zzanx()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        zzoi.initialize(this.zzbzp.getContext());
        this.zzbzr = ((Boolean) zzlc.zzio().zzd(zzoi.zzbsv)).booleanValue();
    }

    private final void zzk(View view) {
        zzpv zzpv = this.zzbyi;
        if (zzpv != null) {
            if (zzpv instanceof zzpu) {
                zzpv = ((zzpu) zzpv).zzkp();
            }
            if (zzpv != null) {
                zzpv.zzk(view);
            }
        }
    }

    private final View zzkv() {
        if (this.zzbzs == null) {
            return null;
        }
        for (Object obj : zzbzo) {
            WeakReference weakReference = (WeakReference) this.zzbzs.get(obj);
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final void zzkw() {
        synchronized (this.mLock) {
            if (!this.zzbzr && this.zzbzu) {
                int measuredWidth = this.zzbzp.getMeasuredWidth();
                int measuredHeight = this.zzbzp.getMeasuredHeight();
                if (!(measuredWidth == 0 || measuredHeight == 0 || this.zzamk == null)) {
                    this.zzamk.setLayoutParams(new LayoutParams(measuredWidth, measuredHeight));
                    this.zzbzu = false;
                }
            }
        }
    }

    private final int zzt(int i) {
        zzlc.zzij();
        return zzako.zzb(this.zzbyi.getContext(), i);
    }

    public final void destroy() {
        synchronized (this.mLock) {
            if (this.zzamk != null) {
                this.zzamk.removeAllViews();
            }
            this.zzamk = null;
            this.zzbzs = null;
            this.zzbzt = null;
            this.zzbyi = null;
            this.zzbzv = null;
            this.zzbzw = null;
            this.zzbzx = null;
            this.zzbzq = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x008c in {6, 15, 16, 17, 18, 20, 23} preds:[]
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
    public final void onClick(android.view.View r8) {
        /*
        r7 = this;
        r0 = r7.mLock;
        monitor-enter(r0);
        r1 = r7.zzbyi;	 Catch:{ all -> 0x0089 }
        if (r1 != 0) goto L_0x0009;	 Catch:{ all -> 0x0089 }
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        return;	 Catch:{ all -> 0x0089 }
        r4 = new android.os.Bundle;	 Catch:{ all -> 0x0089 }
        r4.<init>();	 Catch:{ all -> 0x0089 }
        r1 = "x";	 Catch:{ all -> 0x0089 }
        r2 = r7.zzbzv;	 Catch:{ all -> 0x0089 }
        r2 = r2.x;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzt(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "y";	 Catch:{ all -> 0x0089 }
        r2 = r7.zzbzv;	 Catch:{ all -> 0x0089 }
        r2 = r2.y;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzt(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "start_x";	 Catch:{ all -> 0x0089 }
        r2 = r7.zzbzw;	 Catch:{ all -> 0x0089 }
        r2 = r2.x;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzt(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = "start_y";	 Catch:{ all -> 0x0089 }
        r2 = r7.zzbzw;	 Catch:{ all -> 0x0089 }
        r2 = r2.y;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzt(r2);	 Catch:{ all -> 0x0089 }
        r2 = (float) r2;	 Catch:{ all -> 0x0089 }
        r4.putFloat(r1, r2);	 Catch:{ all -> 0x0089 }
        r1 = r7.zzbzt;	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x007e;	 Catch:{ all -> 0x0089 }
        r1 = r7.zzbzt;	 Catch:{ all -> 0x0089 }
        r1 = r1.equals(r8);	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x007e;	 Catch:{ all -> 0x0089 }
        r1 = r7.zzbyi;	 Catch:{ all -> 0x0089 }
        r1 = r1 instanceof com.google.android.gms.internal.zzpu;	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0075;	 Catch:{ all -> 0x0089 }
        r1 = r7.zzbyi;	 Catch:{ all -> 0x0089 }
        r1 = (com.google.android.gms.internal.zzpu) r1;	 Catch:{ all -> 0x0089 }
        r1 = r1.zzkp();	 Catch:{ all -> 0x0089 }
        if (r1 == 0) goto L_0x0087;	 Catch:{ all -> 0x0089 }
        r1 = r7.zzbyi;	 Catch:{ all -> 0x0089 }
        r1 = (com.google.android.gms.internal.zzpu) r1;	 Catch:{ all -> 0x0089 }
        r1 = r1.zzkp();	 Catch:{ all -> 0x0089 }
        r3 = "1007";	 Catch:{ all -> 0x0089 }
        r5 = r7.zzbzs;	 Catch:{ all -> 0x0089 }
        r6 = r7.zzbzp;	 Catch:{ all -> 0x0089 }
        r2 = r8;	 Catch:{ all -> 0x0089 }
        r1.zza(r2, r3, r4, r5, r6);	 Catch:{ all -> 0x0089 }
        goto L_0x0087;	 Catch:{ all -> 0x0089 }
        r1 = r7.zzbyi;	 Catch:{ all -> 0x0089 }
        r3 = "1007";	 Catch:{ all -> 0x0089 }
        r5 = r7.zzbzs;	 Catch:{ all -> 0x0089 }
        r6 = r7.zzbzp;	 Catch:{ all -> 0x0089 }
        goto L_0x0070;	 Catch:{ all -> 0x0089 }
        r1 = r7.zzbyi;	 Catch:{ all -> 0x0089 }
        r2 = r7.zzbzs;	 Catch:{ all -> 0x0089 }
        r3 = r7.zzbzp;	 Catch:{ all -> 0x0089 }
        r1.zza(r8, r2, r4, r3);	 Catch:{ all -> 0x0089 }
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        return;	 Catch:{ all -> 0x0089 }
        r8 = move-exception;	 Catch:{ all -> 0x0089 }
        monitor-exit(r0);	 Catch:{ all -> 0x0089 }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzqj.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.mLock) {
            zzkw();
            if (this.zzbyi != null) {
                this.zzbyi.zzc(this.zzbzp, this.zzbzs);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.mLock) {
            if (this.zzbyi != null) {
                this.zzbyi.zzc(this.zzbzp, this.zzbzs);
            }
            zzkw();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbyi == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.zzbzp.getLocationOnScreen(iArr);
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:132:0x022a in {8, 13, 18, 29, 33, 38, 41, 45, 48, 55, 56, 59, 60, 63, 64, 69, 71, 74, 79, 82, 85, 90, 91, 95, 101, 106, 108, 120, 121, 123, 128, 131} preds:[]
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
    public final void zza(com.google.android.gms.dynamic.IObjectWrapper r12) {
        /*
        r11 = this;
        r0 = r11.mLock;
        monitor-enter(r0);
        r1 = 0;
        r11.zzk(r1);	 Catch:{ all -> 0x0227 }
        r12 = com.google.android.gms.dynamic.zzn.zzy(r12);	 Catch:{ all -> 0x0227 }
        r2 = r12 instanceof com.google.android.gms.internal.zzpz;	 Catch:{ all -> 0x0227 }
        if (r2 != 0) goto L_0x0016;	 Catch:{ all -> 0x0227 }
        r12 = "Not an instance of native engine. This is most likely a transient error";	 Catch:{ all -> 0x0227 }
        com.google.android.gms.internal.zzaky.zzcz(r12);	 Catch:{ all -> 0x0227 }
        monitor-exit(r0);	 Catch:{ all -> 0x0227 }
        return;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzr;	 Catch:{ all -> 0x0227 }
        r3 = 0;	 Catch:{ all -> 0x0227 }
        if (r2 != 0) goto L_0x002e;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x002e;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        r4 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x0227 }
        r4.<init>(r3, r3);	 Catch:{ all -> 0x0227 }
        r2.setLayoutParams(r4);	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r2.requestLayout();	 Catch:{ all -> 0x0227 }
        r2 = 1;	 Catch:{ all -> 0x0227 }
        r11.zzbzu = r2;	 Catch:{ all -> 0x0227 }
        r12 = (com.google.android.gms.internal.zzpz) r12;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x0052;	 Catch:{ all -> 0x0227 }
        r4 = com.google.android.gms.internal.zzoi.zzbsn;	 Catch:{ all -> 0x0227 }
        r5 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0227 }
        r4 = r5.zzd(r4);	 Catch:{ all -> 0x0227 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x0227 }
        r4 = r4.booleanValue();	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x0052;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r5 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r6 = r11.zzbzs;	 Catch:{ all -> 0x0227 }
        r4.zzb(r5, r6);	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r4 = r4 instanceof com.google.android.gms.internal.zzpz;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x008c;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r4 = (com.google.android.gms.internal.zzpz) r4;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x008c;	 Catch:{ all -> 0x0227 }
        r5 = r4.getContext();	 Catch:{ all -> 0x0227 }
        if (r5 == 0) goto L_0x008c;	 Catch:{ all -> 0x0227 }
        r5 = com.google.android.gms.ads.internal.zzbt.zzfh();	 Catch:{ all -> 0x0227 }
        r6 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r6 = r6.getContext();	 Catch:{ all -> 0x0227 }
        r5 = r5.zzs(r6);	 Catch:{ all -> 0x0227 }
        if (r5 == 0) goto L_0x008c;	 Catch:{ all -> 0x0227 }
        r4 = r4.zzku();	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x007d;	 Catch:{ all -> 0x0227 }
        r4.zzw(r3);	 Catch:{ all -> 0x0227 }
        r5 = r11.zzbzx;	 Catch:{ all -> 0x0227 }
        r5 = r5.get();	 Catch:{ all -> 0x0227 }
        r5 = (com.google.android.gms.internal.zzgr) r5;	 Catch:{ all -> 0x0227 }
        if (r5 == 0) goto L_0x008c;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x008c;	 Catch:{ all -> 0x0227 }
        r5.zzb(r4);	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r4 = r4 instanceof com.google.android.gms.internal.zzpu;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x00a4;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r4 = (com.google.android.gms.internal.zzpu) r4;	 Catch:{ all -> 0x0227 }
        r4 = r4.zzko();	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x00a4;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r4 = (com.google.android.gms.internal.zzpu) r4;	 Catch:{ all -> 0x0227 }
        r4.zzc(r12);	 Catch:{ all -> 0x0227 }
        goto L_0x00b0;	 Catch:{ all -> 0x0227 }
        r11.zzbyi = r12;	 Catch:{ all -> 0x0227 }
        r4 = r12 instanceof com.google.android.gms.internal.zzpu;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x00b0;	 Catch:{ all -> 0x0227 }
        r4 = r12;	 Catch:{ all -> 0x0227 }
        r4 = (com.google.android.gms.internal.zzpu) r4;	 Catch:{ all -> 0x0227 }
        r4.zzc(r1);	 Catch:{ all -> 0x0227 }
        r4 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        if (r4 != 0) goto L_0x00b6;	 Catch:{ all -> 0x0227 }
        monitor-exit(r0);	 Catch:{ all -> 0x0227 }
        return;	 Catch:{ all -> 0x0227 }
        r4 = com.google.android.gms.internal.zzoi.zzbsn;	 Catch:{ all -> 0x0227 }
        r5 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ all -> 0x0227 }
        r4 = r5.zzd(r4);	 Catch:{ all -> 0x0227 }
        r4 = (java.lang.Boolean) r4;	 Catch:{ all -> 0x0227 }
        r4 = r4.booleanValue();	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x00cd;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        r4.setClickable(r3);	 Catch:{ all -> 0x0227 }
        r4 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        r4.removeAllViews();	 Catch:{ all -> 0x0227 }
        r4 = r12.zzkm();	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0227 }
        r5 = r11.zzbzs;	 Catch:{ all -> 0x0227 }
        if (r5 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0227 }
        r5 = r11.zzbzs;	 Catch:{ all -> 0x0227 }
        r6 = "1098";	 Catch:{ all -> 0x0227 }
        r5 = r5.get(r6);	 Catch:{ all -> 0x0227 }
        r5 = (java.lang.ref.WeakReference) r5;	 Catch:{ all -> 0x0227 }
        if (r5 == 0) goto L_0x00ef;	 Catch:{ all -> 0x0227 }
        r5 = r5.get();	 Catch:{ all -> 0x0227 }
        r5 = (android.view.View) r5;	 Catch:{ all -> 0x0227 }
        goto L_0x00f0;	 Catch:{ all -> 0x0227 }
        r5 = r1;	 Catch:{ all -> 0x0227 }
        r6 = r5 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0227 }
        if (r6 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0227 }
        r5 = (android.view.ViewGroup) r5;	 Catch:{ all -> 0x0227 }
        goto L_0x00f8;	 Catch:{ all -> 0x0227 }
        r5 = r1;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x00fd;	 Catch:{ all -> 0x0227 }
        if (r5 == 0) goto L_0x00fd;	 Catch:{ all -> 0x0227 }
        goto L_0x00fe;	 Catch:{ all -> 0x0227 }
        r2 = 0;	 Catch:{ all -> 0x0227 }
        r4 = r12.zza(r11, r2);	 Catch:{ all -> 0x0227 }
        r11.zzbzt = r4;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbzt;	 Catch:{ all -> 0x0227 }
        r10 = -1;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x0145;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbzs;	 Catch:{ all -> 0x0227 }
        if (r4 == 0) goto L_0x011b;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbzs;	 Catch:{ all -> 0x0227 }
        r6 = "1007";	 Catch:{ all -> 0x0227 }
        r7 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0227 }
        r8 = r11.zzbzt;	 Catch:{ all -> 0x0227 }
        r7.<init>(r8);	 Catch:{ all -> 0x0227 }
        r4.put(r6, r7);	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x0126;	 Catch:{ all -> 0x0227 }
        r5.removeAllViews();	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzt;	 Catch:{ all -> 0x0227 }
        r5.addView(r2);	 Catch:{ all -> 0x0227 }
        goto L_0x0145;	 Catch:{ all -> 0x0227 }
        r2 = r12.getContext();	 Catch:{ all -> 0x0227 }
        r4 = new com.google.android.gms.ads.formats.AdChoicesView;	 Catch:{ all -> 0x0227 }
        r4.<init>(r2);	 Catch:{ all -> 0x0227 }
        r2 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x0227 }
        r2.<init>(r10, r10);	 Catch:{ all -> 0x0227 }
        r4.setLayoutParams(r2);	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzt;	 Catch:{ all -> 0x0227 }
        r4.addView(r2);	 Catch:{ all -> 0x0227 }
        r2 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x0145;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        r2.addView(r4);	 Catch:{ all -> 0x0227 }
        r5 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r6 = r11.zzbzs;	 Catch:{ all -> 0x0227 }
        r7 = 0;	 Catch:{ all -> 0x0227 }
        r4 = r12;	 Catch:{ all -> 0x0227 }
        r8 = r11;	 Catch:{ all -> 0x0227 }
        r9 = r11;	 Catch:{ all -> 0x0227 }
        r4.zza(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzr;	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x0180;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzq;	 Catch:{ all -> 0x0227 }
        if (r2 != 0) goto L_0x016f;	 Catch:{ all -> 0x0227 }
        r2 = new android.view.View;	 Catch:{ all -> 0x0227 }
        r4 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r4 = r4.getContext();	 Catch:{ all -> 0x0227 }
        r2.<init>(r4);	 Catch:{ all -> 0x0227 }
        r11.zzbzq = r2;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzq;	 Catch:{ all -> 0x0227 }
        r4 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x0227 }
        r4.<init>(r10, r3);	 Catch:{ all -> 0x0227 }
        r2.setLayoutParams(r4);	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r3 = r11.zzbzq;	 Catch:{ all -> 0x0227 }
        r3 = r3.getParent();	 Catch:{ all -> 0x0227 }
        if (r2 == r3) goto L_0x0180;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r3 = r11.zzbzq;	 Catch:{ all -> 0x0227 }
        r2.addView(r3);	 Catch:{ all -> 0x0227 }
        r1 = r12.zzkq();	 Catch:{ Exception -> 0x0185 }
        goto L_0x019a;
        r2 = move-exception;
        com.google.android.gms.ads.internal.zzbt.zzen();	 Catch:{ all -> 0x0227 }
        r3 = com.google.android.gms.internal.zzaip.zzrk();	 Catch:{ all -> 0x0227 }
        if (r3 == 0) goto L_0x0195;	 Catch:{ all -> 0x0227 }
        r2 = "Privileged processes cannot create HTML overlays.";	 Catch:{ all -> 0x0227 }
        com.google.android.gms.internal.zzaky.zzcz(r2);	 Catch:{ all -> 0x0227 }
        goto L_0x019a;	 Catch:{ all -> 0x0227 }
        r3 = "Error obtaining overlay.";	 Catch:{ all -> 0x0227 }
        com.google.android.gms.internal.zzaky.zzb(r3, r2);	 Catch:{ all -> 0x0227 }
        if (r1 == 0) goto L_0x01a9;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        if (r2 == 0) goto L_0x01a9;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzamk;	 Catch:{ all -> 0x0227 }
        r1 = r1.getView();	 Catch:{ all -> 0x0227 }
        r2.addView(r1);	 Catch:{ all -> 0x0227 }
        r1 = r11.mLock;	 Catch:{ all -> 0x0227 }
        monitor-enter(r1);	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzs;	 Catch:{ all -> 0x0224 }
        r12.zzh(r2);	 Catch:{ all -> 0x0224 }
        r2 = r11.zzkv();	 Catch:{ all -> 0x0224 }
        r3 = r2 instanceof android.widget.FrameLayout;	 Catch:{ all -> 0x0224 }
        if (r3 != 0) goto L_0x01be;	 Catch:{ all -> 0x0224 }
        r12.zzks();	 Catch:{ all -> 0x0224 }
        monitor-exit(r1);	 Catch:{ all -> 0x0224 }
        goto L_0x01cf;	 Catch:{ all -> 0x0224 }
        r3 = new com.google.android.gms.internal.zzqk;	 Catch:{ all -> 0x0224 }
        r3.<init>(r11, r2);	 Catch:{ all -> 0x0224 }
        r4 = r12 instanceof com.google.android.gms.internal.zzpu;	 Catch:{ all -> 0x0224 }
        if (r4 == 0) goto L_0x01cb;	 Catch:{ all -> 0x0224 }
        r12.zzb(r2, r3);	 Catch:{ all -> 0x0224 }
        goto L_0x01bc;	 Catch:{ all -> 0x0224 }
        r12.zza(r2, r3);	 Catch:{ all -> 0x0224 }
        goto L_0x01bc;
        r12 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r11.zzk(r12);	 Catch:{ all -> 0x0227 }
        r12 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r1 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r12.zzi(r1);	 Catch:{ all -> 0x0227 }
        r12 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r12 = r12 instanceof com.google.android.gms.internal.zzpz;	 Catch:{ all -> 0x0227 }
        if (r12 == 0) goto L_0x0222;	 Catch:{ all -> 0x0227 }
        r12 = r11.zzbyi;	 Catch:{ all -> 0x0227 }
        r12 = (com.google.android.gms.internal.zzpz) r12;	 Catch:{ all -> 0x0227 }
        if (r12 == 0) goto L_0x0222;	 Catch:{ all -> 0x0227 }
        r1 = r12.getContext();	 Catch:{ all -> 0x0227 }
        if (r1 == 0) goto L_0x0222;	 Catch:{ all -> 0x0227 }
        r1 = com.google.android.gms.ads.internal.zzbt.zzfh();	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r2 = r2.getContext();	 Catch:{ all -> 0x0227 }
        r1 = r1.zzs(r2);	 Catch:{ all -> 0x0227 }
        if (r1 == 0) goto L_0x0222;	 Catch:{ all -> 0x0227 }
        r1 = r11.zzbzx;	 Catch:{ all -> 0x0227 }
        r1 = r1.get();	 Catch:{ all -> 0x0227 }
        r1 = (com.google.android.gms.internal.zzgr) r1;	 Catch:{ all -> 0x0227 }
        if (r1 != 0) goto L_0x021b;	 Catch:{ all -> 0x0227 }
        r1 = new com.google.android.gms.internal.zzgr;	 Catch:{ all -> 0x0227 }
        r2 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r2 = r2.getContext();	 Catch:{ all -> 0x0227 }
        r3 = r11.zzbzp;	 Catch:{ all -> 0x0227 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0227 }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0227 }
        r2.<init>(r1);	 Catch:{ all -> 0x0227 }
        r11.zzbzx = r2;	 Catch:{ all -> 0x0227 }
        r12 = r12.zzku();	 Catch:{ all -> 0x0227 }
        r1.zza(r12);	 Catch:{ all -> 0x0227 }
        monitor-exit(r0);	 Catch:{ all -> 0x0227 }
        return;
        r12 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0224 }
        throw r12;	 Catch:{ all -> 0x0227 }
        r12 = move-exception;	 Catch:{ all -> 0x0227 }
        monitor-exit(r0);	 Catch:{ all -> 0x0227 }
        throw r12;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzqj.zza(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    public final IObjectWrapper zzal(String str) {
        synchronized (this.mLock) {
            Object obj = null;
            if (this.zzbzs == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.zzbzs.get(str);
            if (weakReference != null) {
                obj = (View) weakReference.get();
            }
            IObjectWrapper zzz = zzn.zzz(obj);
            return zzz;
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, int i) {
        if (zzbt.zzfh().zzs(this.zzbzp.getContext())) {
            WeakReference weakReference = this.zzbzx;
            if (weakReference != null) {
                zzgr zzgr = (zzgr) weakReference.get();
                if (zzgr != null) {
                    zzgr.zzgm();
                }
            }
        }
        zzkw();
    }

    /* JADX WARNING: Missing block: B:15:0x0036, code skipped:
            return;
     */
    public final void zzb(java.lang.String r4, com.google.android.gms.dynamic.IObjectWrapper r5) {
        /*
        r3 = this;
        r5 = com.google.android.gms.dynamic.zzn.zzy(r5);
        r5 = (android.view.View) r5;
        r0 = r3.mLock;
        monitor-enter(r0);
        r1 = r3.zzbzs;	 Catch:{ all -> 0x0037 }
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x000f:
        if (r5 != 0) goto L_0x0017;
    L_0x0011:
        r5 = r3.zzbzs;	 Catch:{ all -> 0x0037 }
        r5.remove(r4);	 Catch:{ all -> 0x0037 }
        goto L_0x0035;
    L_0x0017:
        r1 = r3.zzbzs;	 Catch:{ all -> 0x0037 }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0037 }
        r2.<init>(r5);	 Catch:{ all -> 0x0037 }
        r1.put(r4, r2);	 Catch:{ all -> 0x0037 }
        r1 = "1098";
        r4 = r1.equals(r4);	 Catch:{ all -> 0x0037 }
        if (r4 == 0) goto L_0x002b;
    L_0x0029:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x002b:
        r5.setOnTouchListener(r3);	 Catch:{ all -> 0x0037 }
        r4 = 1;
        r5.setClickable(r4);	 Catch:{ all -> 0x0037 }
        r5.setOnClickListener(r3);	 Catch:{ all -> 0x0037 }
    L_0x0035:
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        return;
    L_0x0037:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0037 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzqj.zzb(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }
}
