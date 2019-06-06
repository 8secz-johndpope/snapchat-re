package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: aii */
public final class aii {
    public ByteBuffer a;
    public aih b;
    private final byte[] c = new byte[256];
    private int d = 0;

    private int[] a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.a.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((((bArr[i3] & 255) << 16) | -16777216) | ((bArr[i4] & 255) << 8)) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            String str = "GifHeaderParser";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Format Error Reading Color Table", e);
            }
            this.b.b = 1;
        }
        return iArr;
    }

    private void b() {
        Object obj = null;
        while (obj == null && !h()) {
            int g = g();
            if (g == 33) {
                g = g();
                if (g != 1) {
                    if (g == 249) {
                        this.b.d = new aig();
                        g();
                        g = g();
                        this.b.d.g = (g & 28) >> 2;
                        if (this.b.d.g == 0) {
                            this.b.d.g = 1;
                        }
                        this.b.d.f = (g & 1) != 0;
                        g = this.a.getShort();
                        if (g < 3) {
                            g = 10;
                        }
                        this.b.d.i = g * 10;
                        this.b.d.h = g();
                        g();
                    } else if (g != 254 && g == 255) {
                        f();
                        String str = "";
                        for (g = 0; g < 11; g++) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append((char) this.c[g]);
                            str = stringBuilder.toString();
                        }
                        if (str.equals("NETSCAPE2.0")) {
                            c();
                        }
                    }
                }
                e();
            } else if (g == 44) {
                aig aig;
                int[] a;
                if (this.b.d == null) {
                    this.b.d = new aig();
                }
                this.b.d.a = this.a.getShort();
                this.b.d.b = this.a.getShort();
                this.b.d.c = this.a.getShort();
                this.b.d.d = this.a.getShort();
                g = g();
                Object obj2 = (g & 128) != 0 ? 1 : null;
                int pow = (int) Math.pow(2.0d, (double) ((g & 7) + 1));
                this.b.d.e = (g & 64) != 0;
                if (obj2 != null) {
                    aig = this.b.d;
                    a = a(pow);
                } else {
                    aig = this.b.d;
                    a = null;
                }
                aig.k = a;
                this.b.d.j = this.a.position();
                g();
                e();
                if (!h()) {
                    aih aih = this.b;
                    aih.c++;
                    this.b.e.add(this.b.d);
                }
            } else if (g != 59) {
                this.b.b = 1;
            } else {
                obj = 1;
            }
        }
    }

    private void c() {
        do {
            f();
            byte[] bArr = this.c;
            if (bArr[0] == (byte) 1) {
                this.b.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!h());
    }

    private void d() {
        int i;
        boolean z = false;
        String str = "";
        for (i = 0; i < 6; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append((char) g());
            str = stringBuilder.toString();
        }
        if (str.startsWith("GIF")) {
            this.b.f = this.a.getShort();
            this.b.g = this.a.getShort();
            i = g();
            aih aih = this.b;
            if ((i & 128) != 0) {
                z = true;
            }
            aih.h = z;
            aih aih2 = this.b;
            aih2.i = 2 << (i & 7);
            aih2.j = g();
            this.b.k = g();
            if (this.b.h && !h()) {
                aih2 = this.b;
                aih2.a = a(aih2.i);
                aih2 = this.b;
                aih2.l = aih2.a[this.b.j];
            }
            return;
        }
        this.b.b = 1;
    }

    private void e() {
        int g;
        do {
            g = g();
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + g);
        } while (g > 0);
    }

    private int f() {
        this.d = g();
        int i = 0;
        if (this.d > 0) {
            int i2 = 0;
            while (i < this.d) {
                try {
                    i2 = this.d - i;
                    this.a.get(this.c, i, i2);
                    i += i2;
                } catch (Exception e) {
                    String str = "GifHeaderParser";
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder stringBuilder = new StringBuilder("Error Reading Block n: ");
                        stringBuilder.append(i);
                        stringBuilder.append(" count: ");
                        stringBuilder.append(i2);
                        stringBuilder.append(" blockSize: ");
                        stringBuilder.append(this.d);
                        Log.d(str, stringBuilder.toString(), e);
                    }
                    this.b.b = 1;
                }
            }
        }
        return i;
    }

    private int g() {
        try {
            return this.a.get() & 255;
        } catch (Exception unused) {
            this.b.b = 1;
            return 0;
        }
    }

    private boolean h() {
        return this.b.b != 0;
    }

    public final aih a() {
        if (this.a == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (h()) {
            return this.b;
        } else {
            d();
            if (!h()) {
                b();
                if (this.b.c < 0) {
                    this.b.b = 1;
                }
            }
            return this.b;
        }
    }

    public final aii a(byte[] bArr) {
        this.a = null;
        Arrays.fill(this.c, (byte) 0);
        this.b = new aih();
        this.d = 0;
        if (bArr != null) {
            this.a = ByteBuffer.wrap(bArr);
            this.a.rewind();
            this.a.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a = null;
            this.b.b = 2;
        }
        return this;
    }
}
