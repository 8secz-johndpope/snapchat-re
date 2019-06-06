package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import defpackage.acbm.a;

/* renamed from: rqb */
public final class rqb extends BroadcastReceiver {
    int a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    int f;
    a g;
    final Context h;
    final Handler i;
    private final ajxe j = ajxh.a(new b(this));
    private final Runnable k = new f(this);
    private final BluetoothAdapter l = BluetoothAdapter.getDefaultAdapter();
    private final int m = 2;

    /* renamed from: rqb$a */
    public interface a {
        void a();
    }

    /* renamed from: rqb$b */
    static final class b extends akcs implements akbk<AudioManager> {
        private /* synthetic */ rqb a;

        b(rqb rqb) {
            this.a = rqb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.h.getSystemService("audio");
            if (systemService != null) {
                return (AudioManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.media.AudioManager");
        }
    }

    /* renamed from: rqb$f */
    public static final class f implements Runnable {
        private /* synthetic */ rqb a;

        f(rqb rqb) {
            this.a = rqb;
        }

        public final void run() {
            String str = "TalkBluetoothManager";
            if (this.a.f < 2) {
                acbm.d().a(str);
                this.a.a().stopBluetoothSco();
                rqb rqb = this.a;
                rqb.f++;
                this.a.i.postDelayed(this, 4000);
                return;
            }
            acbm.d().a(str);
            this.a.c();
        }
    }

    /* renamed from: rqb$e */
    static final class e implements Runnable {
        private /* synthetic */ rqb a;
        private /* synthetic */ int b;

        e(rqb rqb, int i) {
            this.a = rqb;
            this.b = i;
        }

        public final void run() {
            if (this.b != this.a.a) {
                this.a.a = this.b;
                a d = acbm.d();
                StringBuilder stringBuilder = new StringBuilder("BT: sco state updated: ");
                int i = this.b;
                String str = i != -1 ? i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "CONNECTING" : "CONNECTED" : "DISCONNECTED" : "ERROR";
                stringBuilder.append(str);
                d.a("TalkBluetoothManager");
                int i2 = this.b;
                rqb rqb;
                a aVar;
                if (i2 == 1) {
                    rqb = this.a;
                    if (!rqb.c()) {
                        aVar = rqb.g;
                        if (aVar != null) {
                            aVar.a();
                        }
                        rqb.a().setBluetoothScoOn(true);
                    }
                } else if (i2 == 0) {
                    rqb = this.a;
                    if (!rqb.c()) {
                        aVar = rqb.g;
                        if (aVar != null) {
                            aVar.a();
                        }
                        rqb.a().setBluetoothScoOn(false);
                    }
                }
            }
        }
    }

    /* renamed from: rqb$c */
    static final class c implements Runnable {
        private /* synthetic */ rqb a;
        private /* synthetic */ int b;

        c(rqb rqb, int i) {
            this.a = rqb;
            this.b = i;
        }

        public final void run() {
            a d = acbm.d();
            new StringBuilder("BT: headset state changed: ").append(rqc.a(this.b));
            d.a("TalkBluetoothManager");
            int i = this.b;
            if (i == 2) {
                rqb rqb = this.a;
                rqb.d = true;
                rqb.c();
                return;
            }
            if (i == 0) {
                this.a.d = false;
            }
        }
    }

    /* renamed from: rqb$d */
    static final class d implements Runnable {
        private /* synthetic */ rqb a;
        private /* synthetic */ int b;

        d(rqb rqb, int i) {
            this.a = rqb;
            this.b = i;
        }

        public final void run() {
            a d = acbm.d();
            new StringBuilder("BT: a2dp state changed: ").append(rqc.a(this.b));
            d.a("TalkBluetoothManager");
            int i = this.b;
            if (i == 2) {
                rqb rqb = this.a;
                rqb.e = true;
                rqb.c();
                return;
            }
            if (i == 0) {
                this.a.e = false;
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rqb.class), "audioManager", "getAudioManager()Landroid/media/AudioManager;");
    }

    public rqb(Context context, Handler handler) {
        akcr.b(context, "context");
        akcr.b(handler, "handler");
        this.h = context;
        this.i = handler;
        if (this.l != null && a().isBluetoothScoAvailableOffCall()) {
            boolean z = false;
            this.d = this.l.getProfileConnectionState(1) == 2;
            if (this.l.getProfileConnectionState(2) == 2) {
                z = true;
            }
            this.e = z;
            context = this.h;
            BroadcastReceiver broadcastReceiver = this;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
            context.registerReceiver(broadcastReceiver, intentFilter);
            this.c = true;
        }
    }

    private final void d() {
        acbm.d().a("TalkBluetoothManager");
        f();
        a().startBluetoothSco();
    }

    private final void e() {
        acbm.d().a("TalkBluetoothManager");
        f();
        a().stopBluetoothSco();
    }

    private final void f() {
        this.i.removeCallbacks(this.k);
        this.f = 0;
        this.i.postDelayed(this.k, 4000);
    }

    private final void g() {
        this.i.removeCallbacks(this.k);
    }

    /* Access modifiers changed, original: final */
    public final AudioManager a() {
        return (AudioManager) this.j.b();
    }

    public final boolean b() {
        return this.d && this.e;
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        g();
        if (b()) {
            String str = "TalkBluetoothManager";
            if (this.b && this.a == 0) {
                acbm.d().a(str);
                d();
                return true;
            } else if (!this.b && this.a == 1) {
                acbm.d().a(str);
                e();
                return true;
            }
        }
        return false;
    }

    public final void onReceive(Context context, Intent intent) {
        akcr.b(context, "context");
        akcr.b(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1692127708) {
                Handler handler;
                d dVar;
                String str = "android.bluetooth.profile.extra.STATE";
                int intExtra;
                if (hashCode != 545516589) {
                    if (hashCode == 1244161670 && action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                        intExtra = intent.getIntExtra(str, 0);
                        handler = this.i;
                        dVar = new d(this, intExtra);
                    }
                } else if (action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                    intExtra = intent.getIntExtra(str, 0);
                    handler = this.i;
                    dVar = new c(this, intExtra);
                }
                handler.post(dVar);
            } else if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                this.i.post(new e(this, intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0)));
            }
        }
    }
}
