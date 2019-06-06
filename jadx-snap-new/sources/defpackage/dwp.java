package defpackage;

import android.hardware.Camera.Parameters;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: dwp */
public final class dwp implements dwk {
    private final dpf a;

    public dwp(dpf dpf) {
        this.a = dpf;
    }

    public final String a(Parameters parameters, boolean z) {
        float q = this.a.q(z);
        if (q >= MapboxConstants.MINIMUM_ZOOM && q <= 1.0f) {
            try {
                int parseInt = Integer.parseInt(parameters.get("min-sharpness"));
                return String.valueOf(parseInt + ((int) (((float) (Integer.parseInt(parameters.get("max-sharpness")) - parseInt)) * q)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final void a(dwj dwj, Parameters parameters) {
    }
}
