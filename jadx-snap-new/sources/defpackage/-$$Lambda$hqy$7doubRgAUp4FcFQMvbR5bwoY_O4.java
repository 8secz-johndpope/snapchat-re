package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: lambda */
/* renamed from: -$$Lambda$hqy$7doubRgAUp4FcFQMvbR5bwoY_O4 */
public final /* synthetic */ class -$$Lambda$hqy$7doubRgAUp4FcFQMvbR5bwoY_O4 implements Runnable {
    private final /* synthetic */ RecyclerView f$0;
    private final /* synthetic */ int f$1;

    public /* synthetic */ -$$Lambda$hqy$7doubRgAUp4FcFQMvbR5bwoY_O4(RecyclerView recyclerView, int i) {
        this.f$0 = recyclerView;
        this.f$1 = i;
    }

    public final void run() {
        this.f$0.scrollToPosition(this.f$1);
    }
}
