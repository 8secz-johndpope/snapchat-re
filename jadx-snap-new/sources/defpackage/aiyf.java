package defpackage;

import com.google.common.base.Preconditions;
import defpackage.aiul.b;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aiyf */
public final class aiyf implements aixm {
    final aizh a;
    private final c b;
    private int c = -1;
    private aizg d;
    private aium e = b.a;
    private boolean f = true;
    private final b g = new b(this, (byte) 0);
    private final byte[] h = new byte[5];
    private final aiza i;
    private boolean j;
    private int k;
    private int l = -1;
    private long m;

    /* renamed from: aiyf$c */
    public interface c {
        void a(aizg aizg, boolean z, boolean z2, int i);
    }

    /* renamed from: aiyf$b */
    class b extends OutputStream {
        private b() {
        }

        /* synthetic */ b(aiyf aiyf, byte b) {
            this();
        }

        public final void write(int i) {
            write(new byte[]{(byte) i}, 0, 1);
        }

        public final void write(byte[] bArr, int i, int i2) {
            aiyf.this.a(bArr, i, i2);
        }
    }

    /* renamed from: aiyf$a */
    final class a extends OutputStream {
        final List<aizg> a;
        private aizg b;

        private a() {
            this.a = new ArrayList();
        }

        /* synthetic */ a(aiyf aiyf, byte b) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final int a() {
            int i = 0;
            for (aizg b : this.a) {
                i += b.b();
            }
            return i;
        }

        public final void write(int i) {
            aizg aizg = this.b;
            if (aizg == null || aizg.a() <= 0) {
                write(new byte[]{(byte) i}, 0, 1);
                return;
            }
            this.b.a((byte) i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:4:0x000f  */
        public final void write(byte[] r3, int r4, int r5) {
            /*
            r2 = this;
            r0 = r2.b;
            if (r0 != 0) goto L_0x000d;
        L_0x0004:
            r0 = defpackage.aiyf.this;
            r0 = r0.a;
            r0 = r0.a(r5);
            goto L_0x002f;
        L_0x000d:
            if (r5 <= 0) goto L_0x0041;
        L_0x000f:
            r0 = r2.b;
            r0 = r0.a();
            r0 = java.lang.Math.min(r5, r0);
            if (r0 != 0) goto L_0x0039;
        L_0x001b:
            r0 = r2.b;
            r0 = r0.b();
            r0 = r0 << 1;
            r0 = java.lang.Math.max(r5, r0);
            r1 = defpackage.aiyf.this;
            r1 = r1.a;
            r0 = r1.a(r0);
        L_0x002f:
            r2.b = r0;
            r0 = r2.a;
            r1 = r2.b;
            r0.add(r1);
            goto L_0x000d;
        L_0x0039:
            r1 = r2.b;
            r1.a(r3, r4, r0);
            r4 = r4 + r0;
            r5 = r5 - r0;
            goto L_0x000d;
        L_0x0041:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyf$a.write(byte[], int, int):void");
        }
    }

    public aiyf(c cVar, aizh aizh, aiza aiza) {
        this.b = (c) Preconditions.checkNotNull(cVar, "sink");
        this.a = (aizh) Preconditions.checkNotNull(aizh, "bufferAllocator");
        this.i = (aiza) Preconditions.checkNotNull(aiza, "statsTraceCtx");
    }

    private static int a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof aiuv) {
            return ((aiuv) inputStream).a();
        }
        long a = aixv.a(inputStream, outputStream);
        Preconditions.checkArgument(a <= 2147483647L, "Message size overflow: %s", a);
        return (int) a;
    }

    private void a(a aVar, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(this.h);
        wrap.put(z);
        int a = aVar.a();
        wrap.putInt(a);
        aizg a2 = this.a.a(5);
        a2.a(this.h, 0, wrap.position());
        if (a == 0) {
            this.d = a2;
            return;
        }
        this.b.a(a2, false, false, this.k - 1);
        this.k = 1;
        List list = aVar.a;
        for (int i = 0; i < list.size() - 1; i++) {
            this.b.a((aizg) list.get(i), false, false, 0);
        }
        this.d = (aizg) list.get(list.size() - 1);
        this.m = (long) a;
    }

    private void a(boolean z, boolean z2) {
        aizg aizg = this.d;
        this.d = null;
        this.b.a(aizg, z, z2, this.k);
        this.k = 0;
    }

    private int b(InputStream inputStream) {
        a aVar = new a(this, (byte) 0);
        OutputStream a = this.e.a(aVar);
        try {
            int a2 = aiyf.a(inputStream, a);
            int i = this.c;
            if (i < 0 || a2 <= i) {
                a(aVar, true);
                return a2;
            }
            throw aivw.h.a(String.format("message too large %d > %d", new Object[]{Integer.valueOf(a2), Integer.valueOf(this.c)})).c();
        } finally {
            a.close();
        }
    }

    public final void a() {
        aizg aizg = this.d;
        if (aizg != null && aizg.b() > 0) {
            a(false, true);
        }
    }

    public final void a(int i) {
        Preconditions.checkState(this.c == -1, "max size already set");
        this.c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A:{Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047  */
    public final void a(java.io.InputStream r10) {
        /*
        r9 = this;
        r0 = "Failed to frame message";
        r1 = r9.j;
        if (r1 != 0) goto L_0x012e;
    L_0x0006:
        r1 = r9.k;
        r2 = 1;
        r1 = r1 + r2;
        r9.k = r1;
        r1 = r9.l;
        r1 = r1 + r2;
        r9.l = r1;
        r3 = 0;
        r9.m = r3;
        r1 = r9.i;
        r1.a();
        r1 = r9.f;
        r3 = 0;
        if (r1 == 0) goto L_0x0027;
    L_0x001f:
        r1 = r9.e;
        r4 = defpackage.aiul.b.a;
        if (r1 == r4) goto L_0x0027;
    L_0x0025:
        r1 = 1;
        goto L_0x0028;
    L_0x0027:
        r1 = 0;
    L_0x0028:
        r4 = r10 instanceof defpackage.aivg;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r5 = -1;
        if (r4 != 0) goto L_0x0034;
    L_0x002d:
        r4 = r10 instanceof java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        if (r4 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0034;
    L_0x0032:
        r4 = -1;
        goto L_0x0038;
    L_0x0034:
        r4 = r10.available();	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
    L_0x0038:
        r6 = 2;
        if (r4 == 0) goto L_0x0043;
    L_0x003b:
        if (r1 == 0) goto L_0x0043;
    L_0x003d:
        r10 = r9.b(r10);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        goto L_0x00d3;
    L_0x0043:
        r1 = "message too large %d > %d";
        if (r4 == r5) goto L_0x009f;
    L_0x0047:
        r7 = (long) r4;
        r9.m = r7;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r7 = r9.c;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        if (r7 < 0) goto L_0x0072;
    L_0x004e:
        r7 = r9.c;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        if (r4 > r7) goto L_0x0053;
    L_0x0052:
        goto L_0x0072;
    L_0x0053:
        r10 = defpackage.aivw.h;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r5 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r5[r3] = r4;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r3 = r9.c;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r5[r2] = r3;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r1 = java.lang.String.format(r1, r5);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = r10.a(r1);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = r10.c();	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        throw r10;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
    L_0x0072:
        r1 = r9.h;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r1 = java.nio.ByteBuffer.wrap(r1);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r1.put(r3);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r1.putInt(r4);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r7 = r9.d;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        if (r7 != 0) goto L_0x008f;
    L_0x0082:
        r7 = r9.a;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r8 = r1.position();	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r8 = r8 + r4;
        r7 = r7.a(r8);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r9.d = r7;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
    L_0x008f:
        r7 = r9.h;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r1 = r1.position();	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r9.a(r7, r3, r1);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r1 = r9.g;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = defpackage.aiyf.a(r10, r1);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        goto L_0x00d3;
    L_0x009f:
        r7 = new aiyf$a;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r7.<init>(r9, r3);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = defpackage.aiyf.a(r10, r7);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r8 = r9.c;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        if (r8 < 0) goto L_0x00d0;
    L_0x00ac:
        r8 = r9.c;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        if (r10 > r8) goto L_0x00b1;
    L_0x00b0:
        goto L_0x00d0;
    L_0x00b1:
        r4 = defpackage.aivw.h;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r5 = new java.lang.Object[r6];	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r5[r3] = r10;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = r9.c;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r5[r2] = r10;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = java.lang.String.format(r1, r5);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = r4.a(r10);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        r10 = r10.c();	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
        throw r10;	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
    L_0x00d0:
        r9.a(r7, r3);	 Catch:{ IOException -> 0x011e, RuntimeException -> 0x010e }
    L_0x00d3:
        if (r4 == r5) goto L_0x00f7;
    L_0x00d5:
        if (r10 != r4) goto L_0x00d8;
    L_0x00d7:
        goto L_0x00f7;
    L_0x00d8:
        r0 = new java.lang.Object[r6];
        r10 = java.lang.Integer.valueOf(r10);
        r0[r3] = r10;
        r10 = java.lang.Integer.valueOf(r4);
        r0[r2] = r10;
        r10 = "Message length inaccurate %s != %s";
        r10 = java.lang.String.format(r10, r0);
        r0 = defpackage.aivw.i;
        r10 = r0.a(r10);
        r10 = r10.c();
        throw r10;
    L_0x00f7:
        r0 = r9.i;
        r5 = (long) r10;
        r0.a(r5);
        r10 = r9.i;
        r0 = r9.m;
        r10.b(r0);
        r1 = r9.i;
        r2 = r9.l;
        r3 = r9.m;
        r1.a(r2, r3, r5);
        return;
    L_0x010e:
        r10 = move-exception;
        r1 = defpackage.aivw.i;
        r0 = r1.a(r0);
        r10 = r0.b(r10);
        r10 = r10.c();
        throw r10;
    L_0x011e:
        r10 = move-exception;
        r1 = defpackage.aivw.i;
        r0 = r1.a(r0);
        r10 = r0.b(r10);
        r10 = r10.c();
        throw r10;
    L_0x012e:
        r10 = new java.lang.IllegalStateException;
        r0 = "Framer already closed";
        r10.<init>(r0);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyf.a(java.io.InputStream):void");
    }

    /* Access modifiers changed, original: final */
    public final void a(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            aizg aizg = this.d;
            if (aizg != null && aizg.a() == 0) {
                a(false, false);
            }
            if (this.d == null) {
                this.d = this.a.a(i2);
            }
            int min = Math.min(i2, this.d.a());
            this.d.a(bArr, i, min);
            i += min;
            i2 -= min;
        }
    }

    public final boolean b() {
        return this.j;
    }

    public final void c() {
        if (!this.j) {
            this.j = true;
            aizg aizg = this.d;
            if (!(aizg == null || aizg.b() != 0 || this.d == null)) {
                this.d = null;
            }
            a(true, true);
        }
    }
}
