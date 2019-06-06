package defpackage;

import android.os.Handler;
import com.google.common.base.Supplier;

/* renamed from: due */
public final class due implements aiqc<Supplier<Handler>> {
    public static Supplier<Handler> a() {
        Object obj = abmq.a;
        akcr.a(obj, "ThreadManager.MAIN_THREAD_HANDLER_SUPPLIER");
        return (Supplier) aiqf.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return due.a();
    }
}
