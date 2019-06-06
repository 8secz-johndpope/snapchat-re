package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.kb;
import defpackage.lh;

public class SwipeDismissBehavior<V extends View> extends android.support.design.widget.CoordinatorLayout.b<V> {
    lh a;
    public a b;
    public int c = 2;
    float d = 0.5f;
    public float e = MapboxConstants.MINIMUM_ZOOM;
    public float f = 0.5f;
    private boolean g;
    private float h = MapboxConstants.MINIMUM_ZOOM;
    private final defpackage.lh.a i = new defpackage.lh.a() {
        private int a;
        private int b = -1;

        public final int a(View view) {
            return view.getWidth();
        }

        public final void a(int i) {
            if (SwipeDismissBehavior.this.b != null) {
                SwipeDismissBehavior.this.b.a(i);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008d A:{SKIP} */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008d A:{SKIP} */
        /* JADX WARNING: Missing block: B:23:0x005e, code skipped:
            if (java.lang.Math.abs(r7.getLeft() - r6.a) >= java.lang.Math.round(((float) r7.getWidth()) * r6.c.d)) goto L_0x0060;
     */
        public final void a(android.view.View r7, float r8, float r9) {
            /*
            r6 = this;
            r9 = -1;
            r6.b = r9;
            r9 = r7.getWidth();
            r0 = 0;
            r1 = 0;
            r2 = 1;
            r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r3 == 0) goto L_0x0045;
        L_0x000e:
            r3 = defpackage.kb.a;
            r3 = r3.j(r7);
            if (r3 != r2) goto L_0x0018;
        L_0x0016:
            r3 = 1;
            goto L_0x0019;
        L_0x0018:
            r3 = 0;
        L_0x0019:
            r4 = android.support.design.widget.SwipeDismissBehavior.this;
            r4 = r4.c;
            r5 = 2;
            if (r4 != r5) goto L_0x0021;
        L_0x0020:
            goto L_0x0060;
        L_0x0021:
            r4 = android.support.design.widget.SwipeDismissBehavior.this;
            r4 = r4.c;
            if (r4 != 0) goto L_0x0033;
        L_0x0027:
            if (r3 == 0) goto L_0x002e;
        L_0x0029:
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 >= 0) goto L_0x0062;
        L_0x002d:
            goto L_0x0060;
        L_0x002e:
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 <= 0) goto L_0x0062;
        L_0x0032:
            goto L_0x0060;
        L_0x0033:
            r4 = android.support.design.widget.SwipeDismissBehavior.this;
            r4 = r4.c;
            if (r4 != r2) goto L_0x0062;
        L_0x0039:
            if (r3 == 0) goto L_0x0040;
        L_0x003b:
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 <= 0) goto L_0x0062;
        L_0x003f:
            goto L_0x0060;
        L_0x0040:
            r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
            if (r8 >= 0) goto L_0x0062;
        L_0x0044:
            goto L_0x0060;
        L_0x0045:
            r8 = r7.getLeft();
            r0 = r6.a;
            r8 = r8 - r0;
            r0 = r7.getWidth();
            r0 = (float) r0;
            r3 = android.support.design.widget.SwipeDismissBehavior.this;
            r3 = r3.d;
            r0 = r0 * r3;
            r0 = java.lang.Math.round(r0);
            r8 = java.lang.Math.abs(r8);
            if (r8 < r0) goto L_0x0062;
        L_0x0060:
            r8 = 1;
            goto L_0x0063;
        L_0x0062:
            r8 = 0;
        L_0x0063:
            if (r8 == 0) goto L_0x0072;
        L_0x0065:
            r8 = r7.getLeft();
            r0 = r6.a;
            if (r8 >= r0) goto L_0x006f;
        L_0x006d:
            r0 = r0 - r9;
            goto L_0x0070;
        L_0x006f:
            r0 = r0 + r9;
        L_0x0070:
            r1 = 1;
            goto L_0x0074;
        L_0x0072:
            r0 = r6.a;
        L_0x0074:
            r8 = android.support.design.widget.SwipeDismissBehavior.this;
            r8 = r8.a;
            r9 = r7.getTop();
            r8 = r8.a(r0, r9);
            if (r8 == 0) goto L_0x008d;
        L_0x0082:
            r8 = new android.support.design.widget.SwipeDismissBehavior$b;
            r9 = android.support.design.widget.SwipeDismissBehavior.this;
            r8.<init>(r7, r1);
            defpackage.kb.a(r7, r8);
            return;
        L_0x008d:
            if (r1 == 0) goto L_0x009c;
        L_0x008f:
            r8 = android.support.design.widget.SwipeDismissBehavior.this;
            r8 = r8.b;
            if (r8 == 0) goto L_0x009c;
        L_0x0095:
            r8 = android.support.design.widget.SwipeDismissBehavior.this;
            r8 = r8.b;
            r8.a(r7);
        L_0x009c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior$AnonymousClass1.a(android.view.View, float, float):void");
        }

        public final boolean a(View view, int i) {
            return this.b == -1 && SwipeDismissBehavior.this.b(view);
        }

        public final void b(View view, int i) {
            float width = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.e);
            float width2 = ((float) this.a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else {
                view.setAlpha(f >= width2 ? MapboxConstants.MINIMUM_ZOOM : SwipeDismissBehavior.a(1.0f - ((f - width) / (width2 - width))));
            }
        }

        public final int c(View view, int i) {
            return view.getTop();
        }

        /* JADX WARNING: Missing block: B:6:0x0012, code skipped:
            if (r0 != null) goto L_0x0014;
     */
        /* JADX WARNING: Missing block: B:8:0x001e, code skipped:
            r0 = r3.a;
            r4 = r4.getWidth() + r0;
     */
        /* JADX WARNING: Missing block: B:11:0x002c, code skipped:
            if (r0 != null) goto L_0x001e;
     */
        public final int d(android.view.View r4, int r5) {
            /*
            r3 = this;
            r0 = defpackage.kb.a;
            r0 = r0.j(r4);
            r1 = 1;
            if (r0 != r1) goto L_0x000b;
        L_0x0009:
            r0 = 1;
            goto L_0x000c;
        L_0x000b:
            r0 = 0;
        L_0x000c:
            r2 = android.support.design.widget.SwipeDismissBehavior.this;
            r2 = r2.c;
            if (r2 != 0) goto L_0x0026;
        L_0x0012:
            if (r0 == 0) goto L_0x001e;
        L_0x0014:
            r0 = r3.a;
            r4 = r4.getWidth();
            r0 = r0 - r4;
            r4 = r3.a;
            goto L_0x003d;
        L_0x001e:
            r0 = r3.a;
            r4 = r4.getWidth();
            r4 = r4 + r0;
            goto L_0x003d;
        L_0x0026:
            r2 = android.support.design.widget.SwipeDismissBehavior.this;
            r2 = r2.c;
            if (r2 != r1) goto L_0x002f;
        L_0x002c:
            if (r0 == 0) goto L_0x0014;
        L_0x002e:
            goto L_0x001e;
        L_0x002f:
            r0 = r3.a;
            r1 = r4.getWidth();
            r0 = r0 - r1;
            r1 = r3.a;
            r4 = r4.getWidth();
            r4 = r4 + r1;
        L_0x003d:
            r5 = java.lang.Math.max(r0, r5);
            r4 = java.lang.Math.min(r5, r4);
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior$AnonymousClass1.d(android.view.View, int):int");
        }

        public final void e(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    };

    public interface a {
        void a(int i);

        void a(View view);
    }

    class b implements Runnable {
        private final View a;
        private final boolean b;

        b(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        public final void run() {
            if (SwipeDismissBehavior.this.a == null || !SwipeDismissBehavior.this.a.a()) {
                if (this.b && SwipeDismissBehavior.this.b != null) {
                    SwipeDismissBehavior.this.b.a(this.a);
                }
                return;
            }
            kb.a(this.a, (Runnable) this);
        }
    }

    public static float a(float f) {
        return Math.min(Math.max(MapboxConstants.MINIMUM_ZOOM, f), 1.0f);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = coordinatorLayout.a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.g;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = lh.a((ViewGroup) coordinatorLayout, this.i);
        }
        return this.a.a(motionEvent);
    }

    public final boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        lh lhVar = this.a;
        if (lhVar == null) {
            return false;
        }
        lhVar.b(motionEvent);
        return true;
    }

    public boolean b(View view) {
        return true;
    }
}
