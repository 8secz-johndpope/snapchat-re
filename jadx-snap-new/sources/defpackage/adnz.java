package defpackage;

import android.media.MediaExtractor;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.IOException;

/* renamed from: adnz */
public final class adnz {
    private final adnp a;
    private MediaExtractor b;

    public adnz(File file) {
        this(file, adnp.a);
    }

    private adnz(File file, adnp adnp) {
        Preconditions.checkArgument(file.exists());
        this.a = adnp;
        try {
            this.b = new MediaExtractor();
            this.b.setDataSource(file.toString());
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            adkb adkb = new adkb("Native exception while setting up extractor: ".concat(String.valueOf(th)), th);
        }
    }

    private boolean c() {
        return this.b == null;
    }

    public final void a() {
        if (!c()) {
            try {
                this.b.release();
            } catch (Throwable th) {
                adni.e("Native exception while releasing extractor: %s", th.getMessage());
            } finally {
                this.b = null;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x006a in {5, 6, 7, 10, 13, 16} preds:[]
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
    public final android.media.MediaFormat b() {
        /*
        r7 = this;
        r0 = r7.c();
        r1 = 1;
        r0 = r0 ^ r1;
        com.google.common.base.Preconditions.checkState(r0);
        r0 = r7.b;
        r2 = 0;
        r3 = 0;
        r4 = r0.getTrackCount();
        r5 = -1;
        if (r3 >= r4) goto L_0x004d;
        r4 = 2;
        r4 = new java.lang.Object[r4];
        r6 = java.lang.Integer.valueOf(r3);
        r4[r2] = r6;
        r6 = r0.getTrackFormat(r3);
        r6 = defpackage.adnp.a(r6);
        r4[r1] = r6;
        r6 = "format for track:%d is %s";
        defpackage.adni.c(r6, r4);
        r4 = r0.getTrackFormat(r3);
        r4 = defpackage.adnp.a(r4);
        r6 = "audio/";
        r4 = r4.startsWith(r6);
        if (r4 == 0) goto L_0x004a;
        r0 = new java.lang.Object[r1];
        r1 = java.lang.Integer.valueOf(r3);
        r0[r2] = r1;
        r1 = "Selecting track:%d";
        defpackage.adni.c(r1, r0);
        goto L_0x004e;
        r3 = r3 + 1;
        goto L_0x000d;
        r3 = -1;
        if (r3 != r5) goto L_0x0052;
        r0 = 0;
        return r0;
        r0 = r7.b;	 Catch:{ Throwable -> 0x0059 }
        r0 = r0.getTrackFormat(r3);	 Catch:{ Throwable -> 0x0059 }
        return r0;
        r0 = move-exception;
        r1 = new adkb;
        r2 = java.lang.String.valueOf(r0);
        r3 = "Native exception while getting audio track format from extractor: ";
        r2 = r3.concat(r2);
        r1.<init>(r2, r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adnz.b():android.media.MediaFormat");
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        try {
            if (!c()) {
                a();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }
}
