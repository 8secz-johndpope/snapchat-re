package org.webrtc.voiceengine;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

public class WebRtcAudioRecord {
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_AUDIO_SOURCE;
    private static final String TAG = "WebRtcAudioRecord";
    private static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback = null;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback = null;
    private static volatile boolean microphoneMute = false;
    private AudioRecord audioRecord = null;
    private AudioRecordThread audioThread = null;
    private ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects = null;
    private byte[] emptyBytes;
    private final long nativeAudioRecord;

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        public AudioRecordThread(String str) {
            super(str);
        }

        public void run() {
            Process.setThreadPriority(-19);
            StringBuilder stringBuilder = new StringBuilder("AudioRecordThread");
            stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
            String stringBuilder2 = stringBuilder.toString();
            String str = WebRtcAudioRecord.TAG;
            Logging.d(str, stringBuilder2);
            WebRtcAudioRecord.assertTrue(WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity())));
                    }
                } else {
                    String concat = "AudioRecord.read failed: ".concat(String.valueOf(read));
                    Logging.e(str, concat);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(concat);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    WebRtcAudioRecord.this.audioRecord.stop();
                }
            } catch (IllegalStateException e) {
                StringBuilder stringBuilder3 = new StringBuilder("AudioRecord.stop failed: ");
                stringBuilder3.append(e.getMessage());
                Logging.e(str, stringBuilder3.toString());
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    static {
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    WebRtcAudioRecord(long j) {
        StringBuilder stringBuilder = new StringBuilder("ctor");
        stringBuilder.append(WebRtcAudioUtils.getThreadInfo());
        Logging.d(TAG, stringBuilder.toString());
        this.nativeAudioRecord = j;
        this.effects = WebRtcAudioEffects.create();
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 16 : 12;
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("enableBuiltInAEC(");
        stringBuilder.append(z);
        stringBuilder.append(')');
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z);
        }
        Logging.e(str, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("enableBuiltInNS(");
        stringBuilder.append(z);
        stringBuilder.append(')');
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z);
        }
        Logging.e(str, "Built-in NS is not supported on this platform");
        return false;
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder("initRecording(sampleRate=");
        stringBuilder.append(i);
        stringBuilder.append(", channels=");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        String stringBuilder2 = stringBuilder.toString();
        String str = TAG;
        Logging.d(str, stringBuilder2);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = i / 100;
        this.byteBuffer = ByteBuffer.allocateDirect((i2 << 1) * i3);
        stringBuilder = new StringBuilder("byteBuffer.capacity: ");
        stringBuilder.append(this.byteBuffer.capacity());
        Logging.d(str, stringBuilder.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        int minBufferSize = AudioRecord.getMinBufferSize(i, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: ".concat(String.valueOf(minBufferSize)));
            return -1;
        }
        Logging.d(str, "AudioRecord.getMinBufferSize: ".concat(String.valueOf(minBufferSize)));
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        Logging.d(str, "bufferSizeInBytes: ".concat(String.valueOf(max)));
        try {
            this.audioRecord = new AudioRecord(audioSource, i, channelCountToConfiguration, 2, max);
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                return -1;
            }
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            return i3;
        } catch (IllegalArgumentException e) {
            StringBuilder stringBuilder3 = new StringBuilder("AudioRecord ctor error: ");
            stringBuilder3.append(e.getMessage());
            reportWebRtcAudioRecordInitError(stringBuilder3.toString());
            releaseAudioResources();
            return -1;
        }
    }

    private void logMainParameters() {
        StringBuilder stringBuilder = new StringBuilder("AudioRecord: session ID: ");
        stringBuilder.append(this.audioRecord.getAudioSessionId());
        stringBuilder.append(", channels: ");
        stringBuilder.append(this.audioRecord.getChannelCount());
        stringBuilder.append(", sample rate: ");
        stringBuilder.append(this.audioRecord.getSampleRate());
        Logging.d(TAG, stringBuilder.toString());
    }

    @TargetApi(23)
    private void logMainParametersExtended() {
        if (WebRtcAudioUtils.runningOnMarshmallowOrHigher()) {
            StringBuilder stringBuilder = new StringBuilder("AudioRecord: buffer size in frames: ");
            stringBuilder.append(this.audioRecord.getBufferSizeInFrames());
            Logging.d(TAG, stringBuilder.toString());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    private native void nativeDataIsRecorded(int i, long j);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    private void reportWebRtcAudioRecordError(String str) {
        String concat = "Run-time recording error: ".concat(String.valueOf(str));
        String str2 = TAG;
        Logging.e(str2, concat);
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        String concat = "Init recording error: ".concat(String.valueOf(str));
        String str2 = TAG;
        Logging.e(str2, concat);
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        StringBuilder stringBuilder = new StringBuilder("Start recording error: ");
        stringBuilder.append(audioRecordStartErrorCode);
        stringBuilder.append(". ");
        stringBuilder.append(str);
        String stringBuilder2 = stringBuilder.toString();
        String str2 = TAG;
        Logging.e(str2, stringBuilder2);
        WebRtcAudioUtils.logAudioState(str2);
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    public static synchronized void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            String str = TAG;
            StringBuilder stringBuilder = new StringBuilder("Audio source is changed from: ");
            stringBuilder.append(audioSource);
            stringBuilder.append(" to ");
            stringBuilder.append(i);
            Logging.w(str, stringBuilder.toString());
            audioSource = i;
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    public static void setMicrophoneMute(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("setMicrophoneMute(");
        stringBuilder.append(z);
        stringBuilder.append(")");
        Logging.w(TAG, stringBuilder.toString());
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    private boolean startRecording() {
        Logging.d(TAG, "startRecording");
        assertTrue(this.audioRecord != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                AudioRecordStartErrorCode audioRecordStartErrorCode = AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH;
                StringBuilder stringBuilder = new StringBuilder("AudioRecord.startRecording failed - incorrect state :");
                stringBuilder.append(this.audioRecord.getRecordingState());
                reportWebRtcAudioRecordStartError(audioRecordStartErrorCode, stringBuilder.toString());
                return false;
            }
            this.audioThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioRecordStartErrorCode audioRecordStartErrorCode2 = AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION;
            StringBuilder stringBuilder2 = new StringBuilder("AudioRecord.startRecording failed: ");
            stringBuilder2.append(e.getMessage());
            reportWebRtcAudioRecordStartError(audioRecordStartErrorCode2, stringBuilder2.toString());
            return false;
        }
    }

    private boolean stopRecording() {
        String str = TAG;
        Logging.d(str, "stopRecording");
        assertTrue(this.audioThread != null);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS)) {
            Logging.e(str, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(str);
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}
