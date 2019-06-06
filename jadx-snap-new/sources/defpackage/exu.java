package defpackage;

import com.snapchat.client.ClientLoader;
import com.snapchat.client.ClientLoader.Result;
import com.snapchat.client.shims.LogLevel;
import com.snapchat.client.shims.Platform;
import com.snapchat.client.shims.PlatformParameters;

/* renamed from: exu */
public final class exu implements exs {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final ajxe d;
    private boolean e;

    /* renamed from: exu$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;
        private /* synthetic */ ext b;

        d(zgb zgb, ext ext) {
            this.a = zgb;
            this.b = ext;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.b, "NativeClientLoader");
        }
    }

    /* renamed from: exu$c */
    static final class c extends akcq implements akbk<exv> {
        c(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (exv) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: exu$a */
    static final class a extends akcq implements akbk<ilv> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ilv) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: exu$e */
    static final class e extends akcq implements akbk<ihm> {
        e(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ihm) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: exu$b */
    static final class b implements ajev {
        private /* synthetic */ exu a;

        b(exu exu) {
            this.a = exu;
        }

        public final void run() {
            this.a.b().a();
            Result checkIfLoadedOrTryToLoad = ClientLoader.checkIfLoadedOrTryToLoad();
            if (checkIfLoadedOrTryToLoad.success) {
                this.a.c();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("Failed to load client: ");
            stringBuilder.append(checkIfLoadedOrTryToLoad.errorType);
            stringBuilder.append(' ');
            stringBuilder.append(checkIfLoadedOrTryToLoad.errorName);
            stringBuilder.append(' ');
            stringBuilder.append(checkIfLoadedOrTryToLoad.errorReason);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(exu.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(exu.class), "logger", "getLogger()Lcom/snap/client/lib/NativeClientLogger;"), new akdc(akde.a(exu.class), "graphene", "getGraphene()Lcom/snap/graphene/Graphene;"), new akdc(akde.a(exu.class), "stopwatch", "getStopwatch()Lcom/snap/framework/time/Stopwatch;")};
    }

    public exu(zgb zgb, ext ext, ajwy<exv> ajwy, ajwy<ilv> ajwy2, ajwy<ihm> ajwy3) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ext, "clientFeature");
        akcr.b(ajwy, "loggerProvider");
        akcr.b(ajwy2, "grapheneProvider");
        akcr.b(ajwy3, "stopwatchProvider");
        this.a = ajxh.a(new d(zgb, ext));
        this.b = ajxh.a(new c(ajwy));
        this.c = ajxh.a(new a(ajwy2));
        this.d = ajxh.a(new e(ajwy3));
    }

    public final ajcx a() {
        Object b = (this.e ? ajvo.a(ajhn.a) : ajcx.a((ajev) new b(this))).b((ajdw) ((zfw) this.a.b()).b());
        akcr.a(b, "if (loaded) {\n        Co…schedulers.computation())");
        return b;
    }

    /* Access modifiers changed, original: final */
    public final ihm b() {
        return (ihm) this.d.b();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void c() {
        if (!this.e) {
            this.e = true;
            Platform.init(new PlatformParameters(false, LogLevel.NONE), (exv) this.b.b());
            b().b();
            ((ilv) this.c.b()).a((ily) ion.NATIVE_CLIENT_LOAD, b().c());
        }
    }
}
