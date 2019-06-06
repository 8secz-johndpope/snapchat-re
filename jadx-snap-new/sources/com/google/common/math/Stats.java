package com.google.common.math;

import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects.ToStringHelper;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.looksery.sdk.listener.AnalyticsListener;
import java.io.Serializable;

public final class Stats implements Serializable {
    private final long count;
    private final double max;
    private final double mean;
    private final double min;
    private final double sumOfSquaresOfDeltas;

    Stats(long j, double d, double d2, double d3, double d4) {
        this.count = j;
        this.mean = d;
        this.sumOfSquaresOfDeltas = d2;
        this.min = d3;
        this.max = d4;
    }

    public static Stats of(long... jArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(jArr);
        return statsAccumulator.snapshot();
    }

    public final long count() {
        return this.count;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.count == stats.count && Double.doubleToLongBits(this.mean) == Double.doubleToLongBits(stats.mean) && Double.doubleToLongBits(this.sumOfSquaresOfDeltas) == Double.doubleToLongBits(stats.sumOfSquaresOfDeltas) && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(stats.min) && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(stats.max);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.count), Double.valueOf(this.mean), Double.valueOf(this.sumOfSquaresOfDeltas), Double.valueOf(this.min), Double.valueOf(this.max));
    }

    public final double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public final double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        Preconditions.checkState(this.count > 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        double ensureNonNegative = DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas);
        double count = (double) count();
        Double.isNaN(count);
        return ensureNonNegative / count;
    }

    public final String toString() {
        ToStringHelper add;
        long count = count();
        String str = AnalyticsListener.ANALYTICS_COUNT_KEY;
        if (count > 0) {
            String str2 = "populationStandardDeviation";
            str2 = "min";
            str2 = "max";
            add = MoreObjects.toStringHelper((Object) this).add(str, this.count).add("mean", this.mean).add(str2, populationStandardDeviation()).add(str2, this.min).add(str2, this.max);
        } else {
            add = MoreObjects.toStringHelper((Object) this).add(str, this.count);
        }
        return add.toString();
    }
}
