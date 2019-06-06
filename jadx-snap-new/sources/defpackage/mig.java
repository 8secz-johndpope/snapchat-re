package defpackage;

import android.os.Looper;

/* renamed from: mig */
public final class mig {
    static final akbk<String> a = b.a;
    public static final akbk<String> b = a.a;

    /* renamed from: mig$b */
    static final class b extends akcs implements akbk<String> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            StringBuilder stringBuilder = new StringBuilder("Expected to be called on the main thread but was ");
            Object currentThread = Thread.currentThread();
            akcr.a(currentThread, "Thread.currentThread()");
            stringBuilder.append(currentThread.getName());
            return stringBuilder.toString();
        }
    }

    /* renamed from: mig$a */
    static final class a extends akcs implements akbk<String> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return "Expected to be called not on the main thread";
        }
    }

    public static final <T> boolean a(ajdv<T> ajdv) {
        akcr.b(ajdv, "receiver$0");
        if ((akcr.a(Looper.myLooper(), Looper.getMainLooper()) ^ 1) == 0) {
            return true;
        }
        ajdv.a(ajek.a(ajfu.b));
        ajdv.a((Throwable) new IllegalStateException((String) a.invoke()));
        return false;
    }
}
