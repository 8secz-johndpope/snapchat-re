package com.google.android.gms.internal;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

public enum zzfld {
    INT(Integer.valueOf(0)),
    LONG(Long.valueOf(0)),
    FLOAT(Float.valueOf(MapboxConstants.MINIMUM_ZOOM)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzfgs.zzpnw),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzpvc;

    private zzfld(Object obj) {
        this.zzpvc = obj;
    }
}
