package org.jcodec.containers.mp4.boxes;

public class Edit {
    private long duration;
    private long mediaTime;
    private float rate;

    public Edit(long j, long j2, float f) {
        this.duration = j;
        this.mediaTime = j2;
        this.rate = f;
    }

    public long getDuration() {
        return this.duration;
    }

    public long getMediaTime() {
        return this.mediaTime;
    }

    public float getRate() {
        return this.rate;
    }

    public void setMediaTime(long j) {
        this.mediaTime = j;
    }
}
