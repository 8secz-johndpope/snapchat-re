package com.samsung.android.sdk.camera;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.util.Log;
import com.samsung.android.sdk.camera.delegator.AbstractSemCamera;

public class SCamera {
    public static final int AVAILABILITY_SUPPORTED = 0;
    public static final int AVAILABILITY_UNSUPPORTED_DEVICE = 2;
    public static final int AVAILABILITY_UNSUPPORTED_VENDOR = 1;
    public static final String CAMERA_ID_FRONT = "1";
    private static final String CAMERA_ID_REAR = "0";
    public static final int FEATURE_CAPTURE_PROCESSOR = 1;
    private static final String MICRO_VERSION_NAME = "2";
    private static final String SCAMERA_SERVICE_PACKAGE = "com.samsung.android.camerasdkservice";
    static final int SEP_VERSION_10_1 = 100100;
    static final int SEP_VERSION_10_2 = 100200;
    private static final String TAG = "SCamera";
    private static final int VERSION_CODE = 100;
    private static final String VERSION_NAME = "2.0.0";
    private static SCamera mSCamera;
    private Context mContext;
    private AbstractSemCamera mSemCamera = null;

    private SCamera() {
        Log.i(TAG, "SCamera SDK version: 2.0.0 mver: 2");
    }

    public static synchronized SCamera getInstance() {
        SCamera sCamera;
        synchronized (SCamera.class) {
            if (mSCamera == null) {
                mSCamera = new SCamera();
            }
            sCamera = mSCamera;
        }
        return sCamera;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:15:0x0034 in {6, 7, 8, 11, 14} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private synchronized com.samsung.android.sdk.camera.delegator.AbstractSemCamera getSemCamera() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.mSemCamera;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x002d;	 Catch:{ all -> 0x0031 }
        r0 = r4.mContext;	 Catch:{ all -> 0x0031 }
        r0 = com.samsung.android.sdk.camera.delegator.AbstractSemCamera.getSepPlatformVersion(r0);	 Catch:{ all -> 0x0031 }
        r1 = TAG;	 Catch:{ all -> 0x0031 }
        r2 = " getSeCamera SEP VERSION: ";	 Catch:{ all -> 0x0031 }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0031 }
        r2 = r2.concat(r3);	 Catch:{ all -> 0x0031 }
        android.util.Log.i(r1, r2);	 Catch:{ all -> 0x0031 }
        r1 = 100100; // 0x18704 float:1.4027E-40 double:4.9456E-319;	 Catch:{ all -> 0x0031 }
        if (r0 < r1) goto L_0x0027;	 Catch:{ all -> 0x0031 }
        r0 = new com.samsung.android.sdk.camera.delegator.SemCamera10_1;	 Catch:{ all -> 0x0031 }
        r0.<init>();	 Catch:{ all -> 0x0031 }
        r4.mSemCamera = r0;	 Catch:{ all -> 0x0031 }
        goto L_0x002d;	 Catch:{ all -> 0x0031 }
        r0 = new com.samsung.android.sdk.camera.delegator.SemCameraDefault;	 Catch:{ all -> 0x0031 }
        r0.<init>();	 Catch:{ all -> 0x0031 }
        goto L_0x0024;	 Catch:{ all -> 0x0031 }
        r0 = r4.mSemCamera;	 Catch:{ all -> 0x0031 }
        monitor-exit(r4);
        return r0;
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.sdk.camera.SCamera.getSemCamera():com.samsung.android.sdk.camera.delegator.AbstractSemCamera");
    }

    private static boolean isNonCompatibleBinary() {
        String str = Build.MANUFACTURER;
        String str2 = Build.DEVICE;
        String str3 = Build.DISPLAY;
        return (str == null || str2 == null || str3 == null) ? true : (str.toLowerCase().contains("samsung") && str2.toLowerCase().contains("beyond")) ? str3.toUpperCase().endsWith("SAT") || str3.toUpperCase().endsWith("SAU") : false;
    }

    private boolean isSDKServiceOnDevice(Context context) {
        this.mContext = context;
        try {
            return context.getPackageManager().getPackageInfo(SCAMERA_SERVICE_PACKAGE, 0) != null;
        } catch (NameNotFoundException unused) {
            return false;
        } catch (NullPointerException unused2) {
            throw new IllegalArgumentException("Context is invalid");
        }
    }

    private boolean isSEPSupported(Context context) {
        int sepPlatformVersion = AbstractSemCamera.getSepPlatformVersion(this.mContext);
        Log.i(TAG, " getSeCamera SEP VERSION: ".concat(String.valueOf(sepPlatformVersion)));
        return sepPlatformVersion >= SEP_VERSION_10_1;
    }

    /* JADX WARNING: Missing block: B:14:0x0021, code skipped:
            return 2;
     */
    public int checkAvailability(android.content.Context r3) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x0022;
    L_0x0002:
        r0 = com.samsung.android.sdk.camera.util.SsdkVendorCheck.isSamsungDevice();
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r3 = 1;
        return r3;
    L_0x000a:
        r0 = r2.isSDKServiceOnDevice(r3);
        r1 = 2;
        if (r0 == 0) goto L_0x0021;
    L_0x0011:
        r3 = r2.isSEPSupported(r3);
        if (r3 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0021;
    L_0x0018:
        r3 = isNonCompatibleBinary();
        if (r3 == 0) goto L_0x001f;
    L_0x001e:
        return r1;
    L_0x001f:
        r3 = 0;
        return r3;
    L_0x0021:
        return r1;
    L_0x0022:
        r3 = new java.lang.IllegalArgumentException;
        r0 = "context cannot be null";
        r3.<init>(r0);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.samsung.android.sdk.camera.SCamera.checkAvailability(android.content.Context):int");
    }

    public int getVersionCode() {
        return 100;
    }

    public String getVersionName() {
        return VERSION_NAME;
    }

    public boolean isFeatureEnabled(Context context, String str, int i) {
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        } else if (str == null) {
            throw new IllegalArgumentException("cameraId cannot be null");
        } else if (str.equals(CAMERA_ID_REAR) || str.equals(CAMERA_ID_FRONT)) {
            return checkAvailability(context) != 0 ? false : getSemCamera().isFeatureEnabled(context, str, i);
        } else {
            throw new IllegalArgumentException("cameraId unsupported by SDK");
        }
    }
}
