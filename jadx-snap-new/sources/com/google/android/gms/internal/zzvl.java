package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.gmsg.zzae;
import com.google.android.gms.ads.internal.js.zzaa;

final class zzvl implements zzae {
    private /* synthetic */ zzvi zzcgy;
    private final zzaa zzcgz;
    private final zzamd zzcha;

    public zzvl(zzvi zzvi, zzaa zzaa, zzamd zzamd) {
        this.zzcgy = zzvi;
        this.zzcgz = zzaa;
        this.zzcha = zzamd;
    }

    public final void zzau(String str) {
        if (str == null) {
            try {
                this.zzcha.setException(new zzuw());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.zzcgz.release();
            }
        } else {
            this.zzcha.setException(new zzuw(str));
        }
        this.zzcgz.release();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:13:0x0024 in {1, 3, 4, 10, 12} preds:[]
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
    public final void zzd(org.json.JSONObject r3) {
        /*
        r2 = this;
        r0 = r2.zzcha;	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r1 = r2.zzcgy;	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r1 = r1.zzcgs;	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r3 = r1.zze(r3);	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r0.set(r3);	 Catch:{ IllegalStateException -> 0x000f, JSONException -> 0x0017 }
        r3 = r2.zzcgz;
        r3.release();
        return;
        r3 = move-exception;
        goto L_0x001e;
        r3 = move-exception;
        r0 = r2.zzcha;	 Catch:{ all -> 0x0015 }
        r0.set(r3);	 Catch:{ all -> 0x0015 }
        goto L_0x000f;
        r0 = r2.zzcgz;
        r0.release();
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzvl.zzd(org.json.JSONObject):void");
    }
}
