package com.snap.mushroom;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import com.brightcove.player.event.Event;
import com.snap.mushroom.base.EarlyInitComponent;
import com.snap.mushroom.base.MainActivityInjector;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity;
import com.snap.unstuffing.lib.DataMigrationActivity;
import com.snapchat.android.R;
import com.snapchat.deck.views.DeckView;
import defpackage.abll;
import defpackage.abln.h;
import defpackage.ablp;
import defpackage.ablv;
import defpackage.ablx;
import defpackage.ably;
import defpackage.abmc;
import defpackage.abmd;
import defpackage.abmf;
import defpackage.abmg;
import defpackage.abmr;
import defpackage.achb;
import defpackage.achk;
import defpackage.aciw;
import defpackage.aipn;
import defpackage.aipq;
import defpackage.aipr;
import defpackage.aipy;
import defpackage.ajei;
import defpackage.ajek;
import defpackage.ajev;
import defpackage.ajfc;
import defpackage.ajwy;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.fv;
import defpackage.fxh;
import defpackage.ifs;
import defpackage.ifx;
import defpackage.igx;
import defpackage.ipt;
import defpackage.nbl;
import defpackage.qxa;
import defpackage.rsm;
import defpackage.rso;
import defpackage.rso.f;
import defpackage.rso.g;
import defpackage.tmp;
import defpackage.wqy;
import defpackage.wqz;
import defpackage.zjt;
import defpackage.zlb;
import defpackage.zlc;
import defpackage.zlh;
import defpackage.zlj;
import defpackage.ztb;
import defpackage.ztl;
import java.lang.ref.WeakReference;
import net.sqlcipher.database.SQLiteDatabase;

public final class MainActivity extends ScopedFragmentActivity implements abmg, aipy, wqy {
	public rso i;
	EarlyInitComponent j;
	private boolean k = true;
	private boolean l;
	private boolean m;
	private ajei n = new ajei();

	public static final class a {
		private a() {
		}

		public /* synthetic */ a(byte b) {
			this();
		}
	}

	static final class c extends akcs implements akbk {
		private /* synthetic */ MainActivity a;
		private /* synthetic */ Bundle b;

		c(MainActivity mainActivity, Bundle bundle) {
			this.a = mainActivity;
			this.b = bundle;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			super.onCreate(this.b);
			return null;
		}
	}

	static final class d extends akcs implements akbk<Boolean> {
		private /* synthetic */ defpackage.akdd.a a;
		private /* synthetic */ MainActivity b;
		private /* synthetic */ Bundle c;

		d(defpackage.akdd.a aVar, MainActivity mainActivity, Bundle bundle) {
			this.a = aVar;
			this.b = mainActivity;
			this.c = bundle;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			defpackage.akdd.a aVar = this.a;
			EarlyInitComponent earlyInitComponent = this.b.j;
			if (earlyInitComponent == null) {
				akcr.a("applicationComponent");
			}
			ztl pureMushroomMigrationRedirector = earlyInitComponent.pureMushroomMigrationRedirector();
			Activity activity = this.b;
			akcr.b(activity, Event.ACTIVITY);
			boolean z = true;
			Object obj = (!((Boolean) pureMushroomMigrationRedirector.b.b()).booleanValue() || pureMushroomMigrationRedirector.c) ? null : 1;
			if (obj != null) {
				Intent intent = new Intent(activity, DataMigrationActivity.class);
				intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
				intent.putExtra(ztb.a, new Intent(activity.getIntent()));
				activity.startActivity(intent);
			} else {
				z = false;
			}
			aVar.a = z;
			return Boolean.TRUE;
		}
	}

	static final class b<T, R> implements ajfc<T, R> {
		private /* synthetic */ MainActivity a;

		b(MainActivity mainActivity) {
			this.a = mainActivity;
		}

		public final /* synthetic */ Object apply(Object obj) {
			MainActivityInjector mainActivityInjector = (MainActivityInjector) obj;
			akcr.b(mainActivityInjector, "injector");
			mainActivityInjector.inject(this.a);
			return ajxw.a;
		}
	}

	static {
		a aVar = new a();
	}

	public MainActivity() {
		abll a = ablx.a().a(ably.FROM_NEW_ACTIVITY, abmc.MAIN_ACTIVITY_CONSTRUCTOR, null);
		ablx a2 = ablx.a();
		if (a == null) {
			akcr.a();
		}
		a2.b(a.a());
	}

	public final void a(Intent intent) {
		String str = "intent";
		akcr.b(intent, str);
		rso rso = this.i;
		if (rso == null) {
			akcr.a();
		}
		akcr.b(intent, str);
		Activity activity = rso.a;
		if (activity == null) {
			akcr.a(Event.ACTIVITY);
		}
		activity.startActivityForResult(intent, 2);
	}

	public final aipq<fv> c() {
		rso rso = this.i;
		if (rso == null) {
			akcr.a();
		}
		aipr aipr = rso.c;
		if (aipr == null) {
			akcr.a("fragmentDispatchingAndroidInjector");
		}
		return aipr;
	}

	public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
		akcr.b(motionEvent, "event");
		rso rso = this.i;
		if (rso != null) {
			if (rso == null) {
				akcr.a();
			}
			rso.a(motionEvent);
		}
		return super.dispatchTouchEvent(motionEvent);
	}

	public final <T extends abmf> T getTestBridge(Class<T> cls) {
		akcr.b(cls, "bridgeClass");
		EarlyInitComponent earlyInitComponent = this.j;
		if (earlyInitComponent == null) {
			akcr.a("applicationComponent");
		}
		return earlyInitComponent.testBridgeContainer().getTestBridge(cls);
	}

	public final void onActivityResult(int i, int i2, Intent intent) {
		rso rso = this.i;
		if (rso != null && i == 2) {
			wqz wqz = rso.z;
			if (wqz == null) {
				akcr.a("systemScreenshotTaker");
			}
			Activity activity = rso.a;
			if (activity == null) {
				akcr.a(Event.ACTIVITY);
			}
			wqz.a(activity, i2, intent);
		}
	}

	public final void onBackPressed() {
		rso rso = this.i;
		if (!(rso != null ? rso.b() : false)) {
			super.onBackPressed();
		}
	}

	/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
	    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:97:0x01dd in {9, 15, 17, 23, 26, 33, 35, 36, 41, 43, 44, 47, 48, 50, 55, 64, 67, 69, 72, 74, 77, 79, 84, 85, 88, 90, 93, 96} preds:[]
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	    at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
	    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
	    at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
	    at java.util.ArrayList.forEach(ArrayList.java:1257)
	    at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	    at jadx.core.ProcessClass.process(ProcessClass.java:32)
	    at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
	    at java.lang.Iterable.forEach(Iterable.java:75)
	    at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
	    at jadx.core.ProcessClass.process(ProcessClass.java:37)
	    at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
	    at jadx.api.JavaClass.decompile(JavaClass.java:62)
	    at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	*/
	public final void onCreate(android.os.Bundle r9) {
		/*
		  r8 = this;
		  r0 = defpackage.abmc.MAIN_ACTIVITY_ON_CREATE;
		  r0 = (defpackage.abln.e) r0;
		  r0 = defpackage.abll.a(r0);
		  r1 = new com.snap.mushroom.MainActivity$c;	 Catch:{ all -> 0x01ce }
		  r1.<init>(r8, r9);	 Catch:{ all -> 0x01ce }
		  r1 = (defpackage.akbk) r1;	 Catch:{ all -> 0x01ce }
		  defpackage.gvr.a.a(r1);	 Catch:{ all -> 0x01ce }
		  r1 = 0;
		  r2 = r8.getApplication();	 Catch:{ Exception -> 0x0192 }
		  if (r2 == 0) goto L_0x018a;	 Catch:{ Exception -> 0x0192 }
		  r2 = (com.facebook.buck.android.support.exopackage.ExopackageApplication) r2;	 Catch:{ Exception -> 0x0192 }
		  r2 = r2.b();	 Catch:{ Exception -> 0x0192 }
		  r3 = r2 instanceof defpackage.ytw;	 Catch:{ Exception -> 0x0192 }
		  if (r3 == 0) goto L_0x0029;	 Catch:{ Exception -> 0x0192 }
		  r2 = (defpackage.ytw) r2;	 Catch:{ Exception -> 0x0192 }
		  r2 = r2.getApplication();	 Catch:{ Exception -> 0x0192 }
		  if (r2 == 0) goto L_0x0182;	 Catch:{ Exception -> 0x0192 }
		  r2 = (com.snap.mushroom.base.HasEarlyInitComponent) r2;	 Catch:{ Exception -> 0x0192 }
		  r2 = r2.earlyInitComponent();	 Catch:{ Exception -> 0x0192 }
		  r3 = "(appDelegate as HasEarly…ent).earlyInitComponent()";	 Catch:{ Exception -> 0x0192 }
		  defpackage.akcr.a(r2, r3);	 Catch:{ Exception -> 0x0192 }
		  r8.j = r2;	 Catch:{ Exception -> 0x0192 }
		  r2 = new akdd$a;	 Catch:{ all -> 0x01ce }
		  r2.<init>();	 Catch:{ all -> 0x01ce }
		  r3 = 0;	 Catch:{ all -> 0x01ce }
		  r2.a = r3;	 Catch:{ all -> 0x01ce }
		  r3 = new com.snap.mushroom.MainActivity$d;	 Catch:{ all -> 0x01ce }
		  r3.<init>(r2, r8, r9);	 Catch:{ all -> 0x01ce }
		  r3 = (defpackage.akbk) r3;	 Catch:{ all -> 0x01ce }
		  defpackage.gvr.a.a(r3);	 Catch:{ all -> 0x01ce }
		  r9 = r2.a;	 Catch:{ all -> 0x01ce }
		  if (r9 == 0) goto L_0x005d;	 Catch:{ all -> 0x01ce }
		  r8.finish();	 Catch:{ all -> 0x01ce }
		  r9 = defpackage.ablx.a();
		  r0 = r0.a();
		  r9.b(r0);
		  return;
		  r9 = r8.j;	 Catch:{ all -> 0x01ce }
		  r2 = "applicationComponent";
		  if (r9 != 0) goto L_0x0066;
		  defpackage.akcr.a(r2);	 Catch:{ all -> 0x01ce }
		  r9 = r9.loginRedirector();	 Catch:{ all -> 0x01ce }
		  r3 = r8;	 Catch:{ all -> 0x01ce }
		  r3 = (android.app.Activity) r3;	 Catch:{ all -> 0x01ce }
		  r4 = r8.n;	 Catch:{ all -> 0x01ce }
		  r5 = "activity";	 Catch:{ all -> 0x01ce }
		  defpackage.akcr.b(r3, r5);	 Catch:{ all -> 0x01ce }
		  r5 = "onDestroyDisposable";	 Catch:{ all -> 0x01ce }
		  defpackage.akcr.b(r4, r5);	 Catch:{ all -> 0x01ce }
		  r5 = r9.a;	 Catch:{ all -> 0x01ce }
		  r5 = r5.c();	 Catch:{ all -> 0x01ce }
		  r6 = defpackage.iqj.a(r5);	 Catch:{ all -> 0x01ce }
		  if (r6 == 0) goto L_0x0096;	 Catch:{ all -> 0x01ce }
		  r1 = new rsl$a;	 Catch:{ all -> 0x01ce }
		  r1.<init>(r9);	 Catch:{ all -> 0x01ce }
		  r1 = (defpackage.ajev) r1;	 Catch:{ all -> 0x01ce }
		  r9 = defpackage.ajek.a(r1);	 Catch:{ all -> 0x01ce }
		  r4.a(r9);	 Catch:{ all -> 0x01ce }
		  r1 = r5.a;	 Catch:{ all -> 0x01ce }
		  goto L_0x010a;	 Catch:{ all -> 0x01ce }
		  r9 = r3.getIntent();	 Catch:{ all -> 0x01ce }
		  r4 = "null cannot be cast to non-null type android.content.Intent";
		  if (r9 == 0) goto L_0x00b1;
		  r9 = r3.getIntent();	 Catch:{ all -> 0x01ce }
		  r9 = r9.clone();	 Catch:{ all -> 0x01ce }
		  if (r9 == 0) goto L_0x00ab;	 Catch:{ all -> 0x01ce }
		  r9 = (android.content.Intent) r9;	 Catch:{ all -> 0x01ce }
		  goto L_0x00bb;	 Catch:{ all -> 0x01ce }
		  r9 = new ajxt;	 Catch:{ all -> 0x01ce }
		  r9.<init>(r4);	 Catch:{ all -> 0x01ce }
		  throw r9;	 Catch:{ all -> 0x01ce }
		  r9 = new android.content.Intent;	 Catch:{ all -> 0x01ce }
		  r5 = r3;	 Catch:{ all -> 0x01ce }
		  r5 = (android.content.Context) r5;	 Catch:{ all -> 0x01ce }
		  r6 = com.snap.identity.loginsignup.ui.LoginSignupActivity.class;	 Catch:{ all -> 0x01ce }
		  r9.<init>(r5, r6);	 Catch:{ all -> 0x01ce }
		  r5 = r3.getIntent();	 Catch:{ all -> 0x01ce }
		  if (r5 == 0) goto L_0x00d4;	 Catch:{ all -> 0x01ce }
		  r5 = r3.getIntent();	 Catch:{ all -> 0x01ce }
		  r5 = r5.clone();	 Catch:{ all -> 0x01ce }
		  if (r5 == 0) goto L_0x00ce;	 Catch:{ all -> 0x01ce }
		  r5 = (android.content.Intent) r5;	 Catch:{ all -> 0x01ce }
		  goto L_0x00d9;	 Catch:{ all -> 0x01ce }
		  r9 = new ajxt;	 Catch:{ all -> 0x01ce }
		  r9.<init>(r4);	 Catch:{ all -> 0x01ce }
		  throw r9;	 Catch:{ all -> 0x01ce }
		  r5 = new android.content.Intent;	 Catch:{ all -> 0x01ce }
		  r5.<init>();	 Catch:{ all -> 0x01ce }
		  r4 = r3.getCallingPackage();	 Catch:{ all -> 0x01ce }
		  r6 = r4;	 Catch:{ all -> 0x01ce }
		  r6 = (java.lang.CharSequence) r6;	 Catch:{ all -> 0x01ce }
		  r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ all -> 0x01ce }
		  if (r6 != 0) goto L_0x00eb;	 Catch:{ all -> 0x01ce }
		  r6 = "ck_lite_calling_package";	 Catch:{ all -> 0x01ce }
		  r5.putExtra(r6, r4);	 Catch:{ all -> 0x01ce }
		  r4 = new android.content.ComponentName;	 Catch:{ all -> 0x01ce }
		  r6 = r3;	 Catch:{ all -> 0x01ce }
		  r6 = (android.content.Context) r6;	 Catch:{ all -> 0x01ce }
		  r7 = com.snap.identity.loginsignup.ui.LoginSignupActivity.class;	 Catch:{ all -> 0x01ce }
		  r4.<init>(r6, r7);	 Catch:{ all -> 0x01ce }
		  r9.setComponent(r4);	 Catch:{ all -> 0x01ce }
		  r4 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;	 Catch:{ all -> 0x01ce }
		  r9.addFlags(r4);	 Catch:{ all -> 0x01ce }
		  r4 = "com.snap.core.api.DEFERRED_INTENT_EXTRA_KEY";	 Catch:{ all -> 0x01ce }
		  r5 = (android.os.Parcelable) r5;	 Catch:{ all -> 0x01ce }
		  r9.putExtra(r4, r5);	 Catch:{ all -> 0x01ce }
		  r3.startActivity(r9);	 Catch:{ all -> 0x01ce }
		  r3.finish();	 Catch:{ all -> 0x01ce }
		  if (r1 != 0) goto L_0x010e;	 Catch:{ all -> 0x01ce }
		  goto L_0x0051;	 Catch:{ all -> 0x01ce }
		  r9 = 2131951887; // 0x7f13010f float:1.9540201E38 double:1.053324186E-314;	 Catch:{ all -> 0x01ce }
		  r8.setTheme(r9);	 Catch:{ all -> 0x01ce }
		  r9 = 2131558983; // 0x7f0d0247 float:1.8743297E38 double:1.0531300656E-314;	 Catch:{ all -> 0x01ce }
		  r8.setContentView(r9);	 Catch:{ all -> 0x01ce }
		  r9 = r8.j;	 Catch:{ all -> 0x0180 }
		  if (r9 != 0) goto L_0x0121;	 Catch:{ all -> 0x0180 }
		  defpackage.akcr.a(r2);	 Catch:{ all -> 0x0180 }
		  r9 = r9.mainActivityPreInjector();	 Catch:{ all -> 0x0180 }
		  r1 = r8;	 Catch:{ all -> 0x0180 }
		  r1 = (android.app.Activity) r1;	 Catch:{ all -> 0x0180 }
		  r9 = r9.inceptionTask(r1);	 Catch:{ all -> 0x0180 }
		  r1 = com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY;	 Catch:{ all -> 0x0180 }
		  r3 = r8.C;	 Catch:{ all -> 0x0180 }
		  r4 = "defaultName";	 Catch:{ all -> 0x0180 }
		  defpackage.akcr.a(r3, r4);	 Catch:{ all -> 0x0180 }
		  r8.a(r9, r1, r3);	 Catch:{ all -> 0x0180 }
		  r9 = r8.m;	 Catch:{ all -> 0x01ce }
		  if (r9 != 0) goto L_0x0177;	 Catch:{ all -> 0x01ce }
		  r9 = defpackage.abmc.MAIN_ACTIVITY_INJECT;	 Catch:{ all -> 0x01ce }
		  r9 = (defpackage.abln.e) r9;	 Catch:{ all -> 0x01ce }
		  r9 = defpackage.abll.a(r9);	 Catch:{ all -> 0x01ce }
		  r1 = r8.j;	 Catch:{ all -> 0x0175 }
		  if (r1 != 0) goto L_0x014b;	 Catch:{ all -> 0x0175 }
		  defpackage.akcr.a(r2);	 Catch:{ all -> 0x0175 }
		  r1 = r1.mainActivityInjector();	 Catch:{ all -> 0x0175 }
		  r2 = new com.snap.mushroom.MainActivity$b;	 Catch:{ all -> 0x0175 }
		  r2.<init>(r8);	 Catch:{ all -> 0x0175 }
		  r2 = (defpackage.ajfc) r2;	 Catch:{ all -> 0x0175 }
		  r1 = r1.f(r2);	 Catch:{ all -> 0x0175 }
		  r1 = r1.c();	 Catch:{ all -> 0x0175 }
		  r2 = r8;	 Catch:{ all -> 0x0175 }
		  r2 = (com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity) r2;	 Catch:{ all -> 0x0175 }
		  r3 = com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b.ON_DESTROY;	 Catch:{ all -> 0x0175 }
		  com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.a(r8, r1, r2, r3);	 Catch:{ all -> 0x0175 }
		  r1 = defpackage.ablx.a();	 Catch:{ all -> 0x01ce }
		  r9 = r9.a();	 Catch:{ all -> 0x01ce }
		  r1.b(r9);	 Catch:{ all -> 0x01ce }
		  r9 = 1;	 Catch:{ all -> 0x01ce }
		  r8.m = r9;	 Catch:{ all -> 0x01ce }
		  goto L_0x0177;	 Catch:{ all -> 0x01ce }
		  r9 = move-exception;	 Catch:{ all -> 0x01ce }
		  throw r9;	 Catch:{ all -> 0x01ce }
		  r9 = r8.i;	 Catch:{ all -> 0x01ce }
		  if (r9 == 0) goto L_0x0051;	 Catch:{ all -> 0x01ce }
		  r9.a();	 Catch:{ all -> 0x01ce }
		  goto L_0x0051;	 Catch:{ all -> 0x01ce }
		  r9 = move-exception;	 Catch:{ all -> 0x01ce }
		  throw r9;	 Catch:{ all -> 0x01ce }
		  r9 = new ajxt;	 Catch:{ Exception -> 0x0192 }
		  r2 = "null cannot be cast to non-null type com.snap.mushroom.base.HasEarlyInitComponent";	 Catch:{ Exception -> 0x0192 }
		  r9.<init>(r2);	 Catch:{ Exception -> 0x0192 }
		  throw r9;	 Catch:{ Exception -> 0x0192 }
		  r9 = new ajxt;	 Catch:{ Exception -> 0x0192 }
		  r2 = "null cannot be cast to non-null type com.facebook.buck.android.support.exopackage.ExopackageApplication<*>";	 Catch:{ Exception -> 0x0192 }
		  r9.<init>(r2);	 Catch:{ Exception -> 0x0192 }
		  throw r9;	 Catch:{ Exception -> 0x0192 }
		  r9 = move-exception;
		  r2 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x01ce }
		  r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ce }
		  r4 = "Failed to get app component from parent. Intent action: ";	 Catch:{ all -> 0x01ce }
		  r3.<init>(r4);	 Catch:{ all -> 0x01ce }
		  r4 = r8.getIntent();	 Catch:{ all -> 0x01ce }
		  if (r4 == 0) goto L_0x01a7;	 Catch:{ all -> 0x01ce }
		  r4 = r4.getAction();	 Catch:{ all -> 0x01ce }
		  goto L_0x01a8;	 Catch:{ all -> 0x01ce }
		  r4 = r1;	 Catch:{ all -> 0x01ce }
		  r3.append(r4);	 Catch:{ all -> 0x01ce }
		  r4 = ", categories: ";	 Catch:{ all -> 0x01ce }
		  r3.append(r4);	 Catch:{ all -> 0x01ce }
		  r4 = r8.getIntent();	 Catch:{ all -> 0x01ce }
		  if (r4 == 0) goto L_0x01ba;	 Catch:{ all -> 0x01ce }
		  r1 = r4.getCategories();	 Catch:{ all -> 0x01ce }
		  r3.append(r1);	 Catch:{ all -> 0x01ce }
		  r1 = 46;	 Catch:{ all -> 0x01ce }
		  r3.append(r1);	 Catch:{ all -> 0x01ce }
		  r1 = r3.toString();	 Catch:{ all -> 0x01ce }
		  r9 = (java.lang.Throwable) r9;	 Catch:{ all -> 0x01ce }
		  r2.<init>(r1, r9);	 Catch:{ all -> 0x01ce }
		  r2 = (java.lang.Throwable) r2;	 Catch:{ all -> 0x01ce }
		  throw r2;	 Catch:{ all -> 0x01ce }
		  r9 = move-exception;
		  throw r9;	 Catch:{ all -> 0x01d0 }
		  r9 = move-exception;
		  r1 = defpackage.ablx.a();
		  r0 = r0.a();
		  r1.b(r0);
		  throw r9;
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: com.snap.mushroom.MainActivity.onCreate(android.os.Bundle):void");
	}

	public final void onDestroy() {
		long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
		super.onDestroy();
		this.n.dispose();
		rso rso = this.i;
		if (rso != null) {
			aipn aipn = rso.i;
			if (aipn == null) {
				akcr.a("globalNavTrackerLazy");
			}
			zlb zlb = (zlb) aipn.get();
			if (zlb.c != null) {
				achb achb = zlb.c;
				if (achb != null) {
					zlc zlc = zlb.b;
					if (zlc == null) {
						akcr.a("navSubscriber");
					}
					achb.b((achk) zlc);
				} else {
					throw new IllegalStateException("Required value was null.".toString());
				}
			}
			zlb.d.dispose();
			tmp tmp = rso.x;
			if (tmp == null) {
				akcr.a("permissionsPresenter");
			}
			tmp.b.dispose();
			ipt ipt = rso.g;
			if (ipt == null) {
				akcr.a("hovaController");
			}
			ipt.a();
			ajei ajei = rso.o;
			if (ajei == null) {
				akcr.a("disposable");
			}
			ajei.dispose();
		}
		this.i = null;
		ablx.a().a((h) abmd.USER_LEFT_APP, elapsedRealtimeNanos);
	}

	/* JADX WARNING: Missing block: B:8:0x001e, code skipped:
	   if (r0.onKeyDown(r3, r4) == false) goto L_0x0020;
	*/
	public final boolean onKeyDown(int r3, android.view.KeyEvent r4) {
		/*
		  r2 = this;
		  r0 = "event";
		  defpackage.akcr.b(r4, r0);
		  r1 = r2.i;
		  if (r1 == 0) goto L_0x0020;
		  L_0x0009:
		  if (r1 != 0) goto L_0x000e;
		  L_0x000b:
		  defpackage.akcr.a();
		  L_0x000e:
		  defpackage.akcr.b(r4, r0);
		  r0 = r1.y;
		  if (r0 != 0) goto L_0x001a;
		  L_0x0015:
		  r1 = "keyEventDispatcher";
		  defpackage.akcr.a(r1);
		  L_0x001a:
		  r0 = r0.onKeyDown(r3, r4);
		  if (r0 != 0) goto L_0x0026;
		  L_0x0020:
		  r3 = super.onKeyDown(r3, r4);
		  if (r3 == 0) goto L_0x0028;
		  L_0x0026:
		  r3 = 1;
		  return r3;
		  L_0x0028:
		  r3 = 0;
		  return r3;
		*/
		throw new UnsupportedOperationException("Method not decompiled: com.snap.mushroom.MainActivity.onKeyDown(int, android.view.KeyEvent):boolean");
	}

	/* JADX WARNING: Missing block: B:8:0x001e, code skipped:
	   if (r0.onKeyLongPress(r3, r4) == false) goto L_0x0020;
	*/
	public final boolean onKeyLongPress(int r3, android.view.KeyEvent r4) {
		/*
		  r2 = this;
		  r0 = "event";
		  defpackage.akcr.b(r4, r0);
		  r1 = r2.i;
		  if (r1 == 0) goto L_0x0020;
		  L_0x0009:
		  if (r1 != 0) goto L_0x000e;
		  L_0x000b:
		  defpackage.akcr.a();
		  L_0x000e:
		  defpackage.akcr.b(r4, r0);
		  r0 = r1.y;
		  if (r0 != 0) goto L_0x001a;
		  L_0x0015:
		  r1 = "keyEventDispatcher";
		  defpackage.akcr.a(r1);
		  L_0x001a:
		  r0 = r0.onKeyLongPress(r3, r4);
		  if (r0 != 0) goto L_0x0026;
		  L_0x0020:
		  r3 = super.onKeyLongPress(r3, r4);
		  if (r3 == 0) goto L_0x0028;
		  L_0x0026:
		  r3 = 1;
		  return r3;
		  L_0x0028:
		  r3 = 0;
		  return r3;
		*/
		throw new UnsupportedOperationException("Method not decompiled: com.snap.mushroom.MainActivity.onKeyLongPress(int, android.view.KeyEvent):boolean");
	}

	/* JADX WARNING: Missing block: B:8:0x001e, code skipped:
	   if (r0.onKeyMultiple(r3, r4, r5) == false) goto L_0x0020;
	*/
	public final boolean onKeyMultiple(int r3, int r4, android.view.KeyEvent r5) {
		/*
		  r2 = this;
		  r0 = "event";
		  defpackage.akcr.b(r5, r0);
		  r1 = r2.i;
		  if (r1 == 0) goto L_0x0020;
		  L_0x0009:
		  if (r1 != 0) goto L_0x000e;
		  L_0x000b:
		  defpackage.akcr.a();
		  L_0x000e:
		  defpackage.akcr.b(r5, r0);
		  r0 = r1.y;
		  if (r0 != 0) goto L_0x001a;
		  L_0x0015:
		  r1 = "keyEventDispatcher";
		  defpackage.akcr.a(r1);
		  L_0x001a:
		  r0 = r0.onKeyMultiple(r3, r4, r5);
		  if (r0 != 0) goto L_0x0026;
		  L_0x0020:
		  r3 = super.onKeyMultiple(r3, r4, r5);
		  if (r3 == 0) goto L_0x0028;
		  L_0x0026:
		  r3 = 1;
		  return r3;
		  L_0x0028:
		  r3 = 0;
		  return r3;
		*/
		throw new UnsupportedOperationException("Method not decompiled: com.snap.mushroom.MainActivity.onKeyMultiple(int, int, android.view.KeyEvent):boolean");
	}

	/* JADX WARNING: Missing block: B:8:0x001e, code skipped:
	   if (r0.onKeyUp(r3, r4) == false) goto L_0x0020;
	*/
	public final boolean onKeyUp(int r3, android.view.KeyEvent r4) {
		/*
		  r2 = this;
		  r0 = "event";
		  defpackage.akcr.b(r4, r0);
		  r1 = r2.i;
		  if (r1 == 0) goto L_0x0020;
		  L_0x0009:
		  if (r1 != 0) goto L_0x000e;
		  L_0x000b:
		  defpackage.akcr.a();
		  L_0x000e:
		  defpackage.akcr.b(r4, r0);
		  r0 = r1.y;
		  if (r0 != 0) goto L_0x001a;
		  L_0x0015:
		  r1 = "keyEventDispatcher";
		  defpackage.akcr.a(r1);
		  L_0x001a:
		  r0 = r0.onKeyUp(r3, r4);
		  if (r0 != 0) goto L_0x0026;
		  L_0x0020:
		  r3 = super.onKeyUp(r3, r4);
		  if (r3 == 0) goto L_0x0028;
		  L_0x0026:
		  r3 = 1;
		  return r3;
		  L_0x0028:
		  r3 = 0;
		  return r3;
		*/
		throw new UnsupportedOperationException("Method not decompiled: com.snap.mushroom.MainActivity.onKeyUp(int, android.view.KeyEvent):boolean");
	}

	public final void onNewIntent(Intent intent) {
		String str = "intent";
		akcr.b(intent, str);
		abmc abmc = abmc.MAIN_ACTIVITY_ON_NEW_INTENT;
		String str2 = null;
		abll a = this.k ? abll.a(abmc) : ablx.a().a(ably.FROM_NEW_INTENT, abmc, null);
		super.onNewIntent(intent);
		this.l = true;
		rso rso = this.i;
		if (rso != null) {
			akcr.b(intent, str);
			Activity activity = rso.a;
			if (activity == null) {
				akcr.a(Event.ACTIVITY);
			}
			activity.setIntent(intent);
			rso.P = true;
			aipn aipn = rso.w;
			if (aipn == null) {
				akcr.a("notificationAnalyticsReporter");
			}
			rsm rsm = (rsm) aipn.get();
			boolean z = false;
			if (intent != null) {
				z = intent.getBooleanExtra("fromServerNotification", false);
			}
			if (intent != null) {
				str2 = intent.getStringExtra("type");
			}
			((qxa) rsm.a.get()).a(z, str2);
		}
		ablx a2 = ablx.a();
		if (a == null) {
			akcr.a();
		}
		a2.b(a.a());
	}

	public final void onPause() {
		long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
		super.onPause();
		rso rso = this.i;
		if (rso != null) {
			rso.L = false;
			ajwy ajwy = rso.G;
			if (ajwy == null) {
				akcr.a("deckAppStateManagementConfiguration");
			}
			if (((fxh) ajwy.get()).a()) {
				achb achb = rso.d;
				if (achb == null) {
					akcr.a("navigationHost");
				}
				abmr.a();
				aciw aciw = achb.a;
				if (aciw == null) {
					akcr.a("pageManager");
				}
				aciw.a(false);
			}
			ablv ablv = (ablv) rso.S.get();
			if (ablv != null) {
				ablv.a();
			}
			rso.O = SystemClock.elapsedRealtime();
			aipn aipn = rso.u;
			if (aipn == null) {
				akcr.a("currentLocationManager");
			}
			((nbl) aipn.get()).d();
		}
		ablx.a().a((h) abmd.USER_LEFT_APP, elapsedRealtimeNanos);
	}

	/* Access modifiers changed, original: protected|final */
	public final void onPostCreate(Bundle bundle) {
		abll a = abll.a(abmc.MAIN_ACTIVITY_ON_POST_CREATE);
		super.onPostCreate(bundle);
		rso rso = this.i;
		if (rso != null) {
			String str = "activity.intent";
			String str2 = Event.ACTIVITY;
			if (bundle != null) {
				Activity activity = rso.a;
				if (activity == null) {
					akcr.a(str2);
				}
				Object intent = activity.getIntent();
				akcr.a(intent, str);
				defpackage.gvl.a.d(intent);
			}
			zlh zlh = rso.e;
			if (zlh == null) {
				akcr.a("pageReadyController");
			}
			zlh.d.a((achk) zlh);
			zjt zjt = rso.f;
			if (zjt == null) {
				akcr.a("navigationBreadcrumbReporter");
			}
			zjt.c();
			zlj zlj = rso.m;
			if (zlj == null) {
				akcr.a("windowConfigurationObserver");
			}
			zlj.c.a((achk) zlj);
			achb achb = rso.d;
			if (achb == null) {
				akcr.a("navigationHost");
			}
			DeckView deckView = rso.N;
			if (deckView == null) {
				akcr.a();
			}
			achb.a(deckView);
			Runnable hVar = new rso.h(rso);
			Activity activity2 = rso.a;
			if (activity2 == null) {
				akcr.a(str2);
			}
			Object intent2 = activity2.getIntent();
			akcr.a(intent2, str);
			if (defpackage.gvl.a.c(intent2)) {
				hVar.run();
			} else {
				rso.d();
				rso.T = new WeakReference(ablv.a(new f(hVar)));
				ajei ajei = rso.o;
				if (ajei == null) {
					akcr.a("disposable");
				}
				ajei.a(ajek.a((ajev) new g(rso)));
			}
		}
		ablx.a().b(a.a());
	}

	public final void onPostResume() {
		abll a = abll.a(abmc.MAIN_ACTIVITY_ON_POST_RESUME);
		super.onPostResume();
		ablx.a().b(a.a());
	}

	public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
		String str = "permissions";
		akcr.b(strArr, str);
		String str2 = "grantResults";
		akcr.b(iArr, str2);
		super.onRequestPermissionsResult(i, strArr, iArr);
		rso rso = this.i;
		if (rso != null) {
			akcr.b(strArr, str);
			akcr.b(iArr, str2);
			aipn aipn = rso.k;
			if (aipn == null) {
				akcr.a("permissionHelper");
			}
			ifs ifs = (ifs) aipn.get();
			Activity activity = rso.a;
			if (activity == null) {
				akcr.a(Event.ACTIVITY);
			}
			ifs.a(ifx.a(activity, i, strArr, iArr));
		}
	}

	/* Access modifiers changed, original: protected|final */
	public final void onRestart() {
		abmc abmc = abmc.MAIN_ACTIVITY_RESTART;
		abll a = this.l ? abll.a(abmc) : ablx.a().a(ably.FROM_RESTART, abmc, null);
		super.onRestart();
		ablx a2 = ablx.a();
		if (a == null) {
			akcr.a();
		}
		a2.b(a.a());
	}

	/* Access modifiers changed, original: protected|final */
	public final void onRestoreInstanceState(Bundle bundle) {
		super.onRestoreInstanceState(bundle);
		rso rso = this.i;
		if (rso != null && bundle != null) {
			aipn aipn = rso.E;
			if (aipn == null) {
				akcr.a("savedInstanceHandlers");
			}
			Object obj = aipn.get();
			akcr.a(obj, "savedInstanceHandlers.get()");
			for (igx b : (Iterable) obj) {
				b.b(bundle);
			}
		}
	}

	public final void onResume() {
		abll a = abll.a(abmc.MAIN_ACTIVITY_ON_RESUME);
		super.onResume();
		this.k = false;
		this.l = false;
		rso rso = this.i;
		if (rso != null) {
			ajwy ajwy = rso.A;
			if (ajwy == null) {
				akcr.a("startupContext");
			}
			((ablp) ajwy.get()).a(SystemClock.elapsedRealtimeNanos());
			rso.L = true;
			rso.P = false;
			rso.Q = false;
			if (rso.R) {
				rso.c();
			}
		}
		ablx.a().b(a.a());
	}

	public final void onSaveInstanceState(Bundle bundle) {
		super.onSaveInstanceState(bundle);
		rso rso = this.i;
		if (rso != null) {
			if (bundle == null) {
				akcr.a();
			}
			akcr.b(bundle, "savedInstanceState");
			bundle.putParcelable("android:support:fragments", null);
			aipn aipn = rso.E;
			if (aipn == null) {
				akcr.a("savedInstanceHandlers");
			}
			Object obj = aipn.get();
			akcr.a(obj, "savedInstanceHandlers.get()");
			for (igx a : (Iterable) obj) {
				a.a(bundle);
			}
		}
	}

	public final void onStart() {
		abll a = abll.a(abmc.MAIN_ACTIVITY_ON_START);
		super.onStart();
		rso rso = this.i;
		if (rso != null) {
			tmp tmp = rso.x;
			if (tmp == null) {
				akcr.a("permissionsPresenter");
			}
			Context context = tmp.d;
			if (context != null) {
				Activity activity = (Activity) context;
				if (tmp.a().b()) {
					if (!activity.isFinishing()) {
						if (tmp.a().d() && tmp.a().j()) {
							tmp.c();
						} else if (tmp.c == null) {
							ViewStub viewStub = (ViewStub) activity.findViewById(R.id.critical_permission_prompt_stub);
							if (viewStub != null) {
								viewStub.setLayoutResource(R.layout.critical_permission_prompt);
								View inflate = viewStub.inflate();
								if (inflate != null) {
									tmp.a(inflate);
								}
							}
						}
					}
				}
			} else {
				throw new ajxt("null cannot be cast to non-null type android.app.Activity");
			}
		}
		ablx.a().b(a.a());
	}

	public final void onWindowFocusChanged(boolean z) {
		super.onWindowFocusChanged(z);
		rso rso = this.i;
		if (rso != null && !z && rso.M) {
			Activity activity = rso.a;
			if (activity == null) {
				akcr.a(Event.ACTIVITY);
			}
			Object intent = activity.getIntent();
			akcr.a(intent, "activity.intent");
			defpackage.gvl.a.d(intent);
			rso.M = false;
		}
	}
}
