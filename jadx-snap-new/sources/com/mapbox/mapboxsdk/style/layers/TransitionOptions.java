package com.mapbox.mapboxsdk.style.layers;

public class TransitionOptions {
    private long delay;
    private long duration;

    public TransitionOptions(long j, long j2) {
        this.duration = j;
        this.delay = j2;
    }

    public static TransitionOptions fromTransitionOptions(long j, long j2) {
        return new TransitionOptions(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TransitionOptions transitionOptions = (TransitionOptions) obj;
            if (this.duration == transitionOptions.duration && this.delay == transitionOptions.delay) {
                return true;
            }
        }
        return false;
    }

    public long getDelay() {
        return this.delay;
    }

    public long getDuration() {
        return this.duration;
    }

    public int hashCode() {
        long j = this.duration;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.delay;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransitionOptions{duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(", delay=");
        stringBuilder.append(this.delay);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
