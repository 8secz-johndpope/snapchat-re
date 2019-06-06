package defpackage;

import com.snap.camera.api.CameraFragment;
import com.snap.camera.fragment.CameraFragmentImpl;

/* renamed from: drz */
public final class drz implements aiqc<CameraFragment> {
    private final ajwy<duy> a;
    private final ajwy<ajws<ebj>> b;

    public static CameraFragment a(duy duy, ajws<ebj> ajws) {
        akcr.b(duy, "mainCameraFragmentConfiguration");
        akcr.b(ajws, "captureStartEventSubject");
        CameraFragmentImpl cameraFragmentImpl = new CameraFragmentImpl();
        cameraFragmentImpl.D = duy;
        cameraFragmentImpl.A.f().a((ajdv) ajws);
        return (CameraFragment) aiqf.a(cameraFragmentImpl, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return drz.a((duy) this.a.get(), (ajws) this.b.get());
    }
}
