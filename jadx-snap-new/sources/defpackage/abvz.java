package defpackage;

import android.widget.ImageView.ScaleType;

/* renamed from: abvz */
public final /* synthetic */ class abvz {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScaleType.values().length];
        a = iArr;
        iArr[ScaleType.MATRIX.ordinal()] = 1;
        a[ScaleType.FIT_XY.ordinal()] = 2;
        a[ScaleType.FIT_START.ordinal()] = 3;
        a[ScaleType.FIT_CENTER.ordinal()] = 4;
        a[ScaleType.FIT_END.ordinal()] = 5;
        a[ScaleType.CENTER.ordinal()] = 6;
        a[ScaleType.CENTER_CROP.ordinal()] = 7;
        a[ScaleType.CENTER_INSIDE.ordinal()] = 8;
        iArr = new int[ScaleType.values().length];
        b = iArr;
        iArr[ScaleType.CENTER.ordinal()] = 1;
        b[ScaleType.FIT_XY.ordinal()] = 2;
    }
}
