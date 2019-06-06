package defpackage;

import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;

/* compiled from: lambda */
/* renamed from: -$$Lambda$xef$JQLGReSosmgHgba36XWPj6_LHVo */
public final /* synthetic */ class -$$Lambda$xef$JQLGReSosmgHgba36XWPj6_LHVo implements LeScanCallback {
    private final /* synthetic */ xef f$0;

    public /* synthetic */ -$$Lambda$xef$JQLGReSosmgHgba36XWPj6_LHVo(xef xef) {
        this.f$0 = xef;
    }

    public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        this.f$0.a(bluetoothDevice, i, bArr);
    }
}
