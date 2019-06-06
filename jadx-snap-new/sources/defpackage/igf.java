package defpackage;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.Window;
import com.brightcove.player.event.Event;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: igf */
public class igf {
    final ajxe a = ajxh.a(new d(this));
    public final ajxe b = ajxh.a(new e(this));
    final ajwo<Boolean> c;
    final Set<String> d;
    WakeLock e;
    final SensorEventListener f;
    final Activity g;
    private final Handler h = zgb.a(ige.a, "ProximityService").k();
    private final ajxe i = ajxh.a(new g(this));
    private final ajxe j = ajxh.a(new f(this));

    /* renamed from: igf$d */
    static final class d extends akcs implements akbk<PowerManager> {
        private /* synthetic */ igf a;

        d(igf igf) {
            this.a = igf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.g.getSystemService("power");
            if (systemService != null) {
                return (PowerManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.os.PowerManager");
        }
    }

    /* renamed from: igf$g */
    static final class g extends akcs implements akbk<SensorManager> {
        private /* synthetic */ igf a;

        g(igf igf) {
            this.a = igf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.g.getSystemService("sensor");
            if (systemService != null) {
                return (SensorManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.hardware.SensorManager");
        }
    }

    /* renamed from: igf$f */
    static final class f extends akcs implements akbk<Sensor> {
        private /* synthetic */ igf a;

        f(igf igf) {
            this.a = igf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a().getDefaultSensor(8);
        }
    }

    /* renamed from: igf$e */
    static final class e extends akcs implements akbk<ajdp<Boolean>> {
        private /* synthetic */ igf a;

        e(igf igf) {
            this.a = igf;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.c.d(500, TimeUnit.MILLISECONDS).j(ajfu.a);
        }
    }

    /* renamed from: igf$c */
    public static final class c implements SensorEventListener {
        private /* synthetic */ igf a;

        c(igf igf) {
            this.a = igf;
        }

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent != null) {
                Sensor sensor = sensorEvent.sensor;
                if (sensor != null && sensor.getType() == 8) {
                    boolean z = false;
                    float f = sensorEvent.values[0];
                    Object obj = sensorEvent.sensor;
                    akcr.a(obj, "event.sensor");
                    float maximumRange = obj.getMaximumRange();
                    if (f <= 4.0f && f < maximumRange) {
                        z = true;
                    }
                    this.a.c.a(Boolean.valueOf(z));
                }
            }
        }
    }

    /* renamed from: igf$a */
    static final class a implements Runnable {
        private /* synthetic */ igf a;
        private /* synthetic */ String b;

        a(igf igf, String str) {
            this.a = igf;
            this.b = str;
        }

        public final void run() {
            this.a.d.remove(this.b);
            if (this.a.d.isEmpty()) {
                igf igf = this.a;
                if (igf.c()) {
                    WakeLock wakeLock = igf.e;
                    if (wakeLock != null) {
                        wakeLock.release(0);
                    }
                    igf.a().unregisterListener(igf.f);
                    igf.c.a(Boolean.FALSE);
                }
            }
        }
    }

    /* renamed from: igf$b */
    static final class b implements Runnable {
        private /* synthetic */ igf a;
        private /* synthetic */ String b;

        b(igf igf, String str) {
            this.a = igf;
            this.b = str;
        }

        public final void run() {
            if (this.a.d.isEmpty()) {
                igf igf = this.a;
                if (igf.c()) {
                    igf.a().registerListener(igf.f, igf.b(), 3);
                    Window window = igf.g.getWindow();
                    if (window != null) {
                        window.addFlags(128);
                    }
                    igf.e = ((PowerManager) igf.a.b()).newWakeLock(32, "ProximityService");
                    WakeLock wakeLock = igf.e;
                    if (wakeLock != null) {
                        wakeLock.acquire();
                    }
                }
            }
            this.a.d.add(this.b);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(igf.class), "powerManager", "getPowerManager()Landroid/os/PowerManager;"), new akdc(akde.a(igf.class), "sensorManager", "getSensorManager()Landroid/hardware/SensorManager;"), new akdc(akde.a(igf.class), "proximitySensor", "getProximitySensor()Landroid/hardware/Sensor;"), new akdc(akde.a(igf.class), "proximityObservable", "getProximityObservable()Lio/reactivex/Observable;")};
    }

    public igf(Activity activity, zgb zgb) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(zgb, "schedulersProvider");
        this.g = activity;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Boolean>()");
        this.c = ajwo;
        this.d = new LinkedHashSet();
        this.f = new c(this);
    }

    /* Access modifiers changed, original: final */
    public final SensorManager a() {
        return (SensorManager) this.i.b();
    }

    public final void a(String str) {
        akcr.b(str, "token");
        this.h.post(new b(this, str));
    }

    /* Access modifiers changed, original: final */
    public final Sensor b() {
        return (Sensor) this.j.b();
    }

    public final void b(String str) {
        akcr.b(str, "token");
        this.h.post(new a(this, str));
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        if (b() != null && VERSION.SDK_INT >= 21) {
            akcr.a(abtb.a(), "TestStatus.getInstance()");
            if (!abtb.b()) {
                return true;
            }
        }
        return false;
    }
}
