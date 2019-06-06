package org.chromium.base;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.List;

public class EarlyTraceEvent {
    static final Object a = new Object();
    static volatile int b = 0;

    static final class a {
        final boolean a;
        final String b;
        final long c;
        final long d;
    }

    static final class b {
        static final /* synthetic */ boolean g = (EarlyTraceEvent.class.desiredAssertionStatus() ^ 1);
        final String a;
        final int b = Process.myTid();
        final long c = a();
        final long d = SystemClock.currentThreadTimeMillis();
        long e;
        long f;

        b(String str) {
            this.a = str;
        }

        @SuppressLint({"NewApi"})
        static long a() {
            return VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
        }
    }

    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            if (r3 != null) goto L_0x0026;
     */
    /* JADX WARNING: Missing block: B:13:0x0025, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:15:0x002d, code skipped:
            throw new java.lang.IllegalArgumentException("Multiple pending trace events can't have the same name");
     */
    public static void a(java.lang.String r3) {
        /*
        r0 = b();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = new org.chromium.base.EarlyTraceEvent$b;
        r0.<init>(r3);
        r1 = a;
        monitor-enter(r1);
        r2 = b();	 Catch:{ all -> 0x002e }
        if (r2 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r1);	 Catch:{ all -> 0x002e }
        return;
    L_0x0017:
        r2 = 0;
        r3 = c(r3);	 Catch:{ all -> 0x002e }
        r3 = r2.put(r3, r0);	 Catch:{ all -> 0x002e }
        r3 = (org.chromium.base.EarlyTraceEvent.b) r3;	 Catch:{ all -> 0x002e }
        monitor-exit(r1);	 Catch:{ all -> 0x002e }
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        return;
    L_0x0026:
        r3 = new java.lang.IllegalArgumentException;
        r0 = "Multiple pending trace events can't have the same name";
        r3.<init>(r0);
        throw r3;
    L_0x002e:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x002e }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.a(java.lang.String):void");
    }

    static boolean a() {
        int i = b;
        return i == 1 || i == 2;
    }

    /* JADX WARNING: Missing block: B:32:0x005d, code skipped:
            return;
     */
    public static void b(java.lang.String r7) {
        /*
        r0 = a();
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = a;
        monitor-enter(r0);
        r1 = a();	 Catch:{ all -> 0x005e }
        if (r1 != 0) goto L_0x0012;
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x0012:
        r7 = c(r7);	 Catch:{ all -> 0x005e }
        r1 = 0;
        r7 = r1.remove(r7);	 Catch:{ all -> 0x005e }
        r7 = (org.chromium.base.EarlyTraceEvent.b) r7;	 Catch:{ all -> 0x005e }
        if (r7 != 0) goto L_0x0021;
    L_0x001f:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x0021:
        r2 = org.chromium.base.EarlyTraceEvent.b.g;	 Catch:{ all -> 0x005e }
        r3 = 0;
        if (r2 != 0) goto L_0x0034;
    L_0x0027:
        r5 = r7.e;	 Catch:{ all -> 0x005e }
        r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r2 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x0034;
    L_0x002e:
        r7 = new java.lang.AssertionError;	 Catch:{ all -> 0x005e }
        r7.<init>();	 Catch:{ all -> 0x005e }
        throw r7;	 Catch:{ all -> 0x005e }
    L_0x0034:
        r2 = org.chromium.base.EarlyTraceEvent.b.g;	 Catch:{ all -> 0x005e }
        if (r2 != 0) goto L_0x0045;
    L_0x0038:
        r5 = r7.f;	 Catch:{ all -> 0x005e }
        r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r2 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0045;
    L_0x003f:
        r7 = new java.lang.AssertionError;	 Catch:{ all -> 0x005e }
        r7.<init>();	 Catch:{ all -> 0x005e }
        throw r7;	 Catch:{ all -> 0x005e }
    L_0x0045:
        r2 = org.chromium.base.EarlyTraceEvent.b.a();	 Catch:{ all -> 0x005e }
        r7.e = r2;	 Catch:{ all -> 0x005e }
        r2 = android.os.SystemClock.currentThreadTimeMillis();	 Catch:{ all -> 0x005e }
        r7.f = r2;	 Catch:{ all -> 0x005e }
        r1.add(r7);	 Catch:{ all -> 0x005e }
        r7 = b;	 Catch:{ all -> 0x005e }
        r1 = 2;
        if (r7 != r1) goto L_0x005c;
    L_0x0059:
        c();	 Catch:{ all -> 0x005e }
    L_0x005c:
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        return;
    L_0x005e:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x005e }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.EarlyTraceEvent.b(java.lang.String):void");
    }

    static boolean b() {
        return b == 1;
    }

    private static String c(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("@");
        stringBuilder.append(Process.myTid());
        return stringBuilder.toString();
    }

    static void c() {
        List list = null;
        if (!list.isEmpty()) {
            d();
            list.clear();
        }
        if (!list.isEmpty()) {
            e();
            list.clear();
        }
        if (list.isEmpty() && list.isEmpty()) {
            b = 3;
        }
    }

    private static void d() {
        long f = f();
        List<b> list = null;
        for (b bVar : list) {
            nativeRecordEarlyEvent(bVar.a, bVar.c + f, bVar.e + f, bVar.b, bVar.f - bVar.d);
        }
    }

    private static void e() {
        long f = f();
        List<a> list = null;
        for (a aVar : list) {
            if (aVar.a) {
                nativeRecordEarlyStartAsyncEvent(aVar.b, aVar.c, aVar.d + f);
            } else {
                nativeRecordEarlyFinishAsyncEvent(aVar.b, aVar.c, aVar.d + f);
            }
        }
    }

    private static long f() {
        return (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - b.a();
    }

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i, long j3);

    private static native void nativeRecordEarlyFinishAsyncEvent(String str, long j, long j2);

    private static native void nativeRecordEarlyStartAsyncEvent(String str, long j, long j2);
}
