package com.google.android.gms.internal;

public enum zzdvw implements zzfia {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    private static final zzfib<zzdvw> zzbcn = null;
    private final int value;

    static {
        zzbcn = new zzdvx();
    }

    private zzdvw(int i) {
        this.value = i;
    }

    public static zzdvw zzgk(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : NIST_P521 : NIST_P384 : NIST_P256 : NIST_P224 : UNKNOWN_CURVE;
    }

    public final int zzhu() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
