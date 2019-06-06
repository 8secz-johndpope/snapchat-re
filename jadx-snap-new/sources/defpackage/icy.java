package defpackage;

import android.app.Activity;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.brightcove.player.event.Event;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;

/* renamed from: icy */
public final class icy extends ablg implements FrameCallback {
    private long a = -1;
    private final Choreographer e;

    public icy(Choreographer choreographer, Activity activity, ajwy<ablk> ajwy) {
        akcr.b(choreographer, "choreographer");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ajwy, "perfMonitorConfig");
        super(activity, ajwy);
        this.e = choreographer;
    }

    public final void a() {
        super.a();
        this.e.postFrameCallback(this);
    }

    public final void d() {
        super.d();
        this.a = -1;
        this.e.removeFrameCallback(this);
    }

    public final void doFrame(long j) {
        long j2 = this.a;
        int i = 0;
        if (j2 != -1) {
            j2 = j - j2;
            if (j2 - g() > TelemetryConstants.FLUSH_DELAY_MS) {
                i = (int) (j2 / g());
            }
        } else {
            j2 = 0;
        }
        this.a = j;
        this.b.a(new ablf(j2, i));
        this.e.postFrameCallback(this);
    }
}
