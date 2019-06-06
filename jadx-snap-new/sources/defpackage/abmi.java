package defpackage;

import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.google.common.base.Supplier;
import com.snapchat.android.framework.misc.AppContext;

@Deprecated
/* renamed from: abmi */
public final class abmi {
    static final Supplier<Handler> a = abpo.a(-$$Lambda$abmi$TnobxXPP5pPbMfS3Z76AgG8_Oks.INSTANCE);
    private final Supplier<AudioManager> b = abpo.a(new -$$Lambda$abmi$R0J9MTz35HBs84UGUxgSFxQM9lU(AppContext.get()));
    private a c;

    /* renamed from: abmi$a */
    static class a implements Runnable {
        boolean a = true;
        private long b;
        private Vibrator c;
        private AudioManager d;

        a(long j, Vibrator vibrator, AudioManager audioManager) {
            this.b = j;
            this.c = vibrator;
            this.d = audioManager;
        }

        public final void a() {
            if (this.d.isSpeakerphoneOn()) {
                abxv.a(this.c, 200);
            }
            ((Handler) abmi.a.get()).postDelayed(this, this.b);
        }

        public final void run() {
            if (this.a) {
                a();
            }
        }
    }

    public final synchronized void a() {
        if (this.c != null) {
            this.c.a = false;
        }
        Vibrator a = abxw.a(AppContext.get());
        if (a != null) {
            a.cancel();
        }
    }

    public final synchronized void a(long j) {
        a();
        Vibrator a = abxw.a(AppContext.get());
        if (a != null) {
            if (VERSION.SDK_INT < 26) {
                this.c = new a(j, a, (AudioManager) this.b.get());
                this.c.a();
                return;
            }
            VibrationEffect createWaveform = VibrationEffect.createWaveform(new long[]{0, 200, j}, 1);
            akcr.b(createWaveform, "effect");
            akcr.b(createWaveform, "effect");
            if (a != null) {
                try {
                    a.vibrate(createWaveform);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
