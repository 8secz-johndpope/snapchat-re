package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: aiyc */
final class aiyc extends aixl {
    static final Logger a = Logger.getLogger(aiyc.class.getName());
    private static final ReferenceQueue<aiyc> b = new ReferenceQueue();
    private static final ConcurrentMap<a, a> c = new ConcurrentHashMap();
    private final a d;

    /* renamed from: aiyc$a */
    static final class a extends WeakReference<aiyc> {
        private static final boolean a = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
        private static final RuntimeException b;
        private final ReferenceQueue<aiyc> c;
        private final ConcurrentMap<a, a> d;
        private final aivi e;
        private final Reference<RuntimeException> f;
        private volatile boolean g;
        private volatile boolean h;

        static {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            b = runtimeException;
        }

        a(aiyc aiyc, aivi aivi, ReferenceQueue<aiyc> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(aiyc, referenceQueue);
            this.f = new SoftReference(a ? new RuntimeException("ManagedChannel allocation site") : b);
            this.e = aivi;
            this.c = referenceQueue;
            this.d = concurrentMap;
            this.d.put(this, this);
            a.a(referenceQueue);
        }

        private static int a(ReferenceQueue<aiyc> referenceQueue) {
            int i = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return i;
                }
                RuntimeException runtimeException = (RuntimeException) aVar.f.get();
                aVar.a();
                boolean z = aVar.g;
                i++;
                z = aVar.h;
                Level level = Level.SEVERE;
                if (aiyc.a.isLoggable(level)) {
                    StringBuilder stringBuilder = new StringBuilder("*~*~*~ Channel {0} was not ");
                    boolean z2 = aVar.g;
                    stringBuilder.append("shutdown properly!!! ~*~*~*");
                    stringBuilder.append(System.getProperty("line.separator"));
                    stringBuilder.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                    LogRecord logRecord = new LogRecord(level, stringBuilder.toString());
                    logRecord.setLoggerName(aiyc.a.getName());
                    logRecord.setParameters(new Object[]{aVar.e.toString()});
                    logRecord.setThrown(runtimeException);
                    aiyc.a.log(logRecord);
                }
            }
        }

        private void a() {
            super.clear();
            this.d.remove(this);
            this.f.clear();
        }

        public final void clear() {
            a();
            a.a(this.c);
        }
    }

    aiyc(aivi aivi) {
        this(aivi, b, c);
    }

    private aiyc(aivi aivi, ReferenceQueue<aiyc> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
        super(aivi);
        this.d = new a(this, aivi, referenceQueue, concurrentMap);
    }
}
