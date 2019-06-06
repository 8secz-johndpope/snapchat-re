package defpackage;

import android.hardware.Camera.ShutterCallback;

/* compiled from: lambda */
/* renamed from: -$$Lambda$e-vF8UwVQElaoI246C6KhYx1078 */
public final /* synthetic */ class -$$Lambda$e-vF8UwVQElaoI246C6KhYx1078 implements ShutterCallback {
    private final /* synthetic */ Runnable f$0;

    public /* synthetic */ -$$Lambda$e-vF8UwVQElaoI246C6KhYx1078(Runnable runnable) {
        this.f$0 = runnable;
    }

    public final void onShutter() {
        this.f$0.run();
    }
}
