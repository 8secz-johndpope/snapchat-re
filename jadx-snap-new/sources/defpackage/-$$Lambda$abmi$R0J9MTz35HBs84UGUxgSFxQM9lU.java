package defpackage;

import android.content.Context;
import android.media.AudioManager;
import com.google.common.base.Supplier;

/* compiled from: lambda */
/* renamed from: -$$Lambda$abmi$R0J9MTz35HBs84UGUxgSFxQM9lU */
public final /* synthetic */ class -$$Lambda$abmi$R0J9MTz35HBs84UGUxgSFxQM9lU implements Supplier {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$abmi$R0J9MTz35HBs84UGUxgSFxQM9lU(Context context) {
        this.f$0 = context;
    }

    public final Object get() {
        return ((AudioManager) this.f$0.getSystemService("audio"));
    }
}
