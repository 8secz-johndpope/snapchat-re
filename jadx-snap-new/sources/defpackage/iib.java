package defpackage;

import android.content.Context;
import android.media.CamcorderProfile;

/* renamed from: iib */
// ScreenshotParameterProvider
public final class iib {
	private final Context a;
	private a b;

	/* renamed from: iib$a */
	// ScreenshotParameters
	public static class a {
		public iia a = new iia(0, 0);
		public iia b = new iia(0, 0);
		public int c;
		public int d;
		public float e;
		public float f;
		public int g = -1;
		public int h = -1;
		public int i;
		public int j;
	}

	public iib(Context context) {
		this.a = context;
	}

	private static boolean a(int i) {
		try {
			return CamcorderProfile.hasProfile(i);
		} catch (RuntimeException unused) {
			return false;
		}
	}

	/*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
	    jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:41:0x00d7 in {4, 7, 8, 11, 13, 18, 19, 20, 25, 26, 28, 33, 34, 37, 40} preds:[]
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
	private synchronized defpackage.iib.a d() {
		/*
		  r6 = this;
		  monitor-enter(r6);
		  r0 = new iib$a;	 Catch:{ all -> 0x00d4 }
		  r0.<init>();	 Catch:{ all -> 0x00d4 }
		  r1 = 1;	 Catch:{ all -> 0x00d4 }
		  r2 = defpackage.iib.a(r1);	 Catch:{ all -> 0x00d4 }
		  if (r2 == 0) goto L_0x0012;	 Catch:{ all -> 0x00d4 }
		  r1 = android.media.CamcorderProfile.get(r1);	 Catch:{ all -> 0x00d4 }
		  goto L_0x001b;	 Catch:{ all -> 0x00d4 }
		  r1 = 0;	 Catch:{ all -> 0x00d4 }
		  r2 = defpackage.iib.a(r1);	 Catch:{ all -> 0x00d4 }
		  if (r2 == 0) goto L_0x001a;	 Catch:{ all -> 0x00d4 }
		  goto L_0x000d;	 Catch:{ all -> 0x00d4 }
		  r1 = 0;	 Catch:{ all -> 0x00d4 }
		  r2 = r6.a;	 Catch:{ all -> 0x00d4 }
		  r2 = r2.getResources();	 Catch:{ all -> 0x00d4 }
		  r2 = r2.getDisplayMetrics();	 Catch:{ all -> 0x00d4 }
		  r3 = r2.heightPixels;	 Catch:{ all -> 0x00d4 }
		  r4 = r2.widthPixels;	 Catch:{ all -> 0x00d4 }
		  if (r3 <= r4) goto L_0x0034;	 Catch:{ all -> 0x00d4 }
		  r3 = r2.heightPixels;	 Catch:{ all -> 0x00d4 }
		  r0.i = r3;	 Catch:{ all -> 0x00d4 }
		  r2 = r2.widthPixels;	 Catch:{ all -> 0x00d4 }
		  r0.j = r2;	 Catch:{ all -> 0x00d4 }
		  goto L_0x003b;	 Catch:{ all -> 0x00d4 }
		  r3 = r2.widthPixels;	 Catch:{ all -> 0x00d4 }
		  r0.i = r3;	 Catch:{ all -> 0x00d4 }
		  r2 = r2.heightPixels;	 Catch:{ all -> 0x00d4 }
		  goto L_0x0031;	 Catch:{ all -> 0x00d4 }
		  r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ all -> 0x00d4 }
		  if (r1 == 0) goto L_0x0050;	 Catch:{ all -> 0x00d4 }
		  r2 = r1.videoFrameHeight;	 Catch:{ all -> 0x00d4 }
		  r3 = r1.videoFrameWidth;	 Catch:{ all -> 0x00d4 }
		  if (r2 <= r3) goto L_0x004b;	 Catch:{ all -> 0x00d4 }
		  r2 = r1.videoFrameHeight;	 Catch:{ all -> 0x00d4 }
		  r1 = r1.videoFrameWidth;	 Catch:{ all -> 0x00d4 }
		  goto L_0x0053;	 Catch:{ all -> 0x00d4 }
		  r2 = r1.videoFrameWidth;	 Catch:{ all -> 0x00d4 }
		  r1 = r1.videoFrameHeight;	 Catch:{ all -> 0x00d4 }
		  goto L_0x0053;	 Catch:{ all -> 0x00d4 }
		  r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;	 Catch:{ all -> 0x00d4 }
		  r3 = new iia;	 Catch:{ all -> 0x00d4 }
		  r4 = r0.j;	 Catch:{ all -> 0x00d4 }
		  r5 = r0.i;	 Catch:{ all -> 0x00d4 }
		  r3.<init>(r4, r5);	 Catch:{ all -> 0x00d4 }
		  r0.a = r3;	 Catch:{ all -> 0x00d4 }
		  r3 = r0.i;	 Catch:{ all -> 0x00d4 }
		  r2 = java.lang.Math.min(r3, r2);	 Catch:{ all -> 0x00d4 }
		  r0.c = r2;	 Catch:{ all -> 0x00d4 }
		  r2 = r0.j;	 Catch:{ all -> 0x00d4 }
		  r1 = java.lang.Math.min(r2, r1);	 Catch:{ all -> 0x00d4 }
		  r0.d = r1;	 Catch:{ all -> 0x00d4 }
		  r1 = r6.a;	 Catch:{ all -> 0x00d4 }
		  r1 = r1.getResources();	 Catch:{ all -> 0x00d4 }
		  r1 = r1.getDisplayMetrics();	 Catch:{ all -> 0x00d4 }
		  r2 = r6.a;	 Catch:{ all -> 0x00d4 }
		  r3 = "window";	 Catch:{ all -> 0x00d4 }
		  r2 = r2.getSystemService(r3);	 Catch:{ all -> 0x00d4 }
		  r2 = (android.view.WindowManager) r2;	 Catch:{ all -> 0x00d4 }
		  r2 = r2.getDefaultDisplay();	 Catch:{ all -> 0x00d4 }
		  r3 = new android.graphics.Point;	 Catch:{ Exception -> 0x00a4 }
		  r3.<init>();	 Catch:{ Exception -> 0x00a4 }
		  r2.getRealSize(r3);	 Catch:{ Exception -> 0x00a4 }
		  r2 = r3.x;	 Catch:{ Exception -> 0x00a4 }
		  r4 = r3.y;	 Catch:{ Exception -> 0x00a4 }
		  if (r2 >= r4) goto L_0x009d;	 Catch:{ Exception -> 0x00a4 }
		  r2 = r3.x;	 Catch:{ Exception -> 0x00a4 }
		  r0.g = r2;	 Catch:{ Exception -> 0x00a4 }
		  r2 = r3.y;	 Catch:{ Exception -> 0x00a4 }
		  r0.h = r2;	 Catch:{ Exception -> 0x00a4 }
		  goto L_0x00a4;	 Catch:{ Exception -> 0x00a4 }
		  r2 = r3.y;	 Catch:{ Exception -> 0x00a4 }
		  r0.g = r2;	 Catch:{ Exception -> 0x00a4 }
		  r2 = r3.x;	 Catch:{ Exception -> 0x00a4 }
		  goto L_0x009a;
		  L_0x00a4:
		  r2 = r0.h;	 Catch:{ all -> 0x00d4 }
		  r3 = -1;	 Catch:{ all -> 0x00d4 }
		  if (r2 == r3) goto L_0x00ad;	 Catch:{ all -> 0x00d4 }
		  r2 = r0.g;	 Catch:{ all -> 0x00d4 }
		  if (r2 != r3) goto L_0x00b5;	 Catch:{ all -> 0x00d4 }
		  r2 = r0.i;	 Catch:{ all -> 0x00d4 }
		  r0.h = r2;	 Catch:{ all -> 0x00d4 }
		  r2 = r0.j;	 Catch:{ all -> 0x00d4 }
		  r0.g = r2;	 Catch:{ all -> 0x00d4 }
		  r2 = r0.g;	 Catch:{ all -> 0x00d4 }
		  r2 = (float) r2;	 Catch:{ all -> 0x00d4 }
		  r3 = r1.xdpi;	 Catch:{ all -> 0x00d4 }
		  r2 = r2 / r3;	 Catch:{ all -> 0x00d4 }
		  r0.e = r2;	 Catch:{ all -> 0x00d4 }
		  r2 = r0.h;	 Catch:{ all -> 0x00d4 }
		  r2 = (float) r2;	 Catch:{ all -> 0x00d4 }
		  r1 = r1.ydpi;	 Catch:{ all -> 0x00d4 }
		  r2 = r2 / r1;	 Catch:{ all -> 0x00d4 }
		  r0.f = r2;	 Catch:{ all -> 0x00d4 }
		  r1 = new iia;	 Catch:{ all -> 0x00d4 }
		  r2 = r0.g;	 Catch:{ all -> 0x00d4 }
		  r3 = r0.h;	 Catch:{ all -> 0x00d4 }
		  r1.<init>(r2, r3);	 Catch:{ all -> 0x00d4 }
		  r0.b = r1;	 Catch:{ all -> 0x00d4 }
		  r6.b = r0;	 Catch:{ all -> 0x00d4 }
		  monitor-exit(r6);
		  return r0;
		  r0 = move-exception;
		  monitor-exit(r6);
		  throw r0;
		  return;
		*/
		throw new UnsupportedOperationException("Method not decompiled: defpackage.iib.d():iib$a");
	}

	private /* synthetic */ a e() {
		abmr.a("ScreenParameterProvider::initialize cannot be called on the main thread");
		return d();
	}

	@Deprecated
	public final a a() {
		a aVar = this.b;
		return aVar != null ? aVar : d();
	}

	public final ajdx<a> b() {
		Object obj = this.b;
		return obj != null ? ajdx.b(obj) : ajdx.c(new -$$Lambda$iib$d6hY7a_s7Pwo2mkNxXRJpqmyBrI(this));
	}

	public final a c() {
		abmr.a("ScreenParameterProvider::initialize cannot be called on the main thread");
		a aVar = this.b;
		return aVar != null ? aVar : d();
	}
}
