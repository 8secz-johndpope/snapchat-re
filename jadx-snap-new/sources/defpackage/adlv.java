package defpackage;

import java.util.Map;

/* renamed from: adlv */
public final class adlv {
    public long a = -1;
    public long b = -1;
    public long c = -1;
    public long d = -1;
    public boolean e = false;
    long f = -1;
    long g = -1;
    long h = -1;
    long i = -1;
    long j = -1;
    public long k = -1;
    public Map<String, adnh> l;

    public final String toString() {
        return String.format("mMixerInitDelayMs=%d, mVideoEncoderInitDelayMs=%d, mAudioEncoderInitDelayMs=%d, mAudioRecorderInitDelayMs=%d, mNoiseSuppressorEnabled=%b, mAudioRecordStartDelaynMs=%d, mAudioRecordDurationMs=%d, mAudioLastTimestampMs=%d, mVideoLastFrameTimestampMs=%d,mAudioAbortPaddingDelayMs=%d, mMaxAudioEncodeBufferSize=%d", new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Boolean.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k)});
    }
}
