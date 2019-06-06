package com.snapchat.client.benchmarks;

import java.util.ArrayList;

public final class BenchmarkResults {
    final ArrayList<BenchmarkResult> mResults;

    public BenchmarkResults(ArrayList<BenchmarkResult> arrayList) {
        this.mResults = arrayList;
    }

    public final ArrayList<BenchmarkResult> getResults() {
        return this.mResults;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BenchmarkResults{mResults=");
        stringBuilder.append(this.mResults);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
