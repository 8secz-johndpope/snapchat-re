package defpackage;

import defpackage.aiuq.e;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiwa */
final class aiwa extends e {
    private static final Logger a = Logger.getLogger(aiwa.class.getName());
    private static final ThreadLocal<aiuq> b = new ThreadLocal();

    aiwa() {
    }

    public final aiuq a() {
        return (aiuq) b.get();
    }

    public final aiuq a(aiuq aiuq) {
        aiuq a = a();
        b.set(aiuq);
        return a;
    }

    public final void a(aiuq aiuq, aiuq aiuq2) {
        if (a() != aiuq) {
            a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        a(aiuq2);
    }
}
