package defpackage;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: akpb */
public final class akpb extends RejectedExecutionException {
    public akpb() {
        super("Inline execution is prohibited for this request");
    }
}
