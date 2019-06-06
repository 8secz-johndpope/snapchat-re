package com.snap.cognac.internal.webinterface;

import defpackage.acbq.a;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$CognacPerformanceLoggingBridgeMethods$2orqStV1dPVkbd0Z3JHY3X3galk implements a {
    private final /* synthetic */ CognacPerformanceLoggingBridgeMethods f$0;
    private final /* synthetic */ CognacFPSAnalyticsListener f$1;

    public /* synthetic */ -$$Lambda$CognacPerformanceLoggingBridgeMethods$2orqStV1dPVkbd0Z3JHY3X3galk(CognacPerformanceLoggingBridgeMethods cognacPerformanceLoggingBridgeMethods, CognacFPSAnalyticsListener cognacFPSAnalyticsListener) {
        this.f$0 = cognacPerformanceLoggingBridgeMethods;
        this.f$1 = cognacFPSAnalyticsListener;
    }

    public final void onReceiveValue(String str) {
        this.f$0.lambda$logPerfLogs$0$CognacPerformanceLoggingBridgeMethods(this.f$1, str);
    }
}
