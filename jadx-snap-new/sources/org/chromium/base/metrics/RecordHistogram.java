package org.chromium.base.metrics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RecordHistogram {
    public static Map<String, Long> a = Collections.synchronizedMap(new HashMap());
    public static final /* synthetic */ boolean b = (RecordHistogram.class.desiredAssertionStatus() ^ 1);

    public static int a(long j) {
        return j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
    }

    public static long a(String str) {
        Long l = (Long) a.get(str);
        return l == null ? 0 : l.longValue();
    }

    public static void a(String str, boolean z) {
        long a = a(str);
        long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, a, z);
        if (nativeRecordBooleanHistogram != a) {
            a.put(str, Long.valueOf(nativeRecordBooleanHistogram));
        }
    }

    private static native int nativeGetHistogramTotalCountForTesting(String str);

    private static native int nativeGetHistogramValueCountForTesting(String str, int i);

    private static native long nativeRecordBooleanHistogram(String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    public static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(String str, long j, int i);
}
