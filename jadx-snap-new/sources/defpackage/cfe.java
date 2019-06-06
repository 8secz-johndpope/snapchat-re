package defpackage;

import java.util.concurrent.Callable;

/* renamed from: cfe */
public final class cfe {
    public static final Callable<Boolean> a;
    public static final ajfl<Object> b = c;
    private static final a c;

    /* renamed from: cfe$a */
    static final class a implements ajfl<Object>, Callable<Boolean> {
        private final Boolean a;

        a(Boolean bool) {
            this.a = bool;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }

        public final boolean test(Object obj) {
            return this.a.booleanValue();
        }
    }

    static {
        a aVar = new a(Boolean.TRUE);
        c = aVar;
        a = aVar;
    }
}
