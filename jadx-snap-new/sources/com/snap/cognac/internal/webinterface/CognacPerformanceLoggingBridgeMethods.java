package com.snap.cognac.internal.webinterface;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.snap.cognac.internal.webinterface.CognacSettingsBridgeMethods.SnapCanvasInitializeListener;
import com.snapchat.bridgeWebview.Message;
import defpackage.acbq;
import defpackage.acbq.a;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajee;
import defpackage.ajef;
import defpackage.ezd;
import defpackage.fgz;
import defpackage.fhe;
import defpackage.iha;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CognacPerformanceLoggingBridgeMethods extends fgz implements SnapCanvasInitializeListener {
    private static final String TAG = "CognacPerformanceLoggingBridgeMethods";
    private static final Set<String> methods = ImmutableSet.of("startLoggingFPS", "endLoggingFPS");
    public boolean isPerfAutomationMode = true;
    private LoggingState mLoggingState;
    private aipn<iha> mSerializationHelper;
    private aipn<ezd> mTweakService;

    enum LoggingState {
        NOT_STARTED,
        STARTED,
        ENDED
    }

    public CognacPerformanceLoggingBridgeMethods(acbq acbq, aipn<iha> aipn, aipn<ezd> aipn2) {
        super(acbq);
        this.mSerializationHelper = aipn;
        this.mTweakService = aipn2;
        this.mLoggingState = LoggingState.NOT_STARTED;
    }

    private static void getFPS(acbq acbq, a aVar) {
        Message message = new Message();
        message.method = "getTestAutomationMetrics";
        message.params = new HashMap();
        acbq.a(message, aVar);
    }

    private void recordFPSMetrics() {
        if (this.mLoggingState == LoggingState.NOT_STARTED) {
            this.mLoggingState = LoggingState.STARTED;
            this.mDisposable.a(ajcx.a(new -$$Lambda$CognacPerformanceLoggingBridgeMethods$pA4ZD8BSaNlfOo9xvf9xG-MFsbI(this)).b(ajee.a(ajef.a)).e());
        }
    }

    public void endLoggingFPS(Message message) {
        if (this.isPerfAutomationMode && ((ezd) this.mTweakService.get()).w()) {
            logPerfLogs(null);
        }
    }

    public Set<String> getMethods() {
        return methods;
    }

    public /* synthetic */ void lambda$logPerfLogs$0$CognacPerformanceLoggingBridgeMethods(CognacFPSAnalyticsListener cognacFPSAnalyticsListener, String str) {
        fhe fhe = (fhe) ((iha) this.mSerializationHelper.get()).a(str, fhe.class);
        if (fhe != null && fhe.metrics != null) {
            Map map = fhe.metrics;
            double intValue = (double) ((Integer) map.get(fhe.AVERAGE_FPS_60S)).intValue();
            double intValue2 = (double) ((Integer) map.get(fhe.LOWEST_AVG_FPS_5S)).intValue();
            ImmutableMap.of("fps_mean", Double.valueOf(intValue));
            String str2 = "fps";
            ImmutableMap.of(str2, Double.valueOf(intValue2));
            ImmutableMap.of(str2, map.get(fhe.GOOD_SECONDS_COUNT));
            if (cognacFPSAnalyticsListener != null) {
                cognacFPSAnalyticsListener.onGetFPS(intValue2, intValue);
            }
        }
    }

    public /* synthetic */ void lambda$recordFPSMetrics$1$CognacPerformanceLoggingBridgeMethods() {
        this.mBridgeWebview.evaluateJavascript("var fpsMetrics = {};\nfpsMetrics.lastFiveFps = [];\nfpsMetrics.lastSixtyFps = [];\nfpsMetrics.lastFiveFpsSum = 0;\nfpsMetrics.lastSixtyFpsSum = 0;\nfpsMetrics.averageFpsLastFiveSec = 0;\nfpsMetrics.averageFpsLastSixtySec = 0;\nfpsMetrics.lowestAverageFpsForFiveSec = Number.MAX_VALUE;\nfpsMetrics.numFrames = 0;\nfpsMetrics.timer = 0;\nvar currentTime = 0;\nfpsMetrics.goodSeconds = [];\nfpsMetrics.currentSecondIsGood = true;\nfpsMetrics.goodSecondsCount = 0;\nsc._b.registerHandler('getTestAutomationMetrics', function (response, callback) {\n   callback({\n       metrics: {\n           AVERAGE_FPS_60S: fpsMetrics.averageFpsLastSixtySec,\n           LOWEST_AVG_FPS_5S: fpsMetrics.lowestAverageFpsForFiveSec,\n           GOOD_SECONDS_COUNT: fpsMetrics.goodSecondsCount,\n       }\n   });\n});\nif (window.pc) {   window.pc.app.on('update', function (dt) {\n       fpsMetrics.numFrames++;\n       if (currentTime == 0) {           currentTime = pc.now();\n           return;\n       }\n       var timeDiff = pc.now() - currentTime;\n       currentTime += timeDiff;\n       fpsMetrics.timer += timeDiff;\n       if (timeDiff > 50) {\n           fpsMetrics.currentSecondIsGood = false;\n       }\n       if (fpsMetrics.timer >= 1000) {\n           fpsMetrics.lastFiveFpsSum += fpsMetrics.numFrames;\n           fpsMetrics.lastFiveFps.push(fpsMetrics.numFrames);\n           while (fpsMetrics.lastFiveFps.length > 5) {\n               fpsMetrics.lastFiveFpsSum -= fpsMetrics.lastFiveFps.shift();\n           }\n           fpsMetrics.lastSixtyFpsSum += fpsMetrics.numFrames;\n           fpsMetrics.lastSixtyFps.push(fpsMetrics.numFrames);\n           while (fpsMetrics.lastSixtyFps.length > 60) {\n               fpsMetrics.lastSixtyFpsSum -= fpsMetrics.lastSixtyFps.shift();\n           }\n           if (fpsMetrics.numFrames < 30) {\n               fpsMetrics.currentSecondIsGood = false;\n           }\n           if (fpsMetrics.currentSecondIsGood == true) {\n               fpsMetrics.goodSeconds.push(1);\n               fpsMetrics.goodSecondsCount += 1;\n           } else {\n               fpsMetrics.goodSeconds.push(0);\n           }\n           while (fpsMetrics.goodSeconds.length > 60) {\n               fpsMetrics.goodSecondsCount -= fpsMetrics.goodSeconds.shift();\n           }\n           fpsMetrics.averageFpsLastFiveSec = Math.round(fpsMetrics.lastFiveFpsSum /    fpsMetrics.lastFiveFps.length);\n           fpsMetrics.averageFpsLastSixtySec = Math.round(fpsMetrics.lastSixtyFpsSum /    fpsMetrics.lastSixtyFps.length);\n           if (fpsMetrics.lastFiveFps.length == 5) {\n               fpsMetrics.lowestAverageFpsForFiveSec = Math.min(fpsMetrics   .lowestAverageFpsForFiveSec,    fpsMetrics.averageFpsLastFiveSec);\n           }\n           fpsMetrics.numFrames = 0;\n           fpsMetrics.currentSecondIsGood = true;\n           fpsMetrics.timer -= 1000;\n       }\n   });}", null);
    }

    public void logPerfLogs(CognacFPSAnalyticsListener cognacFPSAnalyticsListener) {
        if (this.mLoggingState == LoggingState.STARTED) {
            this.mLoggingState = LoggingState.ENDED;
            getFPS(this.mBridgeWebview, new -$$Lambda$CognacPerformanceLoggingBridgeMethods$2orqStV1dPVkbd0Z3JHY3X3galk(this, cognacFPSAnalyticsListener));
        }
    }

    public void onInitialized() {
        if (this.isPerfAutomationMode && !((ezd) this.mTweakService.get()).w()) {
            recordFPSMetrics();
        }
    }

    public void startLoggingFPS(Message message) {
        if (this.isPerfAutomationMode && ((ezd) this.mTweakService.get()).w()) {
            recordFPSMetrics();
        }
    }
}
