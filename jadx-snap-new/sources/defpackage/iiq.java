package defpackage;

import defpackage.afkn.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: iiq */
public final class iiq {
    public String a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public a l;
    public String m;
    public Map<String, iiw> n;
    public List<? extends abzy> o;
    public acan p;

    public /* synthetic */ iiq() {
        this("", a.NONE, new LinkedHashMap(), new ArrayList());
    }

    private iiq(String str, a aVar, Map<String, iiw> map, List<? extends abzy> list) {
        akcr.b(str, "snapSessionId");
        akcr.b(aVar, "filterCarouselFirstEntryDirection");
        akcr.b(map, "swipeInteractionMap");
        akcr.b(list, "selectedGeofiltersList");
        this.a = str;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.l = aVar;
        this.m = null;
        this.n = map;
        this.o = list;
        this.p = null;
    }

    public final void a(String str) {
        akcr.b(str, "<set-?>");
        this.a = str;
    }

    public final void a(List<? extends abzy> list) {
        akcr.b(list, "<set-?>");
        this.o = list;
    }

    public final void a(Map<String, iiw> map) {
        akcr.b(map, "<set-?>");
        this.n = map;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iiq) {
                iiq iiq = (iiq) obj;
                if (akcr.a(this.a, iiq.a)) {
                    if ((this.b == iiq.b ? 1 : null) != null) {
                        if ((this.c == iiq.c ? 1 : null) != null) {
                            if ((this.d == iiq.d ? 1 : null) != null) {
                                if ((this.e == iiq.e ? 1 : null) != null) {
                                    if ((this.f == iiq.f ? 1 : null) != null) {
                                        if ((this.g == iiq.g ? 1 : null) != null) {
                                            if ((this.h == iiq.h ? 1 : null) != null) {
                                                if ((this.j == iiq.j ? 1 : null) != null) {
                                                    if (!((this.k == iiq.k ? 1 : null) != null && akcr.a(this.l, iiq.l) && akcr.a(this.m, iiq.m) && akcr.a(this.n, iiq.n) && akcr.a(this.o, iiq.o) && akcr.a(this.p, iiq.p))) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.b;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.c;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.d;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.e;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.g;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.h;
        hashCode = ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) * 31;
        j = this.j;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = this.k;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        a aVar = this.l;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str2 = this.m;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map map = this.n;
        hashCode = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        List list = this.o;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        acan acan = this.p;
        if (acan != null) {
            i = acan.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnlockablePreviewAnalytics(snapSessionId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", numberOfGeofilterLoaded=");
        stringBuilder.append(this.b);
        stringBuilder.append(", previewViewTimeMs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", snapDurationMs=");
        stringBuilder.append(this.d);
        stringBuilder.append(", numberOfSwipes=");
        stringBuilder.append(this.e);
        stringBuilder.append(", cameraType=");
        stringBuilder.append(this.f);
        stringBuilder.append(", carouselSize=");
        stringBuilder.append(this.g);
        stringBuilder.append(", directSnapRecipientCount=");
        stringBuilder.append(this.h);
        stringBuilder.append(", snapSendCount=0");
        stringBuilder.append(", storyPostCount=");
        stringBuilder.append(this.j);
        stringBuilder.append(", audioOn=");
        stringBuilder.append(this.k);
        stringBuilder.append(", filterCarouselFirstEntryDirection=");
        stringBuilder.append(this.l);
        stringBuilder.append(", postCaptureMediaType=");
        stringBuilder.append(this.m);
        stringBuilder.append(", swipeInteractionMap=");
        stringBuilder.append(this.n);
        stringBuilder.append(", selectedGeofiltersList=");
        stringBuilder.append(this.o);
        stringBuilder.append(", stickers=");
        stringBuilder.append(this.p);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
