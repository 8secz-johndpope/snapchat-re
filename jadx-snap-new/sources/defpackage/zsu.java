package defpackage;

import android.location.Location;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.util.List;
import org.opencv.imgproc.Imgproc;

/* renamed from: zsu */
public final class zsu {
    public final long a;
    public final long b;
    public final Location c;
    public final adsi d;
    public final List<String> e;
    public final List<aerj> f;
    public final List<adzo> g;
    public final List<adzo> h;
    public final List<adzo> i;
    public final List<adzo> j;
    public final List<adzo> k;
    public final List<adzo> l;
    public final List<aebs> m;
    public final Throwable n;
    private final List<aeal> o;

    /* renamed from: zsu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public zsu() {
        this(0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767);
    }

    private zsu(long j, long j2, Location location, adsi adsi, List<String> list, List<? extends aerj> list2, List<adzo> list3, List<adzo> list4, List<adzo> list5, List<adzo> list6, List<adzo> list7, List<adzo> list8, List<aeal> list9, List<aebs> list10, Throwable th) {
        List<String> list11 = list;
        List<? extends aerj> list12 = list2;
        List<adzo> list13 = list3;
        List<adzo> list14 = list4;
        List<adzo> list15 = list5;
        List<adzo> list16 = list6;
        List<adzo> list17 = list7;
        List<adzo> list18 = list8;
        List<aeal> list19 = list9;
        List<aebs> list20 = list10;
        akcr.b(list11, "invalidIds");
        akcr.b(list12, "purposes");
        akcr.b(list13, "filters");
        akcr.b(list14, "bitmojiFilters");
        akcr.b(list15, "lenses");
        akcr.b(list16, "prefetchLenses");
        akcr.b(list17, "stickers");
        akcr.b(list18, "captionStyles");
        akcr.b(list19, "venues");
        akcr.b(list20, "responseChecksums");
        this.a = j;
        this.b = j2;
        this.c = location;
        this.d = adsi;
        this.e = list11;
        this.f = list12;
        this.g = list13;
        this.h = list14;
        this.i = list15;
        this.j = list16;
        this.k = list17;
        this.l = list18;
        this.o = list19;
        this.m = list20;
        this.n = th;
    }

    public /* synthetic */ zsu(long j, long j2, Location location, adsi adsi, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, Throwable th, int i) {
        int i2 = i;
        long j3 = 0;
        long j4 = (i2 & 1) != 0 ? 0 : j;
        if ((i2 & 2) == 0) {
            j3 = j2;
        }
        this(j4, j3, (i2 & 4) != 0 ? null : location, (i2 & 8) != 0 ? null : adsi, (i2 & 16) != 0 ? ajyw.a : list, (i2 & 32) != 0 ? ajyw.a : list2, (i2 & 64) != 0 ? ajyw.a : list3, (i2 & 128) != 0 ? ajyw.a : list4, (i2 & 256) != 0 ? ajyw.a : list5, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? ajyw.a : list6, (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? ajyw.a : list7, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? ajyw.a : list8, (i2 & 4096) != 0 ? ajyw.a : list9, (i2 & 8192) != 0 ? ajyw.a : list10, (i2 & 16384) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zsu) {
                zsu zsu = (zsu) obj;
                if ((this.a == zsu.a ? 1 : null) != null) {
                    if (!((this.b == zsu.b ? 1 : null) != null && akcr.a(this.c, zsu.c) && akcr.a(this.d, zsu.d) && akcr.a(this.e, zsu.e) && akcr.a(this.f, zsu.f) && akcr.a(this.g, zsu.g) && akcr.a(this.h, zsu.h) && akcr.a(this.i, zsu.i) && akcr.a(this.j, zsu.j) && akcr.a(this.k, zsu.k) && akcr.a(this.l, zsu.l) && akcr.a(this.o, zsu.o) && akcr.a(this.m, zsu.m) && akcr.a(this.n, zsu.n))) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        i = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Location location = this.c;
        int i2 = 0;
        i = (i + (location != null ? location.hashCode() : 0)) * 31;
        adsi adsi = this.d;
        i = (i + (adsi != null ? adsi.hashCode() : 0)) * 31;
        List list = this.e;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.f;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.g;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.h;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.i;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.j;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.k;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.l;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.o;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        list = this.m;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        Throwable th = this.n;
        if (th != null) {
            i2 = th.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnlockablesResponse(requestTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(", responseTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(", location=");
        stringBuilder.append(this.c);
        stringBuilder.append(", opportunityRequestIds=");
        stringBuilder.append(this.d);
        stringBuilder.append(", invalidIds=");
        stringBuilder.append(this.e);
        stringBuilder.append(", purposes=");
        stringBuilder.append(this.f);
        stringBuilder.append(", filters=");
        stringBuilder.append(this.g);
        stringBuilder.append(", bitmojiFilters=");
        stringBuilder.append(this.h);
        stringBuilder.append(", lenses=");
        stringBuilder.append(this.i);
        stringBuilder.append(", prefetchLenses=");
        stringBuilder.append(this.j);
        stringBuilder.append(", stickers=");
        stringBuilder.append(this.k);
        stringBuilder.append(", captionStyles=");
        stringBuilder.append(this.l);
        stringBuilder.append(", venues=");
        stringBuilder.append(this.o);
        stringBuilder.append(", responseChecksums=");
        stringBuilder.append(this.m);
        stringBuilder.append(", error=");
        stringBuilder.append(this.n);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
