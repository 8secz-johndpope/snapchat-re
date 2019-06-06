package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: zfw */
// Schedulers
public class zfw {
	public final ajxe a = ajxh.a(j.a);
	final idd b;
	private final ajxe c = ajxh.a(new b(this));
	private final ajxe d = ajxh.a(new c(this));
	private final ajxe e = ajxh.a(new q(this));
	private final ajxe f = ajxh.a(new p(this));
	private final ajxe g = ajxh.a(new h(this));
	private final ajxe h = ajxh.a(new i(this));
	private final ajxe i = ajxh.a(new n(this));
	private final ajxe j = ajxh.a(new s(this));
	private final ajxe k = ajxh.a(new e(this));
	private final ajxe l = ajxh.a(new g(this));
	private final ajxe m = ajxh.a(k.a);
	private final ajxe n = ajxh.a(new l(this));
	private final ajxe o = ajxh.a(new d(this));
	private final ajxe p = ajxh.a(new m(this));
	private final ajxe q = ajxh.a(new f(this));
	private final ajxe r = ajxh.a(new o(this));
	private final ajxe s = ajxh.a(new r(this));

	/* renamed from: zfw$k */
	static final class k extends akcs implements akbk<Handler> {
		public static final k a = new k();

		k() {
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new Handler(Looper.getMainLooper());
		}
	}

	/* renamed from: zfw$j */
	static final class j extends akcs implements akbk<Handler> {
		public static final j a = new j();

		j() {
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return (Handler) zgd.m.get();
		}
	}

	/* renamed from: zfw$a */
	public static final class a {
		private a() {
		}

		public /* synthetic */ a(byte b) {
			this();
		}

		public static ajdw a(ajdw ajdw, int i) {
			akcr.b(ajdw, "scheduler");
			return zfx.a(ajdw, i);
		}

		public static zfg a(Handler handler, idd idd) {
			akcr.b(handler, "handler");
			akcr.b(idd, "callsite");
			return zfx.a(handler, idd);
		}
	}

	/* renamed from: zfw$b */
	static final class b extends akcs implements akbk<zfh> {
		private /* synthetic */ zfw a;

		b(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfh(this.a.b, (ScheduledExecutorService) zgd.f.get(), zgd.d);
		}
	}

	/* renamed from: zfw$c */
	static final class c extends akcs implements akbk<zfi> {
		private /* synthetic */ zfw a;

		c(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfi(this.a.a(), this.a.b);
		}
	}

	/* renamed from: zfw$q */
	static final class q extends akcs implements akbk<zfk> {
		private /* synthetic */ zfw a;

		q(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfk(this.a.b, (ScheduledExecutorService) zgd.g.get(), zgd.d);
		}
	}

	/* renamed from: zfw$p */
	static final class p extends akcs implements akbk<zfi> {
		private /* synthetic */ zfw a;

		p(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfi(this.a.c(), this.a.b);
		}
	}

	/* renamed from: zfw$h */
	static final class h extends akcs implements akbk<zfh> {
		private /* synthetic */ zfw a;

		h(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfh(this.a.b, (ScheduledExecutorService) zgd.h.get(), zgd.d);
		}
	}

	/* renamed from: zfw$i */
	static final class i extends akcs implements akbk<zfi> {
		private /* synthetic */ zfw a;

		i(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfi(this.a.e(), this.a.b);
		}
	}

	/* renamed from: zfw$n */
	static final class n extends akcs implements akbk<zfi> {
		private /* synthetic */ zfw a;

		n(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfi((Executor) zgd.e.get(), this.a.b);
		}
	}

	/* renamed from: zfw$s */
	static final class s extends akcs implements akbk<zfi> {
		private /* synthetic */ zfw a;

		s(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfi((Executor) zgd.j.get(), this.a.b);
		}
	}

	/* renamed from: zfw$e */
	static final class e extends akcs implements akbk<zfi> {
		private /* synthetic */ zfw a;

		e(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfi((Executor) zgd.k.get(), this.a.b);
		}
	}

	/* renamed from: zfw$g */
	static final class g extends akcs implements akbk<zfi> {
		private /* synthetic */ zfw a;

		g(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return new zfi((Executor) zgd.s.get(), this.a.b);
		}
	}

	/* renamed from: zfw$l */
	static final class l extends akcs implements akbk<zfg> {
		private /* synthetic */ zfw a;

		l(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			return a.a(this.a.k(), this.a.b);
		}
	}

	/* renamed from: zfw$d */
	static final class d extends akcs implements akbk<zfg> {
		private /* synthetic */ zfw a;

		d(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			Object obj = zgd.n.get();
			akcr.a(obj, "SnapScheduling.UNDERLYIN…TABASE_WRITE_THREAD.get()");
			return zfx.a(new Handler(((zfp) obj).a()), this.a.b);
		}
	}

	/* renamed from: zfw$m */
	static final class m extends akcs implements akbk<zfg> {
		private /* synthetic */ zfw a;

		m(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			Object obj = zgd.p.get();
			akcr.a(obj, "SnapScheduling.UNDERLYIN…TABASE_WRITE_THREAD.get()");
			return zfx.a(new Handler(((zfp) obj).a()), this.a.b);
		}
	}

	/* renamed from: zfw$f */
	static final class f extends akcs implements akbk<zfg> {
		private /* synthetic */ zfw a;

		f(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			Object obj = zgd.r.get();
			akcr.a(obj, "SnapScheduling.UNDERLYIN…TABASE_WRITE_THREAD.get()");
			return zfx.a(new Handler(((zfp) obj).a()), this.a.b);
		}
	}

	/* renamed from: zfw$o */
	static final class o extends akcs implements akbk<zfg> {
		private /* synthetic */ zfw a;

		o(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			Object obj = zgd.o.get();
			akcr.a(obj, "SnapScheduling.UNDERLYIN…TABASE_WRITE_THREAD.get()");
			return zfx.a(new Handler(((zfp) obj).a()), this.a.b);
		}
	}

	/* renamed from: zfw$r */
	static final class r extends akcs implements akbk<zfg> {
		private /* synthetic */ zfw a;

		r(zfw zfw) {
			this.a = zfw;
			super(0);
		}

		public final /* synthetic */ Object invoke() {
			Object obj = zgd.q.get();
			akcr.a(obj, "SnapScheduling.UNDERLYIN…TABASE_WRITE_THREAD.get()");
			return zfx.a(new Handler(((zfp) obj).a()), this.a.b);
		}
	}

	static {
		aken[] akenArr = new aken[]{new akdc(akde.a(zfw.class), "computationExecutor", "getComputationExecutor()Lcom/snap/taskexecution/scheduling/AttributedScheduledExecutorService;"), new akdc(akde.a(zfw.class), "computationScheduler", "getComputationScheduler()Lcom/snap/taskexecution/scheduling/AttributedScheduler;"), new akdc(akde.a(zfw.class), "singleThreadComputationExecutor", "getSingleThreadComputationExecutor()Lcom/snap/taskexecution/scheduling/AttributedSerialScheduledExecutorService;"), new akdc(akde.a(zfw.class), "serialThreadComputationScheduler", "getSerialThreadComputationScheduler()Lcom/snap/taskexecution/scheduling/AttributedScheduler;"), new akdc(akde.a(zfw.class), "ioExecutor", "getIoExecutor()Lcom/snap/taskexecution/scheduling/AttributedScheduledExecutorService;"), new akdc(akde.a(zfw.class), "ioScheduler", "getIoScheduler()Lcom/snap/taskexecution/scheduling/AttributedScheduler;"), new akdc(akde.a(zfw.class), "networkScheduler", "getNetworkScheduler()Lcom/snap/taskexecution/scheduling/AttributedScheduler;"), new akdc(akde.a(zfw.class), "userInteractiveScheduler", "getUserInteractiveScheduler()Lcom/snap/taskexecution/scheduling/AttributedScheduler;"), new akdc(akde.a(zfw.class), "dbQueryScheduler", "getDbQueryScheduler()Lcom/snap/taskexecution/scheduling/AttributedScheduler;"), new akdc(akde.a(zfw.class), "idleScheduler", "getIdleScheduler()Lcom/snap/taskexecution/scheduling/AttributedScheduler;"), new akdc(akde.a(zfw.class), "mainThreadHandler", "getMainThreadHandler()Landroid/os/Handler;"), new akdc(akde.a(zfw.class), "locationBgThreadHandler", "getLocationBgThreadHandler()Landroid/os/Handler;"), new akdc(akde.a(zfw.class), "mainThreadScheduler", "getMainThreadScheduler()Lcom/snap/taskexecution/scheduling/AttributedHandlerScheduler;"), new akdc(akde.a(zfw.class), "databaseScheduler", "getDatabaseScheduler()Lcom/snap/taskexecution/scheduling/AttributedHandlerScheduler;"), new akdc(akde.a(zfw.class), "memoriesDatabaseScheduler", "getMemoriesDatabaseScheduler()Lcom/snap/taskexecution/scheduling/AttributedHandlerScheduler;"), new akdc(akde.a(zfw.class), "dfDatabaseWriteScheduler", "getDfDatabaseWriteScheduler()Lcom/snap/taskexecution/scheduling/AttributedHandlerScheduler;"), new akdc(akde.a(zfw.class), "platformDatabaseScheduler", "getPlatformDatabaseScheduler()Lcom/snap/taskexecution/scheduling/AttributedHandlerScheduler;"), new akdc(akde.a(zfw.class), "stickersDatabaseScheduler", "getStickersDatabaseScheduler()Lcom/snap/taskexecution/scheduling/AttributedHandlerScheduler;")};
		a aVar = new a();
	}

	public zfw(idd idd) {
		akcr.b(idd, "callsite");
		this.b = idd;
	}

	// getSnapSharedHandler
	public static Handler r() {
		Object obj = zgd.l.get();
		akcr.a(obj, "SnapScheduling.SHARED_HANDLER.get()");
		return (Handler) obj;
	}

	public final zfh a() {
		return (zfh) this.c.b();
	}

	public final zfi b() {
		return (zfi) this.d.b();
	}

	public final zfk c() {
		return (zfk) this.e.b();
	}

	public final zfi d() {
		return (zfi) this.f.b();
	}

	public final zfh e() {
		return (zfh) this.g.b();
	}

	public final zfi f() {
		return (zfi) this.h.b();
	}

	public final zfi g() {
		return (zfi) this.i.b();
	}

	public final zfi h() {
		return (zfi) this.j.b();
	}

	public final zfi i() {
		return (zfi) this.k.b();
	}

	public final zfi j() {
		return (zfi) this.l.b();
	}

	public final Handler k() {
		return (Handler) this.m.b();
	}

	public final zfg l() {
		return (zfg) this.n.b();
	}

	public final zfg m() {
		return (zfg) this.o.b();
	}

	public final zfg n() {
		return (zfg) this.p.b();
	}

	public final zfg o() {
		return (zfg) this.q.b();
	}

	public final zfg p() {
		return (zfg) this.r.b();
	}

	public final zfg q() {
		return (zfg) this.s.b();
	}
}
