package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.TintTypedArray;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import defpackage.hh.a;
import java.lang.ref.WeakReference;

/* renamed from: ny */
public class ny {
    final TextView a;
    public final oa b;
    int c = 0;
    Typeface d;
    boolean e;
    private ot f;
    private ot g;
    private ot h;
    private ot i;

    public ny(TextView textView) {
        this.a = textView;
        this.b = new oa(this.a);
    }

    public static ny a(TextView textView) {
        return VERSION.SDK_INT >= 17 ? new nz(textView) : new ny(textView);
    }

    protected static ot a(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        ot otVar = new ot();
        otVar.d = true;
        otVar.a = tintList;
        return otVar;
    }

    private void a(Context context, TintTypedArray tintTypedArray) {
        this.c = tintTypedArray.getInt(2, this.c);
        int i = 10;
        boolean z = false;
        if (tintTypedArray.hasValue(10) || tintTypedArray.hasValue(12)) {
            this.d = null;
            if (tintTypedArray.hasValue(12)) {
                i = 12;
            }
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.a);
                try {
                    this.d = tintTypedArray.getFont(i, this.c, new a() {
                        public final void a(Typeface typeface) {
                            ny nyVar = ny.this;
                            WeakReference weakReference = weakReference;
                            if (nyVar.e) {
                                nyVar.d = typeface;
                                TextView textView = (TextView) weakReference.get();
                                if (textView != null) {
                                    textView.setTypeface(typeface, nyVar.c);
                                }
                            }
                        }
                    });
                    if (this.d == null) {
                        z = true;
                    }
                    this.e = z;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.d == null) {
                String string = tintTypedArray.getString(i);
                if (string != null) {
                    this.d = Typeface.create(string, this.c);
                }
            }
            return;
        }
        if (tintTypedArray.hasValue(1)) {
            Typeface typeface;
            this.e = false;
            int i2 = tintTypedArray.getInt(1, 1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                typeface = Typeface.SERIF;
            } else if (i2 == 3) {
                this.d = Typeface.MONOSPACE;
            }
            this.d = typeface;
        }
    }

    private void b(int i, float f) {
        this.b.a(i, f);
    }

    public void a() {
        if (this.f != null || this.g != null || this.h != null || this.i != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.f);
            a(compoundDrawables[1], this.g);
            a(compoundDrawables[2], this.h);
            a(compoundDrawables[3], this.i);
        }
    }

    public final void a(int i) {
        this.b.a(i);
    }

    public final void a(int i, float f) {
        if (!kt.a && !this.b.d()) {
            b(i, f);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.b.a(i, i2, i3, i4);
    }

    public final void a(Context context, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, lx.a.z);
        if (obtainStyledAttributes.hasValue(13)) {
            a(obtainStyledAttributes.getBoolean(13, false));
        }
        if (VERSION.SDK_INT < 23 && obtainStyledAttributes.hasValue(3)) {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(3);
            if (colorStateList != null) {
                this.a.setTextColor(colorStateList);
            }
        }
        a(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        Typeface typeface = this.d;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.c);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Drawable drawable, ot otVar) {
        if (drawable != null && otVar != null) {
            AppCompatDrawableManager.tintDrawable(drawable, otVar, this.a.getDrawableState());
        }
    }

    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i) {
        TintTypedArray obtainStyledAttributes;
        Object obj;
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.a.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        TintTypedArray obtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, attributeSet2, lx.a.i, i2, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
        if (obtainStyledAttributes2.hasValue(3)) {
            this.f = ny.a(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(3, 0));
        }
        if (obtainStyledAttributes2.hasValue(1)) {
            this.g = ny.a(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(1, 0));
        }
        if (obtainStyledAttributes2.hasValue(4)) {
            this.h = ny.a(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(4, 0));
        }
        if (obtainStyledAttributes2.hasValue(2)) {
            this.i = ny.a(context, appCompatDrawableManager, obtainStyledAttributes2.getResourceId(2, 0));
        }
        obtainStyledAttributes2.recycle();
        boolean z3 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, resourceId, lx.a.z);
            if (z3 || !obtainStyledAttributes.hasValue(13)) {
                obj = null;
                z = false;
            } else {
                z = obtainStyledAttributes.getBoolean(13, false);
                obj = 1;
            }
            a(context, obtainStyledAttributes);
            if (VERSION.SDK_INT < 23) {
                colorStateList = obtainStyledAttributes.hasValue(3) ? obtainStyledAttributes.getColorStateList(3) : null;
                colorStateList2 = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getColorStateList(4) : null;
                colorStateList3 = obtainStyledAttributes.hasValue(5) ? obtainStyledAttributes.getColorStateList(5) : null;
            } else {
                colorStateList = null;
                colorStateList3 = null;
                colorStateList2 = null;
            }
            obtainStyledAttributes.recycle();
            ColorStateList colorStateList4 = colorStateList3;
            colorStateList3 = colorStateList;
            colorStateList = colorStateList4;
        } else {
            colorStateList = null;
            obj = null;
            colorStateList3 = null;
            z = false;
            colorStateList2 = null;
        }
        obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet2, lx.a.z, i2, 0);
        if (z3 || !obtainStyledAttributes.hasValue(13)) {
            z2 = z;
        } else {
            z2 = obtainStyledAttributes.getBoolean(13, false);
            obj = 1;
        }
        if (VERSION.SDK_INT < 23) {
            if (obtainStyledAttributes.hasValue(3)) {
                colorStateList3 = obtainStyledAttributes.getColorStateList(3);
            }
            if (obtainStyledAttributes.hasValue(4)) {
                colorStateList2 = obtainStyledAttributes.getColorStateList(4);
            }
            if (obtainStyledAttributes.hasValue(5)) {
                colorStateList = obtainStyledAttributes.getColorStateList(5);
            }
        }
        ColorStateList colorStateList5 = colorStateList;
        ColorStateList colorStateList6 = colorStateList3;
        colorStateList = colorStateList2;
        a(context, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        if (colorStateList6 != null) {
            this.a.setTextColor(colorStateList6);
        }
        if (colorStateList != null) {
            this.a.setHintTextColor(colorStateList);
        }
        if (colorStateList5 != null) {
            this.a.setLinkTextColor(colorStateList5);
        }
        if (!(z3 || r13 == null)) {
            a(z2);
        }
        Typeface typeface = this.d;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.c);
        }
        oa oaVar = this.b;
        TypedArray obtainStyledAttributes3 = oaVar.g.obtainStyledAttributes(attributeSet2, lx.a.j, i2, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            oaVar.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3)) {
            int resourceId2 = obtainStyledAttributes3.getResourceId(3, 0);
            if (resourceId2 > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
                int length = obtainTypedArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                    }
                    oaVar.e = oa.a(iArr);
                    oaVar.a();
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes3.recycle();
        if (!oaVar.e()) {
            oaVar.a = 0;
        } else if (oaVar.a == 1) {
            if (!oaVar.f) {
                DisplayMetrics displayMetrics = oaVar.g.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                oaVar.a(dimension2, dimension3, dimension);
            }
            oaVar.b();
        }
        if (kt.a && this.b.a != 0) {
            int[] iArr2 = this.b.e;
            if (iArr2.length > 0) {
                if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.b.c), Math.round(this.b.d), Math.round(this.b.b), 0);
                    return;
                }
                this.a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
            }
        }
    }

    public final void a(boolean z) {
        this.a.setAllCaps(z);
    }

    public final void a(int[] iArr, int i) {
        this.b.a(iArr, i);
    }

    public final void b() {
        if (!kt.a) {
            this.b.c();
        }
    }
}
