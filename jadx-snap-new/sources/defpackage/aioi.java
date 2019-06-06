package defpackage;

/* renamed from: aioi */
public final class aioi extends RuntimeException {
    public aioi(int i, Throwable th) {
        super(String.format("%s occurred %d times.", new Object[]{th.getClass().getSimpleName(), Integer.valueOf(i)}));
        setStackTrace(new StackTraceElement[0]);
    }
}
