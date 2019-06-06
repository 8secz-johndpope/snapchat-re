package defpackage;

import android.graphics.Rect;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import defpackage.acmj.a;

/* renamed from: acyt */
public final class acyt {
    static final acmg a(CameraPosition cameraPosition) {
        return new acmg(cameraPosition.target, cameraPosition.bearing, cameraPosition.tilt, cameraPosition.zoom);
    }

    static final aczp a(a aVar) {
        return aVar != null ? new aczp(aVar) : null;
    }

    static final CameraUpdate a(cgj cgj, Rect rect) {
        int i = 0;
        int i2 = rect != null ? rect.left : 0;
        int i3 = rect != null ? rect.top : 0;
        int i4 = rect != null ? rect.right : 0;
        if (rect != null) {
            i = rect.bottom;
        }
        return CameraUpdateFactory.newLatLngBounds(cgj, i2, i3, i4, i);
    }
}
