package defpackage;

import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager.GroupInfoListener;

/* compiled from: lambda */
/* renamed from: -$$Lambda$xeo$5KgV8LElCYBNPAdpoSGnv_ruHHo */
public final /* synthetic */ class -$$Lambda$xeo$5KgV8LElCYBNPAdpoSGnv_ruHHo implements GroupInfoListener {
    private final /* synthetic */ xeo f$0;
    private final /* synthetic */ boolean f$1;

    public /* synthetic */ -$$Lambda$xeo$5KgV8LElCYBNPAdpoSGnv_ruHHo(xeo xeo, boolean z) {
        this.f$0 = xeo;
        this.f$1 = z;
    }

    public final void onGroupInfoAvailable(WifiP2pGroup wifiP2pGroup) {
        this.f$0.a(this.f$1, wifiP2pGroup);
    }
}
