package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;

/* compiled from: lambda */
/* renamed from: -$$Lambda$ify$JqKlS8HJV-voKP-8WbDFvoYG2kI */
public final /* synthetic */ class -$$Lambda$ify$JqKlS8HJV-voKP-8WbDFvoYG2kI implements Supplier {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$ify$JqKlS8HJV-voKP-8WbDFvoYG2kI(Context context) {
        this.f$0 = context;
    }

    public final Object get() {
        return this.f$0.getSharedPreferences("UserLocationPermission", 0);
    }
}
