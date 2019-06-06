package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.aou.a;

/* renamed from: apd */
public abstract class apd<Z> extends apj<ImageView, Z> implements a {
    public apd(ImageView imageView) {
        super(imageView);
    }

    public final void a(Drawable drawable) {
        ((ImageView) this.c).setImageDrawable(drawable);
    }

    public final void a(Exception exception, Drawable drawable) {
        ((ImageView) this.c).setImageDrawable(drawable);
    }

    public abstract void a(Z z);

    public void a(Z z, aou<? super Z> aou) {
        if (aou == null || !aou.a(z, this)) {
            a((Object) z);
        }
    }

    public final void b(Drawable drawable) {
        ((ImageView) this.c).setImageDrawable(drawable);
    }

    public final void c(Drawable drawable) {
        ((ImageView) this.c).setImageDrawable(drawable);
    }

    public final Drawable d() {
        return ((ImageView) this.c).getDrawable();
    }
}
