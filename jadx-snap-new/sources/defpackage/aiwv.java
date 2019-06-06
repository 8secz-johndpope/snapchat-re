package defpackage;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aiwv */
public interface aiwv extends Closeable {

    /* renamed from: aiwv$a */
    public static final class a {
        public String a = "unknown-authority";
        public String b;
        public aiym c;
        private aiud d = aiud.b;

        public final a a(aiud aiud) {
            Preconditions.checkNotNull(aiud, "eagAttributes");
            this.d = aiud;
            return this;
        }

        public final a a(String str) {
            this.a = (String) Preconditions.checkNotNull(str, "authority");
            return this;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.d.equals(aVar.d) && Objects.equal(this.b, aVar.b) && Objects.equal(this.c, aVar.c);
        }

        public final int hashCode() {
            return Objects.hashCode(this.a, this.d, this.b, this.c);
        }
    }

    aiwx a(SocketAddress socketAddress, a aVar);

    ScheduledExecutorService a();

    void close();
}
