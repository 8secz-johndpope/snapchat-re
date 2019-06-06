package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: lambda */
/* renamed from: -$$Lambda$admc$7B8aTevOEeKD3_Pol7iBsZowH2o */
public final /* synthetic */ class -$$Lambda$admc$7B8aTevOEeKD3_Pol7iBsZowH2o implements OnFrameAvailableListener {
    private final /* synthetic */ admc f$0;
    private final /* synthetic */ long f$1;
    private final /* synthetic */ AtomicBoolean f$2;
    private final /* synthetic */ jwa f$3;

    public /* synthetic */ -$$Lambda$admc$7B8aTevOEeKD3_Pol7iBsZowH2o(admc admc, long j, AtomicBoolean atomicBoolean, jwa jwa) {
        this.f$0 = admc;
        this.f$1 = j;
        this.f$2 = atomicBoolean;
        this.f$3 = jwa;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f$0.a(this.f$1, this.f$2, this.f$3, surfaceTexture);
    }
}
