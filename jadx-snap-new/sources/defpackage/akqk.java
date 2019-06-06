package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: akqk */
public final class akqk {
    private static final ExecutorService i = Executors.newCachedThreadPool();
    boolean a = true;
    public boolean b = true;
    boolean c = true;
    public boolean d = true;
    public boolean e = true;
    boolean f = true;
    public boolean g = false;
    public ExecutorService h = i;

    public final akqj a() {
        akqj b;
        synchronized (akqj.class) {
            if (akqj.a == null) {
                b = b();
                akqj.a = b;
            } else {
                throw new akql("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
        }
        return b;
    }

    public final akqj b() {
        return new akqj(this);
    }
}
