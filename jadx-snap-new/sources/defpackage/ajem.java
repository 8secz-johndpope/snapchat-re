package defpackage;

/* renamed from: ajem */
final class ajem extends ajel<Runnable> {
    ajem(Runnable runnable) {
        super(runnable);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((Runnable) obj).run();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RunnableDisposable(disposed=");
        stringBuilder.append(isDisposed());
        stringBuilder.append(ppy.d);
        stringBuilder.append(get());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
