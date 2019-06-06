package com.google.android.gms.ads.mediation.customevent;

import defpackage.bbi;
import java.util.HashMap;

@Deprecated
public final class CustomEventExtras implements bbi {
    private final HashMap<String, Object> zzdts = new HashMap();

    public final Object getExtra(String str) {
        return this.zzdts.get(str);
    }
}
