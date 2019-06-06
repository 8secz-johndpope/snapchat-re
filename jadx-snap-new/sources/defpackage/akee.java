package defpackage;

import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;

/* renamed from: akee */
public class akee extends aked {
    public static final void a(boolean z, Number number) {
        akcr.b(number, MapboxNavigationEvent.KEY_STEP);
        if (!z) {
            StringBuilder stringBuilder = new StringBuilder("Step must be positive, was: ");
            stringBuilder.append(number);
            stringBuilder.append('.');
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
