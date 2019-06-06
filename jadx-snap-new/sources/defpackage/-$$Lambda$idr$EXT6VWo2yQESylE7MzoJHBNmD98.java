package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$idr$EXT6VWo2yQESylE7MzoJHBNmD98 */
public final /* synthetic */ class -$$Lambda$idr$EXT6VWo2yQESylE7MzoJHBNmD98 implements Callable {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$idr$EXT6VWo2yQESylE7MzoJHBNmD98(Context context) {
        this.f$0 = context;
    }

    public final Object call() {
        return abmr.a("Should not call context.externalCacheDir on the main thread");
    }
}
