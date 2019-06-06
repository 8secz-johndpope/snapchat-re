package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import defpackage.kox.a;
import java.io.FileDescriptor;
import java.io.IOException;

/* renamed from: adml */
public final class adml {
    private MediaExtractor a = null;
    private MediaCodec b = null;
    private Surface c = null;
    private FileDescriptor d = null;
    private int e = -1;
    private long f;
    private boolean g = false;
    private boolean h = false;
    private final kpc i;
    private final idd j;
    private kom k;

    /* renamed from: adml$a */
    static class a {
        public int a = -1;
        public final BufferInfo b = new BufferInfo();
        public boolean c = false;

        a() {
        }
    }

    public adml(FileDescriptor fileDescriptor, Surface surface, kpc kpc, idd idd) {
        this.d = fileDescriptor;
        this.c = surface;
        this.i = kpc;
        this.j = idd;
    }

    private void a(Exception exception, String str) {
        a();
        if (exception != null) {
            throw new adkd(str, exception);
        }
        throw new adkd(str);
    }

    private boolean a(a aVar, long j) {
        if (aVar.a < 0) {
            return false;
        }
        this.f = aVar.b.presentationTimeUs;
        if (aVar.a >= 0 && aVar.b.presentationTimeUs < j) {
            this.b.releaseOutputBuffer(aVar.a, false);
            return false;
        } else if (aVar.a < 0) {
            return false;
        } else {
            this.b.releaseOutputBuffer(aVar.a, true);
            return true;
        }
    }

    public final void a() {
        MediaCodec mediaCodec = this.b;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            this.b.release();
            this.b = null;
        }
        MediaExtractor mediaExtractor = this.a;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.a = null;
        }
        this.i.a(this.k);
        this.k = null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:73:0x0102 in {4, 14, 15, 22, 23, 26, 27, 30, 31, 35, 36, 38, 41, 42, 43, 45, 48, 49, 53, 62, 63, 64, 65, 69, 70, 72} preds:[]
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
    final boolean a(long r21) {
        /*
        r20 = this;
        r1 = r20;
        r2 = r21;
        r4 = r1.f;
        r0 = 2;
        r6 = 0;
        r7 = 1;
        r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r8 < 0) goto L_0x00e6;
        r4 = r1.h;
        if (r4 == 0) goto L_0x0012;
        return r6;
        r4 = r1.a;
        r4.seekTo(r2, r0);
        r0 = new adml$a;
        r0.<init>();
        r4 = new adml$a;
        r4.<init>();
        r5 = r0.c;
        r8 = 4;
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r5 != 0) goto L_0x00b2;
        r5 = r1.b;	 Catch:{ IllegalArgumentException -> 0x00ab }
        if (r5 == 0) goto L_0x00b2;
        r5 = defpackage.abnl.e;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r5 == 0) goto L_0x0032;	 Catch:{ IllegalStateException -> 0x00aa }
        r5 = 0;	 Catch:{ IllegalStateException -> 0x00aa }
        goto L_0x0038;	 Catch:{ IllegalStateException -> 0x00aa }
        r5 = r1.b;	 Catch:{ IllegalStateException -> 0x00aa }
        r5 = r5.getInputBuffers();	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r1.g;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r11 != 0) goto L_0x00b2;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r1.b;	 Catch:{ IllegalStateException -> 0x00aa }
        r13 = r11.dequeueInputBuffer(r9);	 Catch:{ IllegalStateException -> 0x00aa }
        if (r13 < 0) goto L_0x0038;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = defpackage.abnl.e;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r11 == 0) goto L_0x004f;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r1.b;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r11.getInputBuffer(r13);	 Catch:{ IllegalStateException -> 0x00aa }
        goto L_0x0051;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r5[r13];	 Catch:{ IllegalStateException -> 0x00aa }
        r12 = r1.a;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r12.readSampleData(r11, r6);	 Catch:{ IllegalStateException -> 0x00aa }
        r12 = r1.a;	 Catch:{ IllegalStateException -> 0x00aa }
        r16 = r12.getSampleTime();	 Catch:{ IllegalStateException -> 0x00aa }
        r12 = r1.a;	 Catch:{ IllegalStateException -> 0x00aa }
        r12 = r12.getSampleFlags();	 Catch:{ IllegalStateException -> 0x00aa }
        r14 = r1.a;	 Catch:{ IllegalStateException -> 0x00aa }
        r14 = r14.advance();	 Catch:{ IllegalStateException -> 0x00aa }
        r14 = r14 ^ r7;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r11 > 0) goto L_0x006e;	 Catch:{ IllegalStateException -> 0x00aa }
        r15 = 1;	 Catch:{ IllegalStateException -> 0x00aa }
        goto L_0x006f;	 Catch:{ IllegalStateException -> 0x00aa }
        r15 = 0;	 Catch:{ IllegalStateException -> 0x00aa }
        r14 = r14 | r15;	 Catch:{ IllegalStateException -> 0x00aa }
        r15 = r12 & 4;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r15 <= 0) goto L_0x0076;	 Catch:{ IllegalStateException -> 0x00aa }
        r15 = 1;	 Catch:{ IllegalStateException -> 0x00aa }
        goto L_0x0077;	 Catch:{ IllegalStateException -> 0x00aa }
        r15 = 0;	 Catch:{ IllegalStateException -> 0x00aa }
        r19 = r14 | r15;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r19 == 0) goto L_0x007f;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r11 >= 0) goto L_0x007f;	 Catch:{ IllegalStateException -> 0x00aa }
        r15 = 0;	 Catch:{ IllegalStateException -> 0x00aa }
        goto L_0x0080;	 Catch:{ IllegalStateException -> 0x00aa }
        r15 = r11;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r15 > 0) goto L_0x0084;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r19 == 0) goto L_0x0094;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r1.b;	 Catch:{ IllegalStateException -> 0x00aa }
        r14 = 0;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r19 == 0) goto L_0x008c;	 Catch:{ IllegalStateException -> 0x00aa }
        r18 = 4;	 Catch:{ IllegalStateException -> 0x00aa }
        goto L_0x008e;	 Catch:{ IllegalStateException -> 0x00aa }
        r18 = 0;	 Catch:{ IllegalStateException -> 0x00aa }
        r18 = r12 | r18;	 Catch:{ IllegalStateException -> 0x00aa }
        r12 = r11;	 Catch:{ IllegalStateException -> 0x00aa }
        r12.queueInputBuffer(r13, r14, r15, r16, r18);	 Catch:{ IllegalStateException -> 0x00aa }
        if (r19 == 0) goto L_0x009b;	 Catch:{ IllegalStateException -> 0x00aa }
        r0.c = r7;	 Catch:{ IllegalStateException -> 0x00aa }
        r1.g = r7;	 Catch:{ IllegalStateException -> 0x00aa }
        goto L_0x00b2;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r1.b;	 Catch:{ IllegalStateException -> 0x00aa }
        r12 = r0.b;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r11.dequeueOutputBuffer(r12, r9);	 Catch:{ IllegalStateException -> 0x00aa }
        r0.a = r11;	 Catch:{ IllegalStateException -> 0x00aa }
        r11 = r0.a;	 Catch:{ IllegalStateException -> 0x00aa }
        if (r11 < 0) goto L_0x0038;
        goto L_0x00b2;
        goto L_0x00b2;
        r0 = move-exception;
        r2 = new admd;
        r2.<init>(r0);
        throw r2;
        r5 = r0.a;
        if (r5 >= 0) goto L_0x00d4;
        r5 = r1.b;	 Catch:{ IllegalStateException -> 0x00cf }
        r11 = r4.b;	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = r5.dequeueOutputBuffer(r11, r9);	 Catch:{ IllegalStateException -> 0x00cf }
        r4.a = r5;	 Catch:{ IllegalStateException -> 0x00cf }
        r5 = r4.a;
        if (r5 < 0) goto L_0x00cf;
        r5 = r4.b;
        r5 = r5.flags;
        r5 = r5 & r8;
        if (r5 == 0) goto L_0x00cf;
        r4.c = r7;
        r1.h = r7;
        r5 = r1.a(r4, r2);
        goto L_0x00d8;
        r5 = r1.a(r0, r2);
        if (r5 != 0) goto L_0x00e5;
        r8 = r4.c;
        if (r8 != 0) goto L_0x00e5;
        r5 = -1;
        r0.a = r5;
        r4.a = r5;
        goto L_0x0021;
        return r5;
        r4 = new admd;
        r0 = new java.lang.Object[r0];
        r2 = java.lang.Long.valueOf(r21);
        r0[r6] = r2;
        r2 = r1.f;
        r2 = java.lang.Long.valueOf(r2);
        r0[r7] = r2;
        r2 = "Unsupported seek back with %d, currentTimeUs %d";
        r0 = java.lang.String.format(r2, r0);
        r4.<init>(r0);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adml.a(long):boolean");
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        String str;
        this.a = new MediaExtractor();
        try {
            this.a.setDataSource(this.d);
        } catch (IOException e) {
            a(e, "Setting data source of media extractor failed.");
        }
        int trackCount = this.a.getTrackCount();
        int i = 0;
        while (true) {
            str = "mime";
            if (i >= trackCount) {
                break;
            } else if (this.a.getTrackFormat(i).getString(str).startsWith("video/")) {
                this.e = i;
                break;
            } else {
                i++;
            }
        }
        if (this.e < 0) {
            a(null, "Video track index < 0");
        }
        this.a.selectTrack(this.e);
        MediaFormat trackFormat = this.a.getTrackFormat(this.e);
        this.k = this.i.b(new kor(koj.THUMBNAIL_GENERATION, this.j, new kox(a.VIDEO_DECODER, trackFormat.getInteger("width"), trackFormat.getInteger("height"))));
        try {
            this.b = MediaCodec.createDecoderByType(trackFormat.getString(str));
            this.f = 0;
            this.g = false;
            this.h = false;
            this.b.configure(trackFormat, this.c, null, 0);
            this.b.setVideoScalingMode(2);
            this.b.start();
        } catch (IOException e2) {
            a(e2, "Creating media codec instance failed");
        } catch (IllegalStateException e22) {
            a(e22, "Setting up media codec failed");
        } catch (IllegalArgumentException e3) {
            a(e3, String.format("Setting up media codec failed with illegal argument: %s", new Object[]{trackFormat.toString()}));
        }
    }
}
