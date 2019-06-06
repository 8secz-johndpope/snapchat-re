package com.google.android.gms.internal;

public enum zzdwj implements zzfia {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    private static final zzfib<zzdwj> zzbcn = null;
    private final int value;

    static {
        zzbcn = new zzdwk();
    }

    private zzdwj(int i) {
        this.value = i;
    }

    public static zzdwj zzgo(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : DESTROYED : DISABLED : ENABLED : UNKNOWN_STATUS;
    }

    public final int zzhu() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
