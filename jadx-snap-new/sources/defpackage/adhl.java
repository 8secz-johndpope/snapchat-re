package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.brightcove.player.event.Event;

/* renamed from: adhl */
public enum adhl {
    GLES20,
    GLES30;

    public static adhl a(Context context) {
        return ((ActivityManager) context.getSystemService(Event.ACTIVITY)).getDeviceConfigurationInfo().reqGlEsVersion >= 196608 ? GLES30 : GLES20;
    }
}
