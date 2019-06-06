package defpackage;

import defpackage.ajaj.a;
import defpackage.ajaj.b;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ajak */
public final class ajak implements ajan {
    static final Logger a = Logger.getLogger(b.class.getName());
    static final akkg b = akkg.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: ajak$b */
    static final class b {
        private static final String[] a = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        private static final String[] b = new String[64];
        private static final String[] c = new String[256];

        static {
            String str;
            int i;
            int i2;
            int i3 = 0;
            for (int i4 = 0; i4 < 256; i4++) {
                c[i4] = String.format("%8s", new Object[]{Integer.toBinaryString(i4)}).replace(' ', '0');
            }
            String[] strArr = b;
            strArr[0] = "";
            strArr[1] = "END_STREAM";
            int[] iArr = new int[]{1};
            strArr[8] = "PADDED";
            int i5 = 0;
            while (true) {
                str = "|PADDED";
                if (i5 > 0) {
                    break;
                }
                i = iArr[0];
                String[] strArr2 = b;
                i2 = i | 8;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(b[i]);
                stringBuilder.append(str);
                strArr2[i2] = stringBuilder.toString();
                i5++;
            }
            strArr = b;
            strArr[4] = "END_HEADERS";
            strArr[32] = "PRIORITY";
            strArr[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = new int[]{4, 32, 36};
            for (i = 0; i < 3; i++) {
                int i6 = iArr2[i];
                for (i2 = 0; i2 <= 0; i2++) {
                    int i7 = iArr[i2];
                    String[] strArr3 = b;
                    int i8 = i7 | i6;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(b[i7]);
                    stringBuilder2.append('|');
                    stringBuilder2.append(b[i6]);
                    strArr3[i8] = stringBuilder2.toString();
                    strArr3 = b;
                    i8 |= 8;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(b[i7]);
                    stringBuilder2.append('|');
                    stringBuilder2.append(b[i6]);
                    stringBuilder2.append(str);
                    strArr3[i8] = stringBuilder2.toString();
                }
            }
            while (i3 < 64) {
                strArr = b;
                if (strArr[i3] == null) {
                    strArr[i3] = c[i3];
                }
                i3++;
            }
        }

        b() {
        }

        private static String a(byte b, byte b2) {
            if (b2 == (byte) 0) {
                return "";
            }
            if (!(b == (byte) 2 || b == (byte) 3)) {
                if (b == (byte) 4 || b == (byte) 6) {
                    return b2 == (byte) 1 ? "ACK" : c[b2];
                } else {
                    if (!(b == (byte) 7 || b == (byte) 8)) {
                        String str = b2 < (byte) 64 ? b[b2] : c[b2];
                        return (b != (byte) 5 || (b2 & 4) == 0) ? (b != (byte) 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                    }
                }
            }
            return c[b2];
        }

        static String a(boolean z, int i, int i2, byte b, byte b2) {
            String format = b < (byte) 10 ? a[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            String a = b.a(b, b2);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = a;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: ajak$d */
    static final class d implements ajah {
        private final akke a;
        private final boolean b = true;
        private final akkd c = new akkd();
        private final b d = new b(this.c);
        private int e = 16384;
        private boolean f;

        d(akke akke) {
            this.a = akke;
        }

        private void a(int i, int i2, byte b, byte b2) {
            if (ajak.a.isLoggable(Level.FINE)) {
                ajak.a.fine(b.a(false, i, i2, b, b2));
            }
            if (i2 > this.e) {
                throw ajak.b("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(this.e), Integer.valueOf(i2)});
            } else if ((Integer.MIN_VALUE & i) == 0) {
                ajak.a(this.a, i2);
                this.a.j(b & 255);
                this.a.j(b2 & 255);
                this.a.h(i & Integer.MAX_VALUE);
            } else {
                throw ajak.b("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
            }
        }

        private void b(int i, long j) {
            while (j > 0) {
                int min = (int) Math.min((long) this.e, j);
                long j2 = (long) min;
                j -= j2;
                a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
                this.a.a_(this.c, j2);
            }
        }

        public final synchronized void a() {
            if (this.f) {
                throw new IOException("closed");
            }
            if (ajak.a.isLoggable(Level.FINE)) {
                ajak.a.fine(String.format(">> CONNECTION %s", new Object[]{ajak.b.e()}));
            }
            this.a.c(ajak.b.h());
            this.a.flush();
        }

        public final synchronized void a(int i, long j) {
            if (this.f) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw ajak.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
            } else {
                a(i, 4, (byte) 8, (byte) 0);
                this.a.h((int) j);
                this.a.flush();
            }
        }

        public final synchronized void a(int i, ajaf ajaf) {
            if (this.f) {
                throw new IOException("closed");
            } else if (ajaf.httpCode != -1) {
                a(i, 4, (byte) 3, (byte) 0);
                this.a.h(ajaf.httpCode);
                this.a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final synchronized void a(int i, ajaf ajaf, byte[] bArr) {
            if (this.f) {
                throw new IOException("closed");
            } else if (ajaf.httpCode != -1) {
                a(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.a.h(i);
                this.a.h(ajaf.httpCode);
                if (bArr.length > 0) {
                    this.a.c(bArr);
                }
                this.a.flush();
            } else {
                throw ajak.b("errorCode.httpCode == -1", new Object[0]);
            }
        }

        public final synchronized void a(ajam ajam) {
            if (this.f) {
                throw new IOException("closed");
            }
            int i = this.e;
            if ((ajam.a & 32) != 0) {
                i = ajam.d[5];
            }
            this.e = i;
            a(0, 0, (byte) 4, (byte) 1);
            this.a.flush();
        }

        public final synchronized void a(boolean z, int i, int i2) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.a.h(i);
            this.a.h(i2);
            this.a.flush();
        }

        public final synchronized void a(boolean z, int i, akkd akkd, int i2) {
            if (this.f) {
                throw new IOException("closed");
            }
            a(i, i2, (byte) 0, (byte) z);
            if (i2 > 0) {
                this.a.a_(akkd, (long) i2);
            }
        }

        public final synchronized void a(boolean z, boolean z2, int i, int i2, List<ajai> list) {
            if (z2) {
                throw new UnsupportedOperationException();
            }
            try {
                if (this.f) {
                    throw new IOException("closed");
                }
                int z22 = this.f;
                if (z22 == true) {
                    throw new IOException("closed");
                }
                this.d.a((List) list);
                long i22 = this.c.b;
                z22 = (int) Math.min((long) this.e, i22);
                long j = (long) z22;
                byte b = i22 == j ? (byte) 4 : (byte) 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                a(i, z22, (byte) 1, b);
                this.a.a_(this.c, j);
                if (i22 > j) {
                    b(i, i22 - j);
                }
            } finally {
            }
        }

        public final synchronized void b() {
            if (this.f) {
                throw new IOException("closed");
            }
            this.a.flush();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:26:0x0049 in {10, 13, 14, 15, 16, 19, 22, 25} preds:[]
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
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final synchronized void b(defpackage.ajam r5) {
            /*
            r4 = this;
            monitor-enter(r4);
            r0 = r4.f;	 Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x003e;	 Catch:{ all -> 0x0046 }
            r0 = r5.a;	 Catch:{ all -> 0x0046 }
            r0 = java.lang.Integer.bitCount(r0);	 Catch:{ all -> 0x0046 }
            r0 = r0 * 6;	 Catch:{ all -> 0x0046 }
            r1 = 4;	 Catch:{ all -> 0x0046 }
            r2 = 0;	 Catch:{ all -> 0x0046 }
            r4.a(r2, r0, r1, r2);	 Catch:{ all -> 0x0046 }
            r0 = 10;	 Catch:{ all -> 0x0046 }
            if (r2 >= r0) goto L_0x0037;	 Catch:{ all -> 0x0046 }
            r0 = r5.a(r2);	 Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0034;	 Catch:{ all -> 0x0046 }
            if (r2 != r1) goto L_0x0020;	 Catch:{ all -> 0x0046 }
            r0 = 3;	 Catch:{ all -> 0x0046 }
            goto L_0x0026;	 Catch:{ all -> 0x0046 }
            r0 = 7;	 Catch:{ all -> 0x0046 }
            if (r2 != r0) goto L_0x0025;	 Catch:{ all -> 0x0046 }
            r0 = 4;	 Catch:{ all -> 0x0046 }
            goto L_0x0026;	 Catch:{ all -> 0x0046 }
            r0 = r2;	 Catch:{ all -> 0x0046 }
            r3 = r4.a;	 Catch:{ all -> 0x0046 }
            r3.i(r0);	 Catch:{ all -> 0x0046 }
            r0 = r4.a;	 Catch:{ all -> 0x0046 }
            r3 = r5.d;	 Catch:{ all -> 0x0046 }
            r3 = r3[r2];	 Catch:{ all -> 0x0046 }
            r0.h(r3);	 Catch:{ all -> 0x0046 }
            r2 = r2 + 1;	 Catch:{ all -> 0x0046 }
            goto L_0x0012;	 Catch:{ all -> 0x0046 }
            r5 = r4.a;	 Catch:{ all -> 0x0046 }
            r5.flush();	 Catch:{ all -> 0x0046 }
            monitor-exit(r4);
            return;
            r5 = new java.io.IOException;	 Catch:{ all -> 0x0046 }
            r0 = "closed";	 Catch:{ all -> 0x0046 }
            r5.<init>(r0);	 Catch:{ all -> 0x0046 }
            throw r5;	 Catch:{ all -> 0x0046 }
            r5 = move-exception;
            monitor-exit(r4);
            throw r5;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajak$d.b(ajam):void");
        }

        public final int c() {
            return this.e;
        }

        public final synchronized void close() {
            this.f = true;
            this.a.close();
        }
    }

    /* renamed from: ajak$c */
    static final class c implements ajag {
        private final akkf a;
        private final a b = new a(this.a);
        private final boolean c = true;
        private a d = new a(this.b);

        c(akkf akkf) {
            this.a = akkf;
        }

        private List<ajai> a(int i, short s, byte b, int i2) {
            a aVar = this.b;
            aVar.d = i;
            aVar.a = i;
            aVar.e = s;
            aVar.b = b;
            aVar.c = i2;
            this.d.b();
            return this.d.c();
        }

        private void a() {
            this.a.i();
            this.a.g();
        }

        public final boolean a(ajag.a aVar) {
            short s = (short) 0;
            try {
                this.a.a(9);
                int b = ((this.a.g() & 255) | (((this.a.g() & 255) << 16) | ((this.a.g() & 255) << 8)));
                if (b < 0 || b > 16384) {
                    throw ajak.a("FRAME_SIZE_ERROR: %s", Integer.valueOf(b));
                }
                akkf akkf;
                long j;
                byte g = (byte) this.a.g();
                byte g2 = (byte) this.a.g();
                int i = this.a.i() & Integer.MAX_VALUE;
                if (ajak.a.isLoggable(Level.FINE)) {
                    ajak.a.fine(b.a(true, i, b, g, g2));
                }
                boolean z;
                int i2;
                switch (g) {
                    case (byte) 0:
                        z = (g2 & 1) != 0;
                        if (((g2 & 32) != 0 ? 1 : null) == null) {
                            if ((g2 & 8) != 0) {
                                s = (short) (this.a.g() & 255);
                            }
                            aVar.a(z, i, this.a, ajak.a(b, g2, s));
                            akkf = this.a;
                            j = (long) s;
                            break;
                        }
                        throw ajak.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                    case (byte) 1:
                        if (i != 0) {
                            z = (g2 & 1) != 0;
                            if ((g2 & 8) != 0) {
                                s = (short) (this.a.g() & 255);
                            }
                            if ((g2 & 32) != 0) {
                                a();
                                b -= 5;
                            }
                            aVar.a(z, i, a(ajak.a(b, g2, s), s, g2, i));
                            break;
                        }
                        throw ajak.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                    case (byte) 2:
                        if (b != 5) {
                            throw ajak.a("TYPE_PRIORITY length: %d != 5", Integer.valueOf(b));
                        } else if (i != 0) {
                            a();
                            break;
                        } else {
                            throw ajak.a("TYPE_PRIORITY streamId == 0", new Object[0]);
                        }
                    case (byte) 3:
                        if (b != 4) {
                            throw ajak.a("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(b));
                        } else if (i != 0) {
                            ajaf a = ajaf.a(this.a.i());
                            if (a != null) {
                                aVar.a(i, a);
                                break;
                            }
                            throw ajak.a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(b));
                        } else {
                            throw ajak.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        }
                    case (byte) 4:
                        if (i != 0) {
                            throw ajak.a("TYPE_SETTINGS streamId != 0", new Object[0]);
                        } else if ((g2 & 1) != 0) {
                            if (b != 0) {
                                throw ajak.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            }
                        } else if (b % 6 == 0) {
                            ajam ajam = new ajam();
                            for (int i3 = 0; i3 < b; i3 += 6) {
                                i = this.a.h();
                                int i4 = this.a.i();
                                switch (i) {
                                    case 1:
                                    case 6:
                                        break;
                                    case 2:
                                        if (!(i4 == 0 || i4 == 1)) {
                                            throw ajak.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                        }
                                    case 3:
                                        i = 4;
                                        break;
                                    case 4:
                                        i = 7;
                                        if (i4 < 0) {
                                            throw ajak.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        }
                                        break;
                                    case 5:
                                        if (i4 < 16384 || i4 > 16777215) {
                                            throw ajak.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i4));
                                        }
                                    default:
                                        break;
                                }
                                if (i < 10) {
                                    int i5 = 1 << i;
                                    ajam.a |= i5;
                                    i5 ^= -1;
                                    ajam.b &= i5;
                                    ajam.c = i5 & ajam.c;
                                    ajam.d[i] = i4;
                                }
                            }
                            aVar.a(ajam);
                            if (ajam.a() >= 0) {
                                a aVar2 = this.d;
                                int a2 = ajam.a();
                                aVar2.a = a2;
                                aVar2.b = a2;
                                aVar2.a();
                                break;
                            }
                        } else {
                            throw ajak.a("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(b));
                        }
                        break;
                    case (byte) 5:
                        if (i != 0) {
                            if ((g2 & 8) != 0) {
                                s = (short) (this.a.g() & 255);
                            }
                            this.a.i();
                            a(ajak.a(b - 4, g2, s), s, g2, i);
                            aVar.a(i);
                            break;
                        }
                        throw ajak.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                    case (byte) 6:
                        if (b != 8) {
                            throw ajak.a("TYPE_PING length != 8: %s", Integer.valueOf(b));
                        } else if (i == 0) {
                            boolean z2;
                            b = this.a.i();
                            i2 = this.a.i();
                            if ((g2 & 1) != 0) {
                                z2 = true;
                            }
                            aVar.a(z2, b, i2);
                            break;
                        } else {
                            throw ajak.a("TYPE_PING streamId != 0", new Object[0]);
                        }
                    case (byte) 7:
                        if (b < 8) {
                            throw ajak.a("TYPE_GOAWAY length < 8: %s", Integer.valueOf(b));
                        } else if (i == 0) {
                            i2 = this.a.i();
                            b -= 8;
                            ajaf a3 = ajaf.a(this.a.i());
                            if (a3 != null) {
                                akkg akkg = akkg.a;
                                if (b > 0) {
                                    akkg = this.a.c((long) b);
                                }
                                aVar.a(i2, a3, akkg);
                                break;
                            }
                            throw ajak.a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(r4));
                        } else {
                            throw ajak.a("TYPE_GOAWAY streamId != 0", new Object[0]);
                        }
                    case (byte) 8:
                        if (b == 4) {
                            long i6 = ((long) this.a.i()) & 2147483647L;
                            if (i6 != 0) {
                                aVar.a(i, i6);
                                break;
                            }
                            throw ajak.a("windowSizeIncrement was 0", Long.valueOf(i6));
                        }
                        throw ajak.a("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(b));
                    default:
                        akkf = this.a;
                        j = (long) b;
                        break;
                }
                akkf.f(j);
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public final void close() {
            this.a.close();
        }
    }

    /* renamed from: ajak$a */
    static final class a implements akkv {
        int a;
        byte b;
        int c;
        int d;
        short e;
        private final akkf f;

        public a(akkf akkf) {
            this.f = akkf;
        }

        public final long a(akkd akkd, long j) {
            while (true) {
                int i = this.d;
                if (i == 0) {
                    this.f.f((long) this.e);
                    this.e = (short) 0;
                    if ((this.b & 4) != 0) {
                        return -1;
                    }
                    int i2 = this.c;
                    int b = ((this.f.g() & 255) | (((this.f.g() & 255) << 16) | ((this.f.g() & 255) << 8)));
                    this.d = b;
                    this.a = b;
                    byte g = (byte) this.f.g();
                    this.b = (byte) this.f.g();
                    if (ajak.a.isLoggable(Level.FINE)) {
                        ajak.a.fine(b.a(true, this.c, this.a, g, this.b));
                    }
                    this.c = this.f.i() & Integer.MAX_VALUE;
                    if (g != (byte) 9) {
                        throw ajak.a("%s != TYPE_CONTINUATION", Byte.valueOf(g));
                    } else if (this.c != i2) {
                        throw ajak.a("TYPE_CONTINUATION streamId changed", new Object[0]);
                    }
                } else {
                    long a = this.f.a(akkd, Math.min(j, (long) i));
                    if (a == -1) {
                        return -1;
                    }
                    this.d -= (int) a;
                    return a;
                }
            }
        }

        public final akkw a() {
            return this.f.a();
        }

        public final void close() {
        }
    }

    static /* synthetic */ int a(int i, byte b, short s) {
        short i2;
        if ((b & 8) != 0) {
            i2 = i2 - 1;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw ajak.a("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
    }

    static IOException a(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    static /* synthetic */ IllegalArgumentException b(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public final ajag a(akkf akkf) {
        return new c(akkf);
    }

    public final ajah a(akke akke) {
        return new d(akke);
    }
}
