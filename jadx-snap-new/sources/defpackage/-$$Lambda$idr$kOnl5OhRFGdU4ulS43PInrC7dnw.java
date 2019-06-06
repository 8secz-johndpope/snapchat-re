package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$idr$kOnl5OhRFGdU4ulS43PInrC7dnw */
public final /* synthetic */ class -$$Lambda$idr$kOnl5OhRFGdU4ulS43PInrC7dnw implements Callable {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$idr$kOnl5OhRFGdU4ulS43PInrC7dnw(Context context) {
        this.f$0 = context;
    }

    public final Object call() {
        return abmr.a("Should not call context.applicationInfo.dataDir on the main thread");
    }
}
