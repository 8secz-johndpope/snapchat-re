package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* renamed from: acuq */
public final class acuq {
    final actz a;
    final acux b = new acux(0);
    public final acuy c;
    final adbv d;

    /* renamed from: acuq$a */
    static class a implements acus, Runnable {
        private final WeakReference<acuq> a;
        private final acur b;
        private final String c;

        public a(acuq acuq, acur acur, String str) {
            this.a = new WeakReference(acuq);
            this.b = acur;
            this.c = str;
        }

        public final void onTextureUploaded(acxn acxn) {
            acuq acuq = (acuq) this.a.get();
            if (acuq != null) {
                acuq.b.b(this.b.a());
                this.b.g = acxn;
                acuq.c.a(this.b.a(), acxn);
                if (this.c != null) {
                    acuy acuy = acuq.c;
                    String str = this.c;
                    synchronized (acuy.b) {
                        acuy.a.invalidate(str);
                    }
                }
                acuq.d.m();
            }
        }

        public final void run() {
            acuq acuq = (acuq) this.a.get();
            if (acuq != null) {
                acua k = this.b.k();
                if (k == null) {
                    acuq.b.b(this.b.a());
                } else if (k.a != null) {
                    acuq.a.a(k.a, "MarkerMedia", (acus) this);
                    k.dispose();
                } else {
                    actz actz = acuq.a;
                    Bitmap bitmap = k.b;
                    if (actz.c.a()) {
                        actz.a(new acva(bitmap, "MarkerMedia", this, actz, actz.c));
                    }
                }
            }
        }
    }

    public acuq(actz actz, adbv adbv) {
        this.a = actz;
        this.c = new acuy(275, actz);
        this.d = adbv;
    }

    public final void a(acur acur, String str) {
        String a = acur.a();
        if (a == null || !a.equals(str)) {
            acur.h = str;
            if (str == null || this.b.a(str)) {
                this.a.a(new a(this, acur, a));
            }
        }
    }

    public final boolean a(acur acur) {
        if (!(acur.g == null || acur.g.a.a())) {
            acur.g = null;
        }
        if (acur.g == null) {
            acxn acxn;
            String a = acur.a();
            if (a == null) {
                acxn = null;
            } else {
                acxn = this.c.a(a);
                if (acxn == null && this.b.a(acur.a())) {
                    this.a.a(new a(this, acur, null));
                }
            }
            if (acxn == null) {
                return false;
            }
            acur.g = acxn;
        }
        return true;
    }
}
