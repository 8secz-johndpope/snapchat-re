package com.snapchat.client.benchmarks;

public final class Benchmark {
    final BenchmarkName mName;
    final BenchmarkType mType;

    public Benchmark(BenchmarkName benchmarkName, BenchmarkType benchmarkType) {
        this.mName = benchmarkName;
        this.mType = benchmarkType;
    }

    public final BenchmarkName getName() {
        return this.mName;
    }

    public final BenchmarkType getType() {
        return this.mType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Benchmark{mName=");
        stringBuilder.append(this.mName);
        stringBuilder.append(",mType=");
        stringBuilder.append(this.mType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
