package defpackage;

import com.snap.camera.api.CameraFragment;
import com.snap.camera.fragment.CameraFragmentImpl;

/* renamed from: dvb */
public final class dvb implements dnu {
    final aipn<ftl> a;
    final achb<zjm, zjk> b;
    private final ajxe c = ajxh.a(new b(this));
    private final ajxe d = ajxh.a(new a(this));
    private final ajxe e = ajxh.a(new c(this));
    private final ajxe f = ajxh.a(new d(this));
    private zgb g;

    /* renamed from: dvb$b */
    static final class b extends akcs implements akbk<zfw> {
        private /* synthetic */ dvb a;

        b(dvb dvb) {
            this.a = dvb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(dnh.f, "StackedCameraConfigProviderImpl");
        }
    }

    /* renamed from: dvb$a */
    static final class a extends akcs implements akbk<ajdx<Boolean>> {
        private /* synthetic */ dvb a;

        a(dvb dvb) {
            this.a = dvb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ftl) this.a.a.get()).b((fth) dnd.ENABLE_UNIFIED_CAMERA_OPEN).a();
        }
    }

    /* renamed from: dvb$c */
    static final class c extends akcs implements akbk<ajdx<CameraFragment>> {
        private /* synthetic */ dvb a;

        /* renamed from: dvb$c$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "allowSwipe");
                CameraFragmentImpl cameraFragmentImpl = new CameraFragmentImpl();
                cameraFragmentImpl.a((dni) new dvc(bool.booleanValue()));
                return cameraFragmentImpl;
            }
        }

        c(dvb dvb) {
            this.a = dvb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdx) this.a.d.b()).b((ajdw) ((zfw) this.a.c.b()).f()).a((ajdw) ((zfw) this.a.c.b()).l()).f(1.a);
        }
    }

    /* renamed from: dvb$d */
    static final class d extends akcs implements akbk<ajdx<ajxm<? extends acgu<zjm>, ? extends acgu<zjm>>>> {
        final /* synthetic */ dvb a;

        /* renamed from: dvb$d$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Object j;
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "it");
                if (bool.booleanValue()) {
                    obj = dnh.a(this.a.a.b);
                    achb achb = this.a.a.b;
                    akcr.b(achb, "navigationHost");
                    j = dnh.a(achb).j();
                    akcr.a(j, "getCameraStackedPresentU…navigationHost).reverse()");
                } else {
                    obj = dnh.d;
                    j = dnh.e;
                }
                return ajxs.a(obj, j);
            }
        }

        d(dvb dvb) {
            this.a = dvb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((ajdx) this.a.d.b()).f(new 1(this));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(dvb.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(dvb.class), "isUnifiedCameraConfig", "isUnifiedCameraConfig()Lio/reactivex/Single;"), new akdc(akde.a(dvb.class), "stackedCameraConfiguration", "getStackedCameraConfiguration()Lio/reactivex/Single;"), new akdc(akde.a(dvb.class), "stackedCameraNavigationActions", "getStackedCameraNavigationActions()Lio/reactivex/Single;")};
    }

    public dvb(aipn<ftl> aipn, zgb zgb, achb<zjm, zjk> achb) {
        akcr.b(aipn, "configProvider");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(achb, "navigationHost");
        this.a = aipn;
        this.g = zgb;
        this.b = achb;
    }

    public final ajdx<CameraFragment> a() {
        return (ajdx) this.e.b();
    }

    public final ajdx<ajxm<acgu<zjm>, acgu<zjm>>> b() {
        return (ajdx) this.f.b();
    }
}
