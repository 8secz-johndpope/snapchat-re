package defpackage;

import android.os.Handler;
import defpackage.zfw.a;

/* renamed from: dsp */
public final class dsp implements aiqc<ajdw> {
    private final ajwy<dyw> a;

    public static ajdw a(dyw dyw) {
        akcr.b(dyw, "cameraFrameDispatcherFactory");
        Object a = dyw.a();
        akcr.a(a, "cameraFrameDispatcherFactory.cameraFrameDispatcher");
        return (ajdw) aiqf.a(a.a((Handler) a, dnh.f.callsite("CameraGL")), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dsp.a((dyw) this.a.get());
    }
}
