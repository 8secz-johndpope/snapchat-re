package defpackage;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.achp.a;
import defpackage.acic.b;

/* renamed from: acia */
public final class acia extends achp<acic> {
    final a d;
    int e = 1;
    achr f;
    boolean g;
    int h;
    boolean i;
    private final View j;

    /* renamed from: acia$a */
    static class a {
        private achr a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* Access modifiers changed, original: final */
        /* JADX WARNING: Missing block: B:10:0x0016, code skipped:
            if (r1 != null) goto L_0x001a;
     */
        public final defpackage.achr a(int r3, int r4) {
            /*
            r2 = this;
            r0 = 2;
            if (r3 != r0) goto L_0x0006;
        L_0x0003:
            r1 = defpackage.achr.LEFT_TO_RIGHT;
            goto L_0x0008;
        L_0x0006:
            r1 = defpackage.achr.TOP_TO_BOTTOM;
        L_0x0008:
            if (r3 != r0) goto L_0x000d;
        L_0x000a:
            r3 = defpackage.achr.RIGHT_TO_LEFT;
            goto L_0x000f;
        L_0x000d:
            r3 = defpackage.achr.BOTTOM_TO_TOP;
        L_0x000f:
            if (r4 >= 0) goto L_0x0012;
        L_0x0011:
            goto L_0x001a;
        L_0x0012:
            if (r4 > 0) goto L_0x0019;
        L_0x0014:
            r1 = r2.a;
            if (r1 == 0) goto L_0x0019;
        L_0x0018:
            goto L_0x001a;
        L_0x0019:
            r1 = r3;
        L_0x001a:
            r2.a = r1;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acia$a.a(int, int):achr");
        }
    }

    /* renamed from: acia$b */
    class b implements defpackage.acib.b {
        private boolean a;

        private b() {
        }

        /* synthetic */ b(acia acia, byte b) {
            this();
        }

        public final int a() {
            return acia.this.e;
        }

        public final boolean a(int i, int i2) {
            acia acia = acia.this;
            acia.i = false;
            if (acia.f == null) {
                return false;
            }
            if (acia.this.c.a(acia.this.f)) {
                if (i != 1) {
                    i = acia.this.e;
                }
                acic acic = (acic) acia.this.b;
                achr a = acia.this.d.a(i, acia.this.h);
                acia acia2 = acia.this;
                acic.a(a, acia2.a(i, acia2.h), i2);
                return true;
            }
            acia.this.b();
            acia.this.c.b(acia.this.f);
            return false;
        }

        public final boolean a(int i, int i2, int i3) {
            acia acia = acia.this;
            acia.i = false;
            if (acia.g) {
                return false;
            }
            if (acia.this.e != 1) {
                i = acia.this.e;
            }
            if (i != 2) {
                i2 = i3;
            }
            i2 += acia.this.h;
            achr a = acia.this.d.a(i, i2);
            if (acia.this.c.a(a)) {
                acia = acia.this;
                acia.e = i;
                acia.f = a;
                if ((acia.a(a, i2, achj.DRAGGING) ^ 1) != 0) {
                    acia acia2 = acia.this;
                    acia2.i = true;
                    achr achr = acia2.f;
                    acia acia3 = acia.this;
                    acia2.a(acia3.a(acia3.e, acia.this.h));
                }
                return true;
            }
            acia.this.c.b(a);
            return false;
        }

        public final boolean a(int i, int i2, int i3, MotionEvent motionEvent) {
            int i4 = i == 2 ? -i2 : -i3;
            if (acia.this.i || !acia.a(acia.this.c.b(), false, i4, (int) motionEvent.getX(), (int) motionEvent.getY(), i)) {
                return a(i, i2, i3);
            }
            acia.this.g = true;
            return false;
        }

        public final float b() {
            return acia.this.c.a();
        }

        public final boolean c() {
            acia acia = acia.this;
            acia.g = false;
            if (((acic) acia.b).b()) {
                acia = acia.this;
                acia.f = ((acic) acia.b).e;
                acia = acia.this;
                acia.e = acia.a(acia.f);
                ((acic) acia.this.b).a();
                this.a = true;
                return true;
            } else if (!this.a) {
                return false;
            } else {
                this.a = false;
                return true;
            }
        }

        public final void d() {
            if (acia.this.f == null) {
                acia.this.g = true;
            }
        }

        public final boolean e() {
            acia acia = acia.this;
            acia.i = false;
            if (acia.f == null) {
                return false;
            }
            if (acia.this.c.a(acia.this.f)) {
                if (acia.this.h == 0) {
                    acia = acia.this;
                    acia.a((float) MapboxConstants.MINIMUM_ZOOM);
                } else {
                    acic acic = (acic) acia.this.b;
                    achr achr = acia.this.f;
                    acia acia2 = acia.this;
                    acic.a(achr, acia2.a(acia2.e, acia.this.h), 0);
                }
                return true;
            }
            acia.this.b();
            acia.this.c.b(acia.this.f);
            return false;
        }
    }

    /* renamed from: acia$c */
    class c implements b {
        private c() {
        }

        /* synthetic */ c(acia acia, byte b) {
            this();
        }

        public final int a() {
            return acia.this.h;
        }

        public final void a(achr achr, int i, boolean z) {
            acia acia;
            achj achj;
            if (z) {
                acia = acia.this;
                achj = achj.SETTLING_TO_DESTINATION;
            } else {
                acia = acia.this;
                achj = achj.SETTLING_BACK_TO_SOURCE;
            }
            acia.a(achr, i, achj);
        }

        public final void a(achr achr, boolean z, boolean z2) {
            if (z && acia.this.f != null) {
                acia acia = acia.this;
                acia.a(acia.a(z2 ? 2 : 3, acia.this.h));
            }
        }
    }

    /* renamed from: acia$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[achr.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
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
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.achr.BOTTOM_TO_TOP;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.achr.TOP_TO_BOTTOM;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acia$1.<clinit>():void");
        }
    }

    public acia(a aVar, View view) {
        super(new acib(view.getContext()), new acic(view, -$$Lambda$d1nc9COnmTgSYOZOf72pnQ2Pzjg.INSTANCE, ViewConfiguration.get(view.getContext()).getScaledMinimumFlingVelocity()), aVar);
        this.j = view;
        ((acib) this.a).b = new b(this, (byte) 0);
        ((acic) this.b).b = new c(this, (byte) 0);
        this.d = new a();
    }

    static int a(achr achr) {
        int i = 1.a[achr.ordinal()];
        int i2 = 2;
        if (!(i == 1 || i == 2)) {
            i2 = 3;
            return (i == 3 || i == 4) ? i2 : 1;
        }
    }

    private void a(float f) {
        b();
        this.c.a(f);
    }

    private boolean a(achr achr, int i, achj achj) {
        int a = acia.a(achr);
        int i2 = this.e;
        if (i2 != 1) {
            a = i2;
        }
        int i3 = -(a == 2 ? this.j.getWidth() : this.j.getHeight());
        i2 = a == 2 ? this.j.getWidth() : this.j.getHeight();
        this.h = abpf.a(i, i3, i2);
        if (i < i3 || i > i2) {
            Log.e("deck-touch", "scrollInternal hits edge when scrolling to destination: ".concat(String.valueOf(i)));
            this.c.a(achr, a(a, this.h), achj);
            return false;
        }
        this.c.a(achr, a(a, i), achj);
        return true;
    }

    static boolean a(View view, boolean z, int i, int i2, int i3, int i4) {
        View view2 = view;
        int i5 = i;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                int i7 = i3 + scrollY;
                float f = (float) i6;
                if (f >= ((float) childAt.getLeft()) + childAt.getTranslationX() && f < ((float) childAt.getRight()) + childAt.getTranslationX()) {
                    f = (float) i7;
                    if (f >= ((float) childAt.getTop()) + childAt.getTranslationY() && f < ((float) childAt.getBottom()) + childAt.getTranslationY()) {
                        if (acia.a(childAt, true, i, (i6 - childAt.getLeft()) - ((int) childAt.getTranslationX()), (i7 - childAt.getTop()) - ((int) childAt.getTranslationY()), i4)) {
                            return true;
                        }
                    }
                }
            }
        }
        return z && (i4 != 2 ? !view.canScrollVertically(-i5) : !view.canScrollHorizontally(-i5));
    }

    private void b() {
        this.f = null;
        this.e = 1;
        this.h = 0;
        this.g = false;
        ((acic) this.b).a();
    }

    /* Access modifiers changed, original: final */
    public final float a(int i, int i2) {
        return ((float) i2) / ((float) (i == 2 ? this.j.getWidth() : this.j.getHeight()));
    }

    public final boolean a() {
        return (this.f != null || ((acic) this.b).b() || this.i) ? false : true;
    }

    public final boolean a(achz achz) {
        int width;
        achr a = achz.a();
        if (a == achr.LEFT_TO_RIGHT) {
            width = this.j.getWidth();
        } else {
            if (a == achr.RIGHT_TO_LEFT) {
                width = this.j.getWidth();
            } else if (a == achr.TOP_TO_BOTTOM) {
                width = this.j.getHeight();
            } else if (a != achr.BOTTOM_TO_TOP) {
                return false;
            } else {
                width = this.j.getHeight();
            }
            this.f = a;
            this.e = acia.a(a);
            if (achz.b() || this.j.getHeight() <= 0 || this.j.getWidth() <= 0) {
                a(a, width, achj.SETTLING_TO_DESTINATION);
                a(1.0f);
            } else {
                ((acic) this.b).a(achz.a(), a(this.e, width), 0, achz.c(), achz.d());
            }
            return true;
        }
        width = -width;
        this.f = a;
        this.e = acia.a(a);
        if (achz.b()) {
        }
        a(a, width, achj.SETTLING_TO_DESTINATION);
        a(1.0f);
        return true;
    }

    public final boolean a(MotionEvent motionEvent) {
        return this.a.a(motionEvent);
    }
}
