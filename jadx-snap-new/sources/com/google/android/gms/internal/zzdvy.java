package com.google.android.gms.internal;

public enum zzdvy implements zzfia {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    private static final zzfib<zzdvy> zzbcn = null;
    private final int value;

    static {
        zzbcn = new zzdvz();
    }

    private zzdvy(int i) {
        this.value = i;
    }

    public static zzdvy zzgl(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : SHA512 : SHA256 : SHA224 : SHA1 : UNKNOWN_HASH;
    }

    public final int zzhu() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
