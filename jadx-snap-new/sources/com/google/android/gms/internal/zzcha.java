package com.google.android.gms.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.internal.zzci;
import com.google.android.gms.common.api.internal.zzck;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.zzx;
import java.util.HashMap;
import java.util.Map;

public final class zzcha {
    private final Context mContext;
    private final zzchr<zzcgw> zzitk;
    private ContentProviderClient zziuc = null;
    private boolean zziud = false;
    private final Map<zzck<LocationListener>, zzchf> zziue = new HashMap();
    private final Map<zzck<Object>, zzche> zziuf = new HashMap();
    private final Map<zzck<LocationCallback>, zzchb> zziug = new HashMap();

    public zzcha(Context context, zzchr<zzcgw> zzchr) {
        this.mContext = context;
        this.zzitk = zzchr;
    }

    private final zzchf zzm(zzci<LocationListener> zzci) {
        Object obj;
        synchronized (this.zziue) {
            obj = (zzchf) this.zziue.get(zzci.zzakx());
            if (obj == null) {
                obj = new zzchf(zzci);
            }
            this.zziue.put(zzci.zzakx(), obj);
        }
        return obj;
    }

    public final Location getLastLocation() {
        this.zzitk.zzalv();
        return ((zzcgw) this.zzitk.zzalw()).zzim(this.mContext.getPackageName());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:45:0x00a4 in {8, 19, 30, 33, 36, 40, 44} preds:[]
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
    public final void removeAllListeners() {
        /*
        r7 = this;
        r0 = r7.zziue;
        monitor-enter(r0);
        r1 = r7.zziue;	 Catch:{ all -> 0x00a1 }
        r1 = r1.values();	 Catch:{ all -> 0x00a1 }
        r1 = r1.iterator();	 Catch:{ all -> 0x00a1 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x00a1 }
        r3 = 0;	 Catch:{ all -> 0x00a1 }
        if (r2 == 0) goto L_0x002c;	 Catch:{ all -> 0x00a1 }
        r2 = r1.next();	 Catch:{ all -> 0x00a1 }
        r2 = (com.google.android.gms.internal.zzchf) r2;	 Catch:{ all -> 0x00a1 }
        if (r2 == 0) goto L_0x000d;	 Catch:{ all -> 0x00a1 }
        r4 = r7.zzitk;	 Catch:{ all -> 0x00a1 }
        r4 = r4.zzalw();	 Catch:{ all -> 0x00a1 }
        r4 = (com.google.android.gms.internal.zzcgw) r4;	 Catch:{ all -> 0x00a1 }
        r2 = com.google.android.gms.internal.zzchn.zza(r2, r3);	 Catch:{ all -> 0x00a1 }
        r4.zza(r2);	 Catch:{ all -> 0x00a1 }
        goto L_0x000d;	 Catch:{ all -> 0x00a1 }
        r1 = r7.zziue;	 Catch:{ all -> 0x00a1 }
        r1.clear();	 Catch:{ all -> 0x00a1 }
        monitor-exit(r0);	 Catch:{ all -> 0x00a1 }
        r1 = r7.zziug;
        monitor-enter(r1);
        r0 = r7.zziug;	 Catch:{ all -> 0x009e }
        r0 = r0.values();	 Catch:{ all -> 0x009e }
        r0 = r0.iterator();	 Catch:{ all -> 0x009e }
        r2 = r0.hasNext();	 Catch:{ all -> 0x009e }
        if (r2 == 0) goto L_0x005d;	 Catch:{ all -> 0x009e }
        r2 = r0.next();	 Catch:{ all -> 0x009e }
        r2 = (com.google.android.gms.internal.zzchb) r2;	 Catch:{ all -> 0x009e }
        if (r2 == 0) goto L_0x003f;	 Catch:{ all -> 0x009e }
        r4 = r7.zzitk;	 Catch:{ all -> 0x009e }
        r4 = r4.zzalw();	 Catch:{ all -> 0x009e }
        r4 = (com.google.android.gms.internal.zzcgw) r4;	 Catch:{ all -> 0x009e }
        r2 = com.google.android.gms.internal.zzchn.zza(r2, r3);	 Catch:{ all -> 0x009e }
        r4.zza(r2);	 Catch:{ all -> 0x009e }
        goto L_0x003f;	 Catch:{ all -> 0x009e }
        r0 = r7.zziug;	 Catch:{ all -> 0x009e }
        r0.clear();	 Catch:{ all -> 0x009e }
        monitor-exit(r1);	 Catch:{ all -> 0x009e }
        r0 = r7.zziuf;
        monitor-enter(r0);
        r1 = r7.zziuf;	 Catch:{ all -> 0x009b }
        r1 = r1.values();	 Catch:{ all -> 0x009b }
        r1 = r1.iterator();	 Catch:{ all -> 0x009b }
        r2 = r1.hasNext();	 Catch:{ all -> 0x009b }
        if (r2 == 0) goto L_0x0094;	 Catch:{ all -> 0x009b }
        r2 = r1.next();	 Catch:{ all -> 0x009b }
        r2 = (com.google.android.gms.internal.zzche) r2;	 Catch:{ all -> 0x009b }
        if (r2 == 0) goto L_0x0070;	 Catch:{ all -> 0x009b }
        r4 = r7.zzitk;	 Catch:{ all -> 0x009b }
        r4 = r4.zzalw();	 Catch:{ all -> 0x009b }
        r4 = (com.google.android.gms.internal.zzcgw) r4;	 Catch:{ all -> 0x009b }
        r5 = new com.google.android.gms.internal.zzcfw;	 Catch:{ all -> 0x009b }
        r6 = 2;	 Catch:{ all -> 0x009b }
        r2 = r2.asBinder();	 Catch:{ all -> 0x009b }
        r5.<init>(r6, r3, r2, r3);	 Catch:{ all -> 0x009b }
        r4.zza(r5);	 Catch:{ all -> 0x009b }
        goto L_0x0070;	 Catch:{ all -> 0x009b }
        r1 = r7.zziuf;	 Catch:{ all -> 0x009b }
        r1.clear();	 Catch:{ all -> 0x009b }
        monitor-exit(r0);	 Catch:{ all -> 0x009b }
        return;	 Catch:{ all -> 0x009b }
        r1 = move-exception;	 Catch:{ all -> 0x009b }
        monitor-exit(r0);	 Catch:{ all -> 0x009b }
        throw r1;
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x009e }
        throw r0;
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a1 }
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcha.removeAllListeners():void");
    }

    public final void zza(zzck<LocationListener> zzck, zzcgr zzcgr) {
        this.zzitk.zzalv();
        zzbq.checkNotNull(zzck, "Invalid null listener key");
        synchronized (this.zziue) {
            zzx zzx = (zzchf) this.zziue.remove(zzck);
            if (zzx != null) {
                zzx.release();
                ((zzcgw) this.zzitk.zzalw()).zza(zzchn.zza(zzx, zzcgr));
            }
        }
    }

    public final void zza(LocationRequest locationRequest, zzci<LocationListener> zzci, zzcgr zzcgr) {
        this.zzitk.zzalv();
        ((zzcgw) this.zzitk.zzalw()).zza(new zzchn(1, zzchl.zza(locationRequest), zzm(zzci).asBinder(), null, null, zzcgr != null ? zzcgr.asBinder() : null));
    }

    public final void zzaxc() {
        if (this.zziud) {
            zzbo(false);
        }
    }

    public final void zzbo(boolean z) {
        this.zzitk.zzalv();
        ((zzcgw) this.zzitk.zzalw()).zzbo(z);
        this.zziud = z;
    }
}
