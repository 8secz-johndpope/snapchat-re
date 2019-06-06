package org.chromium.net;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import defpackage.akon;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;

public class AndroidCellularSignalStrength {
    private static final AndroidCellularSignalStrength b = new AndroidCellularSignalStrength();
    volatile int a = Integer.MIN_VALUE;

    class a extends PhoneStateListener implements org.chromium.base.ApplicationStatus.a {
        private static /* synthetic */ boolean b = (AndroidCellularSignalStrength.class.desiredAssertionStatus() ^ 1);
        private final TelephonyManager a;

        a() {
            if (ThreadUtils.a || !ThreadUtils.b()) {
                this.a = (TelephonyManager) akon.a.getSystemService("phone");
                if (this.a.getSimState() == 5) {
                    ApplicationStatus.a(this);
                    int stateForApplication = ApplicationStatus.getStateForApplication();
                    if (stateForApplication == 1) {
                        this.a.listen(this, 256);
                        return;
                    }
                    if (stateForApplication == 2) {
                        AndroidCellularSignalStrength.this.a = Integer.MIN_VALUE;
                        this.a.listen(this, 0);
                    }
                    return;
                }
                return;
            }
            throw new AssertionError("Must be called on a thread other than UI.");
        }

        @TargetApi(23)
        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (ApplicationStatus.getStateForApplication() == 1) {
                try {
                    AndroidCellularSignalStrength.this.a = signalStrength.getLevel();
                } catch (SecurityException unused) {
                    AndroidCellularSignalStrength.this.a = Integer.MIN_VALUE;
                    if (!b) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private AndroidCellularSignalStrength() {
        if (VERSION.SDK_INT >= 23) {
            HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new Runnable() {
                public final void run() {
                    a aVar = new a();
                }
            });
        }
    }

    @TargetApi(23)
    @CalledByNative
    private static int getSignalStrengthLevel() {
        return b.a;
    }
}
