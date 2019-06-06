package defpackage;

import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: rck */
public final class rck {
    public final rdt a;
    public final ajei b;
    public final View c;

    public rck(rdt rdt, ajei ajei, View view) {
        akcr.b(rdt, MapboxEvent.KEY_MODEL);
        akcr.b(ajei, "disposeOnRecycle");
        akcr.b(view, "iconView");
        this.a = rdt;
        this.b = ajei;
        this.c = view;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsStoryClickEvent: model: ");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
