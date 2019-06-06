package com.google.android.gms.vision.face;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.face.internal.client.zza;
import com.google.android.gms.vision.zzc;

public final class FaceDetector extends Detector<Face> {
    private boolean mIsActive;
    private final Object mLock;
    private final zzc zzlha;
    private final zza zzlhb;

    public static class Builder {
        private final Context mContext;
        private int zzgpd = 0;
        private int zzlhc = 0;
        private boolean zzlhd = false;
        private int zzlhe = 0;
        private boolean zzlhf = true;
        private float zzlhg = -1.0f;

        public Builder(Context context) {
            this.mContext = context;
        }

        public FaceDetector build() {
            com.google.android.gms.vision.face.internal.client.zzc zzc = new com.google.android.gms.vision.face.internal.client.zzc();
            zzc.mode = this.zzgpd;
            zzc.zzlhp = this.zzlhc;
            zzc.zzlhq = this.zzlhe;
            zzc.zzlhr = this.zzlhd;
            zzc.zzlhs = this.zzlhf;
            zzc.zzlht = this.zzlhg;
            return new FaceDetector(new zza(this.mContext, zzc), null);
        }

        public Builder setClassificationType(int i) {
            if (i == 0 || i == 1) {
                this.zzlhe = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Invalid classification type: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder setLandmarkType(int i) {
            if (i == 0 || i == 1) {
                this.zzlhc = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(34);
            stringBuilder.append("Invalid landmark type: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder setMode(int i) {
            if (i == 0 || i == 1) {
                this.zzgpd = i;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder(25);
            stringBuilder.append("Invalid mode: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public Builder setTrackingEnabled(boolean z) {
            this.zzlhf = z;
            return this;
        }
    }

    private FaceDetector() {
        this.zzlha = new zzc();
        this.mLock = new Object();
        this.mIsActive = true;
        throw new IllegalStateException("Default constructor called");
    }

    private FaceDetector(zza zza) {
        this.zzlha = new zzc();
        this.mLock = new Object();
        this.mIsActive = true;
        this.zzlhb = zza;
    }

    /* synthetic */ FaceDetector(zza zza, zza zza2) {
        this(zza);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:23:0x0066 in {12, 13, 14, 17, 20, 22} preds:[]
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
    public final android.util.SparseArray<com.google.android.gms.vision.face.Face> detect(com.google.android.gms.vision.Frame r9) {
        /*
        r8 = this;
        if (r9 == 0) goto L_0x005e;
        r0 = r9.getGrayscaleImageData();
        r1 = r8.mLock;
        monitor-enter(r1);
        r2 = r8.mIsActive;	 Catch:{ all -> 0x005b }
        if (r2 == 0) goto L_0x0053;	 Catch:{ all -> 0x005b }
        r2 = r8.zzlhb;	 Catch:{ all -> 0x005b }
        r9 = com.google.android.gms.internal.zzdld.zzc(r9);	 Catch:{ all -> 0x005b }
        r9 = r2.zzb(r0, r9);	 Catch:{ all -> 0x005b }
        monitor-exit(r1);	 Catch:{ all -> 0x005b }
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = new android.util.SparseArray;
        r2 = r9.length;
        r1.<init>(r2);
        r2 = r9.length;
        r3 = 0;
        r4 = 0;
        if (r3 >= r2) goto L_0x0052;
        r5 = r9[r3];
        r6 = r5.getId();
        r4 = java.lang.Math.max(r4, r6);
        r7 = java.lang.Integer.valueOf(r6);
        r7 = r0.contains(r7);
        if (r7 == 0) goto L_0x003f;
        r6 = r4 + 1;
        r4 = r6;
        r7 = java.lang.Integer.valueOf(r6);
        r0.add(r7);
        r7 = r8.zzlha;
        r6 = r7.zzfm(r6);
        r1.append(r6, r5);
        r3 = r3 + 1;
        goto L_0x0026;
        return r1;
        r9 = new java.lang.RuntimeException;	 Catch:{ all -> 0x005b }
        r0 = "Cannot use detector after release()";	 Catch:{ all -> 0x005b }
        r9.<init>(r0);	 Catch:{ all -> 0x005b }
        throw r9;	 Catch:{ all -> 0x005b }
        r9 = move-exception;	 Catch:{ all -> 0x005b }
        monitor-exit(r1);	 Catch:{ all -> 0x005b }
        throw r9;
        r9 = new java.lang.IllegalArgumentException;
        r0 = "No frame supplied.";
        r9.<init>(r0);
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.FaceDetector.detect(com.google.android.gms.vision.Frame):android.util.SparseArray");
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            synchronized (this.mLock) {
                if (this.mIsActive) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    release();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final boolean isOperational() {
        return this.zzlhb.isOperational();
    }

    public final void release() {
        super.release();
        synchronized (this.mLock) {
            if (this.mIsActive) {
                this.zzlhb.zzbln();
                this.mIsActive = false;
                return;
            }
        }
    }
}
