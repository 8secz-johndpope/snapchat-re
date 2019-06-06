package com.looksery.sdk;

public final class LSMicroBenchmarkWrapper {

    public static class Result {
        public String description;
        public long pointerFunctions;
        public boolean success;

        Result(boolean z, String str, long j) {
            this.success = z;
            this.description = str;
            this.pointerFunctions = j;
        }
    }

    public LSMicroBenchmarkWrapper() {
        LSNativeLibraryLoader.ensureAllAreLoaded();
    }

    private static native long nativeConstructMicroBenchmark(int i);

    private static native void nativeDestroyMicroBenchmark(int i, long j);

    private static native int nativeMapBenchmarkNameToIndex(int i);

    private static native Result nativeObtainMicroBenchmarkInformation(int i);

    private static native int nativeQueryMicroBenchmarkCount();

    private static native String nativeRunMicroBenchmark(int i, long j);

    public final long construct(int i) {
        return nativeConstructMicroBenchmark(i);
    }

    public final long constructNamed(int i) {
        return nativeConstructMicroBenchmark(nativeMapBenchmarkNameToIndex(i));
    }

    public final void destroy(int i, long j) {
        nativeDestroyMicroBenchmark(i, j);
    }

    public final void destroyNamed(int i, long j) {
        nativeDestroyMicroBenchmark(nativeMapBenchmarkNameToIndex(i), j);
    }

    public final String[] getBenchmarksByIndex() {
        String[] strArr = new String[nativeQueryMicroBenchmarkCount()];
        for (int i = 0; i < strArr.length; i++) {
            Result nativeObtainMicroBenchmarkInformation = nativeObtainMicroBenchmarkInformation(i);
            strArr[i] = nativeObtainMicroBenchmarkInformation.success ? nativeObtainMicroBenchmarkInformation.description : "";
        }
        return strArr;
    }

    public final String run(int i, long j) {
        return nativeRunMicroBenchmark(i, j);
    }

    public final String runNamed(int i, long j) {
        return nativeRunMicroBenchmark(nativeMapBenchmarkNameToIndex(i), j);
    }
}
