package defpackage;

import java.util.concurrent.Executor;

/* compiled from: lambda */
/* renamed from: -$$Lambda$gmh$EETwt63th5wK_isXgShRdQQlyN4 */
public final /* synthetic */ class -$$Lambda$gmh$EETwt63th5wK_isXgShRdQQlyN4 implements Executor {
    private final /* synthetic */ Executor f$0;
    private final /* synthetic */ akht f$1;

    public /* synthetic */ -$$Lambda$gmh$EETwt63th5wK_isXgShRdQQlyN4(Executor executor, akht akht) {
        this.f$0 = executor;
        this.f$1 = akht;
    }

    public final void execute(Runnable runnable) {
        this.f$0.execute(zfj.a(iew.a.callsite("retrofit").a(this.f$1.a.toString()), runnable));
    }
}
