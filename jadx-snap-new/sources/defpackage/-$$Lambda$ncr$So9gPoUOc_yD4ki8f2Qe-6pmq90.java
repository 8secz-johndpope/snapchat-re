package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.location.LocationSettingsResult;

/* compiled from: lambda */
/* renamed from: -$$Lambda$ncr$So9gPoUOc_yD4ki8f2Qe-6pmq90 */
public final /* synthetic */ class -$$Lambda$ncr$So9gPoUOc_yD4ki8f2Qe-6pmq90 implements ResultCallback {
    private final /* synthetic */ ncr f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ -$$Lambda$ncr$So9gPoUOc_yD4ki8f2Qe-6pmq90(ncr ncr, Context context) {
        this.f$0 = ncr;
        this.f$1 = context;
    }

    public final void onResult(Result result) {
        this.f$0.a(this.f$1, (LocationSettingsResult) result);
    }
}
