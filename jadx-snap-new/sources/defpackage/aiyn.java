package defpackage;

import com.google.common.base.Preconditions;
import java.net.SocketAddress;

/* renamed from: aiyn */
final class aiyn extends SocketAddress {
    final SocketAddress a;
    final aiym b;

    aiyn(SocketAddress socketAddress, aiym aiym) {
        this.a = (SocketAddress) Preconditions.checkNotNull(socketAddress);
        this.b = (aiym) Preconditions.checkNotNull(aiym);
    }
}
