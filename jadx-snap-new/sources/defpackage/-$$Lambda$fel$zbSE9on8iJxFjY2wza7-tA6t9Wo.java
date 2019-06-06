package defpackage;

import com.snap.cognac.internal.webinterface.CognacFPSAnalyticsListener;

/* compiled from: lambda */
/* renamed from: -$$Lambda$fel$zbSE9on8iJxFjY2wza7-tA6t9Wo */
public final /* synthetic */ class -$$Lambda$fel$zbSE9on8iJxFjY2wza7-tA6t9Wo implements CognacFPSAnalyticsListener {
    private final /* synthetic */ fel f$0;
    private final /* synthetic */ long f$1;

    public /* synthetic */ -$$Lambda$fel$zbSE9on8iJxFjY2wza7-tA6t9Wo(fel fel, long j) {
        this.f$0 = fel;
        this.f$1 = j;
    }

    public final void onGetFPS(double d, double d2) {
        this.f$0.a(this.f$1, d, d2);
    }
}
