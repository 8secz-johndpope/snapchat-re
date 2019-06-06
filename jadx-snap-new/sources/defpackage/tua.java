package defpackage;

import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: tua */
public final class tua extends zly<tqj, tug> {

    /* renamed from: tua$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public final /* synthetic */ void a(zlx zlx, View view) {
        akcr.b((tqj) zlx, "bindingContext");
        akcr.b(view, "itemView");
    }

    public final /* synthetic */ void onBind(zmy zmy, zmy zmy2) {
        akcr.b((tug) zmy, MapboxEvent.KEY_MODEL);
    }
}
