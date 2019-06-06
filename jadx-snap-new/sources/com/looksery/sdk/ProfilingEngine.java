package com.looksery.sdk;

import android.content.Context;
import java.io.File;

public final class ProfilingEngine implements NativeBridge {
    private static final String CACHE_SUBDIRECTORY = "/profiling/";
    private static final int profilingEngineBackendTypePLOG = 1;
    private static final int profilingEngineBackendTypeSTATISTICAL = Integer.MIN_VALUE;
    private static final int profilingEngineBackendTypeSYSTRACE = 2;
    public static long sFilterFrontEndCPU = 0;
    private static ProfilingEngine sInstance = new ProfilingEngine();
    private static long sNativeInstance;
    private static boolean sSessionActive = false;

    private ProfilingEngine() {
        LSNativeLibraryLoader.ensureAllAreLoaded();
    }

    public static boolean beginGPUScope(long j, String str) {
        return sSessionActive && sInstance.nativeGPUMarkerScopeBegin(j, str);
    }

    public static synchronized void beginRuntimeReport() {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeAddRunningMode(Integer.MIN_VALUE);
                sInstance.nativeBeginRuntimeReport();
            }
        }
    }

    public static boolean beginScope(long j, String str) {
        return sSessionActive && sInstance.nativeMarkerScopeBegin(j, str);
    }

    public static boolean beginScope(String str) {
        return beginScope(sFilterFrontEndCPU, str);
    }

    public static void cpuFrameBegin() {
        if (sSessionActive) {
            sInstance.nativeCPUFrameBegin();
        }
    }

    public static void cpuFrameEnd() {
        if (sSessionActive) {
            sInstance.nativeCPUFrameEnd();
        }
    }

    public static synchronized void create(Context context) {
        synchronized (ProfilingEngine.class) {
            sInstance.instanceCreate(context);
        }
    }

    public static synchronized void disableFilter(String str) {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeDisableFilter(str);
            }
        }
    }

    public static synchronized void enableFilter(String str) {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeEnableFilter(str);
            }
        }
    }

    public static boolean endGPUScope(long j, String str) {
        return sSessionActive && sInstance.nativeGPUMarkerScopeEnd(j, str);
    }

    public static synchronized void endRuntimeReport() {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeEndRuntimeReport();
                sInstance.nativeRemoveRunningMode(Integer.MIN_VALUE);
            }
        }
    }

    public static boolean endScope(long j, String str) {
        return sSessionActive && sInstance.nativeMarkerScopeEnd(j, str);
    }

    public static boolean endScope(String str) {
        return endScope(sFilterFrontEndCPU, str);
    }

    public static synchronized void endSession() {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeRemoveRunningMode(1);
                sInstance.nativeDisableAllFilters();
            }
        }
    }

    public static void frameIncrement() {
        if (sSessionActive) {
            sInstance.nativeFrameIncrement();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x002f in {9, 11, 15, 18} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static synchronized java.lang.String[] getAllFilters() {
        /*
        r0 = com.looksery.sdk.ProfilingEngine.class;
        monitor-enter(r0);
        r1 = sNativeInstance;	 Catch:{ all -> 0x002c }
        r3 = 0;	 Catch:{ all -> 0x002c }
        r5 = 0;	 Catch:{ all -> 0x002c }
        r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ all -> 0x002c }
        if (r6 == 0) goto L_0x0028;	 Catch:{ all -> 0x002c }
        r1 = sInstance;	 Catch:{ all -> 0x002c }
        r1 = r1.nativeGetFilterCount();	 Catch:{ all -> 0x002c }
        r1 = new java.lang.String[r1];	 Catch:{ all -> 0x002c }
        r2 = r1.length;	 Catch:{ all -> 0x002c }
        if (r5 >= r2) goto L_0x0026;	 Catch:{ all -> 0x002c }
        r2 = sInstance;	 Catch:{ all -> 0x002c }
        r3 = r2.nativeGetFilterFromIndex(r5);	 Catch:{ all -> 0x002c }
        r2 = r2.nativeGetFilterName(r3);	 Catch:{ all -> 0x002c }
        r1[r5] = r2;	 Catch:{ all -> 0x002c }
        r5 = r5 + 1;
        goto L_0x0014;
        monitor-exit(r0);
        return r1;
        r1 = new java.lang.String[r5];	 Catch:{ all -> 0x002c }
        monitor-exit(r0);
        return r1;
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.ProfilingEngine.getAllFilters():java.lang.String[]");
    }

    public static synchronized String getReportString() {
        synchronized (ProfilingEngine.class) {
            String nativeGetReportString;
            if (sNativeInstance != 0) {
                nativeGetReportString = sInstance.nativeGetReportString();
                return nativeGetReportString;
            }
            nativeGetReportString = "{\"error\" : \"Trying to get report from uninitialized engine\"}";
            return nativeGetReportString;
        }
    }

    public static void gpuFrameBegin() {
        if (sSessionActive) {
            sInstance.nativeGPUFrameBegin();
        }
    }

    public static void gpuFrameEnd() {
        if (sSessionActive) {
            sInstance.nativeGPUFrameEnd();
        }
    }

    private void instanceCreate(Context context) {
        if (sNativeInstance == 0) {
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(externalCacheDir.getAbsolutePath());
                stringBuilder.append(CACHE_SUBDIRECTORY);
                sNativeInstance = nativeCreateProfilingEngine(stringBuilder.toString());
                sFilterFrontEndCPU = nativeGetFilterFromName("FrontEndCPU");
                if (sNativeInstance != 0) {
                    sInstance.nativeAddRunningMode(2);
                    sInstance.nativeRemoveRunningMode(1);
                }
            }
        }
    }

    public static boolean markerString(long j, String str) {
        return sSessionActive && sInstance.nativeMarkerString(j, str);
    }

    public static boolean markerString(String str) {
        return markerString(sFilterFrontEndCPU, str);
    }

    private native void nativeAddRunningMode(int i);

    private native void nativeBeginRuntimeReport();

    private native void nativeCPUFrameBegin();

    private native void nativeCPUFrameEnd();

    private static native long nativeCreateProfilingEngine(String str);

    private native void nativeDisableAllFilters();

    private native void nativeDisableFilter(String str);

    private native void nativeEnableAllFilters();

    private native void nativeEnableFilter(String str);

    private native void nativeEndRuntimeReport();

    private native void nativeFrameIncrement();

    private native void nativeGPUFrameBegin();

    private native void nativeGPUFrameEnd();

    private native boolean nativeGPUMarkerScopeBegin(long j, String str);

    private native boolean nativeGPUMarkerScopeEnd(long j, String str);

    private native int nativeGetFilterCount();

    private native long nativeGetFilterFromIndex(int i);

    private native long nativeGetFilterFromName(String str);

    private native String nativeGetFilterName(long j);

    private native String nativeGetReportString();

    private native boolean nativeMarkerScopeBegin(long j, String str);

    private native boolean nativeMarkerScopeEnd(long j, String str);

    private native boolean nativeMarkerString(long j, String str);

    private native void nativeRemoveRunningMode(int i);

    private static void setSessionActive(boolean z) {
        sSessionActive = z;
    }

    public static synchronized void startSession() {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeDisableAllFilters();
                sInstance.nativeAddRunningMode(1);
                sInstance.nativeEnableAllFilters();
            }
        }
    }

    public static synchronized void switchToPLogRunningMode() {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeAddRunningMode(1);
                sInstance.nativeRemoveRunningMode(2);
            }
        }
    }

    public static synchronized void switchToSystraceRunningMode() {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeAddRunningMode(2);
                sInstance.nativeRemoveRunningMode(1);
            }
        }
    }

    public static synchronized void sync() {
        synchronized (ProfilingEngine.class) {
            if (sNativeInstance != 0) {
                sInstance.nativeSync();
            }
        }
    }

    public final long getNativeHandle() {
        return sNativeInstance;
    }

    public final native void nativeSync();
}
