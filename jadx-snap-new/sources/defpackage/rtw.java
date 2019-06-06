package defpackage;

import android.app.Activity;
import android.support.v4.app.LoaderManagerImpl;
import android.util.DisplayMetrics;
import android.view.KeyEvent.Callback;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.common.collect.Sets;
import com.snap.camera.api.CameraFragment;
import com.snap.hockey.HockeyUpdateManager;
import com.snap.mushroom.MainActivity;
import com.snap.ui.view.surfaceview.SurfaceViewManager;
import com.snapchat.android.R;
import defpackage.dqc.a;
import defpackage.gwa.b;
import defpackage.rvq.c;
import defpackage.rvq.d;
import defpackage.rvq.f;
import defpackage.rvq.i;
import defpackage.rvq.j;
import defpackage.rvq.k;
import defpackage.rvq.l;
import defpackage.rvq.m;
import defpackage.rvq.n;
import java.util.Set;

/* renamed from: rtw */
public abstract class rtw {
	public static achb<zjm, zjk> a(rvm rvm, ajwy<fxj> ajwy) {
		return new achb(rvm, new rvs(ajwy));
	}

	public static ajdx<gvk> a(ajwy<wkj> ajwy) {
		return ajdx.c(new -$$Lambda$rtw$awhczkdml071tFRezWEVqQR262w(ajwy));
	}

	public static ajws<ebj> a(ajwy<tph> ajwy, ajei ajei) {
		ajwo ajwo = new ajwo();
		ajei.a(ajwo.f((ajfb) new -$$Lambda$rtw$O-j8VjD2L-WnN0PFe5Tj7lP2UGs(ajei, ajwy)));
		return ajwo;
	}

	public static ajws<ebo> a(rvq rvq) {
		ajwl ajwl = new ajwl();
		rvq.a(ajwl);
		return ajwl;
	}

	public static Callback a(zhb zhb, MainActivity mainActivity, achb<zjm, zjk> achb, zkq zkq, ajei ajei) {
		zhb.a(new zgx(mainActivity, achb, zkq, ajei));
		return zhb;
	}

	public static SurfaceViewManager a(abss abss, ablx ablx, Activity activity, zkq zkq, iib iib, absi absi, zgb zgb, ajei ajei) {
		SurfaceViewManager surfaceViewManager = new SurfaceViewManager(abss, activity, ablx, zkq, iib, zgb, absi);
		Activity activity2 = activity;
		ajei.a(surfaceViewManager.initialize((ViewStub) activity.findViewById(R.id.full_screen_surface_view_stub)));
		return surfaceViewManager;
	}

	public static a a() {
		return new dqd.a();
	}

	public static gl a(MainActivity mainActivity) {
		if (mainActivity.e != null) {
			return mainActivity.e;
		}
		if (mainActivity.getApplication() != null) {
			if (mainActivity.f == null) {
				mainActivity.f = new y();
			}
			mainActivity.e = new LoaderManagerImpl(mainActivity, mainActivity.f);
			return mainActivity.e;
		}
		throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
	}

	public static gvp a(Set<gvn> set) {
		return new gvq(set, new gvq.a());
	}

	public static ipv a(rwo rwo, ajwy<rwq> ajwy, ajwy<rwr> ajwy2, ajwy<fxi> ajwy3, ajwy<fxj> ajwy4) {
		Object obj;
		if (((fxi) ajwy3.get()).b) {
			obj = ajwy.get();
		} else if (!((Boolean) ((fxj) ajwy4.get()).a().b()).booleanValue()) {
			return rwo;
		} else {
			obj = ajwy2.get();
		}
		return (ipv) obj;
	}

	public static Set<ablj> a(zhx zhx, zid zid, zie zie, zif zif, zih zih, gmv gmv, rwa rwa, gpi gpi, ablg ablg) {
		return Sets.newHashSet(zhx, zid, zie, zif, zih, gmv, rwa, gpi, ablg);
	}

	public static rvm a(MainActivity mainActivity, aipn<hno> aipn, HockeyUpdateManager hockeyUpdateManager, ppl ppl, ajwy<oje> ajwy, aipn<vxd> aipn2, ajwy<CameraFragment> ajwy2, aipn<rvq> aipn3, nkk nkk, nmb nmb, nmn nmn, obo obo, nnb nnb, ihh ihh, aipn<icz> aipn4, ajwy<fxi> ajwy3, ajwy<fxj> ajwy4) {
		return new rvm(aipn, mainActivity.b(), hockeyUpdateManager, ppl, ajwy, aipn2, ajwy2, aipn3, nkk, nmb, nmn, obo, nnb, ihh, aipn4, ajwy3, ajwy4);
	}

	public static tpy a(Activity activity, Set<tpx> set, zgb zgb) {
		return new tsn(LayoutInflater.from(activity), zgb, set, (ViewGroup) activity.findViewById(R.id.base_open_view));
	}

	public static zkn a(ajei ajei, ajwy<ftl> ajwy, iii iii, absj absj) {
		zfw a = zgb.a(zgu.a.callsite("MainActivity"));
		return new zkn(ajei, ((ftl) ajwy.get()).p(fxs.NEEDS_CUSTOM_INSETS_SOURCE).b((ajdw) a.b()), ((ftl) ajwy.get()).p(fxs.INSETS_DETECTOR_V2).b((ajdw) a.h()), iii, absj);
	}

	public static zko a(final ajwy<ftl> ajwy, ajei ajei, final zgb zgb) {
		return new zko(ajei, new akbk<ajdx<Long>>() {
				public final /* synthetic */ Object invoke() {
					return ((ftl) ajwy.get()).t(fxs.DISPLAY_NOTCH_HEIGHT).b((ajdw) zgb.a(zgu.a.callsite("MainActivity")).b()).f(ajvo.a(ajot.a)).d(Long.valueOf(0));
				}
			});
	}

	public static zkq a(zko zko, zkn zkn) {
		return new zkq(zko, zkn);
	}

	public static ajws<pso> b(rvq rvq) {
		ajwo ajwo = new ajwo();
		akcr.b(ajwo, "storiesSendEventObservable");
		Object f = ajwo.a((ajdw) rvq.a().l()).f((ajfb) new m(rvq));
		akcr.a(f, "storiesSendEventObservab…ession)\n                }");
		std.a(f, rvq.a);
		return ajwo;
	}

	public static DisplayMetrics b(MainActivity mainActivity) {
		return abrr.b ? new abse(mainActivity) : new abse();
	}

	public static ajws<ppz> c(rvq rvq) {
		ajwo ajwo = new ajwo();
		akcr.b(ajwo, "addToStoryEventObservable");
		Object f = ajwo.a((ajdw) rvq.a().l()).f((ajfb) new rvq.a(rvq));
		akcr.a(f, "addToStoryEventObservabl…ession)\n                }");
		std.a(f, rvq.a);
		return ajwo;
	}

	public static ajws<gwa> d(rvq rvq) {
		ajws r = new ajwo().r();
		akcr.b(r, "playbackSnapSendEvents");
		Object f = r.b(b.class).a((ajdw) rvq.a().l()).f((ajfb) new i(rvq));
		akcr.a(f, "playbackSnapSendEvents\n …      )\n                }");
		std.a(f, rvq.a);
		f = r.b(gwa.a.class).a((ajdw) rvq.a().l()).f((ajfb) new j(rvq));
		akcr.a(f, "playbackSnapSendEvents\n …ession)\n                }");
		std.a(f, rvq.a);
		return r;
	}

	public static ajws<psh> e(rvq rvq) {
		ajwl ajwl = new ajwl();
		akcr.b(ajwl, "quickReplyEventSubject");
		Object f = ajwl.a((ajdw) rvq.a().l()).f((ajfb) new c(rvq));
		akcr.a(f, "quickReplyEventSubject\n …uild())\n                }");
		std.a(f, rvq.a);
		return ajwl;
	}

	public static ajws<pqe> f(rvq rvq) {
		ajwl ajwl = new ajwl();
		akcr.b(ajwl, "cameraRollEditEventObservable");
		Object f = ajwl.a((ajdw) rvq.a().l()).f((ajfb) new rvq.b(rvq));
		akcr.a(f, "cameraRollEditEventObser…ession)\n                }");
		std.a(f, rvq.a);
		return ajwl;
	}

	public static ajws<pss> g(rvq rvq) {
		ajwl ajwl = new ajwl();
		akcr.b(ajwl, "swipeUpToLensEventObservable");
		Object f = ajwl.a((ajdw) rvq.a().l()).f((ajfb) new n(rvq));
		akcr.a(f, "swipeUpToLensEventObserv…AMERA))\n                }");
		std.a(f, rvq.a);
		return ajwl;
	}

	public static ajws<psp> h(rvq rvq) {
		ajwl ajwl = new ajwl();
		akcr.b(ajwl, "shareSnapchatterEventObservable");
		Object f = ajwl.a((ajdw) rvq.a().l()).f((ajfb) new l(rvq));
		akcr.a(f, "shareSnapchatterEventObs…ession)\n                }");
		std.a(f, rvq.a);
		return ajwl;
	}

	public static ajws<dpz> i(rvq rvq) {
		ajwo ajwo = new ajwo();
		akcr.b(ajwo, "scanSendToEvent");
		Object f = ajwo.b(dpz.a.class).a((ajdw) rvq.a().l()).f((ajfb) new d(rvq));
		akcr.a(f, "scanSendToEvent\n        …ession)\n                }");
		std.a(f, rvq.a);
		return ajwo;
	}

	public static ajws<nmk> j(rvq rvq) {
		ajwo ajwo = new ajwo();
		akcr.b(ajwo, "observable");
		Object f = ajwo.a((ajdw) rvq.a().l()).f((ajfb) new f(rvq));
		akcr.a(f, "observable\n             …uild())\n                }");
		std.a(f, rvq.a);
		return ajwo;
	}

	public static ajws<fix> k(rvq rvq) {
		ajwo ajwo = new ajwo();
		akcr.b(ajwo, "shareProductDetailEventObservable");
		Object f = ajwo.a((ajdw) rvq.a().l()).f((ajfb) new k(rvq));
		akcr.a(f, "shareProductDetailEventO…ession)\n                }");
		std.a(f, rvq.a);
		return ajwo;
	}
}
