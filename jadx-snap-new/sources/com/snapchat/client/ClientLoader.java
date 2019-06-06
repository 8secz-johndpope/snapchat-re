package com.snapchat.client;

public final class ClientLoader {
    private static final String TAG = "ClientLoader";
    private static volatile Result sNativeLibLoadedSuccessfully;

    public static class Result {
        public final String errorName;
        public final String errorReason;
        public final String errorType;
        public final boolean shouldLogResult;
        public final boolean success;

        public Result(boolean z, boolean z2, String str, String str2, String str3) {
            this.success = z;
            this.shouldLogResult = z2;
            this.errorName = str;
            this.errorReason = str2;
            this.errorType = str3;
        }

        static Result success() {
            return new Result(true, true, null, null, null);
        }
    }

    public static Result checkIfLoadedOrTryToLoad() {
        Result result = sNativeLibLoadedSuccessfully;
        if (result == null) {
            synchronized (ClientLoader.class) {
                result = sNativeLibLoadedSuccessfully;
                if (result == null) {
                    result = loadNative();
                    sNativeLibLoadedSuccessfully = new Result(result.success, false, result.errorName, result.errorReason, result.errorType);
                }
            }
        }
        return result;
    }

    private static Result loadNative() {
        try {
            LoadAllLibraries.run();
            return Result.success();
        } catch (Throwable th) {
            String str = th.getMessage() != null ? th.getMessage().contains("c++_shared") ? "HELLO_LLVMSTL_LOAD_FAILED" : "HELLO_OTHER_LOAD_FAILED" : "HELLO_NULL_LOAD_FAILED";
            return new Result(false, true, str, th.getMessage(), th.getClass().getSimpleName());
        }
    }
}
