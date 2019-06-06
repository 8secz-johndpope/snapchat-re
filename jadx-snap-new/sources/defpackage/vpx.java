package defpackage;

import com.brightcove.player.event.Event;
import com.snap.scan.ScanCardFragment;
import com.snap.ui.deck.MainPageFragment;
import defpackage.vpb.d;
import defpackage.vso.b;
import defpackage.vso.g;
import defpackage.vso.h;
import defpackage.vso.l.a;

/* renamed from: vpx */
public final class vpx implements vpc {
    final ajwo<vpb> a;
    final vpa b;
    final vpv c;
    final akbl<String, ajxw> d;

    /* renamed from: vpx$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        final /* synthetic */ vpx a;
        final /* synthetic */ vpb b;

        /* renamed from: vpx$a$1 */
        static final class 1<T> implements ajfb<vso> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                if (((vso) obj) instanceof h) {
                    vpx vpx = this.a.a;
                    vpb vpb = this.a.b;
                    vpx.a.a(new d(vpb.a(), vpb.b(), vpb.c()));
                }
            }
        }

        a(vpx vpx, vpb vpb) {
            this.a = vpx;
            this.b = vpb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            MainPageFragment mainPageFragment = (MainPageFragment) obj;
            akcr.b(mainPageFragment, Event.FRAGMENT);
            if (mainPageFragment instanceof ScanCardFragment) {
                return ((ScanCardFragment) mainPageFragment).b().d((ajfb) new 1(this));
            }
            StringBuilder stringBuilder = new StringBuilder("Unsupported fragment ");
            stringBuilder.append(mainPageFragment.getClass().getCanonicalName());
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: vpx$b */
    static final class b<T> implements ajfl<vso> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            vso vso = (vso) obj;
            akcr.b(vso, "it");
            return !(vso instanceof g);
        }
    }

    /* renamed from: vpx$c */
    static final class c<T1, T2, R> implements ajex<vso, vso, vso> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            vso vso = (vso) obj;
            obj2 = (vso) obj2;
            akcr.b(vso, "previous");
            akcr.b(obj2, "current");
            return ((vso instanceof h) && (akcr.a(obj2, b.a) || akcr.a(obj2, defpackage.vso.c.a))) ? vso : obj2;
        }
    }

    /* renamed from: vpx$d */
    static final class d<T> implements ajfl<vso> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            vso vso = (vso) obj;
            akcr.b(vso, "it");
            return !(vso instanceof h);
        }
    }

    /* renamed from: vpx$e */
    static final class e<T> implements ajfb<vso> {
        private /* synthetic */ vpx a;

        e(vpx vpx) {
            this.a = vpx;
        }

        public final /* synthetic */ void accept(Object obj) {
            vso vso = (vso) obj;
            if (vso instanceof a) {
                this.a.d.invoke(((a) vso).c);
            }
        }
    }

    /* renamed from: vpx$f */
    static final class f<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ vpx a;

        f(vpx vpx) {
            this.a = vpx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vpb vpb = (vpb) obj;
            akcr.b(vpb, "it");
            vpx vpx = this.a;
            ajdp d = vpx.b.a(vpb).u(new a(vpx, vpb)).a((ajfl) b.a).b((ajex) c.a).a((ajfl) d.a).d((ajfb) new e(vpx));
            vpv vpv = vpx.c;
            akcr.b(vpb, "payload");
            obj = d.a((ajdu) new vpq(vpv.a, vpb.a(), vpb.c(), vpb.d(), vpb.e()));
            akcr.a(obj, "scanCardController\n     …ctory.createFor(payload))");
            return obj;
        }
    }

    public vpx(vpa vpa, vpv vpv, akbl<? super String, ajxw> akbl) {
        akcr.b(vpa, "scanCardController");
        akcr.b(vpv, "analyticsFactory");
        akcr.b(akbl, "shareViaIntent");
        this.b = vpa;
        this.c = vpv;
        this.d = akbl;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<ScanCardPayload>()");
        this.a = ajwo;
    }

    public final ajdp<vso> a(vpb vpb) {
        akcr.b(vpb, "payload");
        Object a = this.a.h((Object) vpb).a((ajfc) new f(this));
        akcr.a(a, "requests.startWith(paylo…p { observeScanCard(it) }");
        return a;
    }
}
