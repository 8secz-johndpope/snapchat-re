package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.bqn.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* renamed from: bql */
public abstract class bql extends bkv {
    private static final byte[] h;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private ByteBuffer[] F;
    private ByteBuffer[] G;
    private long H;
    private int I;
    private int J;
    private ByteBuffer K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private final bqm i;
    protected MediaCodec j;
    protected bqk k;
    protected bmx l;
    private final bnd<bnf> m;
    private final boolean n;
    private final bmy o;
    private final bmy p;
    private final blh q;
    private final List<Long> r;
    private final BufferInfo s;
    private blg t;
    private bnc<bnf> u;
    private bnc<bnf> v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;

    /* renamed from: bql$a */
    public static class a extends Exception {
        private String a;
        private boolean b;
        private String c;
        private String d;

        public a(blg blg, Throwable th, boolean z, int i) {
            StringBuilder stringBuilder = new StringBuilder("Decoder init failed: [");
            stringBuilder.append(i);
            stringBuilder.append("], ");
            stringBuilder.append(blg);
            super(stringBuilder.toString(), th);
            this.a = blg.f;
            this.b = z;
            this.c = null;
            String str = i < 0 ? "neg_" : "";
            StringBuilder stringBuilder2 = new StringBuilder("com.google.android.exoplayer.MediaCodecTrackRenderer_");
            stringBuilder2.append(str);
            stringBuilder2.append(Math.abs(i));
            this.d = stringBuilder2.toString();
        }

        public a(blg blg, Throwable th, boolean z, String str) {
            StringBuilder stringBuilder = new StringBuilder("Decoder init failed: ");
            stringBuilder.append(str);
            stringBuilder.append(ppy.d);
            stringBuilder.append(blg);
            super(stringBuilder.toString(), th);
            this.a = blg.f;
            this.b = z;
            this.c = str;
            String str2 = null;
            if (bzo.a >= 21 && (th instanceof CodecException)) {
                str2 = ((CodecException) th).getDiagnosticInfo();
            }
            this.d = str2;
        }
    }

    static {
        byte[] bArr = new byte[38];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i << 1;
            String str = "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78";
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        h = bArr;
    }

    public bql(int i, bqm bqm, bnd<bnf> bnd, boolean z) {
        super(i);
        byo.b(bzo.a >= 16);
        this.i = (bqm) byo.a((Object) bqm);
        this.m = bnd;
        this.n = z;
        this.o = new bmy(0);
        this.p = new bmy(0);
        this.q = new blh();
        this.r = new ArrayList();
        this.s = new BufferInfo();
        this.N = 0;
        this.O = 0;
    }

    private void A() {
        if (this.O == 2) {
            u();
            t();
            return;
        }
        this.S = true;
        s();
    }

    private void a(a aVar) {
        throw bla.a(aVar, this.b);
    }

    private boolean b(long j, long j2) {
        boolean z;
        if (!x()) {
            int dequeueOutputBuffer;
            if (this.B && this.Q) {
                try {
                    dequeueOutputBuffer = this.j.dequeueOutputBuffer(this.s, 0);
                } catch (IllegalStateException unused) {
                    A();
                    if (this.S) {
                        u();
                    }
                    return false;
                }
            }
            dequeueOutputBuffer = this.j.dequeueOutputBuffer(this.s, 0);
            if (dequeueOutputBuffer >= 0) {
                if (this.E) {
                    this.E = false;
                    this.j.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                } else if (this.s.size != 0 || (this.s.flags & 4) == 0) {
                    this.J = dequeueOutputBuffer;
                    this.K = bzo.a >= 21 ? this.j.getOutputBuffer(dequeueOutputBuffer) : this.G[dequeueOutputBuffer];
                    ByteBuffer byteBuffer = this.K;
                    if (byteBuffer != null) {
                        byteBuffer.position(this.s.offset);
                        this.K.limit(this.s.offset + this.s.size);
                    }
                    long j3 = this.s.presentationTimeUs;
                    int size = this.r.size();
                    for (int i = 0; i < size; i++) {
                        if (((Long) this.r.get(i)).longValue() == j3) {
                            this.r.remove(i);
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    this.L = z;
                } else {
                    A();
                    return false;
                }
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.j.getOutputFormat();
                if (this.w != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.E = true;
                } else {
                    if (this.C) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    a(this.j, outputFormat);
                }
                return true;
            } else if (dequeueOutputBuffer == -3) {
                if (bzo.a < 21) {
                    this.G = this.j.getOutputBuffers();
                }
                return true;
            } else {
                if (this.z && (this.R || this.O == 2)) {
                    A();
                }
                return false;
            }
        }
        if (this.B && this.Q) {
            try {
                z = a(j, j2, this.j, this.K, this.J, this.s.flags, this.s.presentationTimeUs, this.L);
            } catch (IllegalStateException unused2) {
                A();
                if (this.S) {
                    u();
                }
                return false;
            }
        }
        z = a(j, j2, this.j, this.K, this.J, this.s.flags, this.s.presentationTimeUs, this.L);
        if (z) {
            c(this.s.presentationTimeUs);
            Object obj = (this.s.flags & 4) != 0 ? 1 : null;
            z();
            if (obj == null) {
                return true;
            }
            A();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015b A:{RETURN} */
    private boolean w() {
        /*
        r14 = this;
        r0 = r14.j;
        r1 = 0;
        if (r0 == 0) goto L_0x021a;
    L_0x0005:
        r2 = r14.O;
        r3 = 2;
        if (r2 == r3) goto L_0x021a;
    L_0x000a:
        r2 = r14.R;
        if (r2 == 0) goto L_0x0010;
    L_0x000e:
        goto L_0x021a;
    L_0x0010:
        r2 = r14.I;
        if (r2 >= 0) goto L_0x003b;
    L_0x0014:
        r4 = 0;
        r0 = r0.dequeueInputBuffer(r4);
        r14.I = r0;
        r0 = r14.I;
        if (r0 >= 0) goto L_0x0021;
    L_0x0020:
        return r1;
    L_0x0021:
        r2 = r14.o;
        r4 = defpackage.bzo.a;
        r5 = 21;
        if (r4 < r5) goto L_0x0030;
    L_0x0029:
        r4 = r14.j;
        r0 = r4.getInputBuffer(r0);
        goto L_0x0034;
    L_0x0030:
        r4 = r14.F;
        r0 = r4[r0];
    L_0x0034:
        r2.c = r0;
        r0 = r14.o;
        r0.a();
    L_0x003b:
        r0 = r14.O;
        r2 = 1;
        if (r0 != r2) goto L_0x0058;
    L_0x0040:
        r0 = r14.z;
        if (r0 != 0) goto L_0x0055;
    L_0x0044:
        r14.Q = r2;
        r4 = r14.j;
        r5 = r14.I;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r10 = 4;
        r4.queueInputBuffer(r5, r6, r7, r8, r10);
        r14.y();
    L_0x0055:
        r14.O = r3;
        return r1;
    L_0x0058:
        r0 = r14.D;
        if (r0 == 0) goto L_0x007b;
    L_0x005c:
        r14.D = r1;
        r0 = r14.o;
        r0 = r0.c;
        r1 = h;
        r0.put(r1);
        r3 = r14.j;
        r4 = r14.I;
        r5 = 0;
        r0 = h;
        r6 = r0.length;
        r7 = 0;
        r9 = 0;
        r3.queueInputBuffer(r4, r5, r6, r7, r9);
        r14.y();
        r14.P = r2;
        return r2;
    L_0x007b:
        r0 = r14.T;
        if (r0 == 0) goto L_0x0082;
    L_0x007f:
        r0 = -4;
        r4 = 0;
        goto L_0x00ba;
    L_0x0082:
        r0 = r14.N;
        if (r0 != r2) goto L_0x00a7;
    L_0x0086:
        r0 = 0;
    L_0x0087:
        r4 = r14.t;
        r4 = r4.h;
        r4 = r4.size();
        if (r0 >= r4) goto L_0x00a5;
    L_0x0091:
        r4 = r14.t;
        r4 = r4.h;
        r4 = r4.get(r0);
        r4 = (byte[]) r4;
        r5 = r14.o;
        r5 = r5.c;
        r5.put(r4);
        r0 = r0 + 1;
        goto L_0x0087;
    L_0x00a5:
        r14.N = r3;
    L_0x00a7:
        r0 = r14.o;
        r0 = r0.c;
        r0 = r0.position();
        r4 = r14.q;
        r5 = r14.o;
        r4 = r14.a(r4, r5, r1);
        r13 = r4;
        r4 = r0;
        r0 = r13;
    L_0x00ba:
        r5 = -3;
        if (r0 != r5) goto L_0x00be;
    L_0x00bd:
        return r1;
    L_0x00be:
        r5 = -5;
        if (r0 != r5) goto L_0x00d4;
    L_0x00c1:
        r0 = r14.N;
        if (r0 != r3) goto L_0x00cc;
    L_0x00c5:
        r0 = r14.o;
        r0.a();
        r14.N = r2;
    L_0x00cc:
        r0 = r14.q;
        r0 = r0.a;
        r14.b(r0);
        return r2;
    L_0x00d4:
        r0 = r14.o;
        r0 = r0.c();
        if (r0 == 0) goto L_0x010f;
    L_0x00dc:
        r0 = r14.N;
        if (r0 != r3) goto L_0x00e7;
    L_0x00e0:
        r0 = r14.o;
        r0.a();
        r14.N = r2;
    L_0x00e7:
        r14.R = r2;
        r0 = r14.P;
        if (r0 != 0) goto L_0x00f1;
    L_0x00ed:
        r14.A();
        return r1;
    L_0x00f1:
        r0 = r14.z;	 Catch:{ CryptoException -> 0x0107 }
        if (r0 != 0) goto L_0x0106;
    L_0x00f5:
        r14.Q = r2;	 Catch:{ CryptoException -> 0x0107 }
        r3 = r14.j;	 Catch:{ CryptoException -> 0x0107 }
        r4 = r14.I;	 Catch:{ CryptoException -> 0x0107 }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r9 = 4;
        r3.queueInputBuffer(r4, r5, r6, r7, r9);	 Catch:{ CryptoException -> 0x0107 }
        r14.y();	 Catch:{ CryptoException -> 0x0107 }
    L_0x0106:
        return r1;
    L_0x0107:
        r0 = move-exception;
        r1 = r14.b;
        r0 = defpackage.bla.a(r0, r1);
        throw r0;
    L_0x010f:
        r0 = r14.U;
        if (r0 == 0) goto L_0x0127;
    L_0x0113:
        r0 = r14.o;
        r0 = r0.d();
        if (r0 != 0) goto L_0x0127;
    L_0x011b:
        r0 = r14.o;
        r0.a();
        r0 = r14.N;
        if (r0 != r3) goto L_0x0126;
    L_0x0124:
        r14.N = r2;
    L_0x0126:
        return r2;
    L_0x0127:
        r14.U = r1;
        r0 = r14.o;
        r0 = r0.e();
        r3 = r14.u;
        if (r3 == 0) goto L_0x0154;
    L_0x0133:
        if (r0 != 0) goto L_0x013a;
    L_0x0135:
        r3 = r14.n;
        if (r3 == 0) goto L_0x013a;
    L_0x0139:
        goto L_0x0154;
    L_0x013a:
        r3 = r14.u;
        r3 = r3.a();
        if (r3 == r2) goto L_0x0147;
    L_0x0142:
        r5 = 4;
        if (r3 == r5) goto L_0x0154;
    L_0x0145:
        r3 = 1;
        goto L_0x0155;
    L_0x0147:
        r0 = r14.u;
        r0 = r0.b();
        r1 = r14.b;
        r0 = defpackage.bla.a(r0, r1);
        throw r0;
    L_0x0154:
        r3 = 0;
    L_0x0155:
        r14.T = r3;
        r3 = r14.T;
        if (r3 == 0) goto L_0x015c;
    L_0x015b:
        return r1;
    L_0x015c:
        r3 = r14.x;
        if (r3 == 0) goto L_0x01af;
    L_0x0160:
        if (r0 != 0) goto L_0x01af;
    L_0x0162:
        r3 = r14.o;
        r3 = r3.c;
        r5 = r3.position();
        r6 = 0;
        r7 = 0;
    L_0x016c:
        r8 = r6 + 1;
        if (r8 >= r5) goto L_0x019f;
    L_0x0170:
        r9 = r3.get(r6);
        r9 = r9 & 255;
        r10 = 3;
        if (r7 != r10) goto L_0x0196;
    L_0x0179:
        if (r9 != r2) goto L_0x019a;
    L_0x017b:
        r11 = r3.get(r8);
        r11 = r11 & 31;
        r12 = 7;
        if (r11 != r12) goto L_0x019a;
    L_0x0184:
        r7 = r3.duplicate();
        r6 = r6 - r10;
        r7.position(r6);
        r7.limit(r5);
        r3.position(r1);
        r3.put(r7);
        goto L_0x01a2;
    L_0x0196:
        if (r9 != 0) goto L_0x019a;
    L_0x0198:
        r7 = r7 + 1;
    L_0x019a:
        if (r9 == 0) goto L_0x019d;
    L_0x019c:
        r7 = 0;
    L_0x019d:
        r6 = r8;
        goto L_0x016c;
    L_0x019f:
        r3.clear();
    L_0x01a2:
        r3 = r14.o;
        r3 = r3.c;
        r3 = r3.position();
        if (r3 != 0) goto L_0x01ad;
    L_0x01ac:
        return r2;
    L_0x01ad:
        r14.x = r1;
    L_0x01af:
        r3 = r14.o;	 Catch:{ CryptoException -> 0x0212 }
        r9 = r3.d;	 Catch:{ CryptoException -> 0x0212 }
        r3 = r14.o;	 Catch:{ CryptoException -> 0x0212 }
        r3 = r3.m_();	 Catch:{ CryptoException -> 0x0212 }
        if (r3 == 0) goto L_0x01c4;
    L_0x01bb:
        r3 = r14.r;	 Catch:{ CryptoException -> 0x0212 }
        r5 = java.lang.Long.valueOf(r9);	 Catch:{ CryptoException -> 0x0212 }
        r3.add(r5);	 Catch:{ CryptoException -> 0x0212 }
    L_0x01c4:
        r3 = r14.o;	 Catch:{ CryptoException -> 0x0212 }
        r3.f();	 Catch:{ CryptoException -> 0x0212 }
        r3 = r14.o;	 Catch:{ CryptoException -> 0x0212 }
        r14.a(r3);	 Catch:{ CryptoException -> 0x0212 }
        if (r0 == 0) goto L_0x01f2;
    L_0x01d0:
        r0 = r14.o;	 Catch:{ CryptoException -> 0x0212 }
        r0 = r0.b;	 Catch:{ CryptoException -> 0x0212 }
        r8 = r0.d;	 Catch:{ CryptoException -> 0x0212 }
        if (r4 != 0) goto L_0x01d9;
    L_0x01d8:
        goto L_0x01e8;
    L_0x01d9:
        r0 = r8.numBytesOfClearData;	 Catch:{ CryptoException -> 0x0212 }
        if (r0 != 0) goto L_0x01e1;
    L_0x01dd:
        r0 = new int[r2];	 Catch:{ CryptoException -> 0x0212 }
        r8.numBytesOfClearData = r0;	 Catch:{ CryptoException -> 0x0212 }
    L_0x01e1:
        r0 = r8.numBytesOfClearData;	 Catch:{ CryptoException -> 0x0212 }
        r3 = r0[r1];	 Catch:{ CryptoException -> 0x0212 }
        r3 = r3 + r4;
        r0[r1] = r3;	 Catch:{ CryptoException -> 0x0212 }
    L_0x01e8:
        r5 = r14.j;	 Catch:{ CryptoException -> 0x0212 }
        r6 = r14.I;	 Catch:{ CryptoException -> 0x0212 }
        r7 = 0;
        r11 = 0;
        r5.queueSecureInputBuffer(r6, r7, r8, r9, r11);	 Catch:{ CryptoException -> 0x0212 }
        goto L_0x0203;
    L_0x01f2:
        r5 = r14.j;	 Catch:{ CryptoException -> 0x0212 }
        r6 = r14.I;	 Catch:{ CryptoException -> 0x0212 }
        r7 = 0;
        r0 = r14.o;	 Catch:{ CryptoException -> 0x0212 }
        r0 = r0.c;	 Catch:{ CryptoException -> 0x0212 }
        r8 = r0.limit();	 Catch:{ CryptoException -> 0x0212 }
        r11 = 0;
        r5.queueInputBuffer(r6, r7, r8, r9, r11);	 Catch:{ CryptoException -> 0x0212 }
    L_0x0203:
        r14.y();	 Catch:{ CryptoException -> 0x0212 }
        r14.P = r2;	 Catch:{ CryptoException -> 0x0212 }
        r14.N = r1;	 Catch:{ CryptoException -> 0x0212 }
        r0 = r14.l;	 Catch:{ CryptoException -> 0x0212 }
        r1 = r0.c;	 Catch:{ CryptoException -> 0x0212 }
        r1 = r1 + r2;
        r0.c = r1;	 Catch:{ CryptoException -> 0x0212 }
        return r2;
    L_0x0212:
        r0 = move-exception;
        r1 = r14.b;
        r0 = defpackage.bla.a(r0, r1);
        throw r0;
    L_0x021a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bql.w():boolean");
    }

    private boolean x() {
        return this.J >= 0;
    }

    private void y() {
        this.I = -1;
        this.o.c = null;
    }

    private void z() {
        this.J = -1;
        this.K = null;
    }

    public final int a(blg blg) {
        try {
            return a(this.i, this.m, blg);
        } catch (b e) {
            throw bla.a(e, this.b);
        }
    }

    /* Access modifiers changed, original: protected */
    public int a(bqk bqk, blg blg, blg blg2) {
        return 0;
    }

    public abstract int a(bqm bqm, bnd<bnf> bnd, blg blg);

    /* Access modifiers changed, original: protected */
    public bqk a(bqm bqm, blg blg, boolean z) {
        return bqm.a(blg.f, z);
    }

    public final void a(long j, long j2) {
        if (this.S) {
            s();
            return;
        }
        if (this.t == null) {
            this.p.a();
            int a = a(this.q, this.p, true);
            if (a == -5) {
                b(this.q.a);
            } else {
                if (a == -4) {
                    byo.b(this.p.c());
                    this.R = true;
                    A();
                }
                return;
            }
        }
        t();
        if (this.j != null) {
            bzm.a("drainAndFeed");
            do {
            } while (b(j, j2));
            do {
            } while (w());
            bzm.a();
            return;
        }
        bmx bmx = this.l;
        bmx.d += b(j);
        this.p.a();
        int a2 = a(this.q, this.p, false);
        if (a2 == -5) {
            b(this.q.a);
            return;
        }
        if (a2 == -4) {
            byo.b(this.p.c());
            this.R = true;
            A();
        }
    }

    public void a(long j, boolean z) {
        this.R = false;
        this.S = false;
        if (this.j != null) {
            v();
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* Access modifiers changed, original: protected */
    public void a(bmy bmy) {
    }

    public abstract void a(bqk bqk, MediaCodec mediaCodec, blg blg, MediaCrypto mediaCrypto);

    /* Access modifiers changed, original: protected */
    public void a(String str, long j, long j2) {
    }

    public void a(boolean z) {
        this.l = new bmx();
    }

    public abstract boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* Access modifiers changed, original: protected */
    public boolean a(bqk bqk) {
        return true;
    }

    /* Access modifiers changed, original: protected */
    public void b(blg blg) {
        blg blg2 = this.t;
        this.t = blg;
        if ((bzo.a(this.t.i, blg2 == null ? null : blg2.i) ^ 1) != 0) {
            if (this.t.i != null) {
                bnd bnd = this.m;
                if (bnd != null) {
                    this.v = bnd.a(Looper.myLooper(), this.t.i);
                    bnc bnc = this.v;
                    if (bnc == this.u) {
                        this.m.a(bnc);
                    }
                } else {
                    throw bla.a(new IllegalStateException("Media requires a DrmSessionManager"), this.b);
                }
            }
            this.v = null;
        }
        boolean z = false;
        if (this.v == this.u && this.j != null) {
            int a = a(this.k, blg2, this.t);
            if (a != 0) {
                if (a != 1) {
                    if (a == 3) {
                        this.M = true;
                        this.N = 1;
                        a = this.w;
                        if (a == 2 || (a == 1 && this.t.k == blg2.k && this.t.l == blg2.l)) {
                            z = true;
                        }
                        this.D = z;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                z = true;
            }
        }
        if (!z) {
            if (this.P) {
                this.O = 1;
            } else {
                u();
                t();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void c(long j) {
    }

    public final int m() {
        return 8;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
        this.t = null;
        try {
            u();
            try {
                if (this.u != null) {
                    this.m.a(this.u);
                }
                try {
                    if (!(this.v == null || this.v == this.u)) {
                        this.m.a(this.v);
                    }
                    this.u = null;
                    this.v = null;
                } catch (Throwable th) {
                    this.u = null;
                    this.v = null;
                }
            } catch (Throwable th2) {
                this.u = null;
                this.v = null;
            }
        } catch (Throwable th3) {
            this.u = null;
            this.v = null;
        }
    }

    public boolean q() {
        if (!(this.t == null || this.T)) {
            if ((this.f ? this.g : this.d.a()) || x() || (this.H != -9223372036854775807L && SystemClock.elapsedRealtime() < this.H)) {
                return true;
            }
        }
        return false;
    }

    public boolean r() {
        return this.S;
    }

    /* Access modifiers changed, original: protected */
    public void s() {
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0295 A:{Catch:{ Exception -> 0x02a6 }} */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0295 A:{Catch:{ Exception -> 0x02a6 }} */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02bd  */
    /* JADX WARNING: Missing block: B:23:0x0056, code skipped:
            if ("AFTB".equals(defpackage.bzo.d) != false) goto L_0x0058;
     */
    /* JADX WARNING: Missing block: B:78:0x0160, code skipped:
            if ("tilapia".equals(defpackage.bzo.b) != false) goto L_0x0162;
     */
    /* JADX WARNING: Missing block: B:118:0x01f0, code skipped:
            if (r3.f != false) goto L_0x01f2;
     */
    /* JADX WARNING: Missing block: B:132:0x0221, code skipped:
            if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r0) != false) goto L_0x0223;
     */
    public final void t() {
        /*
        r15 = this;
        r0 = r15.j;
        if (r0 != 0) goto L_0x02d3;
    L_0x0004:
        r0 = r15.t;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x02d3;
    L_0x000a:
        r1 = r15.v;
        r15.u = r1;
        r0 = r0.f;
        r1 = r15.u;
        r2 = "Amazon";
        r3 = 0;
        r4 = 0;
        r5 = 1;
        if (r1 == 0) goto L_0x0076;
    L_0x0019:
        r1 = r1.c();
        r1 = (defpackage.bnf) r1;
        if (r1 != 0) goto L_0x002d;
    L_0x0021:
        r1 = r15.u;
        r1 = r1.b();
        if (r1 != 0) goto L_0x002a;
    L_0x0029:
        return;
    L_0x002a:
        r6 = r3;
    L_0x002b:
        r1 = 0;
        goto L_0x003c;
    L_0x002d:
        r6 = r1.a;
        r7 = r1.b;
        if (r7 != 0) goto L_0x002b;
    L_0x0033:
        r1 = r1.a;
        r1 = r1.requiresSecureDecoderComponent(r0);
        if (r1 == 0) goto L_0x002b;
    L_0x003b:
        r1 = 1;
    L_0x003c:
        r7 = defpackage.bzo.c;
        r7 = r2.equals(r7);
        if (r7 == 0) goto L_0x005a;
    L_0x0044:
        r7 = defpackage.bzo.d;
        r8 = "AFTM";
        r7 = r8.equals(r7);
        if (r7 != 0) goto L_0x0058;
    L_0x004e:
        r7 = defpackage.bzo.d;
        r8 = "AFTB";
        r7 = r8.equals(r7);
        if (r7 == 0) goto L_0x005a;
    L_0x0058:
        r7 = 1;
        goto L_0x005b;
    L_0x005a:
        r7 = 0;
    L_0x005b:
        if (r7 == 0) goto L_0x0078;
    L_0x005d:
        r7 = r15.u;
        r7 = r7.a();
        if (r7 == r5) goto L_0x0069;
    L_0x0065:
        r8 = 4;
        if (r7 == r8) goto L_0x0078;
    L_0x0068:
        return;
    L_0x0069:
        r0 = r15.u;
        r0 = r0.b();
        r1 = r15.b;
        r0 = defpackage.bla.a(r0, r1);
        throw r0;
    L_0x0076:
        r6 = r3;
        r1 = 0;
    L_0x0078:
        r7 = r15.k;
        if (r7 != 0) goto L_0x00de;
    L_0x007c:
        r7 = r15.i;	 Catch:{ b -> 0x00bf }
        r8 = r15.t;	 Catch:{ b -> 0x00bf }
        r7 = r15.a(r7, r8, r1);	 Catch:{ b -> 0x00bf }
        r15.k = r7;	 Catch:{ b -> 0x00bf }
        r7 = r15.k;	 Catch:{ b -> 0x00bf }
        if (r7 != 0) goto L_0x00cd;
    L_0x008a:
        if (r1 == 0) goto L_0x00cd;
    L_0x008c:
        r7 = r15.i;	 Catch:{ b -> 0x00bf }
        r8 = r15.t;	 Catch:{ b -> 0x00bf }
        r7 = r15.a(r7, r8, r4);	 Catch:{ b -> 0x00bf }
        r15.k = r7;	 Catch:{ b -> 0x00bf }
        r7 = r15.k;	 Catch:{ b -> 0x00bf }
        if (r7 == 0) goto L_0x00cd;
    L_0x009a:
        r7 = "MediaCodecRenderer";
        r8 = new java.lang.StringBuilder;	 Catch:{ b -> 0x00bf }
        r9 = "Drm session requires secure decoder for ";
        r8.<init>(r9);	 Catch:{ b -> 0x00bf }
        r8.append(r0);	 Catch:{ b -> 0x00bf }
        r0 = ", but no secure decoder available. Trying to proceed with ";
        r8.append(r0);	 Catch:{ b -> 0x00bf }
        r0 = r15.k;	 Catch:{ b -> 0x00bf }
        r0 = r0.a;	 Catch:{ b -> 0x00bf }
        r8.append(r0);	 Catch:{ b -> 0x00bf }
        r0 = ".";
        r8.append(r0);	 Catch:{ b -> 0x00bf }
        r0 = r8.toString();	 Catch:{ b -> 0x00bf }
        android.util.Log.w(r7, r0);	 Catch:{ b -> 0x00bf }
        goto L_0x00cd;
    L_0x00bf:
        r0 = move-exception;
        r7 = new bql$a;
        r8 = r15.t;
        r9 = -49998; // 0xffffffffffff3cb2 float:NaN double:NaN;
        r7.<init>(r8, r0, r1, r9);
        r15.a(r7);
    L_0x00cd:
        r0 = r15.k;
        if (r0 != 0) goto L_0x00de;
    L_0x00d1:
        r0 = new bql$a;
        r7 = r15.t;
        r8 = -49999; // 0xffffffffffff3cb1 float:NaN double:NaN;
        r0.<init>(r7, r3, r1, r8);
        r15.a(r0);
    L_0x00de:
        r0 = r15.k;
        r0 = r15.a(r0);
        if (r0 != 0) goto L_0x00e7;
    L_0x00e6:
        return;
    L_0x00e7:
        r0 = r15.k;
        r0 = r0.a;
        r3 = defpackage.bzo.a;
        r7 = 25;
        r13 = 2;
        r8 = "OMX.Exynos.avc.dec.secure";
        if (r3 > r7) goto L_0x0124;
    L_0x00f4:
        r3 = r8.equals(r0);
        if (r3 == 0) goto L_0x0124;
    L_0x00fa:
        r3 = defpackage.bzo.d;
        r7 = "SM-T585";
        r3 = r3.startsWith(r7);
        if (r3 != 0) goto L_0x0122;
    L_0x0104:
        r3 = defpackage.bzo.d;
        r7 = "SM-A510";
        r3 = r3.startsWith(r7);
        if (r3 != 0) goto L_0x0122;
    L_0x010e:
        r3 = defpackage.bzo.d;
        r7 = "SM-A520";
        r3 = r3.startsWith(r7);
        if (r3 != 0) goto L_0x0122;
    L_0x0118:
        r3 = defpackage.bzo.d;
        r7 = "SM-J700";
        r3 = r3.startsWith(r7);
        if (r3 == 0) goto L_0x0124;
    L_0x0122:
        r3 = 2;
        goto L_0x0165;
    L_0x0124:
        r3 = defpackage.bzo.a;
        r7 = 24;
        if (r3 >= r7) goto L_0x0164;
    L_0x012a:
        r3 = "OMX.Nvidia.h264.decode";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x013a;
    L_0x0132:
        r3 = "OMX.Nvidia.h264.decode.secure";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0164;
    L_0x013a:
        r3 = defpackage.bzo.b;
        r7 = "flounder";
        r3 = r7.equals(r3);
        if (r3 != 0) goto L_0x0162;
    L_0x0144:
        r3 = defpackage.bzo.b;
        r7 = "flounder_lte";
        r3 = r7.equals(r3);
        if (r3 != 0) goto L_0x0162;
    L_0x014e:
        r3 = defpackage.bzo.b;
        r7 = "grouper";
        r3 = r7.equals(r3);
        if (r3 != 0) goto L_0x0162;
    L_0x0158:
        r3 = defpackage.bzo.b;
        r7 = "tilapia";
        r3 = r7.equals(r3);
        if (r3 == 0) goto L_0x0164;
    L_0x0162:
        r3 = 1;
        goto L_0x0165;
    L_0x0164:
        r3 = 0;
    L_0x0165:
        r15.w = r3;
        r3 = r15.t;
        r7 = defpackage.bzo.a;
        r14 = 21;
        if (r7 >= r14) goto L_0x0181;
    L_0x016f:
        r3 = r3.h;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x0181;
    L_0x0177:
        r3 = "OMX.MTK.VIDEO.DECODER.AVC";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x0181;
    L_0x017f:
        r3 = 1;
        goto L_0x0182;
    L_0x0181:
        r3 = 0;
    L_0x0182:
        r15.x = r3;
        r3 = defpackage.bzo.a;
        r7 = 19;
        r9 = 18;
        if (r3 < r9) goto L_0x01bf;
    L_0x018c:
        r3 = defpackage.bzo.a;
        if (r3 != r9) goto L_0x01a0;
    L_0x0190:
        r3 = "OMX.SEC.avc.dec";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x01bf;
    L_0x0198:
        r3 = "OMX.SEC.avc.dec.secure";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x01bf;
    L_0x01a0:
        r3 = defpackage.bzo.a;
        if (r3 != r7) goto L_0x01bd;
    L_0x01a4:
        r3 = defpackage.bzo.d;
        r10 = "SM-G800";
        r3 = r3.startsWith(r10);
        if (r3 == 0) goto L_0x01bd;
    L_0x01ae:
        r3 = "OMX.Exynos.avc.dec";
        r3 = r3.equals(r0);
        if (r3 != 0) goto L_0x01bf;
    L_0x01b6:
        r3 = r8.equals(r0);
        if (r3 == 0) goto L_0x01bd;
    L_0x01bc:
        goto L_0x01bf;
    L_0x01bd:
        r3 = 0;
        goto L_0x01c0;
    L_0x01bf:
        r3 = 1;
    L_0x01c0:
        r15.y = r3;
        r3 = r15.k;
        r8 = r3.a;
        r10 = defpackage.bzo.a;
        r11 = 17;
        if (r10 > r11) goto L_0x01dc;
    L_0x01cc:
        r10 = "OMX.rk.video_decoder.avc";
        r10 = r10.equals(r8);
        if (r10 != 0) goto L_0x01f2;
    L_0x01d4:
        r10 = "OMX.allwinner.video.decoder.avc";
        r8 = r10.equals(r8);
        if (r8 != 0) goto L_0x01f2;
    L_0x01dc:
        r8 = defpackage.bzo.c;
        r2 = r2.equals(r8);
        if (r2 == 0) goto L_0x01f4;
    L_0x01e4:
        r2 = defpackage.bzo.d;
        r8 = "AFTS";
        r2 = r8.equals(r2);
        if (r2 == 0) goto L_0x01f4;
    L_0x01ee:
        r2 = r3.f;
        if (r2 == 0) goto L_0x01f4;
    L_0x01f2:
        r2 = 1;
        goto L_0x01f5;
    L_0x01f4:
        r2 = 0;
    L_0x01f5:
        r15.z = r2;
        r2 = defpackage.bzo.a;
        r3 = 23;
        if (r2 > r3) goto L_0x0205;
    L_0x01fd:
        r2 = "OMX.google.vorbis.decoder";
        r2 = r2.equals(r0);
        if (r2 != 0) goto L_0x0223;
    L_0x0205:
        r2 = defpackage.bzo.a;
        if (r2 > r7) goto L_0x0225;
    L_0x0209:
        r2 = defpackage.bzo.b;
        r3 = "hb2000";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0225;
    L_0x0213:
        r2 = "OMX.amlogic.avc.decoder.awesome";
        r2 = r2.equals(r0);
        if (r2 != 0) goto L_0x0223;
    L_0x021b:
        r2 = "OMX.amlogic.avc.decoder.awesome.secure";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x0225;
    L_0x0223:
        r2 = 1;
        goto L_0x0226;
    L_0x0225:
        r2 = 0;
    L_0x0226:
        r15.A = r2;
        r2 = defpackage.bzo.a;
        if (r2 != r14) goto L_0x0236;
    L_0x022c:
        r2 = "OMX.google.aac.decoder";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x0236;
    L_0x0234:
        r2 = 1;
        goto L_0x0237;
    L_0x0236:
        r2 = 0;
    L_0x0237:
        r15.B = r2;
        r2 = r15.t;
        r3 = defpackage.bzo.a;
        if (r3 > r9) goto L_0x024c;
    L_0x023f:
        r2 = r2.s;
        if (r2 != r5) goto L_0x024c;
    L_0x0243:
        r2 = "OMX.MTK.AUDIO.DECODER.MP3";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x024c;
    L_0x024b:
        r4 = 1;
    L_0x024c:
        r15.C = r4;
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x02a6 }
        r4 = "createCodec:";
        r7 = java.lang.String.valueOf(r0);	 Catch:{ Exception -> 0x02a6 }
        r4 = r4.concat(r7);	 Catch:{ Exception -> 0x02a6 }
        defpackage.bzm.a(r4);	 Catch:{ Exception -> 0x02a6 }
        r4 = android.media.MediaCodec.createByCodecName(r0);	 Catch:{ Exception -> 0x02a6 }
        r15.j = r4;	 Catch:{ Exception -> 0x02a6 }
        defpackage.bzm.a();	 Catch:{ Exception -> 0x02a6 }
        r4 = "configureCodec";
        defpackage.bzm.a(r4);	 Catch:{ Exception -> 0x02a6 }
        r4 = r15.k;	 Catch:{ Exception -> 0x02a6 }
        r7 = r15.j;	 Catch:{ Exception -> 0x02a6 }
        r8 = r15.t;	 Catch:{ Exception -> 0x02a6 }
        r15.a(r4, r7, r8, r6);	 Catch:{ Exception -> 0x02a6 }
        defpackage.bzm.a();	 Catch:{ Exception -> 0x02a6 }
        r4 = "startCodec";
        defpackage.bzm.a(r4);	 Catch:{ Exception -> 0x02a6 }
        r4 = r15.j;	 Catch:{ Exception -> 0x02a6 }
        r4.start();	 Catch:{ Exception -> 0x02a6 }
        defpackage.bzm.a();	 Catch:{ Exception -> 0x02a6 }
        r9 = android.os.SystemClock.elapsedRealtime();	 Catch:{ Exception -> 0x02a6 }
        r11 = r9 - r2;
        r7 = r15;
        r8 = r0;
        r7.a(r8, r9, r11);	 Catch:{ Exception -> 0x02a6 }
        r2 = defpackage.bzo.a;	 Catch:{ Exception -> 0x02a6 }
        if (r2 >= r14) goto L_0x02b1;
    L_0x0295:
        r2 = r15.j;	 Catch:{ Exception -> 0x02a6 }
        r2 = r2.getInputBuffers();	 Catch:{ Exception -> 0x02a6 }
        r15.F = r2;	 Catch:{ Exception -> 0x02a6 }
        r2 = r15.j;	 Catch:{ Exception -> 0x02a6 }
        r2 = r2.getOutputBuffers();	 Catch:{ Exception -> 0x02a6 }
        r15.G = r2;	 Catch:{ Exception -> 0x02a6 }
        goto L_0x02b1;
    L_0x02a6:
        r2 = move-exception;
        r3 = new bql$a;
        r4 = r15.t;
        r3.<init>(r4, r2, r1, r0);
        r15.a(r3);
    L_0x02b1:
        r0 = r15.c;
        if (r0 != r13) goto L_0x02bd;
    L_0x02b5:
        r0 = android.os.SystemClock.elapsedRealtime();
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 + r2;
        goto L_0x02c2;
    L_0x02bd:
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
    L_0x02c2:
        r15.H = r0;
        r15.y();
        r15.z();
        r15.U = r5;
        r0 = r15.l;
        r1 = r0.a;
        r1 = r1 + r5;
        r0.a = r1;
    L_0x02d3:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bql.t():void");
    }

    /* Access modifiers changed, original: protected */
    public void u() {
        bnc bnc;
        this.H = -9223372036854775807L;
        y();
        z();
        this.T = false;
        this.L = false;
        this.r.clear();
        if (bzo.a < 21) {
            this.F = null;
            this.G = null;
        }
        this.k = null;
        this.M = false;
        this.P = false;
        this.x = false;
        this.y = false;
        this.w = 0;
        this.z = false;
        this.A = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.Q = false;
        this.N = 0;
        this.O = 0;
        if (this.j != null) {
            bmx bmx = this.l;
            bmx.b++;
            try {
                this.j.stop();
                try {
                    this.j.release();
                    this.j = null;
                    bnc bnc2 = this.u;
                    if (bnc2 != null && this.v != bnc2) {
                        try {
                            this.m.a(bnc2);
                        } finally {
                            this.u = null;
                        }
                    }
                } catch (Throwable th) {
                    this.j = null;
                    bnc = this.u;
                    if (bnc != null && this.v != bnc) {
                        this.m.a(bnc);
                    }
                } finally {
                    this.u = null;
                }
            } catch (Throwable th2) {
                this.j = null;
                bnc = this.u;
                if (bnc != null && this.v != bnc) {
                    try {
                        this.m.a(bnc);
                    } catch (Throwable th3) {
                        this.u = null;
                    }
                }
            } finally {
                this.u = null;
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void v() {
        this.H = -9223372036854775807L;
        y();
        z();
        this.U = true;
        this.T = false;
        this.L = false;
        this.r.clear();
        this.D = false;
        this.E = false;
        if (this.y || ((this.A && this.Q) || this.O != 0)) {
            u();
            t();
        } else {
            this.j.flush();
            this.P = false;
        }
        if (this.M && this.t != null) {
            this.N = 1;
        }
    }
}
