package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Supplier;
import defpackage.ejr.a.a;

/* renamed from: ejp */
public final class ejp implements dno {
    final ajei a = new ajei();
    final Supplier<Optional<dnk>> b;
    final a c;
    private final ajxe d = ajxh.a(new b(this));
    private final ajdp<dva> e;

    /* renamed from: ejp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ejp$b */
    static final class b extends akcs implements akbk<ejq.a> {
        private /* synthetic */ ejp a;

        b(ejp ejp) {
            this.a = ejp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.a().a();
        }
    }

    /* renamed from: ejp$c */
    static final class c<T> implements ajfb<dva> {
        private /* synthetic */ ejp a;

        c(ejp ejp) {
            this.a = ejp;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((dva) obj).a == duz.FULLY_VISIBLE) {
                obj = (Optional) this.a.b.get();
                akcr.a(obj, "cameraPayload");
                if (obj.isPresent()) {
                    dnk dnk = (dnk) obj.get();
                    if (dnk instanceof dnk.a) {
                        ((ejq.a) this.a.d.b()).a((dnk.a) dnk);
                        this.a.a.a(((ejq.a) this.a.d.b()).start());
                    }
                }
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ejp.class), "presenter", "getPresenter()Lcom/snap/camera/subcomponents/creativekit/CreativeKitCameraContract$Presenter;");
        a aVar = new a();
    }

    public ejp(ajdp<dva> ajdp, Supplier<Optional<dnk>> supplier, a aVar) {
        akcr.b(ajdp, "pageVisibilityObservable");
        akcr.b(supplier, "cameraPageNavigationPayloadSupplier");
        akcr.b(aVar, "ckCameraComponentBuilder");
        this.e = ajdp;
        this.b = supplier;
        this.c = aVar;
    }

    public final ajej start() {
        this.a.a(this.e.f((ajfb) new c(this)));
        return this.a;
    }
}
