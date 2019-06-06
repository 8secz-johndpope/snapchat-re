package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahc */
public final class ahc {

    /* renamed from: ahc$a */
    public static class a extends InputStream {
        private final ByteBuffer a;
        private int b = -1;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        public final int available() {
            return this.a.remaining();
        }

        public final synchronized void mark(int i) {
            this.b = this.a.position();
        }

        public final boolean markSupported() {
            return true;
        }

        public final int read() {
            return !this.a.hasRemaining() ? -1 : this.a.get();
        }

        public final int read(byte[] bArr, int i, int i2) {
            if (!this.a.hasRemaining()) {
                return -1;
            }
            i2 = Math.min(i2, available());
            this.a.get(bArr, i, i2);
            return i2;
        }

        public final synchronized void reset() {
            if (this.b != -1) {
                this.a.position(this.b);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public final long skip(long j) {
            if (!this.a.hasRemaining()) {
                return -1;
            }
            j = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position((int) (((long) byteBuffer.position()) + j));
            return j;
        }
    }

    /* renamed from: ahc$b */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;

        public b(byte[] bArr, int i, int i2) {
            this.c = bArr;
            this.a = i;
            this.b = i2;
        }
    }

    static {
        AtomicReference atomicReference = new AtomicReference();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A:{SYNTHETIC, Splitter:B:29:0x004e} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0053 A:{SYNTHETIC, Splitter:B:33:0x0053} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A:{SYNTHETIC, Splitter:B:29:0x004e} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0053 A:{SYNTHETIC, Splitter:B:33:0x0053} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(2:12|13)|14|15|16) */
    public static java.nio.ByteBuffer a(java.io.File r9) {
        /*
        r0 = 0;
        r5 = r9.length();	 Catch:{ all -> 0x004a }
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r3 > 0) goto L_0x0042;
    L_0x000c:
        r1 = 0;
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r3 == 0) goto L_0x003a;
    L_0x0012:
        r7 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x004a }
        r1 = "r";
        r7.<init>(r9, r1);	 Catch:{ all -> 0x004a }
        r9 = r7.getChannel();	 Catch:{ all -> 0x0038 }
        r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ all -> 0x0033 }
        r3 = 0;
        r1 = r9;
        r0 = r1.map(r2, r3, r5);	 Catch:{ all -> 0x0033 }
        r0 = r0.load();	 Catch:{ all -> 0x0033 }
        if (r9 == 0) goto L_0x002f;
    L_0x002c:
        r9.close();	 Catch:{ IOException -> 0x002f }
    L_0x002f:
        r7.close();	 Catch:{ IOException -> 0x0032 }
    L_0x0032:
        return r0;
    L_0x0033:
        r0 = move-exception;
        r8 = r0;
        r0 = r9;
        r9 = r8;
        goto L_0x004c;
    L_0x0038:
        r9 = move-exception;
        goto L_0x004c;
    L_0x003a:
        r9 = new java.io.IOException;	 Catch:{ all -> 0x004a }
        r1 = "File unsuitable for memory mapping";
        r9.<init>(r1);	 Catch:{ all -> 0x004a }
        throw r9;	 Catch:{ all -> 0x004a }
    L_0x0042:
        r9 = new java.io.IOException;	 Catch:{ all -> 0x004a }
        r1 = "File too large to map into memory";
        r9.<init>(r1);	 Catch:{ all -> 0x004a }
        throw r9;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r9 = move-exception;
        r7 = r0;
    L_0x004c:
        if (r0 == 0) goto L_0x0051;
    L_0x004e:
        r0.close();	 Catch:{ IOException -> 0x0051 }
    L_0x0051:
        if (r7 == 0) goto L_0x0056;
    L_0x0053:
        r7.close();	 Catch:{ IOException -> 0x0056 }
    L_0x0056:
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahc.a(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A:{SYNTHETIC, Splitter:B:15:0x002b} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A:{SYNTHETIC, Splitter:B:19:0x0030} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|(2:6|7)|8|9|23) */
    /* JADX WARNING: Missing block: B:24:?, code skipped:
            return;
     */
    public static void a(java.nio.ByteBuffer r4, java.io.File r5) {
        /*
        r0 = 0;
        r4.position(r0);
        r1 = 0;
        r2 = new java.io.RandomAccessFile;	 Catch:{ all -> 0x0027 }
        r3 = "rw";
        r2.<init>(r5, r3);	 Catch:{ all -> 0x0027 }
        r1 = r2.getChannel();	 Catch:{ all -> 0x0025 }
        r1.write(r4);	 Catch:{ all -> 0x0025 }
        r1.force(r0);	 Catch:{ all -> 0x0025 }
        r1.close();	 Catch:{ all -> 0x0025 }
        r2.close();	 Catch:{ all -> 0x0025 }
        if (r1 == 0) goto L_0x0021;
    L_0x001e:
        r1.close();	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        r2.close();	 Catch:{ IOException -> 0x0024 }
    L_0x0024:
        return;
    L_0x0025:
        r4 = move-exception;
        goto L_0x0029;
    L_0x0027:
        r4 = move-exception;
        r2 = r1;
    L_0x0029:
        if (r1 == 0) goto L_0x002e;
    L_0x002b:
        r1.close();	 Catch:{ IOException -> 0x002e }
    L_0x002e:
        if (r2 == 0) goto L_0x0033;
    L_0x0030:
        r2.close();	 Catch:{ IOException -> 0x0033 }
    L_0x0033:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahc.a(java.nio.ByteBuffer, java.io.File):void");
    }
}
