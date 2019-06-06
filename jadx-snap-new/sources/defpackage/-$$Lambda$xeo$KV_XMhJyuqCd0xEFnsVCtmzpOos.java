package defpackage;

import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener;

/* compiled from: lambda */
/* renamed from: -$$Lambda$xeo$KV_XMhJyuqCd0xEFnsVCtmzpOos */
public final /* synthetic */ class -$$Lambda$xeo$KV_XMhJyuqCd0xEFnsVCtmzpOos implements ConnectionInfoListener {
    private final /* synthetic */ xeo f$0;

    public /* synthetic */ -$$Lambda$xeo$KV_XMhJyuqCd0xEFnsVCtmzpOos(xeo xeo) {
        this.f$0 = xeo;
    }

    public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
        this.f$0.a(wifiP2pInfo);
    }
}
