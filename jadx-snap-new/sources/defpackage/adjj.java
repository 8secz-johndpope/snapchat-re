package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.ConditionVariable;
import defpackage.adjk.b;
import defpackage.adjk.c;
import defpackage.admp.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@TargetApi(18)
/* renamed from: adjj */
public final class adjj {
    public final boolean a;
    public final boolean b;
    private String c;
    private final a[] d;
    private final List<b> e;
    private final boolean f;
    private final boolean g;
    private final adgz h;
    private int i = 1;
    private long j = 0;
    private long k = 0;
    private final long l;
    private MediaFormat m = null;
    private MediaFormat n = null;
    private final int o;
    private final List<Integer> p = new ArrayList();
    private final a q;
    private final ConditionVariable r = new ConditionVariable(true);
    private boolean s = false;

    /* renamed from: adjj$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[c.values().length];
        static final /* synthetic */ int[] b = new int[adng.a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0031 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        static {
            /*
            r0 = defpackage.adng.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = defpackage.adjj.c.values();
            r2 = r2.length;
            r2 = new int[r2];
            a = r2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0027 }
            r3 = defpackage.adjj.c.VIDEO;	 Catch:{ NoSuchFieldError -> 0x0027 }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x0027 }
            r2[r3] = r0;	 Catch:{ NoSuchFieldError -> 0x0027 }
        L_0x0027:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = defpackage.adjj.c.AUDIO;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0031 }
            r0[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x003c }
            r1 = defpackage.adjj.c.UNDEFINED;	 Catch:{ NoSuchFieldError -> 0x003c }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x003c }
        L_0x003c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.adjj$1.<clinit>():void");
        }
    }

    /* renamed from: adjj$a */
    public interface a {
        void a(defpackage.admp.a aVar);
    }

    /* renamed from: adjj$b */
    static class b {
        final MediaMuxer a;
        int b;
        adng c;
        int d;
        adng e;
        final long f;
        boolean g = false;

        b(MediaMuxer mediaMuxer, int i, int i2, long j, boolean z, boolean z2) {
            this.a = mediaMuxer;
            this.b = i;
            this.c = new adng(z);
            this.d = i2;
            this.e = new adng(z2);
            this.f = j;
        }
    }

    /* renamed from: adjj$c */
    public enum c {
        UNDEFINED,
        AUDIO,
        VIDEO
    }

    public adjj(a[] aVarArr, boolean z, boolean z2, int i, long j, boolean z3, boolean z4, boolean z5, a aVar) {
        int i2 = i;
        this.d = adjj.a(aVarArr);
        this.e = new ArrayList();
        this.l = j;
        this.q = aVar;
        this.f = z4;
        this.g = z5;
        try {
            this.e.add(new b(adjj.b(this.d[0].a), -1, -1, 0, this.f, this.g));
            this.a = z;
            this.b = z2;
            this.h = new adgz(z3);
            if (i2 == 0 || i2 == 90 || i2 == 180 || i2 == 270) {
                this.o = i2;
                if (!this.a && !this.b) {
                    throw new adkd("video and/or audio must be transcoded");
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Muxer video rotation degree(");
            stringBuilder.append(i);
            stringBuilder.append(") error!");
            throw new adkd(stringBuilder.toString());
        } catch (IOException | RuntimeException e) {
            throw new adkd(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:73:0x0154 in {5, 8, 14, 17, 18, 20, 27, 30, 35, 38, 43, 52, 53, 56, 57, 61, 63, 64, 66, 68, 70, 72} preds:[]
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
    private defpackage.adjj.b a(long r11, boolean r13, android.media.MediaCodec.BufferInfo r14) {
        /*
        r10 = this;
        r0 = 0;
        r1 = 0;
        r2 = r10.d;
        r2 = r2[r1];
        r2 = r2.b;
        r4 = r10.l;
        r2 = r2 - r4;
        r4 = 1;
        r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r5 <= 0) goto L_0x0019;
        r2 = r10.d;
        r2 = r2.length;
        r2 = r2 - r4;
        if (r1 >= r2) goto L_0x0019;
        r1 = r1 + 1;
        goto L_0x0002;
        if (r1 != 0) goto L_0x0024;
        r11 = r10.e;
        r11 = r11.get(r0);
        r11 = (defpackage.adjj.b) r11;
        return r11;
        if (r13 == 0) goto L_0x0062;
        r13 = r10.e;
        r13 = r13.size();
        if (r1 > r13) goto L_0x0051;
        r13 = r10.e;
        r0 = r1 + -1;
        r13 = r13.get(r0);
        r13 = (defpackage.adjj.b) r13;
        r13 = r13.g;
        if (r13 == 0) goto L_0x003e;
        goto L_0x00be;
        r13 = defpackage.adjj.a(r14);
        if (r13 == 0) goto L_0x004f;
        r13 = r10.e;
        r13 = r13.get(r0);
        r13 = (defpackage.adjj.b) r13;
        r13.g = r4;
        goto L_0x00be;
        r1 = r0;
        goto L_0x00be;
        r11 = new adka;
        r12 = defpackage.adka.a.VIDEO_FRAME_SKIP_SEGMENTS;
        r13 = r10.d;
        r13 = r13.length;
        r14 = r10.e;
        r14 = r14.size();
        r11.<init>(r12, r13, r14, r1);
        throw r11;
        r13 = r10.s;
        if (r13 == 0) goto L_0x007b;
        r13 = r10.e;
        r13 = r13.size();
        if (r1 < r13) goto L_0x007b;
        r10.wait();	 Catch:{ InterruptedException -> 0x0072 }
        goto L_0x0066;
        r11 = java.lang.Thread.currentThread();
        r11.interrupt();
        r11 = 0;
        return r11;
        r13 = r10.e;
        r13 = r13.size();
        if (r1 > r13) goto L_0x0143;
        r13 = r10.e;
        r13 = r13.size();
        if (r1 != r13) goto L_0x008e;
        r1 = r1 + -1;
        goto L_0x00be;
        r13 = r10.e;
        r13 = r13.get(r1);
        r13 = (defpackage.adjj.b) r13;
        r13 = r13.f;
        r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r0 >= 0) goto L_0x009d;
        goto L_0x008b;
        r13 = r10.p;
        r14 = r1 + -1;
        r0 = java.lang.Integer.valueOf(r14);
        r13 = r13.contains(r0);
        if (r13 != 0) goto L_0x00be;
        r13 = r10.d;
        r13 = r13[r14];
        r2 = r13.b;
        r4 = r10.l;
        r2 = r2 + r4;
        r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r13 <= 0) goto L_0x00be;
        r10.a(r14);
        r10.b(r14);
        r13 = r10.e;
        r13 = r13.size();
        if (r1 > r13) goto L_0x0125;
        r13 = r10.e;
        r13 = r13.size();
        if (r1 != r13) goto L_0x011c;
        r13 = r10.d;
        r13 = r13[r1];
        r13 = r13.a;
        r3 = defpackage.adjj.b(r13);	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r13 = r10.a;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r14 = -1;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        if (r13 == 0) goto L_0x00e5;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r13 = r10.n;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r13 = r3.addTrack(r13);	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r4 = r13;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        goto L_0x00e6;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r4 = -1;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r13 = r10.b;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        if (r13 == 0) goto L_0x00f2;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r13 = r10.m;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r13 = r3.addTrack(r13);	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r5 = r13;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        goto L_0x00f3;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r5 = -1;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r13 = r10.o;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r3.setOrientationHint(r13);	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r3.start();	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r13 = new adjj$b;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r8 = r10.f;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r9 = r10.g;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r2 = r13;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r6 = r11;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r2.<init>(r3, r4, r5, r6, r8, r9);	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r11 = r10.e;	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r11.add(r13);	 Catch:{ IOException -> 0x0115, RuntimeException -> 0x0113 }
        r11 = r10.s;
        if (r11 == 0) goto L_0x011c;
        r10.notifyAll();
        goto L_0x011c;
        r11 = move-exception;
        goto L_0x0116;
        r11 = move-exception;
        r12 = new adkc;
        r12.<init>(r11);
        throw r12;
        r11 = r10.e;
        r11 = r11.get(r1);
        r11 = (defpackage.adjj.b) r11;
        return r11;
        r11 = new adkc;
        r12 = new java.lang.StringBuilder;
        r13 = "unexpected wrapper size: ";
        r12.<init>(r13);
        r13 = r10.e;
        r12.append(r13);
        r13 = " adjustIdx: ";
        r12.append(r13);
        r12.append(r1);
        r12 = r12.toString();
        r11.<init>(r12);
        throw r11;
        r11 = new adka;
        r12 = defpackage.adka.a.AUDIO_FRAME_WAY_AHEAD_OF_VIDEO;
        r13 = r10.d;
        r13 = r13.length;
        r14 = r10.e;
        r14 = r14.size();
        r11.<init>(r12, r13, r14, r1);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjj.a(long, boolean, android.media.MediaCodec$BufferInfo):adjj$b");
    }

    private adjk a(int i) {
        try {
            ((b) this.e.get(i)).a.stop();
            return c.b;
        } catch (IllegalStateException e) {
            return new adjk.a(e);
        } catch (RuntimeException e2) {
            return new b(e2);
        }
    }

    private static boolean a(BufferInfo bufferInfo) {
        return (bufferInfo.flags & 1) != 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0040 in {10, 12, 13, 15, 17} preds:[]
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
    private static defpackage.admp.a[] a(defpackage.admp.a[] r6) {
        /*
        if (r6 == 0) goto L_0x0038;
        r0 = r6.length;
        if (r0 <= 0) goto L_0x0038;
        r0 = r6.length;
        r0 = r0 + -1;
        r0 = r6[r0];
        r0 = r0.b;
        r2 = -1;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x0030;
        r0 = 0;
        r1 = r6.length;
        r1 = r1 + -2;
        if (r0 >= r1) goto L_0x002f;
        r1 = r6[r0];
        r1 = r1.b;
        r0 = r0 + 1;
        r3 = r6[r0];
        r3 = r3.b;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x0027;
        goto L_0x0013;
        r6 = new adkd;
        r0 = "output file presentation Time not in order";
        r6.<init>(r0);
        throw r6;
        return r6;
        r6 = new adkd;
        r0 = "last output file info should always be -1";
        r6.<init>(r0);
        throw r6;
        r6 = new adkd;
        r0 = "empty output file info";
        r6.<init>(r0);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjj.a(admp$a[]):admp$a[]");
    }

    private static MediaMuxer b(String str) {
        return new MediaMuxer(str, 0);
    }

    private void b(int i) {
        try {
            ((b) this.e.get(i)).a.release();
        } catch (RuntimeException unused) {
        }
        this.p.add(Integer.valueOf(i));
    }

    public final synchronized adgx a() {
        return this.h;
    }

    public final synchronized c a(MediaFormat mediaFormat) {
        c cVar;
        this.h.c();
        if (this.e.size() > 0) {
            b bVar = (b) this.e.get(0);
            if (mediaFormat.containsKey("channel-count")) {
                if (h() || !this.b) {
                    throw new adkc("Audio track has already been added");
                }
                bVar.d = bVar.a.addTrack(mediaFormat);
                cVar = c.AUDIO;
                this.m = mediaFormat;
            } else if (!mediaFormat.containsKey("width")) {
                throw new adkc("Attempted to a track that was neither audio or video");
            } else if (g() || !this.a) {
                throw new adkc("Video track has already been added");
            } else {
                bVar.b = bVar.a.addTrack(mediaFormat);
                cVar = c.VIDEO;
                this.n = mediaFormat;
            }
            if ((g() || !this.a) && (h() || !this.b)) {
                bVar.a.setOrientationHint(this.o);
                bVar.a.start();
                this.i = 2;
                this.r.open();
            }
            this.h.d();
        } else {
            StringBuilder stringBuilder = new StringBuilder("no muxer, muxers size: ");
            stringBuilder.append(this.e.size());
            throw new adkc(stringBuilder.toString());
        }
        return cVar;
    }

    /* JADX WARNING: Missing block: B:36:0x00ab, code skipped:
            return;
     */
    public final void a(defpackage.adjj.c r18, java.nio.ByteBuffer r19, android.media.MediaCodec.BufferInfo r20) {
        /*
        r17 = this;
        r1 = r17;
        r0 = r20;
        r2 = r1.r;
        r2.block();
        monitor-enter(r17);
        r2 = r1.i;	 Catch:{ all -> 0x00ac }
        r3 = 2;
        if (r2 == r3) goto L_0x0011;
    L_0x000f:
        monitor-exit(r17);	 Catch:{ all -> 0x00ac }
        return;
    L_0x0011:
        r4 = r0.presentationTimeUs;	 Catch:{ all -> 0x00ac }
        r6 = r1.j;	 Catch:{ all -> 0x00ac }
        r4 = r4 + r6;
        r2 = defpackage.adjj.c.VIDEO;	 Catch:{ all -> 0x00ac }
        r6 = 0;
        r7 = 1;
        r8 = r18;
        if (r8 != r2) goto L_0x0020;
    L_0x001e:
        r2 = 1;
        goto L_0x0021;
    L_0x0020:
        r2 = 0;
    L_0x0021:
        r2 = r1.a(r4, r2, r0);	 Catch:{ all -> 0x00ac }
        if (r2 == 0) goto L_0x00aa;
    L_0x0027:
        r9 = 0;
        r11 = r2.f;	 Catch:{ all -> 0x00ac }
        r4 = r4 - r11;
        r4 = java.lang.Math.max(r9, r4);	 Catch:{ all -> 0x00ac }
        r9 = defpackage.adjj.1.a;	 Catch:{ all -> 0x00ac }
        r10 = r18.ordinal();	 Catch:{ all -> 0x00ac }
        r9 = r9[r10];	 Catch:{ all -> 0x00ac }
        if (r9 == r7) goto L_0x0045;
    L_0x003a:
        if (r9 == r3) goto L_0x003e;
    L_0x003c:
        r6 = 1;
        goto L_0x004f;
    L_0x003e:
        r9 = r2.e;	 Catch:{ all -> 0x00ac }
        r6 = r9.a(r4, r6);	 Catch:{ all -> 0x00ac }
        goto L_0x004f;
    L_0x0045:
        r6 = r2.c;	 Catch:{ all -> 0x00ac }
        r9 = defpackage.adjj.a(r20);	 Catch:{ all -> 0x00ac }
        r6 = r6.a(r4, r9);	 Catch:{ all -> 0x00ac }
    L_0x004f:
        r9 = defpackage.adjj.1.b;	 Catch:{ all -> 0x00ac }
        r6 = r6 - r7;
        r6 = r9[r6];	 Catch:{ all -> 0x00ac }
        if (r6 == r7) goto L_0x0058;
    L_0x0056:
        if (r6 == r3) goto L_0x00aa;
    L_0x0058:
        r6 = new android.media.MediaCodec$BufferInfo;	 Catch:{ all -> 0x00ac }
        r6.<init>();	 Catch:{ all -> 0x00ac }
        r12 = r0.offset;	 Catch:{ all -> 0x00ac }
        r13 = r0.size;	 Catch:{ all -> 0x00ac }
        r0 = r0.flags;	 Catch:{ all -> 0x00ac }
        r11 = r6;
        r14 = r4;
        r16 = r0;
        r11.set(r12, r13, r14, r16);	 Catch:{ all -> 0x00ac }
        r0 = defpackage.adjj.1.a;	 Catch:{ all -> 0x00ac }
        r9 = r18.ordinal();	 Catch:{ all -> 0x00ac }
        r0 = r0[r9];	 Catch:{ all -> 0x00ac }
        r9 = -1;
        if (r0 == r7) goto L_0x007c;
    L_0x0075:
        if (r0 == r3) goto L_0x0079;
    L_0x0077:
        r0 = -1;
        goto L_0x007e;
    L_0x0079:
        r0 = r2.d;	 Catch:{ all -> 0x00ac }
        goto L_0x007e;
    L_0x007c:
        r0 = r2.b;	 Catch:{ all -> 0x00ac }
    L_0x007e:
        if (r0 == r9) goto L_0x009a;
    L_0x0080:
        r3 = r1.h;	 Catch:{ all -> 0x00ac }
        r3.c();	 Catch:{ all -> 0x00ac }
        r2 = r2.a;	 Catch:{ all -> 0x00ac }
        r3 = r19;
        r2.writeSampleData(r0, r3, r6);	 Catch:{ all -> 0x00ac }
        r2 = r1.k;	 Catch:{ all -> 0x00ac }
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0094;
    L_0x0092:
        r1.k = r4;	 Catch:{ all -> 0x00ac }
    L_0x0094:
        r0 = r1.h;	 Catch:{ all -> 0x00ac }
        r0.d();	 Catch:{ all -> 0x00ac }
        goto L_0x00aa;
    L_0x009a:
        r0 = new adkc;	 Catch:{ all -> 0x00ac }
        r2 = "invalid trackId, track type:";
        r3 = java.lang.String.valueOf(r18);	 Catch:{ all -> 0x00ac }
        r2 = r2.concat(r3);	 Catch:{ all -> 0x00ac }
        r0.<init>(r2);	 Catch:{ all -> 0x00ac }
        throw r0;	 Catch:{ all -> 0x00ac }
    L_0x00aa:
        monitor-exit(r17);	 Catch:{ all -> 0x00ac }
        return;
    L_0x00ac:
        r0 = move-exception;
        monitor-exit(r17);	 Catch:{ all -> 0x00ac }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjj.a(adjj$c, java.nio.ByteBuffer, android.media.MediaCodec$BufferInfo):void");
    }

    public final synchronized void a(String str) {
        this.c = str;
    }

    public final synchronized void b() {
        if (this.i == 1) {
            this.s = true;
            this.r.close();
        }
    }

    public final synchronized boolean c() {
        return this.i != 1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x004c in {11, 12, 13, 19, 20, 22, 25} preds:[]
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
    public final synchronized defpackage.adjk d() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = defpackage.adjk.c.b;	 Catch:{ all -> 0x0049 }
        r1 = r5.i;	 Catch:{ all -> 0x0049 }
        r2 = 2;	 Catch:{ all -> 0x0049 }
        r3 = 0;	 Catch:{ all -> 0x0049 }
        if (r1 != r2) goto L_0x002c;	 Catch:{ all -> 0x0049 }
        r1 = r0;	 Catch:{ all -> 0x0049 }
        r0 = 0;	 Catch:{ all -> 0x0049 }
        r2 = r5.e;	 Catch:{ all -> 0x0049 }
        r2 = r2.size();	 Catch:{ all -> 0x0049 }
        if (r0 >= r2) goto L_0x002b;	 Catch:{ all -> 0x0049 }
        r2 = r5.p;	 Catch:{ all -> 0x0049 }
        r4 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x0049 }
        r2 = r2.contains(r4);	 Catch:{ all -> 0x0049 }
        if (r2 != 0) goto L_0x0028;	 Catch:{ all -> 0x0049 }
        r2 = r5.a(r0);	 Catch:{ all -> 0x0049 }
        r4 = r2 instanceof defpackage.adjk.c;	 Catch:{ all -> 0x0049 }
        if (r4 != 0) goto L_0x0028;	 Catch:{ all -> 0x0049 }
        r1 = r2;	 Catch:{ all -> 0x0049 }
        r0 = r0 + 1;	 Catch:{ all -> 0x0049 }
        goto L_0x000b;	 Catch:{ all -> 0x0049 }
        r0 = r1;	 Catch:{ all -> 0x0049 }
        r1 = 3;	 Catch:{ all -> 0x0049 }
        r5.i = r1;	 Catch:{ all -> 0x0049 }
        r1 = r5.e;	 Catch:{ all -> 0x0049 }
        r1 = r1.size();	 Catch:{ all -> 0x0049 }
        if (r3 >= r1) goto L_0x0047;	 Catch:{ all -> 0x0049 }
        r1 = r5.q;	 Catch:{ all -> 0x0049 }
        if (r1 == 0) goto L_0x0044;	 Catch:{ all -> 0x0049 }
        r1 = r5.q;	 Catch:{ all -> 0x0049 }
        r2 = r5.d;	 Catch:{ all -> 0x0049 }
        r2 = r2[r3];	 Catch:{ all -> 0x0049 }
        r1.a(r2);	 Catch:{ all -> 0x0049 }
        r3 = r3 + 1;
        goto L_0x002f;
        monitor-exit(r5);
        return r0;
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjj.d():adjk");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x002f in {9, 10, 11, 14, 17} preds:[]
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
    public final synchronized void e() {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c();	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0027;	 Catch:{ all -> 0x002c }
        r0 = 0;	 Catch:{ all -> 0x002c }
        r1 = r3.e;	 Catch:{ all -> 0x002c }
        r1 = r1.size();	 Catch:{ all -> 0x002c }
        if (r0 >= r1) goto L_0x0022;	 Catch:{ all -> 0x002c }
        r1 = r3.p;	 Catch:{ all -> 0x002c }
        r2 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x002c }
        r1 = r1.contains(r2);	 Catch:{ all -> 0x002c }
        if (r1 != 0) goto L_0x001f;	 Catch:{ all -> 0x002c }
        r3.b(r0);	 Catch:{ all -> 0x002c }
        r0 = r0 + 1;	 Catch:{ all -> 0x002c }
        goto L_0x0008;	 Catch:{ all -> 0x002c }
        r0 = r3.e;	 Catch:{ all -> 0x002c }
        r0.clear();	 Catch:{ all -> 0x002c }
        r0 = 4;	 Catch:{ all -> 0x002c }
        r3.i = r0;	 Catch:{ all -> 0x002c }
        monitor-exit(r3);
        return;
        r0 = move-exception;
        monitor-exit(r3);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjj.e():void");
    }

    public final synchronized void f() {
        this.j = this.k + 1000;
    }

    public final synchronized boolean g() {
        return ((b) this.e.get(0)).b != -1;
    }

    public final synchronized boolean h() {
        return ((b) this.e.get(0)).d != -1;
    }

    public final synchronized MediaFormat i() {
        h();
        return this.m;
    }

    public final synchronized MediaFormat j() {
        g();
        return this.n;
    }
}
