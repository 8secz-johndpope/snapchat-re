package com.shazam.sig;

public enum SigType {
    SINGLE_FILE(1),
    PROGRESSIVE(2),
    STREAMING(3);
    
    private final int type;

    private SigType(int i) {
        this.type = i;
    }

    public final int getType() {
        return this.type;
    }
}
