package defpackage;

import com.google.common.util.concurrent.ForwardingListenableFuture;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: abmm */
public final class abmm<T> extends ForwardingListenableFuture<T> implements abmn<T> {
    private final ListenableFuture<T> a;

    private abmm(ListenableFuture<T> listenableFuture) {
        this.a = listenableFuture;
    }

    public static <T> abmm<T> a(ListenableFuture<T> listenableFuture) {
        return new abmm(listenableFuture);
    }

    public final void a() {
        super.cancel(true);
    }

    public final ListenableFuture<? extends T> delegate() {
        return this.a;
    }
}
