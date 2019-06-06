package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.util.List;

/* renamed from: hwh */
public final class hwh {
    public final int a;
    public final List<Integer> b;
    public final hwi c;
    final String d;
    public hwq e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final Integer j;

    public hwh(int i, List<Integer> list, hwi hwi, String str, hwq hwq, boolean z, boolean z2, boolean z3, String str2, Integer num) {
        akcr.b(list, "constraints");
        akcr.b(hwi, "existingJobPolicy");
        akcr.b(str, "uniqueSubTag");
        akcr.b(str2, "jobGroupTag");
        this.a = i;
        this.b = list;
        this.c = hwi;
        this.d = str;
        this.e = hwq;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str2;
        this.j = num;
    }

    public /* synthetic */ hwh(int i, List list, hwi hwi, String str, hwq hwq, boolean z, boolean z2, boolean z3, String str2, Integer num, int i2) {
        int i3 = i2;
        int i4 = (i3 & 1) != 0 ? 0 : i;
        List list2 = (i3 & 2) != 0 ? ajyw.a : list;
        String str3 = "";
        String str4 = (i3 & 8) != 0 ? str3 : str;
        hwq hwq2 = (i3 & 16) != 0 ? null : hwq;
        boolean z4 = (i3 & 32) != 0 ? true : z;
        boolean z5 = (i3 & 64) != 0 ? false : z2;
        boolean z6 = (i3 & 128) != 0 ? false : z3;
        String str5 = (i3 & 256) != 0 ? str3 : str2;
        this(i4, list2, hwi, str4, hwq2, z4, z5, z6, str5, (i3 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hwh) {
                hwh hwh = (hwh) obj;
                if ((this.a == hwh.a ? 1 : null) != null && akcr.a(this.b, hwh.b) && akcr.a(this.c, hwh.c) && akcr.a(this.d, hwh.d) && akcr.a(this.e, hwh.e)) {
                    if ((this.f == hwh.f ? 1 : null) != null) {
                        if ((this.g == hwh.g ? 1 : null) != null) {
                            if (!((this.h == hwh.h ? 1 : null) != null && akcr.a(this.i, hwh.i) && akcr.a(this.j, hwh.j))) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        List list = this.b;
        int i2 = 0;
        i = (i + (list != null ? list.hashCode() : 0)) * 31;
        hwi hwi = this.c;
        i = (i + (hwi != null ? hwi.hashCode() : 0)) * 31;
        String str = this.d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        hwq hwq = this.e;
        i = (i + (hwq != null ? hwq.hashCode() : 0)) * 31;
        int i3 = this.f;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.g;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.h;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        str = this.i;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.j;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DurableJobConfig(numberOfRetries=");
        stringBuilder.append(this.a);
        stringBuilder.append(", constraints=");
        stringBuilder.append(this.b);
        stringBuilder.append(", existingJobPolicy=");
        stringBuilder.append(this.c);
        stringBuilder.append(", uniqueSubTag=");
        stringBuilder.append(this.d);
        stringBuilder.append(", initialDelayConfig=");
        stringBuilder.append(this.e);
        stringBuilder.append(", useExponentialBackoff=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isForegroundJob=");
        stringBuilder.append(this.g);
        stringBuilder.append(", isRecurring=");
        stringBuilder.append(this.h);
        stringBuilder.append(", jobGroupTag=");
        stringBuilder.append(this.i);
        stringBuilder.append(", mediaCount=");
        stringBuilder.append(this.j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
