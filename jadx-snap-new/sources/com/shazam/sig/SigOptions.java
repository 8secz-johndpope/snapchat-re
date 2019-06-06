package com.shazam.sig;

public enum SigOptions {
    DEFAULT(-1),
    NORMAL(0),
    FAT(1),
    SUMO(2),
    DB(3),
    QUERY_LEGACY(4),
    DB_LEGACY(5);
    
    private final int options;

    private SigOptions(int i) {
        this.options = i;
    }

    public final int getOptions() {
        return this.options;
    }
}
