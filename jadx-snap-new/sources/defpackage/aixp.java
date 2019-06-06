package defpackage;

import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* renamed from: aixp */
final class aixp implements Closeable {
    final aiww a = new aiww();
    final CRC32 b = new CRC32();
    final a c = new a(this, (byte) 0);
    final byte[] d = new byte[RasterSource.DEFAULT_TILE_SIZE];
    int e;
    int f;
    Inflater g;
    b h = b.HEADER;
    boolean i = false;
    int j;
    int k;
    int l = 0;
    int m = 0;
    boolean n = true;
    private long o;

    /* renamed from: aixp$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[b.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        static {
            /*
            r0 = defpackage.aixp.b.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.aixp.b.HEADER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.aixp.b.HEADER_EXTRA_LEN;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.aixp.b.HEADER_EXTRA;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.aixp.b.HEADER_NAME;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = defpackage.aixp.b.HEADER_COMMENT;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = defpackage.aixp.b.HEADER_CRC;	 Catch:{ NoSuchFieldError -> 0x004b }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 6;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = defpackage.aixp.b.INITIALIZE_INFLATER;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r2 = 7;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = defpackage.aixp.b.INFLATING;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r2 = 8;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1 = defpackage.aixp.b.INFLATER_NEEDS_INPUT;	 Catch:{ NoSuchFieldError -> 0x006e }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r2 = 9;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = defpackage.aixp.b.TRAILER;	 Catch:{ NoSuchFieldError -> 0x007a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r2 = 10;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aixp$1.<clinit>():void");
        }
    }

    /* renamed from: aixp$a */
    class a {
        private a() {
        }

        /* synthetic */ a(aixp aixp, byte b) {
            this();
        }

        static /* synthetic */ void a(a aVar, int i) {
            int i2 = aixp.this.f - aixp.this.e;
            if (i2 > 0) {
                i2 = Math.min(i2, i);
                aixp.this.b.update(aixp.this.d, aixp.this.e, i2);
                aixp.a(aixp.this, i2);
                i2 = i - i2;
            } else {
                i2 = i;
            }
            if (i2 > 0) {
                byte[] bArr = new byte[RasterSource.DEFAULT_TILE_SIZE];
                int i3 = 0;
                while (i3 < i2) {
                    int min = Math.min(i2 - i3, RasterSource.DEFAULT_TILE_SIZE);
                    aixp.this.a.a(bArr, 0, min);
                    aixp.this.b.update(bArr, 0, min);
                    i3 += min;
                }
            }
            aixp.b(aixp.this, i);
        }

        static /* synthetic */ boolean a(a aVar) {
            while (aVar.b() > 0) {
                if (aVar.a() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: final */
        public final int a() {
            int i;
            if (aixp.this.f - aixp.this.e > 0) {
                i = aixp.this.d[aixp.this.e] & 255;
                aixp.a(aixp.this, 1);
            } else {
                i = aixp.this.a.c();
            }
            aixp.this.b.update(i);
            aixp.b(aixp.this, 1);
            return i;
        }

        /* Access modifiers changed, original: final */
        public final int b() {
            return (aixp.this.f - aixp.this.e) + aixp.this.a.a;
        }

        /* Access modifiers changed, original: final */
        public final int c() {
            return a() | (a() << 8);
        }

        /* Access modifiers changed, original: final */
        public final long d() {
            return ((long) c()) | (((long) c()) << 16);
        }
    }

    /* renamed from: aixp$b */
    enum b {
        HEADER,
        HEADER_EXTRA_LEN,
        HEADER_EXTRA,
        HEADER_NAME,
        HEADER_COMMENT,
        HEADER_CRC,
        INITIALIZE_INFLATER,
        INFLATING,
        INFLATER_NEEDS_INPUT,
        TRAILER
    }

    aixp() {
    }

    static /* synthetic */ int a(aixp aixp, int i) {
        int i2 = aixp.e + i;
        aixp.e = i2;
        return i2;
    }

    static /* synthetic */ int b(aixp aixp, int i) {
        int i2 = aixp.l + i;
        aixp.l = i2;
        return i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:18:0x0073 in {2, 3, 8, 9, 13, 14, 17} preds:[]
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
    final int a(byte[] r3, int r4, int r5) {
        /*
        r2 = this;
        r0 = r2.g;
        if (r0 == 0) goto L_0x0006;
        r0 = 1;
        goto L_0x0007;
        r0 = 0;
        r1 = "inflater is null";
        com.google.common.base.Preconditions.checkState(r0, r1);
        r0 = r2.g;	 Catch:{ DataFormatException -> 0x005a }
        r0 = r0.getTotalIn();	 Catch:{ DataFormatException -> 0x005a }
        r1 = r2.g;	 Catch:{ DataFormatException -> 0x005a }
        r5 = r1.inflate(r3, r4, r5);	 Catch:{ DataFormatException -> 0x005a }
        r1 = r2.g;	 Catch:{ DataFormatException -> 0x005a }
        r1 = r1.getTotalIn();	 Catch:{ DataFormatException -> 0x005a }
        r1 = r1 - r0;	 Catch:{ DataFormatException -> 0x005a }
        r0 = r2.l;	 Catch:{ DataFormatException -> 0x005a }
        r0 = r0 + r1;	 Catch:{ DataFormatException -> 0x005a }
        r2.l = r0;	 Catch:{ DataFormatException -> 0x005a }
        r0 = r2.m;	 Catch:{ DataFormatException -> 0x005a }
        r0 = r0 + r1;	 Catch:{ DataFormatException -> 0x005a }
        r2.m = r0;	 Catch:{ DataFormatException -> 0x005a }
        r0 = r2.e;	 Catch:{ DataFormatException -> 0x005a }
        r0 = r0 + r1;	 Catch:{ DataFormatException -> 0x005a }
        r2.e = r0;	 Catch:{ DataFormatException -> 0x005a }
        r0 = r2.b;	 Catch:{ DataFormatException -> 0x005a }
        r0.update(r3, r4, r5);	 Catch:{ DataFormatException -> 0x005a }
        r3 = r2.g;	 Catch:{ DataFormatException -> 0x005a }
        r3 = r3.finished();	 Catch:{ DataFormatException -> 0x005a }
        if (r3 == 0) goto L_0x004e;	 Catch:{ DataFormatException -> 0x005a }
        r3 = r2.g;	 Catch:{ DataFormatException -> 0x005a }
        r3 = r3.getBytesWritten();	 Catch:{ DataFormatException -> 0x005a }
        r0 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;	 Catch:{ DataFormatException -> 0x005a }
        r3 = r3 & r0;	 Catch:{ DataFormatException -> 0x005a }
        r2.o = r3;	 Catch:{ DataFormatException -> 0x005a }
        r3 = defpackage.aixp.b.TRAILER;	 Catch:{ DataFormatException -> 0x005a }
        r2.h = r3;	 Catch:{ DataFormatException -> 0x005a }
        goto L_0x0059;	 Catch:{ DataFormatException -> 0x005a }
        r3 = r2.g;	 Catch:{ DataFormatException -> 0x005a }
        r3 = r3.needsInput();	 Catch:{ DataFormatException -> 0x005a }
        if (r3 == 0) goto L_0x0059;	 Catch:{ DataFormatException -> 0x005a }
        r3 = defpackage.aixp.b.INFLATER_NEEDS_INPUT;	 Catch:{ DataFormatException -> 0x005a }
        goto L_0x004b;
        return r5;
        r3 = move-exception;
        r4 = new java.util.zip.DataFormatException;
        r5 = new java.lang.StringBuilder;
        r0 = "Inflater data format exception: ";
        r5.<init>(r0);
        r3 = r3.getMessage();
        r5.append(r3);
        r3 = r5.toString();
        r4.<init>(r3);
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixp.a(byte[], int, int):int");
    }

    /* Access modifiers changed, original: final */
    public final void a(aiyo aiyo) {
        Preconditions.checkState(this.i ^ 1, "GzipInflatingBuffer is closed");
        this.a.a(aiyo);
        this.n = false;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        Preconditions.checkState(this.i ^ 1, "GzipInflatingBuffer is closed");
        return this.n;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        if (this.g != null && this.c.b() <= 18) {
            this.g.end();
            this.g = null;
        }
        if (this.c.b() < 8) {
            return false;
        }
        if (this.b.getValue() == this.c.d() && this.o == this.c.d()) {
            this.b.reset();
            this.h = b.HEADER;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    public final void close() {
        if (!this.i) {
            this.i = true;
            this.a.close();
            Inflater inflater = this.g;
            if (inflater != null) {
                inflater.end();
                this.g = null;
            }
        }
    }
}
