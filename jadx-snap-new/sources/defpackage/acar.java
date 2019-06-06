package defpackage;

import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: acar */
public final class acar<T extends acap> implements Iterable<Entry<Long, T>> {
    public ConcurrentSkipListMap<Long, T> a;

    public acar() {
        this.a = new ConcurrentSkipListMap();
    }

    private acar(ConcurrentSkipListMap<Long, T> concurrentSkipListMap) {
        this.a = concurrentSkipListMap;
    }

    public final int a() {
        return this.a.size();
    }

    public final T a(long j) {
        Entry floorEntry = this.a.floorEntry(Long.valueOf(j));
        Entry ceilingEntry = this.a.ceilingEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return ceilingEntry != null ? (acap) ceilingEntry.getValue() : null;
        } else {
            if (ceilingEntry == null) {
                return (acap) floorEntry.getValue();
            }
            float abs = (float) Math.abs(j - ((Long) floorEntry.getKey()).longValue());
            float abs2 = (float) Math.abs(((Long) ceilingEntry.getKey()).longValue() - ((Long) floorEntry.getKey()).longValue());
            float f = MapboxConstants.MINIMUM_ZOOM;
            if (abs2 != MapboxConstants.MINIMUM_ZOOM) {
                f = abs / abs2;
            }
            acap acap = (acap) floorEntry.getValue();
            return acap == null ? null : acap.a((acap) ceilingEntry.getValue(), f);
        }
    }

    public final void a(long j, T t) {
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkNotNull(t);
        this.a.put(Long.valueOf(j), t);
    }

    public final boolean a(long j, boolean z) {
        return this.a.isEmpty() ? false : z ? j <= ((Long) this.a.lastKey()).longValue() : j >= ((Long) this.a.firstKey()).longValue();
    }

    /* renamed from: b */
    public final acar<T> clone() {
        return new acar(new ConcurrentSkipListMap(this.a));
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof acar) && this.a.equals(((acar) obj).a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator<Entry<Long, T>> iterator() {
        return this.a.entrySet().iterator();
    }
}
