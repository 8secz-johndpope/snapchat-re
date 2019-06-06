package com.snapchat.client.graphene;

public final class MetricsPayload {
    final DiagnosticInfo mDiagnostics;
    final byte[] mFrame;

    public MetricsPayload(byte[] bArr, DiagnosticInfo diagnosticInfo) {
        this.mFrame = bArr;
        this.mDiagnostics = diagnosticInfo;
    }

    public final DiagnosticInfo getDiagnostics() {
        return this.mDiagnostics;
    }

    public final byte[] getFrame() {
        return this.mFrame;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MetricsPayload{mFrame=");
        stringBuilder.append(this.mFrame);
        stringBuilder.append(",mDiagnostics=");
        stringBuilder.append(this.mDiagnostics);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
