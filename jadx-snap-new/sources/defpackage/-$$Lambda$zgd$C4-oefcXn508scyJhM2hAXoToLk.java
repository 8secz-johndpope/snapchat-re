package defpackage;

import com.google.common.base.Supplier;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zgd$C4-oefcXn508scyJhM2hAXoToLk */
public final /* synthetic */ class -$$Lambda$zgd$C4-oefcXn508scyJhM2hAXoToLk implements Supplier {
    public static final /* synthetic */ -$$Lambda$zgd$C4-oefcXn508scyJhM2hAXoToLk INSTANCE = new -$$Lambda$zgd$C4-oefcXn508scyJhM2hAXoToLk();

    private /* synthetic */ -$$Lambda$zgd$C4-oefcXn508scyJhM2hAXoToLk() {
    }

    public final Object get() {
        return new ScheduledThreadPoolExecutor(1, zgd.a("scheduled", -3));
    }
}
