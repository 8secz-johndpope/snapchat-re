package defpackage;

import defpackage.gfl.a;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;

/* renamed from: gel */
public interface gel {

    /* renamed from: gel$b */
    public interface b extends Closeable {
        b a();

        void close();
    }

    /* renamed from: gel$a */
    public static final class a {
        public final String a;
        public final int b;

        public a(String str, int i) {
            akcr.b(str, "attribution");
            this.a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (akcr.a(this.a, aVar.a)) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.a;
            return ((str != null ? str.hashCode() : 0) * 31) + this.b;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("FdAttribution(attribution=");
            stringBuilder.append(this.a);
            stringBuilder.append(", count=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    gej a(ajxe<? extends InputStream> ajxe, String str, long j, String str2);

    gej a(gez gez, a aVar, gff gff, String str);

    gej a(File file, String str);

    gej a(Iterable<? extends gej> iterable, String str);

    gej a(String str, File file, String str2);

    void a();
}
