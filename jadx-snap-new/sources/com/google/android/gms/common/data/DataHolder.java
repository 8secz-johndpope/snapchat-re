package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.internal.zzbgl;
import com.google.android.gms.internal.zzbgo;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends zzbgl implements Closeable {
    public static final Creator<DataHolder> CREATOR = new zzf();
    private static final zza zzgcs = new zze(new String[0], null);
    private boolean mClosed = false;
    private final int zzcc;
    private int zzehz;
    private final String[] zzgcl;
    private Bundle zzgcm;
    private final CursorWindow[] zzgcn;
    private final Bundle zzgco;
    private int[] zzgcp;
    int zzgcq;
    private boolean zzgcr = true;

    public static class zza {
        private final String[] zzgcl;
        private final ArrayList<HashMap<String, Object>> zzgct;
        private final String zzgcu;
        private final HashMap<Object, Integer> zzgcv;
        private boolean zzgcw;
        private String zzgcx;

        private zza(String[] strArr, String str) {
            this.zzgcl = (String[]) zzbq.checkNotNull(strArr);
            this.zzgct = new ArrayList();
            this.zzgcu = str;
            this.zzgcv = new HashMap();
            this.zzgcw = false;
            this.zzgcx = null;
        }

        /* synthetic */ zza(String[] strArr, String str, zze zze) {
            this(strArr, null);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.zzehz = i;
        this.zzgcl = strArr;
        this.zzgcn = cursorWindowArr;
        this.zzcc = i2;
        this.zzgco = bundle;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x001d in {7, 9, 12} preds:[]
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
    public final void close() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.mClosed;	 Catch:{ all -> 0x001a }
        if (r0 != 0) goto L_0x0018;	 Catch:{ all -> 0x001a }
        r0 = 1;	 Catch:{ all -> 0x001a }
        r2.mClosed = r0;	 Catch:{ all -> 0x001a }
        r0 = 0;	 Catch:{ all -> 0x001a }
        r1 = r2.zzgcn;	 Catch:{ all -> 0x001a }
        r1 = r1.length;	 Catch:{ all -> 0x001a }
        if (r0 >= r1) goto L_0x0018;	 Catch:{ all -> 0x001a }
        r1 = r2.zzgcn;	 Catch:{ all -> 0x001a }
        r1 = r1[r0];	 Catch:{ all -> 0x001a }
        r1.close();	 Catch:{ all -> 0x001a }
        r0 = r0 + 1;	 Catch:{ all -> 0x001a }
        goto L_0x0009;	 Catch:{ all -> 0x001a }
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        return;	 Catch:{ all -> 0x001a }
        r0 = move-exception;	 Catch:{ all -> 0x001a }
        monitor-exit(r2);	 Catch:{ all -> 0x001a }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.close():void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            if (this.zzgcr && this.zzgcn.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 178);
                stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                stringBuilder.append(obj);
                stringBuilder.append(")");
                Log.e("DataBuffer", stringBuilder.toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.mClosed;
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbgo.zze(parcel);
        zzbgo.zza(parcel, 1, this.zzgcl, false);
        zzbgo.zza(parcel, 2, this.zzgcn, i, false);
        zzbgo.zzc(parcel, 3, this.zzcc);
        zzbgo.zza(parcel, 4, this.zzgco, false);
        zzbgo.zzc(parcel, MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL, this.zzehz);
        zzbgo.zzai(parcel, zze);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final void zzali() {
        this.zzgcm = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.zzgcl;
            if (i2 >= strArr.length) {
                break;
            }
            this.zzgcm.putInt(strArr[i2], i2);
            i2++;
        }
        this.zzgcp = new int[this.zzgcn.length];
        i2 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zzgcn;
            if (i < cursorWindowArr.length) {
                this.zzgcp[i] = i2;
                i2 += this.zzgcn[i].getNumRows() - (i2 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.zzgcq = i2;
                return;
            }
        }
    }
}
