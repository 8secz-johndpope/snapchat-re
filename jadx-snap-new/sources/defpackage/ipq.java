package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.SnapCircularNotificationBadge;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: ipq */
public final class ipq {
    final HashMap<zjm, b> a = new HashMap();
    final HashMap<zjm, b> b = new HashMap();
    final HashMap<zjm, b> c = new HashMap();
    final HashMap<zjm, a> d = new HashMap();
    final HashMap<zjm, a> e = new HashMap();
    boolean f;
    boolean g;
    boolean h;
    boolean i;

    /* renamed from: ipq$b */
    static class b {
        private final long a = 700;
        private final ValueAnimator b = new ValueAnimator();
        private final ValueAnimator c = new ValueAnimator();
        private final WeakReference<ipp> d;

        /* renamed from: ipq$b$1 */
        static final class 1 implements AnimatorUpdateListener {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.a;
                akcr.a((Object) valueAnimator, "animation");
                b.a(bVar, valueAnimator);
            }
        }

        /* renamed from: ipq$b$2 */
        static final class 2 implements AnimatorUpdateListener {
            private /* synthetic */ b a;

            2(b bVar) {
                this.a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b bVar = this.a;
                akcr.a((Object) valueAnimator, "animation");
                b.a(bVar, valueAnimator);
            }
        }

        public b(ipp ipp, boolean z, b bVar) {
            Float valueOf;
            boolean z2;
            akcr.b(ipp, "badgeView");
            this.d = new WeakReference(ipp);
            this.b.addUpdateListener(new 1(this));
            this.b.setDuration(700);
            this.c.addUpdateListener(new 2(this));
            this.c.setDuration(700);
            if (bVar == null) {
                valueOf = Float.valueOf(MapboxConstants.MINIMUM_ZOOM);
                z2 = z;
            } else {
                z2 = bVar.b.isStarted() || bVar.c.isStarted();
                ipp ipp2 = (ipp) bVar.d.get();
                valueOf = ipp2 != null ? ipp2.a() : null;
            }
            a(z, z2, valueOf);
        }

        private final void a() {
            if (this.c.isStarted()) {
                this.c.cancel();
            }
            if (this.b.isStarted()) {
                this.b.cancel();
            }
        }

        private final void a(boolean z, boolean z2, Float f) {
            a();
            Object obj = (ipp) this.d.get();
            if (obj != null) {
                akcr.a(obj, "badgeViewWeakRef.get() ?: return");
                if (!z && obj.b() == null) {
                    return;
                }
                if (z2) {
                    ValueAnimator valueAnimator = z ? this.b : this.c;
                    float f2 = MapboxConstants.MINIMUM_ZOOM;
                    float floatValue = f != null ? f.floatValue() : z ? MapboxConstants.MINIMUM_ZOOM : 1.0f;
                    if (z) {
                        f2 = 1.0f;
                    }
                    valueAnimator.setFloatValues(new float[]{floatValue, f2});
                    valueAnimator.start();
                } else if (z) {
                    c();
                } else {
                    b();
                }
            }
        }

        private final void b() {
            ipp ipp = (ipp) this.d.get();
            if (ipp != null) {
                ipp.a(false);
            }
            ipp = (ipp) this.d.get();
            if (ipp != null) {
                ipp.a((float) MapboxConstants.MINIMUM_ZOOM);
            }
        }

        private final void c() {
            ipp ipp = (ipp) this.d.get();
            if (ipp != null) {
                ipp.a(true);
            }
            ipp = (ipp) this.d.get();
            if (ipp != null) {
                ipp.a(1.0f);
            }
        }

        public void a(boolean z, boolean z2) {
            ipp ipp = (ipp) this.d.get();
            a(z, z2, ipp != null ? ipp.a() : null);
        }
    }

    /* renamed from: ipq$a */
    static final class a extends b {
        int a;
        private final WeakReference<ipp> b;

        public a(ipp ipp, boolean z, a aVar) {
            akcr.b(ipp, "badgeView");
            super(ipp, z, aVar);
            this.b = new WeakReference(ipp);
            if (aVar != null) {
                b(z, aVar.a);
            }
        }

        private final void b(boolean z, int i) {
            this.a = i;
            Object obj = (ipp) this.b.get();
            if (obj != null) {
                akcr.a(obj, "badgeViewWeakRef.get() ?: return");
                if (z) {
                    View b = obj.b();
                    if (!(b instanceof SnapCircularNotificationBadge)) {
                        b = null;
                    }
                    SnapCircularNotificationBadge snapCircularNotificationBadge = (SnapCircularNotificationBadge) b;
                    if (snapCircularNotificationBadge != null) {
                        snapCircularNotificationBadge.setNotificationCountState(true, i);
                    }
                }
            }
        }

        public final void a(boolean z, int i) {
            super.a(z, false);
            b(z, i);
        }

        public final void a(boolean z, boolean z2) {
            super.a(z, z2);
            b(z, this.a);
        }
    }
}
