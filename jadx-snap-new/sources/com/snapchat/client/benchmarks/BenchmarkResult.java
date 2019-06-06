package com.snapchat.client.benchmarks;

public final class BenchmarkResult {
    final Benchmark mBenchmark;
    final String mResult;

    public BenchmarkResult(Benchmark benchmark, String str) {
        this.mBenchmark = benchmark;
        this.mResult = str;
    }

    public final Benchmark getBenchmark() {
        return this.mBenchmark;
    }

    public final String getResult() {
        return this.mResult;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BenchmarkResult{mBenchmark=");
        stringBuilder.append(this.mBenchmark);
        stringBuilder.append(",mResult=");
        stringBuilder.append(this.mResult);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
