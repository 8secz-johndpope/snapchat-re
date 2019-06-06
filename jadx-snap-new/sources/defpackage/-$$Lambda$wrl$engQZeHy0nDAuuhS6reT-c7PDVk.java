package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$wrl$engQZeHy0nDAuuhS6reT-c7PDVk */
public final /* synthetic */ class -$$Lambda$wrl$engQZeHy0nDAuuhS6reT-c7PDVk implements Callable {
    private final /* synthetic */ wrl f$0;
    private final /* synthetic */ WeakReference f$1;

    public /* synthetic */ -$$Lambda$wrl$engQZeHy0nDAuuhS6reT-c7PDVk(wrl wrl, WeakReference weakReference) {
        this.f$0 = wrl;
        this.f$1 = weakReference;
    }

    public final Object call() {
        return this.f$0.a(this.f$1);
    }
}
