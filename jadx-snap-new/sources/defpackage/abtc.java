package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;

/* renamed from: abtc */
public class abtc implements OnAttachStateChangeListener, OnTouchListener, azv {
    private final View a;
    private final boolean b;
    private final float c;
    private final float d;
    private final float e;
    private final azx f;
    private azt g;
    private float h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private OnTouchListener m;

    public abtc(View view) {
        this(view, 1000.0f, 15.0f, 50.0f);
    }

    public abtc(View view, byte b) {
        this(view, 1000.0f, 15.0f, 50.0f, true);
    }

    public abtc(View view, float f, float f2, float f3) {
        this(view, f, f2, f3, false);
    }

    private abtc(View view, float f, float f2, float f3, boolean z) {
        this(view, false, 1.2f, f, f2, f3, azx.b(), z);
    }

    private abtc(View view, boolean z, float f, float f2, float f3, float f4, azx azx, boolean z2) {
        this.i = true;
        this.j = true;
        this.a = view;
        this.b = false;
        this.h = 1.2f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.k = view.getScaleX();
        this.l = view.getScaleY();
        this.f = azx;
        this.a.addOnAttachStateChangeListener(this);
        if (!z2) {
            this.a.post(new -$$Lambda$abtc$6hk__c9x-_GL_QXNRoOM2PeatPc(this));
        }
    }

    private void c() {
        if (this.g == null) {
            this.g = this.f.a();
            this.g.a(new azu((double) this.c, (double) this.d));
            this.g.a((azv) this);
        }
    }

    public void a() {
        azt azt = this.g;
        if (azt != null) {
            azt.c((double) this.e);
            this.g.b(1.0d);
            this.g.b(0.0d);
        }
    }

    public final void a(float f) {
        this.h = f;
        azt azt = this.g;
        if (azt != null) {
            azt.b((double) f);
        }
    }

    public final void a(OnTouchListener onTouchListener) {
        this.m = onTouchListener;
    }

    public final void b() {
        this.j = false;
    }

    public final void b(float f) {
        this.k = f;
    }

    public final void c(float f) {
        this.l = f;
    }

    public void onSpringActivate(azt azt) {
    }

    public void onSpringAtRest(azt azt) {
    }

    public void onSpringEndStateChange(azt azt) {
    }

    public void onSpringUpdate(azt azt) {
        if (!this.i) {
            return;
        }
        if (this.j || azt.d.a >= 0.0d || azt.d.b >= 0.0d) {
            float f = ((this.h - 1.0f) * ((float) azt.d.a)) + 1.0f;
            this.a.setScaleX(this.k * f);
            this.a.setScaleY(this.l * f);
            return;
        }
        azt.c();
        azt.b(0.0d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
        r9 = this;
        r0 = r9.g;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r11.getActionMasked();
        r2 = 0;
        r4 = 1;
        if (r0 == r4) goto L_0x005d;
    L_0x000f:
        r0 = r11.getActionMasked();
        r5 = 3;
        if (r0 != r5) goto L_0x0017;
    L_0x0016:
        goto L_0x005d;
    L_0x0017:
        r0 = r9.b;
        r5 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        if (r0 != 0) goto L_0x0057;
    L_0x001d:
        r0 = r11.getActionMasked();
        r7 = 2;
        if (r0 != r7) goto L_0x0057;
    L_0x0024:
        r0 = r11.getX();
        r7 = 0;
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 < 0) goto L_0x0050;
    L_0x002d:
        r0 = r11.getX();
        r8 = r10.getWidth();
        r8 = (float) r8;
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x0050;
    L_0x003a:
        r0 = r11.getY();
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 < 0) goto L_0x0050;
    L_0x0042:
        r0 = r11.getY();
        r7 = r10.getHeight();
        r7 = (float) r7;
        r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1));
        if (r0 >= 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0051;
    L_0x0050:
        r4 = 0;
    L_0x0051:
        r0 = r9.g;
        if (r4 == 0) goto L_0x005f;
    L_0x0055:
        r2 = r5;
        goto L_0x005f;
    L_0x0057:
        r0 = r9.g;
        r0.b(r5);
        goto L_0x0062;
    L_0x005d:
        r0 = r9.g;
    L_0x005f:
        r0.b(r2);
    L_0x0062:
        r0 = r9.m;
        if (r0 == 0) goto L_0x006b;
    L_0x0066:
        r10 = r0.onTouch(r10, r11);
        return r10;
    L_0x006b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abtc.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
        c();
    }

    public void onViewDetachedFromWindow(View view) {
        azt azt = this.g;
        if (azt != null) {
            azt.a();
            this.g = null;
        }
    }
}
