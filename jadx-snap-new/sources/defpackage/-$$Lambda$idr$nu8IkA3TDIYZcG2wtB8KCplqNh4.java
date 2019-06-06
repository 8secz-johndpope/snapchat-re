package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$idr$nu8IkA3TDIYZcG2wtB8KCplqNh4 */
public final /* synthetic */ class -$$Lambda$idr$nu8IkA3TDIYZcG2wtB8KCplqNh4 implements Callable {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$idr$nu8IkA3TDIYZcG2wtB8KCplqNh4(Context context) {
        this.f$0 = context;
    }

    public final Object call() {
        return abmr.a("Should not call context.filesDir on the main thread");
    }
}
