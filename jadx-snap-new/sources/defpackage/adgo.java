package defpackage;

import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* renamed from: adgo */
public interface adgo {

    /* renamed from: adgo$a */
    public enum a {
        CONTINUE,
        END_OF_INPUT
    }

    /* renamed from: adgo$b */
    public static final class b {
        public final a a;
        public final int b;
        public final long c;
        public final int d;
        public final int e;

        private b(a aVar, int i, long j, int i2) {
            akcr.b(aVar, "result");
            this.a = aVar;
            this.b = i;
            this.c = j;
            this.d = i2;
            this.e = 0;
        }

        public /* synthetic */ b(a aVar, int i, long j, int i2, byte b) {
            this(aVar, i, j, i2);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (akcr.a(this.a, bVar.a)) {
                        if ((this.b == bVar.b ? 1 : null) != null) {
                            if ((this.c == bVar.c ? 1 : null) != null) {
                                if ((this.d == bVar.d ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + this.b) * 31;
            long j = this.c;
            return (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.d) * 31;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("SampleInfo(result=");
            stringBuilder.append(this.a);
            stringBuilder.append(", size=");
            stringBuilder.append(this.b);
            stringBuilder.append(", timeUs=");
            stringBuilder.append(this.c);
            stringBuilder.append(", flags=");
            stringBuilder.append(this.d);
            stringBuilder.append(", offset=0");
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: adgo$c */
    public enum c {
        PREVIOUS_SYNC,
        NEXT_SYNC,
        CLOSEST_SYNC
    }

    /* renamed from: adgo$d */
    public enum d {
        VIDEO,
        AUDIO
    }

    b a(ByteBuffer byteBuffer);

    MediaFormat a();

    void a(long j, c cVar);

    void a(String str);

    void b();

    void c();
}
