package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@zzabh
public final class zzpu extends zzpz {
    private Object mLock;
    private zzwr zzbys;
    private zzwu zzbyt;
    private final zzpw zzbyu;
    private zzpv zzbyv;
    private boolean zzbyw;

    private zzpu(Context context, zzpw zzpw, zzcv zzcv, zzpx zzpx) {
        super(context, zzpw, null, zzcv, null, zzpx, null, null);
        this.zzbyw = false;
        this.mLock = new Object();
        this.zzbyu = zzpw;
    }

    public zzpu(Context context, zzpw zzpw, zzcv zzcv, zzwr zzwr, zzpx zzpx) {
        this(context, zzpw, zzcv, zzpx);
        this.zzbys = zzwr;
    }

    public zzpu(Context context, zzpw zzpw, zzcv zzcv, zzwu zzwu, zzpx zzpx) {
        this(context, zzpw, zzcv, zzpx);
        this.zzbyt = zzwu;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x003a in {2, 10, 12, 15} preds:[]
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
    private static java.util.HashMap<java.lang.String, android.view.View> zzd(java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4) {
        /*
        r0 = new java.util.HashMap;
        r0.<init>();
        if (r4 != 0) goto L_0x0008;
        return r0;
        monitor-enter(r4);
        r1 = r4.entrySet();	 Catch:{ all -> 0x0037 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0037 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0037 }
        if (r2 == 0) goto L_0x0035;	 Catch:{ all -> 0x0037 }
        r2 = r1.next();	 Catch:{ all -> 0x0037 }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x0037 }
        r3 = r2.getValue();	 Catch:{ all -> 0x0037 }
        r3 = (java.lang.ref.WeakReference) r3;	 Catch:{ all -> 0x0037 }
        r3 = r3.get();	 Catch:{ all -> 0x0037 }
        r3 = (android.view.View) r3;	 Catch:{ all -> 0x0037 }
        if (r3 == 0) goto L_0x0011;	 Catch:{ all -> 0x0037 }
        r2 = r2.getKey();	 Catch:{ all -> 0x0037 }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x0037 }
        r0.put(r2, r3);	 Catch:{ all -> 0x0037 }
        goto L_0x0011;	 Catch:{ all -> 0x0037 }
        monitor-exit(r4);	 Catch:{ all -> 0x0037 }
        return r0;	 Catch:{ all -> 0x0037 }
        r0 = move-exception;	 Catch:{ all -> 0x0037 }
        monitor-exit(r4);	 Catch:{ all -> 0x0037 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzpu.zzd(java.util.Map):java.util.HashMap");
    }

    public final View zza(OnClickListener onClickListener, boolean z) {
        synchronized (this.mLock) {
            View zza;
            if (this.zzbyv != null) {
                zza = this.zzbyv.zza(onClickListener, z);
                return zza;
            }
            IObjectWrapper zzmw;
            try {
                if (this.zzbys != null) {
                    zzmw = this.zzbys.zzmw();
                } else {
                    if (this.zzbyt != null) {
                        zzmw = this.zzbyt.zzmw();
                    }
                    zzmw = null;
                }
            } catch (RemoteException e) {
                zzaky.zzc("Failed to call getAdChoicesContent", e);
            }
            if (zzmw != null) {
                zza = (View) zzn.zzy(zzmw);
                return zza;
            }
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0050 in {7, 13, 14, 20, 23, 25, 28} preds:[]
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
    public final void zza(android.view.View r3, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r4) {
        /*
        r2 = this;
        r0 = "recordImpression must be called on the main UI thread.";
        com.google.android.gms.common.internal.zzbq.zzgn(r0);
        r0 = r2.mLock;
        monitor-enter(r0);
        r1 = 1;
        r2.zzbza = r1;	 Catch:{ all -> 0x004d }
        r1 = r2.zzbyv;	 Catch:{ all -> 0x004d }
        if (r1 == 0) goto L_0x001a;	 Catch:{ all -> 0x004d }
        r1 = r2.zzbyv;	 Catch:{ all -> 0x004d }
        r1.zza(r3, r4);	 Catch:{ all -> 0x004d }
        r3 = r2.zzbyu;	 Catch:{ all -> 0x004d }
        r3.recordImpression();	 Catch:{ all -> 0x004d }
        goto L_0x004b;
        r3 = r2.zzbys;	 Catch:{ RemoteException -> 0x0045 }
        if (r3 == 0) goto L_0x0031;	 Catch:{ RemoteException -> 0x0045 }
        r3 = r2.zzbys;	 Catch:{ RemoteException -> 0x0045 }
        r3 = r3.getOverrideImpressionRecording();	 Catch:{ RemoteException -> 0x0045 }
        if (r3 != 0) goto L_0x0031;	 Catch:{ RemoteException -> 0x0045 }
        r3 = r2.zzbys;	 Catch:{ RemoteException -> 0x0045 }
        r3.recordImpression();	 Catch:{ RemoteException -> 0x0045 }
        r3 = r2.zzbyu;	 Catch:{ RemoteException -> 0x0045 }
        r3.recordImpression();	 Catch:{ RemoteException -> 0x0045 }
        goto L_0x004b;	 Catch:{ RemoteException -> 0x0045 }
        r3 = r2.zzbyt;	 Catch:{ RemoteException -> 0x0045 }
        if (r3 == 0) goto L_0x004b;	 Catch:{ RemoteException -> 0x0045 }
        r3 = r2.zzbyt;	 Catch:{ RemoteException -> 0x0045 }
        r3 = r3.getOverrideImpressionRecording();	 Catch:{ RemoteException -> 0x0045 }
        if (r3 != 0) goto L_0x004b;	 Catch:{ RemoteException -> 0x0045 }
        r3 = r2.zzbyt;	 Catch:{ RemoteException -> 0x0045 }
        r3.recordImpression();	 Catch:{ RemoteException -> 0x0045 }
        r3 = r2.zzbyu;	 Catch:{ RemoteException -> 0x0045 }
        goto L_0x002d;
        r3 = move-exception;
        r4 = "Failed to call recordImpression";	 Catch:{ all -> 0x004d }
        com.google.android.gms.internal.zzaky.zzc(r4, r3);	 Catch:{ all -> 0x004d }
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        return;	 Catch:{ all -> 0x004d }
        r3 = move-exception;	 Catch:{ all -> 0x004d }
        monitor-exit(r0);	 Catch:{ all -> 0x004d }
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzpu.zza(android.view.View, java.util.Map):void");
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        zzbq.zzgn("performClick must be called on the main UI thread.");
        synchronized (this.mLock) {
            if (this.zzbyv != null) {
                this.zzbyv.zza(view, map, bundle, view2);
                this.zzbyu.onAdClicked();
            } else {
                try {
                    if (!(this.zzbys == null || this.zzbys.getOverrideClickHandling())) {
                        this.zzbys.zzh(zzn.zzz(view));
                        this.zzbyu.onAdClicked();
                    }
                    if (!(this.zzbyt == null || this.zzbyt.getOverrideClickHandling())) {
                        this.zzbyt.zzh(zzn.zzz(view));
                        this.zzbyu.onAdClicked();
                    }
                } catch (RemoteException e) {
                    zzaky.zzc("Failed to call performClick", e);
                }
            }
        }
    }

    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        synchronized (this.mLock) {
            this.zzbyw = true;
            HashMap zzd = zzd(map);
            HashMap zzd2 = zzd(map2);
            try {
                if (this.zzbys != null) {
                    this.zzbys.zzb(zzn.zzz(view), zzn.zzz(zzd), zzn.zzz(zzd2));
                    this.zzbys.zzi(zzn.zzz(view));
                } else if (this.zzbyt != null) {
                    this.zzbyt.zzb(zzn.zzz(view), zzn.zzz(zzd), zzn.zzz(zzd2));
                    this.zzbyt.zzi(zzn.zzz(view));
                }
            } catch (RemoteException e) {
                zzaky.zzc("Failed to call prepareAd", e);
            }
            this.zzbyw = false;
        }
    }

    public final void zzb(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.mLock) {
            try {
                if (this.zzbys != null) {
                    this.zzbys.zzj(zzn.zzz(view));
                } else if (this.zzbyt != null) {
                    this.zzbyt.zzj(zzn.zzz(view));
                }
            } catch (RemoteException e) {
                zzaky.zzc("Failed to call untrackView", e);
            }
        }
    }

    public final void zzc(zzpv zzpv) {
        synchronized (this.mLock) {
            this.zzbyv = zzpv;
        }
    }

    public final boolean zzkm() {
        synchronized (this.mLock) {
            boolean zzkm;
            if (this.zzbyv != null) {
                zzkm = this.zzbyv.zzkm();
                return zzkm;
            }
            zzkm = this.zzbyu.zzcv();
            return zzkm;
        }
    }

    public final boolean zzkn() {
        synchronized (this.mLock) {
            boolean zzkn;
            if (this.zzbyv != null) {
                zzkn = this.zzbyv.zzkn();
                return zzkn;
            }
            zzkn = this.zzbyu.zzcw();
            return zzkn;
        }
    }

    public final boolean zzko() {
        boolean z;
        synchronized (this.mLock) {
            z = this.zzbyw;
        }
        return z;
    }

    public final zzpv zzkp() {
        zzpv zzpv;
        synchronized (this.mLock) {
            zzpv = this.zzbyv;
        }
        return zzpv;
    }

    public final zzaof zzkq() {
        return null;
    }

    public final void zzkr() {
    }

    public final void zzks() {
    }
}
