package defpackage;

import android.os.Build.VERSION;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: gvr */
public final class gvr {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static volatile gqa b;
    static final ajxe c = ajxh.a(d.a);

    /* renamed from: gvr$b */
    static final class b extends akcs implements akbk<Boolean> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z = VERSION.SDK_INT >= 24 && VERSION.SDK_INT <= 27;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: gvr$c */
    static final class c extends akcs implements akbk<Boolean> {
        public static final c a = new c();

        c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(VERSION.SDK_INT >= 28);
        }
    }

    /* renamed from: gvr$d */
    static final class d extends akcs implements akbk<1> {
        public static final d a = new d();

        d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ide("StrictModeManager", idi.APP_PLATFORM) {
            };
        }
    }

    /* renamed from: gvr$e */
    static final class e extends akcs implements akbk<zfw> {
        public static final e a = new e();

        e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new zfw(((ide) gvr.c.b()).callsite("StrictModeManager"));
        }
    }

    /* renamed from: gvr$a */
    public static final class a {
        static {
            aken[] akenArr = new aken[]{new akdc(akde.a(a.class), "REFLECTION_HACK_SUPPORTED", "getREFLECTION_HACK_SUPPORTED()Z"), new akdc(akde.a(a.class), "VIOLATION_LISTENER_SUPPORTED", "getVIOLATION_LISTENER_SUPPORTED()Z"), new akdc(akde.a(a.class), "feature", "getFeature()Lcom/snap/framework/attribution/AttributedFeature;"), new akdc(akde.a(a.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static Object a(akbk<? extends Object> akbk) {
            akcr.b(akbk, "func");
            return akbk.invoke();
        }
    }

    static {
        a aVar = new a();
        ajxh.a(b.a);
        ajxh.a(c.a);
        ajxh.a(e.a);
    }
}
