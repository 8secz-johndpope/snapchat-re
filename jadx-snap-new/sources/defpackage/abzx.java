package defpackage;

/* renamed from: abzx */
public enum abzx {
    SLOW(0.5d),
    FAST(2.0d),
    REWIND(-1.0d);
    
    private final double mPlaybackRate;

    private abzx(double d) {
        this.mPlaybackRate = d;
    }

    public final double a() {
        return this.mPlaybackRate;
    }
}
