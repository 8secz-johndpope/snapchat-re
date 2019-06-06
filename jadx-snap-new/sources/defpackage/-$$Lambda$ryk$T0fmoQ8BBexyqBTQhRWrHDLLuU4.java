package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import defpackage.ryk.b;
import defpackage.ryk.c;

/* compiled from: lambda */
/* renamed from: -$$Lambda$ryk$T0fmoQ8BBexyqBTQhRWrHDLLuU4 */
public final /* synthetic */ class -$$Lambda$ryk$T0fmoQ8BBexyqBTQhRWrHDLLuU4 implements ajwy {
    private final /* synthetic */ Context f$0;
    private final /* synthetic */ zgb f$1;

    public /* synthetic */ -$$Lambda$ryk$T0fmoQ8BBexyqBTQhRWrHDLLuU4(Context context, zgb zgb) {
        this.f$0 = context;
        this.f$1 = zgb;
    }

    public final Object get() {
        return new c(this.f$0, b.a, (ConnectivityManager) this.f$0.getSystemService(MapboxNavigationEvent.KEY_CONNECTIVITY), zgb.a(ryl.a, "NetworkStatusManager").f());
    }
}
