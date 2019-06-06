package defpackage;

import com.google.common.base.Supplier;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: lambda */
/* renamed from: -$$Lambda$zgd$lcvhQ-uliqGZC3I8BKpYfNpHqrQ */
public final /* synthetic */ class -$$Lambda$zgd$lcvhQ-uliqGZC3I8BKpYfNpHqrQ implements Supplier {
    public static final /* synthetic */ -$$Lambda$zgd$lcvhQ-uliqGZC3I8BKpYfNpHqrQ INSTANCE = new -$$Lambda$zgd$lcvhQ-uliqGZC3I8BKpYfNpHqrQ();

    private /* synthetic */ -$$Lambda$zgd$lcvhQ-uliqGZC3I8BKpYfNpHqrQ() {
    }

    public final Object get() {
        return new ScheduledThreadPoolExecutor(2, zgd.a("query", -2));
    }
}
