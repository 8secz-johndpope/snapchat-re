package defpackage;

import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: rcd */
public final class rcd {
    public final rdt a;
    public final View b;

    public rcd(rdt rdt, View view) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        akcr.b(view, "iconView");
        this.a = rdt;
        this.b = view;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsClickEvent: model: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
