package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity;
import defpackage.rpw.a;
import defpackage.rpy.b;
import java.lang.ref.WeakReference;

/* renamed from: rpq */
public final class rpq extends zgi implements abix, a {
    final Handler a;
    final Handler b;
    final rpw c;
    final rpy[] d;
    final rpj e;
    final a f;
    abix.a g;
    abis h;
    boolean i;
    abjj j;
    abjc k;
    abjc l;
    rpy m;
    WeakReference<OnAudioFocusChangeListener> n;
    final ajxe o;
    final rpy.a p;
    final Context q;
    final rpt r;
    final rqb s;
    private final zfg t;
    private final ide u;
    private final gqr v;

    /* renamed from: rpq$j */
    static final class j extends akcq implements akbl<Throwable, ajxw> {
        j(rpq rpq) {
            super(1, rpq);
        }

        public final String getName() {
            return "reportError";
        }

        public final akej getOwner() {
            return akde.a(rpq.class);
        }

        public final String getSignature() {
            return "reportError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            ((rpq) this.receiver).a(th);
            return ajxw.a;
        }
    }

    /* renamed from: rpq$a */
    public static final class a extends BroadcastReceiver {
        private /* synthetic */ rpq a;

        a(rpq rpq) {
            this.a = rpq;
        }

        public final void onReceive(Context context, Intent intent) {
            if (akcr.a(intent != null ? intent.getAction() : null, (Object) "android.intent.action.PHONE_STATE")) {
                String str = "state";
                if ((akcr.a(intent.getStringExtra(str), TelephonyManager.EXTRA_STATE_IDLE) ^ 1) != 0) {
                    this.a.a("broadcastReceiver, state=".concat(String.valueOf(intent.getStringExtra(str))));
                }
            }
        }
    }

    /* renamed from: rpq$d */
    public static final class d implements b {
        private /* synthetic */ rpq a;

        d(rpq rpq) {
            this.a = rpq;
        }

        public final Handler a() {
            return this.a.a;
        }

        public final void a(boolean z) {
            rpw rpw = this.a.c;
            rpw.d = z;
            rpw.a();
        }

        public final Context b() {
            return this.a.q;
        }

        public final void b(boolean z) {
            rpq rpq = this.a;
            if (rpq.j == null) {
                acbm.d().a("MessagingAudioServices");
            }
            abjj abjj = rpq.j;
            if (abjj != null) {
                abjj.c(z);
            }
        }

        public final boolean c() {
            return this.a.c.e;
        }

        public final abmh d() {
            return this.a.r;
        }

        public final rqb e() {
            return this.a.s;
        }

        public final OnAudioFocusChangeListener f() {
            return (OnAudioFocusChangeListener) this.a.n.get();
        }

        public final Handler g() {
            return this.a.b;
        }

        public final void h() {
            rpq rpq = this.a;
            OnAudioFocusChangeListener onAudioFocusChangeListener = (OnAudioFocusChangeListener) rpq.n.get();
            if (onAudioFocusChangeListener != null && rpq.l != abjc.NONE) {
                onAudioFocusChangeListener.onAudioFocusChange(-2);
                if (rpq.l != abjc.NONE) {
                    acbm.d().a().a("MessagingAudioServices");
                    rpq.l = abjc.NONE;
                }
                rpq.a("interruptAVPlayback");
            }
        }

        public final void i() {
            rpq rpq = this.a;
            abmh.a a = rpr.a(rpr.b(rpq.g), rpr.a(rpq.g));
            if (a != null) {
                rpq.r.b(a);
            }
        }
    }

    /* renamed from: rpq$1 */
    static final class 1 extends akcs implements akbl<b, rpy[]> {
        public static final 1 a = new 1();

        1() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "it");
            akcr.b(bVar, "delegate");
            return new rpy[]{new rpu(bVar), new rpv(bVar), new rqe(bVar), new rpl(bVar, true), new rqj(bVar), new rqg(bVar), new rqh(bVar, true), new rph(bVar), new rqf(bVar), new rpk(bVar), new rpm(bVar), new rpn(bVar), new rpo(bVar)};
        }
    }

    /* renamed from: rpq$i */
    static final class i extends akcs implements akbk<ajxw> {
        private /* synthetic */ rpq a;

        i(rpq rpq) {
            this.a = rpq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            rpq rpq = this.a;
            rpy[] rpyArr = rpq.d;
            rpy.a aVar = this.a.p;
            akcr.b(rpyArr, "receiver$0");
            akcr.b(aVar, "state");
            for (rpy rpy : rpyArr) {
                if (rpy.a(aVar)) {
                    break;
                }
            }
            rpy rpy2 = null;
            if (rpy2 == null) {
                rpy2 = (rpy) ajyi.e(rpyArr);
            }
            if (rpq.m != null) {
                if (rpy2 != rpq.m) {
                    rpw rpw = rpq.c;
                    rpw.c = true;
                    rpw.d = false;
                    rpy rpy3 = rpq.m;
                    if (rpy3 != null) {
                        rpy3.i();
                    }
                }
                return ajxw.a;
            }
            rpq.m = rpy2;
            rpy2.h();
            rqb rqb = rpq.s;
            rqb.b = rpy2.b();
            acbm.a d = acbm.d();
            new StringBuilder("BT: voice call state changed: ").append(rqb.b);
            d.a("TalkBluetoothManager");
            rqb.c();
            rpw rpw2 = rpq.c;
            rpw2.c = false;
            rpw2.a();
            return ajxw.a;
        }
    }

    /* renamed from: rpq$h */
    static final class h extends akcs implements akbk<TelephonyManager> {
        private /* synthetic */ rpq a;

        h(rpq rpq) {
            this.a = rpq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.q.getSystemService("phone");
            if (systemService != null) {
                return (TelephonyManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }
    }

    /* renamed from: rpq$2 */
    public static final class 2 implements rqb.a {
        private /* synthetic */ rpq a;

        2(rpq rpq) {
            this.a = rpq;
        }

        public final void a() {
            rpy rpy = this.a.m;
            if (rpy != null) {
                rpy.e();
            }
        }
    }

    /* renamed from: rpq$e */
    public static final class e implements rpy.a {
        private /* synthetic */ rpq a;

        e(rpq rpq) {
            this.a = rpq;
        }

        public final abjc a() {
            return this.a.l;
        }

        public final abjc b() {
            return this.a.k;
        }

        public final boolean c() {
            return rpr.a(this.a.g);
        }

        public final boolean d() {
            return this.a.i;
        }

        public final abix.a e() {
            return this.a.g;
        }

        public final boolean f() {
            return this.a.s.e;
        }

        public final boolean g() {
            return ifs.a().g() && ((TelephonyManager) this.a.o.b()).getCallState() != 0;
        }
    }

    /* renamed from: rpq$c */
    static final class c implements ajev {
        private /* synthetic */ rpq a;

        c(rpq rpq) {
            this.a = rpq;
        }

        public final void run() {
            rpq rpq = this.a;
            try {
                rpq.e.a();
                rpq.a.post(new b(rpq));
                rpq.a(abix.a.NO_CALL, abjc.NONE, true);
                rqb rqb = rpq.s;
                if (rqb.c) {
                    rqb.h.unregisterReceiver(rqb);
                }
                rpq.c.b.dispose();
                rpq.q.unregisterReceiver(rpq.f);
            } catch (Throwable th) {
                rpq.a(th);
            }
        }
    }

    /* renamed from: rpq$b */
    static final class b implements Runnable {
        private /* synthetic */ rpq a;

        b(rpq rpq) {
            this.a = rpq;
        }

        public final void run() {
            rpq rpq = this.a;
            try {
                rpy rpy = rpq.m;
                if (rpy != null) {
                    rpy.i();
                }
            } catch (Throwable th) {
                rpq.a(th);
            }
            rpq = this.a;
            rpq.m = null;
            rpq.j = null;
        }
    }

    /* renamed from: rpq$f */
    static final class f implements Runnable {
        private /* synthetic */ rpq a;
        private /* synthetic */ abix.a b;
        private /* synthetic */ boolean c;
        private /* synthetic */ abjc d;

        f(rpq rpq, abix.a aVar, boolean z, abjc abjc) {
            this.a = rpq;
            this.b = aVar;
            this.c = z;
            this.d = abjc;
        }

        public final void run() {
            rpq rpq;
            acbm.a d;
            abis b = rpr.b(this.b);
            String str = "MessagingAudioServices";
            if (b == null && this.c) {
                rpq = this.a;
                if (rpq.h != null) {
                    rpq.h = null;
                    d = acbm.d();
                    new StringBuilder("Stopping to ring with ringtone: ").append(rpr.b(rpq.g));
                    d.a(str);
                    rpq.r.a();
                }
            }
            if (this.a.g != this.b || this.a.k != this.d) {
                rpq = this.a;
                rpq.k = this.d;
                rpq.g = this.b;
                StringBuilder stringBuilder = new StringBuilder("setCallState: ");
                stringBuilder.append(this.b);
                String str2 = ppy.d;
                stringBuilder.append(str2);
                stringBuilder.append(this.d);
                stringBuilder.append(str2);
                stringBuilder.append(this.c);
                rpq.a(stringBuilder.toString());
                if (!(!this.c || b == null || b == this.a.h)) {
                    rpq = this.a;
                    d = acbm.d();
                    new StringBuilder("Starting to ring with ringtone: ").append(b);
                    d.a(str);
                    rpq.h = b;
                    abmh.a a = rpr.a(b, rpr.a(rpq.g));
                    if (a != null) {
                        rpq.r.b(a);
                    }
                }
            }
        }
    }

    /* renamed from: rpq$g */
    static final class g implements Runnable {
        private /* synthetic */ rpq a;
        private /* synthetic */ abjj b;
        private /* synthetic */ boolean c;
        private /* synthetic */ abjc d;

        g(rpq rpq, abjj abjj, boolean z, abjc abjc) {
            this.a = rpq;
            this.b = abjj;
            this.c = z;
            this.d = abjc;
        }

        public final void run() {
            rpq rpq = this.a;
            rpq.j = this.b;
            if (rpq.i != this.c || this.a.k != this.d) {
                rpq = this.a;
                rpq.i = this.c;
                abjc abjc = this.d;
                rpq.k = abjc;
                rpq.g = abjc == abjc.NONE ? abix.a.NO_CALL : abix.a.IN_CALL_OR_ANSWERED;
                rpq = this.a;
                StringBuilder stringBuilder = new StringBuilder("setCognacState: ");
                stringBuilder.append(this.c);
                stringBuilder.append(ppy.d);
                stringBuilder.append(this.d);
                rpq.a(stringBuilder.toString());
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rpq.class), "telephonyManager", "getTelephonyManager()Landroid/telephony/TelephonyManager;");
    }

    public rpq(Context context, ide ide, rpt rpt, zgb zgb, igf igf, gqr gqr, zgk<ScopedFragmentActivity.b> zgk) {
        Context context2 = context;
        ide ide2 = ide;
        akcr.b(context, "context");
        akcr.b(ide, "feature");
        rpt rpt2 = rpt;
        akcr.b(rpt, "jingleService");
        zgb zgb2 = zgb;
        akcr.b(zgb, "schedulersProvider");
        igf igf2 = igf;
        akcr.b(igf, "proximityService");
        gqr gqr2 = gqr;
        akcr.b(gqr2, "exceptionTracker");
        zgk<ScopedFragmentActivity.b> zgk2 = zgk;
        akcr.b(zgk2, "taskScoper");
        zgb.a(ide, "MessagingAudioServices");
        this(context2, ide2, rpt2, zgb2, igf2, new rqb(context, zfw.r()), gqr2, zgk2, 1.a);
    }

    private rpq(Context context, ide ide, rpt rpt, zgb zgb, igf igf, rqb rqb, gqr gqr, zgk<ScopedFragmentActivity.b> zgk, akbl<? super b, rpy[]> akbl) {
        akcr.b(context, "context");
        akcr.b(ide, "feature");
        akcr.b(rpt, "jingleService");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(igf, "proximityService");
        akcr.b(rqb, "bluetoothManager");
        akcr.b(gqr, "exceptionTracker");
        akcr.b(zgk, "taskScoper");
        akcr.b(akbl, "routingStrategiesCreator");
        super(zgk);
        this.q = context;
        this.u = ide;
        this.r = rpt;
        this.s = rqb;
        this.v = gqr;
        String str = "MessagingAudioServices";
        zgb.a(this.u, str);
        this.a = zfw.r();
        this.t = new zfg(this.a, this.u.callsite(str));
        this.b = zgb.a(this.u, str).k();
        this.c = new rpw(this.t, this.a, igf);
        this.d = (rpy[]) akbl.invoke(new d(this));
        this.e = new rpj("MessagingAudioServices.updateRouting", this.a, new i(this), Integer.valueOf(5), new j(this));
        this.f = new a(this);
        this.g = abix.a.NO_CALL;
        this.k = abjc.NONE;
        this.l = abjc.NONE;
        this.n = new WeakReference(null);
        this.o = ajxh.a(new h(this));
        this.p = new e(this);
        this.s.g = new 2(this);
        rpw rpw = this.c;
        a aVar = this;
        akcr.b(aVar, "listener");
        rpw.a.c(aVar);
        context = this.q;
        BroadcastReceiver broadcastReceiver = this.f;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PHONE_STATE");
        context.registerReceiver(broadcastReceiver, intentFilter);
        a("init");
    }

    private final void a(boolean z, abjc abjc, abjj abjj) {
        this.a.post(new g(this, abjj, z, abjc));
    }

    public final ajej a() {
        try {
            a("onActivityResumed");
        } catch (Throwable th) {
            a(th);
        }
        Object obj = ajfq.INSTANCE;
        akcr.a(obj, "Disposables.disposed()");
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    public final void a(defpackage.abiu r4) {
        /*
        r3 = this;
        r0 = "sound";
        defpackage.akcr.b(r4, r0);
        r0 = defpackage.acbm.d();
        r1 = new java.lang.StringBuilder;
        r2 = "Playing talk sound: ";
        r1.<init>(r2);
        r1.append(r4);
        r1 = "MessagingAudioServices";
        r0.a(r1);
        r0 = defpackage.rps.b;
        r4 = r4.ordinal();
        r4 = r0[r4];
        r0 = 1;
        if (r4 == r0) goto L_0x002b;
    L_0x0023:
        r0 = 2;
        if (r4 == r0) goto L_0x0028;
    L_0x0026:
        r4 = 0;
        goto L_0x002f;
    L_0x0028:
        r4 = defpackage.rqd.LEFT_CALL;
        goto L_0x002d;
    L_0x002b:
        r4 = defpackage.rqd.HANG_UP;
    L_0x002d:
        r4 = (defpackage.abmh.a) r4;
    L_0x002f:
        if (r4 == 0) goto L_0x0036;
    L_0x0031:
        r0 = r3.r;
        r0.a(r4);
    L_0x0036:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpq.a(abiu):void");
    }

    public final void a(abix.a aVar, abjc abjc, boolean z) {
        akcr.b(aVar, "callingState");
        akcr.b(abjc, "callingMedia");
        this.a.post(new f(this, aVar, z, abjc));
    }

    public final void a(abjc abjc, abjj abjj) {
        akcr.b(abjc, "callingMedia");
        akcr.b(abjj, "muter");
        a(true, abjc, abjj);
    }

    public final void a(String str) {
        akcr.b(str, "callsite");
        this.e.a(str);
    }

    /* Access modifiers changed, original: final */
    public final void a(Throwable th) {
        String str = "MessagingAudioServices";
        this.v.a(gqt.HIGH, th, this.u.callsite(str));
        acbm.d().a(th).a(str);
    }

    public final void a(boolean z) {
        rpy rpy = this.m;
        if (rpy != null) {
            rpy.a(z);
        }
    }

    public final ajej b() {
        Object a = ajek.a((ajev) new c(this));
        akcr.a(a, "Disposables.fromAction {…feRun { dispose() }\n    }");
        return a;
    }

    public final void c() {
        a(false, abjc.NONE, null);
    }
}
