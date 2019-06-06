package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: airo */
public class airo implements Closeable {
    private static final Logger b = Logger.getLogger(airo.class.getName());
    final RandomAccessFile a;
    private int c;
    private int d;
    private a e;
    private a f;
    private final byte[] g = new byte[16];

    /* renamed from: airo$a */
    static class a {
        static final a a = new a(0, 0);
        final int b;
        final int c;

        a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append("[position = ");
            stringBuilder.append(this.b);
            stringBuilder.append(", length = ");
            stringBuilder.append(this.c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    /* renamed from: airo$b */
    final class b extends InputStream {
        private int a;
        private int b;

        private b(a aVar) {
            this.a = airo.this.a(aVar.b + 4);
            this.b = aVar.c;
        }

        /* synthetic */ b(airo airo, a aVar, byte b) {
            this(aVar);
        }

        public final int read() {
            if (this.b == 0) {
                return -1;
            }
            airo.this.a.seek((long) this.a);
            int read = airo.this.a.read();
            this.a = airo.this.a(this.a + 1);
            this.b--;
            return read;
        }

        public final int read(byte[] bArr, int i, int i2) {
            airo.a((Object) bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            airo.this.a(this.a, bArr, i, i2);
            this.a = airo.this.a(this.a + i2);
            this.b -= i2;
            return i2;
        }
    }

    /* renamed from: airo$c */
    public interface c {
        void a(InputStream inputStream, int i);
    }

    public airo(File file) {
        if (!file.exists()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file.getPath());
            stringBuilder.append(".tmp");
            File file2 = new File(stringBuilder.toString());
            RandomAccessFile a = airo.a(file2);
            try {
                a.setLength(4096);
                a.seek(0);
                byte[] bArr = new byte[16];
                airo.a(bArr, 4096, 0, 0, 0);
                a.write(bArr);
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } finally {
                a.close();
            }
        }
        this.a = airo.a(file);
        this.a.seek(0);
        this.a.readFully(this.g);
        this.c = airo.b(this.g, 0);
        if (((long) this.c) <= this.a.length()) {
            this.d = airo.b(this.g, 4);
            int b = airo.b(this.g, 8);
            int b2 = airo.b(this.g, 12);
            this.e = b(b);
            this.f = b(b2);
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder("File is truncated. Expected length: ");
        stringBuilder2.append(this.c);
        stringBuilder2.append(", Actual length: ");
        stringBuilder2.append(this.a.length());
        throw new IOException(stringBuilder2.toString());
    }

    private static RandomAccessFile a(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private void a(int i, int i2, int i3, int i4) {
        airo.a(this.g, i, i2, i3, i4);
        this.a.seek(0);
        this.a.write(this.g);
    }

    private void a(int i, byte[] bArr, int i2) {
        i = a(i);
        int i3 = i + i2;
        int i4 = this.c;
        if (i3 <= i4) {
            this.a.seek((long) i);
            this.a.write(bArr, 0, i2);
            return;
        }
        i4 -= i;
        this.a.seek((long) i);
        this.a.write(bArr, 0, i4);
        this.a.seek(16);
        this.a.write(bArr, i4, i2 - i4);
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            airo.a(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    private static int b(byte[] bArr, int i) {
        return ((((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16)) + ((bArr[i + 2] & 255) << 8)) + (bArr[i + 3] & 255);
    }

    private a b(int i) {
        if (i == 0) {
            return a.a;
        }
        this.a.seek((long) i);
        return new a(i, this.a.readInt());
    }

    private void c(int i) {
        i += 4;
        int a = this.c - a();
        if (a < i) {
            int i2 = this.c;
            do {
                a += i2;
                i2 <<= 1;
            } while (a < i);
            d(i2);
            i = a((this.f.b + 4) + this.f.c);
            if (i < this.e.b) {
                FileChannel channel = this.a.getChannel();
                channel.position((long) this.c);
                long j = (long) (i - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            if (this.f.b < this.e.b) {
                i = (this.c + this.f.b) - 16;
                a(i2, this.d, this.e.b, i);
                this.f = new a(i, this.f.c);
            } else {
                a(i2, this.d, this.e.b, this.f.b);
            }
            this.c = i2;
        }
    }

    private synchronized void d() {
        a(4096, 0, 0, 0);
        this.d = 0;
        this.e = a.a;
        this.f = a.a;
        if (this.c > 4096) {
            d(4096);
        }
        this.c = 4096;
    }

    private void d(int i) {
        this.a.setLength((long) i);
        this.a.getChannel().force(true);
    }

    public final int a() {
        return this.d == 0 ? 16 : this.f.b >= this.e.b ? (((this.f.b - this.e.b) + 4) + this.f.c) + 16 : (((this.f.b + 4) + this.f.c) + this.c) - this.e.b;
    }

    /* Access modifiers changed, original: final */
    public final int a(int i) {
        int i2 = this.c;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        i = a(i);
        int i4 = i + i3;
        int i5 = this.c;
        if (i4 <= i5) {
            this.a.seek((long) i);
            randomAccessFile = this.a;
        } else {
            i5 -= i;
            this.a.seek((long) i);
            this.a.readFully(bArr, i2, i5);
            this.a.seek(16);
            randomAccessFile = this.a;
            i2 += i5;
            i3 -= i5;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x002d in {6, 8, 11} preds:[]
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
    public final synchronized void a(defpackage.airo.c r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.e;	 Catch:{ all -> 0x002a }
        r0 = r0.b;	 Catch:{ all -> 0x002a }
        r1 = 0;	 Catch:{ all -> 0x002a }
        r2 = r0;	 Catch:{ all -> 0x002a }
        r0 = 0;	 Catch:{ all -> 0x002a }
        r3 = r5.d;	 Catch:{ all -> 0x002a }
        if (r0 >= r3) goto L_0x0028;	 Catch:{ all -> 0x002a }
        r2 = r5.b(r2);	 Catch:{ all -> 0x002a }
        r3 = new airo$b;	 Catch:{ all -> 0x002a }
        r3.<init>(r5, r2, r1);	 Catch:{ all -> 0x002a }
        r4 = r2.c;	 Catch:{ all -> 0x002a }
        r6.a(r3, r4);	 Catch:{ all -> 0x002a }
        r3 = r2.b;	 Catch:{ all -> 0x002a }
        r3 = r3 + 4;	 Catch:{ all -> 0x002a }
        r2 = r2.c;	 Catch:{ all -> 0x002a }
        r3 = r3 + r2;	 Catch:{ all -> 0x002a }
        r2 = r5.a(r3);	 Catch:{ all -> 0x002a }
        r0 = r0 + 1;
        goto L_0x0008;
        monitor-exit(r5);
        return;
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airo.a(airo$c):void");
    }

    public final synchronized void a(byte[] bArr, int i) {
        airo.a((Object) bArr, "buffer");
        if ((i | 0) < 0 || i > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        c(i);
        boolean b = b();
        a aVar = new a(b ? 16 : a((this.f.b + 4) + this.f.c), i);
        airo.a(this.g, 0, i);
        a(aVar.b, this.g, 4);
        a(aVar.b + 4, bArr, i);
        a(this.c, this.d + 1, b ? aVar.b : this.e.b, aVar.b);
        this.f = aVar;
        this.d++;
        if (b) {
            this.e = this.f;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x000d in {4, 6, 7, 10} preds:[]
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
    public final synchronized boolean b() {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.d;	 Catch:{ all -> 0x000a }
        if (r0 != 0) goto L_0x0008;
        r0 = 1;
        monitor-exit(r1);
        return r0;
        r0 = 0;
        goto L_0x0006;
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airo.b():boolean");
    }

    public final synchronized void c() {
        if (b()) {
            throw new NoSuchElementException();
        } else if (this.d == 1) {
            d();
        } else {
            int a = a((this.e.b + 4) + this.e.c);
            a(a, this.g, 0, 4);
            int b = airo.b(this.g, 0);
            a(this.c, this.d - 1, a, this.f.b);
            this.d--;
            this.e = new a(a, b);
        }
    }

    public synchronized void close() {
        this.a.close();
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.c);
        stringBuilder.append(", size=");
        stringBuilder.append(this.d);
        stringBuilder.append(", first=");
        stringBuilder.append(this.e);
        stringBuilder.append(", last=");
        stringBuilder.append(this.f);
        stringBuilder.append(", element lengths=[");
        try {
            a(new c() {
                private boolean a = true;

                public final void a(InputStream inputStream, int i) {
                    if (this.a) {
                        this.a = false;
                    } else {
                        stringBuilder.append(ppy.d);
                    }
                    stringBuilder.append(i);
                }
            });
        } catch (IOException e) {
            b.log(Level.WARNING, "read error", e);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
