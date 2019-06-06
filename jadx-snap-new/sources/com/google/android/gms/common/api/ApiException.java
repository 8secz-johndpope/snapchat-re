package com.google.android.gms.common.api;

public class ApiException extends Exception {
    protected final Status mStatus;

    public ApiException(Status status) {
        int statusCode = status.getStatusCode();
        Object statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(statusMessage).length() + 13);
        stringBuilder.append(statusCode);
        stringBuilder.append(": ");
        stringBuilder.append(statusMessage);
        super(stringBuilder.toString());
        this.mStatus = status;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }
}
