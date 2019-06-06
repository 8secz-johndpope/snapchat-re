package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;

/* renamed from: abmx */
public final class abmx extends FilterOutputStream {
    private Cipher a;
    private OutputStream b;
    private byte[] c;
    private byte[] d;
    private int e;

    public abmx(OutputStream outputStream, Cipher cipher) {
        this(outputStream, cipher, (byte) 0);
    }

    private abmx(OutputStream outputStream, Cipher cipher, byte b) {
        super(outputStream);
        this.c = new byte[1];
        this.b = outputStream;
        this.a = cipher;
        this.d = new byte[20480];
        this.e = 0;
    }

    public final void close() {
        try {
            this.d = this.a.doFinal();
            if (this.d != null) {
                this.e = this.d.length;
            } else {
                this.e = 0;
            }
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
            this.e = 0;
        }
        try {
            flush();
        } catch (IOException unused2) {
        }
        this.out.close();
    }

    public final void flush() {
        int i = this.e;
        if (i > 0) {
            this.b.write(this.d, 0, i);
            this.e = 0;
        }
        this.b.flush();
    }

    public final void write(int i) {
        byte[] bArr = this.c;
        bArr[0] = (byte) i;
        try {
            this.e = this.a.update(bArr, 0, 1, this.d);
            if (this.e > 0) {
                this.b.write(this.d, 0, this.e);
                this.e = 0;
            }
        } catch (ShortBufferException unused) {
            int outputSize = this.a.getOutputSize(1);
            if (outputSize > this.d.length) {
                this.d = new byte[outputSize];
            }
            try {
                this.e = this.a.update(this.c, 0, 1, this.d);
            } catch (ShortBufferException unused2) {
            }
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Missing block: B:7:0x001c, code skipped:
            if (r4 > 0) goto L_0x001e;
     */
    /* JADX WARNING: Missing block: B:8:0x001e, code skipped:
            r3.b.write(r3.d, 0, r4);
            r3.e = 0;
     */
    /* JADX WARNING: Missing block: B:9:0x0027, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:17:0x0039, code skipped:
            if (r4 <= 0) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:18:0x003c, code skipped:
            return;
     */
    public final void write(byte[] r4, int r5, int r6) {
        /*
        r3 = this;
        r0 = 0;
        r1 = r3.a;	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        r1 = r1.getOutputSize(r6);	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        r2 = r3.d;	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        r2 = r2.length;	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        if (r1 <= r2) goto L_0x0010;
    L_0x000c:
        r1 = new byte[r1];	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        r3.d = r1;	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
    L_0x0010:
        r1 = r3.a;	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        r2 = r3.d;	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        r4 = r1.update(r4, r5, r6, r2);	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        r3.e = r4;	 Catch:{ ShortBufferException -> 0x0037, all -> 0x0028 }
        r4 = r3.e;
        if (r4 <= 0) goto L_0x003c;
    L_0x001e:
        r5 = r3.b;
        r6 = r3.d;
        r5.write(r6, r0, r4);
        r3.e = r0;
        return;
    L_0x0028:
        r4 = move-exception;
        r5 = r3.e;
        if (r5 <= 0) goto L_0x0036;
    L_0x002d:
        r6 = r3.b;
        r1 = r3.d;
        r6.write(r1, r0, r5);
        r3.e = r0;
    L_0x0036:
        throw r4;
    L_0x0037:
        r4 = r3.e;
        if (r4 <= 0) goto L_0x003c;
    L_0x003b:
        goto L_0x001e;
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmx.write(byte[], int, int):void");
    }
}
