package com.snap.messaging.chat;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.brightcove.player.event.Event;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.abit;
import defpackage.ablk;
import defpackage.acgw;
import defpackage.achb;
import defpackage.achd;
import defpackage.achi;
import defpackage.acih;
import defpackage.aipx;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajdx;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajfl;
import defpackage.ajfq;
import defpackage.ajwl;
import defpackage.ajwo;
import defpackage.ajws;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxm;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.ftl;
import defpackage.goz;
import defpackage.j;
import defpackage.pqg;
import defpackage.pqh;
import defpackage.pqj;
import defpackage.pqk;
import defpackage.pql;
import defpackage.prd;
import defpackage.prx;
import defpackage.pvh;
import defpackage.pvi;
import defpackage.pxo;
import defpackage.qbg;
import defpackage.qbk;
import defpackage.qfj;
import defpackage.qhi;
import defpackage.qvz;
import defpackage.reu;
import defpackage.sdl;
import defpackage.sdm;
import defpackage.sdr;
import defpackage.sdw;
import defpackage.sea;
import defpackage.sec;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zic;
import defpackage.zig;
import defpackage.zjf;
import defpackage.zjg;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zjq;
import defpackage.zkr;
import java.util.concurrent.Callable;

public final class ChatFragment extends MainPageFragment implements pqk, zjq {
	private pxo A;
	private boolean B;
	private boolean C;
	private qhi D;
	private ajdx<Boolean> E;
	public pvi a;
	public zkr b;
	public achb<zjm, zjk> c;
	public prd d;
	public pqg e;
	public goz f;
	public defpackage.pvk.a g;
	public ajdx<prx> h;
	public zhh i;
	public zgb j;
	public sdm k;
	public reu l;
	public ajwy<zig> m;
	public ajwy<ablk> n;
	public ajwy<sea> o;
	public ajwy<qbg> p;
	public ajwy<ftl> q;
	pqh r;
	private ajej s;
	private zic t;
	private boolean u;
	private final ajwo<ajxm<pvh, achi<zjm, zjk>>> v;
	private final ajws<Boolean> w;
	private final ajwl<pqh> x;
	private final ajxe y = ajxh.a(new i(this));
	private View z;

	static final class a<T> implements ajfb<pqh> {
		private /* synthetic */ ChatFragment a;

		a(ChatFragment chatFragment) {
			this.a = chatFragment;
		}

		public final /* synthetic */ void accept(Object obj) {
			pqh pqh = (pqh) obj;
			ajwy ajwy = this.a.o;
			if (ajwy == null) {
				akcr.a("notificationRemover");
			}
			((sea) ajwy.get()).a(pqh.b);
		}
	}

	static final class b<T> implements ajfb<Throwable> {
		public static final b a = new b();

		b() {
		}

		public final /* bridge */ /* synthetic */ void accept(Object obj) {
		}
	}

	static final class c<T> implements ajfb<ajxm<? extends Long, ? extends String>> {
		private /* synthetic */ ChatFragment a;

		c(ChatFragment chatFragment) {
			this.a = chatFragment;
		}

		public final /* synthetic */ void accept(Object obj) {
			pqh pqh = this.a.r;
			if (pqh != null) {
				pqg pqg = this.a.e;
				if (pqg == null) {
					akcr.a("chatCommands");
				}
				pqg.c(pqh);
			}
		}
	}

	static final class d implements sdl {
		private /* synthetic */ ChatFragment b;
		private /* synthetic */ achi c;

		d(ChatFragment chatFragment, achi achi) {
			this.b = chatFragment;
			this.c = achi;
		}

		public final defpackage.sdl.a evaluateNotification(sdr sdr) {
			akcr.b(sdr, "it");
			ChatFragment chatFragment = this.b;
			akcr.b(sdr, "notification");
			sec sec = sdr.b;
			if (sec.group == sdw.MESSAGING || sec.group == sdw.TALK) {
				if (sec == sec.CHAT_REPLY) {
					return defpackage.sdl.a.DROP;
				}
				Uri uri = sdr.k;
				Object obj = null;
				Object a = uri != null ? qvz.a(uri) : null;
				pqh pqh = chatFragment.r;
				if (pqh != null) {
					obj = Long.valueOf(pqh.a);
				}
				if (akcr.a(obj, a)) {
					return defpackage.sdl.a.DROP;
				}
			}
			return defpackage.sdl.a.DISPLAY;
		}
	}

	public static final class e implements qfj {
		private /* synthetic */ ChatFragment a;
		private /* synthetic */ View b;
		private /* synthetic */ Bundle c;

		e(ChatFragment chatFragment, View view, Bundle bundle) {
			this.a = chatFragment;
			this.b = view;
			this.c = bundle;
		}

		public final boolean a(achi<zjm, zjk> achi) {
			akcr.b(achi, "navigationEvent");
			return zjg.b(achi, this.a);
		}

		public final boolean b(achi<zjm, zjk> achi) {
			akcr.b(achi, "navigationEvent");
			return zjg.a(achi, this.a);
		}
	}

	static final class f<T> implements ajfb<Boolean> {
		private /* synthetic */ ChatFragment a;
		private /* synthetic */ View b;
		private /* synthetic */ Bundle c;

		f(ChatFragment chatFragment, View view, Bundle bundle) {
			this.a = chatFragment;
			this.b = view;
			this.c = bundle;
		}

		public final /* synthetic */ void accept(Object obj) {
			obj = (Boolean) obj;
			akcr.a(obj, "it");
			if (obj.booleanValue()) {
				this.a.w();
			}
		}
	}

	static final class g<T> implements ajfl<Rect> {
		public static final g a = new g();

		g() {
		}

		public final /* synthetic */ boolean test(Object obj) {
			Rect rect = (Rect) obj;
			akcr.b(rect, "rect");
			return rect.top > 0;
		}
	}

	static final class h<T> implements ajfb<Rect> {
		private /* synthetic */ View a;
		private /* synthetic */ View b;
		private /* synthetic */ View c;

		h(View view, View view2, View view3) {
			this.a = view;
			this.b = view2;
			this.c = view3;
		}

		public final /* synthetic */ void accept(Object obj) {
			Rect rect = (Rect) obj;
			Object obj2 = this.a;
			String str = "statusBarInsetView";
			akcr.a(obj2, str);
			Object obj3 = this.a;
			akcr.a(obj3, str);
			LayoutParams layoutParams = obj3.getLayoutParams();
			layoutParams.height = rect.top;
			obj2.setLayoutParams(layoutParams);
			obj2 = this.b;
			str = "navbarInsetView";
			akcr.a(obj2, str);
			obj3 = this.b;
			akcr.a(obj3, str);
			layoutParams = obj3.getLayoutParams();
			layoutParams.height = rect.bottom;
			obj2.setLayoutParams(layoutParams);
			obj2 = this.c;
			str = "drawerContainer";
			akcr.a(obj2, str);
			obj3 = this.c;
			akcr.a(obj3, str);
			layoutParams = obj3.getLayoutParams();
			if (layoutParams != null) {
				MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
				marginLayoutParams.bottomMargin = rect.bottom;
				obj2.setLayoutParams(marginLayoutParams);
				return;
			}
			throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
		}
	}

	static final class i extends akcs implements akbk<zfw> {
		private /* synthetic */ ChatFragment a;

		i(ChatFragment chatFragment) {
			this.a = chatFragment;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			if (this.a.j == null) {
				akcr.a("schedulersProvider");
			}
			return zgb.a(pql.j.callsite("ChatFragment"));
		}
	}

	static {
		new aken[1][0] = new akdc(akde.a(ChatFragment.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
	}

	public ChatFragment() {
		Object ajwo = new ajwo();
		akcr.a(ajwo, "PublishSubject.create<Pa…Signal, MainNavEvent?>>()");
		this.v = ajwo;
		ajwo = new ajwl();
		String str = "BehaviorSubject.create()";
		akcr.a(ajwo, str);
		this.w = (ajws) ajwo;
		ajwo = new ajwl();
		akcr.a(ajwo, str);
		this.x = ajwo;
	}

	private void a(pqh pqh) {
		akcr.b(pqh, "chatContext");
		if (!akcr.a((Object) pqh, this.r)) {
			this.r = pqh;
			this.x.a((Object) pqh);
			pqg pqg = this.e;
			if (pqg == null) {
				akcr.a("chatCommands");
			}
			pqg.a(pqh);
		}
	}

	private final void a(reu reu) {
		pqh pqh = (pqh) this.x.p();
		if (pqh != null) {
			String str = pqh.b;
			long j = pqh.a;
			akcr.b(str, "conversationId");
			reu.d.a(ajdx.c((Callable) new defpackage.reu.d(reu, j)).b((ajdw) reu.a.i()).a((ajdw) reu.a.b()).e((ajfb) new defpackage.reu.e(reu, str)));
		}
	}

	private final zfw h() {
		return (zfw) this.y.b();
	}

	private final ajej i() {
		Object a = this.x.e().a((ajfb) new a(this), (ajfb) b.a);
		akcr.a(a, "chatContextObservable.fi…ext\") }\n                )");
		return a;
	}

	private final ajej j() {
		Object f;
		String str;
		if (this.B && this.C) {
			goz goz = this.f;
			if (goz == null) {
				// throw("lateinit property screenshotWatchman is uninitialized")
				akcr.a("screenshotWatchman");
			}
			f = goz.a().a((ajdw) h().l()).f((ajfb) new c(this));
			this.s = f;
			str = "screenshotWatchman\n     …Disposable = disposable }";
		} else {
			f = ajfq.INSTANCE;
			str = "Disposables.disposed()";
		}
		akcr.a(f, str);
		return f;
	}

	public final long S_() {
		pxo pxo = this.A;
		if (pxo != null) {
			abit h = pxo.h();
			if (h != null && h.k()) {
				return -1;
			}
		}
		return 60000;
	}

	/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
	    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x00d0 in {4, 13, 16, 17, 18, 23, 28, 33, 36, 37, 38, 40} preds:[]
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
	    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
	    at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
	    at java.util.ArrayList.forEach(ArrayList.java:1257)
	    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	    at jadx.core.ProcessClass.process(ProcessClass.java:32)
	    at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
	    at jadx.api.JavaClass.decompile(JavaClass.java:62)
	    at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	*/
	public final void a_(defpackage.achi<defpackage.zjm, defpackage.zjk> r7) {
		/*
		  r6 = this;
		  r0 = "navigationEvent";
		  defpackage.akcr.b(r7, r0);
		  super.a_(r7);	 Catch:{ all -> 0x00ce }
		  r0 = 1;	 Catch:{ all -> 0x00ce }
		  r6.C = r0;	 Catch:{ all -> 0x00ce }
		  r1 = r6.v;	 Catch:{ all -> 0x00ce }
		  r2 = new ajxm;	 Catch:{ all -> 0x00ce }
		  r3 = defpackage.pvh.ON_VISIBLE;	 Catch:{ all -> 0x00ce }
		  r2.<init>(r3, r7);	 Catch:{ all -> 0x00ce }
		  r1.a(r2);	 Catch:{ all -> 0x00ce }
		  r1 = r6.k;	 Catch:{ all -> 0x00ce }
		  if (r1 != 0) goto L_0x0020;	 Catch:{ all -> 0x00ce }
		  r2 = "inAppNotificationPolicySetter";	 Catch:{ all -> 0x00ce }
		  defpackage.akcr.a(r2);	 Catch:{ all -> 0x00ce }
		  r2 = defpackage.pql.a;	 Catch:{ all -> 0x00ce }
		  r3 = new com.snap.messaging.chat.ChatFragment$d;	 Catch:{ all -> 0x00ce }
		  r3.<init>(r6, r7);	 Catch:{ all -> 0x00ce }
		  r3 = (defpackage.sdl) r3;	 Catch:{ all -> 0x00ce }
		  r1.a(r2, r3);	 Catch:{ all -> 0x00ce }
		  r7 = r6.i();	 Catch:{ all -> 0x00ce }
		  r1 = r6;	 Catch:{ all -> 0x00ce }
		  r1 = (com.snap.taskexecution.scoping.recipes.ScopedFragment) r1;	 Catch:{ all -> 0x00ce }
		  r2 = com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW;	 Catch:{ all -> 0x00ce }
		  com.snap.taskexecution.scoping.recipes.ScopedFragment.a(r6, r7, r1, r2);	 Catch:{ all -> 0x00ce }
		  r7 = r6.r;	 Catch:{ all -> 0x00ce }
		  if (r7 == 0) goto L_0x0065;	 Catch:{ all -> 0x00ce }
		  r7 = r6.s;	 Catch:{ all -> 0x00ce }
		  if (r7 == 0) goto L_0x005b;	 Catch:{ all -> 0x00ce }
		  r7 = r6.s;	 Catch:{ all -> 0x00ce }
		  if (r7 == 0) goto L_0x004b;	 Catch:{ all -> 0x00ce }
		  r7 = r7.isDisposed();	 Catch:{ all -> 0x00ce }
		  if (r7 != r0) goto L_0x004b;	 Catch:{ all -> 0x00ce }
		  goto L_0x005b;	 Catch:{ all -> 0x00ce }
		  r1 = r6.s;	 Catch:{ all -> 0x00ce }
		  if (r1 == 0) goto L_0x0065;	 Catch:{ all -> 0x00ce }
		  r2 = r6;	 Catch:{ all -> 0x00ce }
		  r2 = (com.snap.ui.deck.ScopedMainPageFragment) r2;	 Catch:{ all -> 0x00ce }
		  r3 = com.snap.ui.deck.ScopedMainPageFragment.b.ON_HIDDEN;	 Catch:{ all -> 0x00ce }
		  r4 = 0;	 Catch:{ all -> 0x00ce }
		  r5 = 4;	 Catch:{ all -> 0x00ce }
		  r0 = r6;	 Catch:{ all -> 0x00ce }
		  com.snap.ui.deck.ScopedMainPageFragment.a(r0, r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00ce }
		  goto L_0x0065;	 Catch:{ all -> 0x00ce }
		  r1 = r6.j();	 Catch:{ all -> 0x00ce }
		  r2 = r6;	 Catch:{ all -> 0x00ce }
		  r2 = (com.snap.ui.deck.ScopedMainPageFragment) r2;	 Catch:{ all -> 0x00ce }
		  r3 = com.snap.ui.deck.ScopedMainPageFragment.b.ON_HIDDEN;	 Catch:{ all -> 0x00ce }
		  goto L_0x0054;	 Catch:{ all -> 0x00ce }
		  r7 = r6.z;	 Catch:{ all -> 0x00ce }
		  r0 = "fragmentView";
		  if (r7 != 0) goto L_0x006e;
		  defpackage.akcr.a(r0);	 Catch:{ all -> 0x00ce }
		  r7 = r7.getBackground();	 Catch:{ all -> 0x00ce }
		  r7 = r7.mutate();	 Catch:{ all -> 0x00ce }
		  r1 = "fragmentView.background.mutate()";	 Catch:{ all -> 0x00ce }
		  defpackage.akcr.a(r7, r1);	 Catch:{ all -> 0x00ce }
		  r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;	 Catch:{ all -> 0x00ce }
		  r7.setAlpha(r1);	 Catch:{ all -> 0x00ce }
		  r7 = r6.t;	 Catch:{ all -> 0x00ce }
		  if (r7 != 0) goto L_0x00cd;	 Catch:{ all -> 0x00ce }
		  r7 = r6.n;	 Catch:{ all -> 0x00ce }
		  if (r7 != 0) goto L_0x008d;	 Catch:{ all -> 0x00ce }
		  r1 = "frameRateMonitorConfig";	 Catch:{ all -> 0x00ce }
		  defpackage.akcr.a(r1);	 Catch:{ all -> 0x00ce }
		  r7 = r7.get();	 Catch:{ all -> 0x00ce }
		  r7 = (defpackage.ablk) r7;	 Catch:{ all -> 0x00ce }
		  r1 = new abgc;	 Catch:{ all -> 0x00ce }
		  r1.<init>();	 Catch:{ all -> 0x00ce }
		  r1 = (defpackage.aajt) r1;	 Catch:{ all -> 0x00ce }
		  r7 = r7.a(r1);	 Catch:{ all -> 0x00ce }
		  if (r7 == 0) goto L_0x00cd;	 Catch:{ all -> 0x00ce }
		  r7 = r6.z;	 Catch:{ all -> 0x00ce }
		  if (r7 != 0) goto L_0x00a7;	 Catch:{ all -> 0x00ce }
		  defpackage.akcr.a(r0);	 Catch:{ all -> 0x00ce }
		  r0 = 2131427875; // 0x7f0b0223 float:1.8477379E38 double:1.0530652896E-314;	 Catch:{ all -> 0x00ce }
		  r7 = r7.findViewById(r0);	 Catch:{ all -> 0x00ce }
		  r7 = (android.support.v7.widget.RecyclerView) r7;	 Catch:{ all -> 0x00ce }
		  r0 = new zic;	 Catch:{ all -> 0x00ce }
		  r1 = r6.m;	 Catch:{ all -> 0x00ce }
		  if (r1 != 0) goto L_0x00bb;	 Catch:{ all -> 0x00ce }
		  r2 = "scrollPerfLogger";	 Catch:{ all -> 0x00ce }
		  defpackage.akcr.a(r2);	 Catch:{ all -> 0x00ce }
		  r2 = defpackage.pql.a;	 Catch:{ all -> 0x00ce }
		  r2 = r2.b();	 Catch:{ all -> 0x00ce }
		  r0.<init>(r1, r2);	 Catch:{ all -> 0x00ce }
		  r6.t = r0;	 Catch:{ all -> 0x00ce }
		  r0 = r6.t;	 Catch:{ all -> 0x00ce }
		  r0 = (android.support.v7.widget.RecyclerView.OnScrollListener) r0;	 Catch:{ all -> 0x00ce }
		  r7.addOnScrollListener(r0);	 Catch:{ all -> 0x00ce }
		  return;
		  r7 = move-exception;
		  throw r7;
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.chat.ChatFragment.a_(achi):void");
	}

	public final pqh b() {
		return this.r;
	}

	public final void b(achi<zjm, zjk> achi) {
		akcr.b(achi, "navigationEvent");
		super.b((achi) achi);
		this.C = false;
		sdm sdm = this.k;
		if (sdm == null) {
			akcr.a("inAppNotificationPolicySetter");
		}
		sdm.a(pql.a);
		reu reu = this.l;
		if (reu == null) {
			akcr.a("chatNotificationRateLimiter");
		}
		a(reu);
		this.v.a(new ajxm(pvh.ON_HIDDEN, achi));
	}

	public final void c(achi<zjm, zjk> achi) {
		akcr.b(achi, "navigationEvent");
		super.c(achi);
		this.v.a(new ajxm(pvh.ON_NAVIGATE, achi));
		if (achi.a()) {
			this.v.a(new ajxm(pvh.ON_NAVIGATE_COMPLETE, achi));
		}
		boolean b = zjg.b(achi, this);
		boolean a = zjg.a(achi, this);
		Object obj = null;
		Object obj2 = achi.d == acgw.PRESENT ? 1 : null;
		if (achi.l && b && obj2 != null) {
			this.u = true;
			acih acih = achi.m;
			if (!(acih instanceof pqj)) {
				acih = null;
			}
			pqj pqj = (pqj) acih;
			pqh pqh = pqj != null ? pqj.a : null;
			if (pqh == null) {
				prd prd = this.d;
				if (prd == null) {
					akcr.a("feedNavTracker");
				}
				pqh = prd.b;
			}
			if (pqh != null) {
				a(pqh);
			} else {
				throw new IllegalStateException("Opening chat fragment with no chat context.");
			}
		}
		obj2 = this;
		akcr.b(achi, "receiver$0");
		akcr.b(obj2, Event.FRAGMENT);
		achd d = achi.a.d();
		zjk zjk = (zjk) d;
		obj2 = ((zjk instanceof zjf) && akcr.a(((zjf) zjk).c(), obj2)) ? 1 : null;
		if (obj2 == null) {
			d = null;
		}
		if (d != null) {
			obj = 1;
		}
		String str = "fragmentView.background.mutate()";
		String str2 = "fragmentView";
		if (obj != null) {
			View view;
			Object mutate;
			if (b) {
				view = this.z;
				if (view == null) {
					akcr.a(str2);
				}
				mutate = view.getBackground().mutate();
				akcr.a(mutate, str);
				mutate.setAlpha((int) (achi.i * 255.0f));
			}
			if (a) {
				view = this.z;
				if (view == null) {
					akcr.a(str2);
				}
				mutate = view.getBackground().mutate();
				akcr.a(mutate, str);
				mutate.setAlpha((int) ((1.0f - achi.i) * 255.0f));
				return;
			}
		}
		View view2 = this.z;
		if (view2 == null) {
			akcr.a(str2);
		}
		Object mutate2 = view2.getBackground().mutate();
		akcr.a(mutate2, str);
		mutate2.setAlpha(255);
	}

	public final void d(achi<zjm, zjk> achi) {
		akcr.b(achi, "navigationEvent");
		super.d(achi);
		boolean b = zjg.b(achi, this);
		Object obj = achi.d == acgw.PRESENT ? 1 : null;
		if (achi.l && b && obj != null) {
			this.u = false;
		}
		this.v.a(new ajxm(pvh.ON_NAVIGATE_UNSUCCESS, achi));
		View view = this.z;
		if (view == null) {
			akcr.a("fragmentView");
		}
		Object mutate = view.getBackground().mutate();
		akcr.a(mutate, "fragmentView.background.mutate()");
		mutate.setAlpha(255);
	}

	public final void n_() {
		super.n_();
		this.v.a(new ajxm(pvh.ON_STACKED, null));
	}

	public final boolean o_() {
		pxo pxo = this.A;
		if (pxo != null) {
			abit h = pxo.h();
			if (h != null) {
				return h.j();
			}
		}
		return false;
	}

	public final void onAttach(Context context) {
		akcr.b(context, "context");
		aipx.a(this);
		super.onAttach(context);
	}

	/* JADX WARNING: Missing block: B:15:0x0064, code skipped:
	   if (r1 == null) goto L_0x0066;
	*/
	public final void onCreate(android.os.Bundle r22) {
		/*
		  r21 = this;
		  r0 = r21;
		  super.onCreate(r22);
		  r1 = r0.q;
		  if (r1 != 0) goto L_0x000e;
		  L_0x0009:
		  r2 = "configProvider";
		  defpackage.akcr.a(r2);
		  L_0x000e:
		  r1 = r1.get();
		  r1 = (defpackage.ftl) r1;
		  r2 = defpackage.qpy.PRELOAD_CHAT_VIEW_MODELS;
		  r2 = (defpackage.fth) r2;
		  r1 = r1.b(r2);
		  r2 = r21.h();
		  r2 = r2.h();
		  r2 = (defpackage.ajdw) r2;
		  r1 = r1.b(r2);
		  r1 = r1.a();
		  r2 = "configProvider.get()\n   …                 .cache()";
		  defpackage.akcr.a(r1, r2);
		  r0.E = r1;
		  r1 = r0.E;
		  if (r1 != 0) goto L_0x003e;
		  L_0x0039:
		  r2 = "shouldUseChatPreload";
		  defpackage.akcr.a(r2);
		  L_0x003e:
		  r1 = r1.c();
		  r2 = r0;
		  r2 = (com.snap.taskexecution.scoping.recipes.ScopedFragment) r2;
		  r3 = com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY;
		  com.snap.taskexecution.scoping.recipes.ScopedFragment.a(r0, r1, r2, r3);
		  r1 = r21.getArguments();
		  r3 = 0;
		  if (r1 == 0) goto L_0x005a;
		  L_0x0051:
		  r4 = defpackage.acih.g;
		  r1 = r1.getParcelable(r4);
		  r1 = (defpackage.pqj) r1;
		  goto L_0x005b;
		  L_0x005a:
		  r1 = r3;
		  L_0x005b:
		  r4 = r1 instanceof defpackage.pqj;
		  if (r4 != 0) goto L_0x0060;
		  L_0x005f:
		  r1 = r3;
		  L_0x0060:
		  if (r1 == 0) goto L_0x0066;
		  L_0x0062:
		  r1 = r1.a;
		  if (r1 != 0) goto L_0x0071;
		  L_0x0066:
		  r1 = r0.d;
		  if (r1 != 0) goto L_0x006f;
		  L_0x006a:
		  r3 = "feedNavTracker";
		  defpackage.akcr.a(r3);
		  L_0x006f:
		  r1 = r1.b;
		  L_0x0071:
		  if (r1 == 0) goto L_0x0154;
		  L_0x0073:
		  r3 = r0.p;
		  if (r3 != 0) goto L_0x007c;
		  L_0x0077:
		  r4 = "chatMessagesSectionFactory";
		  defpackage.akcr.a(r4);
		  L_0x007c:
		  r3 = r3.get();
		  r3 = (defpackage.qbg) r3;
		  r12 = r21.getContext();
		  r4 = "context";
		  defpackage.akcr.b(r12, r4);
		  r4 = "chatContext";
		  defpackage.akcr.b(r1, r4);
		  r13 = new qku;
		  r6 = r3.b;
		  r7 = r3.j;
		  r8 = r3.k;
		  r9 = r3.l;
		  r10 = r3.m;
		  r11 = r3.n;
		  r4 = r13;
		  r5 = r12;
		  r4.<init>(r5, r6, r7, r8, r9, r10, r11);
		  r4 = defpackage.ajxw.a;
		  r8 = defpackage.ajwl.i(r4);
		  r4 = "BehaviorSubject.createDefault<Unit>(Unit)";
		  defpackage.akcr.a(r8, r4);
		  r4 = defpackage.pql.j;
		  r5 = "ChatMessagesSectionFactory";
		  r4 = r4.callsite(r5);
		  r4 = defpackage.zgb.a(r4);
		  r4 = r4.h();
		  r4 = (defpackage.ajdw) r4;
		  r4 = r8.a(r4);
		  r15 = new qhi;
		  r6 = r1.a;
		  r9 = r3.c;
		  r10 = r13;
		  r10 = (defpackage.qkt) r10;
		  r5 = r3.d;
		  r11 = new qbg$a;
		  r11.<init>(r1, r4);
		  r11 = (defpackage.ajfc) r11;
		  r11 = r5.d(r11);
		  r4 = "messageListDataProvider.…chatContext, fetchNext) }";
		  defpackage.akcr.a(r11, r4);
		  r13 = r3.e;
		  r14 = new qfy;
		  r4 = r3.f;
		  r14.<init>(r12, r4);
		  r4 = r3.g;
		  r4 = r4.get();
		  r5 = "messageMetadataManager.get()";
		  defpackage.akcr.a(r4, r5);
		  r16 = r4;
		  r16 = (defpackage.qfz) r16;
		  r5 = r3.h;
		  r4 = r3.d;
		  r17 = r5;
		  r5 = new qbg$b;
		  r5.<init>(r1);
		  r5 = (defpackage.ajfc) r5;
		  r5 = r4.d(r5);
		  r4 = "messageListDataProvider.…rveLoading(chatContext) }";
		  defpackage.akcr.a(r5, r4);
		  r4 = r3.i;
		  r18 = r13;
		  r22 = r14;
		  r13 = r1.a;
		  r19 = r4.a(r13);
		  r3 = r3.a;
		  r4 = r15;
		  r20 = r5;
		  r5 = r12;
		  r12 = r18;
		  r13 = r22;
		  r14 = r16;
		  r22 = r15;
		  r15 = r17;
		  r16 = r20;
		  r17 = r19;
		  r18 = r3;
		  r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
		  r3 = r22.c();
		  r4 = r21.h();
		  r4 = r4.h();
		  r4 = (defpackage.ajdw) r4;
		  r3 = r3.b(r4);
		  r3 = r3.l();
		  r4 = com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY;
		  com.snap.taskexecution.scoping.recipes.ScopedFragment.a(r0, r3, r2, r4);
		  r2 = r22;
		  r0.D = r2;
		  r0.a(r1);
		  L_0x0154:
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.chat.ChatFragment.onCreate(android.os.Bundle):void");
	}

	public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
		akcr.b(layoutInflater, "inflater");
		Object inflate = layoutInflater.inflate(R.layout.fragment_chat, viewGroup, false);
		akcr.a(inflate, "inflater.inflate(R.layou…t_chat, container, false)");
		this.z = inflate;
		View view = this.z;
		if (view == null) {
			akcr.a("fragmentView");
		}
		return view;
	}

	public final void onDestroy() {
		super.onDestroy();
		sdm sdm = this.k;
		if (sdm == null) {
			akcr.a("inAppNotificationPolicySetter");
		}
		sdm.a(pql.a);
	}

	public final void onPause() {
		super.onPause();
		this.B = false;
		ajej ajej = this.s;
		if (!(ajej == null || ajej.isDisposed())) {
			ajej = this.s;
			if (ajej != null) {
				ajej.dispose();
			}
		}
		reu reu = this.l;
		if (reu == null) {
			akcr.a("chatNotificationRateLimiter");
		}
		a(reu);
		this.v.a(new ajxm(pvh.ON_PAUSED, null));
	}

	public final void onResume() {
		super.onResume();
		this.B = true;
		ajej ajej = this.s;
		if (ajej != null && ajej.isDisposed()) {
			j();
		}
		if (this.C) {
			ScopedFragment.a((ScopedFragment) this, i(), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
		}
		this.v.a(new ajxm(pvh.ON_RESUMED, null));
	}

	public final void onViewCreated(View view, Bundle bundle) {
		akcr.b(view, "view");
		super.onViewCreated(view, bundle);
		View view2 = this.z;
		String str = "fragmentView";
		if (view2 == null) {
			akcr.a(str);
		}
		view2 = view2.findViewById(R.id.chat_drawer_or_keyboard);
		defpackage.pvk.a aVar = this.g;
		if (aVar == null) {
			akcr.a("pageComponentBuilder");
		}
		aVar = aVar.a((ajdp) this.v).b((ajdp) this.w).c(this.x);
		View view3 = this.z;
		if (view3 == null) {
			akcr.a(str);
		}
		aVar = aVar.a(view3);
		akcr.a((Object) view2, "drawerContainer");
		aVar = aVar.b(view2);
		zhh zhh = this.i;
		if (zhh == null) {
			akcr.a("keyboardDetector");
		}
		Object a = zhh.a();
		akcr.a(a, "keyboardDetector.keyboardHeightObservable");
		aVar = aVar.d(a).a((qfj) new e(this, view, bundle));
		j lifecycle = getLifecycle();
		akcr.a((Object) lifecycle, "lifecycle");
		aVar = aVar.a(lifecycle).a(this.D);
		ajdx ajdx = this.E;
		if (ajdx == null) {
			akcr.a("shouldUseChatPreload");
		}
		this.A = aVar.a(ajdx).a().a();
		pxo pxo = this.A;
		if (pxo != null) {
			ajej start = pxo.start();
			if (start != null) {
				ScopedFragment.a((ScopedFragment) this, start, (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
			}
		}
		pxo = this.A;
		if (pxo != null) {
			qbk qbk = pxo.b;
			if (qbk == null) {
				akcr.a("messageListPresenter");
			}
			ScopedFragment.a((ScopedFragment) this, qbk.i.f((ajfb) new f(this, view, bundle)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
		}
		view = this.z;
		if (view == null) {
			akcr.a(str);
		}
		view = view.findViewById(R.id.navbar_inset);
		View view4 = this.z;
		if (view4 == null) {
			akcr.a(str);
		}
		view4 = view4.findViewById(R.id.status_bar_inset);
		zkr zkr = this.b;
		if (zkr == null) {
			akcr.a("windowRectObserver");
		}
		ScopedFragment.a((ScopedFragment) this, zkr.a().a((ajfl) g.a).f((ajfb) new h(view4, view, view2)), (ScopedFragment) this, com.snap.taskexecution.scoping.recipes.ScopedFragment.b.ON_DESTROY_VIEW);
	}

	public final void p_() {
		super.p_();
		View view = this.z;
		if (view == null) {
			akcr.a("fragmentView");
		}
		view.setBackgroundResource(R.color.regular_blue);
		this.v.a(new ajxm(pvh.ON_ADDED, null));
	}

	public final void q_() {
		super.q_();
		this.v.a(new ajxm(pvh.ON_UNSTACKED, null));
	}

	public final void s_() {
		super.s_();
		this.v.a(new ajxm(pvh.ON_REMOVED, null));
		if (this.u) {
			pqh pqh = this.r;
			if (pqh != null) {
				pqg pqg = this.e;
				if (pqg == null) {
					akcr.a("chatCommands");
				}
				pqg.b(pqh);
			}
		}
		this.w.a((Object) Boolean.valueOf(this.u));
		this.u = false;
	}
}
