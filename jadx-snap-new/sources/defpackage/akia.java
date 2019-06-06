package defpackage;

/* renamed from: akia */
public abstract class akia implements Runnable {
    private String a;

    public akia(String str, Object... objArr) {
        this.a = akib.a(str, objArr);
    }

    public abstract void b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
