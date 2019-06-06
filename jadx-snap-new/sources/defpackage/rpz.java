package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import defpackage.acbm.a;
import defpackage.rpy.b;

/* renamed from: rpz */
public abstract class rpz extends rpy {
    OnAudioFocusChangeListener d;
    Handler e;
    private final ajxe f;
    private final OnAudioFocusChangeListener g;
    private int h;
    private boolean i;
    private final int j;
    private final int k;

    /* renamed from: rpz$a */
    static final class a extends akcs implements akbk<AudioManager> {
        private /* synthetic */ b a;

        a(b bVar) {
            this.a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.b().getSystemService("audio");
            if (systemService != null) {
                return (AudioManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.media.AudioManager");
        }
    }

    /* renamed from: rpz$b */
    static final class b implements OnAudioFocusChangeListener {
        private /* synthetic */ rpz a;

        /* renamed from: rpz$b$a */
        static final class a extends akcs implements akbk<ajxw> {
            private /* synthetic */ OnAudioFocusChangeListener a;
            private /* synthetic */ b b;
            private /* synthetic */ int c;

            a(OnAudioFocusChangeListener onAudioFocusChangeListener, b bVar, int i) {
                this.a = onAudioFocusChangeListener;
                this.b = bVar;
                this.c = i;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.a.onAudioFocusChange(this.c);
                return ajxw.a;
            }
        }

        b(rpz rpz) {
            this.a = rpz;
        }

        public final void onAudioFocusChange(int i) {
            a d = acbm.d();
            StringBuilder stringBuilder = new StringBuilder("onAudioFocusChange: ");
            String str = i != -3 ? i != -2 ? i != -1 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<unknown audio focus change>" : "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE" : "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK" : "AUDIOFOCUS_GAIN_TRANSIENT" : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
            stringBuilder.append(str);
            d.a("RoutingStrategyWithMode");
            OnAudioFocusChangeListener onAudioFocusChangeListener = this.a.d;
            if (onAudioFocusChangeListener != null) {
                Handler handler = this.a.e;
                akbk aVar = new a(onAudioFocusChangeListener, this, i);
                if (handler != null) {
                    handler.post(new rqa(aVar));
                    return;
                }
                aVar.invoke();
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rpz.class), "audioManager", "getAudioManager()Landroid/media/AudioManager;");
    }

    protected rpz(int i, int i2, b bVar, boolean z) {
        akcr.b(bVar, "dependencies");
        super(bVar, z);
        this.j = i;
        this.k = i2;
        this.f = ajxh.a(new a(bVar));
        this.g = new b(this);
        a("android.intent.action.HEADSET_PLUG");
        a("android.media.RINGER_MODE_CHANGED");
    }

    public /* synthetic */ rpz(b bVar) {
        this(1, 2, bVar, false);
    }

    public static /* synthetic */ void a(rpz rpz, int i, OnAudioFocusChangeListener onAudioFocusChangeListener, int i2) {
        if ((i2 & 2) != 0) {
            onAudioFocusChangeListener = null;
        }
        rpz.a(i, onAudioFocusChangeListener, null);
    }

    public final void a(int i, OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        if (this.a) {
            this.d = onAudioFocusChangeListener;
            this.e = handler;
            j().requestAudioFocus(this.g, this.k, i);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Context context, Intent intent) {
        akcr.b(context, "context");
        akcr.b(intent, "intent");
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            String str = ", old value=";
            String str2 = "RoutingStrategyWithMode";
            a d;
            StringBuilder stringBuilder;
            if (hashCode != -1676458352) {
                if (hashCode == 2070024785 && action.equals("android.media.RINGER_MODE_CHANGED")) {
                    int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", -1);
                    d = acbm.d();
                    stringBuilder = new StringBuilder("Got ringer mode change event, new value=");
                    stringBuilder.append(intExtra);
                    stringBuilder.append(str);
                    stringBuilder.append(this.h);
                    d.a(str2);
                    if (intExtra != this.h) {
                        this.h = intExtra;
                        f();
                    }
                }
            } else if (action.equals("android.intent.action.HEADSET_PLUG")) {
                boolean z = false;
                if (intent.getIntExtra("state", 0) == 1) {
                    z = true;
                }
                d = acbm.d();
                stringBuilder = new StringBuilder("Got headset plug event, new value=");
                stringBuilder.append(z);
                stringBuilder.append(str);
                stringBuilder.append(this.i);
                d.a(str2);
                if (z != this.i) {
                    this.i = z;
                    e();
                }
            }
        }
    }

    public boolean b() {
        return true;
    }

    public void c() {
        int mode = j().getMode();
        if (mode != this.j) {
            a d = acbm.d();
            StringBuilder stringBuilder = new StringBuilder("Changing audio manager hardware mode, new value=");
            stringBuilder.append(this.j);
            String str = ", old value=";
            stringBuilder.append(str);
            stringBuilder.append(mode);
            String str2 = "RoutingStrategyWithMode";
            d.a(str2);
            try {
                j().setMode(this.j);
            } catch (SecurityException e) {
                acbm.a(e).a(str2);
            }
            d = acbm.d();
            StringBuilder stringBuilder2 = new StringBuilder("Audio manager hardware mode changed, new value=");
            stringBuilder2.append(this.j);
            stringBuilder2.append(str);
            stringBuilder2.append(mode);
            d.a(str2);
        }
        this.b.d().a(this.k);
    }

    public void d() {
        l();
    }

    /* Access modifiers changed, original: protected */
    public void f() {
    }

    public final void h() {
        this.i = j().isWiredHeadsetOn();
        this.h = j().getRingerMode();
        super.h();
    }

    /* Access modifiers changed, original: protected|final */
    public final AudioManager j() {
        return (AudioManager) this.f.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean k() {
        return j().isWiredHeadsetOn() || this.b.e().b();
    }

    public final void l() {
        j().abandonAudioFocus(this.g);
    }
}
