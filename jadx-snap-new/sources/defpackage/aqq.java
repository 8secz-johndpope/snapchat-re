package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aqq */
public final class aqq {
    private byte a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private boolean g;
    private int h;

    public aqq(ByteBuffer byteBuffer) {
        long a = aqi.a(byteBuffer);
        this.a = (byte) ((int) ((-268435456 & a) >> 28));
        this.b = (byte) ((int) ((201326592 & a) >> 26));
        this.c = (byte) ((int) ((50331648 & a) >> 24));
        this.d = (byte) ((int) ((12582912 & a) >> 22));
        this.e = (byte) ((int) ((3145728 & a) >> 20));
        this.f = (byte) ((int) ((917504 & a) >> 17));
        this.g = ((65536 & a) >> 16) > 0;
        this.h = (int) (a & 65535);
    }

    public final void a(ByteBuffer byteBuffer) {
        aqk.b(byteBuffer, (((((((((long) (this.a << 28)) | 0) | ((long) (this.b << 26))) | ((long) (this.c << 24))) | ((long) (this.d << 22))) | ((long) (this.e << 20))) | ((long) (this.f << 17))) | ((long) (this.g << 16))) | ((long) this.h));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aqq aqq = (aqq) obj;
        return this.b == aqq.b && this.a == aqq.a && this.h == aqq.h && this.c == aqq.c && this.e == aqq.e && this.d == aqq.d && this.g == aqq.g && this.f == aqq.f;
    }

    public final int hashCode() {
        return (((((((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SampleFlags{reserved=");
        stringBuilder.append(this.a);
        stringBuilder.append(", isLeading=");
        stringBuilder.append(this.b);
        stringBuilder.append(", depOn=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isDepOn=");
        stringBuilder.append(this.d);
        stringBuilder.append(", hasRedundancy=");
        stringBuilder.append(this.e);
        stringBuilder.append(", padValue=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isDiffSample=");
        stringBuilder.append(this.g);
        stringBuilder.append(", degradPrio=");
        stringBuilder.append(this.h);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
