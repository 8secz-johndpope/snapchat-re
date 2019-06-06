package defpackage;

import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.tzl.a;

/* renamed from: ugi */
public final class ugi implements tzl {
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public final a e;
    public final boolean f;
    public final Integer g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private int l;

    private ugi(String str, int i, int i2, boolean z, boolean z2, int i3, int i4, a aVar, boolean z3, Integer num) {
        akcr.b(str, "toolId");
        akcr.b(aVar, "iconLocation");
        this.c = str;
        this.h = i;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = i3;
        this.d = i4;
        this.e = aVar;
        this.f = z3;
        this.g = num;
        this.a = this.h;
        this.b = this.i;
    }

    public /* synthetic */ ugi(String str, int i, int i2, boolean z, boolean z2, int i3, int i4, a aVar, boolean z3, Integer num, int i5) {
        int i6 = i5;
        this(str, i, i2, z, z2, (i6 & 32) != 0 ? -1 : i3, (i6 & 64) != 0 ? 0 : i4, (i6 & 128) != 0 ? a.VERTICAL_BAR : aVar, (i6 & 256) != 0 ? true : z3, (i6 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? null : num);
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.j;
    }

    public final a d() {
        return this.e;
    }

    public final int e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ugi) {
                ugi ugi = (ugi) obj;
                if (akcr.a(this.c, ugi.c)) {
                    if ((this.h == ugi.h ? 1 : null) != null) {
                        if ((this.i == ugi.i ? 1 : null) != null) {
                            if ((this.j == ugi.j ? 1 : null) != null) {
                                if ((this.k == ugi.k ? 1 : null) != null) {
                                    if ((this.l == ugi.l ? 1 : null) != null) {
                                        if ((this.d == ugi.d ? 1 : null) != null && akcr.a(this.e, ugi.e)) {
                                            if ((this.f == ugi.f ? 1 : null) == null || !akcr.a(this.g, ugi.g)) {
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
            return false;
        }
        return true;
    }

    public final int f() {
        return this.d;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return this.k;
    }

    public final int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.h) * 31) + this.i) * 31;
        int i2 = this.j;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.k;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (((((hashCode + i2) * 31) + this.l) * 31) + this.d) * 31;
        a aVar = this.e;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        i2 = this.f;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Integer num = this.g;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreviewToolIcon(toolId=");
        stringBuilder.append(this.c);
        stringBuilder.append(", iconResId=");
        stringBuilder.append(this.h);
        stringBuilder.append(", reversedIconResId=");
        stringBuilder.append(this.i);
        stringBuilder.append(", isReversible=");
        stringBuilder.append(this.j);
        stringBuilder.append(", needAnimation=");
        stringBuilder.append(this.k);
        stringBuilder.append(", customPrimaryPadding=");
        stringBuilder.append(this.l);
        stringBuilder.append(", customReversedPadding=");
        stringBuilder.append(this.d);
        stringBuilder.append(", iconLocation=");
        stringBuilder.append(this.e);
        stringBuilder.append(", isDefaultVisible=");
        stringBuilder.append(this.f);
        stringBuilder.append(", hintLabelTextResId=");
        stringBuilder.append(this.g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
