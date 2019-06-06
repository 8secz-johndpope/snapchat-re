package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.media.CamcorderProfile;
import android.view.Surface;
import com.google.common.base.Optional;
import defpackage.dpa.b;
import defpackage.dpa.c;
import java.util.List;

/* renamed from: dpp */
public interface dpp {
    Camera a();

    CamcorderProfile a(ebx ebx);

    void a(float f);

    void a(float f, dor dor);

    void a(SurfaceTexture surfaceTexture);

    void a(SurfaceTexture surfaceTexture, dpc dpc, edj edj);

    void a(SurfaceTexture surfaceTexture, ecu ecu);

    void a(SurfaceTexture surfaceTexture, ecu ecu, dov dov, abtl abtl);

    void a(PreviewCallback previewCallback);

    void a(Surface surface, dpc dpc);

    void a(Surface surface, dpc dpc, edj edj);

    void a(Surface surface, ecu ecu, dov dov, doz doz, abtl abtl);

    void a(dom dom);

    void a(dom dom, int i, int i2, int i3, int i4);

    void a(doq doq);

    void a(doq doq, dou dou);

    void a(dos dos);

    void a(dou dou);

    void a(dox dox);

    void a(dpa dpa, b bVar, c cVar);

    void a(dpa dpa, b bVar, c cVar, boolean z, int i);

    void a(ecc ecc);

    void a(ece ece);

    void a(edg edg);

    void a(boolean z);

    void a(byte[] bArr);

    List<ecd> b();

    void b(doq doq);

    void b(dos dos);

    void b(dou dou);

    void b(dox dox);

    void b(boolean z);

    List<ece> c();

    List<abtl> d();

    List<abtl> e();

    List<abtl> f();

    List<abtl> g();

    int h();

    List<ecb> i();

    void j();

    float k();

    float l();

    abtl m();

    ajdp<Optional<abtl>> n();

    boolean o();

    ecc p();

    abtl q();
}
