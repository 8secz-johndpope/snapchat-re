package defpackage;

import android.hardware.Camera;
import android.hardware.Camera.PreviewCallback;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dwo */
final class dwo implements PreviewCallback {
    volatile int a = 0;
    private final Set<dox> b = new HashSet();
    private HandlerThread c;
    private Handler d;
    private dpp e;
    private byte[] f;

    dwo() {
    }

    private void a() {
        dpp dpp = this.e;
        if (dpp != null) {
            abtl m = dpp.m();
            if (m != null) {
                dpp dpp2 = this.e;
                double g = (double) (m.g() * 17);
                Double.isNaN(g);
                int i = (int) (g / 8.0d);
                int i2 = 1;
                while (i2 < i) {
                    i2 <<= 1;
                }
                byte[] bArr = this.f;
                if (bArr == null || bArr.length < i2) {
                    this.f = new byte[i2];
                }
                dpp2.a(this.f);
                this.e.a((PreviewCallback) this);
            }
        }
    }

    private /* synthetic */ void b() {
        if (!this.b.isEmpty()) {
            a();
        }
    }

    private /* synthetic */ void b(dox dox) {
        this.b.remove(dox);
        if (this.b.isEmpty()) {
            this.e = null;
            this.f = null;
            HandlerThread handlerThread = this.c;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.c = null;
            this.d = null;
        }
    }

    private /* synthetic */ void b(dpp dpp, dox dox) {
        this.e = dpp;
        this.b.add(dox);
        if (this.b.size() == 1) {
            a();
        }
    }

    public final void a(int i) {
        this.a = i;
        Handler handler = this.d;
        if (handler != null) {
            handler.post(new -$$Lambda$dwo$RYcaXQ0YSyw03Ysteuvb83BUIpk(this));
        }
    }

    public final void a(dox dox) {
        Handler handler = this.d;
        if (handler != null) {
            handler.post(new -$$Lambda$dwo$FDYtPMugeBTuOtR5GVsG5Rvphxw(this, dox));
        }
    }

    public final void a(dpp dpp, dox dox) {
        Handler handler = this.d;
        if (handler == null) {
            if (this.c == null) {
                this.c = new HandlerThread("Camera1PreviewFrameBufferGenerator", 0);
                this.c.start();
            }
            this.d = new Handler(this.c.getLooper());
            handler = this.d;
        }
        handler.post(new -$$Lambda$dwo$VlLieyFn3n_S6WsiW-faqcmZY80(this, dpp, dox));
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        Handler handler = this.d;
        if (handler != null) {
            handler.post(new -$$Lambda$dwo$-ynKtwaangeeS6czpUY-JBr82Eo(this, bArr));
        }
    }
}
