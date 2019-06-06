package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: ajwh */
public final class ajwh {
    public static final ajdw a;
    public static final ajdw b;
    public static final ajdw c;
    public static final ajdw d = ajtq.a;

    /* renamed from: ajwh$h */
    static final class h implements Callable<ajdw> {
        h() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return g.a;
        }
    }

    /* renamed from: ajwh$b */
    static final class b implements Callable<ajdw> {
        b() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return a.a;
        }
    }

    /* renamed from: ajwh$c */
    static final class c implements Callable<ajdw> {
        c() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return d.a;
        }
    }

    /* renamed from: ajwh$f */
    static final class f implements Callable<ajdw> {
        f() {
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return e.a;
        }
    }

    /* renamed from: ajwh$e */
    static final class e {
        static final ajdw a = new ajti();
    }

    /* renamed from: ajwh$a */
    static final class a {
        static final ajdw a = new ajtd();
    }

    /* renamed from: ajwh$d */
    static final class d {
        static final ajdw a = new ajth();
    }

    /* renamed from: ajwh$g */
    static final class g {
        static final ajdw a = new ajtp();
    }

    static {
        Callable hVar = new h();
        String str = "Scheduler Callable can't be null";
        ajfv.a((Object) hVar, str);
        ajfc ajfc = ajvo.c;
        a = ajfc == null ? ajvo.a(hVar) : ajvo.a(ajfc, hVar);
        hVar = new b();
        ajfv.a((Object) hVar, str);
        ajfc = ajvo.b;
        b = ajfc == null ? ajvo.a(hVar) : ajvo.a(ajfc, hVar);
        hVar = new c();
        ajfv.a((Object) hVar, str);
        ajfc = ajvo.d;
        c = ajfc == null ? ajvo.a(hVar) : ajvo.a(ajfc, hVar);
        hVar = new f();
        ajfv.a((Object) hVar, str);
        ajvo.a(hVar);
    }

    public static ajdw a(Executor executor) {
        return new ajtf(executor);
    }
}
