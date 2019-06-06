package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;

/* compiled from: lambda */
/* renamed from: -$$Lambda$ify$e4Lr1d31Dl8pndNjoL0uR8V-O_s */
public final /* synthetic */ class -$$Lambda$ify$e4Lr1d31Dl8pndNjoL0uR8V-O_s implements Supplier {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$ify$e4Lr1d31Dl8pndNjoL0uR8V-O_s(Context context) {
        this.f$0 = context;
    }

    public final Object get() {
        return this.f$0.getSharedPreferences("user_session_shared_pref", 0);
    }
}
