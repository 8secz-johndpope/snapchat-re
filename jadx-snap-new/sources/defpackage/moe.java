package defpackage;

import android.content.res.AssetFileDescriptor;
import java.io.InputStream;
import java.util.List;

/* renamed from: moe */
public interface moe extends ajej {

    /* renamed from: moe$a */
    public enum a {
        ;
        
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = 0;

        static {
            int[] iArr = new int[]{1, 2, 3};
            a = 1;
            b = 2;
            c = 3;
            d = iArr;
        }

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    /* renamed from: moe$b */
    public static final class b {
        public final long a;
        public final long b;

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.a == bVar.a ? 1 : null) != null) {
                        if ((this.b == bVar.b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.b;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("ResourceMetrics(size=");
            stringBuilder.append(this.a);
            stringBuilder.append(", lastModified=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    String a(String str);

    AssetFileDescriptor b(String str);

    InputStream c(String str);

    boolean d(String str);

    int e(String str);

    List<String> f(String str);

    b g(String str);
}
