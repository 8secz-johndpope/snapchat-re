package com.google.android.gms.internal;

import java.util.Comparator;

final class zzhu implements Comparator<zzia> {
    zzhu(zzht zzht) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzia zzia = (zzia) obj;
        zzia zzia2 = (zzia) obj2;
        int i = zzia.zzbal - zzia2.zzbal;
        return i != 0 ? i : (int) (zzia.value - zzia2.value);
    }
}
