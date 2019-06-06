package defpackage;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aiuw */
public final class aiuw {
    public final List<SocketAddress> a;
    public final aiud b;
    private final int c;

    public aiuw(SocketAddress socketAddress) {
        this(socketAddress, aiud.b);
    }

    private aiuw(SocketAddress socketAddress, aiud aiud) {
        this(Collections.singletonList(socketAddress), aiud);
    }

    public aiuw(List<SocketAddress> list) {
        this((List) list, aiud.b);
    }

    private aiuw(List<SocketAddress> list, aiud aiud) {
        Preconditions.checkArgument(list.isEmpty() ^ 1, "addrs is empty");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = (aiud) Preconditions.checkNotNull(aiud, "attrs");
        this.c = this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aiuw)) {
            return false;
        }
        aiuw aiuw = (aiuw) obj;
        if (this.a.size() != aiuw.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); i++) {
            if (!((SocketAddress) this.a.get(i)).equals(aiuw.a.get(i))) {
                return false;
            }
        }
        return this.b.equals(aiuw.b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[addrs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", attrs=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
