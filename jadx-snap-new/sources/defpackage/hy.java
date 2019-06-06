package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import defpackage.hx.a;

/* renamed from: hy */
class hy extends hx {

    /* renamed from: hy$a */
    static class a extends defpackage.hx.a {
        a(defpackage.hx.a aVar) {
            super(aVar);
        }

        public final Drawable newDrawable(Resources resources) {
            return new hy(this, resources);
        }
    }

    hy(Drawable drawable) {
        super(drawable);
    }

    hy(a aVar, Resources resources) {
        super(aVar, resources);
    }

    /* Access modifiers changed, original: 0000 */
    public a b() {
        return new a(this.b);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }
}
