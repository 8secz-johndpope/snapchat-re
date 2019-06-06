package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import com.coremedia.iso.boxes.TrackReferenceTypeBox;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import defpackage.mhs.b;
import defpackage.mup.c;
import defpackage.mwg.a;
import java.util.List;
import org.opencv.imgproc.Imgproc;

/* renamed from: mux */
public final class mux {
    public final b a;
    public final miq b;
    final String c;
    public final String d;
    public final String e;
    public final miq f;
    public final miq g;
    public final mup h;
    public final mvy i;
    public final muy j;
    public final mwg k;
    public final mva l;
    public final mws m;
    public final List<muc> n;
    public final mud o;
    public final boolean p;
    public final akrm q;
    public final mue r;
    public final mwt s;
    public final mwr t;
    public final int u;

    public mux(b bVar, miq miq, String str, String str2, String str3, miq miq2, miq miq3, mup mup, mvy mvy, muy muy, mwg mwg, mva mva, mws mws, List<muc> list, mud mud, boolean z, akrm akrm, mue mue, mwt mwt, mwr mwr, int i) {
        b bVar2 = bVar;
        miq miq4 = miq;
        miq miq5 = miq2;
        miq miq6 = miq3;
        mup mup2 = mup;
        mvy mvy2 = mvy;
        muy muy2 = muy;
        mwg mwg2 = mwg;
        mws mws2 = mws;
        List<muc> list2 = list;
        mud mud2 = mud;
        mwt mwt2 = mwt;
        akcr.b(bVar, "id");
        akcr.b(miq4, "contentUri");
        akcr.b(miq5, "iconUri");
        akcr.b(miq6, "overlayImageUri");
        akcr.b(mup2, TrackReferenceTypeBox.TYPE1);
        akcr.b(mvy2, "context");
        akcr.b(muy2, "activationCamera");
        akcr.b(mwg2, "source");
        akcr.b(mws2, "sponsoredInfo");
        akcr.b(list2, "assetsManifestList");
        akcr.b(mud2, "communityInfo");
        akcr.b(mwt2, "trackingInfo");
        this.a = bVar2;
        this.b = miq4;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = miq5;
        this.g = miq6;
        this.h = mup2;
        this.i = mvy2;
        this.j = muy2;
        this.k = mwg2;
        this.l = mva;
        this.m = mws2;
        this.n = list2;
        this.o = mud2;
        this.p = z;
        this.q = akrm;
        this.r = mue;
        this.s = mwt2;
        this.t = mwr;
        this.u = i;
    }

    public /* synthetic */ mux(b bVar, miq miq, miq miq2, miq miq3, mup mup, mvy mvy, muy muy, mwg mwg, mws mws, List list, mud mud, mwt mwt, int i, int i2) {
        int i3 = i2;
        this(bVar, (i3 & 2) != 0 ? miq.b.a : miq, null, null, null, (i3 & 32) != 0 ? miq.b.a : miq2, (i3 & 64) != 0 ? miq.b.a : miq3, (i3 & 128) != 0 ? c.a : mup, (i3 & 256) != 0 ? mvy.c : mvy, (i3 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? muy.NONE : muy, (i3 & Imgproc.INTER_TAB_SIZE2) != 0 ? a.a : mwg, null, (i3 & 4096) != 0 ? mws.a.a : mws, (i3 & 8192) != 0 ? ajyw.a : list, (i3 & 16384) != 0 ? mud.d : mud, false, null, null, (262144 & i3) != 0 ? mwt.d : mwt, null, (i3 & 1048576) != 0 ? -1 : i);
    }

    private static mux a(b bVar, miq miq, String str, String str2, String str3, miq miq2, miq miq3, mup mup, mvy mvy, muy muy, mwg mwg, mva mva, mws mws, List<muc> list, mud mud, boolean z, akrm akrm, mue mue, mwt mwt, mwr mwr, int i) {
        b bVar2 = bVar;
        miq miq4 = miq;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        miq miq5 = miq2;
        miq miq6 = miq3;
        mup mup2 = mup;
        mvy mvy2 = mvy;
        muy muy2 = muy;
        mwg mwg2 = mwg;
        mva mva2 = mva;
        mws mws2 = mws;
        List<muc> list2 = list;
        mud mud2 = mud;
        boolean z2 = z;
        akrm akrm2 = akrm;
        mue mue2 = mue;
        mwt mwt2 = mwt;
        mwr mwr2 = mwr;
        int i2 = i;
        b bVar3 = bVar2;
        akcr.b(bVar2, "id");
        akcr.b(miq, "contentUri");
        akcr.b(miq2, "iconUri");
        akcr.b(miq3, "overlayImageUri");
        akcr.b(mup, TrackReferenceTypeBox.TYPE1);
        akcr.b(mvy, "context");
        akcr.b(muy, "activationCamera");
        akcr.b(mwg, "source");
        akcr.b(mws, "sponsoredInfo");
        akcr.b(list, "assetsManifestList");
        akcr.b(mud, "communityInfo");
        akcr.b(mwt, "trackingInfo");
        return new mux(bVar3, miq4, str4, str5, str6, miq5, miq6, mup2, mvy2, muy2, mwg2, mva2, mws2, list2, mud2, z2, akrm2, mue2, mwt2, mwr2, i2);
    }

    public static /* synthetic */ mux a(mux mux, b bVar, miq miq, String str, String str2, String str3, miq miq2, miq miq3, mup mup, mvy mvy, muy muy, mwg mwg, mva mva, mws mws, List list, mud mud, boolean z, akrm akrm, mue mue, mwt mwt, mwr mwr, int i, int i2) {
        mud mud2;
        boolean z2;
        boolean z3;
        akrm akrm2;
        akrm akrm3;
        mue mue2;
        mue mue3;
        mwt mwt2;
        mwt mwt3;
        mwr mwr2;
        mux mux2 = mux;
        int i3 = i2;
        b bVar2 = (i3 & 1) != 0 ? mux2.a : bVar;
        miq miq4 = (i3 & 2) != 0 ? mux2.b : miq;
        String str4 = (i3 & 4) != 0 ? mux2.c : str;
        String str5 = (i3 & 8) != 0 ? mux2.d : str2;
        String str6 = (i3 & 16) != 0 ? mux2.e : str3;
        miq miq5 = (i3 & 32) != 0 ? mux2.f : miq2;
        miq miq6 = (i3 & 64) != 0 ? mux2.g : miq3;
        mup mup2 = (i3 & 128) != 0 ? mux2.h : mup;
        mvy mvy2 = (i3 & 256) != 0 ? mux2.i : mvy;
        muy muy2 = (i3 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? mux2.j : muy;
        mwg mwg2 = (i3 & Imgproc.INTER_TAB_SIZE2) != 0 ? mux2.k : mwg;
        mva mva2 = (i3 & ItemAnimator.FLAG_MOVED) != 0 ? mux2.l : mva;
        mws mws2 = (i3 & 4096) != 0 ? mux2.m : mws;
        List list2 = (i3 & 8192) != 0 ? mux2.n : list;
        mud mud3 = (i3 & 16384) != 0 ? mux2.o : mud;
        if ((i3 & 32768) != 0) {
            mud2 = mud3;
            z2 = mux2.p;
        } else {
            mud2 = mud3;
            z2 = z;
        }
        if ((i3 & Imgproc.FLOODFILL_FIXED_RANGE) != 0) {
            z3 = z2;
            akrm2 = mux2.q;
        } else {
            z3 = z2;
            akrm2 = akrm;
        }
        if ((i3 & Imgproc.FLOODFILL_MASK_ONLY) != 0) {
            akrm3 = akrm2;
            mue2 = mux2.r;
        } else {
            akrm3 = akrm2;
            mue2 = mue;
        }
        if ((i3 & 262144) != 0) {
            mue3 = mue2;
            mwt2 = mux2.s;
        } else {
            mue3 = mue2;
            mwt2 = mwt;
        }
        if ((i3 & 524288) != 0) {
            mwt3 = mwt2;
            mwr2 = mux2.t;
        } else {
            mwt3 = mwt2;
            mwr2 = mwr;
        }
        return mux.a(bVar2, miq4, str4, str5, str6, miq5, miq6, mup2, mvy2, muy2, mwg2, mva2, mws2, list2, mud2, z3, akrm3, mue3, mwt3, mwr2, (i3 & 1048576) != 0 ? mux2.u : i);
    }

    public final muc a(b bVar) {
        akcr.b(bVar, "assetId");
        for (Object next : this.n) {
            if (akcr.a(((muc) next).a, (Object) bVar)) {
                break;
            }
        }
        Object next2 = null;
        return (muc) next2;
    }

    public final boolean a() {
        return this.t != null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mux) {
                mux mux = (mux) obj;
                if (akcr.a(this.a, mux.a) && akcr.a(this.b, mux.b) && akcr.a(this.c, mux.c) && akcr.a(this.d, mux.d) && akcr.a(this.e, mux.e) && akcr.a(this.f, mux.f) && akcr.a(this.g, mux.g) && akcr.a(this.h, mux.h) && akcr.a(this.i, mux.i) && akcr.a(this.j, mux.j) && akcr.a(this.k, mux.k) && akcr.a(this.l, mux.l) && akcr.a(this.m, mux.m) && akcr.a(this.n, mux.n) && akcr.a(this.o, mux.o)) {
                    if ((this.p == mux.p ? 1 : null) != null && akcr.a(this.q, mux.q) && akcr.a(this.r, mux.r) && akcr.a(this.s, mux.s) && akcr.a(this.t, mux.t)) {
                        if ((this.u == mux.u ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        b bVar = this.a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        miq miq = this.b;
        hashCode = (hashCode + (miq != null ? miq.hashCode() : 0)) * 31;
        String str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.d;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        miq = this.f;
        hashCode = (hashCode + (miq != null ? miq.hashCode() : 0)) * 31;
        miq = this.g;
        hashCode = (hashCode + (miq != null ? miq.hashCode() : 0)) * 31;
        mup mup = this.h;
        hashCode = (hashCode + (mup != null ? mup.hashCode() : 0)) * 31;
        mvy mvy = this.i;
        hashCode = (hashCode + (mvy != null ? mvy.hashCode() : 0)) * 31;
        muy muy = this.j;
        hashCode = (hashCode + (muy != null ? muy.hashCode() : 0)) * 31;
        mwg mwg = this.k;
        hashCode = (hashCode + (mwg != null ? mwg.hashCode() : 0)) * 31;
        mva mva = this.l;
        hashCode = (hashCode + (mva != null ? mva.hashCode() : 0)) * 31;
        mws mws = this.m;
        hashCode = (hashCode + (mws != null ? mws.hashCode() : 0)) * 31;
        List list = this.n;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        mud mud = this.o;
        hashCode = (hashCode + (mud != null ? mud.hashCode() : 0)) * 31;
        int i2 = this.p;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        akrm akrm = this.q;
        hashCode = (hashCode + (akrm != null ? akrm.hashCode() : 0)) * 31;
        mue mue = this.r;
        hashCode = (hashCode + (mue != null ? mue.hashCode() : 0)) * 31;
        mwt mwt = this.s;
        hashCode = (hashCode + (mwt != null ? mwt.hashCode() : 0)) * 31;
        mwr mwr = this.t;
        if (mwr != null) {
            i = mwr.hashCode();
        }
        return ((hashCode + i) * 31) + this.u;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Lens(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(',');
        stringBuilder.append("contentUri=");
        stringBuilder.append(this.b);
        stringBuilder.append(',');
        stringBuilder.append("name=");
        stringBuilder.append(this.e);
        stringBuilder.append(',');
        stringBuilder.append("context=");
        stringBuilder.append(this.i);
        stringBuilder.append(',');
        stringBuilder.append("source=");
        stringBuilder.append(this.k);
        stringBuilder.append(',');
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
