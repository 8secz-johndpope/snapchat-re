package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;

/* compiled from: lambda */
/* renamed from: -$$Lambda$abtm$bO7Dkw47gzd0beMwwrsgLqaQevw */
public final /* synthetic */ class -$$Lambda$abtm$bO7Dkw47gzd0beMwwrsgLqaQevw implements Supplier {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ -$$Lambda$abtm$bO7Dkw47gzd0beMwwrsgLqaQevw(Context context) {
        this.f$0 = context;
    }

    public final Object get() {
        return this.f$0.getResources().getDisplayMetrics();
    }
}
