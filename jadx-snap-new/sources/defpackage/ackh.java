package defpackage;

import defpackage.acuh.a;

/* renamed from: ackh */
public final class ackh {
    public boolean a = false;
    public long b;
    private boolean c = false;
    private long d;

    public final float a(acuh acuh, float f) {
        if (acuh != null) {
            if (acuh.h) {
                acuh.h = false;
                acuh.a(this.b);
            }
            if (!acuh.e(this.b)) {
                if (acuh.d(this.b)) {
                    if (!acuh.j) {
                        acuh.j = true;
                        for (a onAnimationEnd : acuh.i) {
                            onAnimationEnd.onAnimationEnd(acuh);
                        }
                    }
                    if (!acuh.e(this.b)) {
                        return acuh.c;
                    }
                }
            }
            this.a = true;
            return acuh.b(this.b);
        }
        return f;
    }

    public final void a() {
        this.d = this.b;
        this.b = System.currentTimeMillis();
        this.c = this.a;
        this.a = false;
    }

    public final void a(acuw acuw) {
        acuw.b(a(acuw.e(), acuw.i()));
        acuw.a(a(acuw.d(), acuw.h()));
    }

    public final boolean b() {
        return this.a || this.c;
    }
}
