package com.google.android.gms.internal;

public enum zzdxb implements zzfia {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    private static final zzfib<zzdxb> zzbcn = null;
    private final int value;

    static {
        zzbcn = new zzdxc();
    }

    private zzdxb(int i) {
        this.value = i;
    }

    public static zzdxb zzgx(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : CRUNCHY : RAW : LEGACY : TINK : UNKNOWN_PREFIX;
    }

    public final int zzhu() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
