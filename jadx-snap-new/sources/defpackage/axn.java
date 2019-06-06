package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.facebook.infer.annotation.ReturnsOwnership;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.atr.a;
import defpackage.axg.b;
import java.util.Arrays;

/* renamed from: axn */
public final class axn {
    private static Drawable a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        return resourceId == 0 ? null : context.getResources().getDrawable(resourceId);
    }

    private static b a(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return b.a;
            case 1:
                return b.b;
            case 2:
                return b.c;
            case 3:
                return b.d;
            case 4:
                return b.e;
            case 5:
                return b.f;
            case 6:
                return b.g;
            case 7:
                return b.h;
            case 8:
                return b.i;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static axm a(Context context, AttributeSet attributeSet) {
        return axn.a(new axm(context.getResources()), context, attributeSet);
    }

    private static axm a(axm axm, Context context, AttributeSet attributeSet) {
        axp a;
        float dimensionPixelSize;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        int i2;
        axm axm2 = axm;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = 7;
        int i4 = 2;
        int i5 = 8;
        int i6 = 6;
        float f = MapboxConstants.MINIMUM_ZOOM;
        boolean z = false;
        int i7 = 1;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, a.a);
            try {
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                int i8;
                int indexCount = obtainStyledAttributes.getIndexCount();
                int i9 = 0;
                boolean z8 = true;
                int i10 = 0;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                boolean z14 = true;
                boolean z15 = true;
                int i11 = 0;
                while (i10 < indexCount) {
                    int index = obtainStyledAttributes.getIndex(i10);
                    if (index == 0) {
                        axm2.a(axn.a(obtainStyledAttributes, index));
                    } else if (index == 28) {
                        axm2.q = obtainStyledAttributes.getBoolean(index, z);
                    } else if (index == i6) {
                        axm2.d = axn.a(context2, obtainStyledAttributes, index);
                    } else {
                        Drawable drawable = null;
                        Drawable a2;
                        if (index == i5) {
                            a2 = axn.a(context2, obtainStyledAttributes, index);
                            if (a2 != null) {
                                drawable = new StateListDrawable();
                                int[] iArr = new int[i7];
                                iArr[z] = 16842919;
                                drawable.addState(iArr, a2);
                            }
                            axm2.o = drawable;
                        } else if (index == 10) {
                            axm2.j = axn.a(context2, obtainStyledAttributes, index);
                        } else if (index == i4) {
                            axm2.b = obtainStyledAttributes.getInt(index, z);
                        } else if (index == 29) {
                            axm2.c = obtainStyledAttributes.getFloat(index, f);
                        } else if (index == i3) {
                            axm2.e = axn.a(obtainStyledAttributes, index);
                        } else if (index == 12) {
                            axm2.f = axn.a(context2, obtainStyledAttributes, index);
                        } else if (index == 13) {
                            axm2.g = axn.a(obtainStyledAttributes, index);
                        } else if (index == 3) {
                            axm2.h = axn.a(context2, obtainStyledAttributes, index);
                        } else if (index == 4) {
                            axm2.i = axn.a(obtainStyledAttributes, index);
                        } else if (index == 11) {
                            axm2.k = axn.a(obtainStyledAttributes, index);
                        } else {
                            if (index == 9) {
                                i9 = obtainStyledAttributes.getInteger(index, i9);
                            } else if (index == i7) {
                                axm2.m = axn.a(context2, obtainStyledAttributes, index);
                            } else if (index == 5) {
                                a2 = axn.a(context2, obtainStyledAttributes, index);
                                if (a2 == null) {
                                    axm2.n = null;
                                } else {
                                    Drawable[] drawableArr = new Drawable[i7];
                                    drawableArr[z] = a2;
                                    axm2.n = Arrays.asList(drawableArr);
                                }
                            } else if (index == 14) {
                                axn.a(axm).b = obtainStyledAttributes.getBoolean(index, z);
                            } else if (index == 24) {
                                i11 = obtainStyledAttributes.getDimensionPixelSize(index, i11);
                            } else {
                                int i12 = i11;
                                if (index == 20) {
                                    z8 = obtainStyledAttributes.getBoolean(index, z8);
                                    i11 = i12;
                                } else if (index == 21) {
                                    z2 = obtainStyledAttributes.getBoolean(index, z10);
                                    i11 = i12;
                                    z3 = z9;
                                    z4 = z11;
                                    z5 = z12;
                                    z6 = z14;
                                    z7 = z15;
                                    i10++;
                                    context2 = context;
                                    z14 = z6;
                                    z12 = z5;
                                    z9 = z3;
                                    z10 = z2;
                                    z15 = z7;
                                    z11 = z4;
                                    i3 = 7;
                                    i4 = 2;
                                    i5 = 8;
                                    i6 = 6;
                                    f = MapboxConstants.MINIMUM_ZOOM;
                                    z = false;
                                    i7 = 1;
                                } else {
                                    z2 = z10;
                                    if (index == 16) {
                                        z6 = obtainStyledAttributes.getBoolean(index, z14);
                                        i11 = i12;
                                        z3 = z9;
                                        z4 = z11;
                                        z5 = z12;
                                    } else {
                                        z6 = z14;
                                        if (index == 17) {
                                            z5 = obtainStyledAttributes.getBoolean(index, z12);
                                            i11 = i12;
                                            z3 = z9;
                                        } else {
                                            z5 = z12;
                                            if (index == 22) {
                                                z3 = obtainStyledAttributes.getBoolean(index, z9);
                                                i11 = i12;
                                            } else {
                                                z3 = z9;
                                                if (index == 19) {
                                                    z4 = obtainStyledAttributes.getBoolean(index, z11);
                                                    i11 = i12;
                                                } else {
                                                    z4 = z11;
                                                    if (index == 18) {
                                                        z7 = obtainStyledAttributes.getBoolean(index, z15);
                                                    } else {
                                                        z7 = z15;
                                                        if (index == 15) {
                                                            z13 = obtainStyledAttributes.getBoolean(index, z13);
                                                        } else {
                                                            z = z13;
                                                            if (index == 23) {
                                                                a = axn.a(axm);
                                                                i8 = i9;
                                                                a.d = obtainStyledAttributes.getColor(index, 0);
                                                                a.a = axp.a.OVERLAY_COLOR;
                                                                i11 = i12;
                                                            } else {
                                                                i8 = i9;
                                                                if (index == 27) {
                                                                    boolean z16;
                                                                    a = axn.a(axm);
                                                                    dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                                    if (dimensionPixelSize >= MapboxConstants.MINIMUM_ZOOM) {
                                                                        i11 = i12;
                                                                        z16 = true;
                                                                    } else {
                                                                        i11 = i12;
                                                                        z16 = false;
                                                                    }
                                                                    auh.a(z16, "the border width cannot be < 0");
                                                                    a.e = dimensionPixelSize;
                                                                } else {
                                                                    i11 = i12;
                                                                    if (index == 25) {
                                                                        axn.a(axm).f = obtainStyledAttributes.getColor(index, 0);
                                                                    } else if (index == 26) {
                                                                        a = axn.a(axm);
                                                                        dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                                                                        auh.a(dimensionPixelSize >= MapboxConstants.MINIMUM_ZOOM, "the padding cannot be < 0");
                                                                        a.g = dimensionPixelSize;
                                                                    }
                                                                }
                                                            }
                                                            i9 = i8;
                                                            z13 = z;
                                                            i10++;
                                                            context2 = context;
                                                            z14 = z6;
                                                            z12 = z5;
                                                            z9 = z3;
                                                            z10 = z2;
                                                            z15 = z7;
                                                            z11 = z4;
                                                            i3 = 7;
                                                            i4 = 2;
                                                            i5 = 8;
                                                            i6 = 6;
                                                            f = MapboxConstants.MINIMUM_ZOOM;
                                                            z = false;
                                                            i7 = 1;
                                                        }
                                                    }
                                                    i11 = i12;
                                                    i10++;
                                                    context2 = context;
                                                    z14 = z6;
                                                    z12 = z5;
                                                    z9 = z3;
                                                    z10 = z2;
                                                    z15 = z7;
                                                    z11 = z4;
                                                    i3 = 7;
                                                    i4 = 2;
                                                    i5 = 8;
                                                    i6 = 6;
                                                    f = MapboxConstants.MINIMUM_ZOOM;
                                                    z = false;
                                                    i7 = 1;
                                                }
                                            }
                                        }
                                        z4 = z11;
                                    }
                                    z7 = z15;
                                    i10++;
                                    context2 = context;
                                    z14 = z6;
                                    z12 = z5;
                                    z9 = z3;
                                    z10 = z2;
                                    z15 = z7;
                                    z11 = z4;
                                    i3 = 7;
                                    i4 = 2;
                                    i5 = 8;
                                    i6 = 6;
                                    f = MapboxConstants.MINIMUM_ZOOM;
                                    z = false;
                                    i7 = 1;
                                }
                            }
                            z3 = z9;
                            z2 = z10;
                            z4 = z11;
                            z5 = z12;
                            z6 = z14;
                            z7 = z15;
                            i10++;
                            context2 = context;
                            z14 = z6;
                            z12 = z5;
                            z9 = z3;
                            z10 = z2;
                            z15 = z7;
                            z11 = z4;
                            i3 = 7;
                            i4 = 2;
                            i5 = 8;
                            i6 = 6;
                            f = MapboxConstants.MINIMUM_ZOOM;
                            z = false;
                            i7 = 1;
                        }
                    }
                    z3 = z9;
                    z2 = z10;
                    z4 = z11;
                    z5 = z12;
                    z = z13;
                    z6 = z14;
                    z7 = z15;
                    i8 = i9;
                    i9 = i8;
                    z13 = z;
                    i10++;
                    context2 = context;
                    z14 = z6;
                    z12 = z5;
                    z9 = z3;
                    z10 = z2;
                    z15 = z7;
                    z11 = z4;
                    i3 = 7;
                    i4 = 2;
                    i5 = 8;
                    i6 = 6;
                    f = MapboxConstants.MINIMUM_ZOOM;
                    z = false;
                    i7 = 1;
                }
                z3 = z9;
                z2 = z10;
                z4 = z11;
                z5 = z12;
                z = z13;
                z6 = z14;
                z7 = z15;
                i8 = i9;
                obtainStyledAttributes.recycle();
                Object obj5;
                Object obj6;
                if (VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
                    obj5 = (z8 && z3) ? 1 : null;
                    obj = (z2 && z4) ? 1 : null;
                    obj6 = (z5 && z) ? 1 : null;
                    obj2 = (z6 && z7) ? 1 : null;
                    obj3 = obj6;
                    obj4 = obj2;
                    obj2 = obj;
                    i = i11;
                    obj = obj5;
                } else {
                    obj = (z8 && z4) ? 1 : null;
                    obj5 = (z2 && z3) ? 1 : null;
                    obj6 = (z5 && z7) ? 1 : null;
                    obj2 = (z6 && z) ? 1 : null;
                    obj3 = obj6;
                    obj4 = obj2;
                    i = i11;
                    obj2 = obj5;
                }
                i2 = i8;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                if (VERSION.SDK_INT >= 17) {
                    context.getResources().getConfiguration().getLayoutDirection();
                }
            }
        } else {
            i2 = 0;
            i = 0;
            obj2 = 1;
            obj3 = 1;
            obj4 = 1;
            obj = 1;
        }
        if (axm2.j != null && i2 > 0) {
            axm2.j = new awu(axm2.j, i2);
        }
        if (i > 0) {
            a = axn.a(axm);
            f = obj != null ? (float) i : MapboxConstants.MINIMUM_ZOOM;
            float f2 = obj2 != null ? (float) i : MapboxConstants.MINIMUM_ZOOM;
            dimensionPixelSize = obj3 != null ? (float) i : MapboxConstants.MINIMUM_ZOOM;
            float f3 = obj4 != null ? (float) i : MapboxConstants.MINIMUM_ZOOM;
            if (a.c == null) {
                a.c = new float[8];
            }
            float[] fArr = a.c;
            fArr[1] = f;
            fArr[0] = f;
            fArr[3] = f2;
            fArr[2] = f2;
            fArr[5] = dimensionPixelSize;
            fArr[4] = dimensionPixelSize;
            fArr[7] = f3;
            fArr[6] = f3;
        }
        return axm2;
    }

    @ReturnsOwnership
    private static axp a(axm axm) {
        if (axm.p == null) {
            axm.p = new axp();
        }
        return axm.p;
    }
}
