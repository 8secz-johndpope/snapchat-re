package defpackage;

import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager.PeerListListener;

/* compiled from: lambda */
/* renamed from: -$$Lambda$xeo$WnmND7A4sdCQg7mp1_YXoBoqkX8 */
public final /* synthetic */ class -$$Lambda$xeo$WnmND7A4sdCQg7mp1_YXoBoqkX8 implements PeerListListener {
    private final /* synthetic */ xeo f$0;

    public /* synthetic */ -$$Lambda$xeo$WnmND7A4sdCQg7mp1_YXoBoqkX8(xeo xeo) {
        this.f$0 = xeo;
    }

    public final void onPeersAvailable(WifiP2pDeviceList wifiP2pDeviceList) {
        this.f$0.b(wifiP2pDeviceList);
    }
}
