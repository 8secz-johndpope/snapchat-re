package defpackage;

import android.hardware.Camera.Parameters;

/* renamed from: dwt */
final class dwt implements dwv {
    dwt() {
    }

    public final void a(Parameters parameters) {
        parameters.set("zsl", "on");
    }

    public final void b(Parameters parameters) {
        parameters.set("rear-lens-distortion-correction", "off");
    }
}
