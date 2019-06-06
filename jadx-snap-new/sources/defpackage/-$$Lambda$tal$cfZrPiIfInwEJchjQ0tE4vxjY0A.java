package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: lambda */
/* renamed from: -$$Lambda$tal$cfZrPiIfInwEJchjQ0tE4vxjY0A */
public final /* synthetic */ class -$$Lambda$tal$cfZrPiIfInwEJchjQ0tE4vxjY0A implements Executor {
    public static final /* synthetic */ -$$Lambda$tal$cfZrPiIfInwEJchjQ0tE4vxjY0A INSTANCE = new -$$Lambda$tal$cfZrPiIfInwEJchjQ0tE4vxjY0A();

    private /* synthetic */ -$$Lambda$tal$cfZrPiIfInwEJchjQ0tE4vxjY0A() {
    }

    public final void execute(Runnable runnable) {
        ((Handler) tal.f.get()).post(runnable);
    }
}
