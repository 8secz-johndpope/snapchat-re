package defpackage;

import com.google.common.base.Preconditions;
import java.io.InputStream;

/* renamed from: aiyp */
public final class aiyp {

    /* renamed from: aiyp$b */
    static class b extends aiwd {
        private int a;
        private int b;
        private byte[] c;

        b(byte[] bArr) {
            this(bArr, 0, 0);
        }

        b(byte[] bArr, int i, int i2) {
            boolean z = true;
            Preconditions.checkArgument(i >= 0, "offset must be >= 0");
            Preconditions.checkArgument(i2 >= 0, "length must be >= 0");
            i2 += i;
            if (i2 > bArr.length) {
                z = false;
            }
            Preconditions.checkArgument(z, "offset + length exceeds array boundary");
            this.c = (byte[]) Preconditions.checkNotNull(bArr, "bytes");
            this.a = i;
            this.b = i2;
        }

        public final void a(byte[] bArr, int i, int i2) {
            System.arraycopy(this.c, this.a, bArr, i, i2);
            this.a += i2;
        }

        public final int b() {
            return this.b - this.a;
        }

        public final int c() {
            a(1);
            byte[] bArr = this.c;
            int i = this.a;
            this.a = i + 1;
            return bArr[i] & 255;
        }

        public final /* synthetic */ aiyo c(int i) {
            a(i);
            int i2 = this.a;
            this.a = i2 + i;
            return new b(this.c, i2, i);
        }
    }

    /* renamed from: aiyp$a */
    static final class a extends InputStream implements aivg {
        private aiyo a;

        public a(aiyo aiyo) {
            this.a = (aiyo) Preconditions.checkNotNull(aiyo, "buffer");
        }

        public final int available() {
            return this.a.b();
        }

        public final void close() {
            this.a.close();
        }

        public final int read() {
            return this.a.b() == 0 ? -1 : this.a.c();
        }

        public final int read(byte[] bArr, int i, int i2) {
            if (this.a.b() == 0) {
                return -1;
            }
            i2 = Math.min(this.a.b(), i2);
            this.a.a(bArr, i, i2);
            return i2;
        }
    }

    static {
        b bVar = new b(new byte[0]);
    }

    public static InputStream a(aiyo aiyo) {
        return new a(aiyo);
    }
}
