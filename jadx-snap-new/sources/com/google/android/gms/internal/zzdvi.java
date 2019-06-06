package com.google.android.gms.internal;

public enum zzdvi implements zzfia {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    
    private static final zzfib<zzdvi> zzbcn = null;
    private final int value;

    static {
        zzbcn = new zzdvj();
    }

    private zzdvi(int i) {
        this.value = i;
    }

    public static zzdvi zzgh(int i) {
        return i != 0 ? i != 1 ? i != 2 ? null : COMPRESSED : UNCOMPRESSED : UNKNOWN_FORMAT;
    }

    public final int zzhu() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
