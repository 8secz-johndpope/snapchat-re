package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.nio.FloatBuffer;

/* renamed from: adia */
public final class adia {
    public static final float[] a = new float[]{-1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, -1.0f, -1.0f, MapboxConstants.MINIMUM_ZOOM, 1.0f, -1.0f, MapboxConstants.MINIMUM_ZOOM};
    public static final float[] b = new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, 1.0f, 1.0f};
    public int c;
    public int d;
    public FloatBuffer e;
    public FloatBuffer f;
    public int g;
    public int h;
    public int i;
    public int j;
    private adhk k;
    private final adht l;

    public adia() {
        this(adhk.a, adht.a);
    }

    private adia(adhk adhk, adht adht) {
        this.c = 1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = adhk;
        this.l = adht;
    }
}
