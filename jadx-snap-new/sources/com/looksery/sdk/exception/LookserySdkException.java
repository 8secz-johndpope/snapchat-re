package com.looksery.sdk.exception;

public class LookserySdkException extends RuntimeException {
    private final Report mReport;

    static class Report {
        final String lensId;
        final String nativeBacktrace;
        final String nativeName;
        final String reason;
        final String upcomingLensId;

        Report(String str, String str2, String str3, String str4, String str5) {
            this.nativeName = str;
            this.reason = str2;
            this.lensId = str3;
            this.upcomingLensId = str4;
            this.nativeBacktrace = str5;
        }
    }

    LookserySdkException(Report report) {
        StringBuilder stringBuilder = new StringBuilder("lensId: ");
        stringBuilder.append(report.lensId);
        stringBuilder.append(", upcomingLensId: ");
        stringBuilder.append(report.upcomingLensId);
        stringBuilder.append("\ndetails: ");
        stringBuilder.append(report.nativeName);
        stringBuilder.append(": ");
        stringBuilder.append(report.reason);
        stringBuilder.append("\nbacktrace:\n");
        stringBuilder.append(report.nativeBacktrace);
        stringBuilder.append("\n");
        super(stringBuilder.toString());
        this.mReport = report;
    }

    public String getExceptionName() {
        return this.mReport.nativeName;
    }

    public String getExceptionReason() {
        return this.mReport.reason;
    }

    public String getLensId() {
        return this.mReport.lensId;
    }

    public String getNativeBacktrace() {
        return this.mReport.nativeBacktrace;
    }

    public String getUpcomingLensId() {
        return this.mReport.upcomingLensId;
    }
}
