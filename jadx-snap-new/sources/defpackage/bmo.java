package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import defpackage.bmg.a;
import defpackage.bmg.a.1;
import defpackage.bmg.a.2;
import defpackage.bmg.a.3;
import defpackage.bmg.a.4;
import defpackage.bmg.a.6;
import defpackage.bmh.b;
import defpackage.bmh.c;
import defpackage.bmh.d;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: bmo */
public final class bmo extends bql implements byy {
    final a h;
    boolean i;
    private final Context m;
    private final bmh n;
    private int o;
    private boolean p;
    private boolean q;
    private MediaFormat r;
    private int s;
    private int t;
    private int u;
    private int v;
    private long w;
    private boolean x;

    /* renamed from: bmo$a */
    final class a implements c {
        private a() {
        }

        /* synthetic */ a(bmo bmo, byte b) {
            this();
        }

        public final void a() {
            bmo.this.i = true;
        }

        public final void a(int i) {
            defpackage.bmg.a aVar = bmo.this.h;
            if (aVar.b != null) {
                aVar.a.post(new 6(i));
            }
        }

        public final void a(int i, long j, long j2) {
            defpackage.bmg.a aVar = bmo.this.h;
            if (aVar.b != null) {
                aVar.a.post(new 4(i, j, j2));
            }
        }
    }

    public bmo(Context context, bqm bqm) {
        this(context, bqm, (byte) 0);
    }

    private bmo(Context context, bqm bqm, byte b) {
        this(context, bqm, 0);
    }

    private bmo(Context context, bqm bqm, char c) {
        this(context, bqm, null, false, null, null, null, new bmf[0]);
    }

    public bmo(Context context, bqm bqm, bnd<bnf> bnd, boolean z, Handler handler, bmg bmg, bme bme, bmf... bmfArr) {
        bme bme2 = bme;
        this(context, bqm, bnd, false, handler, bmg, new bml(bme, bmfArr));
    }

    private bmo(Context context, bqm bqm, bnd<bnf> bnd, boolean z, Handler handler, bmg bmg, bmh bmh) {
        super(1, bqm, bnd, z);
        this.m = context.getApplicationContext();
        this.n = bmh;
        this.h = new a(handler, bmg);
        bmh.a(new a(this, (byte) 0));
    }

    private boolean a(String str) {
        int h = byz.h(str);
        return h != 0 && this.n.a(h);
    }

    private void w() {
        long a = this.n.a(r());
        if (a != Long.MIN_VALUE) {
            if (!this.i) {
                a = Math.max(this.w, a);
            }
            this.w = a;
            this.i = false;
        }
    }

    public final int a(bqk bqk, blg blg, blg blg2) {
        return 0;
    }

    /* JADX WARNING: Missing block: B:53:0x00a5, code skipped:
            if (r13 == null) goto L_0x0181;
     */
    /* JADX WARNING: Missing block: B:101:0x017e, code skipped:
            if (r13 == null) goto L_0x0181;
     */
    public final int a(defpackage.bqm r13, defpackage.bnd<defpackage.bnf> r14, defpackage.blg r15) {
        /*
        r12 = this;
        r0 = r15.f;
        r1 = defpackage.byz.a(r0);
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r1 = defpackage.bzo.a;
        r3 = 21;
        if (r1 < r3) goto L_0x0013;
    L_0x0010:
        r1 = 32;
        goto L_0x0014;
    L_0x0013:
        r1 = 0;
    L_0x0014:
        r4 = r15.i;
        r14 = defpackage.bkv.a(r14, r4);
        r4 = 4;
        if (r14 == 0) goto L_0x002d;
    L_0x001d:
        r5 = r12.a(r0);
        if (r5 == 0) goto L_0x002d;
    L_0x0023:
        r5 = r13.a();
        if (r5 == 0) goto L_0x002d;
    L_0x0029:
        r13 = r1 | 8;
        r13 = r13 | r4;
        return r13;
    L_0x002d:
        r5 = "audio/raw";
        r6 = r5.equals(r0);
        r7 = 1;
        if (r6 == 0) goto L_0x0040;
    L_0x0036:
        r6 = r12.n;
        r8 = r15.u;
        r6 = r6.a(r8);
        if (r6 == 0) goto L_0x0049;
    L_0x0040:
        r6 = r12.n;
        r8 = 2;
        r6 = r6.a(r8);
        if (r6 != 0) goto L_0x004a;
    L_0x0049:
        return r7;
    L_0x004a:
        r6 = r15.i;
        if (r6 == 0) goto L_0x005e;
    L_0x004e:
        r9 = 0;
        r10 = 0;
    L_0x0050:
        r11 = r6.c;
        if (r9 >= r11) goto L_0x005f;
    L_0x0054:
        r11 = r6.a;
        r11 = r11[r9];
        r11 = r11.d;
        r10 = r10 | r11;
        r9 = r9 + 1;
        goto L_0x0050;
    L_0x005e:
        r10 = 0;
    L_0x005f:
        r6 = r13.a(r0, r10);
        if (r6 != 0) goto L_0x006f;
    L_0x0065:
        if (r10 == 0) goto L_0x006e;
    L_0x0067:
        r13 = r13.a(r0, r2);
        if (r13 == 0) goto L_0x006e;
    L_0x006d:
        return r8;
    L_0x006e:
        return r7;
    L_0x006f:
        if (r14 != 0) goto L_0x0072;
    L_0x0071:
        return r8;
    L_0x0072:
        r13 = defpackage.bzo.a;
        if (r13 < r3) goto L_0x0180;
    L_0x0076:
        r13 = r15.t;
        r14 = -1;
        if (r13 == r14) goto L_0x00a7;
    L_0x007b:
        r13 = r15.t;
        r0 = r6.c;
        if (r0 != 0) goto L_0x0088;
    L_0x0081:
        r13 = "sampleRate.caps";
    L_0x0083:
        r6.a(r13);
        r13 = 0;
        goto L_0x00a5;
    L_0x0088:
        r0 = r6.c;
        r0 = r0.getAudioCapabilities();
        if (r0 != 0) goto L_0x0093;
    L_0x0090:
        r13 = "sampleRate.aCaps";
        goto L_0x0083;
    L_0x0093:
        r0 = r0.isSampleRateSupported(r13);
        if (r0 != 0) goto L_0x00a4;
    L_0x0099:
        r13 = java.lang.String.valueOf(r13);
        r0 = "sampleRate.support, ";
        r13 = r0.concat(r13);
        goto L_0x0083;
    L_0x00a4:
        r13 = 1;
    L_0x00a5:
        if (r13 == 0) goto L_0x0181;
    L_0x00a7:
        r13 = r15.s;
        if (r13 == r14) goto L_0x0180;
    L_0x00ab:
        r13 = r15.s;
        r14 = r6.c;
        if (r14 != 0) goto L_0x00b9;
    L_0x00b1:
        r13 = "channelCount.caps";
    L_0x00b3:
        r6.a(r13);
        r13 = 0;
        goto L_0x017e;
    L_0x00b9:
        r14 = r6.c;
        r14 = r14.getAudioCapabilities();
        if (r14 != 0) goto L_0x00c4;
    L_0x00c1:
        r13 = "channelCount.aCaps";
        goto L_0x00b3;
    L_0x00c4:
        r15 = r6.a;
        r0 = r6.b;
        r14 = r14.getMaxInputChannelCount();
        if (r14 > r7) goto L_0x016f;
    L_0x00ce:
        r3 = defpackage.bzo.a;
        r8 = 26;
        if (r3 < r8) goto L_0x00d8;
    L_0x00d4:
        if (r14 <= 0) goto L_0x00d8;
    L_0x00d6:
        goto L_0x016f;
    L_0x00d8:
        r3 = "audio/mpeg";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x00e0:
        r3 = "audio/3gpp";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x00e8:
        r3 = "audio/amr-wb";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x00f0:
        r3 = "audio/mp4a-latm";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x00f8:
        r3 = "audio/vorbis";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x0100:
        r3 = "audio/opus";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x0108:
        r3 = r5.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x010e:
        r3 = "audio/flac";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x0116:
        r3 = "audio/g711-alaw";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x011e:
        r3 = "audio/g711-mlaw";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x016f;
    L_0x0126:
        r3 = "audio/gsm";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x012f;
    L_0x012e:
        goto L_0x016f;
    L_0x012f:
        r3 = "audio/ac3";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0139;
    L_0x0137:
        r0 = 6;
        goto L_0x0146;
    L_0x0139:
        r3 = "audio/eac3";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0144;
    L_0x0141:
        r0 = 16;
        goto L_0x0146;
    L_0x0144:
        r0 = 30;
    L_0x0146:
        r3 = new java.lang.StringBuilder;
        r5 = "AssumedMaxChannelAdjustment: ";
        r3.<init>(r5);
        r3.append(r15);
        r15 = ", [";
        r3.append(r15);
        r3.append(r14);
        r14 = " to ";
        r3.append(r14);
        r3.append(r0);
        r14 = "]";
        r3.append(r14);
        r14 = r3.toString();
        r15 = "MediaCodecInfo";
        android.util.Log.w(r15, r14);
        r14 = r0;
    L_0x016f:
        if (r14 >= r13) goto L_0x017d;
    L_0x0171:
        r13 = java.lang.String.valueOf(r13);
        r14 = "channelCount.support, ";
        r13 = r14.concat(r13);
        goto L_0x00b3;
    L_0x017d:
        r13 = 1;
    L_0x017e:
        if (r13 == 0) goto L_0x0181;
    L_0x0180:
        r2 = 1;
    L_0x0181:
        if (r2 == 0) goto L_0x0184;
    L_0x0183:
        goto L_0x0185;
    L_0x0184:
        r4 = 3;
    L_0x0185:
        r13 = r1 | 8;
        r13 = r13 | r4;
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmo.a(bqm, bnd, blg):int");
    }

    public final blp a(blp blp) {
        return this.n.a(blp);
    }

    public final bqk a(bqm bqm, blg blg, boolean z) {
        if (a(blg.f)) {
            bqk a = bqm.a();
            if (a != null) {
                return a;
            }
        }
        return super.a(bqm, blg, z);
    }

    public final void a(int i, Object obj) {
        if (i == 2) {
            this.n.a(((Float) obj).floatValue());
        } else if (i != 3) {
            super.a(i, obj);
        } else {
            this.n.a((bmd) obj);
        }
    }

    public final void a(long j, boolean z) {
        super.a(j, z);
        this.n.i();
        this.w = j;
        this.x = true;
        this.i = true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x004b in {2, 3, 13, 14, 18, 21} preds:[]
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
    public final void a(android.media.MediaCodec r8, android.media.MediaFormat r9) {
        /*
        r7 = this;
        r8 = r7.r;
        if (r8 == 0) goto L_0x0011;
        r9 = "mime";
        r8 = r8.getString(r9);
        r8 = defpackage.byz.h(r8);
        r9 = r7.r;
        goto L_0x0013;
        r8 = r7.s;
        r1 = r8;
        r8 = "channel-count";
        r2 = r9.getInteger(r8);
        r8 = "sample-rate";
        r3 = r9.getInteger(r8);
        r8 = r7.q;
        if (r8 == 0) goto L_0x0037;
        r8 = 6;
        if (r2 != r8) goto L_0x0037;
        r9 = r7.t;
        if (r9 >= r8) goto L_0x0037;
        r8 = new int[r9];
        r9 = 0;
        r0 = r7.t;
        if (r9 >= r0) goto L_0x0038;
        r8[r9] = r9;
        r9 = r9 + 1;
        goto L_0x002e;
        r8 = 0;
        r4 = r8;
        r0 = r7.n;	 Catch:{ a -> 0x0043 }
        r5 = r7.u;	 Catch:{ a -> 0x0043 }
        r6 = r7.v;	 Catch:{ a -> 0x0043 }
        r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ a -> 0x0043 }
        return;
        r8 = move-exception;
        r9 = r7.b;
        r8 = defpackage.bla.a(r8, r9);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmo.a(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    public final void a(bmy bmy) {
        if (this.x && !bmy.m_()) {
            if (Math.abs(bmy.d - this.w) > 500000) {
                this.w = bmy.d;
            }
            this.x = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Missing block: B:26:0x0067, code skipped:
            if (defpackage.bzo.b.startsWith("heroqlte") != false) goto L_0x006b;
     */
    public final void a(defpackage.bqk r7, android.media.MediaCodec r8, defpackage.blg r9, android.media.MediaCrypto r10) {
        /*
        r6 = this;
        r0 = defpackage.bzo.a;
        r1 = 23;
        r2 = 1;
        r3 = 24;
        r4 = 0;
        if (r0 >= r3) goto L_0x002f;
    L_0x000a:
        r0 = r7.a;
        r5 = "OMX.google.raw.decoder";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x002f;
    L_0x0014:
        r0 = defpackage.bzo.a;
        if (r0 != r1) goto L_0x002a;
    L_0x0018:
        r0 = r6.m;
        r0 = r0.getPackageManager();
        if (r0 == 0) goto L_0x002a;
    L_0x0020:
        r5 = "android.software.leanback";
        r0 = r0.hasSystemFeature(r5);
        if (r0 == 0) goto L_0x002a;
    L_0x0028:
        r0 = 0;
        goto L_0x002b;
    L_0x002a:
        r0 = 1;
    L_0x002b:
        if (r0 == 0) goto L_0x002f;
    L_0x002d:
        r0 = -1;
        goto L_0x0031;
    L_0x002f:
        r0 = r9.g;
    L_0x0031:
        r6.o = r0;
        r0 = r7.a;
        r5 = defpackage.bzo.a;
        if (r5 >= r3) goto L_0x006a;
    L_0x0039:
        r3 = "OMX.SEC.aac.dec";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x006a;
    L_0x0041:
        r0 = defpackage.bzo.c;
        r3 = "samsung";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x006a;
    L_0x004b:
        r0 = defpackage.bzo.b;
        r3 = "zeroflte";
        r0 = r0.startsWith(r3);
        if (r0 != 0) goto L_0x006b;
    L_0x0055:
        r0 = defpackage.bzo.b;
        r3 = "herolte";
        r0 = r0.startsWith(r3);
        if (r0 != 0) goto L_0x006b;
    L_0x005f:
        r0 = defpackage.bzo.b;
        r3 = "heroqlte";
        r0 = r0.startsWith(r3);
        if (r0 == 0) goto L_0x006a;
    L_0x0069:
        goto L_0x006b;
    L_0x006a:
        r2 = 0;
    L_0x006b:
        r6.q = r2;
        r0 = r7.g;
        r6.p = r0;
        r0 = r7.b;
        if (r0 != 0) goto L_0x0078;
    L_0x0075:
        r7 = "audio/raw";
        goto L_0x007a;
    L_0x0078:
        r7 = r7.b;
    L_0x007a:
        r0 = r6.o;
        r2 = new android.media.MediaFormat;
        r2.<init>();
        r3 = "mime";
        r2.setString(r3, r7);
        r7 = r9.s;
        r5 = "channel-count";
        r2.setInteger(r5, r7);
        r7 = r9.t;
        r5 = "sample-rate";
        r2.setInteger(r5, r7);
        r7 = r9.h;
        defpackage.bqo.a(r2, r7);
        r7 = "max-input-size";
        defpackage.bqo.a(r2, r7, r0);
        r7 = defpackage.bzo.a;
        if (r7 < r1) goto L_0x00a7;
    L_0x00a2:
        r7 = "priority";
        r2.setInteger(r7, r4);
    L_0x00a7:
        r7 = 0;
        r8.configure(r2, r7, r10, r4);
        r8 = r6.p;
        if (r8 == 0) goto L_0x00b9;
    L_0x00af:
        r6.r = r2;
        r7 = r6.r;
        r8 = r9.f;
        r7.setString(r3, r8);
        return;
    L_0x00b9:
        r6.r = r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmo.a(bqk, android.media.MediaCodec, blg, android.media.MediaCrypto):void");
    }

    public final void a(String str, long j, long j2) {
        a aVar = this.h;
        if (aVar.b != null) {
            aVar.a.post(new 2(str, j, j2));
        }
    }

    public final void a(boolean z) {
        super.a(z);
        a aVar = this.h;
        bmx bmx = this.l;
        if (aVar.b != null) {
            aVar.a.post(new 1(bmx));
        }
        int i = this.a.b;
        if (i != 0) {
            this.n.b(i);
        } else {
            this.n.g();
        }
    }

    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        bmx bmx;
        if (this.p && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            bmx = this.l;
            bmx.f++;
            this.n.b();
            return true;
        } else {
            try {
                if (!this.n.a(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                bmx = this.l;
                bmx.e++;
                return true;
            } catch (b | d e) {
                throw bla.a(e, this.b);
            }
        }
    }

    public final void b(blg blg) {
        super.b(blg);
        a aVar = this.h;
        if (aVar.b != null) {
            aVar.a.post(new 3(blg));
        }
        this.s = "audio/raw".equals(blg.f) ? blg.u : 2;
        this.t = blg.s;
        this.u = blg.v;
        this.v = blg.w;
    }

    public final byy c() {
        return this;
    }

    public final long d() {
        if (this.c == 2) {
            w();
        }
        return this.w;
    }

    public final blp e() {
        return this.n.f();
    }

    public final void n() {
        super.n();
        this.n.a();
    }

    public final void o() {
        w();
        this.n.h();
        super.o();
    }

    public final void p() {
        try {
            this.n.j();
            try {
                super.p();
            } finally {
                this.h.a(this.l);
            }
        } catch (Throwable th) {
            super.p();
        } finally {
            this.h.a(this.l);
        }
    }

    public final boolean q() {
        return this.n.e() || super.q();
    }

    public final boolean r() {
        return super.r() && this.n.d();
    }

    public final void s() {
        try {
            this.n.c();
        } catch (d e) {
            throw bla.a(e, this.b);
        }
    }
}
