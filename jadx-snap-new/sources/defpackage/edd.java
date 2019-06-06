package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: edd */
public class edd {
    public final List<ecc> i;
    public final List<ecd> j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final List<ecb> o;
    public final List<abtl> p;
    public final List<abtl> q;
    public final List<abtl> r;
    public final List<abtl> s;
    public final List<ece> t;
    public final int u;
    public final float v;
    public final float w;
    public final float x;

    public edd(List<ecc> list, List<ecd> list2, boolean z, boolean z2, boolean z3, int i, List<ecb> list3, List<abtl> list4, List<abtl> list5, List<abtl> list6, List<abtl> list7, List<ece> list8, int i2, float f, float f2, float f3) {
        this.i = ImmutableList.copyOf((Collection) list);
        this.j = ImmutableList.copyOf((Collection) list2);
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = i;
        this.o = ImmutableList.copyOf((Collection) list3);
        this.p = ImmutableList.copyOf((Collection) list4);
        this.q = ImmutableList.copyOf((Collection) list5);
        this.r = ImmutableList.copyOf((Collection) list6);
        this.s = ImmutableList.copyOf((Collection) list7);
        this.t = ImmutableList.copyOf((Collection) list8);
        this.u = i2;
        this.v = f;
        this.w = f2;
        this.x = f3;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "supportedFlashModes: %s, supportedFocusModes: %s, zoomSupported: %b, videoStabilizationSupported: %b, opticalStabilizationSupported: %b, maxExposureCompensation: %d supportedPreviewFpsRanges: %s, supportedRecordingResolutions: %s, supportedJpegPictureResolutions: %s, supportedGpuPictureResolutions %s, supportedPreviewResolutions: %s maxNumLocalizedFocusAreas %d, horizontalViewAngle %f, verticalViewAngle %f, maxZoomLevel %f", new Object[]{this.i.toString(), this.j.toString(), Boolean.valueOf(this.k), Boolean.valueOf(this.l), Boolean.valueOf(this.m), Integer.valueOf(this.n), this.o.toString(), this.p.toString(), this.q.toString(), this.r.toString(), this.s.toString(), Integer.valueOf(this.u), Float.valueOf(this.v), Float.valueOf(this.w), Float.valueOf(this.x)});
    }
}
