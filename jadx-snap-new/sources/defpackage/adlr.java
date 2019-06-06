package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: adlr */
public final class adlr {
    long[] a = new long[]{-1, -1};
    long[] b = new long[]{-1, -1};
    int[] c = new int[]{-1, -1};
    int[] d = new int[]{-1, -1};

    private String a(String str, int i) {
        long j = this.a[i];
        double d = (double) this.b[i];
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        d /= d2;
        int i2 = this.c[i];
        double d3 = (double) i2;
        double d4 = (double) (i2 + this.d[i]);
        Double.isNaN(d3);
        Double.isNaN(d4);
        d4 = d3 / d4;
        Double.isNaN(d2);
        d2 /= 1000.0d;
        Double.isNaN(d3);
        d3 /= d2;
        return String.format("[%s]mTotalEncodeDurationMs=%dms, mActiveEncodeDurationMs=%dms, activeRatio=%f%%, mProcessedCount=%d, mNoOpCount=%d, processRatio=%f%%, fps=%f", new Object[]{str, Long.valueOf(j), Long.valueOf(r4), Double.valueOf(d), Integer.valueOf(i2), Integer.valueOf(r10), Double.valueOf(d4), Double.valueOf(d3)});
    }

    static void a(int i) {
        boolean z = true;
        if (!(i == 0 || i == 1)) {
            z = false;
        }
        Preconditions.checkState(z, "The type should be TYPE_VIDEO_ENCODER or TYPE_AUDIO_ENCODER");
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = a("VideoEncoder", 0);
        objArr[1] = a("AudioEncoder", 1);
        long[] jArr = this.a;
        long j = jArr[0] > jArr[1] ? jArr[0] : jArr[1];
        jArr = this.b;
        double d = (double) (jArr[0] + jArr[1]);
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        objArr[2] = Double.valueOf(d / d2);
        return String.format("%s\n%s\nActiveRatio=%f", objArr);
    }
}
