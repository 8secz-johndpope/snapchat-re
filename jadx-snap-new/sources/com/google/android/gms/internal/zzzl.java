package com.google.android.gms.internal;

public final class zzzl extends Exception {
    private final int mErrorCode;

    public zzzl(String str, int i) {
        super(str);
        this.mErrorCode = i;
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }
}
