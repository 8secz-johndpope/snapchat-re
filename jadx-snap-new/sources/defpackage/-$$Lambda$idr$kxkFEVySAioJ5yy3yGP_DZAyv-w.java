package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$idr$kxkFEVySAioJ5yy3yGP_DZAyv-w */
public final /* synthetic */ class -$$Lambda$idr$kxkFEVySAioJ5yy3yGP_DZAyv-w implements Callable {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$idr$kxkFEVySAioJ5yy3yGP_DZAyv-w(Context context) {
        this.f$0 = context;
    }

    public final Object call() {
        return abmr.a("Should not call context.cacheDir on the main thread");
    }
}
