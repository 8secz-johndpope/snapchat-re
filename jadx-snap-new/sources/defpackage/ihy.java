package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.concurrent.Callable;

/* renamed from: ihy */
public final class ihy extends zgi implements iid {
    final ajwl<Boolean> a;
    final zfw b = zgb.a(b.a.callsite("MushroomSoftNavBarStatusDetector"));
    private final ajdp<iic> c;

    /* renamed from: ihy$b */
    static final class b extends ide {
        public static final b a = new b();

        private b() {
            super("MushroomSoftNavBarStatusDetector", idi.APP_PLATFORM);
        }
    }

    /* renamed from: ihy$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ihy$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ihy a;
        private /* synthetic */ iie b;

        d(ihy ihy, iie iie) {
            this.a = ihy;
            this.b = iie;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "isForegrounded");
            return bool.booleanValue() ? ajdx.c((Callable) new ihz(new akbk<iic>(this.b) {
                public final String getName() {
                    return "get";
                }

                public final akej getOwner() {
                    return akde.a(iie.class);
                }

                public final String getSignature() {
                    return "get()Lcom/snap/framework/util/SoftNavBarStatus;";
                }

                public final /* synthetic */ Object invoke() {
                    return iie.a();
                }
            })).b((ajdw) this.a.b.b()) : ajvo.a(ajsn.a);
        }
    }

    /* renamed from: ihy$c */
    static final class c implements ajev {
        private /* synthetic */ ihy a;

        c(ihy ihy) {
            this.a = ihy;
        }

        public final void run() {
            this.a.a.a(Boolean.FALSE);
        }
    }

    static {
        a aVar = new a();
    }

    public ihy(zgb zgb, zgk<b> zgk, iie iie) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "taskScoper");
        akcr.b(iie, "softNavBarStatusGetter");
        super(zgk);
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<Boolean>()");
        this.a = ajwl;
        ajwl = this.a.x(new d(this, iie)).i().g(ajfu.d);
        akcr.a(ajwl, "isForegroundedSubject\n  …           .autoConnect()");
        this.c = ajwl;
    }

    public final ajej a() {
        this.a.a(Boolean.TRUE);
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction {…edSubject.onNext(false) }");
        return a;
    }

    public final ajdp<iic> c() {
        return this.c;
    }
}
