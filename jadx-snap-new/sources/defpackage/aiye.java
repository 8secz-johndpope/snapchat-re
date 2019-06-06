package defpackage;

import com.google.common.base.Preconditions;
import com.snap.core.db.record.UnlockablesModel;
import defpackage.aiul.b;
import defpackage.aizc.a;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: aiye */
public final class aiye implements aixa, Closeable {
    a a;
    int b;
    volatile boolean c = false;
    private final aiza d;
    private final aizf e;
    private aiut f;
    private aixp g;
    private byte[] h;
    private int i;
    private d j = d.HEADER;
    private int k = 5;
    private boolean l;
    private aiww m;
    private aiww n = new aiww();
    private long o;
    private boolean p = false;
    private int q = -1;
    private int r;
    private boolean s = false;

    /* renamed from: aiye$a */
    public interface a {
        void a(defpackage.aizc.a aVar);

        void a(Throwable th);

        void a(boolean z);

        void c(int i);
    }

    /* renamed from: aiye$d */
    enum d {
        HEADER,
        BODY
    }

    /* renamed from: aiye$c */
    static final class c extends FilterInputStream {
        private final int a;
        private final aiza b;
        private long c;
        private long d;
        private long e = -1;

        c(InputStream inputStream, int i, aiza aiza) {
            super(inputStream);
            this.a = i;
            this.b = aiza;
        }

        private void a() {
            long j = this.d;
            long j2 = this.c;
            if (j > j2) {
                this.b.c(j - j2);
                this.c = this.d;
            }
        }

        private void b() {
            if (this.d > ((long) this.a)) {
                throw aivw.h.a(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", new Object[]{Integer.valueOf(this.a), Long.valueOf(this.d)})).c();
            }
        }

        public final synchronized void mark(int i) {
            this.in.mark(i);
            this.e = this.d;
        }

        public final int read() {
            int read = this.in.read();
            if (read != -1) {
                this.d++;
            }
            b();
            a();
            return read;
        }

        public final int read(byte[] bArr, int i, int i2) {
            int read = this.in.read(bArr, i, i2);
            if (read != -1) {
                this.d += (long) read;
            }
            b();
            a();
            return read;
        }

        public final synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.e != -1) {
                this.in.reset();
                this.d = this.e;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public final long skip(long j) {
            j = this.in.skip(j);
            this.d += j;
            b();
            a();
            return j;
        }
    }

    /* renamed from: aiye$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[d.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.aiye.d.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.aiye.d.HEADER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.aiye.d.BODY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aiye$1.<clinit>():void");
        }
    }

    /* renamed from: aiye$b */
    static class b implements a {
        private InputStream a;

        private b(InputStream inputStream) {
            this.a = inputStream;
        }

        /* synthetic */ b(InputStream inputStream, byte b) {
            this(inputStream);
        }

        public final InputStream a() {
            InputStream inputStream = this.a;
            this.a = null;
            return inputStream;
        }
    }

    public aiye(a aVar, aiut aiut, int i, aiza aiza, aizf aizf) {
        this.a = (a) Preconditions.checkNotNull(aVar, "sink");
        this.f = (aiut) Preconditions.checkNotNull(aiut, "decompressor");
        this.b = i;
        this.d = (aiza) Preconditions.checkNotNull(aiza, "statsTraceCtx");
        this.e = (aizf) Preconditions.checkNotNull(aizf, "transportTracer");
    }

    private boolean c() {
        return b() || this.s;
    }

    private boolean d() {
        aixp aixp = this.g;
        return aixp != null ? aixp.a() : this.n.a == 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:36:0x006d in {2, 16, 18, 19, 24, 30, 32, 35} preds:[]
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
    private void e() {
        /*
        r7 = this;
        r0 = r7.p;
        if (r0 == 0) goto L_0x0005;
        return;
        r0 = 1;
        r7.p = r0;
        r1 = 0;
        r2 = r7.c;	 Catch:{ all -> 0x0069 }
        if (r2 != 0) goto L_0x004f;	 Catch:{ all -> 0x0069 }
        r2 = r7.o;	 Catch:{ all -> 0x0069 }
        r4 = 0;	 Catch:{ all -> 0x0069 }
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ all -> 0x0069 }
        if (r6 <= 0) goto L_0x004f;	 Catch:{ all -> 0x0069 }
        r2 = r7.f();	 Catch:{ all -> 0x0069 }
        if (r2 == 0) goto L_0x004f;	 Catch:{ all -> 0x0069 }
        r2 = defpackage.aiye.1.a;	 Catch:{ all -> 0x0069 }
        r3 = r7.j;	 Catch:{ all -> 0x0069 }
        r3 = r3.ordinal();	 Catch:{ all -> 0x0069 }
        r2 = r2[r3];	 Catch:{ all -> 0x0069 }
        if (r2 == r0) goto L_0x004b;	 Catch:{ all -> 0x0069 }
        r3 = 2;	 Catch:{ all -> 0x0069 }
        if (r2 != r3) goto L_0x0035;	 Catch:{ all -> 0x0069 }
        r7.h();	 Catch:{ all -> 0x0069 }
        r2 = r7.o;	 Catch:{ all -> 0x0069 }
        r4 = 1;	 Catch:{ all -> 0x0069 }
        r2 = r2 - r4;	 Catch:{ all -> 0x0069 }
        r7.o = r2;	 Catch:{ all -> 0x0069 }
        goto L_0x0008;	 Catch:{ all -> 0x0069 }
        r0 = new java.lang.AssertionError;	 Catch:{ all -> 0x0069 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0069 }
        r3 = "Invalid state: ";	 Catch:{ all -> 0x0069 }
        r2.<init>(r3);	 Catch:{ all -> 0x0069 }
        r3 = r7.j;	 Catch:{ all -> 0x0069 }
        r2.append(r3);	 Catch:{ all -> 0x0069 }
        r2 = r2.toString();	 Catch:{ all -> 0x0069 }
        r0.<init>(r2);	 Catch:{ all -> 0x0069 }
        throw r0;	 Catch:{ all -> 0x0069 }
        r7.g();	 Catch:{ all -> 0x0069 }
        goto L_0x0008;	 Catch:{ all -> 0x0069 }
        r0 = r7.c;	 Catch:{ all -> 0x0069 }
        if (r0 == 0) goto L_0x0059;	 Catch:{ all -> 0x0069 }
        r7.close();	 Catch:{ all -> 0x0069 }
        r7.p = r1;
        return;
        r0 = r7.s;	 Catch:{ all -> 0x0069 }
        if (r0 == 0) goto L_0x0066;	 Catch:{ all -> 0x0069 }
        r0 = r7.d();	 Catch:{ all -> 0x0069 }
        if (r0 == 0) goto L_0x0066;	 Catch:{ all -> 0x0069 }
        r7.close();	 Catch:{ all -> 0x0069 }
        r7.p = r1;
        return;
        r0 = move-exception;
        r7.p = r1;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiye.e():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:165:0x02da in {4, 15, 16, 19, 20, 29, 32, 33, 36, 37, 40, 41, 42, 45, 46, 49, 50, 53, 54, 59, 62, 64, 65, 70, 71, 76, 77, 80, 81, 84, 87, 88, 91, 96, 98, 100, 102, 108, 109, 118, 119, 120, 123, 127, 130, 138, 139, 140, 143, 149, 150, 151, 152, 154, 156, 162, 163, 164} preds:[]
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
    private boolean f() {
        /*
        r14 = this;
        r0 = 0;
        r1 = r14.m;	 Catch:{ all -> 0x02ad }
        if (r1 != 0) goto L_0x000c;	 Catch:{ all -> 0x02ad }
        r1 = new aiww;	 Catch:{ all -> 0x02ad }
        r1.<init>();	 Catch:{ all -> 0x02ad }
        r14.m = r1;	 Catch:{ all -> 0x02ad }
        r1 = 0;
        r2 = 0;
        r3 = r14.k;	 Catch:{ all -> 0x02ab }
        r4 = r14.m;	 Catch:{ all -> 0x02ab }
        r4 = r4.a;	 Catch:{ all -> 0x02ab }
        r3 = r3 - r4;	 Catch:{ all -> 0x02ab }
        r4 = 1;	 Catch:{ all -> 0x02ab }
        if (r3 <= 0) goto L_0x0284;	 Catch:{ all -> 0x02ab }
        r5 = r14.g;	 Catch:{ all -> 0x02ab }
        if (r5 == 0) goto L_0x023f;
        r5 = r14.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r5 == 0) goto L_0x0027;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = r14.i;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r6 = r14.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r6 = r6.length;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r5 != r6) goto L_0x0033;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = java.lang.Math.min(r3, r5);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = new byte[r5];	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r14.h = r5;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r14.i = r0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = r14.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = r5.length;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r6 = r14.i;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = r5 - r6;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = java.lang.Math.min(r3, r5);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = r14.g;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r6 = r14.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r7 = r14.i;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.i;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != 0) goto L_0x0049;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 1;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x004a;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r9 = "GzipInflatingBuffer is closed";	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        com.google.common.base.Preconditions.checkState(r8, r9);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 1;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r9 = 0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = 10;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 == 0) goto L_0x01cf;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r11 = r3 - r9;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r11 <= 0) goto L_0x01cf;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.1.a;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r12 = r5.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r12 = r12.ordinal();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8[r12];	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r12 = 8;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r13 = 2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        switch(r8) {
            case 1: goto L_0x017c;
            case 2: goto L_0x015c;
            case 3: goto L_0x0145;
            case 4: goto L_0x0132;
            case 5: goto L_0x011e;
            case 6: goto L_0x00f1;
            case 7: goto L_0x00c5;
            case 8: goto L_0x00b5;
            case 9: goto L_0x0072;
            case 10: goto L_0x006d;
            default: goto L_0x0069;
        };	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r0 = new java.lang.AssertionError;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x01bb;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.b();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0051;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.g;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 == 0) goto L_0x0078;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 1;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0079;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = "inflater is null";	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        com.google.common.base.Preconditions.checkState(r8, r10);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.e;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r5.f;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != r10) goto L_0x0086;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 1;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0087;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = "inflaterInput has unconsumed bytes";	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        com.google.common.base.Preconditions.checkState(r8, r10);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.a;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.a;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = 512; // 0x200 float:7.175E-43 double:2.53E-321;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = java.lang.Math.min(r8, r10);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != 0) goto L_0x009a;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0051;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5.e = r0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5.f = r8;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r5.a;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r11 = r5.d;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r12 = r5.e;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10.a(r11, r12, r8);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r5.g;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r11 = r5.d;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r12 = r5.e;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10.setInput(r11, r12, r8);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.INFLATING;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5.h = r8;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00c3;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r7 + r9;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.a(r6, r8, r11);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r9 = r9 + r8;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = defpackage.aixp.b.TRAILER;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != r10) goto L_0x00c3;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x006d;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = 1;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0051;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.g;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != 0) goto L_0x00d1;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = new java.util.zip.Inflater;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8.<init>(r4);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5.g = r8;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00d6;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.g;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8.reset();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.b;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8.reset();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.f;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r5.e;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8 - r10;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 <= 0) goto L_0x00ee;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r5.g;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r11 = r5.d;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r12 = r5.e;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10.setInput(r11, r12, r8);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.INFLATING;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.INFLATER_NEEDS_INPUT;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.j;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8 & r13;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != r13) goto L_0x011b;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.b();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 >= r13) goto L_0x00ff;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0098;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.b;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r8.getValue();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = (int) r10;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8 & r10;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r10.c();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != r10) goto L_0x0113;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x011b;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r0 = new java.util.zip.ZipException;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = "Corrupt GZIP header";	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        throw r0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.INITIALIZE_INFLATER;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.j;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = 16;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8 & r10;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != r10) goto L_0x012f;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.a.a(r8);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != 0) goto L_0x012f;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0098;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.HEADER_CRC;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.j;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8 & r12;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != r12) goto L_0x0141;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.a.a(r8);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != 0) goto L_0x0141;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0098;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.HEADER_COMMENT;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.b();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r5.k;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 >= r10) goto L_0x0151;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0098;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = r5.k;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        defpackage.aixp.a.a(r8, r10);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.HEADER_NAME;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.j;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = 4;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8 & r10;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 == r10) goto L_0x0166;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.HEADER_NAME;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.b();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 >= r13) goto L_0x0170;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0098;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.c();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5.k = r8;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.HEADER_EXTRA;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.b();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 >= r10) goto L_0x0186;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x0098;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.c();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = 35615; // 0x8b1f float:4.9907E-41 double:1.7596E-319;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != r10) goto L_0x01b3;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.a();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 != r12) goto L_0x01ab;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r8.a();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5.j = r8;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r10 = 6;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        defpackage.aixp.a.a(r8, r10);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r8 = defpackage.aixp.b.HEADER_EXTRA_LEN;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x00b2;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r0 = new java.util.zip.ZipException;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = "Unsupported compression method";	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        throw r0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r0 = new java.util.zip.ZipException;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = "Not in GZIP format";	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        throw r0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r4 = "Invalid state: ";	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r4 = r5.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3.append(r4);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r0.<init>(r3);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        throw r0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r8 == 0) goto L_0x01e1;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = r5.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r6 = defpackage.aixp.b.HEADER;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r3 != r6) goto L_0x01e0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = r5.c;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = r3.b();	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        if (r3 >= r10) goto L_0x01e0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x01e1;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r4 = 0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5.n = r4;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = r14.g;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r4 = r3.l;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3.l = r0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r1 = r1 + r4;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = r14.g;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r4 = r3.m;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3.m = r0;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r2 = r2 + r4;
        if (r9 != 0) goto L_0x021c;
        if (r1 <= 0) goto L_0x021b;
        r3 = r14.a;
        r3.c(r1);
        r3 = r14.j;
        r4 = defpackage.aiye.d.BODY;
        if (r3 != r4) goto L_0x021b;
        r3 = r14.g;
        if (r3 == 0) goto L_0x0210;
        r1 = r14.d;
        r3 = (long) r2;
        r1.d(r3);
        r1 = r14.r;
        r1 = r1 + r2;
        r14.r = r1;
        goto L_0x021b;
        r2 = r14.d;
        r3 = (long) r1;
        r2.d(r3);
        r2 = r14.r;
        r2 = r2 + r1;
        r14.r = r2;
        return r0;
        r3 = r14.m;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r4 = r14.h;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r5 = r14.i;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r6 = new aiyp$b;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r6.<init>(r4, r5, r9);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3.a(r6);	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = r14.i;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r3 = r3 + r9;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        r14.i = r3;	 Catch:{ IOException -> 0x0238, DataFormatException -> 0x0231 }
        goto L_0x000e;
        r0 = move-exception;
        r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x02ab }
        r3.<init>(r0);	 Catch:{ all -> 0x02ab }
        throw r3;	 Catch:{ all -> 0x02ab }
        r0 = move-exception;	 Catch:{ all -> 0x02ab }
        r3 = new java.lang.RuntimeException;	 Catch:{ all -> 0x02ab }
        r3.<init>(r0);	 Catch:{ all -> 0x02ab }
        throw r3;	 Catch:{ all -> 0x02ab }
        r4 = r14.n;	 Catch:{ all -> 0x02ab }
        r4 = r4.a;	 Catch:{ all -> 0x02ab }
        if (r4 != 0) goto L_0x026e;
        if (r1 <= 0) goto L_0x026d;
        r3 = r14.a;
        r3.c(r1);
        r3 = r14.j;
        r4 = defpackage.aiye.d.BODY;
        if (r3 != r4) goto L_0x026d;
        r3 = r14.g;
        if (r3 == 0) goto L_0x0262;
        r1 = r14.d;
        r3 = (long) r2;
        r1.d(r3);
        r1 = r14.r;
        r1 = r1 + r2;
        r14.r = r1;
        goto L_0x026d;
        r2 = r14.d;
        r3 = (long) r1;
        r2.d(r3);
        r2 = r14.r;
        r2 = r2 + r1;
        r14.r = r2;
        return r0;
        r4 = r14.n;	 Catch:{ all -> 0x02ab }
        r4 = r4.a;	 Catch:{ all -> 0x02ab }
        r3 = java.lang.Math.min(r3, r4);	 Catch:{ all -> 0x02ab }
        r1 = r1 + r3;	 Catch:{ all -> 0x02ab }
        r4 = r14.m;	 Catch:{ all -> 0x02ab }
        r5 = r14.n;	 Catch:{ all -> 0x02ab }
        r3 = r5.c(r3);	 Catch:{ all -> 0x02ab }
        r4.a(r3);	 Catch:{ all -> 0x02ab }
        goto L_0x000e;
        if (r1 <= 0) goto L_0x02aa;
        r0 = r14.a;
        r0.c(r1);
        r0 = r14.j;
        r3 = defpackage.aiye.d.BODY;
        if (r0 != r3) goto L_0x02aa;
        r0 = r14.g;
        if (r0 == 0) goto L_0x029f;
        r0 = r14.d;
        r5 = (long) r2;
        r0.d(r5);
        r0 = r14.r;
        r0 = r0 + r2;
        goto L_0x02a8;
        r0 = r14.d;
        r2 = (long) r1;
        r0.d(r2);
        r0 = r14.r;
        r0 = r0 + r1;
        r14.r = r0;
        return r4;
        r0 = move-exception;
        goto L_0x02b1;
        r1 = move-exception;
        r0 = r1;
        r1 = 0;
        r2 = 0;
        if (r1 <= 0) goto L_0x02d9;
        r3 = r14.a;
        r3.c(r1);
        r3 = r14.j;
        r4 = defpackage.aiye.d.BODY;
        if (r3 != r4) goto L_0x02d9;
        r3 = r14.g;
        if (r3 == 0) goto L_0x02ce;
        r1 = r14.d;
        r3 = (long) r2;
        r1.d(r3);
        r1 = r14.r;
        r1 = r1 + r2;
        r14.r = r1;
        goto L_0x02d9;
        r2 = r14.d;
        r3 = (long) r1;
        r2.d(r3);
        r2 = r14.r;
        r2 = r2 + r1;
        r14.r = r2;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiye.f():boolean");
    }

    private void g() {
        int c = this.m.c();
        if ((c & 254) == 0) {
            this.l = (c & 1) != 0;
            this.k = this.m.a();
            c = this.k;
            if (c < 0 || c > this.b) {
                throw aivw.h.a(String.format("gRPC message exceeds maximum size %d: %d", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.k)})).c();
            }
            this.q++;
            this.d.b();
            this.e.b();
            this.j = d.BODY;
            return;
        }
        throw aivw.i.a("gRPC frame header malformed: reserved bits not zero").c();
    }

    private void h() {
        this.d.a(this.q, (long) this.r);
        this.r = 0;
        InputStream j = this.l ? j() : i();
        this.m = null;
        this.a.a(new b(j, (byte) 0));
        this.j = d.HEADER;
        this.k = 5;
    }

    private InputStream i() {
        this.d.c((long) this.m.a);
        return aiyp.a(this.m);
    }

    private InputStream j() {
        if (this.f != b.a) {
            try {
                return new c(this.f.a(aiyp.a(this.m)), this.b, this.d);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        throw aivw.i.a("Can't decode compressed gRPC message as compression not configured").c();
    }

    public final void a() {
        if (!b()) {
            if (d()) {
                close();
            } else {
                this.s = true;
            }
        }
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void a(aiut aiut) {
        Preconditions.checkState(this.g == null, "Already set full stream decompressor");
        this.f = (aiut) Preconditions.checkNotNull(aiut, "Can't pass an empty decompressor");
    }

    public final void a(aixp aixp) {
        boolean z = true;
        Preconditions.checkState(this.f == b.a, "per-message decompressor already set");
        if (this.g != null) {
            z = false;
        }
        Preconditions.checkState(z, "full stream decompressor already set");
        this.g = (aixp) Preconditions.checkNotNull(aixp, "Can't pass a null full stream decompressor");
        this.n = null;
    }

    public final void a(aiyo aiyo) {
        Preconditions.checkNotNull(aiyo, UnlockablesModel.DATA);
        Object obj = 1;
        try {
            if (!c()) {
                if (this.g != null) {
                    this.g.a(aiyo);
                } else {
                    this.n.a(aiyo);
                }
                obj = null;
                e();
            }
            if (obj != null) {
                aiyo.close();
            }
        } catch (Throwable th) {
            if (1 != null) {
                aiyo.close();
            }
        }
    }

    public final void b(int i) {
        Preconditions.checkArgument(i > 0, "numMessages must be > 0");
        if (!b()) {
            this.o += (long) i;
            e();
        }
    }

    public final boolean b() {
        return this.n == null && this.g == null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003e A:{Catch:{ all -> 0x0064 }} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003d A:{Catch:{ all -> 0x0064 }} */
    public final void close() {
        /*
        r6 = this;
        r0 = r6.b();
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r6.m;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0013;
    L_0x000d:
        r0 = r0.a;
        if (r0 <= 0) goto L_0x0013;
    L_0x0011:
        r0 = 1;
        goto L_0x0014;
    L_0x0013:
        r0 = 0;
    L_0x0014:
        r3 = 0;
        r4 = r6.g;	 Catch:{ all -> 0x0064 }
        if (r4 == 0) goto L_0x0046;
    L_0x0019:
        if (r0 != 0) goto L_0x0040;
    L_0x001b:
        r0 = r6.g;	 Catch:{ all -> 0x0064 }
        r4 = r0.i;	 Catch:{ all -> 0x0064 }
        if (r4 != 0) goto L_0x0023;
    L_0x0021:
        r4 = 1;
        goto L_0x0024;
    L_0x0023:
        r4 = 0;
    L_0x0024:
        r5 = "GzipInflatingBuffer is closed";
        com.google.common.base.Preconditions.checkState(r4, r5);	 Catch:{ all -> 0x0064 }
        r4 = r0.c;	 Catch:{ all -> 0x0064 }
        r4 = r4.b();	 Catch:{ all -> 0x0064 }
        if (r4 != 0) goto L_0x003a;
    L_0x0031:
        r0 = r0.h;	 Catch:{ all -> 0x0064 }
        r4 = defpackage.aixp.b.HEADER;	 Catch:{ all -> 0x0064 }
        if (r0 == r4) goto L_0x0038;
    L_0x0037:
        goto L_0x003a;
    L_0x0038:
        r0 = 0;
        goto L_0x003b;
    L_0x003a:
        r0 = 1;
    L_0x003b:
        if (r0 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r0 = 0;
        goto L_0x0041;
    L_0x0040:
        r0 = 1;
    L_0x0041:
        r1 = r6.g;	 Catch:{ all -> 0x0064 }
        r1.close();	 Catch:{ all -> 0x0064 }
    L_0x0046:
        r1 = r6.n;	 Catch:{ all -> 0x0064 }
        if (r1 == 0) goto L_0x004f;
    L_0x004a:
        r1 = r6.n;	 Catch:{ all -> 0x0064 }
        r1.close();	 Catch:{ all -> 0x0064 }
    L_0x004f:
        r1 = r6.m;	 Catch:{ all -> 0x0064 }
        if (r1 == 0) goto L_0x0058;
    L_0x0053:
        r1 = r6.m;	 Catch:{ all -> 0x0064 }
        r1.close();	 Catch:{ all -> 0x0064 }
    L_0x0058:
        r6.g = r3;
        r6.n = r3;
        r6.m = r3;
        r1 = r6.a;
        r1.a(r0);
        return;
    L_0x0064:
        r0 = move-exception;
        r6.g = r3;
        r6.n = r3;
        r6.m = r3;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiye.close():void");
    }
}
