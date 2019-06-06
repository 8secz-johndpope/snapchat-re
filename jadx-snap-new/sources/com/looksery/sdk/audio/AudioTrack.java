package com.looksery.sdk.audio;

public interface AudioTrack {
    public static final long DURATION_UNAVAILABLE = -1;
    public static final long DURATION_UNKNOWN = -2;

    public interface Client {
        Object getSyncLock();

        boolean isPlaying();

        void notifyPlaybackComplete();
    }

    void doPause();

    void doPlay(int i);

    void doPlayInfinitely();

    void doResume();

    void doStop();

    long getDurationMillis();

    long getPositionMillis();

    void initialize(Client client);

    void release();

    void setPositionMillis(long j);

    void setVolumeGain(float f);
}
