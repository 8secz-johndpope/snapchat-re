package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Message;
import defpackage.xgo.a;

/* compiled from: lambda */
/* renamed from: -$$Lambda$xgo$OrIh9dYcl09EA-TYdU_pLM4DJJA */
public final /* synthetic */ class -$$Lambda$xgo$OrIh9dYcl09EA-TYdU_pLM4DJJA implements xkx {
    private final /* synthetic */ xgo f$0;
    private final /* synthetic */ a f$1;
    private final /* synthetic */ Message f$2;

    public /* synthetic */ -$$Lambda$xgo$OrIh9dYcl09EA-TYdU_pLM4DJJA(xgo xgo, a aVar, Message message) {
        this.f$0 = xgo;
        this.f$1 = aVar;
        this.f$2 = message;
    }

    public final void onConnected(xdb xdb, BluetoothDevice bluetoothDevice) {
        this.f$0.a(this.f$1, this.f$2, xdb, bluetoothDevice);
    }
}
