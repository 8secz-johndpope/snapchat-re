package com.shazam.sig;

public enum SampleRate {
    R48000(48000),
    R44100(44100),
    R32000(32000),
    R16000(16000);
    
    private final int hz;

    private SampleRate(int i) {
        this.hz = i;
    }

    public static SampleRate fromInt(int i) {
        if (i == 16000) {
            return R16000;
        }
        if (i == 32000) {
            return R32000;
        }
        if (i == 44100) {
            return R44100;
        }
        if (i == 48000) {
            return R48000;
        }
        throw new IllegalArgumentException("Sample rate was not a valid value :".concat(String.valueOf(i)));
    }

    public final int getHz() {
        return this.hz;
    }
}
