package defpackage;

import android.net.TrafficStats;

/* renamed from: rzs */
public final class rzs implements rzr {
    public final long a() {
        return TrafficStats.getTotalRxBytes();
    }

    public final long b() {
        return TrafficStats.getTotalTxBytes();
    }
}
