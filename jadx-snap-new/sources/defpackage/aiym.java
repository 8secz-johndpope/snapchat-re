package defpackage;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;

/* renamed from: aiym */
public final class aiym {
    public final InetSocketAddress a;
    public final String b;
    public final String c;

    public aiym(InetSocketAddress inetSocketAddress, String str, String str2) {
        Preconditions.checkNotNull(inetSocketAddress);
        Preconditions.checkState(inetSocketAddress.isUnresolved() ^ 1);
        this.a = inetSocketAddress;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aiym)) {
            return false;
        }
        aiym aiym = (aiym) obj;
        return Objects.equal(this.a, aiym.a) && Objects.equal(this.b, aiym.b) && Objects.equal(this.c, aiym.c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c);
    }
}
