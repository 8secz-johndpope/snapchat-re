package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: akuo */
public final class akuo {

    /* renamed from: akuo$b */
    static final class b {
        private char a;
        private int b;
        private int c;
        private int d;
        private boolean e;
        private int f;

        private b(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c == 'u' || c == 'w' || c == 's') {
                this.a = c;
                this.b = i;
                this.c = i2;
                this.d = i3;
                this.e = z;
                this.f = i4;
                return;
            }
            throw new IllegalArgumentException("Unknown mode: ".concat(String.valueOf(c)));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002b in {2, 10, 11, 12, 13} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private long a(defpackage.akqx r4, long r5) {
            /*
            r3 = this;
            r4 = r3.c(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0005 }
            goto L_0x0029;
            r0 = move-exception;
            r1 = r3.b;
            r2 = 2;
            if (r1 != r2) goto L_0x002a;
            r1 = r3.c;
            r2 = 29;
            if (r1 != r2) goto L_0x002a;
            r0 = r4.E();
            r0 = r0.b(r5);
            if (r0 != 0) goto L_0x0025;
            r0 = r4.E();
            r1 = 1;
            r5 = r0.a(r5, r1);
            goto L_0x0011;
            r4 = r3.c(r4, r5);
            return r4;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akuo$b.a(akqx, long):long");
        }

        static b a(DataInput dataInput) {
            return new b((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) akuo.a(dataInput));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x002b in {2, 10, 11, 12, 13} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private long b(defpackage.akqx r4, long r5) {
            /*
            r3 = this;
            r4 = r3.c(r4, r5);	 Catch:{ IllegalArgumentException -> 0x0005 }
            goto L_0x0029;
            r0 = move-exception;
            r1 = r3.b;
            r2 = 2;
            if (r1 != r2) goto L_0x002a;
            r1 = r3.c;
            r2 = 29;
            if (r1 != r2) goto L_0x002a;
            r0 = r4.E();
            r0 = r0.b(r5);
            if (r0 != 0) goto L_0x0025;
            r0 = r4.E();
            r1 = -1;
            r5 = r0.a(r5, r1);
            goto L_0x0011;
            r4 = r3.c(r4, r5);
            return r4;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akuo$b.b(akqx, long):long");
        }

        private long c(akqx akqx, long j) {
            if (this.c >= 0) {
                return akqx.u().b(j, this.c);
            }
            return akqx.u().a(akqx.C().a(akqx.u().b(j, 1), 1), this.c);
        }

        private long d(akqx akqx, long j) {
            int a = this.d - akqx.t().a(j);
            if (a == 0) {
                return j;
            }
            if (this.e) {
                if (a < 0) {
                    a += 7;
                }
            } else if (a > 0) {
                a -= 7;
            }
            return akqx.t().a(j, a);
        }

        public final long a(long j, int i, int i2) {
            char c = this.a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            j += j2;
            aktc aktc = aktc.n;
            long a = a(aktc, aktc.e().a(aktc.e().b(aktc.C().b(j, this.b), 0), this.f));
            if (this.d != 0) {
                a = d(aktc, a);
                if (a <= j) {
                    a = d(aktc, a(aktc, aktc.C().b(aktc.E().a(a, 1), this.b)));
                }
            } else if (a <= j) {
                a = a(aktc, aktc.E().a(a, 1));
            }
            return a - j2;
        }

        public final long b(long j, int i, int i2) {
            char c = this.a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            j += j2;
            aktc aktc = aktc.n;
            long b = b(aktc, aktc.e().a(aktc.e().b(aktc.C().b(j, this.b), 0), this.f));
            if (this.d != 0) {
                b = d(aktc, b);
                if (b >= j) {
                    b = d(aktc, b(aktc, aktc.C().b(aktc.E().a(b, -1), this.b)));
                }
            } else if (b >= j) {
                b = b(aktc, aktc.E().a(b, -1));
            }
            return b - j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f;
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("[OfYear]\nMode: ");
            stringBuilder.append(this.a);
            stringBuilder.append(10);
            stringBuilder.append("MonthOfYear: ");
            stringBuilder.append(this.b);
            stringBuilder.append(10);
            stringBuilder.append("DayOfMonth: ");
            stringBuilder.append(this.c);
            stringBuilder.append(10);
            stringBuilder.append("DayOfWeek: ");
            stringBuilder.append(this.d);
            stringBuilder.append(10);
            stringBuilder.append("AdvanceDayOfWeek: ");
            stringBuilder.append(this.e);
            stringBuilder.append(10);
            stringBuilder.append("MillisOfDay: ");
            stringBuilder.append(this.f);
            stringBuilder.append(10);
            return stringBuilder.toString();
        }
    }

    /* renamed from: akuo$d */
    static final class d {
        final String a;
        final int b;
        private b c;

        private d(b bVar, String str, int i) {
            this.c = bVar;
            this.a = str;
            this.b = i;
        }

        static d a(DataInput dataInput) {
            return new d(b.a(dataInput), dataInput.readUTF(), (int) akuo.a(dataInput));
        }

        public final long a(long j, int i, int i2) {
            return this.c.a(j, i, i2);
        }

        public final long b(long j, int i, int i2) {
            return this.c.b(j, i, i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.b == dVar.b && this.a.equals(dVar.a) && this.c.equals(dVar.c);
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append(" named ");
            stringBuilder.append(this.a);
            stringBuilder.append(" at ");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    /* renamed from: akuo$a */
    static final class a extends akrc {
        final int c;
        private d d;
        private d e;

        a(String str, int i, d dVar, d dVar2) {
            super(str);
            this.c = i;
            this.d = dVar;
            this.e = dVar2;
        }

        private d j(long j) {
            long a;
            int i = this.c;
            d dVar = this.d;
            d dVar2 = this.e;
            try {
                a = dVar.a(j, i, dVar2.b);
            } catch (ArithmeticException | IllegalArgumentException unused) {
                a = j;
            }
            try {
                j = dVar2.a(j, i, dVar.b);
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return a > j ? dVar : dVar2;
        }

        public final String a(long j) {
            return j(j).a;
        }

        public final int b(long j) {
            return this.c + j(j).b;
        }

        public final int c(long j) {
            return this.c;
        }

        public final boolean d() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.b.equals(aVar.b) && this.c == aVar.c && this.d.equals(aVar.d) && this.e.equals(aVar.e);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x002c A:{RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x002b A:{RETURN} */
        /* JADX WARNING: Missing block: B:6:0x0014, code skipped:
            if (r5 < 0) goto L_0x0016;
     */
        public final long h(long r9) {
            /*
            r8 = this;
            r0 = r8.c;
            r1 = r8.d;
            r2 = r8.e;
            r3 = 0;
            r5 = r2.b;	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0016, ArithmeticException | IllegalArgumentException -> 0x0016 }
            r5 = r1.a(r9, r0, r5);	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0016, ArithmeticException | IllegalArgumentException -> 0x0016 }
            r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
            if (r7 <= 0) goto L_0x0017;
        L_0x0012:
            r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
            if (r7 >= 0) goto L_0x0017;
        L_0x0016:
            r5 = r9;
        L_0x0017:
            r1 = r1.b;	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0027, ArithmeticException | IllegalArgumentException -> 0x0027 }
            r0 = r2.a(r9, r0, r1);	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0027, ArithmeticException | IllegalArgumentException -> 0x0027 }
            r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
            if (r2 <= 0) goto L_0x0026;
        L_0x0021:
            r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
            if (r2 >= 0) goto L_0x0026;
        L_0x0025:
            goto L_0x0027;
        L_0x0026:
            r9 = r0;
        L_0x0027:
            r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
            if (r0 <= 0) goto L_0x002c;
        L_0x002b:
            return r9;
        L_0x002c:
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akuo$a.h(long):long");
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x002e  */
        /* JADX WARNING: Missing block: B:6:0x0017, code skipped:
            if (r7 > 0) goto L_0x0019;
     */
        public final long i(long r11) {
            /*
            r10 = this;
            r0 = 1;
            r11 = r11 + r0;
            r2 = r10.c;
            r3 = r10.d;
            r4 = r10.e;
            r5 = 0;
            r7 = r4.b;	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0019, ArithmeticException | IllegalArgumentException -> 0x0019 }
            r7 = r3.b(r11, r2, r7);	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x0019, ArithmeticException | IllegalArgumentException -> 0x0019 }
            r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
            if (r9 >= 0) goto L_0x001a;
        L_0x0015:
            r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
            if (r9 <= 0) goto L_0x001a;
        L_0x0019:
            r7 = r11;
        L_0x001a:
            r3 = r3.b;	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x002a, ArithmeticException | IllegalArgumentException -> 0x002a }
            r2 = r4.b(r11, r2, r3);	 Catch:{ ArithmeticException | IllegalArgumentException -> 0x002a, ArithmeticException | IllegalArgumentException -> 0x002a }
            r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1));
            if (r4 >= 0) goto L_0x0029;
        L_0x0024:
            r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
            if (r4 <= 0) goto L_0x0029;
        L_0x0028:
            goto L_0x002a;
        L_0x0029:
            r11 = r2;
        L_0x002a:
            r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1));
            if (r2 <= 0) goto L_0x002f;
        L_0x002e:
            r11 = r7;
        L_0x002f:
            r11 = r11 - r0;
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akuo$a.i(long):long");
        }
    }

    /* renamed from: akuo$c */
    static final class c extends akrc {
        private final long[] c;
        private final int[] d;
        private final int[] e;
        private final String[] f;
        private final a g;

        private c(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, a aVar) {
            super(str);
            this.c = jArr;
            this.d = iArr;
            this.e = iArr2;
            this.f = strArr;
            this.g = aVar;
        }

        static c a(DataInput dataInput, String str) {
            int i;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (i = 0; i < readUnsignedShort; i++) {
                strArr[i] = dataInput.readUTF();
            }
            i = dataInput.readInt();
            long[] jArr = new long[i];
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            String[] strArr2 = new String[i];
            for (int i2 = 0; i2 < i; i2++) {
                int readUnsignedByte;
                jArr[i2] = akuo.a(dataInput);
                iArr[i2] = (int) akuo.a(dataInput);
                iArr2[i2] = (int) akuo.a(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        readUnsignedByte = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                }
                readUnsignedByte = dataInput.readUnsignedShort();
                strArr2[i2] = strArr[readUnsignedByte];
            }
            a aVar = null;
            if (dataInput.readBoolean()) {
                aVar = new a(str, (int) akuo.a(dataInput), d.a(dataInput), d.a(dataInput));
            }
            return new c(str, jArr, iArr, iArr2, strArr2, aVar);
        }

        public final String a(long j) {
            long[] jArr = this.c;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.f[binarySearch];
            }
            binarySearch ^= -1;
            if (binarySearch < jArr.length) {
                return binarySearch > 0 ? this.f[binarySearch - 1] : "UTC";
            } else {
                a aVar = this.g;
                return aVar == null ? this.f[binarySearch - 1] : aVar.a(j);
            }
        }

        public final int b(long j) {
            long[] jArr = this.c;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.d[binarySearch];
            }
            binarySearch ^= -1;
            if (binarySearch < jArr.length) {
                return binarySearch > 0 ? this.d[binarySearch - 1] : 0;
            } else {
                a aVar = this.g;
                return aVar == null ? this.d[binarySearch - 1] : aVar.b(j);
            }
        }

        public final int c(long j) {
            long[] jArr = this.c;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.e[binarySearch];
            }
            binarySearch ^= -1;
            if (binarySearch < jArr.length) {
                return binarySearch > 0 ? this.e[binarySearch - 1] : 0;
            } else {
                a aVar = this.g;
                return aVar == null ? this.e[binarySearch - 1] : aVar.c;
            }
        }

        public final boolean d() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.b.equals(cVar.b) && Arrays.equals(this.c, cVar.c) && Arrays.equals(this.f, cVar.f) && Arrays.equals(this.d, cVar.d) && Arrays.equals(this.e, cVar.e)) {
                    a aVar = this.g;
                    return aVar != null ? !aVar.equals(cVar.g) : cVar.g != null;
                }
            }
        }

        public final long h(long j) {
            long[] jArr = this.c;
            int binarySearch = Arrays.binarySearch(jArr, j);
            binarySearch = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ -1;
            if (binarySearch < jArr.length) {
                return jArr[binarySearch];
            }
            if (this.g == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return this.g.h(j);
        }

        public final long i(long j) {
            long[] jArr = this.c;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                if (j > Long.MIN_VALUE) {
                    j--;
                }
                return j;
            }
            binarySearch ^= -1;
            long j2;
            if (binarySearch < jArr.length) {
                if (binarySearch > 0) {
                    j2 = jArr[binarySearch - 1];
                    if (j2 > Long.MIN_VALUE) {
                        return j2 - 1;
                    }
                }
                return j;
            }
            a aVar = this.g;
            if (aVar != null) {
                j2 = aVar.i(j);
                if (j2 < j) {
                    return j2;
                }
            }
            j2 = jArr[binarySearch - 1];
            return j2 > Long.MIN_VALUE ? j2 - 1 : j;
        }
    }

    static long a(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = (long) (dataInput.readUnsignedByte() | ((((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16)) | (dataInput.readUnsignedByte() << 8)));
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = (((((((long) readUnsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24))) | ((long) (dataInput.readUnsignedByte() << 16))) | ((long) (dataInput.readUnsignedByte() << 8))) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (long) ((readUnsignedByte2 << 26) >> 26);
            j = 1800000;
        }
        return readUnsignedByte * j;
    }

    public static akrc a(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return new akun(c.a(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            akrc akuq = new akuq(str, dataInput.readUTF(), (int) akuo.a(dataInput), (int) akuo.a(dataInput));
            if (akuq.equals(akrc.a)) {
                akuq = akrc.a;
            }
            return akuq;
        } else if (readUnsignedByte == 80) {
            return c.a(dataInput, str);
        } else {
            throw new IOException("Invalid encoding");
        }
    }
}
