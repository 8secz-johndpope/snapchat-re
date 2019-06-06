package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$idr$4LZQKQzG2rZFHmA7f4orjw_hqYE */
public final /* synthetic */ class -$$Lambda$idr$4LZQKQzG2rZFHmA7f4orjw_hqYE implements Callable {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$idr$4LZQKQzG2rZFHmA7f4orjw_hqYE(Context context) {
        this.f$0 = context;
    }

    public final Object call() {
        return abmr.a("Should not call context.getExternalFilesDir on the main thread");
    }
}
