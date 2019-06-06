package defpackage;

import com.brightcove.player.event.Event;
import com.snap.scan.ScanCardFragment;
import com.snap.scan.ScanCardFragmentImpl;
import com.snap.ui.deck.MainPageFragment;
import defpackage.vso.b;
import defpackage.vso.c;

/* renamed from: voy */
public final class voy implements vpa {
    final zfr a = zgb.a(vpg.e.callsite("DefaultScanCardController")).l();
    final achb<zjm, zjk> b;

    /* renamed from: voy$a */
    static final class a<T> implements ajdr<T> {
        final /* synthetic */ voy a;
        private /* synthetic */ vpb b;

        a(voy voy, vpb vpb) {
            this.a = voy;
            this.b = vpb;
        }

        public final void subscribe(final ajdq<MainPageFragment> ajdq) {
            akcr.b(ajdq, Event.EMITTER);
            if (!ajdq.isDisposed()) {
                final zjm zjm = (zjm) this.a.b.h();
                zjf zjf = new zjf(vpg.a, new ScanCardFragmentImpl(), acgv.a().a(vpg.d).a());
                MainPageFragment b = zjf.c();
                this.a.b.a((achd) zjf, vpg.c, (acih) this.b);
                ajei ajei = new ajei();
                if (b instanceof ScanCardFragment) {
                    ajej f = ((ScanCardFragment) b).b().f((ajfb) new ajfb<vso>() {
                        public final /* synthetic */ void accept(Object obj) {
                            vso vso = (vso) obj;
                            if ((vso instanceof b) || (vso instanceof c)) {
                                ajdq.a();
                            }
                        }
                    });
                    akcr.a((Object) f, "pageFragment.scanCardEve…  }\n                    }");
                    ajvv.a(ajei, f);
                }
                ajvv.a(ajei, (ajej) new vwu(new akbk<ajxw>(this) {
                    final /* synthetic */ a a;

                    /* renamed from: voy$a$2$1 */
                    static final class 1 implements Runnable {
                        private /* synthetic */ 2 a;

                        1(2 2) {
                            this.a = 2;
                        }

                        public final void run() {
                            if (zjm != null) {
                                this.a.a.a.b.a((achg) zjm, false, true, null);
                            } else {
                                this.a.a.a.b.a((achg) vpg.a, true, true, null);
                            }
                        }
                    }

                    public final /* synthetic */ Object invoke() {
                        this.a.a.a.a((Runnable) new 1(this));
                        return ajxw.a;
                    }
                }));
                ajdq.a((ajej) ajei);
                ajdq.a((Object) b);
            }
        }
    }

    public voy(achb<zjm, zjk> achb, zgb zgb) {
        akcr.b(achb, "navigationHost");
        akcr.b(zgb, "schedulersProvider");
        this.b = achb;
    }

    public final ajdp<MainPageFragment> a(vpb vpb) {
        akcr.b(vpb, "payload");
        Object b = ajdp.a((ajdr) new a(this, vpb)).b((ajdw) this.a);
        akcr.a(b, "Observable.create<MainPa…beOn(mainThreadScheduler)");
        return b;
    }
}
