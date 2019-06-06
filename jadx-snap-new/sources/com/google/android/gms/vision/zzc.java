package com.google.android.gms.vision;

import android.util.SparseArray;

public final class zzc {
    private static final Object sLock = new Object();
    private static int zzlgg = 0;
    private SparseArray<Integer> zzlgh = new SparseArray();
    private SparseArray<Integer> zzlgi = new SparseArray();

    public final int zzfm(int i) {
        synchronized (sLock) {
            Integer num = (Integer) this.zzlgh.get(i);
            if (num != null) {
                i = num.intValue();
                return i;
            }
            int i2 = zzlgg;
            zzlgg++;
            this.zzlgh.append(i, Integer.valueOf(i2));
            this.zzlgi.append(i2, Integer.valueOf(i));
            return i2;
        }
    }
}
