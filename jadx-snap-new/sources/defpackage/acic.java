package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: acic */
public final class acic implements acho {
    private static final Interpolator g = -$$Lambda$acic$V5bpHI7H6aVaU2EED8tNvDTM1Pg.INSTANCE;
    private static final Interpolator h = new DecelerateInterpolator(1.4f);
    private static int i;
    final Handler a = new Handler(Looper.getMainLooper());
    b b;
    Scroller c;
    boolean d;
    achr e;
    boolean f = true;
    private final View j;
    private final Runnable k;
    private final c l;

    /* renamed from: acic$a */
    class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(acic acic, byte b) {
            this();
        }

        public final void run() {
            boolean computeScrollOffset = acic.this.c.computeScrollOffset();
            int currX = acic.this.c.getCurrX();
            int currY = acic.this.c.getCurrY();
            acic.this.b.a(acic.this.e, acic.this.d ? currX : currY, acic.this.f);
            if (computeScrollOffset) {
                if (currX == acic.this.c.getFinalX() && currY == acic.this.c.getFinalY()) {
                    acic.this.c.forceFinished(true);
                }
                acic.this.a.postDelayed(this, 0);
                return;
            }
            acic.this.c();
        }
    }

    /* renamed from: acic$c */
    public interface c {
        Scroller createScroller(Context context, Interpolator interpolator);
    }

    /* renamed from: acic$b */
    public interface b {
        int a();

        void a(achr achr, int i, boolean z);

        void a(achr achr, boolean z, boolean z2);
    }

    /* renamed from: acic$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[achr.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.achr.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.achr.LEFT_TO_RIGHT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.achr.RIGHT_TO_LEFT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acic$1.<clinit>():void");
        }
    }

    acic(View view, c cVar, int i) {
        i = i;
        this.j = view;
        this.l = cVar;
        this.c = this.l.createScroller(this.j.getContext(), g);
        this.k = new a(this, (byte) 0);
    }

    private static float a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    private static int a(float f, int i, int i2, int i3) {
        return (Math.abs(i3) <= i || Math.abs(f) <= 0.05f) ? Math.abs(f) <= 0.4f ? 0 : f > MapboxConstants.MINIMUM_ZOOM ? i2 : i : ((i3 >= 0 || f <= MapboxConstants.MINIMUM_ZOOM) && (i3 <= 0 || f >= MapboxConstants.MINIMUM_ZOOM)) ? i3 > 0 ? i2 : i : 0;
    }

    private int a(int i, int i2, int i3) {
        float f;
        float f2 = 1.0f;
        float f3 = (float) (i2 / 2);
        f3 += acic.a(Math.min(1.0f, (((float) Math.abs(i)) * 1.0f) / ((float) i2))) * f3;
        i = Math.abs(i3);
        if (i > 0) {
            f = 4.0f;
            f2 = (float) Math.round(Math.abs(f3 / ((float) i)) * 1000.0f);
        } else {
            f = 250.0f;
            if (!this.d) {
                f2 = 1.3f;
            }
        }
        return (int) Math.min(f * f2, this.d ? 600.0f : 350.0f);
    }

    private void a(int i, int i2, int i3, float f) {
        int a = this.d ? this.b.a() : 0;
        int a2 = this.d ? 0 : this.b.a();
        int i4 = i - a;
        int i5 = i2 - a2;
        if (i4 == 0 && i5 == 0) {
            c();
            return;
        }
        this.c.startScroll(a, a2, i4, i5, (int) (((float) a(i5 == 0 ? i4 : i5, i5 == 0 ? this.j.getWidth() : this.j.getHeight(), i3)) * f));
        this.a.postDelayed(this.k, 0);
    }

    private static boolean a(achr achr) {
        int i = 1.a[achr.ordinal()];
        return i == 1 || i == 2;
    }

    public final void a() {
        if (!this.c.isFinished()) {
            this.c.forceFinished(true);
            c();
            this.c.abortAnimation();
        }
        this.d = false;
        this.e = null;
        this.a.removeCallbacks(this.k);
    }

    public final void a(achr achr, float f, int i) {
        a(achr, f, i, true, true);
    }

    /* Access modifiers changed, original: final */
    public final void a(achr achr, float f, int i, boolean z, boolean z2) {
        Interpolator interpolator;
        boolean z3 = true;
        boolean z4 = Math.abs(f) >= MapboxConstants.MINIMUM_ZOOM && Math.abs(f) <= 1.0f;
        Preconditions.checkArgument(z4, String.format("Invalid scroll progress. gesture=[%s], progress=[%s], velocity=[%s]", new Object[]{achr, Float.valueOf(f), Integer.valueOf(i)}));
        a();
        this.d = acic.a(achr);
        float f2 = 0.5f;
        if (z && z2) {
            interpolator = this.d ? g : h;
            f2 = 1.0f;
        } else if (z) {
            interpolator = new LinearInterpolator();
        } else if (z2) {
            interpolator = new DecelerateInterpolator(1.5f);
        } else {
            interpolator = new LinearInterpolator();
            f2 = 0.25f;
        }
        this.c = this.l.createScroller(this.j.getContext(), interpolator);
        this.e = achr;
        int a;
        if (this.d) {
            a = acic.a(f, -this.j.getWidth(), this.j.getWidth(), i);
            if (a == 0) {
                z3 = false;
            }
            this.f = z3;
            a(a, 0, i, f2);
            return;
        }
        a = acic.a(f, -this.j.getHeight(), this.j.getHeight(), i);
        if (a == 0) {
            z3 = false;
        }
        this.f = z3;
        a(0, a, i, f2);
    }

    public final boolean b() {
        return !this.c.isFinished();
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        b bVar = this.b;
        achr achr = this.e;
        boolean z = this.c.getCurrX() == this.c.getFinalX() && this.c.getCurrY() == this.c.getFinalY();
        bVar.a(achr, z, this.d);
    }
}
