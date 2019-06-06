package com.looksery.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.Log;
import com.looksery.sdk.audio.AudioPlaybackService;
import com.looksery.sdk.audio.ScenariumAudioPlaybackService;
import com.looksery.sdk.domain.AspectRatioMode;
import com.looksery.sdk.domain.Bitmoji3dData;
import com.looksery.sdk.domain.Category;
import com.looksery.sdk.domain.ComplexEffectDescriptor;
import com.looksery.sdk.domain.CoreConfiguration;
import com.looksery.sdk.domain.CrashCrumb;
import com.looksery.sdk.domain.GeoData;
import com.looksery.sdk.domain.LSCoreManagerOutputType;
import com.looksery.sdk.domain.LensAnalyticsData;
import com.looksery.sdk.domain.LensUserData;
import com.looksery.sdk.domain.RecordingState;
import com.looksery.sdk.domain.ScreenZoneInfo;
import com.looksery.sdk.domain.Size;
import com.looksery.sdk.domain.StickerMegapack;
import com.looksery.sdk.domain.UriResponse;
import com.looksery.sdk.io.LensCoreResources;
import com.looksery.sdk.listener.AnalyticsListener;
import com.looksery.sdk.listener.CategoryActivationListener;
import com.looksery.sdk.listener.ClientInterfaceListener;
import com.looksery.sdk.listener.ClientInterfaceListener.InterfaceAction;
import com.looksery.sdk.listener.ClientInterfaceListener.InterfaceControl;
import com.looksery.sdk.listener.CryptographyDelegate;
import com.looksery.sdk.listener.DebugListener;
import com.looksery.sdk.listener.EmojiRasterizer;
import com.looksery.sdk.listener.ExpressionsListener;
import com.looksery.sdk.listener.FaceRegionsListener;
import com.looksery.sdk.listener.GeoDataListener;
import com.looksery.sdk.listener.HintsListener;
import com.looksery.sdk.listener.LensBitmoji3dListener;
import com.looksery.sdk.listener.LensBitmojiListener;
import com.looksery.sdk.listener.LensDataListener;
import com.looksery.sdk.listener.LensLifeCycleListener;
import com.looksery.sdk.listener.LocalizationListener;
import com.looksery.sdk.listener.LookseryNativeExceptionListener;
import com.looksery.sdk.listener.PersistenceListener;
import com.looksery.sdk.listener.PlatformTrackingDelegate;
import com.looksery.sdk.listener.ProfilerEventListener;
import com.looksery.sdk.listener.RemoteAssetsListener;
import com.looksery.sdk.listener.SnapRecordingListener;
import com.looksery.sdk.listener.SnapcodeAnalyzerListener;
import com.looksery.sdk.listener.SnapcodeListener;
import com.looksery.sdk.listener.UpdateDrawingHistoryListener;
import com.looksery.sdk.listener.UriListener;
import com.looksery.sdk.listener.UserDataListener;
import com.looksery.sdk.media.VideoCodecFactory;
import com.looksery.sdk.touch.Touch;
import com.looksery.sdk.touch.TouchEvent;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;

public class LSCoreManagerWrapper implements NativeBridge {
    private static final boolean DEBUG = false;
    public static final String RESOURCE_SOURCE_ASSET = "asset:";
    public static final String RESOURCE_SOURCE_FILE = "file:";
    private static final String TAG = "com.looksery.sdk.LSCoreManagerWrapper";
    private final TimestampConverter mCameraTimestampConverter = new TimestampConverter("camera");
    private boolean mIsFrontCameraEnabled = true;
    private final SafeNativeBridge mNativeBridge;
    private final SwitchableDeviceMotionTracker mSwitchableDeviceMotionTracker;

    public LSCoreManagerWrapper(Context context, CoreConfiguration coreConfiguration) {
        if (EGL14.EGL_NO_CONTEXT.equals(EGL14.eglGetCurrentContext())) {
            throw new IllegalStateException("Core can not be created with no active EGL context.");
        }
        LSNativeLibraryLoader.ensureAllAreLoaded();
        LensCoreResources.initializeOnce(context);
        setResourcePath(coreConfiguration);
        setInstrumentationDelegates(coreConfiguration.getInstrumentationDelegatesFactory());
        long nativeInit = nativeInit(context, coreConfiguration.shouldDisableTracking(), coreConfiguration.getVideoCodecFactory(), coreConfiguration.getExperimentProvider(), coreConfiguration.preferGmsFaceDetector());
        if (nativeInit == 0) {
            throwUnsupportedEnvironmentException(context);
        }
        this.mNativeBridge = new SafeNativeBridge(nativeInit, new Runnable() {
            public void run() {
                LSCoreManagerWrapper.this.nativeRelease();
            }
        });
        setLocalizationListener(new DefaultLocalizationListener());
        this.mSwitchableDeviceMotionTracker = new SwitchableDeviceMotionTracker();
        nativeSetDeviceMotionTracker(this.mSwitchableDeviceMotionTracker);
    }

    private void createDirectories(String str) {
        String str2;
        Uri parse = Uri.parse(str);
        if ("file".equals(parse.getScheme())) {
            File file = new File(parse.getPath());
            StringBuilder stringBuilder;
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    str2 = TAG;
                    stringBuilder = new StringBuilder("mkdirs() failed for ");
                    stringBuilder.append(file.getAbsolutePath());
                    Log.w(str2, stringBuilder.toString());
                }
                return;
            } else if (!file.isDirectory()) {
                str2 = TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append(file.getAbsolutePath());
                stringBuilder.append(" must be a directory");
                str = stringBuilder.toString();
            } else {
                return;
            }
        }
        str2 = TAG;
        str = "Can not create directories for ".concat(String.valueOf(str));
        Log.w(str2, str);
    }

    private native void nativeAddRecordedTrackingDataWithPath(String str);

    private native void nativeApplyComplexEffect(ComplexEffectDescriptor complexEffectDescriptor);

    private native void nativeApplyComplexEffectAsync(ComplexEffectDescriptor complexEffectDescriptor);

    private native void nativeApplySoundEffectsToInt16Data(byte[] bArr, int i, int i2);

    private native void nativeClearMarkerTrackingData();

    private native void nativeClearRecordedTrackingData();

    private native void nativeClearResources();

    private native int nativeCreateTexture();

    private native void nativeDeinitializeUnusedFilters();

    private native void nativeDrawExternalTexture(int i, int i2, int i3, float[] fArr, float[] fArr2);

    private native void nativeDrawTexture(int i, int i2, int i3, float[] fArr, boolean z);

    private native int nativeDrawing2DDeserializeData(String str, String str2);

    private native void nativeDrawing2DSelectBrush(String str, String str2);

    private native String nativeDrawing2DSerializeData(String str);

    private native void nativeDrawing2DSetColor(String str, int i);

    private native void nativeDrawing2DSetDrawOverlayMode(String str, boolean z);

    private native void nativeDrawing2DSetOnUpdateDrawingHistoryListener(String str, UpdateDrawingHistoryListener updateDrawingHistoryListener);

    private native void nativeDrawing2DSetUnicodeSymbol(String str, String str2);

    private native void nativeDrawing2DSetWidth(String str, float f);

    private native int nativeDrawing2DUndo(String str);

    private native void nativeFillResultTextureTransformationMatrix(int i, float[] fArr, boolean z, boolean z2);

    private native int nativeGetMemoryUsageEstimation();

    private native int nativeGetResultTexture(int i, boolean z);

    private native void nativeHandleClientInterfaceAction(String str, InterfaceControl interfaceControl, InterfaceAction interfaceAction);

    private native boolean nativeHasComplexEffect();

    private native long nativeInit(Context context, boolean z, VideoCodecFactory videoCodecFactory, ExperimentProvider experimentProvider, boolean z2);

    private native CrashCrumb[] nativePickRecentCrashCrumbs();

    private native boolean nativeProcessBitmap(Bitmap bitmap, Bitmap bitmap2, double d, int i, boolean z);

    private native int nativeProcessFrameToTexture(int i, int i2, double d, float[] fArr, float[] fArr2, int i3, int i4);

    private native void nativeProcessPanGesture(int i, float f, float f2, float f3, float f4, int i2);

    private native void nativeProcessPinchGesture(int i, float f, float f2, float f3);

    private native void nativeProcessRotateGesture(int i, float f, float f2, float f3);

    private native void nativeProcessTapGesture(int i, float f, float f2);

    private native int nativeProcessTextureToTexture(int i, double d, int i2, float[] fArr, float[] fArr2, int i3, int i4);

    private native void nativeProcessTouch(TouchEvent touchEvent);

    private native void nativeProvideBitmojiImage(BitmojiType bitmojiType, String str, Bitmap bitmap, boolean z, int i);

    private native void nativeProvideBitmojiImageWithIds(BitmojiType bitmojiType, String str, String str2, String str3, Bitmap bitmap, boolean z, int i);

    private native void nativeProvideRemoteAsset(String str, String str2, String str3);

    private native void nativeProvideStickerMegapack(String str, StickerMegapack stickerMegapack);

    private native void nativeProvideUriResponse(String str, UriResponse uriResponse);

    private native void nativeRelease();

    private native void nativeRemoteAssetUploaded(boolean z, String str);

    private native void nativeRemoveAppliedComplexEffect();

    private native void nativeResetAsyncTextureReaderCache();

    private native void nativeRestartTracking(boolean z, int i, int i2);

    private native void nativeRestorePersistentStore(String str, byte[] bArr);

    private native boolean nativeSaveFrame(boolean z, Bitmap bitmap);

    private native void nativeSetAnalyticsListener(AnalyticsListener analyticsListener);

    private native void nativeSetAsyncTrackingMode(boolean z);

    private native void nativeSetAudioParameters(int i, int i2, int i3);

    private native void nativeSetAudioPlaybackService(AudioPlaybackService audioPlaybackService);

    private native void nativeSetBitmoji3dMetadata(Bitmoji3dData bitmoji3dData);

    private native void nativeSetBitmojiAvailability(BitmojiType bitmojiType, BitmojiAvailability bitmojiAvailability);

    private native void nativeSetCameraParams(float f, float f2, int i);

    private native void nativeSetClientInterfaceListener(ClientInterfaceListener clientInterfaceListener);

    private native void nativeSetCryptographyDelegate(CryptographyDelegate cryptographyDelegate);

    private native void nativeSetDebugListener(DebugListener debugListener);

    private native void nativeSetDeviceClass(DeviceClass deviceClass);

    private native void nativeSetDeviceCompassTracker(DeviceCompassTracker deviceCompassTracker);

    private native void nativeSetDeviceLocationTracker(DeviceLocationTracker deviceLocationTracker);

    private native void nativeSetDeviceMotionTracker(DeviceMotionTracker deviceMotionTracker);

    private native void nativeSetEmojiRasterizer(EmojiRasterizer emojiRasterizer);

    private native void nativeSetExpressionsListener(ExpressionsListener expressionsListener);

    private native void nativeSetExternalImage(Bitmap bitmap, int i, int i2, int i3, int i4, int i5);

    private native void nativeSetExternalImage(String str, int i, int i2, int i3, int i4, int i5);

    private native void nativeSetFaceTrackingResourcesPath(String str);

    private native void nativeSetFramesDelay(int i);

    private native void nativeSetFrontCameraEnabled(boolean z);

    private native void nativeSetGeoData(GeoData geoData);

    private native void nativeSetGeoDataListener(GeoDataListener geoDataListener);

    private native void nativeSetHintsListener(HintsListener hintsListener);

    private native void nativeSetInitialisationAsync(boolean z);

    private native void nativeSetInitializationEffectEnabled(boolean z);

    private native void nativeSetInputImageSize(int i, int i2);

    private native void nativeSetInterfaceControlVisibility(String str, InterfaceControl interfaceControl, boolean z);

    private native void nativeSetLensBitmoji3dListener(LensBitmoji3dListener lensBitmoji3dListener);

    private native void nativeSetLensBitmojiListener(LensBitmojiListener lensBitmojiListener);

    private native void nativeSetLensData(LensAnalyticsData lensAnalyticsData);

    private native void nativeSetLensDataListener(LensDataListener lensDataListener);

    private native void nativeSetLensLifeCycleListener(LensLifeCycleListener lensLifeCycleListener);

    private native void nativeSetLocalizationListener(LocalizationListener localizationListener);

    private static native void nativeSetLogger(Logger logger);

    private native void nativeSetMarkerTrackingDataWithPath(String str);

    private native void nativeSetNativeExceptionListener(LookseryNativeExceptionListener lookseryNativeExceptionListener);

    private native void nativeSetOverlay(String str, int i);

    private native void nativeSetPersistenceListener(PersistenceListener persistenceListener);

    private native void nativeSetPlatformTrackingDelegate(PlatformTrackingDelegate platformTrackingDelegate);

    private static native void nativeSetProfilerEventListener(ProfilerEventListener profilerEventListener);

    private static native void nativeSetProfilerEventsEnabled(boolean z);

    private native void nativeSetRecordingState(RecordingState recordingState);

    private native void nativeSetRemoteAssetsListener(RemoteAssetsListener remoteAssetsListener);

    private native void nativeSetResourcePath(String str, String str2, String str3, String str4, String str5);

    private native void nativeSetScenariumAudioPlaybackService(ScenariumAudioPlaybackService scenariumAudioPlaybackService);

    private native void nativeSetScreenSize(int i, int i2);

    private native void nativeSetShouldCatchExceptions(boolean z);

    private native void nativeSetShouldCropToScreenSize(boolean z);

    private native void nativeSetSnapRecordingListener(SnapRecordingListener snapRecordingListener);

    private native void nativeSetSnapcodeAnalyzerListener(SnapcodeAnalyzerListener snapcodeAnalyzerListener);

    private native void nativeSetSnapcodeListener(SnapcodeListener snapcodeListener);

    private native void nativeSetTrackingEnabled(boolean z);

    private native void nativeSetUriListener(UriListener uriListener);

    private native void nativeSetUserData(LensUserData lensUserData);

    private native void nativeSetUserDataListener(UserDataListener userDataListener);

    private native boolean nativeShouldBlockTouch(float f, float f2, int i);

    private native void nativeStartFaceRegionsTracking(FaceRegionsListener faceRegionsListener);

    private native void nativeStartSnapcodeTracking();

    private native void nativeStartTrackingDataCollecting();

    private native void nativeStopFaceRegionsTracking();

    private native void nativeStopSnapcodeTracking();

    private native void nativeStopTrackingDataCollecting(String str);

    private native void nativeTryToActivateCategories(int i, int i2, Category[] categoryArr, CategoryActivationListener categoryActivationListener);

    private native void nativeUpdateScreenZonesInfo(ScreenZoneInfo[] screenZoneInfoArr);

    private native void nativeUsePreset(int i);

    private void setInstrumentationDelegates(InstrumentationDelegatesFactory instrumentationDelegatesFactory) {
        if (instrumentationDelegatesFactory != null) {
            nativeSetLogger(instrumentationDelegatesFactory.newLogger());
            ProfilerEventListener newProfilerEventListener = instrumentationDelegatesFactory.newProfilerEventListener();
            if (newProfilerEventListener != null) {
                nativeSetProfilerEventListener(newProfilerEventListener);
                nativeSetProfilerEventsEnabled(true);
                return;
            }
            nativeSetProfilerEventsEnabled(false);
            nativeSetProfilerEventListener(null);
        }
    }

    private void setResourcePath(CoreConfiguration coreConfiguration) {
        createDirectories(coreConfiguration.getDocumentsPath());
        createDirectories(coreConfiguration.getCachePath());
        createDirectories(coreConfiguration.getUserDataPath());
        nativeSetResourcePath(coreConfiguration.getCoreResourcesPath(), coreConfiguration.getResourcesPath(), coreConfiguration.getDocumentsPath(), coreConfiguration.getCachePath(), coreConfiguration.getUserDataPath());
    }

    private String sha256String(byte[] bArr) {
        try {
            bArr = MessageDigest.getInstance("SHA-256").digest(bArr);
            StringBuilder stringBuilder = new StringBuilder();
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                stringBuilder.append(String.format("%02X:", new Object[]{Byte.valueOf(bArr[i])}));
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "???";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0062 in {5, 7, 10} preds:[]
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
    @android.annotation.SuppressLint({"PackageManagerGetSignatures"})
    private void throwUnsupportedEnvironmentException(android.content.Context r7) {
        /*
        r6 = this;
        r0 = "Unsupported environment: ";
        r1 = r7.getPackageManager();	 Catch:{ NameNotFoundException -> 0x004c }
        r2 = r7.getPackageName();	 Catch:{ NameNotFoundException -> 0x004c }
        r3 = 64;	 Catch:{ NameNotFoundException -> 0x004c }
        r1 = r1.getPackageInfo(r2, r3);	 Catch:{ NameNotFoundException -> 0x004c }
        r2 = new java.util.ArrayList;
        r3 = r1.signatures;
        r3 = r3.length;
        r2.<init>(r3);
        r1 = r1.signatures;
        r3 = r1.length;
        r4 = 0;
        if (r4 >= r3) goto L_0x002e;
        r5 = r1[r4];
        r5 = r5.toByteArray();
        r5 = r6.sha256String(r5);
        r2.add(r5);
        r4 = r4 + 1;
        goto L_0x001c;
        r1 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r0);
        r7 = r7.getPackageName();
        r3.append(r7);
        r7 = ", ";
        r3.append(r7);
        r3.append(r2);
        r7 = r3.toString();
        r1.<init>(r7);
        throw r1;
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r0);
        r7 = r7.getPackageName();
        r2.append(r7);
        r7 = r2.toString();
        r1.<init>(r7);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.LSCoreManagerWrapper.throwUnsupportedEnvironmentException(android.content.Context):void");
    }

    public void addRecordedTrackingDataWithPath(String str) {
        nativeAddRecordedTrackingDataWithPath(str);
    }

    public void applyComplexEffect(ComplexEffectDescriptor complexEffectDescriptor) {
        nativeApplyComplexEffect(complexEffectDescriptor);
    }

    @Deprecated
    public void applyComplexEffect(String str, String str2) {
        applyComplexEffect(str, str2, "", false, false);
    }

    @Deprecated
    public void applyComplexEffect(String str, String str2, String str3) {
        applyComplexEffect(str, str2, str3, false, false);
    }

    @Deprecated
    public void applyComplexEffect(String str, String str2, String str3, boolean z, boolean z2) {
        applyComplexEffect(ComplexEffectDescriptor.newBuilder(str, str2).setConfig(str3).setIs3rdParty(z).setHasWatermark(z2).build());
    }

    @Deprecated
    public void applyComplexEffect(String str, String str2, boolean z, boolean z2) {
        applyComplexEffect(str, str2, "", z, z2);
    }

    public void applyComplexEffectAsync(ComplexEffectDescriptor complexEffectDescriptor) {
        nativeApplyComplexEffectAsync(complexEffectDescriptor);
    }

    @Deprecated
    public void applyComplexEffectAsync(String str, String str2) {
        applyComplexEffectAsync(str, str2, "", false, false);
    }

    @Deprecated
    public void applyComplexEffectAsync(String str, String str2, String str3) {
        applyComplexEffectAsync(str, str2, str3, false, false);
    }

    @Deprecated
    public void applyComplexEffectAsync(String str, String str2, String str3, boolean z, boolean z2) {
        applyComplexEffectAsync(ComplexEffectDescriptor.newBuilder(str, str2).setConfig(str3).setIs3rdParty(z).setHasWatermark(z2).build());
    }

    @Deprecated
    public void applyComplexEffectAsync(String str, String str2, boolean z, boolean z2) {
        applyComplexEffectAsync(str, str2, "", z, z2);
    }

    public void applySoundEffectsToInt16Data(byte[] bArr, int i, int i2) {
        nativeApplySoundEffectsToInt16Data(bArr, i, i2);
    }

    public void clearMarkerTrackingData() {
        nativeClearMarkerTrackingData();
    }

    public void clearRecordedTrackingData() {
        nativeClearRecordedTrackingData();
    }

    public void clearResources() {
        nativeClearResources();
    }

    public int createCameraTexture() {
        return nativeCreateTexture();
    }

    public void deinitializeUnusedFilters() {
        nativeDeinitializeUnusedFilters();
    }

    public void drawExternalTexture(int i, int i2, int i3, float[] fArr, float[] fArr2) {
        nativeDrawExternalTexture(i, i2, i3, fArr, fArr2);
    }

    public void drawTexture(int i, int i2, int i3, float[] fArr) {
        nativeDrawTexture(i, i2, i3, fArr, false);
    }

    public void drawTexture(int i, int i2, int i3, float[] fArr, boolean z) {
        nativeDrawTexture(i, i2, i3, fArr, z);
    }

    public int drawing2DDeserializeData(String str, String str2) {
        return nativeDrawing2DDeserializeData(str, str2);
    }

    public void drawing2DSelectBrush(String str, String str2) {
        nativeDrawing2DSelectBrush(str, str2);
    }

    public String drawing2DSerializeData(String str) {
        return nativeDrawing2DSerializeData(str);
    }

    public void drawing2DSetColor(String str, int i) {
        nativeDrawing2DSetColor(str, i);
    }

    public void drawing2DSetDrawOverlayMode(String str, boolean z) {
        nativeDrawing2DSetDrawOverlayMode(str, z);
    }

    public void drawing2DSetOnUpdateDrawingHistoryListener(String str, UpdateDrawingHistoryListener updateDrawingHistoryListener) {
        nativeDrawing2DSetOnUpdateDrawingHistoryListener(str, updateDrawingHistoryListener);
    }

    public void drawing2DSetUnicodeSymbol(String str, String str2) {
        nativeDrawing2DSetUnicodeSymbol(str, str2);
    }

    public void drawing2DSetWidth(String str, float f) {
        nativeDrawing2DSetWidth(str, f);
    }

    public int drawing2DUndo(String str) {
        return nativeDrawing2DUndo(str);
    }

    public void fillResultTextureTransformationMatrix(LSCoreManagerOutputType lSCoreManagerOutputType, float[] fArr, boolean z, boolean z2) {
        nativeFillResultTextureTransformationMatrix(lSCoreManagerOutputType.ordinal(), fArr, z, z2);
    }

    public void fillResultTextureTransformationMatrix(float[] fArr, boolean z, boolean z2) {
        nativeFillResultTextureTransformationMatrix(LSCoreManagerOutputType.Default.ordinal(), fArr, z, z2);
    }

    public int getMemoryUsageEstimation() {
        return nativeGetMemoryUsageEstimation();
    }

    public long getNativeHandle() {
        return this.mNativeBridge.getNativeHandle();
    }

    public int getResultTexture(LSCoreManagerOutputType lSCoreManagerOutputType, boolean z) {
        return nativeGetResultTexture(lSCoreManagerOutputType.ordinal(), z);
    }

    public int getResultTexture(boolean z) {
        return nativeGetResultTexture(LSCoreManagerOutputType.Default.ordinal(), z);
    }

    public void handleClientInterfaceAction(String str, InterfaceControl interfaceControl, InterfaceAction interfaceAction) {
        nativeHandleClientInterfaceAction(str, interfaceControl, interfaceAction);
    }

    public boolean hasComplexEffect() {
        return nativeHasComplexEffect();
    }

    public native void nativeProvideBitmojiInfo(String str, String str2, String str3);

    public CrashCrumb[] pickRecentCrashCrumbs() {
        return nativePickRecentCrashCrumbs();
    }

    public void printOpenGLVersion() {
        String glGetString = GLES20.glGetString(7938);
        String glGetString2 = GLES20.glGetString(7937);
        String glGetString3 = GLES20.glGetString(7936);
        String glGetString4 = GLES20.glGetString(35724);
        String glGetString5 = GLES20.glGetString(7939);
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder("glVersion ");
        stringBuilder.append(glGetString);
        stringBuilder.append(" glRenderer ");
        stringBuilder.append(glGetString2);
        stringBuilder.append(" glVendor ");
        stringBuilder.append(glGetString3);
        stringBuilder.append(" glShadingLanguageVersion ");
        stringBuilder.append(glGetString4);
        stringBuilder.append(" glExtensions ");
        stringBuilder.append(glGetString5);
        Log.d(str, stringBuilder.toString());
        glGetString = TAG;
        StringBuilder stringBuilder2 = new StringBuilder("Shader version: ");
        stringBuilder2.append(GLES20.glGetString(35724));
        Log.d(glGetString, stringBuilder2.toString());
    }

    public boolean processBitmap(Bitmap bitmap, Bitmap bitmap2, double d, int i, boolean z) {
        return nativeProcessBitmap(bitmap, bitmap2, d, i, z);
    }

    public int processFrameToTexture(int i, int i2, long j, float[] fArr, float[] fArr2, int i3, int i4) {
        long j2 = j;
        return nativeProcessFrameToTexture(i, i2, this.mCameraTimestampConverter.convert(j), fArr, fArr2, i3, i4);
    }

    public int processFrameToTexture(int i, long j, float[] fArr, float[] fArr2, int i2, int i3) {
        long j2 = j;
        return nativeProcessFrameToTexture(i, 36197, this.mCameraTimestampConverter.convert(j), fArr, fArr2, i2, i3);
    }

    public void processPanGesture(int i, float f, float f2, float f3, float f4, int i2) {
        nativeProcessPanGesture(i, f, f2, f3, f4, i2);
    }

    public void processPinchGesture(int i, float f, float f2, float f3) {
        nativeProcessPinchGesture(i, f, f2, f3);
    }

    public void processRotateGesture(int i, float f, float f2, float f3) {
        nativeProcessRotateGesture(i, f, f2, f3);
    }

    public void processTapGesture(int i, float f, float f2) {
        nativeProcessTapGesture(i, f, f2);
    }

    public int processTextureToTexture(int i, long j, int i2, float[] fArr, float[] fArr2, int i3, int i4) {
        long j2 = j;
        return nativeProcessTextureToTexture(i, this.mCameraTimestampConverter.convert(j), i2, fArr, fArr2, i3, i4);
    }

    public void processTouch(TouchEvent touchEvent) {
        nativeProcessTouch(touchEvent);
    }

    public void provideBitmojiImage(BitmojiType bitmojiType, String str, Bitmap bitmap, boolean z, int i) {
        nativeProvideBitmojiImage(bitmojiType, str, bitmap, z, i);
    }

    public void provideBitmojiImage(BitmojiType bitmojiType, String str, String str2, String str3, Bitmap bitmap, boolean z, int i) {
        nativeProvideBitmojiImageWithIds(bitmojiType, str, str2, str3, bitmap, z, i);
    }

    public void provideBitmojiInfo(String str, String str2, String str3) {
        nativeProvideBitmojiInfo(str, str2, str3);
    }

    public void provideRemoteAsset(String str, String str2, String str3) {
        nativeProvideRemoteAsset(str, str2, str3);
    }

    public void provideStickerMegapack(String str, StickerMegapack stickerMegapack) {
        nativeProvideStickerMegapack(str, stickerMegapack);
    }

    public void provideUriResponse(String str, UriResponse uriResponse) {
        nativeProvideUriResponse(str, uriResponse);
    }

    public void release() {
        this.mNativeBridge.release();
    }

    public void remoteAssetUploaded(boolean z, String str) {
        nativeRemoteAssetUploaded(z, str);
    }

    public void removeAppliedComplexEffect() {
        nativeRemoveAppliedComplexEffect();
    }

    public void resetAsyncTextureReaderCache() {
        nativeResetAsyncTextureReaderCache();
    }

    public void restartTracking(int i, int i2) {
        nativeRestartTracking(true, i, i2);
    }

    public void restartTrackingWithoutVisualisation() {
        nativeRestartTracking(false, 0, 0);
    }

    public void restorePersistentStore(String str, byte[] bArr) {
        nativeRestorePersistentStore(str, bArr);
    }

    public boolean saveFrame(Bitmap bitmap) {
        return saveFrame(true, bitmap);
    }

    public boolean saveFrame(boolean z, Bitmap bitmap) {
        return nativeSaveFrame(z, bitmap);
    }

    public void setAnalyticsListener(AnalyticsListener analyticsListener) {
        nativeSetAnalyticsListener(analyticsListener);
    }

    public void setAsyncTrackingMode(boolean z) {
        nativeSetAsyncTrackingMode(z);
    }

    public void setAudioParameters(int i, int i2, int i3) {
        nativeSetAudioParameters(i, i2, i3);
    }

    public void setAudioPlaybackService(AudioPlaybackService audioPlaybackService) {
        nativeSetAudioPlaybackService(audioPlaybackService);
    }

    public void setBitmoji3dMetadata(Bitmoji3dData bitmoji3dData) {
        nativeSetBitmoji3dMetadata(bitmoji3dData);
    }

    public void setBitmojiAvailability(BitmojiType bitmojiType, BitmojiAvailability bitmojiAvailability) {
        nativeSetBitmojiAvailability(bitmojiType, bitmojiAvailability);
    }

    public void setCameraParams(float f, float f2, int i) {
        nativeSetCameraParams(f, f2, i);
    }

    public void setClientInterfaceListener(ClientInterfaceListener clientInterfaceListener) {
        nativeSetClientInterfaceListener(clientInterfaceListener);
    }

    public void setCryptographyDelegate(CryptographyDelegate cryptographyDelegate) {
        nativeSetCryptographyDelegate(cryptographyDelegate);
    }

    public void setDebugListener(DebugListener debugListener) {
        nativeSetDebugListener(debugListener);
    }

    public void setDeviceClass(DeviceClass deviceClass) {
        nativeSetDeviceClass(deviceClass);
    }

    public void setDeviceCompassTracker(DeviceCompassTracker deviceCompassTracker) {
        nativeSetDeviceCompassTracker(deviceCompassTracker);
    }

    public void setDeviceLocationTracker(DeviceLocationTracker deviceLocationTracker) {
        nativeSetDeviceLocationTracker(deviceLocationTracker);
    }

    public void setDeviceMotionTracker(DeviceMotionTracker deviceMotionTracker) {
        this.mSwitchableDeviceMotionTracker.switchToTracker(deviceMotionTracker);
    }

    public void setEmojiRasterizer(EmojiRasterizer emojiRasterizer) {
        nativeSetEmojiRasterizer(emojiRasterizer);
    }

    public void setExpressionsListener(ExpressionsListener expressionsListener) {
        nativeSetExpressionsListener(expressionsListener);
    }

    public void setExternalImage(Bitmap bitmap, int i, int i2, int i3, int i4, int i5) {
        nativeSetExternalImage(bitmap, i, i2, i3, i4, i5);
    }

    public void setExternalImage(String str, int i, int i2, int i3, int i4, int i5) {
        nativeSetExternalImage(str, i, i2, i3, i4, i5);
    }

    public void setFaceTrackingResourcesPath(String str) {
        nativeSetFaceTrackingResourcesPath(str);
    }

    public void setFrameTimestampCorrectionEnabled(boolean z) {
        this.mCameraTimestampConverter.setOffsetCorrectionEnabled(z);
    }

    public void setFramesDelay(int i) {
        nativeSetFramesDelay(i);
    }

    public void setFrontCameraEnabled(boolean z) {
        if (this.mIsFrontCameraEnabled != z) {
            this.mCameraTimestampConverter.reset();
            this.mIsFrontCameraEnabled = z;
        }
        nativeSetFrontCameraEnabled(z);
    }

    public void setGeoData(GeoData geoData) {
        nativeSetGeoData(geoData);
    }

    public void setGeoDataListener(GeoDataListener geoDataListener) {
        nativeSetGeoDataListener(geoDataListener);
    }

    public void setHintsListener(HintsListener hintsListener) {
        nativeSetHintsListener(hintsListener);
    }

    public void setInitialisationAsync(boolean z) {
        nativeSetInitialisationAsync(z);
    }

    public void setInitializationEffectEnabled(boolean z) {
        nativeSetInitializationEffectEnabled(z);
    }

    public void setInputImageSize(int i, int i2) {
        nativeSetInputImageSize(i, i2);
    }

    public void setInputImageSize(Size size) {
        nativeSetInputImageSize(size.width, size.height);
    }

    public void setInterfaceControlVisibility(String str, InterfaceControl interfaceControl, boolean z) {
        nativeSetInterfaceControlVisibility(str, interfaceControl, z);
    }

    public void setLensBitmoji3dListener(LensBitmoji3dListener lensBitmoji3dListener) {
        nativeSetLensBitmoji3dListener(lensBitmoji3dListener);
    }

    public void setLensBitmojiListener(LensBitmojiListener lensBitmojiListener) {
        nativeSetLensBitmojiListener(lensBitmojiListener);
    }

    public void setLensData(LensAnalyticsData lensAnalyticsData) {
        nativeSetLensData(lensAnalyticsData);
    }

    public void setLensDataListener(LensDataListener lensDataListener) {
        nativeSetLensDataListener(lensDataListener);
    }

    public void setLensLifeCycleListener(LensLifeCycleListener lensLifeCycleListener) {
        nativeSetLensLifeCycleListener(lensLifeCycleListener);
    }

    public void setLocalizationListener(LocalizationListener localizationListener) {
        nativeSetLocalizationListener(localizationListener);
    }

    public void setMarkerTrackingDataWithPath(String str) {
        nativeSetMarkerTrackingDataWithPath(str);
    }

    public void setNativeExceptionListener(LookseryNativeExceptionListener lookseryNativeExceptionListener) {
        nativeSetNativeExceptionListener(lookseryNativeExceptionListener);
    }

    public void setOverlay(String str, AspectRatioMode aspectRatioMode) {
        nativeSetOverlay(str, aspectRatioMode.getValue());
    }

    public void setPersistenceListener(PersistenceListener persistenceListener) {
        nativeSetPersistenceListener(persistenceListener);
    }

    public void setPlatformTrackingListener(PlatformTrackingDelegate platformTrackingDelegate) {
        nativeSetPlatformTrackingDelegate(platformTrackingDelegate);
    }

    public void setRecordingState(RecordingState recordingState) {
        nativeSetRecordingState(recordingState);
    }

    public void setRemoteAssetsListener(RemoteAssetsListener remoteAssetsListener) {
        nativeSetRemoteAssetsListener(remoteAssetsListener);
    }

    public void setScenariumAudioPlaybackService(ScenariumAudioPlaybackService scenariumAudioPlaybackService) {
        nativeSetScenariumAudioPlaybackService(scenariumAudioPlaybackService);
    }

    public void setScreenSize(int i, int i2) {
        nativeSetScreenSize(i, i2);
    }

    public void setScreenSize(Size size) {
        nativeSetScreenSize(size.width, size.height);
    }

    public void setShouldCatchNativeExceptions(boolean z) {
        nativeSetShouldCatchExceptions(z);
    }

    public void setShouldCropToScreenSize(boolean z) {
        nativeSetShouldCropToScreenSize(z);
    }

    public void setSnapRecordingListener(SnapRecordingListener snapRecordingListener) {
        nativeSetSnapRecordingListener(snapRecordingListener);
    }

    public void setSnapcodeAnalyzerListener(SnapcodeAnalyzerListener snapcodeAnalyzerListener) {
        nativeSetSnapcodeAnalyzerListener(snapcodeAnalyzerListener);
    }

    public void setSnapcodeListener(SnapcodeListener snapcodeListener) {
        nativeSetSnapcodeListener(snapcodeListener);
    }

    public void setTrackingEnabled(boolean z) {
        nativeSetTrackingEnabled(z);
    }

    public void setUriListener(UriListener uriListener) {
        nativeSetUriListener(uriListener);
    }

    public void setUserData(LensUserData lensUserData) {
        nativeSetUserData(lensUserData);
    }

    public void setUserDataListener(UserDataListener userDataListener) {
        nativeSetUserDataListener(userDataListener);
    }

    public boolean shouldBlockTouch(float f, float f2, int i) {
        return nativeShouldBlockTouch(f, f2, i);
    }

    public boolean shouldBlockTouch(Touch touch) {
        return shouldBlockTouch(touch, 0);
    }

    public boolean shouldBlockTouch(Touch touch, int i) {
        return shouldBlockTouch(touch.getX(), touch.getY(), i);
    }

    public void startFaceRegionsTracking(FaceRegionsListener faceRegionsListener) {
        nativeStartFaceRegionsTracking(faceRegionsListener);
    }

    public void startSnapcodeTracking() {
        nativeStartSnapcodeTracking();
    }

    public void startTrackingDataCollecting() {
        nativeStartTrackingDataCollecting();
    }

    public void stopFaceRegionsTracking() {
        nativeStopFaceRegionsTracking();
    }

    public void stopSnapcodeTracking() {
        nativeStopSnapcodeTracking();
    }

    public void stopTrackingDataCollecting(String str) {
        nativeStopTrackingDataCollecting(str);
    }

    public void tryToActivateCategories(int i, int i2, Set<Category> set, CategoryActivationListener categoryActivationListener) {
        Category[] categoryArr = new Category[set.size()];
        set.toArray(categoryArr);
        nativeTryToActivateCategories(i, i2, categoryArr, categoryActivationListener);
    }

    public void updateScreenZonesInfo(ScreenZoneInfo[] screenZoneInfoArr) {
        nativeUpdateScreenZonesInfo(screenZoneInfoArr);
    }

    public void usePreset(int i) {
        nativeUsePreset(i);
    }
}
