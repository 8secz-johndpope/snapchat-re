package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abuf */
public final class abuf {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private float e = MapboxConstants.MINIMUM_ZOOM;
    private float f = MapboxConstants.MINIMUM_ZOOM;

    public abuf(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        i = this.a;
        if (i != 0) {
            i2 = this.b;
            if (i2 != 0) {
                i3 = this.c;
                if (i3 != 0) {
                    i4 = this.d;
                    if (i4 != 0) {
                        if (i2 * i3 > i * i4) {
                            this.e = (((float) i3) - ((((float) i4) * ((float) i)) / ((float) i2))) / ((float) i3);
                            this.f = MapboxConstants.MINIMUM_ZOOM;
                        }
                        if (i2 * i3 < i * i4) {
                            this.f = (((float) i4) - ((((float) i3) * ((float) i2)) / ((float) i))) / ((float) i4);
                            this.e = MapboxConstants.MINIMUM_ZOOM;
                        }
                        return;
                    }
                }
            }
        }
        this.e = MapboxConstants.MINIMUM_ZOOM;
        this.f = MapboxConstants.MINIMUM_ZOOM;
    }

    public final float a() {
        return this.e;
    }

    public final float b() {
        return this.f;
    }
}
