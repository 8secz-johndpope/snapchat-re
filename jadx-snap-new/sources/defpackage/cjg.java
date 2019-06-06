package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.util.Map;
import java.util.Objects;

/* renamed from: cjg */
public final class cjg {
    public final cje a;
    public final String b;
    public final int c;
    public final boolean d;
    public String e;
    public int f;
    public final boolean g;
    public final alak h;
    public boolean i;
    private final Map<String, String> j;

    /* renamed from: cjg$a */
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

    private cjg(cje cje, String str, int i, boolean z, String str2, int i2, boolean z2, Map<String, String> map, alak alak, boolean z3) {
        akcr.b(cje, "adInventoryType");
        akcr.b(str, "adInventoryId");
        akcr.b(map, "originalTargetingParams");
        this.a = cje;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = str2;
        this.f = i2;
        this.g = z2;
        this.j = map;
        this.h = alak;
        this.i = z3;
    }

    public static /* synthetic */ cjg a(cjg cjg, cje cje, String str, int i, boolean z, String str2, int i2, boolean z2, Map map, alak alak, boolean z3, int i3) {
        cjg cjg2 = cjg;
        int i4 = i3;
        cje cje2 = (i4 & 1) != 0 ? cjg2.a : cje;
        String str3 = (i4 & 2) != 0 ? cjg2.b : str;
        int i5 = (i4 & 4) != 0 ? cjg2.c : i;
        boolean z4 = (i4 & 8) != 0 ? cjg2.d : z;
        String str4 = (i4 & 16) != 0 ? cjg2.e : str2;
        int i6 = (i4 & 32) != 0 ? cjg2.f : i2;
        boolean z5 = (i4 & 64) != 0 ? cjg2.g : z2;
        Map map2 = (i4 & 128) != 0 ? cjg2.j : map;
        alak alak2 = (i4 & 256) != 0 ? cjg2.h : alak;
        boolean z6 = (i4 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? cjg2.i : z3;
        akcr.b(cje2, "adInventoryType");
        akcr.b(str3, "adInventoryId");
        akcr.b(map2, "originalTargetingParams");
        return new cjg(cje2, str3, i5, z4, str4, i6, z5, map2, alak2, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            cjg cjg = (cjg) obj;
            return (this.a == cjg.a && (akcr.a(this.b, cjg.b) ^ 1) == 0 && this.d == cjg.d) ? (!this.g || this.c == cjg.c) && (akcr.a(this.h, cjg.h) ^ 1) == 0 : false;
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.adinfo.model.AdRequestTargetingParams");
        }
    }

    public final int hashCode() {
        return Objects.hash(this.g ? new Object[]{this.a, this.b, Boolean.valueOf(this.d), Integer.valueOf(this.c), this.h} : new Object[]{this.a, this.b, Boolean.valueOf(this.d), this.h});
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdRequestTargetingParams(adInventoryType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", adInventoryId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", adPosition=");
        stringBuilder.append(this.c);
        stringBuilder.append(", isUnskippableAdSlot=");
        stringBuilder.append(this.d);
        stringBuilder.append(", debug_ad_id=");
        stringBuilder.append(this.e);
        stringBuilder.append(", numAdsRequested=");
        stringBuilder.append(this.f);
        stringBuilder.append(", isContextualRequest=");
        stringBuilder.append(this.g);
        stringBuilder.append(", originalTargetingParams=");
        stringBuilder.append(this.j);
        stringBuilder.append(", discoverChannelMetadata=");
        stringBuilder.append(this.h);
        stringBuilder.append(", isMultiAuctionRequest=");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
