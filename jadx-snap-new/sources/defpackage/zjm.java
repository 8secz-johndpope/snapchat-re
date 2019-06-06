package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import org.opencv.imgproc.Imgproc;

/* renamed from: zjm */
public final class zjm implements achg {
    public boolean a;
    public boolean b;
    public final String c;
    public final idg d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    private final ajxe l;

    /* renamed from: zjm$a */
    static final class a extends akcs implements akbk<String> {
        private /* synthetic */ zjm a;

        a(zjm zjm) {
            this.a = zjm;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.d.toString();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zjm.class), "stringRepresentation", "getStringRepresentation()Ljava/lang/String;");
    }

    private zjm(ide ide, String str, boolean z, boolean z2, boolean z3, boolean z4, zik zik, boolean z5, boolean z6, boolean z7, boolean z8, String str2) {
        ide ide2 = ide;
        String str3 = str;
        zik zik2 = zik;
        akcr.b(ide, "feature");
        akcr.b(str, "tag");
        this(new idg(ide, str, zik2 != null ? zik2.pageName : null), z, z2, z4, z6, z7, z8, str2);
        this.a = z5;
        this.b = z3;
    }

    public /* synthetic */ zjm(ide ide, String str, boolean z, boolean z2, boolean z3, boolean z4, zik zik, boolean z5, boolean z6, boolean z7, boolean z8, String str2, int i) {
        int i2 = i;
        this(ide, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? null : zik, (i2 & 128) != 0 ? false : z5, (i2 & 256) != 0 ? true : z6, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? false : z7, (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? false : z8, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? null : str2);
    }

    public zjm(idg idg, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str) {
        akcr.b(idg, "attribution");
        this.d = idg;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = str;
        this.l = ajxh.a(new a(this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d.c.getName());
        stringBuilder.append(' ');
        stringBuilder.append(this.d.d);
        this.c = stringBuilder.toString();
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return (String) this.l.b();
    }

    public final String c() {
        return b();
    }

    public final String d() {
        String str = this.k;
        return str == null ? b() : str;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zjm) {
                zjm zjm = (zjm) obj;
                if (akcr.a(this.d, zjm.d)) {
                    if ((this.e == zjm.e ? 1 : null) != null) {
                        if ((this.f == zjm.f ? 1 : null) != null) {
                            if ((this.g == zjm.g ? 1 : null) != null) {
                                if ((this.h == zjm.h ? 1 : null) != null) {
                                    if ((this.i == zjm.i ? 1 : null) != null) {
                                        if ((this.j == zjm.j ? 1 : null) == null || !akcr.a(this.k, zjm.k)) {
                                            return false;
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

    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        idg idg = this.d;
        int i = 0;
        int hashCode = (idg != null ? idg.hashCode() : 0) * 31;
        int i2 = this.e;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.f;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.g;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.h;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.i;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.j;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.k;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return b();
    }
}
