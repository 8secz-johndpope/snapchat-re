package defpackage;

/* renamed from: gey */
public final class gey {
    private final int a;
    private final Throwable b;
    private final san c;

    public gey(int i, Throwable th) {
        this(i, th, null);
    }

    public gey(int i, Throwable th, san san) {
        this.a = i;
        this.b = th;
        this.c = san;
    }

    public final int a() {
        return this.a;
    }

    public final san b() {
        return this.c;
    }

    public final Throwable c() {
        return this.b;
    }

    public final String toString() {
        return String.format("[%d]: %s", new Object[]{Integer.valueOf(this.a), this.b.getMessage()});
    }
}
