package defpackage;

/* renamed from: ajeh */
// io.reactivex.internal.functions.RunnableDisposable
final class ajeh extends ajel<ajev> {
    ajeh(ajev ajev) {
        super(ajev);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        try {
            ((ajev) obj).run();
        } catch (Throwable th) {
            RuntimeException a = ajur.a(th);
        }
    }
}
