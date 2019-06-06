package defpackage;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import org.opencv.imgproc.Imgproc;

/* renamed from: aivl */
public final class aivl {
    public static final b<String> a = new 2();
    private static /* synthetic */ boolean d = (aivl.class.desiredAssertionStatus() ^ 1);
    public byte[][] b;
    public int c;

    /* renamed from: aivl$1 */
    class 1 implements d<byte[]> {
        1() {
        }
    }

    /* renamed from: aivl$2 */
    class 2 implements b<String> {
        2() {
        }
    }

    /* renamed from: aivl$d */
    public interface d<T> {
        T a(byte[] bArr);

        byte[] a(T t);
    }

    /* renamed from: aivl$b */
    public interface b<T> {
        T a(String str);

        String a(T t);
    }

    /* renamed from: aivl$e */
    public static abstract class e<T> {
        private static final BitSet c;
        public final String a;
        final byte[] b;
        private final String d;

        static {
            int i;
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (i = 48; i <= 57; i = (char) (i + 1)) {
                bitSet.set(i);
            }
            for (i = 97; i <= Imgproc.COLOR_YUV2BGRA_YVYU; i = (char) (i + 1)) {
                bitSet.set(i);
            }
            c = bitSet;
        }

        private e(String str, boolean z) {
            this.d = (String) Preconditions.checkNotNull(str, "name");
            this.a = e.a(this.d.toLowerCase(Locale.ROOT), z);
            this.b = this.a.getBytes(Charsets.US_ASCII);
        }

        /* synthetic */ e(String str, boolean z, byte b) {
            this(str, z);
        }

        public static <T> e<T> a(String str, b<T> bVar) {
            return new a(str, bVar);
        }

        public static <T> e<T> a(String str, d<T> dVar) {
            return new c(str, dVar, (byte) 0);
        }

        static <T> e<T> a(String str, boolean z, g<T> gVar) {
            return new f(str, z, gVar, (byte) 0);
        }

        private static String a(String str, boolean z) {
            Preconditions.checkNotNull(str, "name");
            Preconditions.checkArgument(str.isEmpty() ^ 1, "token must have at least 1 tchar");
            int i = 0;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (!z || charAt != ':' || i != 0) {
                    Preconditions.checkArgument(c.get(charAt), "Invalid character '%s' in key name '%s'", charAt, (Object) str);
                }
                i++;
            }
            return str;
        }

        public abstract T a(byte[] bArr);

        public abstract byte[] a(T t);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.a.equals(((e) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("Key{name='");
            stringBuilder.append(this.a);
            stringBuilder.append("'}");
            return stringBuilder.toString();
        }
    }

    /* renamed from: aivl$a */
    static class a<T> extends e<T> {
        private final b<T> c;

        /* synthetic */ a(String str, b bVar) {
            this(str, false, bVar);
        }

        private a(String str, boolean z, b<T> bVar) {
            super(str, false, (byte) 0);
            Object obj = "-bin";
            Preconditions.checkArgument(str.endsWith(obj) ^ 1, "ASCII header is named %s.  Only binary headers may end with %s", (Object) str, obj);
            this.c = (b) Preconditions.checkNotNull(bVar, "marshaller");
        }

        /* Access modifiers changed, original: final */
        public final T a(byte[] bArr) {
            return this.c.a(new String(bArr, Charsets.US_ASCII));
        }

        /* Access modifiers changed, original: final */
        public final byte[] a(T t) {
            return this.c.a((Object) t).getBytes(Charsets.US_ASCII);
        }
    }

    /* renamed from: aivl$f */
    static final class f<T> extends e<T> {
        private final g<T> c;

        private f(String str, boolean z, g<T> gVar) {
            super(str, z, (byte) 0);
            Object obj = "-bin";
            Preconditions.checkArgument(str.endsWith(obj) ^ 1, "ASCII header is named %s.  Only binary headers may end with %s", (Object) str, obj);
            this.c = (g) Preconditions.checkNotNull(gVar, "marshaller");
        }

        /* synthetic */ f(String str, boolean z, g gVar, byte b) {
            this(str, z, gVar);
        }

        /* Access modifiers changed, original: final */
        public final T a(byte[] bArr) {
            return this.c.a(bArr);
        }

        /* Access modifiers changed, original: final */
        public final byte[] a(T t) {
            return this.c.a((Object) t);
        }
    }

    /* renamed from: aivl$g */
    interface g<T> {
        T a(byte[] bArr);

        byte[] a(T t);
    }

    /* renamed from: aivl$c */
    static class c<T> extends e<T> {
        private final d<T> c;

        private c(String str, d<T> dVar) {
            boolean z = false;
            super(str, false, (byte) 0);
            Object obj = "-bin";
            Preconditions.checkArgument(str.endsWith(obj), "Binary header is named %s. It must end with %s", (Object) str, obj);
            if (str.length() > 4) {
                z = true;
            }
            Preconditions.checkArgument(z, "empty key name");
            this.c = (d) Preconditions.checkNotNull(dVar, "marshaller is null");
        }

        /* synthetic */ c(String str, d dVar, byte b) {
            this(str, dVar);
        }

        /* Access modifiers changed, original: final */
        public final T a(byte[] bArr) {
            return this.c.a(bArr);
        }

        /* Access modifiers changed, original: final */
        public final byte[] a(T t) {
            return this.c.a((Object) t);
        }
    }

    static {
        1 1 = new 1();
    }

    private aivl(int i, byte[]... bArr) {
        if (d || (bArr.length & 1) == 0) {
            this.c = i;
            this.b = bArr;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Odd number of key-value pairs ");
        stringBuilder.append(bArr.length);
        throw new AssertionError(stringBuilder.toString());
    }

    aivl(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    private void a(int i, byte[] bArr) {
        this.b[i << 1] = bArr;
    }

    private byte[] a(int i) {
        return this.b[i << 1];
    }

    private void b(int i, byte[] bArr) {
        this.b[(i << 1) + 1] = bArr;
    }

    private boolean b() {
        return this.c == 0;
    }

    private byte[] b(int i) {
        return this.b[(i << 1) + 1];
    }

    private void c(int i) {
        byte[][] bArr = new byte[i][];
        if (!b()) {
            System.arraycopy(this.b, 0, bArr, 0, this.c << 1);
        }
        this.b = bArr;
    }

    public final int a() {
        byte[][] bArr = this.b;
        return bArr != null ? bArr.length : 0;
    }

    public final <T> T a(e<T> eVar) {
        for (int i = this.c - 1; i >= 0; i--) {
            if (Arrays.equals(eVar.b, a(i))) {
                return eVar.a(b(i));
            }
        }
        return null;
    }

    public final <T> void a(e<T> eVar, T t) {
        Preconditions.checkNotNull(eVar, "key");
        Preconditions.checkNotNull(t, "value");
        int i = this.c;
        if ((i << 1) == 0 || (i << 1) == a()) {
            c(Math.max((this.c << 1) << 1, 8));
        }
        a(this.c, eVar.b);
        b(this.c, eVar.a((Object) t));
        this.c++;
    }

    public final void a(aivl aivl) {
        if (!aivl.b()) {
            int a = a() - (this.c << 1);
            if (b() || a < (aivl.c << 1)) {
                c((this.c << 1) + (aivl.c << 1));
            }
            System.arraycopy(aivl.b, 0, this.b, this.c << 1, aivl.c << 1);
            this.c += aivl.c;
        }
    }

    public final <T> void b(e<T> eVar) {
        if (!b()) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.c;
                if (i < i3) {
                    if (!Arrays.equals(eVar.b, a(i))) {
                        a(i2, a(i));
                        b(i2, b(i));
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.b, i2 << 1, i3 << 1, null);
                    this.c = i2;
                    return;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metadata(");
        for (int i = 0; i < this.c; i++) {
            if (i != 0) {
                stringBuilder.append(',');
            }
            String str = new String(a(i), Charsets.US_ASCII);
            stringBuilder.append(str);
            stringBuilder.append('=');
            stringBuilder.append(str.endsWith("-bin") ? BaseEncoding.base64().encode(b(i)) : new String(b(i), Charsets.US_ASCII));
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
