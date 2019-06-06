package defpackage;

import com.google.common.base.Supplier;
import com.snap.ui.view.ViewFinder;

/* compiled from: lambda */
/* renamed from: -$$Lambda$ekt$OY5uBBRd4KXZ9UIZzClpkZDbgK8 */
public final /* synthetic */ class -$$Lambda$ekt$OY5uBBRd4KXZ9UIZzClpkZDbgK8 implements Supplier {
    private final /* synthetic */ ViewFinder f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ -$$Lambda$ekt$OY5uBBRd4KXZ9UIZzClpkZDbgK8(ViewFinder viewFinder, int i) {
        this.f$0 = viewFinder;
        this.f$1 = i;
    }

    public final Object get() {
        return this.f$0.findViewById(this.f$1);
    }
}
