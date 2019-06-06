package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbt;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzabh
public final class zzanx implements Iterable<zzanv> {
    private final List<zzanv> zzdoo = new LinkedList();

    public static boolean zzb(zzann zzann) {
        zzanv zzc = zzc(zzann);
        if (zzc == null) {
            return false;
        }
        zzc.zzdol.abort();
        return true;
    }

    static zzanv zzc(zzann zzann) {
        Iterator it = zzbt.zzff().iterator();
        while (it.hasNext()) {
            zzanv zzanv = (zzanv) it.next();
            if (zzanv.zzdly == zzann) {
                return zzanv;
            }
        }
        return null;
    }

    public final Iterator<zzanv> iterator() {
        return this.zzdoo.iterator();
    }

    public final void zza(zzanv zzanv) {
        this.zzdoo.add(zzanv);
    }

    public final void zzb(zzanv zzanv) {
        this.zzdoo.remove(zzanv);
    }

    public final int zzts() {
        return this.zzdoo.size();
    }
}
