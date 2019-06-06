package com.google.android.gms.internal;

@zzabh
final class zzabu extends Exception {
    private final int mErrorCode;

    public zzabu(String str, int i) {
        super(str);
        this.mErrorCode = i;
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }
}
