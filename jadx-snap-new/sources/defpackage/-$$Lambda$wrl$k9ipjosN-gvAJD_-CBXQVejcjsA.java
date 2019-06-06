package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* compiled from: lambda */
/* renamed from: -$$Lambda$wrl$k9ipjosN-gvAJD_-CBXQVejcjsA */
public final /* synthetic */ class -$$Lambda$wrl$k9ipjosN-gvAJD_-CBXQVejcjsA implements Callable {
    private final /* synthetic */ wrl f$0;
    private final /* synthetic */ WeakReference f$1;

    public /* synthetic */ -$$Lambda$wrl$k9ipjosN-gvAJD_-CBXQVejcjsA(wrl wrl, WeakReference weakReference) {
        this.f$0 = wrl;
        this.f$1 = weakReference;
    }

    public final Object call() {
        return this.f$0.b(this.f$1);
    }
}
