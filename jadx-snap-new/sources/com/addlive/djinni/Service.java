package com.addlive.djinni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Service {

    static final class CppProxy extends Service {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = Service.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_addListener(long j, ServiceListener serviceListener);

        private native void native_connect(long j, VoidResponder voidResponder, ConnectionDescriptor connectionDescriptor);

        private native void native_disconnect(long j, VoidResponder voidResponder, String str);

        private native void native_dispose(long j);

        private native void native_getAudioCaptureDeviceNames(long j, StringListResponder stringListResponder);

        private native void native_getAudioOutputDeviceNames(long j, StringListResponder stringListResponder);

        private native void native_getVideoCaptureDeviceNames(long j, StringDictResponder stringDictResponder);

        private native void native_initialize(long j, VoidResponder voidResponder, boolean z);

        private native void native_injectImageFrame(long j, CameraImage cameraImage);

        private native void native_injectNativeFrame(long j, long j2);

        private native void native_monitorSpeechActivity(long j, VoidResponder voidResponder, String str, boolean z);

        private native void native_publish(long j, VoidResponder voidResponder, String str, MediaType mediaType, HashMap<String, String> hashMap);

        private native void native_removeListener(long j, ServiceListener serviceListener);

        private native void native_restrictMediaReception(long j, VoidResponder voidResponder, String str, MediaType mediaType, ArrayList<Long> arrayList);

        private native void native_sendMessage(long j, VoidResponder voidResponder, String str, String str2, Long l);

        private native void native_setAudioCaptureDevice(long j, VoidResponder voidResponder, String str);

        private native void native_setAudioOutputDevice(long j, VoidResponder voidResponder, String str);

        private native void native_setExternalVideoService(long j, ExternalVideoService externalVideoService);

        private native void native_setProperty(long j, String str, String str2);

        private native void native_setVideoCaptureDevice(long j, VoidResponder voidResponder, String str);

        private native void native_startDirectRender(long j, NumberResponder numberResponder, String str, DirectRendererCallback directRendererCallback);

        private native void native_startLocalVideo(long j, StringResponder stringResponder);

        private native void native_stopRender(long j, VoidResponder voidResponder, int i);

        private native void native_unpublish(long j, VoidResponder voidResponder, String str, MediaType mediaType);

        private native void native_unrestrictMediaReception(long j, VoidResponder voidResponder, String str, MediaType mediaType);

        public final void addListener(ServiceListener serviceListener) {
            native_addListener(this.nativeRef, serviceListener);
        }

        public final void connect(VoidResponder voidResponder, ConnectionDescriptor connectionDescriptor) {
            native_connect(this.nativeRef, voidResponder, connectionDescriptor);
        }

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public final void disconnect(VoidResponder voidResponder, String str) {
            native_disconnect(this.nativeRef, voidResponder, str);
        }

        public final void dispose() {
            native_dispose(this.nativeRef);
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final void getAudioCaptureDeviceNames(StringListResponder stringListResponder) {
            native_getAudioCaptureDeviceNames(this.nativeRef, stringListResponder);
        }

        public final void getAudioOutputDeviceNames(StringListResponder stringListResponder) {
            native_getAudioOutputDeviceNames(this.nativeRef, stringListResponder);
        }

        public final void getVideoCaptureDeviceNames(StringDictResponder stringDictResponder) {
            native_getVideoCaptureDeviceNames(this.nativeRef, stringDictResponder);
        }

        public final void initialize(VoidResponder voidResponder, boolean z) {
            native_initialize(this.nativeRef, voidResponder, z);
        }

        public final void injectImageFrame(CameraImage cameraImage) {
            native_injectImageFrame(this.nativeRef, cameraImage);
        }

        public final void injectNativeFrame(long j) {
            native_injectNativeFrame(this.nativeRef, j);
        }

        public final void monitorSpeechActivity(VoidResponder voidResponder, String str, boolean z) {
            native_monitorSpeechActivity(this.nativeRef, voidResponder, str, z);
        }

        public final void publish(VoidResponder voidResponder, String str, MediaType mediaType, HashMap<String, String> hashMap) {
            native_publish(this.nativeRef, voidResponder, str, mediaType, hashMap);
        }

        public final void removeListener(ServiceListener serviceListener) {
            native_removeListener(this.nativeRef, serviceListener);
        }

        public final void restrictMediaReception(VoidResponder voidResponder, String str, MediaType mediaType, ArrayList<Long> arrayList) {
            native_restrictMediaReception(this.nativeRef, voidResponder, str, mediaType, arrayList);
        }

        public final void sendMessage(VoidResponder voidResponder, String str, String str2, Long l) {
            native_sendMessage(this.nativeRef, voidResponder, str, str2, l);
        }

        public final void setAudioCaptureDevice(VoidResponder voidResponder, String str) {
            native_setAudioCaptureDevice(this.nativeRef, voidResponder, str);
        }

        public final void setAudioOutputDevice(VoidResponder voidResponder, String str) {
            native_setAudioOutputDevice(this.nativeRef, voidResponder, str);
        }

        public final void setExternalVideoService(ExternalVideoService externalVideoService) {
            native_setExternalVideoService(this.nativeRef, externalVideoService);
        }

        public final void setProperty(String str, String str2) {
            native_setProperty(this.nativeRef, str, str2);
        }

        public final void setVideoCaptureDevice(VoidResponder voidResponder, String str) {
            native_setVideoCaptureDevice(this.nativeRef, voidResponder, str);
        }

        public final void startDirectRender(NumberResponder numberResponder, String str, DirectRendererCallback directRendererCallback) {
            native_startDirectRender(this.nativeRef, numberResponder, str, directRendererCallback);
        }

        public final void startLocalVideo(StringResponder stringResponder) {
            native_startLocalVideo(this.nativeRef, stringResponder);
        }

        public final void stopRender(VoidResponder voidResponder, int i) {
            native_stopRender(this.nativeRef, voidResponder, i);
        }

        public final void unpublish(VoidResponder voidResponder, String str, MediaType mediaType) {
            native_unpublish(this.nativeRef, voidResponder, str, mediaType);
        }

        public final void unrestrictMediaReception(VoidResponder voidResponder, String str, MediaType mediaType) {
            native_unrestrictMediaReception(this.nativeRef, voidResponder, str, mediaType);
        }
    }

    public static native void androidFini();

    public static native void androidInit(Object obj);

    public static native Service sharedInstance();

    public abstract void addListener(ServiceListener serviceListener);

    public abstract void connect(VoidResponder voidResponder, ConnectionDescriptor connectionDescriptor);

    public abstract void disconnect(VoidResponder voidResponder, String str);

    public abstract void dispose();

    public abstract void getAudioCaptureDeviceNames(StringListResponder stringListResponder);

    public abstract void getAudioOutputDeviceNames(StringListResponder stringListResponder);

    public abstract void getVideoCaptureDeviceNames(StringDictResponder stringDictResponder);

    public abstract void initialize(VoidResponder voidResponder, boolean z);

    public abstract void injectImageFrame(CameraImage cameraImage);

    public abstract void injectNativeFrame(long j);

    public abstract void monitorSpeechActivity(VoidResponder voidResponder, String str, boolean z);

    public abstract void publish(VoidResponder voidResponder, String str, MediaType mediaType, HashMap<String, String> hashMap);

    public abstract void removeListener(ServiceListener serviceListener);

    public abstract void restrictMediaReception(VoidResponder voidResponder, String str, MediaType mediaType, ArrayList<Long> arrayList);

    public abstract void sendMessage(VoidResponder voidResponder, String str, String str2, Long l);

    public abstract void setAudioCaptureDevice(VoidResponder voidResponder, String str);

    public abstract void setAudioOutputDevice(VoidResponder voidResponder, String str);

    public abstract void setExternalVideoService(ExternalVideoService externalVideoService);

    public abstract void setProperty(String str, String str2);

    public abstract void setVideoCaptureDevice(VoidResponder voidResponder, String str);

    public abstract void startDirectRender(NumberResponder numberResponder, String str, DirectRendererCallback directRendererCallback);

    public abstract void startLocalVideo(StringResponder stringResponder);

    public abstract void stopRender(VoidResponder voidResponder, int i);

    public abstract void unpublish(VoidResponder voidResponder, String str, MediaType mediaType);

    public abstract void unrestrictMediaReception(VoidResponder voidResponder, String str, MediaType mediaType);
}
