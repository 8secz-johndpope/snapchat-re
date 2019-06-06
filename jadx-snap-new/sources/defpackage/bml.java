package defpackage;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import defpackage.bmh.c;
import defpackage.bmh.d;
import defpackage.bmj.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: bml */
public final class bml implements bmh {
    private long A;
    private ByteBuffer B;
    private int C;
    private int D;
    private long E;
    private long F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private long L;
    private float M;
    private bmf[] N;
    private ByteBuffer[] O;
    private ByteBuffer P;
    private ByteBuffer Q;
    private byte[] R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private int W;
    private boolean X;
    final ConditionVariable a;
    c b;
    long c;
    private final bme d;
    private final a e;
    private final boolean f;
    private final bmk g;
    private final bmt h;
    private final bmf[] i;
    private final bmf[] j;
    private final bmj k;
    private final ArrayDeque<c> l;
    private AudioTrack m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private bmd t;
    private boolean u;
    private boolean v;
    private int w;
    private blp x;
    private blp y;
    private long z;

    /* renamed from: bml$a */
    public interface a {
        long a(long j);

        blp a(blp blp);

        bmf[] a();

        long b();
    }

    /* renamed from: bml$b */
    public static class b implements a {
        private final bmf[] a;
        private final bmq b = new bmq();
        private final bms c = new bms();

        public b(bmf... bmfArr) {
            this.a = (bmf[]) Arrays.copyOf(bmfArr, bmfArr.length + 2);
            bmf[] bmfArr2 = this.a;
            bmfArr2[bmfArr.length] = this.b;
            bmfArr2[bmfArr.length + 1] = this.c;
        }

        public final long a(long j) {
            bms bms = this.c;
            if (bms.h < 1024) {
                double d = (double) bms.c;
                double d2 = (double) j;
                Double.isNaN(d);
                Double.isNaN(d2);
                return (long) (d * d2);
            } else if (bms.e == bms.b) {
                return bzo.b(j, bms.g, bms.h);
            } else {
                return bzo.b(j, bms.g * ((long) bms.e), bms.h * ((long) bms.b));
            }
        }

        public final blp a(blp blp) {
            bmq bmq = this.b;
            bmq.b = blp.d;
            bmq.h();
            bms bms = this.c;
            float a = bzo.a(blp.b, 0.1f, 8.0f);
            if (bms.c != a) {
                bms.c = a;
                bms.f = null;
            }
            bms.h();
            bms = this.c;
            float a2 = bzo.a(blp.c, 0.1f, 8.0f);
            if (bms.d != a2) {
                bms.d = a2;
                bms.f = null;
            }
            bms.h();
            return new blp(a, a2, blp.d);
        }

        public final bmf[] a() {
            return this.a;
        }

        public final long b() {
            return this.b.c;
        }
    }

    /* renamed from: bml$d */
    final class d implements a {
        private d() {
        }

        /* synthetic */ d(bml bml, byte b) {
            this();
        }

        public final void a(int i, long j) {
            if (bml.this.b != null) {
                bml.this.b.a(i, j, SystemClock.elapsedRealtime() - bml.this.c);
            }
        }

        public final void a(long j) {
            Log.w("AudioTrack", "Ignoring impossibly large audio latency: ".concat(String.valueOf(j)));
        }

        public final void a(long j, long j2, long j3, long j4) {
            StringBuilder stringBuilder = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
            stringBuilder.append(j);
            String str = ppy.d;
            stringBuilder.append(str);
            stringBuilder.append(j2);
            stringBuilder.append(str);
            stringBuilder.append(j3);
            stringBuilder.append(str);
            stringBuilder.append(j4);
            stringBuilder.append(str);
            stringBuilder.append(bml.this.k());
            stringBuilder.append(str);
            stringBuilder.append(bml.this.l());
            Log.w("AudioTrack", stringBuilder.toString());
        }

        public final void b(long j, long j2, long j3, long j4) {
            StringBuilder stringBuilder = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            stringBuilder.append(j);
            String str = ppy.d;
            stringBuilder.append(str);
            stringBuilder.append(j2);
            stringBuilder.append(str);
            stringBuilder.append(j3);
            stringBuilder.append(str);
            stringBuilder.append(j4);
            stringBuilder.append(str);
            stringBuilder.append(bml.this.k());
            stringBuilder.append(str);
            stringBuilder.append(bml.this.l());
            Log.w("AudioTrack", stringBuilder.toString());
        }
    }

    /* renamed from: bml$c */
    static final class c {
        final blp a;
        final long b;
        final long c;

        private c(blp blp, long j, long j2) {
            this.a = blp;
            this.b = j;
            this.c = j2;
        }

        /* synthetic */ c(blp blp, long j, long j2, byte b) {
            this(blp, j, j2);
        }
    }

    private bml(bme bme, a aVar) {
        this.d = bme;
        this.e = (a) byo.a((Object) aVar);
        this.f = false;
        this.a = new ConditionVariable(true);
        this.k = new bmj(new d(this, (byte) 0));
        this.g = new bmk();
        this.h = new bmt();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new bmf[]{new bmp(), this.g, this.h});
        Collections.addAll(arrayList, aVar.a());
        this.i = (bmf[]) arrayList.toArray(new bmf[arrayList.size()]);
        this.j = new bmf[]{new bmn()};
        this.M = 1.0f;
        this.K = 0;
        this.t = bmd.a;
        this.W = 0;
        this.y = blp.a;
        this.T = -1;
        this.N = new bmf[0];
        this.O = new ByteBuffer[0];
        this.l = new ArrayDeque();
    }

    public bml(bme bme, bmf[] bmfArr) {
        this(bme, bmfArr, (byte) 0);
    }

    private bml(bme bme, bmf[] bmfArr, byte b) {
        this(bme, new b(bmfArr));
    }

    @TargetApi(21)
    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.B == null) {
            this.B = ByteBuffer.allocate(16);
            this.B.order(ByteOrder.BIG_ENDIAN);
            this.B.putInt(1431633921);
        }
        if (this.C == 0) {
            this.B.putInt(4, i);
            this.B.putLong(8, j * 1000);
            this.B.position(0);
            this.C = i;
        }
        int remaining = this.B.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.B, remaining, 1);
            if (write < 0) {
                this.C = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, i, 1);
        if (write2 < 0) {
            this.C = 0;
            return write2;
        }
        this.C -= write2;
        return write2;
    }

    private void a(long j) {
        int length = this.N.length;
        int i = length;
        while (i >= 0) {
            ByteBuffer byteBuffer;
            if (i > 0) {
                byteBuffer = this.O[i - 1];
            } else {
                byteBuffer = this.P;
                if (byteBuffer == null) {
                    byteBuffer = bmf.a;
                }
            }
            if (i == length) {
                b(byteBuffer, j);
            } else {
                bmf bmf = this.N[i];
                bmf.a(byteBuffer);
                ByteBuffer f = bmf.f();
                this.O[i] = f;
                if (f.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    private long b(long j) {
        return (j * 1000000) / ((long) this.q);
    }

    private void b(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            int remaining;
            ByteBuffer byteBuffer2 = this.Q;
            boolean z = true;
            int i = 0;
            if (byteBuffer2 != null) {
                byo.a(byteBuffer2 == byteBuffer);
            } else {
                this.Q = byteBuffer;
                if (bzo.a < 21) {
                    remaining = byteBuffer.remaining();
                    byte[] bArr = this.R;
                    if (bArr == null || bArr.length < remaining) {
                        this.R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.R, 0, remaining);
                    byteBuffer.position(position);
                    this.S = 0;
                }
            }
            remaining = byteBuffer.remaining();
            if (bzo.a < 21) {
                int a = this.k.a(this.H);
                if (a > 0) {
                    i = this.m.write(this.R, this.S, Math.min(remaining, a));
                    if (i > 0) {
                        this.S += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else if (this.X) {
                if (j == -9223372036854775807L) {
                    z = false;
                }
                byo.b(z);
                i = a(this.m, byteBuffer, remaining, j);
            } else {
                i = this.m.write(byteBuffer, remaining, 1);
            }
            this.c = SystemClock.elapsedRealtime();
            if (i >= 0) {
                if (this.n) {
                    this.H += (long) i;
                }
                if (i == remaining) {
                    if (!this.n) {
                        this.I += (long) this.J;
                    }
                    this.Q = null;
                }
                return;
            }
            throw new d(i);
        }
    }

    private long c(long j) {
        return (j * ((long) this.q)) / 1000000;
    }

    private void m() {
        ArrayList arrayList = new ArrayList();
        for (bmf bmf : s()) {
            if (bmf.a()) {
                arrayList.add(bmf);
            } else {
                bmf.h();
            }
        }
        int size = arrayList.size();
        this.N = (bmf[]) arrayList.toArray(new bmf[size]);
        this.O = new ByteBuffer[size];
        n();
    }

    private void n() {
        int i = 0;
        while (true) {
            bmf[] bmfArr = this.N;
            if (i < bmfArr.length) {
                bmf bmf = bmfArr[i];
                bmf.h();
                this.O[i] = bmf.f();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    private boolean o() {
        /*
        r9 = this;
        r0 = r9.T;
        r1 = -1;
        r2 = 1;
        r3 = 0;
        if (r0 != r1) goto L_0x0014;
    L_0x0007:
        r0 = r9.u;
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        r0 = 0;
        goto L_0x0010;
    L_0x000d:
        r0 = r9.N;
        r0 = r0.length;
    L_0x0010:
        r9.T = r0;
        r0 = 1;
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        r4 = r9.T;
        r5 = r9.N;
        r6 = r5.length;
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r4 >= r6) goto L_0x0036;
    L_0x0021:
        r4 = r5[r4];
        if (r0 == 0) goto L_0x0028;
    L_0x0025:
        r4.e();
    L_0x0028:
        r9.a(r7);
        r0 = r4.g();
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return r3;
    L_0x0032:
        r0 = r9.T;
        r0 = r0 + r2;
        goto L_0x0010;
    L_0x0036:
        r0 = r9.Q;
        if (r0 == 0) goto L_0x0042;
    L_0x003a:
        r9.b(r0, r7);
        r0 = r9.Q;
        if (r0 == 0) goto L_0x0042;
    L_0x0041:
        return r3;
    L_0x0042:
        r9.T = r1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bml.o():boolean");
    }

    private void p() {
        if (q()) {
            if (bzo.a >= 21) {
                this.m.setVolume(this.M);
                return;
            }
            AudioTrack audioTrack = this.m;
            float f = this.M;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private boolean q() {
        return this.m != null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x00cb in {4, 8, 9, 12, 13, 14, 17, 18, 19, 20, 21, 22, 23, 26, 27, 30, 32, 34, 35} preds:[]
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
    private android.media.AudioTrack r() {
        /*
        r11 = this;
        r0 = defpackage.bzo.a;
        r1 = 0;
        r2 = 1;
        r3 = 3;
        r4 = 21;
        if (r0 < r4) goto L_0x0078;
        r0 = r11.X;
        if (r0 == 0) goto L_0x0026;
        r0 = new android.media.AudioAttributes$Builder;
        r0.<init>();
        r0 = r0.setContentType(r3);
        r3 = 16;
        r0 = r0.setFlags(r3);
        r0 = r0.setUsage(r2);
        r0 = r0.build();
        r4 = r0;
        goto L_0x004c;
        r0 = r11.t;
        r3 = r0.e;
        if (r3 != 0) goto L_0x0049;
        r3 = new android.media.AudioAttributes$Builder;
        r3.<init>();
        r4 = r0.b;
        r3 = r3.setContentType(r4);
        r4 = r0.c;
        r3 = r3.setFlags(r4);
        r4 = r0.d;
        r3 = r3.setUsage(r4);
        r3 = r3.build();
        r0.e = r3;
        r0 = r0.e;
        goto L_0x0024;
        r0 = new android.media.AudioFormat$Builder;
        r0.<init>();
        r3 = r11.r;
        r0 = r0.setChannelMask(r3);
        r3 = r11.s;
        r0 = r0.setEncoding(r3);
        r3 = r11.q;
        r0 = r0.setSampleRate(r3);
        r5 = r0.build();
        r0 = r11.W;
        if (r0 == 0) goto L_0x006d;
        r8 = r0;
        goto L_0x006e;
        r8 = 0;
        r0 = new android.media.AudioTrack;
        r6 = r11.w;
        r7 = 1;
        r3 = r0;
        r3.<init>(r4, r5, r6, r7, r8);
        goto L_0x00b5;
        r0 = r11.t;
        r0 = r0.d;
        switch(r0) {
            case 1: goto L_0x007f;
            case 2: goto L_0x0091;
            case 3: goto L_0x008c;
            case 4: goto L_0x0089;
            case 5: goto L_0x0086;
            case 6: goto L_0x0083;
            case 7: goto L_0x0086;
            case 8: goto L_0x0086;
            case 9: goto L_0x0086;
            case 10: goto L_0x0086;
            case 11: goto L_0x007f;
            case 12: goto L_0x007f;
            case 13: goto L_0x0081;
            case 14: goto L_0x007f;
            default: goto L_0x007f;
        };
        r4 = 3;
        goto L_0x0092;
        r4 = 1;
        goto L_0x0092;
        r1 = 2;
        r4 = 2;
        goto L_0x0092;
        r1 = 5;
        r4 = 5;
        goto L_0x0092;
        r1 = 4;
        r4 = 4;
        goto L_0x0092;
        r1 = 8;
        r4 = 8;
        goto L_0x0092;
        r4 = 0;
        r10 = r11.W;
        if (r10 != 0) goto L_0x00a6;
        r0 = new android.media.AudioTrack;
        r5 = r11.q;
        r6 = r11.r;
        r7 = r11.s;
        r8 = r11.w;
        r9 = 1;
        r3 = r0;
        r3.<init>(r4, r5, r6, r7, r8, r9);
        goto L_0x00b5;
        r0 = new android.media.AudioTrack;
        r5 = r11.q;
        r6 = r11.r;
        r7 = r11.s;
        r8 = r11.w;
        r9 = 1;
        r3 = r0;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10);
        r1 = r0.getState();
        if (r1 != r2) goto L_0x00bc;
        return r0;
        r0.release();	 Catch:{ Exception -> 0x00bf }
        r0 = new bmh$b;
        r2 = r11.q;
        r3 = r11.r;
        r4 = r11.w;
        r0.<init>(r1, r2, r3, r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bml.r():android.media.AudioTrack");
    }

    private bmf[] s() {
        return this.o ? this.j : this.i;
    }

    public final long a(boolean z) {
        if (!q() || this.K == 0) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.k.a(z), b(l()));
        long j = this.L;
        c cVar = null;
        while (!this.l.isEmpty() && min >= ((c) this.l.getFirst()).c) {
            cVar = (c) this.l.remove();
        }
        if (cVar != null) {
            this.y = cVar.a;
            this.A = cVar.c;
            this.z = cVar.b - this.L;
        }
        if (this.y.b == 1.0f) {
            min = (min + this.z) - this.A;
        } else {
            long j2;
            if (this.l.isEmpty()) {
                j2 = this.z;
                min = this.e.a(min - this.A);
            } else {
                j2 = this.z;
                min = bzo.a(min - this.A, this.y.b);
            }
            min += j2;
        }
        return j + (min + b(this.e.b()));
    }

    public final blp a(blp blp) {
        if (!q() || this.v) {
            Object obj = this.x;
            if (obj == null) {
                obj = !this.l.isEmpty() ? ((c) this.l.getLast()).a : this.y;
            }
            if (!blp.equals(obj)) {
                if (q()) {
                    this.x = blp;
                } else {
                    this.y = this.e.a(blp);
                }
            }
            return this.y;
        }
        this.y = blp.a;
        return this.y;
    }

    public final void a() {
        this.V = true;
        if (q()) {
            this.k.e.a();
            this.m.play();
        }
    }

    public final void a(float f) {
        if (this.M != f) {
            this.M = f;
            p();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0106  */
    public final void a(int r9, int r10, int r11, int[] r12, int r13, int r14) {
        /*
        r8 = this;
        r8.p = r11;
        r0 = defpackage.bzo.c(r9);
        r8.n = r0;
        r0 = 0;
        r8.o = r0;
        r1 = r8.n;
        if (r1 == 0) goto L_0x0015;
    L_0x000f:
        r1 = defpackage.bzo.a(r9, r10);
        r8.D = r1;
    L_0x0015:
        r1 = r8.n;
        r2 = 4;
        r3 = 1;
        if (r1 == 0) goto L_0x001f;
    L_0x001b:
        if (r9 == r2) goto L_0x001f;
    L_0x001d:
        r1 = 1;
        goto L_0x0020;
    L_0x001f:
        r1 = 0;
    L_0x0020:
        if (r1 == 0) goto L_0x0028;
    L_0x0022:
        r4 = r8.o;
        if (r4 != 0) goto L_0x0028;
    L_0x0026:
        r4 = 1;
        goto L_0x0029;
    L_0x0028:
        r4 = 0;
    L_0x0029:
        r8.v = r4;
        if (r1 == 0) goto L_0x0067;
    L_0x002d:
        r4 = r8.h;
        r4.b = r13;
        r4.c = r14;
        r13 = r8.g;
        r13.b = r12;
        r12 = r8.s();
        r13 = r12.length;
        r4 = r9;
        r14 = r11;
        r9 = 0;
        r11 = 0;
    L_0x0040:
        if (r9 >= r13) goto L_0x0065;
    L_0x0042:
        r5 = r12[r9];
        r6 = r5.a(r14, r10, r4);	 Catch:{ a -> 0x005e }
        r11 = r11 | r6;
        r6 = r5.a();
        if (r6 == 0) goto L_0x005b;
    L_0x004f:
        r10 = r5.b();
        r14 = r5.d();
        r4 = r5.c();
    L_0x005b:
        r9 = r9 + 1;
        goto L_0x0040;
    L_0x005e:
        r9 = move-exception;
        r10 = new bmh$a;
        r10.<init>(r9);
        throw r10;
    L_0x0065:
        r9 = r4;
        goto L_0x0069;
    L_0x0067:
        r14 = r11;
        r11 = 0;
    L_0x0069:
        r12 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r13 = 12;
        switch(r10) {
            case 1: goto L_0x0094;
            case 2: goto L_0x0092;
            case 3: goto L_0x008f;
            case 4: goto L_0x008c;
            case 5: goto L_0x0089;
            case 6: goto L_0x0086;
            case 7: goto L_0x0083;
            case 8: goto L_0x0080;
            default: goto L_0x0070;
        };
    L_0x0070:
        r9 = new bmh$a;
        r10 = java.lang.String.valueOf(r10);
        r11 = "Unsupported channel count: ";
        r10 = r11.concat(r10);
        r9.<init>(r10);
        throw r9;
    L_0x0080:
        r2 = defpackage.bkw.a;
        goto L_0x0094;
    L_0x0083:
        r2 = 1276; // 0x4fc float:1.788E-42 double:6.304E-321;
        goto L_0x0094;
    L_0x0086:
        r2 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        goto L_0x0094;
    L_0x0089:
        r2 = 220; // 0xdc float:3.08E-43 double:1.087E-321;
        goto L_0x0094;
    L_0x008c:
        r2 = 204; // 0xcc float:2.86E-43 double:1.01E-321;
        goto L_0x0094;
    L_0x008f:
        r2 = 28;
        goto L_0x0094;
    L_0x0092:
        r2 = 12;
    L_0x0094:
        r4 = defpackage.bzo.a;
        r5 = 23;
        r6 = 7;
        r7 = 5;
        if (r4 > r5) goto L_0x00bb;
    L_0x009c:
        r4 = defpackage.bzo.b;
        r5 = "foster";
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x00bb;
    L_0x00a6:
        r4 = defpackage.bzo.c;
        r5 = "NVIDIA";
        r4 = r5.equals(r4);
        if (r4 == 0) goto L_0x00bb;
    L_0x00b0:
        r4 = 3;
        if (r10 == r4) goto L_0x00bc;
    L_0x00b3:
        if (r10 == r7) goto L_0x00bc;
    L_0x00b5:
        if (r10 == r6) goto L_0x00b8;
    L_0x00b7:
        goto L_0x00bb;
    L_0x00b8:
        r12 = defpackage.bkw.a;
        goto L_0x00bc;
    L_0x00bb:
        r12 = r2;
    L_0x00bc:
        r2 = defpackage.bzo.a;
        r4 = 25;
        if (r2 > r4) goto L_0x00d4;
    L_0x00c2:
        r2 = defpackage.bzo.b;
        r4 = "fugu";
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x00d4;
    L_0x00cc:
        r2 = r8.n;
        if (r2 != 0) goto L_0x00d4;
    L_0x00d0:
        if (r10 != r3) goto L_0x00d4;
    L_0x00d2:
        r12 = 12;
    L_0x00d4:
        if (r11 != 0) goto L_0x00e9;
    L_0x00d6:
        r11 = r8.q();
        if (r11 == 0) goto L_0x00e9;
    L_0x00dc:
        r11 = r8.s;
        if (r11 != r9) goto L_0x00e9;
    L_0x00e0:
        r11 = r8.q;
        if (r11 != r14) goto L_0x00e9;
    L_0x00e4:
        r11 = r8.r;
        if (r11 != r12) goto L_0x00e9;
    L_0x00e8:
        return;
    L_0x00e9:
        r8.i();
        r8.u = r1;
        r8.q = r14;
        r8.r = r12;
        r8.s = r9;
        r9 = r8.n;
        if (r9 == 0) goto L_0x00ff;
    L_0x00f8:
        r9 = r8.s;
        r9 = defpackage.bzo.a(r9, r10);
        goto L_0x0100;
    L_0x00ff:
        r9 = -1;
    L_0x0100:
        r8.G = r9;
        r9 = r8.n;
        if (r9 == 0) goto L_0x0138;
    L_0x0106:
        r9 = r8.s;
        r9 = android.media.AudioTrack.getMinBufferSize(r14, r12, r9);
        r10 = -2;
        if (r9 == r10) goto L_0x0110;
    L_0x010f:
        r0 = 1;
    L_0x0110:
        defpackage.byo.b(r0);
        r10 = r9 << 2;
        r11 = 250000; // 0x3d090 float:3.50325E-40 double:1.235164E-318;
        r11 = r8.c(r11);
        r12 = (int) r11;
        r11 = r8.G;
        r12 = r12 * r11;
        r13 = (long) r9;
        r0 = 750000; // 0xb71b0 float:1.050974E-39 double:3.70549E-318;
        r0 = r8.c(r0);
        r9 = r8.G;
        r2 = (long) r9;
        r0 = r0 * r2;
        r13 = java.lang.Math.max(r13, r0);
        r9 = (int) r13;
        r9 = defpackage.bzo.a(r10, r12, r9);
    L_0x0135:
        r8.w = r9;
        return;
    L_0x0138:
        r9 = r8.s;
        if (r9 == r7) goto L_0x014a;
    L_0x013c:
        r10 = 6;
        if (r9 != r10) goto L_0x0140;
    L_0x013f:
        goto L_0x014a;
    L_0x0140:
        if (r9 != r6) goto L_0x0146;
    L_0x0142:
        r9 = 49152; // 0xc000 float:6.8877E-41 double:2.42843E-319;
        goto L_0x0135;
    L_0x0146:
        r9 = 294912; // 0x48000 float:4.1326E-40 double:1.45706E-318;
        goto L_0x0135;
    L_0x014a:
        r9 = 20480; // 0x5000 float:2.8699E-41 double:1.01185E-319;
        goto L_0x0135;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bml.a(int, int, int, int[], int, int):void");
    }

    public final void a(bmd bmd) {
        if (!this.t.equals(bmd)) {
            this.t = bmd;
            if (!this.X) {
                i();
                this.W = 0;
            }
        }
    }

    public final void a(c cVar) {
        this.b = cVar;
    }

    public final boolean a(int i) {
        if (bzo.c(i)) {
            return i != 4 || bzo.a >= 21;
        } else {
            bme bme = this.d;
            if (bme != null) {
                if ((Arrays.binarySearch(bme.b, i) >= 0 ? 1 : null) != null) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x020e A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f9 A:{RETURN} */
    /* JADX WARNING: Missing block: B:37:0x00d1, code skipped:
            if (r4.d() == 0) goto L_0x00c6;
     */
    public final boolean a(java.nio.ByteBuffer r26, long r27) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r26;
        r2 = r27;
        r4 = r0.P;
        r5 = 0;
        if (r4 == 0) goto L_0x0010;
    L_0x000b:
        if (r1 != r4) goto L_0x000e;
    L_0x000d:
        goto L_0x0010;
    L_0x000e:
        r4 = 0;
        goto L_0x0011;
    L_0x0010:
        r4 = 1;
    L_0x0011:
        defpackage.byo.a(r4);
        r4 = r25.q();
        r9 = 5;
        r10 = 6;
        r11 = 0;
        if (r4 != 0) goto L_0x00b1;
    L_0x001e:
        r4 = r0.a;
        r4.block();
        r4 = r25.r();
        r0.m = r4;
        r4 = r0.m;
        r4 = r4.getAudioSessionId();
        r13 = r0.W;
        if (r13 == r4) goto L_0x003c;
    L_0x0033:
        r0.W = r4;
        r13 = r0.b;
        if (r13 == 0) goto L_0x003c;
    L_0x0039:
        r13.a(r4);
    L_0x003c:
        r4 = r0.v;
        if (r4 == 0) goto L_0x0049;
    L_0x0040:
        r4 = r0.e;
        r13 = r0.y;
        r4 = r4.a(r13);
        goto L_0x004b;
    L_0x0049:
        r4 = defpackage.blp.a;
    L_0x004b:
        r0.y = r4;
        r25.m();
        r4 = r0.k;
        r13 = r0.m;
        r14 = r0.s;
        r15 = r0.G;
        r6 = r0.w;
        r4.b = r13;
        r4.c = r15;
        r4.d = r6;
        r7 = new bmi;
        r7.<init>(r13);
        r4.e = r7;
        r7 = r13.getSampleRate();
        r4.f = r7;
        r7 = defpackage.bzo.a;
        r8 = 23;
        if (r7 >= r8) goto L_0x0079;
    L_0x0073:
        if (r14 == r9) goto L_0x0077;
    L_0x0075:
        if (r14 != r10) goto L_0x0079;
    L_0x0077:
        r7 = 1;
        goto L_0x007a;
    L_0x0079:
        r7 = 0;
    L_0x007a:
        r4.g = r7;
        r7 = defpackage.bzo.c(r14);
        r4.k = r7;
        r7 = r4.k;
        if (r7 == 0) goto L_0x008d;
    L_0x0086:
        r6 = r6 / r15;
        r6 = (long) r6;
        r7 = r4.c(r6);
        goto L_0x0092;
    L_0x008d:
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
    L_0x0092:
        r4.h = r7;
        r4.l = r11;
        r4.m = r11;
        r4.n = r11;
        r4.j = r5;
        r6 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r4.o = r6;
        r4.p = r6;
        r4.i = r11;
        r25.p();
        r4 = r0.V;
        if (r4 == 0) goto L_0x00b1;
    L_0x00ae:
        r25.a();
    L_0x00b1:
        r4 = r0.k;
        r6 = r25.l();
        r8 = r4.b;
        r8 = r8.getPlayState();
        r13 = r4.g;
        r14 = 2;
        if (r13 == 0) goto L_0x00d4;
    L_0x00c2:
        if (r8 != r14) goto L_0x00c8;
    L_0x00c4:
        r4.j = r5;
    L_0x00c6:
        r4 = 0;
        goto L_0x00f7;
    L_0x00c8:
        r13 = 1;
        if (r8 != r13) goto L_0x00d4;
    L_0x00cb:
        r16 = r4.d();
        r13 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1));
        if (r13 != 0) goto L_0x00d4;
    L_0x00d3:
        goto L_0x00c6;
    L_0x00d4:
        r13 = r4.j;
        r6 = r4.b(r6);
        r4.j = r6;
        if (r13 == 0) goto L_0x00f6;
    L_0x00de:
        r6 = r4.j;
        if (r6 != 0) goto L_0x00f6;
    L_0x00e2:
        r6 = 1;
        if (r8 == r6) goto L_0x00f6;
    L_0x00e5:
        r6 = r4.a;
        if (r6 == 0) goto L_0x00f6;
    L_0x00e9:
        r6 = r4.a;
        r7 = r4.d;
        r11 = r4.h;
        r11 = defpackage.bkw.a(r11);
        r6.a(r7, r11);
    L_0x00f6:
        r4 = 1;
    L_0x00f7:
        if (r4 != 0) goto L_0x00fa;
    L_0x00f9:
        return r5;
    L_0x00fa:
        r4 = r0.P;
        r6 = "AudioTrack";
        r7 = 0;
        if (r4 != 0) goto L_0x02c2;
    L_0x0101:
        r4 = r26.hasRemaining();
        if (r4 != 0) goto L_0x0109;
    L_0x0107:
        r4 = 1;
        return r4;
    L_0x0109:
        r4 = r0.n;
        if (r4 != 0) goto L_0x020f;
    L_0x010d:
        r4 = r0.J;
        if (r4 != 0) goto L_0x020f;
    L_0x0111:
        r4 = r0.s;
        r8 = -1;
        r11 = 7;
        if (r4 == r11) goto L_0x01b2;
    L_0x0117:
        r12 = 8;
        if (r4 != r12) goto L_0x011d;
    L_0x011b:
        goto L_0x01b2;
    L_0x011d:
        if (r4 != r9) goto L_0x0124;
    L_0x011f:
        r4 = 1536; // 0x600 float:2.152E-42 double:7.59E-321;
    L_0x0121:
        r11 = 1;
        goto L_0x0208;
    L_0x0124:
        if (r4 != r10) goto L_0x014c;
    L_0x0126:
        r4 = r26.position();
        r4 = r4 + 4;
        r4 = r1.get(r4);
        r4 = r4 & 192;
        r4 = r4 >> r10;
        r8 = 3;
        if (r4 != r8) goto L_0x0137;
    L_0x0136:
        goto L_0x0149;
    L_0x0137:
        r4 = defpackage.bmc.a;
        r8 = r26.position();
        r8 = r8 + 4;
        r8 = r1.get(r8);
        r8 = r8 & 48;
        r8 = r8 >> 4;
        r10 = r4[r8];
    L_0x0149:
        r4 = r10 * 256;
        goto L_0x0121;
    L_0x014c:
        r9 = 14;
        if (r4 != r9) goto L_0x01a2;
    L_0x0150:
        r4 = r26.position();
        r9 = r26.limit();
        r9 = r9 + -10;
        r10 = r4;
    L_0x015b:
        if (r10 > r9) goto L_0x0172;
    L_0x015d:
        r13 = r10 + 4;
        r13 = r1.getInt(r13);
        r15 = -16777217; // 0xfffffffffeffffff float:-1.7014117E38 double:NaN;
        r13 = r13 & r15;
        r15 = -1167101192; // 0xffffffffba6f72f8 float:-9.134258E-4 double:NaN;
        if (r13 != r15) goto L_0x016f;
    L_0x016c:
        r4 = r10 - r4;
        goto L_0x0173;
    L_0x016f:
        r10 = r10 + 1;
        goto L_0x015b;
    L_0x0172:
        r4 = -1;
    L_0x0173:
        if (r4 != r8) goto L_0x0177;
    L_0x0175:
        r4 = 0;
        goto L_0x0121;
    L_0x0177:
        r8 = r26.position();
        r8 = r8 + r4;
        r8 = r8 + r11;
        r8 = r1.get(r8);
        r8 = r8 & 255;
        r9 = 187; // 0xbb float:2.62E-43 double:9.24E-322;
        if (r8 != r9) goto L_0x0189;
    L_0x0187:
        r8 = 1;
        goto L_0x018a;
    L_0x0189:
        r8 = 0;
    L_0x018a:
        r9 = 40;
        r10 = r26.position();
        r10 = r10 + r4;
        if (r8 == 0) goto L_0x0195;
    L_0x0193:
        r12 = 9;
    L_0x0195:
        r10 = r10 + r12;
        r4 = r1.get(r10);
        r4 = r4 >> 4;
        r4 = r4 & r11;
        r4 = r9 << r4;
        r4 = r4 << 4;
        goto L_0x0121;
    L_0x01a2:
        r1 = new java.lang.IllegalStateException;
        r2 = java.lang.String.valueOf(r4);
        r3 = "Unexpected audio encoding: ";
        r2 = r3.concat(r2);
        r1.<init>(r2);
        throw r1;
    L_0x01b2:
        r4 = r26.position();
        r12 = r1.get(r4);
        r13 = -2;
        if (r12 == r13) goto L_0x01f3;
    L_0x01bd:
        if (r12 == r8) goto L_0x01e2;
    L_0x01bf:
        r8 = 31;
        if (r12 == r8) goto L_0x01d7;
    L_0x01c3:
        r8 = r4 + 4;
        r8 = r1.get(r8);
        r11 = 1;
        r8 = r8 & r11;
        r8 = r8 << r10;
        r4 = r4 + r9;
        r4 = r1.get(r4);
        r4 = r4 & 252;
    L_0x01d3:
        r4 = r4 >> r14;
        r4 = r4 | r8;
        r11 = 1;
        goto L_0x0206;
    L_0x01d7:
        r8 = r4 + 5;
        r8 = r1.get(r8);
        r8 = r8 & r11;
        r8 = r8 << 4;
        r4 = r4 + r10;
        goto L_0x01ec;
    L_0x01e2:
        r8 = r4 + 4;
        r8 = r1.get(r8);
        r8 = r8 & r11;
        r8 = r8 << 4;
        r4 = r4 + r11;
    L_0x01ec:
        r4 = r1.get(r4);
        r4 = r4 & 60;
        goto L_0x01d3;
    L_0x01f3:
        r8 = r4 + 5;
        r8 = r1.get(r8);
        r11 = 1;
        r8 = r8 & r11;
        r8 = r8 << r10;
        r4 = r4 + 4;
        r4 = r1.get(r4);
        r4 = r4 & 252;
        r4 = r4 >> r14;
        r4 = r4 | r8;
    L_0x0206:
        r4 = r4 + r11;
        r4 = r4 << r9;
    L_0x0208:
        r0.J = r4;
        r4 = r0.J;
        if (r4 != 0) goto L_0x020f;
    L_0x020e:
        return r11;
    L_0x020f:
        r4 = r0.x;
        if (r4 == 0) goto L_0x0243;
    L_0x0213:
        r4 = r25.o();
        if (r4 != 0) goto L_0x021a;
    L_0x0219:
        return r5;
    L_0x021a:
        r4 = r0.x;
        r0.x = r7;
        r8 = r0.e;
        r19 = r8.a(r4);
        r4 = r0.l;
        r8 = new bml$c;
        r9 = 0;
        r20 = java.lang.Math.max(r9, r2);
        r9 = r25.l();
        r22 = r0.b(r9);
        r24 = 0;
        r18 = r8;
        r18.<init>(r19, r20, r22, r24);
        r4.add(r8);
        r25.m();
    L_0x0243:
        r4 = r0.K;
        if (r4 != 0) goto L_0x0253;
    L_0x0247:
        r8 = 0;
        r10 = java.lang.Math.max(r8, r2);
        r0.L = r10;
        r4 = 1;
        r0.K = r4;
        goto L_0x02a9;
    L_0x0253:
        r4 = 1;
        r8 = r0.L;
        r10 = r25.k();
        r12 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r10 = r10 * r12;
        r12 = r0.p;
        r12 = (long) r12;
        r10 = r10 / r12;
        r8 = r8 + r10;
        r10 = r0.K;
        if (r10 != r4) goto L_0x0294;
    L_0x0267:
        r10 = r8 - r2;
        r10 = java.lang.Math.abs(r10);
        r12 = 200000; // 0x30d40 float:2.8026E-40 double:9.8813E-319;
        r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r4 <= 0) goto L_0x0294;
    L_0x0274:
        r4 = new java.lang.StringBuilder;
        r10 = "Discontinuity detected [expected ";
        r4.<init>(r10);
        r4.append(r8);
        r10 = ", got ";
        r4.append(r10);
        r4.append(r2);
        r10 = "]";
        r4.append(r10);
        r4 = r4.toString();
        android.util.Log.e(r6, r4);
        r0.K = r14;
    L_0x0294:
        r4 = r0.K;
        if (r4 != r14) goto L_0x02a9;
    L_0x0298:
        r10 = r0.L;
        r8 = r2 - r8;
        r10 = r10 + r8;
        r0.L = r10;
        r4 = 1;
        r0.K = r4;
        r4 = r0.b;
        if (r4 == 0) goto L_0x02a9;
    L_0x02a6:
        r4.a();
    L_0x02a9:
        r4 = r0.n;
        if (r4 == 0) goto L_0x02b8;
    L_0x02ad:
        r8 = r0.E;
        r4 = r26.remaining();
        r10 = (long) r4;
        r8 = r8 + r10;
        r0.E = r8;
        goto L_0x02c0;
    L_0x02b8:
        r8 = r0.F;
        r4 = r0.J;
        r10 = (long) r4;
        r8 = r8 + r10;
        r0.F = r8;
    L_0x02c0:
        r0.P = r1;
    L_0x02c2:
        r1 = r0.u;
        if (r1 == 0) goto L_0x02ca;
    L_0x02c6:
        r0.a(r2);
        goto L_0x02cf;
    L_0x02ca:
        r1 = r0.P;
        r0.b(r1, r2);
    L_0x02cf:
        r1 = r0.P;
        r1 = r1.hasRemaining();
        if (r1 != 0) goto L_0x02db;
    L_0x02d7:
        r0.P = r7;
    L_0x02d9:
        r1 = 1;
        return r1;
    L_0x02db:
        r1 = r0.k;
        r2 = r25.l();
        r7 = r1.p;
        r9 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r4 == 0) goto L_0x0301;
    L_0x02ec:
        r7 = 0;
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 <= 0) goto L_0x0301;
    L_0x02f2:
        r2 = android.os.SystemClock.elapsedRealtime();
        r7 = r1.p;
        r2 = r2 - r7;
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r1 < 0) goto L_0x0301;
    L_0x02ff:
        r1 = 1;
        goto L_0x0302;
    L_0x0301:
        r1 = 0;
    L_0x0302:
        if (r1 == 0) goto L_0x030d;
    L_0x0304:
        r1 = "Resetting stalled audio track";
        android.util.Log.w(r6, r1);
        r25.i();
        goto L_0x02d9;
    L_0x030d:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bml.a(java.nio.ByteBuffer, long):boolean");
    }

    public final void b() {
        if (this.K == 1) {
            this.K = 2;
        }
    }

    public final void b(int i) {
        byo.b(bzo.a >= 21);
        if (!this.X || this.W != i) {
            this.X = true;
            this.W = i;
            i();
        }
    }

    public final void c() {
        if (!this.U && q() && o()) {
            bmj bmj = this.k;
            long l = l();
            bmj.q = bmj.d();
            bmj.o = SystemClock.elapsedRealtime() * 1000;
            bmj.r = l;
            this.m.stop();
            this.C = 0;
            this.U = true;
        }
    }

    public final boolean d() {
        return !q() || (this.U && !e());
    }

    public final boolean e() {
        return q() && this.k.b(l());
    }

    public final blp f() {
        return this.y;
    }

    public final void g() {
        if (this.X) {
            this.X = false;
            this.W = 0;
            i();
        }
    }

    public final void h() {
        boolean z = false;
        this.V = false;
        if (q()) {
            bmj bmj = this.k;
            bmj.c();
            if (bmj.o == -9223372036854775807L) {
                bmj.e.a();
                z = true;
            }
            if (z) {
                this.m.pause();
            }
        }
    }

    public final void i() {
        if (q()) {
            this.E = 0;
            this.F = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            blp blp = this.x;
            if (blp != null) {
                this.y = blp;
                this.x = null;
            } else if (!this.l.isEmpty()) {
                this.y = ((c) this.l.getLast()).a;
            }
            this.l.clear();
            this.z = 0;
            this.A = 0;
            this.P = null;
            this.Q = null;
            n();
            this.U = false;
            this.T = -1;
            this.B = null;
            this.C = 0;
            this.K = 0;
            if (this.k.a()) {
                this.m.pause();
            }
            final AudioTrack audioTrack = this.m;
            this.m = null;
            this.k.b();
            this.a.close();
            new Thread() {
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        bml.this.a.open();
                    }
                }
            }.start();
        }
    }

    public final void j() {
        int i;
        i();
        for (bmf i2 : this.i) {
            i2.i();
        }
        bmf[] bmfArr = this.j;
        for (i = 0; i <= 0; i++) {
            bmfArr[i].i();
        }
        this.W = 0;
        this.V = false;
    }

    /* Access modifiers changed, original: final */
    public final long k() {
        return this.n ? this.E / ((long) this.D) : this.F;
    }

    /* Access modifiers changed, original: final */
    public final long l() {
        return this.n ? this.H / ((long) this.G) : this.I;
    }
}
