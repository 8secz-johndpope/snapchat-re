package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.annotations.CalledByNative;

public class ThreadUtils {
    public static final /* synthetic */ boolean a = (ThreadUtils.class.desiredAssertionStatus() ^ 1);
    private static final Object b = new Object();
    private static Handler c;

    public static Handler a() {
        Handler handler;
        synchronized (b) {
            if (c == null) {
                c = new Handler(Looper.getMainLooper());
            }
            handler = c;
        }
        return handler;
    }

    public static boolean b() {
        return a().getLooper() == Looper.myLooper();
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }
}
