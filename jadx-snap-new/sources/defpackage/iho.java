package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: iho */
public final class iho {

    /* renamed from: iho$a */
    public static final class a implements OnLayoutChangeListener {
        private /* synthetic */ akbl a;

        public a(akbl akbl) {
            this.a = akbl;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            akcr.b(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.a.invoke(view);
        }
    }

    public static final ValueAnimator a(View view, float f) {
        akcr.b(view, "receiver$0");
        akcr.b(view, "target");
        Object ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f, MapboxConstants.MINIMUM_ZOOM});
        akcr.a(ofFloat, "ObjectAnimator.ofFloat(t…RANSLATION_Y, startY, 0f)");
        return (ValueAnimator) ofFloat;
    }

    public static final ValueAnimator a(View view, float f, float f2) {
        akcr.b(view, "receiver$0");
        akcr.b(view, "target");
        Object ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{f, f2});
        akcr.a(ofFloat, "ObjectAnimator.ofFloat(t…NSLATION_Y, startY, endY)");
        return (ValueAnimator) ofFloat;
    }

    public static /* synthetic */ ValueAnimator a(View view, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = MapboxConstants.MINIMUM_ZOOM;
        }
        if ((i & 2) != 0) {
            f2 = (float) view.getHeight();
        }
        return iho.a(view, f, f2);
    }

    public static final Rect a(View view, Rect rect) {
        akcr.b(view, "receiver$0");
        akcr.b(rect, "outRect");
        int[] iArr = new int[]{0, 0};
        view.getLocationOnScreen(iArr);
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        return rect;
    }

    public static final <T extends View> T a(T t) {
        akcr.b(t, "receiver$0");
        idb.a((View) t);
        return t;
    }

    public static final <T extends View> T a(T t, int i) {
        akcr.b(t, "receiver$0");
        t.setPadding(i, i, i, i);
        return t;
    }

    public static final View a(View view, View view2) {
        akcr.b(view2, "replacement");
        if (view == null) {
            return view2;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup == null) {
            return view2;
        }
        int indexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeViewInLayout(view);
        view2.setId(view.getId());
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view2, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view2, indexOfChild);
        }
        return view2;
    }

    public static final void a(View view, akbl<? super View, ajxw> akbl) {
        akcr.b(view, "receiver$0");
        akcr.b(akbl, "action");
        if (!kb.d(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(akbl));
        } else {
            akbl.invoke(view);
        }
    }

    public static final void a(ajxe<? extends View>[] ajxeArr, int i) {
        akcr.b(ajxeArr, "receiver$0");
        for (ajxe b : ajxeArr) {
            ((View) b.b()).setVisibility(i);
        }
    }

    public static final void a(View[] viewArr) {
        akcr.b(viewArr, "receiver$0");
        for (View a : viewArr) {
            iho.a(a);
        }
    }

    public static final void a(View[] viewArr, int i) {
        akcr.b(viewArr, "receiver$0");
        for (View visibility : viewArr) {
            visibility.setVisibility(i);
        }
    }

    public static final ValueAnimator b(View view, float f) {
        akcr.b(view, "receiver$0");
        return idb.a(f, (float) MapboxConstants.MINIMUM_ZOOM, view);
    }

    public static final <T extends View> T b(T t) {
        akcr.b(t, "receiver$0");
        ViewParent parent = t.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(t);
        }
        return t;
    }

    public static final <T extends View> T b(T t, int i) {
        akcr.b(t, "receiver$0");
        t.setPadding(i, t.getPaddingTop(), t.getPaddingRight(), t.getPaddingBottom());
        return t;
    }

    public static final <T extends View> T c(T t, int i) {
        akcr.b(t, "receiver$0");
        t.setPadding(t.getPaddingLeft(), i, t.getPaddingRight(), t.getPaddingBottom());
        return t;
    }

    public static final <T extends View> T d(T t, int i) {
        akcr.b(t, "receiver$0");
        t.setPadding(t.getPaddingLeft(), t.getPaddingTop(), i, t.getPaddingBottom());
        return t;
    }

    public static final <T extends View> T e(T t, int i) {
        akcr.b(t, "receiver$0");
        t.setPadding(t.getPaddingLeft(), t.getPaddingTop(), t.getPaddingRight(), i);
        return t;
    }

    public static final MarginLayoutParams f(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (marginLayoutParams == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(view.getLayoutParams());
            stringBuilder.append(" is not a MarginLayoutParams");
        }
        return marginLayoutParams;
    }

    public static final void f(View view, int i) {
        akcr.b(view, "receiver$0");
        MarginLayoutParams f = iho.f(view);
        if (f != null) {
            f.topMargin = i;
        }
    }

    public static final int g(View view) {
        akcr.b(view, "receiver$0");
        MarginLayoutParams f = iho.f(view);
        return f != null ? f.topMargin : 0;
    }

    public static final void g(View view, int i) {
        akcr.b(view, "receiver$0");
        MarginLayoutParams f = iho.f(view);
        if (f != null) {
            f.bottomMargin = i;
        }
    }

    public static final int h(View view) {
        akcr.b(view, "receiver$0");
        MarginLayoutParams f = iho.f(view);
        return f != null ? f.bottomMargin : 0;
    }
}
