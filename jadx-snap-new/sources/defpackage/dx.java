package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import com.snapchat.android.R;

@SuppressLint({"ViewConstructor"})
/* renamed from: dx */
final class dx extends View implements dz {
    final View a;
    ViewGroup b;
    View c;
    int d;
    Matrix e;
    private int f;
    private int g;
    private final Matrix h = new Matrix();
    private final OnPreDrawListener i = new 1();

    /* renamed from: dx$1 */
    class 1 implements OnPreDrawListener {
        1() {
        }

        public final boolean onPreDraw() {
            dx dxVar = dx.this;
            dxVar.e = dxVar.a.getMatrix();
            kb.a.c(dx.this);
            if (!(dx.this.b == null || dx.this.c == null)) {
                dx.this.b.endViewTransition(dx.this.c);
                kb.a.c(dx.this.b);
                dxVar = dx.this;
                dxVar.b = null;
                dxVar.c = null;
            }
            return true;
        }
    }

    /* renamed from: dx$a */
    static class a implements defpackage.dz.a {
        a() {
        }

        public final dz a(View view, ViewGroup viewGroup, Matrix matrix) {
            dx a = dx.a(view);
            if (a == null) {
                FrameLayout frameLayout;
                while (!(viewGroup instanceof FrameLayout)) {
                    ViewParent parent = viewGroup.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        frameLayout = null;
                        break;
                    }
                    viewGroup = (ViewGroup) parent;
                }
                frameLayout = (FrameLayout) viewGroup;
                if (frameLayout == null) {
                    return null;
                }
                a = new dx(view);
                frameLayout.addView(a);
            }
            a.d++;
            return a;
        }

        public final void a(View view) {
            dx a = dx.a(view);
            if (a != null) {
                a.d--;
                if (a.d <= 0) {
                    ViewParent parent = a.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.endViewTransition(a);
                        viewGroup.removeView(a);
                    }
                }
            }
        }
    }

    dx(View view) {
        super(view.getContext());
        this.a = view;
        setLayerType(2, null);
    }

    static dx a(View view) {
        return (dx) view.getTag(R.id.ghost_view);
    }

    public final void a(ViewGroup viewGroup, View view) {
        this.b = viewGroup;
        this.c = view;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.setTag(R.id.ghost_view, this);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        this.a.getLocationOnScreen(iArr2);
        iArr2[0] = (int) (((float) iArr2[0]) - this.a.getTranslationX());
        iArr2[1] = (int) (((float) iArr2[1]) - this.a.getTranslationY());
        this.f = iArr2[0] - iArr[0];
        this.g = iArr2[1] - iArr[1];
        this.a.getViewTreeObserver().addOnPreDrawListener(this.i);
        this.a.setVisibility(4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this.i);
        this.a.setVisibility(0);
        this.a.setTag(R.id.ghost_view, null);
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        this.h.set(this.e);
        this.h.postTranslate((float) this.f, (float) this.g);
        canvas.setMatrix(this.h);
        this.a.draw(canvas);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.a.setVisibility(i == 0 ? 4 : 0);
    }
}
