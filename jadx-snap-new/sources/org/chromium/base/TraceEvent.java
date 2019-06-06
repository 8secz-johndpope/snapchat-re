package org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Printer;
import org.chromium.base.annotations.CalledByNative;

public class TraceEvent implements AutoCloseable {
    static volatile boolean a;
    private final String b;

    static class a implements Printer {
        private static /* synthetic */ boolean a = (TraceEvent.class.desiredAssertionStatus() ^ 1);

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        private static String c(String str) {
            int indexOf = str.indexOf(40, 21);
            int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
            return indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
        }

        /* Access modifiers changed, original: 0000 */
        public void a(String str) {
            boolean a = EarlyTraceEvent.a();
            if (TraceEvent.a || a) {
                str = c(str);
                if (TraceEvent.a) {
                    TraceEvent.nativeBeginToplevel(str);
                } else if (a) {
                    EarlyTraceEvent.a("Looper.dispatchMessage: ".concat(String.valueOf(str)));
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void b(String str) {
            if (EarlyTraceEvent.a()) {
                StringBuilder stringBuilder = new StringBuilder("Looper.dispatchMessage: ");
                stringBuilder.append(c(str));
                EarlyTraceEvent.b(stringBuilder.toString());
            }
            if (TraceEvent.a) {
                TraceEvent.nativeEndToplevel();
            }
        }

        public void println(String str) {
            if (str.startsWith(">")) {
                a(str);
            } else if (a || str.startsWith("<")) {
                b(str);
            } else {
                throw new AssertionError();
            }
        }
    }

    static final class c {
        static final a a = (CommandLine.c().a() ? new b() : new a());
    }

    static final class b extends a implements IdleHandler {
        private long a;
        private long b;
        private int c;
        private int d;
        private int e;
        private boolean f;

        private b() {
            super();
        }

        /* synthetic */ b(byte b) {
            this();
        }

        private final void a() {
            String str = "TraceEvent.LooperMonitor";
            if (!TraceEvent.a || this.f) {
                if (this.f && !TraceEvent.a) {
                    Looper.myQueue().removeIdleHandler(this);
                    this.f = false;
                    Log.v(str, "detached idle handler");
                }
                return;
            }
            this.a = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.f = true;
            Log.v(str, "attached idle handler");
        }

        private static void a(int i, String str) {
            TraceEvent.a("TraceEvent.LooperMonitor:IdleStats", str);
            Log.println(i, "TraceEvent.LooperMonitor", str);
        }

        /* Access modifiers changed, original: final */
        public final void a(String str) {
            if (this.e == 0) {
                TraceEvent.a("Looper.queueIdle");
            }
            this.b = SystemClock.elapsedRealtime();
            a();
            super.a(str);
        }

        /* Access modifiers changed, original: final */
        public final void b(String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
            if (elapsedRealtime > 16) {
                StringBuilder stringBuilder = new StringBuilder("observed a task that took ");
                stringBuilder.append(elapsedRealtime);
                stringBuilder.append("ms: ");
                stringBuilder.append(str);
                a(5, stringBuilder.toString());
            }
            super.b(str);
            a();
            this.c++;
            this.e++;
        }

        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.a == 0) {
                this.a = elapsedRealtime;
            }
            long j = elapsedRealtime - this.a;
            this.d++;
            String str = "Looper.queueIdle";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.e);
            stringBuilder.append(" tasks since last idle.");
            String stringBuilder2 = stringBuilder.toString();
            EarlyTraceEvent.a(str);
            if (TraceEvent.a) {
                TraceEvent.nativeBegin(str, stringBuilder2);
            }
            if (j > 48) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(this.c);
                stringBuilder3.append(" tasks and ");
                stringBuilder3.append(this.d);
                stringBuilder3.append(" idles processed so far, ");
                stringBuilder3.append(this.e);
                stringBuilder3.append(" tasks bursted and ");
                stringBuilder3.append(j);
                stringBuilder3.append("ms elapsed since last idle");
                a(3, stringBuilder3.toString());
            }
            this.a = elapsedRealtime;
            this.e = 0;
            return true;
        }
    }

    public static void a(String str) {
        EarlyTraceEvent.b(str);
        if (a) {
            nativeEnd(str, null);
        }
    }

    public static void a(String str, String str2) {
        if (a) {
            nativeInstant(str, str2);
        }
    }

    static native void nativeBegin(String str, String str2);

    static native void nativeBeginToplevel(String str);

    private static native void nativeEnd(String str, String str2);

    static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String str, long j);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    @CalledByNative
    public static void setEnabled(boolean z) {
        if (z) {
            synchronized (EarlyTraceEvent.a) {
                if (EarlyTraceEvent.b()) {
                    EarlyTraceEvent.b = 2;
                    EarlyTraceEvent.c();
                }
            }
        }
        if (a != z) {
            a = z;
            ThreadUtils.a().getLooper().setMessageLogging(z ? c.a : null);
        }
    }

    public void close() {
        a(this.b);
    }
}
