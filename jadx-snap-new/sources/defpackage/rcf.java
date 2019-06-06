package defpackage;

import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: rcf */
public final class rcf {
    public final rdt a;
    public final View b;

    public rcf(rdt rdt, View view) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        akcr.b(view, "iconView");
        this.a = rdt;
        this.b = view;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsDoubleClickEvent: model: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
