package com.looksery.sdk.audio;

public final class AudioSampleInfo {
    private final int mBitDepth;
    private final int mChannelCount;
    private final long mDurationUs;
    private final float mEstimatedInMemorySizeMb;
    private final String mResourceUri;
    private final int mSampleRate;

    static class Builder {
        private static final int DEFAULT_BIT_DEPTH = 16;
        private static final int DEFAULT_CHANNEL_COUNT = 2;
        private static final long DEFAULT_DURATION_US = 0;
        private static final int DEFAULT_SAMPLE_RATE = 44100;
        int mBitDepth = 16;
        int mChannelCount = 2;
        long mDurationUs = DEFAULT_DURATION_US;
        final String mResourceUri;
        int mSampleRate = DEFAULT_SAMPLE_RATE;

        Builder(String str) {
            this.mResourceUri = str;
        }

        /* Access modifiers changed, original: 0000 */
        public Builder bitDepth(int i) {
            this.mBitDepth = i;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public AudioSampleInfo build() {
            return new AudioSampleInfo(this);
        }

        /* Access modifiers changed, original: 0000 */
        public Builder channelCount(int i) {
            this.mChannelCount = i;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public Builder durationUs(long j) {
            this.mDurationUs = j;
            return this;
        }

        /* Access modifiers changed, original: 0000 */
        public Builder sampleRate(int i) {
            this.mSampleRate = i;
            return this;
        }
    }

    private AudioSampleInfo(Builder builder) {
        this.mResourceUri = builder.mResourceUri;
        this.mChannelCount = builder.mChannelCount;
        this.mBitDepth = builder.mBitDepth;
        this.mSampleRate = builder.mSampleRate;
        this.mDurationUs = builder.mDurationUs;
        this.mEstimatedInMemorySizeMb = (((float) estimateInMemorySizeBits()) * 0.125f) * 1.0E-6f;
    }

    static Builder create(String str) {
        return new Builder(str);
    }

    private int estimateInMemorySizeBits() {
        return (int) ((((long) ((this.mChannelCount * this.mBitDepth) * this.mSampleRate)) * this.mDurationUs) / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mResourceUri.equals(((AudioSampleInfo) obj).mResourceUri);
    }

    public final int getBitDepth() {
        return this.mBitDepth;
    }

    public final int getChannelCount() {
        return this.mChannelCount;
    }

    public final long getDurationUs() {
        return this.mDurationUs;
    }

    public final float getEstimatedInMemorySizeMb() {
        return this.mEstimatedInMemorySizeMb;
    }

    public final String getResourceUri() {
        return this.mResourceUri;
    }

    public final int getSampleRate() {
        return this.mSampleRate;
    }

    public final int hashCode() {
        return this.mResourceUri.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioSampleInfo{mResourceUri='");
        stringBuilder.append(this.mResourceUri);
        stringBuilder.append('\'');
        stringBuilder.append(", mChannelCount=");
        stringBuilder.append(this.mChannelCount);
        stringBuilder.append(", mBitDepth=");
        stringBuilder.append(this.mBitDepth);
        stringBuilder.append(", mSampleRate=");
        stringBuilder.append(this.mSampleRate);
        stringBuilder.append(", mDurationUs=");
        stringBuilder.append(this.mDurationUs);
        stringBuilder.append(", mEstimatedInMemorySizeMb=");
        stringBuilder.append(this.mEstimatedInMemorySizeMb);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
