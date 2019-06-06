package com.snapchat.client.benchmarks;

public final class BenchmarkRunConfig {
    final Benchmark mBenchmark;
    final String mConfig;
    final int mMaxDuration;

    public BenchmarkRunConfig(Benchmark benchmark, int i, String str) {
        this.mBenchmark = benchmark;
        this.mMaxDuration = i;
        this.mConfig = str;
    }

    public final Benchmark getBenchmark() {
        return this.mBenchmark;
    }

    public final String getConfig() {
        return this.mConfig;
    }

    public final int getMaxDuration() {
        return this.mMaxDuration;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BenchmarkRunConfig{mBenchmark=");
        stringBuilder.append(this.mBenchmark);
        stringBuilder.append(",mMaxDuration=");
        stringBuilder.append(this.mMaxDuration);
        stringBuilder.append(",mConfig=");
        stringBuilder.append(this.mConfig);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
