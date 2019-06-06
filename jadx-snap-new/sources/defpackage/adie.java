package defpackage;

import android.opengl.Matrix;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.File;
import java.util.Arrays;

/* renamed from: adie */
public final class adie implements Cloneable {
    public final adhn a;
    public float[] b;

    public adie() {
        this(new adhs());
    }

    private adie(adhn adhn) {
        this.b = new float[16];
        this.a = adhn;
        this.a.a(this.b);
    }

    public adie(float[] fArr) {
        this(fArr, new adhs());
    }

    private adie(float[] fArr, adhn adhn) {
        this.b = new float[16];
        Preconditions.checkArgument(fArr.length == 16);
        this.b = fArr;
        this.a = adhn;
    }

    private adie a(adoa adoa) {
        try {
            int c = adoa.c();
            return a((float) c);
        } finally {
            adoa.l();
        }
    }

    private void a(float[] fArr) {
        adhn adhn = this.a;
        float[] fArr2 = this.b;
        adhn.a(fArr2, fArr, Arrays.copyOf(fArr2, 16));
    }

    public final adie a(float f) {
        float[] fArr = new float[16];
        this.a.a(fArr, f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, -1.0f);
        a(fArr);
        return this;
    }

    public final adie a(float f, float f2) {
        float[] fArr = new float[16];
        this.a.a(fArr);
        this.a.b(fArr, f, f2);
        a(fArr);
        return this;
    }

    public final adie a(adie adie) {
        a(adie.b);
        return this;
    }

    public final adie a(File file) {
        return a(new adoa(file));
    }

    public final float[] a() {
        return this.b;
    }

    public final adie b(float f, float f2) {
        float[] fArr = new float[16];
        this.a.a(fArr);
        this.a.a(fArr, f, f2);
        a(fArr);
        return this;
    }

    public final void b() {
        this.a.a(this.b);
    }

    public final adie c() {
        float[] fArr = new float[16];
        this.a.a(fArr, 180.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        a(fArr);
        return this;
    }

    public final adie d() {
        float[] fArr = new float[16];
        this.a.a(fArr, 180.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM);
        a(fArr);
        return this;
    }

    public final boolean e() {
        adif adif = new adif();
        Matrix.multiplyMV(adif.a, 0, this.b, 0, Arrays.copyOf(adif.a, 4), 0);
        return Math.abs(adif.a[1]) > Math.abs(adif.a[0]);
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof adie) ? false : Arrays.equals(this.b, ((adie) obj).b);
    }

    /* renamed from: f */
    public final adie clone() {
        return new adie((float[]) this.b.clone());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }
}
